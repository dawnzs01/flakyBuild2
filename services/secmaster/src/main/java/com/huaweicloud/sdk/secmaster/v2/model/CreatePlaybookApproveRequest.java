package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreatePlaybookApproveRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ApprovePlaybookInfo body;

    public CreatePlaybookApproveRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * ID of workspace
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public CreatePlaybookApproveRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * version Id value
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public CreatePlaybookApproveRequest withBody(ApprovePlaybookInfo body) {
        this.body = body;
        return this;
    }

    public CreatePlaybookApproveRequest withBody(Consumer<ApprovePlaybookInfo> bodySetter) {
        if (this.body == null) {
            this.body = new ApprovePlaybookInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ApprovePlaybookInfo getBody() {
        return body;
    }

    public void setBody(ApprovePlaybookInfo body) {
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
        CreatePlaybookApproveRequest createPlaybookApproveRequest = (CreatePlaybookApproveRequest) o;
        return Objects.equals(this.workspaceId, createPlaybookApproveRequest.workspaceId)
            && Objects.equals(this.versionId, createPlaybookApproveRequest.versionId)
            && Objects.equals(this.body, createPlaybookApproveRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, versionId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePlaybookApproveRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
