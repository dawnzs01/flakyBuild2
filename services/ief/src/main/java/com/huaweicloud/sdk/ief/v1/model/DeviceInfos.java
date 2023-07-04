package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 关联设备信息
 */
public class DeviceInfos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation")

    private String relation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_ids")

    private List<String> deviceIds = null;

    public DeviceInfos withRelation(String relation) {
        this.relation = relation;
        return this;
    }

    /**
     * 设备和节点关系的名称，只允许中文字符、英文字母、数字、下划线、中划线，最大长度64
     * @return relation
     */
    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public DeviceInfos withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 设备和节点关系的描述，最大长度64，不允许^ ~ # $ % & * < > ( ) [ ] { } ' \" \\
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public DeviceInfos withDeviceIds(List<String> deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }

    public DeviceInfos addDeviceIdsItem(String deviceIdsItem) {
        if (this.deviceIds == null) {
            this.deviceIds = new ArrayList<>();
        }
        this.deviceIds.add(deviceIdsItem);
        return this;
    }

    public DeviceInfos withDeviceIds(Consumer<List<String>> deviceIdsSetter) {
        if (this.deviceIds == null) {
            this.deviceIds = new ArrayList<>();
        }
        deviceIdsSetter.accept(this.deviceIds);
        return this;
    }

    /**
     * 设备ID列表
     * @return deviceIds
     */
    public List<String> getDeviceIds() {
        return deviceIds;
    }

    public void setDeviceIds(List<String> deviceIds) {
        this.deviceIds = deviceIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceInfos deviceInfos = (DeviceInfos) o;
        return Objects.equals(this.relation, deviceInfos.relation) && Objects.equals(this.comment, deviceInfos.comment)
            && Objects.equals(this.deviceIds, deviceInfos.deviceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relation, comment, deviceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceInfos {\n");
        sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
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
