package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新订阅事件请求体
 */
public class EventSubUpdateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Integer enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target")

    private String notificationTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target_name")

    private String notificationTargetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target_type")

    private String notificationTargetType;

    public EventSubUpdateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 事件订阅名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventSubUpdateRequest withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 事件源类型支持cluster，backup，disaster-recovery
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public EventSubUpdateRequest withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 事件源ID
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public EventSubUpdateRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 事件类别支持management，monitor，security，system alarm
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public EventSubUpdateRequest withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 事件级别支持normal，warning
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public EventSubUpdateRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 事件标签
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public EventSubUpdateRequest withEnable(Integer enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否开启订阅 1为开启，0为关闭
     * @return enable
     */
    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public EventSubUpdateRequest withNotificationTarget(String notificationTarget) {
        this.notificationTarget = notificationTarget;
        return this;
    }

    /**
     * 消息通知地址
     * @return notificationTarget
     */
    public String getNotificationTarget() {
        return notificationTarget;
    }

    public void setNotificationTarget(String notificationTarget) {
        this.notificationTarget = notificationTarget;
    }

    public EventSubUpdateRequest withNotificationTargetName(String notificationTargetName) {
        this.notificationTargetName = notificationTargetName;
        return this;
    }

    /**
     * 消息主题名称
     * @return notificationTargetName
     */
    public String getNotificationTargetName() {
        return notificationTargetName;
    }

    public void setNotificationTargetName(String notificationTargetName) {
        this.notificationTargetName = notificationTargetName;
    }

    public EventSubUpdateRequest withNotificationTargetType(String notificationTargetType) {
        this.notificationTargetType = notificationTargetType;
        return this;
    }

    /**
     * 消息通知类型只支持SMN
     * @return notificationTargetType
     */
    public String getNotificationTargetType() {
        return notificationTargetType;
    }

    public void setNotificationTargetType(String notificationTargetType) {
        this.notificationTargetType = notificationTargetType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventSubUpdateRequest eventSubUpdateRequest = (EventSubUpdateRequest) o;
        return Objects.equals(this.name, eventSubUpdateRequest.name)
            && Objects.equals(this.sourceType, eventSubUpdateRequest.sourceType)
            && Objects.equals(this.sourceId, eventSubUpdateRequest.sourceId)
            && Objects.equals(this.category, eventSubUpdateRequest.category)
            && Objects.equals(this.severity, eventSubUpdateRequest.severity)
            && Objects.equals(this.tag, eventSubUpdateRequest.tag)
            && Objects.equals(this.enable, eventSubUpdateRequest.enable)
            && Objects.equals(this.notificationTarget, eventSubUpdateRequest.notificationTarget)
            && Objects.equals(this.notificationTargetName, eventSubUpdateRequest.notificationTargetName)
            && Objects.equals(this.notificationTargetType, eventSubUpdateRequest.notificationTargetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            sourceType,
            sourceId,
            category,
            severity,
            tag,
            enable,
            notificationTarget,
            notificationTargetName,
            notificationTargetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventSubUpdateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    notificationTarget: ").append(toIndentedString(notificationTarget)).append("\n");
        sb.append("    notificationTargetName: ").append(toIndentedString(notificationTargetName)).append("\n");
        sb.append("    notificationTargetType: ").append(toIndentedString(notificationTargetType)).append("\n");
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
