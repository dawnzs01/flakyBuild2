package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreatePlaybookVersionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook_id")

    private String playbookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreatePlaybookVersionInfo body;

    public CreatePlaybookVersionRequest withWorkspaceId(String workspaceId) {
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

    public CreatePlaybookVersionRequest withPlaybookId(String playbookId) {
        this.playbookId = playbookId;
        return this;
    }

    /**
     * ID of playbook
     * @return playbookId
     */
    public String getPlaybookId() {
        return playbookId;
    }

    public void setPlaybookId(String playbookId) {
        this.playbookId = playbookId;
    }

    public CreatePlaybookVersionRequest withBody(CreatePlaybookVersionInfo body) {
        this.body = body;
        return this;
    }

    public CreatePlaybookVersionRequest withBody(Consumer<CreatePlaybookVersionInfo> bodySetter) {
        if (this.body == null) {
            this.body = new CreatePlaybookVersionInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreatePlaybookVersionInfo getBody() {
        return body;
    }

    public void setBody(CreatePlaybookVersionInfo body) {
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
        CreatePlaybookVersionRequest createPlaybookVersionRequest = (CreatePlaybookVersionRequest) o;
        return Objects.equals(this.workspaceId, createPlaybookVersionRequest.workspaceId)
            && Objects.equals(this.playbookId, createPlaybookVersionRequest.playbookId)
            && Objects.equals(this.body, createPlaybookVersionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, playbookId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePlaybookVersionRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    playbookId: ").append(toIndentedString(playbookId)).append("\n");
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
