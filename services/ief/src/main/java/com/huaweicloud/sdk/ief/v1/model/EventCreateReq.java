package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 系统订阅创建请求体
 */
public class EventCreateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "systemevent")

    private EventCreateDetail systemevent;

    public EventCreateReq withSystemevent(EventCreateDetail systemevent) {
        this.systemevent = systemevent;
        return this;
    }

    public EventCreateReq withSystemevent(Consumer<EventCreateDetail> systemeventSetter) {
        if (this.systemevent == null) {
            this.systemevent = new EventCreateDetail();
            systemeventSetter.accept(this.systemevent);
        }

        return this;
    }

    /**
     * Get systemevent
     * @return systemevent
     */
    public EventCreateDetail getSystemevent() {
        return systemevent;
    }

    public void setSystemevent(EventCreateDetail systemevent) {
        this.systemevent = systemevent;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventCreateReq eventCreateReq = (EventCreateReq) o;
        return Objects.equals(this.systemevent, eventCreateReq.systemevent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemevent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventCreateReq {\n");
        sb.append("    systemevent: ").append(toIndentedString(systemevent)).append("\n");
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
