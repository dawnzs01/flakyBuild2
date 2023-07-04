package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务信息
 */
public class CreateCommonTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task")

    private TaskBasicRequestBody task;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_detail")

    private String taskDetail;

    public CreateCommonTaskRequestBody withTask(TaskBasicRequestBody task) {
        this.task = task;
        return this;
    }

    public CreateCommonTaskRequestBody withTask(Consumer<TaskBasicRequestBody> taskSetter) {
        if (this.task == null) {
            this.task = new TaskBasicRequestBody();
            taskSetter.accept(this.task);
        }

        return this;
    }

    /**
     * Get task
     * @return task
     */
    public TaskBasicRequestBody getTask() {
        return task;
    }

    public void setTask(TaskBasicRequestBody task) {
        this.task = task;
    }

    public CreateCommonTaskRequestBody withTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
        return this;
    }

    /**
     * 参数类型为string，参数结构参照附录中“数据集成参数说明>RawFormDataRequest”章节
     * @return taskDetail
     */
    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCommonTaskRequestBody createCommonTaskRequestBody = (CreateCommonTaskRequestBody) o;
        return Objects.equals(this.task, createCommonTaskRequestBody.task)
            && Objects.equals(this.taskDetail, createCommonTaskRequestBody.taskDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, taskDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCommonTaskRequestBody {\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    taskDetail: ").append(toIndentedString(taskDetail)).append("\n");
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
