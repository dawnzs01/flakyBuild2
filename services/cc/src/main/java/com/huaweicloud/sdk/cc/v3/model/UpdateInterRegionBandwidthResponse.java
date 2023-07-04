package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateInterRegionBandwidthResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inter_region_bandwidth")

    private InterRegionBandwidth interRegionBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public UpdateInterRegionBandwidthResponse withInterRegionBandwidth(InterRegionBandwidth interRegionBandwidth) {
        this.interRegionBandwidth = interRegionBandwidth;
        return this;
    }

    public UpdateInterRegionBandwidthResponse withInterRegionBandwidth(
        Consumer<InterRegionBandwidth> interRegionBandwidthSetter) {
        if (this.interRegionBandwidth == null) {
            this.interRegionBandwidth = new InterRegionBandwidth();
            interRegionBandwidthSetter.accept(this.interRegionBandwidth);
        }

        return this;
    }

    /**
     * Get interRegionBandwidth
     * @return interRegionBandwidth
     */
    public InterRegionBandwidth getInterRegionBandwidth() {
        return interRegionBandwidth;
    }

    public void setInterRegionBandwidth(InterRegionBandwidth interRegionBandwidth) {
        this.interRegionBandwidth = interRegionBandwidth;
    }

    public UpdateInterRegionBandwidthResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateInterRegionBandwidthResponse updateInterRegionBandwidthResponse = (UpdateInterRegionBandwidthResponse) o;
        return Objects.equals(this.interRegionBandwidth, updateInterRegionBandwidthResponse.interRegionBandwidth)
            && Objects.equals(this.requestId, updateInterRegionBandwidthResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interRegionBandwidth, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInterRegionBandwidthResponse {\n");
        sb.append("    interRegionBandwidth: ").append(toIndentedString(interRegionBandwidth)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
