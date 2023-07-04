package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.StatisticValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 查询重点指标。
 */
public class MetricDataPoints  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="statistics")
    
    private List<StatisticValue> statistics = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timestamp")
    

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unit")
    

    private String unit;

    public MetricDataPoints withStatistics(List<StatisticValue> statistics) {
        this.statistics = statistics;
        return this;
    }

    
    public MetricDataPoints addStatisticsItem(StatisticValue statisticsItem) {
        if(this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        this.statistics.add(statisticsItem);
        return this;
    }

    public MetricDataPoints withStatistics(Consumer<List<StatisticValue>> statisticsSetter) {
        if(this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        statisticsSetter.accept(this.statistics);
        return this;
    }

    /**
     * 统计方式。
     * @return statistics
     */
    public List<StatisticValue> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<StatisticValue> statistics) {
        this.statistics = statistics;
    }

    

    public MetricDataPoints withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    


    /**
     * 时间戳。
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    

    public MetricDataPoints withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    


    /**
     * 时间序列单位。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricDataPoints metricDataPoints = (MetricDataPoints) o;
        return Objects.equals(this.statistics, metricDataPoints.statistics) &&
            Objects.equals(this.timestamp, metricDataPoints.timestamp) &&
            Objects.equals(this.unit, metricDataPoints.unit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(statistics, timestamp, unit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricDataPoints {\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    
    
}

