package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 参数模板信息。
 */
public class CreateConfigurationResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_version_name")

    private String datastoreVersionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_name")

    private String datastoreName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    public CreateConfigurationResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 参数模板ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateConfigurationResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数模板名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateConfigurationResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数模板描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateConfigurationResult withDatastoreVersionName(String datastoreVersionName) {
        this.datastoreVersionName = datastoreVersionName;
        return this;
    }

    /**
     * 数据库版本名称。
     * @return datastoreVersionName
     */
    public String getDatastoreVersionName() {
        return datastoreVersionName;
    }

    public void setDatastoreVersionName(String datastoreVersionName) {
        this.datastoreVersionName = datastoreVersionName;
    }

    public CreateConfigurationResult withDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
        return this;
    }

    /**
     * 数据库名称。
     * @return datastoreName
     */
    public String getDatastoreName() {
        return datastoreName;
    }

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    public CreateConfigurationResult withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public CreateConfigurationResult withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 更新时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateConfigurationResult createConfigurationResult = (CreateConfigurationResult) o;
        return Objects.equals(this.id, createConfigurationResult.id)
            && Objects.equals(this.name, createConfigurationResult.name)
            && Objects.equals(this.description, createConfigurationResult.description)
            && Objects.equals(this.datastoreVersionName, createConfigurationResult.datastoreVersionName)
            && Objects.equals(this.datastoreName, createConfigurationResult.datastoreName)
            && Objects.equals(this.created, createConfigurationResult.created)
            && Objects.equals(this.updated, createConfigurationResult.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, datastoreVersionName, datastoreName, created, updated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConfigurationResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    datastoreVersionName: ").append(toIndentedString(datastoreVersionName)).append("\n");
        sb.append("    datastoreName: ").append(toIndentedString(datastoreName)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
