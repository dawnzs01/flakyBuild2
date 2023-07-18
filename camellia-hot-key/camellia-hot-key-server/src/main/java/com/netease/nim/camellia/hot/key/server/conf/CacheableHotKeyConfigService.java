package com.netease.nim.camellia.hot.key.server.conf;

import com.alibaba.fastjson.JSONObject;
import com.netease.nim.camellia.hot.key.common.model.HotKeyConfig;
import com.netease.nim.camellia.hot.key.common.utils.HotKeyConfigUtils;
import com.netease.nim.camellia.tools.executor.CamelliaThreadFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by caojiajun on 2023/5/9
 */
public class CacheableHotKeyConfigService {

    private static final Logger logger = LoggerFactory.getLogger(CacheableHotKeyConfigService.class);

    private final HotKeyConfigService hotKeyConfigService;
    private final ConcurrentHashMap<String, HotKeyConfig> cache = new ConcurrentHashMap<>();

    public CacheableHotKeyConfigService(HotKeyConfigService hotKeyConfigService) {
        this.hotKeyConfigService = hotKeyConfigService;
        hotKeyConfigService.registerCallback(namespace -> reload(namespace, false));
        Executors.newSingleThreadScheduledExecutor(new CamelliaThreadFactory("hot-key-config-reload"))
                .scheduleAtFixedRate(this::reload, 60, 60, TimeUnit.SECONDS);

    }

    /**
     * 获取HotKeyConfig
     * @param namespace namespace
     * @return HotKeyConfig
     */
    public HotKeyConfig get(String namespace) {
        HotKeyConfig config = cache.get(namespace);
        if (config == null) {
            config = hotKeyConfigService.get(namespace);
            if (!HotKeyConfigUtils.checkAndConvert(config)) {
                return null;
            }
            cache.put(namespace, config);
        }
        return config;
    }

    /**
     * 注册一个回调
     * @param callback Callback
     */
    public void registerCallback(HotKeyConfigService.Callback callback) {
        hotKeyConfigService.registerCallback(namespace -> {
            reload(namespace, false);
            callback.update(namespace);
        });
    }

    private void reload(String namespace, boolean callback) {
        try {
            HotKeyConfig hotKeyConfig = hotKeyConfigService.get(namespace);
            if (!HotKeyConfigUtils.checkAndConvert(hotKeyConfig)) {
                logger.warn("hot-key-config invalid, skip reload, config = {}", JSONObject.toJSONString(hotKeyConfig));
                return;
            }
            HotKeyConfig oldConfig = cache.get(namespace);
            cache.put(namespace, hotKeyConfig);
            if (callback) {
                if (HotKeyConfigUtils.isChange(oldConfig, hotKeyConfig)) {
                    hotKeyConfigService.invokeUpdate(namespace);
                }
            }
            logger.info("reload HotKeyConfig success, config = {}", JSONObject.toJSONString(hotKeyConfig));
        } catch (Exception e) {
            logger.error("reload error, namespace = {}", namespace);
        }
    }

    public void reload() {
        Set<String> set = new HashSet<>(cache.keySet());
        for (String namespace : set) {
            reload(namespace, true);
        }
    }

}
