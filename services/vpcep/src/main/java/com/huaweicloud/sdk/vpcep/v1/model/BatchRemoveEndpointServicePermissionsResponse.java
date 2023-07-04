package com.huaweicloud.sdk.vpcep.v1.model;

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
public class BatchRemoveEndpointServicePermissionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permissions")

    private List<EpsPermission> permissions = null;

    public BatchRemoveEndpointServicePermissionsResponse withPermissions(List<EpsPermission> permissions) {
        this.permissions = permissions;
        return this;
    }

    public BatchRemoveEndpointServicePermissionsResponse addPermissionsItem(EpsPermission permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public BatchRemoveEndpointServicePermissionsResponse withPermissions(
        Consumer<List<EpsPermission>> permissionsSetter) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        permissionsSetter.accept(this.permissions);
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    public List<EpsPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<EpsPermission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchRemoveEndpointServicePermissionsResponse batchRemoveEndpointServicePermissionsResponse =
            (BatchRemoveEndpointServicePermissionsResponse) o;
        return Objects.equals(this.permissions, batchRemoveEndpointServicePermissionsResponse.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRemoveEndpointServicePermissionsResponse {\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
