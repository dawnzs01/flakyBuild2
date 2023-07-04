package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowWorkSpaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ma_workspace_id")

    private String maWorkspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_flag")

    private String usedFlag;

    public ShowWorkSpaceResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowWorkSpaceResponse withMaWorkspaceId(String maWorkspaceId) {
        this.maWorkspaceId = maWorkspaceId;
        return this;
    }

    /**
     * 对应的Modelarts工作空间的id
     * @return maWorkspaceId
     */
    public String getMaWorkspaceId() {
        return maWorkspaceId;
    }

    public void setMaWorkspaceId(String maWorkspaceId) {
        this.maWorkspaceId = maWorkspaceId;
    }

    public ShowWorkSpaceResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowWorkSpaceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 工作空间名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowWorkSpaceResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 工作空间描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowWorkSpaceResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowWorkSpaceResponse withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * 企业项目名称
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public ShowWorkSpaceResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowWorkSpaceResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowWorkSpaceResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 创建者
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ShowWorkSpaceResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 创建者的USER_ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ShowWorkSpaceResponse withUsedFlag(String usedFlag) {
        this.usedFlag = usedFlag;
        return this;
    }

    /**
     * 正在被使用
     * @return usedFlag
     */
    public String getUsedFlag() {
        return usedFlag;
    }

    public void setUsedFlag(String usedFlag) {
        this.usedFlag = usedFlag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowWorkSpaceResponse showWorkSpaceResponse = (ShowWorkSpaceResponse) o;
        return Objects.equals(this.workspaceId, showWorkSpaceResponse.workspaceId)
            && Objects.equals(this.maWorkspaceId, showWorkSpaceResponse.maWorkspaceId)
            && Objects.equals(this.projectId, showWorkSpaceResponse.projectId)
            && Objects.equals(this.name, showWorkSpaceResponse.name)
            && Objects.equals(this.description, showWorkSpaceResponse.description)
            && Objects.equals(this.enterpriseProjectId, showWorkSpaceResponse.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, showWorkSpaceResponse.enterpriseProjectName)
            && Objects.equals(this.createTime, showWorkSpaceResponse.createTime)
            && Objects.equals(this.updateTime, showWorkSpaceResponse.updateTime)
            && Objects.equals(this.owner, showWorkSpaceResponse.owner)
            && Objects.equals(this.userId, showWorkSpaceResponse.userId)
            && Objects.equals(this.usedFlag, showWorkSpaceResponse.usedFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId,
            maWorkspaceId,
            projectId,
            name,
            description,
            enterpriseProjectId,
            enterpriseProjectName,
            createTime,
            updateTime,
            owner,
            userId,
            usedFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkSpaceResponse {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    maWorkspaceId: ").append(toIndentedString(maWorkspaceId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    usedFlag: ").append(toIndentedString(usedFlag)).append("\n");
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
