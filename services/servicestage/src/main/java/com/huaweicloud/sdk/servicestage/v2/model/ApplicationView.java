package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApplicationView
 */
public class ApplicationView {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_count")

    private Integer componentCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unified_model")

    private String unifiedModel;

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
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public ApplicationView withComponentCount(Integer componentCount) {
        this.componentCount = componentCount;
        return this;
    }

    /**
     * 组件个数。
     * @return componentCount
     */
    public Integer getComponentCount() {
        return componentCount;
    }

    public void setComponentCount(Integer componentCount) {
        this.componentCount = componentCount;
    }

    public ApplicationView withUnifiedModel(String unifiedModel) {
        this.unifiedModel = unifiedModel;
        return this;
    }

    /**
     * 是否开启统一模型
     * @return unifiedModel
     */
    public String getUnifiedModel() {
        return unifiedModel;
    }

    public void setUnifiedModel(String unifiedModel) {
        this.unifiedModel = unifiedModel;
    }

    public ApplicationView withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApplicationView withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApplicationView withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ApplicationView withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ApplicationView withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ApplicationView withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ApplicationView withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ApplicationView withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationView applicationView = (ApplicationView) o;
        return Objects.equals(this.componentCount, applicationView.componentCount)
            && Objects.equals(this.unifiedModel, applicationView.unifiedModel)
            && Objects.equals(this.id, applicationView.id) && Objects.equals(this.name, applicationView.name)
            && Objects.equals(this.description, applicationView.description)
            && Objects.equals(this.creator, applicationView.creator)
            && Objects.equals(this.projectId, applicationView.projectId)
            && Objects.equals(this.enterpriseProjectId, applicationView.enterpriseProjectId)
            && Objects.equals(this.createTime, applicationView.createTime)
            && Objects.equals(this.updateTime, applicationView.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentCount,
            unifiedModel,
            id,
            name,
            description,
            creator,
            projectId,
            enterpriseProjectId,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationView {\n");
        sb.append("    componentCount: ").append(toIndentedString(componentCount)).append("\n");
        sb.append("    unifiedModel: ").append(toIndentedString(unifiedModel)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
