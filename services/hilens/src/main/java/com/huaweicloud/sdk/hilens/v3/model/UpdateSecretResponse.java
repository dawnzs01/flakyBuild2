package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateSecretResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    private CreateUpdateSecretRespSecret secret;

    public UpdateSecretResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public UpdateSecretResponse withSecret(CreateUpdateSecretRespSecret secret) {
        this.secret = secret;
        return this;
    }

    public UpdateSecretResponse withSecret(Consumer<CreateUpdateSecretRespSecret> secretSetter) {
        if (this.secret == null) {
            this.secret = new CreateUpdateSecretRespSecret();
            secretSetter.accept(this.secret);
        }

        return this;
    }

    /**
     * Get secret
     * @return secret
     */
    public CreateUpdateSecretRespSecret getSecret() {
        return secret;
    }

    public void setSecret(CreateUpdateSecretRespSecret secret) {
        this.secret = secret;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSecretResponse updateSecretResponse = (UpdateSecretResponse) o;
        return Objects.equals(this.workspaceId, updateSecretResponse.workspaceId)
            && Objects.equals(this.secret, updateSecretResponse.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, secret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecretResponse {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
