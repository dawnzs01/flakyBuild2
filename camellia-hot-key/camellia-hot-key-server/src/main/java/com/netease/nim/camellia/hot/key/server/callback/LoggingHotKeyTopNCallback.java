package com.netease.nim.camellia.hot.key.server.callback;

import com.netease.nim.camellia.hot.key.server.calculate.TopNStats;
import com.netease.nim.camellia.hot.key.server.calculate.TopNStatsResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by caojiajun on 2023/5/10
 */
public class LoggingHotKeyTopNCallback implements HotKeyTopNCallback {

    private static final Logger logger = LoggerFactory.getLogger("camellia-hot-key-topn");

    @Override
    public void topN(TopNStatsResult result) {
        logger.info("===hot-key-topn====");
        logger.info("namespace={}", result.getNamespace());
        for (TopNStats topNStats : result.getTopN()) {
            logger.info("key={},action={},maxQps={},total={},sourceSet={}",
                    topNStats.getKey(), topNStats.getAction(), topNStats.getMaxQps(), topNStats.getTotal(), topNStats.getSourceSet());
        }
        logger.info("====end====");
    }
}
