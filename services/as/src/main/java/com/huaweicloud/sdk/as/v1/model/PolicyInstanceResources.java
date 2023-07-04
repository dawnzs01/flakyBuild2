package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配额资源
 */
public class PolicyInstanceResources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    public PolicyInstanceResources withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 查询配额的类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PolicyInstanceResources withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * 已使用的配额数量。
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public PolicyInstanceResources withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 配额总数量。
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public PolicyInstanceResources withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 配额上限。
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public PolicyInstanceResources withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 配额下限。
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyInstanceResources policyInstanceResources = (PolicyInstanceResources) o;
        return Objects.equals(this.type, policyInstanceResources.type)
            && Objects.equals(this.used, policyInstanceResources.used)
            && Objects.equals(this.quota, policyInstanceResources.quota)
            && Objects.equals(this.max, policyInstanceResources.max)
            && Objects.equals(this.min, policyInstanceResources.min);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, used, quota, max, min);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyInstanceResources {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
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
