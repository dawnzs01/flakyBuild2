package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateDeleteTransitIpTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchOperateResourceTagsRequestBody body;

    public BatchCreateDeleteTransitIpTagsRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 中转IP的ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public BatchCreateDeleteTransitIpTagsRequest withBody(BatchOperateResourceTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateDeleteTransitIpTagsRequest withBody(Consumer<BatchOperateResourceTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchOperateResourceTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchOperateResourceTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchOperateResourceTagsRequestBody body) {
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
        BatchCreateDeleteTransitIpTagsRequest batchCreateDeleteTransitIpTagsRequest =
            (BatchCreateDeleteTransitIpTagsRequest) o;
        return Objects.equals(this.resourceId, batchCreateDeleteTransitIpTagsRequest.resourceId)
            && Objects.equals(this.body, batchCreateDeleteTransitIpTagsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateDeleteTransitIpTagsRequest {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
