package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateEndpointRoutetableRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_endpoint_id")

    private String vpcEndpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateEndpointRoutetableRequestBody body;

    public UpdateEndpointRoutetableRequest withVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
        return this;
    }

    /**
     * 终端节点的ID。
     * @return vpcEndpointId
     */
    public String getVpcEndpointId() {
        return vpcEndpointId;
    }

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    public UpdateEndpointRoutetableRequest withBody(UpdateEndpointRoutetableRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateEndpointRoutetableRequest withBody(Consumer<UpdateEndpointRoutetableRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateEndpointRoutetableRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateEndpointRoutetableRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateEndpointRoutetableRequestBody body) {
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
        UpdateEndpointRoutetableRequest updateEndpointRoutetableRequest = (UpdateEndpointRoutetableRequest) o;
        return Objects.equals(this.vpcEndpointId, updateEndpointRoutetableRequest.vpcEndpointId)
            && Objects.equals(this.body, updateEndpointRoutetableRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcEndpointId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointRoutetableRequest {\n");
        sb.append("    vpcEndpointId: ").append(toIndentedString(vpcEndpointId)).append("\n");
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
