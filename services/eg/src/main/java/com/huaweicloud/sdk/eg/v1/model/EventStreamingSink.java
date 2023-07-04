package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 事件目标，一个事件流中只有一个
 */
public class EventStreamingSink {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sink_fg")

    private SinkFGParameters sinkFg;

    /**
     * 事件目标类型名称
     */
    public static final class NameEnum {

        /**
         * Enum HC_FG for value: "HC.FG"
         */
        public static final NameEnum HC_FG = new NameEnum("HC.FG");

        private static final Map<String, NameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NameEnum> createStaticFields() {
            Map<String, NameEnum> map = new HashMap<>();
            map.put("HC.FG", HC_FG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NameEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            NameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NameEnum(value);
            }
            return result;
        }

        public static NameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            NameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NameEnum) {
                return this.value.equals(((NameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private NameEnum name;

    public EventStreamingSink withSinkFg(SinkFGParameters sinkFg) {
        this.sinkFg = sinkFg;
        return this;
    }

    public EventStreamingSink withSinkFg(Consumer<SinkFGParameters> sinkFgSetter) {
        if (this.sinkFg == null) {
            this.sinkFg = new SinkFGParameters();
            sinkFgSetter.accept(this.sinkFg);
        }

        return this;
    }

    /**
     * Get sinkFg
     * @return sinkFg
     */
    public SinkFGParameters getSinkFg() {
        return sinkFg;
    }

    public void setSinkFg(SinkFGParameters sinkFg) {
        this.sinkFg = sinkFg;
    }

    public EventStreamingSink withName(NameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * 事件目标类型名称
     * @return name
     */
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventStreamingSink eventStreamingSink = (EventStreamingSink) o;
        return Objects.equals(this.sinkFg, eventStreamingSink.sinkFg)
            && Objects.equals(this.name, eventStreamingSink.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sinkFg, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventStreamingSink {\n");
        sb.append("    sinkFg: ").append(toIndentedString(sinkFg)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
