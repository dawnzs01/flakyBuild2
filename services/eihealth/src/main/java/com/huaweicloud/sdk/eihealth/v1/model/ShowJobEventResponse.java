package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ShowJobEventResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<JobEventRsp> events = null;

    public ShowJobEventResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 条数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowJobEventResponse withEvents(List<JobEventRsp> events) {
        this.events = events;
        return this;
    }

    public ShowJobEventResponse addEventsItem(JobEventRsp eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public ShowJobEventResponse withEvents(Consumer<List<JobEventRsp>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * 作业事件列表
     * @return events
     */
    public List<JobEventRsp> getEvents() {
        return events;
    }

    public void setEvents(List<JobEventRsp> events) {
        this.events = events;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobEventResponse showJobEventResponse = (ShowJobEventResponse) o;
        return Objects.equals(this.count, showJobEventResponse.count)
            && Objects.equals(this.events, showJobEventResponse.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, events);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobEventResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
