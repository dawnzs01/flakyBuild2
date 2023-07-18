package com.netease.nim.camellia.hot.key.sdk;

import com.alibaba.fastjson.JSONObject;
import com.netease.nim.camellia.core.util.CollectionSplitUtil;
import com.netease.nim.camellia.hot.key.common.exception.CamelliaHotKeyException;
import com.netease.nim.camellia.hot.key.common.model.*;
import com.netease.nim.camellia.hot.key.common.netty.HotKeyConstants;
import com.netease.nim.camellia.hot.key.common.netty.HotKeyPack;
import com.netease.nim.camellia.hot.key.common.netty.pack.*;
import com.netease.nim.camellia.hot.key.sdk.collect.HotKeyCounterCollector;
import com.netease.nim.camellia.hot.key.sdk.conf.CamelliaHotKeySdkConfig;
import com.netease.nim.camellia.hot.key.sdk.listener.CamelliaHotKeyConfigListener;
import com.netease.nim.camellia.hot.key.sdk.listener.CamelliaHotKeyListener;
import com.netease.nim.camellia.hot.key.sdk.netty.HotKeyClient;
import com.netease.nim.camellia.hot.key.sdk.netty.HotKeyClientHub;
import com.netease.nim.camellia.hot.key.sdk.netty.HotKeyClientListener;
import com.netease.nim.camellia.tools.executor.CamelliaThreadFactory;
import com.netease.nim.camellia.tools.utils.CamelliaMapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.*;

/**
 * Created by caojiajun on 2023/5/6
 */
public class CamelliaHotKeySdk implements ICamelliaHotKeySdk {

    private static final Logger logger = LoggerFactory.getLogger(CamelliaHotKeySdk.class);

    private final CamelliaHotKeySdkConfig config;
    private final ConcurrentHashMap<String, List<CamelliaHotKeyListener>> hotKeyListenerMap = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, List<CamelliaHotKeyConfigListener>> hotKeyConfigListenerMap = new ConcurrentHashMap<>();

    private final HotKeyCounterCollector collector;

    public CamelliaHotKeySdk(CamelliaHotKeySdkConfig config) {
        this.config = config;
        if (config.getDiscovery() == null) {
            throw new CamelliaHotKeyException("discovery is missing");
        }
        this.collector = new HotKeyCounterCollector(config.getCapacity());
        HotKeyClientHub.getInstance().registerDiscovery(config.getDiscovery());
        HotKeyClientHub.getInstance().registerListener(new DefaultHotKeyClientListener(this));
        Executors.newSingleThreadScheduledExecutor(new CamelliaThreadFactory("camellia-hot-key-sdk-schedule")).scheduleAtFixedRate(this::schedulePush,
                config.getPushIntervalMillis(), config.getPushIntervalMillis(), TimeUnit.MILLISECONDS);
        logger.info("CamelliaHotKeySdk init success, pushIntervalMillis = {}, pushBatch = {}, capacity = {}",
                config.getPushIntervalMillis(), config.getPushBatch(), config.getCapacity());
    }

    public CamelliaHotKeySdkConfig getConfig() {
        return config;
    }

    @Override
    public void push(String namespace, String key, KeyAction keyAction, long count) {
        collector.push(namespace, key, keyAction, count);
    }

    @Override
    public HotKeyConfig getHotKeyConfig(String namespace) {
        try {
            HotKeyClient client = HotKeyClientHub.getInstance().selectClient(config.getDiscovery(), UUID.randomUUID().toString());
            if (client == null) {
                logger.warn("not found valid HotKeyClient, return null HotKeyConfig");
                throw new CamelliaHotKeyException("can not found valid hot key server");
            }
            CompletableFuture<HotKeyPack> future = client.sendPack(HotKeyPack.newPack(HotKeyCommand.GET_CONFIG,
                    new GetConfigPack(namespace, HotKeyConstants.Client.source)));
            HotKeyPack hotKeyPack = future.get(HotKeyConstants.Client.getConfigTimeoutMillis, TimeUnit.MILLISECONDS);
            GetConfigRepPack repPack = (GetConfigRepPack) hotKeyPack.getBody();
            return repPack.getConfig();
        } catch (CamelliaHotKeyException e) {
            throw e;
        } catch (Exception e) {
            throw new CamelliaHotKeyException(e);
        }
    }

