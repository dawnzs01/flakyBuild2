package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteEnlargeFailNodeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeleteEnlargeFailNodeRequestBody body;

    public DeleteEnlargeFailNodeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，可以调用[5.3.3 查询实例列表和详情](x-wc://file=zh-cn_topic_0000001397299481.xml)接口获取。如果未申请实例，可以调用[5.3.1 创建实例](x-wc://file=zh-cn_topic_0000001397139461.xml)接口创建。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteEnlargeFailNodeRequest withBody(DeleteEnlargeFailNodeRequestBody body) {
        this.body = body;
        return this;
    }

    public DeleteEnlargeFailNodeRequest withBody(Consumer<DeleteEnlargeFailNodeRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DeleteEnlargeFailNodeRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeleteEnlargeFailNodeRequestBody getBody() {
        return body;
    }

    public void setBody(DeleteEnlargeFailNodeRequestBody body) {
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
        DeleteEnlargeFailNodeRequest deleteEnlargeFailNodeRequest = (DeleteEnlargeFailNodeRequest) o;
        return Objects.equals(this.instanceId, deleteEnlargeFailNodeRequest.instanceId)
            && Objects.equals(this.body, deleteEnlargeFailNodeRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteEnlargeFailNodeRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
