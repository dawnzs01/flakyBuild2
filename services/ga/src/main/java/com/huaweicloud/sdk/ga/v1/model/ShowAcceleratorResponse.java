package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAcceleratorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accelerator")

    private AcceleratorDetail accelerator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowAcceleratorResponse withAccelerator(AcceleratorDetail accelerator) {
        this.accelerator = accelerator;
        return this;
    }

    public ShowAcceleratorResponse withAccelerator(Consumer<AcceleratorDetail> acceleratorSetter) {
        if (this.accelerator == null) {
            this.accelerator = new AcceleratorDetail();
            acceleratorSetter.accept(this.accelerator);
        }

        return this;
    }

    /**
     * Get accelerator
     * @return accelerator
     */
    public AcceleratorDetail getAccelerator() {
        return accelerator;
    }

    public void setAccelerator(AcceleratorDetail accelerator) {
        this.accelerator = accelerator;
    }

    public ShowAcceleratorResponse withRequestId(String requestId) {
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
        ShowAcceleratorResponse showAcceleratorResponse = (ShowAcceleratorResponse) o;
        return Objects.equals(this.accelerator, showAcceleratorResponse.accelerator)
            && Objects.equals(this.requestId, showAcceleratorResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accelerator, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAcceleratorResponse {\n");
        sb.append("    accelerator: ").append(toIndentedString(accelerator)).append("\n");
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
