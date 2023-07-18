package com.netease.nim.camellia.hot.key.server.calculate;

import com.netease.nim.camellia.hot.key.common.model.KeyCounter;
import com.netease.nim.camellia.hot.key.server.conf.WorkQueueType;
import com.netease.nim.camellia.tools.executor.CamelliaThreadFactory;
import org.jctools.queues.MpscArrayQueue;
import org.jctools.queues.MpscBlockingConsumerArrayQueue;
import org.jctools.queues.MpscLinkedQueue;
import org.jctools.queues.atomic.MpscAtomicArrayQueue;
import org.jctools.queues.atomic.MpscLinkedAtomicQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

/**
 * Created by caojiajun on 2023/5/9
 */
public class HotKeyCalculatorQueue {

    private static final Logger logger = LoggerFactory.getLogger(HotKeyCalculatorQueue.class);

    private static final LongAdder fail = new LongAdder();
    static {
        Executors.newSingleThreadScheduledExecutor(new CamelliaThreadFactory("hot-key-calculator-queue-full-log"))
                .scheduleAtFixedRate(() -> {
                    long count = fail.sumThenReset();
                    if (count > 0) {
                        logger.error("HotKeyCalculatorQueue full, count = {}", count);
                    }
                }, 5, 5, TimeUnit.SECONDS);
    }

    private static final AtomicLong idGen = new AtomicLong(0);
    private final Queue<Object[]> queue;
    private final long id;
    private final LongAdder pendingSize = new LongAdder();
    private final LongAdder discardCount = new LongAdder();
    private final int bizWorkQueueCapacity;

    public HotKeyCalculatorQueue(WorkQueueType workQueueType, int bizWorkQueueCapacity) {
        this.queue = initQueue(workQueueType, bizWorkQueueCapacity);
        this.id = idGen.getAndIncrement();
        this.bizWorkQueueCapacity = bizWorkQueueCapacity;
    }

    private Queue<Object[]> initQueue(WorkQueueType workQueueType, int bizWorkQueueCapacity) {
        if (workQueueType == WorkQueueType.LinkedBlockingQueue) {
            return new LinkedBlockingQueue<>(bizWorkQueueCapacity);
        } else if (workQueueType == WorkQueueType.ArrayBlockingQueue) {
            return new ArrayBlockingQueue<>(bizWorkQueueCapacity);
        } else if (workQueueType == WorkQueueType.ConcurrentLinkedQueue) {
            return new ConcurrentLinkedQueue<>();
        } else if (workQueueType == WorkQueueType.MpscArrayQueue) {
            return new MpscArrayQueue<>(bizWorkQueueCapacity);
        } else if (workQueueType == WorkQueueType.MpscLinkedQueue) {
            return new MpscLinkedQueue<>();
        } else if (workQueueType == WorkQueueType.MpscAtomicArrayQueue) {
            return new MpscAtomicArrayQueue<>(bizWorkQueueCapacity);
        } else if (workQueueType == WorkQueueType.MpscLinkedAtomicQueue) {
            return new MpscLinkedAtomicQueue<>();
        } else if (workQueueType == WorkQueueType.MpscBlockingConsumerArrayQueue) {
            return new MpscBlockingConsumerArrayQueue<>(bizWorkQueueCapacity);
        } else {
            return new LinkedBlockingQueue<>(bizWorkQueueCapacity);
        }
    }

    public long getId() {
        return id;
    }
 
    public void push(List<KeyCounter> counters, String source) {
        int size = counters.size();
        boolean success;
        if (pendingSize.sum() > bizWorkQueueCapacity) {
            success = false;
        } else {
            pendingSize.add(size);
            success = queue.offer(new Object[] {counters, source});
            if (!success) {
                pendingSize.add(size * -1);
            }
        }
        if (!success) {
            fail.add(size);
            discardCount.add(size);
        }
    }

    public long discardCount() {
        return discardCount.sumThenReset();
    }

    public long pendingSize() {
        return pendingSize.sum();
    }

    public void start(HotKeyCalculator calculator) {
        new Thread(() -> {
            while (true) {
                try {
                    Object[] objects = queue.poll();
                    if (objects == null) {
                        TimeUnit.MILLISECONDS.sleep(1);
                        continue;
                    }
                    List<KeyCounter> counters = (List<KeyCounter>) objects[0];
                    String source = (String) objects[1];
                    pendingSize.add(counters.size() * -1);
                    for (KeyCounter counter : counters) {
                        calculator.calculate(counter, source);
                    }
                } catch (Exception e) {
                    logger.error("hot key calculate error", e);
                }
            }
        }, "hot-key-calculator-queue-" + id).start();
        logger.info("hot key calculator {} start success", id);
    }
}
