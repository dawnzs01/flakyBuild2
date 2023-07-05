package com.ruiyun.jvppeteer.protocol.performance;

import com.ruiyun.jvppeteer.protocol.performance.Metric;

import java.util.List;

/**
 * Current values of the metrics.
 */
public class MetricsPayload {
    /**
     * Current values of the metrics.
     */
    private List<Metric> metrics;
    /**
     * Timestamp title.
     */
    private String title;

    public List<Metric> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<Metric> metrics) {
        this.metrics = metrics;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
