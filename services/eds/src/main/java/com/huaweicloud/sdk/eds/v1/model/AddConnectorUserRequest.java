package com.huaweicloud.sdk.eds.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddConnectorUserRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_id")

    private String connectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UserReq body;

    public AddConnectorUserRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID,开通的数据交换平台实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public AddConnectorUserRequest withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }

    /**
     * 连接器ID,指定数据交换平台下连接器的ID
     * @return connectorId
     */
    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public AddConnectorUserRequest withBody(UserReq body) {
        this.body = body;
        return this;
    }

    public AddConnectorUserRequest withBody(Consumer<UserReq> bodySetter) {
        if (this.body == null) {
            this.body = new UserReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UserReq getBody() {
        return body;
    }

    public void setBody(UserReq body) {
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
        AddConnectorUserRequest addConnectorUserRequest = (AddConnectorUserRequest) o;
        return Objects.equals(this.instanceId, addConnectorUserRequest.instanceId)
            && Objects.equals(this.connectorId, addConnectorUserRequest.connectorId)
            && Objects.equals(this.body, addConnectorUserRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, connectorId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddConnectorUserRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
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
