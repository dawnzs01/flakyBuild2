package com.netease.nim.camellia.hot.key.server;

import com.alibaba.fastjson.JSONObject;
import com.netease.nim.camellia.hot.key.common.model.HotKeyConfig;
import com.netease.nim.camellia.hot.key.common.model.KeyCounter;
import com.netease.nim.camellia.hot.key.common.netty.HotKeyPackBizHandler;
import com.netease.nim.camellia.hot.key.common.netty.pack.*;
import com.netease.nim.camellia.hot.key.server.calculate.HotKeyCalculator;
import com.netease.nim.camellia.hot.key.server.calculate.HotKeyCalculatorQueue;
import com.netease.nim.camellia.hot.key.server.calculate.HotKeyCounterManager;
import com.netease.nim.camellia.hot.key.server.calculate.TopNCounterManager;
import com.netease.nim.camellia.hot.key.server.callback.HotKeyCallbackManager;
import com.netease.nim.camellia.hot.key.server.conf.*;
import com.netease.nim.camellia.hot.key.server.event.HotKeyEventHandler;
import com.netease.nim.camellia.hot.key.server.monitor.HotKeyCalculatorQueueMonitor;
import com.netease.nim.camellia.hot.key.server.monitor.HotKeyServerMonitorCollector;
import com.netease.nim.camellia.hot.key.server.netty.ChannelInfo;
import com.netease.nim.camellia.hot.key.server.netty.ServerStatus;
import com.netease.nim.camellia.hot.key.server.notify.HotKeyNotifyService;
import com.netease.nim.camellia.tools.executor.CamelliaThreadFactory;
import com.netease.nim.camellia.tools.utils.CamelliaMapUtils;
import com.netease.nim.camellia.tools.utils.MathUtil;
import com.netease.nim.camellia.tools.utils.SysUtils;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by caojiajun on 2023/5/9
 */
public class HotKeyPackBizServerHandler implements HotKeyPackBizHandler {

    private static final Logger logger = LoggerFactory.getLogger(HotKeyPackBizServerHandler.class);

    private final HotKeyCalculatorQueue[] queues;
    private final int bizWorkThread;
    private final boolean is2Power;
    private final ThreadPoolExecutor executor;
    private final CacheableHotKeyConfigService hotKeyConfigService;
    private final HotKeyCallbackManager callbackManager;

    public HotKeyPackBizServerHandler(HotKeyServerProperties properties) {
        this.bizWorkThread = properties.getBizWorkThread();
        this.is2Power = MathUtil.is2Power(bizWorkThread);
        this.queues = new HotKeyCalculatorQueue[bizWorkThread];

        //callback
        callbackManager = new HotKeyCallbackManager(properties);

        //监控
        HotKeyServerMonitorCollector.init(properties, callbackManager);

        //config
        HotKeyConfigService service = ConfigInitUtil.initHotKeyConfigService(properties);
        this.hotKeyConfigService = new CacheableHotKeyConfigService(service);
        ConfReloadHolder.register(hotKeyConfigService);

        //notify
        HotKeyNotifyService notifyService = new HotKeyNotifyService(hotKeyConfigService);
        hotKeyConfigService.registerCallback(notifyService::notifyHotKeyNotifyChange);

        //hot ket counter
        HotKeyCounterManager hotKeyCounterManager = new HotKeyCounterManager(properties);
        hotKeyConfigService.registerCallback(hotKeyCounterManager::remove);

        //topN counter
        TopNCounterManager topNCounterManager = new TopNCounterManager(properties, callbackManager);

        //event handler
        HotKeyEventHandler hotKeyEventHandler = new HotKeyEventHandler(properties, notifyService, callbackManager);

        for (int i=0; i<bizWorkThread; i++) {
            HotKeyCalculatorQueue queue = new HotKeyCalculatorQueue(properties.getWorkQueueType(), properties.getBizQueueCapacity());
            HotKeyCalculatorQueueMonitor.register(queue);
            queue.start(new HotKeyCalculator(i, hotKeyConfigService, hotKeyCounterManager, topNCounterManager, hotKeyEventHandler));
            this.queues[i] = queue;
        }

        this.executor = new ThreadPoolExecutor(SysUtils.getCpuNum(), SysUtils.getCpuNum(), 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>(10000),
                new CamelliaThreadFactory("hot-key-pack-biz-server-handler"), new ThreadPoolExecutor.AbortPolicy());
        logger.info("HotKeyPackBizServerHandler start success, bizWorkThread = {}, bizQueueCapacity = {}, workQueueType = {}",
                bizWorkThread, properties.getBizQueueCapacity(), properties.getWorkQueueType());
    }

