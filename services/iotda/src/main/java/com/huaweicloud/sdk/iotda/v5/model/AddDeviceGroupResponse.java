package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class AddDeviceGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "super_group_id")

    private String superGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_type")

    private String groupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dynamic_group_rule")

    private String dynamicGroupRule;

    public AddDeviceGroupResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 设备组ID，用于唯一标识一个设备组，在创建设备组时由物联网平台分配。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public AddDeviceGroupResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 设备组名称，单个资源空间下不可重复。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddDeviceGroupResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 设备组描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddDeviceGroupResponse withSuperGroupId(String superGroupId) {
        this.superGroupId = superGroupId;
        return this;
    }

    /**
     * 父设备组ID，该设备组的父设备组ID。
     * @return superGroupId
     */
    public String getSuperGroupId() {
        return superGroupId;
    }

    public void setSuperGroupId(String superGroupId) {
        this.superGroupId = superGroupId;
    }

    public AddDeviceGroupResponse withGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * 设备组类型，分为动态设备组和静态设备组两种
     * @return groupType
     */
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public AddDeviceGroupResponse withDynamicGroupRule(String dynamicGroupRule) {
        this.dynamicGroupRule = dynamicGroupRule;
        return this;
    }

    /**
     * 动态设备组规则
     * @return dynamicGroupRule
     */
    public String getDynamicGroupRule() {
        return dynamicGroupRule;
    }

    public void setDynamicGroupRule(String dynamicGroupRule) {
        this.dynamicGroupRule = dynamicGroupRule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddDeviceGroupResponse addDeviceGroupResponse = (AddDeviceGroupResponse) o;
        return Objects.equals(this.groupId, addDeviceGroupResponse.groupId)
            && Objects.equals(this.name, addDeviceGroupResponse.name)
            && Objects.equals(this.description, addDeviceGroupResponse.description)
            && Objects.equals(this.superGroupId, addDeviceGroupResponse.superGroupId)
            && Objects.equals(this.groupType, addDeviceGroupResponse.groupType)
            && Objects.equals(this.dynamicGroupRule, addDeviceGroupResponse.dynamicGroupRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, name, description, superGroupId, groupType, dynamicGroupRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDeviceGroupResponse {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    superGroupId: ").append(toIndentedString(superGroupId)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    dynamicGroupRule: ").append(toIndentedString(dynamicGroupRule)).append("\n");
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
