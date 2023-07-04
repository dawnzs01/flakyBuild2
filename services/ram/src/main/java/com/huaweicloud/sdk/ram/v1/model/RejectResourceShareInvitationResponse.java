package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RejectResourceShareInvitationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_invitation")

    private ResourceShareInvitation resourceShareInvitation;

    public RejectResourceShareInvitationResponse withResourceShareInvitation(
        ResourceShareInvitation resourceShareInvitation) {
        this.resourceShareInvitation = resourceShareInvitation;
        return this;
    }

    public RejectResourceShareInvitationResponse withResourceShareInvitation(
        Consumer<ResourceShareInvitation> resourceShareInvitationSetter) {
        if (this.resourceShareInvitation == null) {
            this.resourceShareInvitation = new ResourceShareInvitation();
            resourceShareInvitationSetter.accept(this.resourceShareInvitation);
        }

        return this;
    }

    /**
     * Get resourceShareInvitation
     * @return resourceShareInvitation
     */
    public ResourceShareInvitation getResourceShareInvitation() {
        return resourceShareInvitation;
    }

    public void setResourceShareInvitation(ResourceShareInvitation resourceShareInvitation) {
        this.resourceShareInvitation = resourceShareInvitation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RejectResourceShareInvitationResponse rejectResourceShareInvitationResponse =
            (RejectResourceShareInvitationResponse) o;
        return Objects.equals(this.resourceShareInvitation,
            rejectResourceShareInvitationResponse.resourceShareInvitation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceShareInvitation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RejectResourceShareInvitationResponse {\n");
        sb.append("    resourceShareInvitation: ").append(toIndentedString(resourceShareInvitation)).append("\n");
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
