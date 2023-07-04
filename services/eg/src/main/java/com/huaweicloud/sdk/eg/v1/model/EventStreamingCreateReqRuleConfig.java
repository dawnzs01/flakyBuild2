package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 事件规则，包括过滤规则和转换规则
 */
public class EventStreamingCreateReqRuleConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transform")

    private TransForm transform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private String filter;

    public EventStreamingCreateReqRuleConfig withTransform(TransForm transform) {
        this.transform = transform;
        return this;
    }

    public EventStreamingCreateReqRuleConfig withTransform(Consumer<TransForm> transformSetter) {
        if (this.transform == null) {
            this.transform = new TransForm();
            transformSetter.accept(this.transform);
        }

        return this;
    }

    /**
     * Get transform
     * @return transform
     */
    public TransForm getTransform() {
        return transform;
    }

    public void setTransform(TransForm transform) {
        this.transform = transform;
    }

    public EventStreamingCreateReqRuleConfig withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 过滤规则
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventStreamingCreateReqRuleConfig eventStreamingCreateReqRuleConfig = (EventStreamingCreateReqRuleConfig) o;
        return Objects.equals(this.transform, eventStreamingCreateReqRuleConfig.transform)
            && Objects.equals(this.filter, eventStreamingCreateReqRuleConfig.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transform, filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventStreamingCreateReqRuleConfig {\n");
        sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
