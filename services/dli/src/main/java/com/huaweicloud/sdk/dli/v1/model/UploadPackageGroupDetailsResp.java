package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 上传分组资源的请求返回详细body体。
 */
public class UploadPackageGroupDetailsResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_async")

    private Boolean isAsync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "underlying_name")

    private String underlyingName;

    public UploadPackageGroupDetailsResp withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 资源包上传的unix时间。是单位为“毫秒”的时间戳。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public UploadPackageGroupDetailsResp withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新已上传资源包的unix时间。是单位为“毫秒”的时间戳
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public UploadPackageGroupDetailsResp withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public UploadPackageGroupDetailsResp withIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
        return this;
    }

    /**
     * 是否异步上传资源包
     * @return isAsync
     */
    public Boolean getIsAsync() {
        return isAsync;
    }

    public void setIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
    }

    public UploadPackageGroupDetailsResp withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public UploadPackageGroupDetailsResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * \"UPLOADING\"表示正在上传。\"READY\"表示资源包已上传。\"FAILED\"表示资源包上传失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UploadPackageGroupDetailsResp withUnderlyingName(String underlyingName) {
        this.underlyingName = underlyingName;
        return this;
    }

    /**
     * 资源包在队列中的名字。
     * @return underlyingName
     */
    public String getUnderlyingName() {
        return underlyingName;
    }

    public void setUnderlyingName(String underlyingName) {
        this.underlyingName = underlyingName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadPackageGroupDetailsResp uploadPackageGroupDetailsResp = (UploadPackageGroupDetailsResp) o;
        return Objects.equals(this.createTime, uploadPackageGroupDetailsResp.createTime)
            && Objects.equals(this.updateTime, uploadPackageGroupDetailsResp.updateTime)
            && Objects.equals(this.resourceType, uploadPackageGroupDetailsResp.resourceType)
            && Objects.equals(this.isAsync, uploadPackageGroupDetailsResp.isAsync)
            && Objects.equals(this.resourceName, uploadPackageGroupDetailsResp.resourceName)
            && Objects.equals(this.status, uploadPackageGroupDetailsResp.status)
            && Objects.equals(this.underlyingName, uploadPackageGroupDetailsResp.underlyingName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime, updateTime, resourceType, isAsync, resourceName, status, underlyingName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadPackageGroupDetailsResp {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    isAsync: ").append(toIndentedString(isAsync)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    underlyingName: ").append(toIndentedString(underlyingName)).append("\n");
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
