package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDeploymentUsingPatchRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_id")

    private String deploymentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeploymentPatchRequest body;

    public UpdateDeploymentUsingPatchRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * 部署ID
     * @return deploymentId
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public UpdateDeploymentUsingPatchRequest withBody(DeploymentPatchRequest body) {
        this.body = body;
        return this;
    }

    public UpdateDeploymentUsingPatchRequest withBody(Consumer<DeploymentPatchRequest> bodySetter) {
        if (this.body == null) {
            this.body = new DeploymentPatchRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeploymentPatchRequest getBody() {
        return body;
    }

    public void setBody(DeploymentPatchRequest body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDeploymentUsingPatchRequest updateDeploymentUsingPatchRequest = (UpdateDeploymentUsingPatchRequest) o;
        return Objects.equals(this.deploymentId, updateDeploymentUsingPatchRequest.deploymentId)
            && Objects.equals(this.body, updateDeploymentUsingPatchRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deploymentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDeploymentUsingPatchRequest {\n");
        sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
