package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListIncidentDetail
 */
public class ListIncidentDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object")

    private Incident dataObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_id")

    private String dataclassId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_id")

    private String layoutId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass")

    private ShowAlertDetailDataclassRef dataclass;

    public ListIncidentDetail withDataObject(Incident dataObject) {
        this.dataObject = dataObject;
        return this;
    }

    public ListIncidentDetail withDataObject(Consumer<Incident> dataObjectSetter) {
        if (this.dataObject == null) {
            this.dataObject = new Incident();
            dataObjectSetter.accept(this.dataObject);
        }

        return this;
    }

    /**
     * Get dataObject
     * @return dataObject
     */
    public Incident getDataObject() {
        return dataObject;
    }

    public void setDataObject(Incident dataObject) {
        this.dataObject = dataObject;
    }

    public ListIncidentDetail withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Create time
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ListIncidentDetail withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Update time
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ListIncidentDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Id value
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListIncidentDetail withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Id value
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListIncidentDetail withDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
        return this;
    }

    /**
     * Id value
     * @return dataclassId
     */
    public String getDataclassId() {
        return dataclassId;
    }

    public void setDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
    }

    public ListIncidentDetail withLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }

    /**
     * Id value
     * @return layoutId
     */
    public String getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    public ListIncidentDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name, display only
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListIncidentDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The name, display only
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListIncidentDetail withDataclass(ShowAlertDetailDataclassRef dataclass) {
        this.dataclass = dataclass;
        return this;
    }

    public ListIncidentDetail withDataclass(Consumer<ShowAlertDetailDataclassRef> dataclassSetter) {
        if (this.dataclass == null) {
            this.dataclass = new ShowAlertDetailDataclassRef();
            dataclassSetter.accept(this.dataclass);
        }

        return this;
    }

    /**
     * Get dataclass
     * @return dataclass
     */
    public ShowAlertDetailDataclassRef getDataclass() {
        return dataclass;
    }

    public void setDataclass(ShowAlertDetailDataclassRef dataclass) {
        this.dataclass = dataclass;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListIncidentDetail listIncidentDetail = (ListIncidentDetail) o;
        return Objects.equals(this.dataObject, listIncidentDetail.dataObject)
            && Objects.equals(this.createTime, listIncidentDetail.createTime)
            && Objects.equals(this.updateTime, listIncidentDetail.updateTime)
            && Objects.equals(this.projectId, listIncidentDetail.projectId)
            && Objects.equals(this.workspaceId, listIncidentDetail.workspaceId)
            && Objects.equals(this.dataclassId, listIncidentDetail.dataclassId)
            && Objects.equals(this.layoutId, listIncidentDetail.layoutId)
            && Objects.equals(this.name, listIncidentDetail.name) && Objects.equals(this.type, listIncidentDetail.type)
            && Objects.equals(this.dataclass, listIncidentDetail.dataclass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataObject,
            createTime,
            updateTime,
            projectId,
            workspaceId,
            dataclassId,
            layoutId,
            name,
            type,
            dataclass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIncidentDetail {\n");
        sb.append("    dataObject: ").append(toIndentedString(dataObject)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    dataclassId: ").append(toIndentedString(dataclassId)).append("\n");
        sb.append("    layoutId: ").append(toIndentedString(layoutId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    dataclass: ").append(toIndentedString(dataclass)).append("\n");
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
