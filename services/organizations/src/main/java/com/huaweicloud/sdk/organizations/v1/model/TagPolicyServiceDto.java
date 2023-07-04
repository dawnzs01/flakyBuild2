package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * A quota of organization.
 */
public class TagPolicyServiceDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_types")

    private List<String> resourceTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_all")

    private Boolean supportAll;

    public TagPolicyServiceDto withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * The service name of the service.
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public TagPolicyServiceDto withResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    public TagPolicyServiceDto addResourceTypesItem(String resourceTypesItem) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        this.resourceTypes.add(resourceTypesItem);
        return this;
    }

    public TagPolicyServiceDto withResourceTypes(Consumer<List<String>> resourceTypesSetter) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        resourceTypesSetter.accept(this.resourceTypes);
        return this;
    }

    /**
     * Get resourceTypes
     * @return resourceTypes
     */
    public List<String> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public TagPolicyServiceDto withSupportAll(Boolean supportAll) {
        this.supportAll = supportAll;
        return this;
    }

    /**
     * resource_type是否支持全量选择，即*
     * @return supportAll
     */
    public Boolean getSupportAll() {
        return supportAll;
    }

    public void setSupportAll(Boolean supportAll) {
        this.supportAll = supportAll;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagPolicyServiceDto tagPolicyServiceDto = (TagPolicyServiceDto) o;
        return Objects.equals(this.serviceName, tagPolicyServiceDto.serviceName)
            && Objects.equals(this.resourceTypes, tagPolicyServiceDto.resourceTypes)
            && Objects.equals(this.supportAll, tagPolicyServiceDto.supportAll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName, resourceTypes, supportAll);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagPolicyServiceDto {\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
        sb.append("    supportAll: ").append(toIndentedString(supportAll)).append("\n");
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
