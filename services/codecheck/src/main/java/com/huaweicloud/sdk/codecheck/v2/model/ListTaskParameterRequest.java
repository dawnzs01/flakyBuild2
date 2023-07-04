package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListTaskParameterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ConfigTaskParameterBody body;

    public ListTaskParameterRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListTaskParameterRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListTaskParameterRequest withBody(ConfigTaskParameterBody body) {
        this.body = body;
        return this;
    }

    public ListTaskParameterRequest withBody(Consumer<ConfigTaskParameterBody> bodySetter) {
        if (this.body == null) {
            this.body = new ConfigTaskParameterBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ConfigTaskParameterBody getBody() {
        return body;
    }

    public void setBody(ConfigTaskParameterBody body) {
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
        ListTaskParameterRequest listTaskParameterRequest = (ListTaskParameterRequest) o;
        return Objects.equals(this.projectId, listTaskParameterRequest.projectId)
            && Objects.equals(this.taskId, listTaskParameterRequest.taskId)
            && Objects.equals(this.body, listTaskParameterRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, taskId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskParameterRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
