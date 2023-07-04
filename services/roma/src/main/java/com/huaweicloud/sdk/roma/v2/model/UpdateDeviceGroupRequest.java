package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDeviceGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private Integer groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateDeviceGroupRequestBody body;

    public UpdateDeviceGroupRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateDeviceGroupRequest withGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 设备分组ID
     * minimum: 0
     * maximum: 200376420520689663
     * @return groupId
     */
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public UpdateDeviceGroupRequest withBody(UpdateDeviceGroupRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateDeviceGroupRequest withBody(Consumer<UpdateDeviceGroupRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateDeviceGroupRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateDeviceGroupRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateDeviceGroupRequestBody body) {
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
        UpdateDeviceGroupRequest updateDeviceGroupRequest = (UpdateDeviceGroupRequest) o;
        return Objects.equals(this.instanceId, updateDeviceGroupRequest.instanceId)
            && Objects.equals(this.groupId, updateDeviceGroupRequest.groupId)
            && Objects.equals(this.body, updateDeviceGroupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, groupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDeviceGroupRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
