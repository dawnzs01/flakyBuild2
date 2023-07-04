package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 事件配置对象
 */
public class EventSpecResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_space")

    private String nameSpace;

    public EventSpecResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 事件配置ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EventSpecResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 事件配置定义名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventSpecResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 事件配置显示名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public EventSpecResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 事件配置描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventSpecResponse withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 事件主题
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public EventSpecResponse withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 事件类别
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public EventSpecResponse withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 事件级别
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public EventSpecResponse withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 事件源类型
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public EventSpecResponse withNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }

    /**
     * 所属服务
     * @return nameSpace
     */
    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventSpecResponse eventSpecResponse = (EventSpecResponse) o;
        return Objects.equals(this.id, eventSpecResponse.id) && Objects.equals(this.name, eventSpecResponse.name)
            && Objects.equals(this.displayName, eventSpecResponse.displayName)
            && Objects.equals(this.description, eventSpecResponse.description)
            && Objects.equals(this.subject, eventSpecResponse.subject)
            && Objects.equals(this.category, eventSpecResponse.category)
            && Objects.equals(this.severity, eventSpecResponse.severity)
            && Objects.equals(this.sourceType, eventSpecResponse.sourceType)
            && Objects.equals(this.nameSpace, eventSpecResponse.nameSpace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, displayName, description, subject, category, severity, sourceType, nameSpace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventSpecResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    nameSpace: ").append(toIndentedString(nameSpace)).append("\n");
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
