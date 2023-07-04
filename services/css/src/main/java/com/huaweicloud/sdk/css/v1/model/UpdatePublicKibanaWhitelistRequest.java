package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePublicKibanaWhitelistRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePublicKibanaWhitelistReq body;

    public UpdatePublicKibanaWhitelistRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 指定修改kibana的访问权限的集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdatePublicKibanaWhitelistRequest withBody(UpdatePublicKibanaWhitelistReq body) {
        this.body = body;
        return this;
    }

    public UpdatePublicKibanaWhitelistRequest withBody(Consumer<UpdatePublicKibanaWhitelistReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePublicKibanaWhitelistReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePublicKibanaWhitelistReq getBody() {
        return body;
    }

    public void setBody(UpdatePublicKibanaWhitelistReq body) {
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
        UpdatePublicKibanaWhitelistRequest updatePublicKibanaWhitelistRequest = (UpdatePublicKibanaWhitelistRequest) o;
        return Objects.equals(this.clusterId, updatePublicKibanaWhitelistRequest.clusterId)
            && Objects.equals(this.body, updatePublicKibanaWhitelistRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePublicKibanaWhitelistRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
