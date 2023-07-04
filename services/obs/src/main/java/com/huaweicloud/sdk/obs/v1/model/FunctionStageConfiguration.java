package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配置函数服务的元素。 
 */
@JacksonXmlRootElement(localName = "FunctionStageConfiguration")
public class FunctionStageConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Id")

    @JacksonXmlProperty(localName = "Id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Filter")

    @JacksonXmlProperty(localName = "Filter")

    private TopicConfigurationFilter filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Topic")

    @JacksonXmlProperty(localName = "Topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Event")

    @JacksonXmlProperty(localName = "Event")

    private String event;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "FunctionStage")

    @JacksonXmlProperty(localName = "FunctionStage")

    private String functionStage;

    public FunctionStageConfiguration withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 每项事件通知配置的唯一标识，若是用户未指定ID，系统将自动分配一个ID。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FunctionStageConfiguration withFilter(TopicConfigurationFilter filter) {
        this.filter = filter;
        return this;
    }

    public FunctionStageConfiguration withFilter(Consumer<TopicConfigurationFilter> filterSetter) {
        if (this.filter == null) {
            this.filter = new TopicConfigurationFilter();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public TopicConfigurationFilter getFilter() {
        return filter;
    }

    public void setFilter(TopicConfigurationFilter filter) {
        this.filter = filter;
    }

    public FunctionStageConfiguration withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * 事件通知主题的URN，当OBS检测到桶中发生特定的事件后，将会发布通知消息至该主题，可以在[消息通知服务主题](https://console.huaweicloud.com/smn/?region=cn-north-4#/topics/list)部分找到具体值。 模板：<Topic>urn:smn:region:project_id:smn_topic</Topic> 
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public FunctionStageConfiguration withEvent(String event) {
        this.event = event;
        return this;
    }

    /**
     * 需要发布通知消息的事件类型。 说明：在一个TopicConfiguration、FunctionStageConfiguration配置项中可以添加多个事件类型。 合法值： 上传对象操作可以取以下值： ObjectCreated:Put ObjectCreated:Post ObjectCreated:Copy ObjectCreated:CompleteMultipartUpload  或者使用通配符支持所有上传操作 ObjectCreated:*  删除对象操作可以取以下值： ObjectRemoved:Delete ObjectRemoved:DeleteMarkerCreated  或者使用通配符支持所有删除操作 ObjectRemoved:* 
     * @return event
     */
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public FunctionStageConfiguration withFunctionStage(String functionStage) {
        this.functionStage = functionStage;
        return this;
    }

    /**
     * 函数服务中函数的URN，当OBS检测到桶中发生特定的事件后，将会发送消息至函数服务调用执行该函数。 若添加父元素FunctionStageConfiguration，本元素是必选项。 
     * @return functionStage
     */
    public String getFunctionStage() {
        return functionStage;
    }

    public void setFunctionStage(String functionStage) {
        this.functionStage = functionStage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FunctionStageConfiguration functionStageConfiguration = (FunctionStageConfiguration) o;
        return Objects.equals(this.id, functionStageConfiguration.id)
            && Objects.equals(this.filter, functionStageConfiguration.filter)
            && Objects.equals(this.topic, functionStageConfiguration.topic)
            && Objects.equals(this.event, functionStageConfiguration.event)
            && Objects.equals(this.functionStage, functionStageConfiguration.functionStage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, filter, topic, event, functionStage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FunctionStageConfiguration {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    functionStage: ").append(toIndentedString(functionStage)).append("\n");
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
