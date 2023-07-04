package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddIndependentNodeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private IndependentReq body;

    public AddIndependentNodeRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 指定需要独立master或client的集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public AddIndependentNodeRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 指定待新增独立节点类型。 - ess-master：Master节点。 - ess-client：Client节点。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AddIndependentNodeRequest withBody(IndependentReq body) {
        this.body = body;
        return this;
    }

    public AddIndependentNodeRequest withBody(Consumer<IndependentReq> bodySetter) {
        if (this.body == null) {
            this.body = new IndependentReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public IndependentReq getBody() {
        return body;
    }

    public void setBody(IndependentReq body) {
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
        AddIndependentNodeRequest addIndependentNodeRequest = (AddIndependentNodeRequest) o;
        return Objects.equals(this.clusterId, addIndependentNodeRequest.clusterId)
            && Objects.equals(this.type, addIndependentNodeRequest.type)
            && Objects.equals(this.body, addIndependentNodeRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, type, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddIndependentNodeRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
