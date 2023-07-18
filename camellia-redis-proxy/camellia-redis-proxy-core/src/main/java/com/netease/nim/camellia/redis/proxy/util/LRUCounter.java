package com.netease.nim.camellia.redis.proxy.util;

import com.googlecode.concurrentlinkedhashmap.ConcurrentLinkedHashMap;
import com.netease.nim.camellia.tools.utils.BytesKey;

import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.LongAdder;

/**
 * A counter using the LRU algorithm.
 * 使用LRU算法的计数器。
 * Created by caojiajun on 2020/11/19
 */
public class LRUCounter {

    /**
     * 每一个key都有一个计数器
     */
    private final ConcurrentLinkedHashMap<BytesKey, Counter> cache;
    /**
     * 过期时间
     */
    private final long expireMillis;

    public LRUCounter(int initialCapacity, long capacity, long expireMillis) {
        this.cache = new ConcurrentLinkedHashMap.Builder<BytesKey, Counter>().initialCapacity(initialCapacity)
                .maximumWeightedCapacity(capacity).build();
        this.expireMillis = expireMillis;
    }

    /**
     * Increment the key
     *
     * @param bytesKey bytesKey
     */
    public void increment(BytesKey bytesKey) {
        Counter counter = cache.get(bytesKey);
        if (counter != null) {
            counter.checkExpireAndReset(expireMillis);
        }
        if (counter == null) {
            counter = new Counter();
            Counter old = cache.putIfAbsent(bytesKey, counter);
            if (old != null) {
                counter = old;
            }
        }
        counter.count.increment();
    }

    /**
     * Get the counter num
     *
     * @param bytesKey bytesKey
     * @return null if expired, number if not expired
     */
    public Long get(BytesKey bytesKey) {
        Counter counter = cache.get(bytesKey);
        if (counter != null) {
            if (TimeCache.currentMillis - counter.timestamp > expireMillis) {
                cache.remove(bytesKey);
                return null;
            }
            return counter.count.sum();
        }
        return null;
    }

    /**
     * 如果key的计数超过了threshold，并且key没有过期，就会按照计数的大小值进行排序，
     * <p>If the count of the key exceeds the threshold and the key has not expired, it will be sorted according to the count.
     *
     * @param threshold threshold 阈值
     * @return TreeSet
     */
    public TreeSet<SortedBytesKey> getSortedCacheValue(long threshold) {
        if (cache.isEmpty()) return null;
        TreeSet<SortedBytesKey> treeSet = new TreeSet<>();
        for (Map.Entry<BytesKey, Counter> entry : cache.entrySet()) {
            if (TimeCache.currentMillis - entry.getValue().timestamp > expireMillis) {
                cache.remove(entry.getKey());
                continue;
            }
            long count = entry.getValue().count.sum();
            if (count >= threshold) {
                byte[] key = entry.getKey().getKey();
                treeSet.add(new SortedBytesKey(key, count));
            }
        }
        return treeSet;
    }

    public static class SortedBytesKey implements Comparable<SortedBytesKey> {
        private final byte[] key;
        private final long count;

        public SortedBytesKey(byte[] key, long count) {
            this.key = key;
            this.count = count;
        }

        public byte[] getKey() {
            return key;
        }

        public long getCount() {
            return count;
        }

        @Override
        public int compareTo(SortedBytesKey o) {
            return Long.compare(o.count, count);
        }
    }

    private static class Counter {
        private volatile long timestamp = TimeCache.currentMillis;
        private final LongAdder count = new LongAdder();
        private final AtomicBoolean lock = new AtomicBoolean();

        /**
         * Check whether the counter has expired, if it is expired, refresh it.
         *
         * @param expireMillis expireMillis
         */
        void checkExpireAndReset(long expireMillis) {
            if (TimeCache.currentMillis - timestamp > expireMillis) {
                if (lock.compareAndSet(false, true)) {
                    try {
                        if (TimeCache.currentMillis - timestamp > expireMillis) {
                            timestamp = TimeCache.currentMillis;
                            count.reset();
                        }
                    } finally {
                        lock.compareAndSet(true, false);
                    }
                }
            }
        }
    }
}
