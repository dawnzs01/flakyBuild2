package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateLoadbalancerTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchCreateLoadbalancerTagsRequestBody body;

    public BatchCreateLoadbalancerTagsRequest withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * 负载均衡器ID。
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public BatchCreateLoadbalancerTagsRequest withBody(BatchCreateLoadbalancerTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateLoadbalancerTagsRequest withBody(Consumer<BatchCreateLoadbalancerTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchCreateLoadbalancerTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchCreateLoadbalancerTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreateLoadbalancerTagsRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCreateLoadbalancerTagsRequest batchCreateLoadbalancerTagsRequest = (BatchCreateLoadbalancerTagsRequest) o;
        return Objects.equals(this.loadbalancerId, batchCreateLoadbalancerTagsRequest.loadbalancerId)
            && Objects.equals(this.body, batchCreateLoadbalancerTagsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancerId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateLoadbalancerTagsRequest {\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
