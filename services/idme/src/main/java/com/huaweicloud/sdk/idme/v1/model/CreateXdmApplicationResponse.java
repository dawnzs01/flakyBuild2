package com.huaweicloud.sdk.idme.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateXdmApplicationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mark_for_delete")

    private Integer markForDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_cn")

    private String nameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc_cn")

    private String descCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc_en")

    private String descEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_type")

    private String databaseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private String environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private String versions;

    public CreateXdmApplicationResponse withId(String id) {
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

    public CreateXdmApplicationResponse withProjectId(String projectId) {
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

    public CreateXdmApplicationResponse withMarkForDelete(Integer markForDelete) {
        this.markForDelete = markForDelete;
        return this;
    }

    /**
     * 删除标记。 - 0：未删除 - 1：删除
     * @return markForDelete
     */
    public Integer getMarkForDelete() {
        return markForDelete;
    }

    public void setMarkForDelete(Integer markForDelete) {
        this.markForDelete = markForDelete;
    }

    public CreateXdmApplicationResponse withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public CreateXdmApplicationResponse withCreateTime(Long createTime) {
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

    public CreateXdmApplicationResponse withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新人。
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public CreateXdmApplicationResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public CreateXdmApplicationResponse withNameCn(String nameCn) {
        this.nameCn = nameCn;
        return this;
    }

    /**
     * 应用的中文名称。
     * @return nameCn
     */
    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public CreateXdmApplicationResponse withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 应用的英文名称。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public CreateXdmApplicationResponse withDescCn(String descCn) {
        this.descCn = descCn;
        return this;
    }

    /**
     * 应用的中文描述。
     * @return descCn
     */
    public String getDescCn() {
        return descCn;
    }

    public void setDescCn(String descCn) {
        this.descCn = descCn;
    }

    public CreateXdmApplicationResponse withDescEn(String descEn) {
        this.descEn = descEn;
        return this;
    }

    /**
     * 应用的英文描述。
     * @return descEn
     */
    public String getDescEn() {
        return descEn;
    }

    public void setDescEn(String descEn) {
        this.descEn = descEn;
    }

    public CreateXdmApplicationResponse withDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }

    /**
     * 应用的数据库类型。
     * @return databaseType
     */
    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public CreateXdmApplicationResponse withEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * 运行服务的环境标识。
     * @return environment
     */
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public CreateXdmApplicationResponse withVersions(String versions) {
        this.versions = versions;
        return this;
    }

    /**
     * 应用责任人。
     * @return versions
     */
    public String getVersions() {
        return versions;
    }

    public void setVersions(String versions) {
        this.versions = versions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateXdmApplicationResponse createXdmApplicationResponse = (CreateXdmApplicationResponse) o;
        return Objects.equals(this.id, createXdmApplicationResponse.id)
            && Objects.equals(this.projectId, createXdmApplicationResponse.projectId)
            && Objects.equals(this.markForDelete, createXdmApplicationResponse.markForDelete)
            && Objects.equals(this.createBy, createXdmApplicationResponse.createBy)
            && Objects.equals(this.createTime, createXdmApplicationResponse.createTime)
            && Objects.equals(this.updateBy, createXdmApplicationResponse.updateBy)
            && Objects.equals(this.updateTime, createXdmApplicationResponse.updateTime)
            && Objects.equals(this.nameCn, createXdmApplicationResponse.nameCn)
            && Objects.equals(this.nameEn, createXdmApplicationResponse.nameEn)
            && Objects.equals(this.descCn, createXdmApplicationResponse.descCn)
            && Objects.equals(this.descEn, createXdmApplicationResponse.descEn)
            && Objects.equals(this.databaseType, createXdmApplicationResponse.databaseType)
            && Objects.equals(this.environment, createXdmApplicationResponse.environment)
            && Objects.equals(this.versions, createXdmApplicationResponse.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            markForDelete,
            createBy,
            createTime,
            updateBy,
            updateTime,
            nameCn,
            nameEn,
            descCn,
            descEn,
            databaseType,
            environment,
            versions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateXdmApplicationResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    markForDelete: ").append(toIndentedString(markForDelete)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    nameCn: ").append(toIndentedString(nameCn)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    descCn: ").append(toIndentedString(descCn)).append("\n");
        sb.append("    descEn: ").append(toIndentedString(descEn)).append("\n");
        sb.append("    databaseType: ").append(toIndentedString(databaseType)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
