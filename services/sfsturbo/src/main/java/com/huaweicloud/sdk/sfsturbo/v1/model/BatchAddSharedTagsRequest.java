package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchAddSharedTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_id")

    private String shareId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchAddSharedTagsRequestBody body;

    public BatchAddSharedTagsRequest withShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }

    /**
     * 共享ID
     * @return shareId
     */
    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public BatchAddSharedTagsRequest withBody(BatchAddSharedTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchAddSharedTagsRequest withBody(Consumer<BatchAddSharedTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchAddSharedTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchAddSharedTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchAddSharedTagsRequestBody body) {
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
        BatchAddSharedTagsRequest batchAddSharedTagsRequest = (BatchAddSharedTagsRequest) o;
        return Objects.equals(this.shareId, batchAddSharedTagsRequest.shareId)
            && Objects.equals(this.body, batchAddSharedTagsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddSharedTagsRequest {\n");
        sb.append("    shareId: ").append(toIndentedString(shareId)).append("\n");
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
