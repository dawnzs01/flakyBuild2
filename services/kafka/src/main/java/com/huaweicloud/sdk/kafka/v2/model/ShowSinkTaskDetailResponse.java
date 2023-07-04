package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSinkTaskDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_type")

    private String destinationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private String topics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_destination_descriptor")

    private ShowSinkTaskDetailRespObsDestinationDescriptor obsDestinationDescriptor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics_info")

    private List<ShowSinkTaskDetailRespTopicsInfo> topicsInfo = null;

    public ShowSinkTaskDetailResponse withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 转储任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ShowSinkTaskDetailResponse withDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * 转储任务类型。
     * @return destinationType
     */
    public String getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    public ShowSinkTaskDetailResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 转储任务创建时间戳。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowSinkTaskDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 转储任务状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowSinkTaskDetailResponse withTopics(String topics) {
        this.topics = topics;
        return this;
    }

    /**
     * 返回任务转存的topics列表或者正则表达式。
     * @return topics
     */
    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public ShowSinkTaskDetailResponse withObsDestinationDescriptor(
        ShowSinkTaskDetailRespObsDestinationDescriptor obsDestinationDescriptor) {
        this.obsDestinationDescriptor = obsDestinationDescriptor;
        return this;
    }

    public ShowSinkTaskDetailResponse withObsDestinationDescriptor(
        Consumer<ShowSinkTaskDetailRespObsDestinationDescriptor> obsDestinationDescriptorSetter) {
        if (this.obsDestinationDescriptor == null) {
            this.obsDestinationDescriptor = new ShowSinkTaskDetailRespObsDestinationDescriptor();
            obsDestinationDescriptorSetter.accept(this.obsDestinationDescriptor);
        }

        return this;
    }

    /**
     * Get obsDestinationDescriptor
     * @return obsDestinationDescriptor
     */
    public ShowSinkTaskDetailRespObsDestinationDescriptor getObsDestinationDescriptor() {
        return obsDestinationDescriptor;
    }

    public void setObsDestinationDescriptor(ShowSinkTaskDetailRespObsDestinationDescriptor obsDestinationDescriptor) {
        this.obsDestinationDescriptor = obsDestinationDescriptor;
    }

    public ShowSinkTaskDetailResponse withTopicsInfo(List<ShowSinkTaskDetailRespTopicsInfo> topicsInfo) {
        this.topicsInfo = topicsInfo;
        return this;
    }

    public ShowSinkTaskDetailResponse addTopicsInfoItem(ShowSinkTaskDetailRespTopicsInfo topicsInfoItem) {
        if (this.topicsInfo == null) {
            this.topicsInfo = new ArrayList<>();
        }
        this.topicsInfo.add(topicsInfoItem);
        return this;
    }

    public ShowSinkTaskDetailResponse withTopicsInfo(
        Consumer<List<ShowSinkTaskDetailRespTopicsInfo>> topicsInfoSetter) {
        if (this.topicsInfo == null) {
            this.topicsInfo = new ArrayList<>();
        }
        topicsInfoSetter.accept(this.topicsInfo);
        return this;
    }

    /**
     * topic信息。
     * @return topicsInfo
     */
    public List<ShowSinkTaskDetailRespTopicsInfo> getTopicsInfo() {
        return topicsInfo;
    }

    public void setTopicsInfo(List<ShowSinkTaskDetailRespTopicsInfo> topicsInfo) {
        this.topicsInfo = topicsInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSinkTaskDetailResponse showSinkTaskDetailResponse = (ShowSinkTaskDetailResponse) o;
        return Objects.equals(this.taskName, showSinkTaskDetailResponse.taskName)
            && Objects.equals(this.destinationType, showSinkTaskDetailResponse.destinationType)
            && Objects.equals(this.createTime, showSinkTaskDetailResponse.createTime)
            && Objects.equals(this.status, showSinkTaskDetailResponse.status)
            && Objects.equals(this.topics, showSinkTaskDetailResponse.topics)
            && Objects.equals(this.obsDestinationDescriptor, showSinkTaskDetailResponse.obsDestinationDescriptor)
            && Objects.equals(this.topicsInfo, showSinkTaskDetailResponse.topicsInfo);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(taskName, destinationType, createTime, status, topics, obsDestinationDescriptor, topicsInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSinkTaskDetailResponse {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    obsDestinationDescriptor: ").append(toIndentedString(obsDestinationDescriptor)).append("\n");
        sb.append("    topicsInfo: ").append(toIndentedString(topicsInfo)).append("\n");
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
