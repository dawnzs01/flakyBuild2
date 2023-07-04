package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateCaTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca_id")

    private String caId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchOperateTagRequestBody body;

    public BatchCreateCaTagsRequest withCaId(String caId) {
        this.caId = caId;
        return this;
    }

    /**
     * 所需要批量创建标签的CA证书ID。
     * @return caId
     */
    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    public BatchCreateCaTagsRequest withBody(BatchOperateTagRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateCaTagsRequest withBody(Consumer<BatchOperateTagRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchOperateTagRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchOperateTagRequestBody getBody() {
        return body;
    }

    public void setBody(BatchOperateTagRequestBody body) {
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
        BatchCreateCaTagsRequest batchCreateCaTagsRequest = (BatchCreateCaTagsRequest) o;
        return Objects.equals(this.caId, batchCreateCaTagsRequest.caId)
            && Objects.equals(this.body, batchCreateCaTagsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateCaTagsRequest {\n");
        sb.append("    caId: ").append(toIndentedString(caId)).append("\n");
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