    @Override
    public void sendHotkeyCacheStats(List<HotKeyCacheStats> statsList) {
        try {
            HotKeyClient client = HotKeyClientHub.getInstance().selectClient(config.getDiscovery(), UUID.randomUUID().toString());
            if (client == null) {
                logger.warn("not found valid HotKeyClient, sendHotkeyCacheStats fail");
                throw new CamelliaHotKeyException("can not found valid hot key server");
            }
            CompletableFuture<HotKeyPack> future = client.sendPack(HotKeyPack.newPack(HotKeyCommand.HOT_KEY_CACHE_STATS, new HotKeyCacheStatsPack(statsList)));
            HotKeyPack hotKeyPack = future.get(HotKeyConstants.Client.pushCacheHitStatsTimeoutMillis, TimeUnit.MILLISECONDS);
            if (hotKeyPack != null) {
                HotKeyCacheStatsRepPack repPack = (HotKeyCacheStatsRepPack) hotKeyPack.getBody();
                if (repPack != null) {
                    if (logger.isDebugEnabled()) {
                        logger.debug("sendHotkeyCacheStats success, size = {}", statsList.size());
                    }
                }
            }
        } catch (CamelliaHotKeyException e) {
            throw e;
        } catch (Exception e) {
            throw new CamelliaHotKeyException(e);
        }
    }

    @Override
    public synchronized void addListener(String namespace, CamelliaHotKeyConfigListener listener) {
        List<CamelliaHotKeyConfigListener> listeners = CamelliaMapUtils.computeIfAbsent(hotKeyConfigListenerMap, namespace, k -> new ArrayList<>());
        listeners.add(listener);
    }

    @Override
    public synchronized void addListener(String namespace, CamelliaHotKeyListener listener) {
        List<CamelliaHotKeyListener> listeners = CamelliaMapUtils.computeIfAbsent(hotKeyListenerMap, namespace, k -> new ArrayList<>());
        listeners.add(listener);
    }

    private void schedulePush() {
        try {
            List<KeyCounter> collect = collector.collect();
            Map<HotKeyClient, List<KeyCounter>> map = new HashMap<>();
            for (KeyCounter counter : collect) {
                HotKeyClient client = HotKeyClientHub.getInstance().selectClient(config.getDiscovery(), counter.getKey());
                List<KeyCounter> counters = CamelliaMapUtils.computeIfAbsent(map, client, k -> new ArrayList<>());
                counters.add(counter);
            }
            for (Map.Entry<HotKeyClient, List<KeyCounter>> entry : map.entrySet()) {
                HotKeyClient client = entry.getKey();
                if (client == null) {
                    logger.error("selectClient return null, skip push");
                    continue;
                }
                List<KeyCounter> counters = entry.getValue();
                List<List<KeyCounter>> split = CollectionSplitUtil.split(counters, config.getPushBatch());
                for (List<KeyCounter> list : split) {
                    CompletableFuture<HotKeyPack> future = client.sendPack(HotKeyPack.newPack(HotKeyCommand.PUSH, new PushPack(list)));
                    future.thenAccept(pack -> {
                        if (logger.isDebugEnabled()) {
                            logger.debug("send push pack to server success, size = {}", list.size());
                        }
                    });
                    future.exceptionally(throwable -> {
                        logger.error("send push pack to server error, size = {}", list.size(), throwable);
                        return null;
                    });
                }
            }
        } catch (Exception e) {
            logger.error("schedulePush error", e);
        }
    }

    private static class DefaultHotKeyClientListener implements HotKeyClientListener {

        private final CamelliaHotKeySdk sdk;

        public DefaultHotKeyClientListener(CamelliaHotKeySdk sdk) {
            this.sdk = sdk;
        }

        @Override
        public void onHotKey(HotKey hotKey) {
            String namespace = hotKey.getNamespace();
            List<CamelliaHotKeyListener> listeners = sdk.hotKeyListenerMap.get(namespace);
            if (listeners != null && !listeners.isEmpty()) {
                for (CamelliaHotKeyListener listener : listeners) {
                    try {
                        HotKeyEvent event = new HotKeyEvent(hotKey.getNamespace(), hotKey.getAction(), hotKey.getKey(), hotKey.getExpireMillis());
                        listener.onHotKeyEvent(event);
                    } catch (Exception e) {
                        logger.error("onHotKeyEvent error, hotKey = {}", JSONObject.toJSONString(hotKey), e);
                    }
                }
            }
        }

        @Override
        public void onHotKeyConfig(HotKeyConfig hotKeyConfig) {
            String namespace = hotKeyConfig.getNamespace();
            List<CamelliaHotKeyConfigListener> listeners = sdk.hotKeyConfigListenerMap.get(namespace);
            if (listeners != null && !listeners.isEmpty()) {
                for (CamelliaHotKeyConfigListener listener : listeners) {
                    try {
                        listener.onHotKeyConfigChange(hotKeyConfig);
                    } catch (Exception e) {
                        logger.error("onHotKeyConfigChange error, hotKey = {}", JSONObject.toJSONString(hotKeyConfig), e);
                    }
                }
            }
        }
    }
}
