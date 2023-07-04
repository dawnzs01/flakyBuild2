package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 缓存url参数配置。
 */
public class CacheUrlParameterFilter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public CacheUrlParameterFilter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 缓存URL参数操作类型（full_url：缓存所有参数，ignore_url_params：忽略所有参数，del_params：忽略指定URL参数，reserve_params：保留指定URL参数）。   >   本接口参数有调整，参数替换如下： >   - del_params替代del_args。 >   - reserve_params替代reserve_args。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CacheUrlParameterFilter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 参数值，多个参数使用分号分隔
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CacheUrlParameterFilter cacheUrlParameterFilter = (CacheUrlParameterFilter) o;
        return Objects.equals(this.type, cacheUrlParameterFilter.type)
            && Objects.equals(this.value, cacheUrlParameterFilter.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CacheUrlParameterFilter {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
