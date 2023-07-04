package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.DimensionSeries;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 查询参数集。
 */
public class QuerySample  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dimensions")
    
    private List<DimensionSeries> dimensions = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric_name")
    

    private String metricName;

    public QuerySample withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * 时间序列命名空间。 取值范围： PAAS.CONTAINER、PAAS.NODE、PAAS.SLA、PAAS.AGGR、CUSTOMMETRICS等。 PAAS.CONTAINER：应用时间序列命名空间；  PAAS.NODE：节点时间序列命名空间；  PAAS.SLA：SLA时间序列命名空间；  PAAS.AGGR：集群时间序列命名空间；  CUSTOMMETRICS：自定义时间序列命名空间。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    

    public QuerySample withDimensions(List<DimensionSeries> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    
    public QuerySample addDimensionsItem(DimensionSeries dimensionsItem) {
        if(this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public QuerySample withDimensions(Consumer<List<DimensionSeries>> dimensionsSetter) {
        if(this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 时间序列维度列表。 可通过/v2/{project_id}/series接口中namespace+metric_name，查询当前监控的时间序列名称的时间序列维度列表。
     * @return dimensions
     */
    public List<DimensionSeries> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<DimensionSeries> dimensions) {
        this.dimensions = dimensions;
    }

    

    public QuerySample withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    


    /**
     * 时间序列名称。名称长度取值范围为1~255个字符。 取值范围： AOM提供的基础时间序列名称，cpuUsage、cpuCoreUsed等， cpuUage：cpu使用率； cpuCoreUsed：cpu内核占用； 用户上报的自定义时间序列名称。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuerySample querySample = (QuerySample) o;
        return Objects.equals(this.namespace, querySample.namespace) &&
            Objects.equals(this.dimensions, querySample.dimensions) &&
            Objects.equals(this.metricName, querySample.metricName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(namespace, dimensions, metricName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuerySample {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
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

