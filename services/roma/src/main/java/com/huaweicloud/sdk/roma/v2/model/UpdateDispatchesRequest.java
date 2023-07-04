package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDispatchesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dispatch_id")

    private String dispatchId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private TaskDispatch body;

    public UpdateDispatchesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateDispatchesRequest withTaskId(String taskId) {
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

    public UpdateDispatchesRequest withDispatchId(String dispatchId) {
        this.dispatchId = dispatchId;
        return this;
    }

    /**
     * 调度唯一标识，调度计划ID
     * @return dispatchId
     */
    public String getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(String dispatchId) {
        this.dispatchId = dispatchId;
    }

    public UpdateDispatchesRequest withBody(TaskDispatch body) {
        this.body = body;
        return this;
    }

    public UpdateDispatchesRequest withBody(Consumer<TaskDispatch> bodySetter) {
        if (this.body == null) {
            this.body = new TaskDispatch();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public TaskDispatch getBody() {
        return body;
    }

    public void setBody(TaskDispatch body) {
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
        UpdateDispatchesRequest updateDispatchesRequest = (UpdateDispatchesRequest) o;
        return Objects.equals(this.instanceId, updateDispatchesRequest.instanceId)
            && Objects.equals(this.taskId, updateDispatchesRequest.taskId)
            && Objects.equals(this.dispatchId, updateDispatchesRequest.dispatchId)
            && Objects.equals(this.body, updateDispatchesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, taskId, dispatchId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDispatchesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    dispatchId: ").append(toIndentedString(dispatchId)).append("\n");
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