    @Override
    public CompletableFuture<PushRepPack> onPushPack(Channel channel, PushPack pack) {
        try {
            ServerStatus.updateLastUseTime();
            if (logger.isDebugEnabled()) {
                logger.debug("receive PushPack, size = {}", pack.getList().size());
            }
            ChannelInfo channelInfo = ChannelInfo.get(channel);
            String source = channelInfo.getSource();
            List<KeyCounter> keyCounterList = pack.getList();
            int size = keyCounterList.size();
            Map<HotKeyCalculatorQueue, List<KeyCounter>> buffer = new HashMap<>();
            for (KeyCounter counter : keyCounterList) {
                HotKeyCalculatorQueue queue = selectQueue(counter);
                List<KeyCounter> list = CamelliaMapUtils.computeIfAbsent(buffer, queue, k -> new ArrayList<>(size));
                list.add(counter);
            }
            for (Map.Entry<HotKeyCalculatorQueue, List<KeyCounter>> entry : buffer.entrySet()) {
                entry.getKey().push(entry.getValue(), source);
            }
        } catch (Exception e) {
            logger.error("onPushPack error", e);
        }
        return wrapper(PushRepPack.INSTANCE);
    }

    @Override
    public CompletableFuture<GetConfigRepPack> onGetConfigPack(Channel channel, GetConfigPack pack) {
        ServerStatus.updateLastUseTime();
        CompletableFuture<GetConfigRepPack> future = new CompletableFuture<>();
        if (logger.isDebugEnabled()) {
            logger.debug("receive GetConfigPack, namespace = {}", pack.getNamespace());
        }
        try {
            ChannelInfo channelInfo = ChannelInfo.get(channel);
            channelInfo.addNamespace(pack.getNamespace());
            if (pack.getSource() != null) {
                channelInfo.setSource(pack.getSource());
            }
            executor.submit(() -> {
                try {
                    HotKeyConfig hotKeyConfig = hotKeyConfigService.get(pack.getNamespace());
                    if (logger.isDebugEnabled()) {
                        logger.debug("reply GetConfigRepPack, config = {}", JSONObject.toJSONString(hotKeyConfig));
                    }
                    if (hotKeyConfig == null) {
                        logger.warn("GetConfigPack fail because config not exists, namespace = {}, channel = {}", pack.getNamespace(), channel);
                    }
                    future.complete(new GetConfigRepPack(hotKeyConfig));
                } catch (Exception e) {
                    logger.error("onGetConfigPack error, namespace = {}", pack.getNamespace(), e);
                    future.complete(null);
                }
            });
        } catch (Exception e) {
            logger.error("submit onGetConfigPack error, namespace = {}", pack.getNamespace(), e);
            future.complete(null);
        }
        return future;
    }

    @Override
    public CompletableFuture<HotKeyCacheStatsRepPack> onHotKeyCacheStatsPack(Channel channel, HotKeyCacheStatsPack pack) {
        CompletableFuture<HotKeyCacheStatsRepPack> future = new CompletableFuture<>();
        try {
            executor.submit(() -> {
                try {
                    callbackManager.newStats(pack.getStatsList());
                    future.complete(HotKeyCacheStatsRepPack.INSTANCE);
                } catch (Exception e) {
                    future.complete(null);
                }
            });
        } catch (Exception e) {
            logger.error("submit onHotKeyCacheStatsPack error", e);
            future.complete(null);
        }
        return future;
    }

    private HotKeyCalculatorQueue selectQueue(KeyCounter counter) {
        int code = Math.abs((counter.getNamespace() + "|" + counter.getKey()).hashCode());
        int index = MathUtil.mod(is2Power, code, bizWorkThread);
        return queues[index];
    }
}
