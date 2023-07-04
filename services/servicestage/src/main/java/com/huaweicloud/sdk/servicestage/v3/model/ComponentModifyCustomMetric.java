package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ComponentModifyCustomMetric
 */
public class ComponentModifyCustomMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    private String dimensions;

    public ComponentModifyCustomMetric withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 采集路径，例如/metrics
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ComponentModifyCustomMetric withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 采集端口，例如9090
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ComponentModifyCustomMetric withDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * 监控维度，例如\"cpu_usage,mem_usage\"
     * @return dimensions
     */
    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentModifyCustomMetric componentModifyCustomMetric = (ComponentModifyCustomMetric) o;
        return Objects.equals(this.path, componentModifyCustomMetric.path)
            && Objects.equals(this.port, componentModifyCustomMetric.port)
            && Objects.equals(this.dimensions, componentModifyCustomMetric.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, port, dimensions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentModifyCustomMetric {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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
