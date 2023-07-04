package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DisassociateResourceShareResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_associations")

    private List<ResourceShareAssociation> resourceShareAssociations = null;

    public DisassociateResourceShareResponse withResourceShareAssociations(
        List<ResourceShareAssociation> resourceShareAssociations) {
        this.resourceShareAssociations = resourceShareAssociations;
        return this;
    }

    public DisassociateResourceShareResponse addResourceShareAssociationsItem(
        ResourceShareAssociation resourceShareAssociationsItem) {
        if (this.resourceShareAssociations == null) {
            this.resourceShareAssociations = new ArrayList<>();
        }
        this.resourceShareAssociations.add(resourceShareAssociationsItem);
        return this;
    }

    public DisassociateResourceShareResponse withResourceShareAssociations(
        Consumer<List<ResourceShareAssociation>> resourceShareAssociationsSetter) {
        if (this.resourceShareAssociations == null) {
            this.resourceShareAssociations = new ArrayList<>();
        }
        resourceShareAssociationsSetter.accept(this.resourceShareAssociations);
        return this;
    }

    /**
     * Get resourceShareAssociations
     * @return resourceShareAssociations
     */
    public List<ResourceShareAssociation> getResourceShareAssociations() {
        return resourceShareAssociations;
    }

    public void setResourceShareAssociations(List<ResourceShareAssociation> resourceShareAssociations) {
        this.resourceShareAssociations = resourceShareAssociations;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisassociateResourceShareResponse disassociateResourceShareResponse = (DisassociateResourceShareResponse) o;
        return Objects.equals(this.resourceShareAssociations,
            disassociateResourceShareResponse.resourceShareAssociations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceShareAssociations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateResourceShareResponse {\n");
        sb.append("    resourceShareAssociations: ").append(toIndentedString(resourceShareAssociations)).append("\n");
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
