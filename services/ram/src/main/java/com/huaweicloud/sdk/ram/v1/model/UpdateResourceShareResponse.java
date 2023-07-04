package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateResourceShareResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share")

    private ResourceShare resourceShare;

    public UpdateResourceShareResponse withResourceShare(ResourceShare resourceShare) {
        this.resourceShare = resourceShare;
        return this;
    }

    public UpdateResourceShareResponse withResourceShare(Consumer<ResourceShare> resourceShareSetter) {
        if (this.resourceShare == null) {
            this.resourceShare = new ResourceShare();
            resourceShareSetter.accept(this.resourceShare);
        }

        return this;
    }

    /**
     * Get resourceShare
     * @return resourceShare
     */
    public ResourceShare getResourceShare() {
        return resourceShare;
    }

    public void setResourceShare(ResourceShare resourceShare) {
        this.resourceShare = resourceShare;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateResourceShareResponse updateResourceShareResponse = (UpdateResourceShareResponse) o;
        return Objects.equals(this.resourceShare, updateResourceShareResponse.resourceShare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceShare);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResourceShareResponse {\n");
        sb.append("    resourceShare: ").append(toIndentedString(resourceShare)).append("\n");
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
