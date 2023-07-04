package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePlaybookRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook_id")

    private String playbookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ModifyPlaybookInfo body;

    public UpdatePlaybookRequest withWorkspaceId(String workspaceId) {
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

    public UpdatePlaybookRequest withPlaybookId(String playbookId) {
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

    public UpdatePlaybookRequest withBody(ModifyPlaybookInfo body) {
        this.body = body;
        return this;
    }

    public UpdatePlaybookRequest withBody(Consumer<ModifyPlaybookInfo> bodySetter) {
        if (this.body == null) {
            this.body = new ModifyPlaybookInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ModifyPlaybookInfo getBody() {
        return body;
    }

    public void setBody(ModifyPlaybookInfo body) {
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
        UpdatePlaybookRequest updatePlaybookRequest = (UpdatePlaybookRequest) o;
        return Objects.equals(this.workspaceId, updatePlaybookRequest.workspaceId)
            && Objects.equals(this.playbookId, updatePlaybookRequest.playbookId)
            && Objects.equals(this.body, updatePlaybookRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, playbookId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePlaybookRequest {\n");
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
