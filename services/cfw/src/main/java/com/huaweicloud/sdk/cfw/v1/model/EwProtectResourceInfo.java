package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 东西向防护的资源信息，例如VPC、VGW等
 */
public class EwProtectResourceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_resource_type")

    private Integer protectedResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_resource_name")

    private String protectedResourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_resource_id")

    private String protectedResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_resource_nat_name")

    private String protectedResourceNatName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_resource_nat_id")

    private String protectedResourceNatId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_resource_project_id")

    private String protectedResourceProjectId;

    public EwProtectResourceInfo withProtectedResourceType(Integer protectedResourceType) {
        this.protectedResourceType = protectedResourceType;
        return this;
    }

    /**
     * 防护资源类型：0 VPC，1 VGW
     * @return protectedResourceType
     */
    public Integer getProtectedResourceType() {
        return protectedResourceType;
    }

    public void setProtectedResourceType(Integer protectedResourceType) {
        this.protectedResourceType = protectedResourceType;
    }

    public EwProtectResourceInfo withProtectedResourceName(String protectedResourceName) {
        this.protectedResourceName = protectedResourceName;
        return this;
    }

    /**
     * 防护资源名称
     * @return protectedResourceName
     */
    public String getProtectedResourceName() {
        return protectedResourceName;
    }

    public void setProtectedResourceName(String protectedResourceName) {
        this.protectedResourceName = protectedResourceName;
    }

    public EwProtectResourceInfo withProtectedResourceId(String protectedResourceId) {
        this.protectedResourceId = protectedResourceId;
        return this;
    }

    /**
     * 防护资源id
     * @return protectedResourceId
     */
    public String getProtectedResourceId() {
        return protectedResourceId;
    }

    public void setProtectedResourceId(String protectedResourceId) {
        this.protectedResourceId = protectedResourceId;
    }

    public EwProtectResourceInfo withProtectedResourceNatName(String protectedResourceNatName) {
        this.protectedResourceNatName = protectedResourceNatName;
        return this;
    }

    /**
     * 防护资源nat网关名称
     * @return protectedResourceNatName
     */
    public String getProtectedResourceNatName() {
        return protectedResourceNatName;
    }

    public void setProtectedResourceNatName(String protectedResourceNatName) {
        this.protectedResourceNatName = protectedResourceNatName;
    }

    public EwProtectResourceInfo withProtectedResourceNatId(String protectedResourceNatId) {
        this.protectedResourceNatId = protectedResourceNatId;
        return this;
    }

    /**
     * 防护资源nat网关id
     * @return protectedResourceNatId
     */
    public String getProtectedResourceNatId() {
        return protectedResourceNatId;
    }

    public void setProtectedResourceNatId(String protectedResourceNatId) {
        this.protectedResourceNatId = protectedResourceNatId;
    }

    public EwProtectResourceInfo withProtectedResourceProjectId(String protectedResourceProjectId) {
        this.protectedResourceProjectId = protectedResourceProjectId;
        return this;
    }

    /**
     * 防护资源租户id
     * @return protectedResourceProjectId
     */
    public String getProtectedResourceProjectId() {
        return protectedResourceProjectId;
    }

    public void setProtectedResourceProjectId(String protectedResourceProjectId) {
        this.protectedResourceProjectId = protectedResourceProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EwProtectResourceInfo ewProtectResourceInfo = (EwProtectResourceInfo) o;
        return Objects.equals(this.protectedResourceType, ewProtectResourceInfo.protectedResourceType)
            && Objects.equals(this.protectedResourceName, ewProtectResourceInfo.protectedResourceName)
            && Objects.equals(this.protectedResourceId, ewProtectResourceInfo.protectedResourceId)
            && Objects.equals(this.protectedResourceNatName, ewProtectResourceInfo.protectedResourceNatName)
            && Objects.equals(this.protectedResourceNatId, ewProtectResourceInfo.protectedResourceNatId)
            && Objects.equals(this.protectedResourceProjectId, ewProtectResourceInfo.protectedResourceProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectedResourceType,
            protectedResourceName,
            protectedResourceId,
            protectedResourceNatName,
            protectedResourceNatId,
            protectedResourceProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EwProtectResourceInfo {\n");
        sb.append("    protectedResourceType: ").append(toIndentedString(protectedResourceType)).append("\n");
        sb.append("    protectedResourceName: ").append(toIndentedString(protectedResourceName)).append("\n");
        sb.append("    protectedResourceId: ").append(toIndentedString(protectedResourceId)).append("\n");
        sb.append("    protectedResourceNatName: ").append(toIndentedString(protectedResourceNatName)).append("\n");
        sb.append("    protectedResourceNatId: ").append(toIndentedString(protectedResourceNatId)).append("\n");
        sb.append("    protectedResourceProjectId: ").append(toIndentedString(protectedResourceProjectId)).append("\n");
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
