package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListPipelineTemplatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ListPipelineTemplatesQuery body;

    public ListPipelineTemplatesRequest withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ListPipelineTemplatesRequest withBody(ListPipelineTemplatesQuery body) {
        this.body = body;
        return this;
    }

    public ListPipelineTemplatesRequest withBody(Consumer<ListPipelineTemplatesQuery> bodySetter) {
        if (this.body == null) {
            this.body = new ListPipelineTemplatesQuery();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ListPipelineTemplatesQuery getBody() {
        return body;
    }

    public void setBody(ListPipelineTemplatesQuery body) {
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
        ListPipelineTemplatesRequest listPipelineTemplatesRequest = (ListPipelineTemplatesRequest) o;
        return Objects.equals(this.tenantId, listPipelineTemplatesRequest.tenantId)
            && Objects.equals(this.body, listPipelineTemplatesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelineTemplatesRequest {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
