package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 环境信息
 */
public class IncidentEnvironment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor_type")

    private String vendorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public IncidentEnvironment withVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }

    /**
     * The name, display only
     * @return vendorType
     */
    public String getVendorType() {
        return vendorType;
    }

    public void setVendorType(String vendorType) {
        this.vendorType = vendorType;
    }

    public IncidentEnvironment withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * Id value
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public IncidentEnvironment withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * Id value
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public IncidentEnvironment withProjectId(String projectId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IncidentEnvironment incidentEnvironment = (IncidentEnvironment) o;
        return Objects.equals(this.vendorType, incidentEnvironment.vendorType)
            && Objects.equals(this.domainId, incidentEnvironment.domainId)
            && Objects.equals(this.regionId, incidentEnvironment.regionId)
            && Objects.equals(this.projectId, incidentEnvironment.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorType, domainId, regionId, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentEnvironment {\n");
        sb.append("    vendorType: ").append(toIndentedString(vendorType)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
