package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ThrottleSpecialUpdate
 */
public class ThrottleSpecialUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_limits")

    private Long callLimits;

    public ThrottleSpecialUpdate withCallLimits(Long callLimits) {
        this.callLimits = callLimits;
        return this;
    }

    /**
     * 流控时间内特殊对象能够访问API的最大次数限制
     * @return callLimits
     */
    public Long getCallLimits() {
        return callLimits;
    }

    public void setCallLimits(Long callLimits) {
        this.callLimits = callLimits;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThrottleSpecialUpdate throttleSpecialUpdate = (ThrottleSpecialUpdate) o;
        return Objects.equals(this.callLimits, throttleSpecialUpdate.callLimits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callLimits);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThrottleSpecialUpdate {\n");
        sb.append("    callLimits: ").append(toIndentedString(callLimits)).append("\n");
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
