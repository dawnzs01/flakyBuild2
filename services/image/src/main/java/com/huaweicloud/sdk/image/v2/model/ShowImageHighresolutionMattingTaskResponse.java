package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowImageHighresolutionMattingTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ImageHighresolutionMattingInput input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private TaskOutput output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private ImageHighresolutionMattingConfig config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback")

    private TaskCallback callback;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowImageHighresolutionMattingTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowImageHighresolutionMattingTaskResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间，格式为ISO8601：YYYY-MM-DDThh:mm:ssZ
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowImageHighresolutionMattingTaskResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 任务更新时间，格式为ISO8601：YYYY-MM-DDThh:mm:ssZ
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowImageHighresolutionMattingTaskResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 任务当前的状态，分别为SUCCEEDED（运行成功），FAILED（运行失败），RUNNING（运行中）。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShowImageHighresolutionMattingTaskResponse withInput(ImageHighresolutionMattingInput input) {
        this.input = input;
        return this;
    }

    public ShowImageHighresolutionMattingTaskResponse withInput(Consumer<ImageHighresolutionMattingInput> inputSetter) {
        if (this.input == null) {
            this.input = new ImageHighresolutionMattingInput();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public ImageHighresolutionMattingInput getInput() {
        return input;
    }

    public void setInput(ImageHighresolutionMattingInput input) {
        this.input = input;
    }

    public ShowImageHighresolutionMattingTaskResponse withOutput(TaskOutput output) {
        this.output = output;
        return this;
    }

    public ShowImageHighresolutionMattingTaskResponse withOutput(Consumer<TaskOutput> outputSetter) {
        if (this.output == null) {
            this.output = new TaskOutput();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /**
     * Get output
     * @return output
     */
    public TaskOutput getOutput() {
        return output;
    }

    public void setOutput(TaskOutput output) {
        this.output = output;
    }

    public ShowImageHighresolutionMattingTaskResponse withConfig(ImageHighresolutionMattingConfig config) {
        this.config = config;
        return this;
    }

    public ShowImageHighresolutionMattingTaskResponse withConfig(
        Consumer<ImageHighresolutionMattingConfig> configSetter) {
        if (this.config == null) {
            this.config = new ImageHighresolutionMattingConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public ImageHighresolutionMattingConfig getConfig() {
        return config;
    }

    public void setConfig(ImageHighresolutionMattingConfig config) {
        this.config = config;
    }

    public ShowImageHighresolutionMattingTaskResponse withCallback(TaskCallback callback) {
        this.callback = callback;
        return this;
    }

    public ShowImageHighresolutionMattingTaskResponse withCallback(Consumer<TaskCallback> callbackSetter) {
        if (this.callback == null) {
            this.callback = new TaskCallback();
            callbackSetter.accept(this.callback);
        }

        return this;
    }

    /**
     * Get callback
     * @return callback
     */
    public TaskCallback getCallback() {
        return callback;
    }

    public void setCallback(TaskCallback callback) {
        this.callback = callback;
    }

    public ShowImageHighresolutionMattingTaskResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowImageHighresolutionMattingTaskResponse showImageHighresolutionMattingTaskResponse =
            (ShowImageHighresolutionMattingTaskResponse) o;
        return Objects.equals(this.taskId, showImageHighresolutionMattingTaskResponse.taskId)
            && Objects.equals(this.createTime, showImageHighresolutionMattingTaskResponse.createTime)
            && Objects.equals(this.updateTime, showImageHighresolutionMattingTaskResponse.updateTime)
            && Objects.equals(this.state, showImageHighresolutionMattingTaskResponse.state)
            && Objects.equals(this.input, showImageHighresolutionMattingTaskResponse.input)
            && Objects.equals(this.output, showImageHighresolutionMattingTaskResponse.output)
            && Objects.equals(this.config, showImageHighresolutionMattingTaskResponse.config)
            && Objects.equals(this.callback, showImageHighresolutionMattingTaskResponse.callback)
            && Objects.equals(this.xRequestId, showImageHighresolutionMattingTaskResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, createTime, updateTime, state, input, output, config, callback, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageHighresolutionMattingTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
