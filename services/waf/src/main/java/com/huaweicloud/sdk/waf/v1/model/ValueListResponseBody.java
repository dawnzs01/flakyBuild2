package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 单个引用表信息
 */
public class ValueListResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 引用表类型
     */
    public static final class TypeEnum {

        /**
         * Enum URL for value: "url"
         */
        public static final TypeEnum URL = new TypeEnum("url");

        /**
         * Enum PARAMS for value: "params"
         */
        public static final TypeEnum PARAMS = new TypeEnum("params");

        /**
         * Enum IP for value: "ip"
         */
        public static final TypeEnum IP = new TypeEnum("ip");

        /**
         * Enum COOKIE for value: "cookie"
         */
        public static final TypeEnum COOKIE = new TypeEnum("cookie");

        /**
         * Enum REFERER for value: "referer"
         */
        public static final TypeEnum REFERER = new TypeEnum("referer");

        /**
         * Enum USER_AGENT for value: "user-agent"
         */
        public static final TypeEnum USER_AGENT = new TypeEnum("user-agent");

        /**
         * Enum HEADER for value: "header"
         */
        public static final TypeEnum HEADER = new TypeEnum("header");

        /**
         * Enum RESPONSE_CODE for value: "response_code"
         */
        public static final TypeEnum RESPONSE_CODE = new TypeEnum("response_code");

        /**
         * Enum RESPONSE_HEADER for value: "response_header"
         */
        public static final TypeEnum RESPONSE_HEADER = new TypeEnum("response_header");

        /**
         * Enum RESPONSE_BODY for value: "response_body"
         */
        public static final TypeEnum RESPONSE_BODY = new TypeEnum("response_body");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("url", URL);
            map.put("params", PARAMS);
            map.put("ip", IP);
            map.put("cookie", COOKIE);
            map.put("referer", REFERER);
            map.put("user-agent", USER_AGENT);
            map.put("header", HEADER);
            map.put("response_code", RESPONSE_CODE);
            map.put("response_header", RESPONSE_HEADER);
            map.put("response_body", RESPONSE_BODY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<String> values = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "producer")

    private Integer producer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ValueListResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 引用表id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ValueListResponseBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 引用表名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ValueListResponseBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 引用表类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ValueListResponseBody withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 引用表时间戳
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ValueListResponseBody withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public ValueListResponseBody addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public ValueListResponseBody withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 引用表的值
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public ValueListResponseBody withProducer(Integer producer) {
        this.producer = producer;
        return this;
    }

    /**
     * 引用表来源，1代表用户创建，其它值代表modulleX自动生成
     * @return producer
     */
    public Integer getProducer() {
        return producer;
    }

    public void setProducer(Integer producer) {
        this.producer = producer;
    }

    public ValueListResponseBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 引用表描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValueListResponseBody valueListResponseBody = (ValueListResponseBody) o;
        return Objects.equals(this.id, valueListResponseBody.id)
            && Objects.equals(this.name, valueListResponseBody.name)
            && Objects.equals(this.type, valueListResponseBody.type)
            && Objects.equals(this.timestamp, valueListResponseBody.timestamp)
            && Objects.equals(this.values, valueListResponseBody.values)
            && Objects.equals(this.producer, valueListResponseBody.producer)
            && Objects.equals(this.description, valueListResponseBody.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, timestamp, values, producer, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValueListResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    producer: ").append(toIndentedString(producer)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
