package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 备份:策略时间调度规则
 */
public class BackupTriggerInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private BackupTriggerPropertiesInfo properties;

    public BackupTriggerInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 调度器id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BackupTriggerInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 调度器名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BackupTriggerInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 调度器类型,目前只支持 time,定时调度。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BackupTriggerInfo withProperties(BackupTriggerPropertiesInfo properties) {
        this.properties = properties;
        return this;
    }

    public BackupTriggerInfo withProperties(Consumer<BackupTriggerPropertiesInfo> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new BackupTriggerPropertiesInfo();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public BackupTriggerPropertiesInfo getProperties() {
        return properties;
    }

    public void setProperties(BackupTriggerPropertiesInfo properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupTriggerInfo backupTriggerInfo = (BackupTriggerInfo) o;
        return Objects.equals(this.id, backupTriggerInfo.id) && Objects.equals(this.name, backupTriggerInfo.name)
            && Objects.equals(this.type, backupTriggerInfo.type)
            && Objects.equals(this.properties, backupTriggerInfo.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupTriggerInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
