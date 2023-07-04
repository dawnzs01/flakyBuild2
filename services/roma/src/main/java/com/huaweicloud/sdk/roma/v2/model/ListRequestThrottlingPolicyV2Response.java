package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListRequestThrottlingPolicyV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "throttles")

    private List<ThrottlesInfo> throttles = null;

    public ListRequestThrottlingPolicyV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListRequestThrottlingPolicyV2Response withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 满足条件的记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListRequestThrottlingPolicyV2Response withThrottles(List<ThrottlesInfo> throttles) {
        this.throttles = throttles;
        return this;
    }

    public ListRequestThrottlingPolicyV2Response addThrottlesItem(ThrottlesInfo throttlesItem) {
        if (this.throttles == null) {
            this.throttles = new ArrayList<>();
        }
        this.throttles.add(throttlesItem);
        return this;
    }

    public ListRequestThrottlingPolicyV2Response withThrottles(Consumer<List<ThrottlesInfo>> throttlesSetter) {
        if (this.throttles == null) {
            this.throttles = new ArrayList<>();
        }
        throttlesSetter.accept(this.throttles);
        return this;
    }

    /**
     * 本次查询到的流控策略列表
     * @return throttles
     */
    public List<ThrottlesInfo> getThrottles() {
        return throttles;
    }

    public void setThrottles(List<ThrottlesInfo> throttles) {
        this.throttles = throttles;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRequestThrottlingPolicyV2Response listRequestThrottlingPolicyV2Response =
            (ListRequestThrottlingPolicyV2Response) o;
        return Objects.equals(this.size, listRequestThrottlingPolicyV2Response.size)
            && Objects.equals(this.total, listRequestThrottlingPolicyV2Response.total)
            && Objects.equals(this.throttles, listRequestThrottlingPolicyV2Response.throttles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, throttles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRequestThrottlingPolicyV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    throttles: ").append(toIndentedString(throttles)).append("\n");
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
