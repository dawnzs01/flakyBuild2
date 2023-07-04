package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateTaskRelatedTestCaseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskInfo")

    private TaskInfo taskInfo;

    public UpdateTaskRelatedTestCaseResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * code
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UpdateTaskRelatedTestCaseResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UpdateTaskRelatedTestCaseResponse withTaskInfo(TaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }

    public UpdateTaskRelatedTestCaseResponse withTaskInfo(Consumer<TaskInfo> taskInfoSetter) {
        if (this.taskInfo == null) {
            this.taskInfo = new TaskInfo();
            taskInfoSetter.accept(this.taskInfo);
        }

        return this;
    }

    /**
     * Get taskInfo
     * @return taskInfo
     */
    public TaskInfo getTaskInfo() {
        return taskInfo;
    }

    public void setTaskInfo(TaskInfo taskInfo) {
        this.taskInfo = taskInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTaskRelatedTestCaseResponse updateTaskRelatedTestCaseResponse = (UpdateTaskRelatedTestCaseResponse) o;
        return Objects.equals(this.code, updateTaskRelatedTestCaseResponse.code)
            && Objects.equals(this.message, updateTaskRelatedTestCaseResponse.message)
            && Objects.equals(this.taskInfo, updateTaskRelatedTestCaseResponse.taskInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, taskInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskRelatedTestCaseResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    taskInfo: ").append(toIndentedString(taskInfo)).append("\n");
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
