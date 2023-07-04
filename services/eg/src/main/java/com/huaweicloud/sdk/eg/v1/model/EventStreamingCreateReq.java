package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * EventStreamingCreateReq
 */
public class EventStreamingCreateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private EventStreamingSource source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sink")

    private EventStreamingSink sink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_config")

    private EventStreamingCreateReqRuleConfig ruleConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "option")

    private RunOption option;

    public EventStreamingCreateReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 事件流名称，租户下唯一，由字母、数字、点、下划线和中划线组成，必须字母或数字开头
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventStreamingCreateReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 事件流描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventStreamingCreateReq withSource(EventStreamingSource source) {
        this.source = source;
        return this;
    }

    public EventStreamingCreateReq withSource(Consumer<EventStreamingSource> sourceSetter) {
        if (this.source == null) {
            this.source = new EventStreamingSource();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public EventStreamingSource getSource() {
        return source;
    }

    public void setSource(EventStreamingSource source) {
        this.source = source;
    }

    public EventStreamingCreateReq withSink(EventStreamingSink sink) {
        this.sink = sink;
        return this;
    }

    public EventStreamingCreateReq withSink(Consumer<EventStreamingSink> sinkSetter) {
        if (this.sink == null) {
            this.sink = new EventStreamingSink();
            sinkSetter.accept(this.sink);
        }

        return this;
    }

    /**
     * Get sink
     * @return sink
     */
    public EventStreamingSink getSink() {
        return sink;
    }

    public void setSink(EventStreamingSink sink) {
        this.sink = sink;
    }

    public EventStreamingCreateReq withRuleConfig(EventStreamingCreateReqRuleConfig ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }

    public EventStreamingCreateReq withRuleConfig(Consumer<EventStreamingCreateReqRuleConfig> ruleConfigSetter) {
        if (this.ruleConfig == null) {
            this.ruleConfig = new EventStreamingCreateReqRuleConfig();
            ruleConfigSetter.accept(this.ruleConfig);
        }

        return this;
    }

    /**
     * Get ruleConfig
     * @return ruleConfig
     */
    public EventStreamingCreateReqRuleConfig getRuleConfig() {
        return ruleConfig;
    }

    public void setRuleConfig(EventStreamingCreateReqRuleConfig ruleConfig) {
        this.ruleConfig = ruleConfig;
    }

    public EventStreamingCreateReq withOption(RunOption option) {
        this.option = option;
        return this;
    }

    public EventStreamingCreateReq withOption(Consumer<RunOption> optionSetter) {
        if (this.option == null) {
            this.option = new RunOption();
            optionSetter.accept(this.option);
        }

        return this;
    }

    /**
     * Get option
     * @return option
     */
    public RunOption getOption() {
        return option;
    }

    public void setOption(RunOption option) {
        this.option = option;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventStreamingCreateReq eventStreamingCreateReq = (EventStreamingCreateReq) o;
        return Objects.equals(this.name, eventStreamingCreateReq.name)
            && Objects.equals(this.description, eventStreamingCreateReq.description)
            && Objects.equals(this.source, eventStreamingCreateReq.source)
            && Objects.equals(this.sink, eventStreamingCreateReq.sink)
            && Objects.equals(this.ruleConfig, eventStreamingCreateReq.ruleConfig)
            && Objects.equals(this.option, eventStreamingCreateReq.option);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, source, sink, ruleConfig, option);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventStreamingCreateReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    sink: ").append(toIndentedString(sink)).append("\n");
        sb.append("    ruleConfig: ").append(toIndentedString(ruleConfig)).append("\n");
        sb.append("    option: ").append(toIndentedString(option)).append("\n");
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
