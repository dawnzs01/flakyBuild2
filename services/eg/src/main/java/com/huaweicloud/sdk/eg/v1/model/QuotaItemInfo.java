package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * QuotaItemInfo
 */
public class QuotaItemInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 配额类型
     */
    public static final class TypeEnum {

        /**
         * Enum CHANNEL for value: "CHANNEL"
         */
        public static final TypeEnum CHANNEL = new TypeEnum("CHANNEL");

        /**
         * Enum CHANNEL_SUBSCRIPTION for value: "CHANNEL_SUBSCRIPTION"
         */
        public static final TypeEnum CHANNEL_SUBSCRIPTION = new TypeEnum("CHANNEL_SUBSCRIPTION");

        /**
         * Enum SOURCE for value: "SOURCE"
         */
        public static final TypeEnum SOURCE = new TypeEnum("SOURCE");

        /**
         * Enum SUBSCRIPTION for value: "SUBSCRIPTION"
         */
        public static final TypeEnum SUBSCRIPTION = new TypeEnum("SUBSCRIPTION");

        /**
         * Enum SUBSCRIPTION_TARGET for value: "SUBSCRIPTION_TARGET"
         */
        public static final TypeEnum SUBSCRIPTION_TARGET = new TypeEnum("SUBSCRIPTION_TARGET");

        /**
         * Enum SCHEMA for value: "SCHEMA"
         */
        public static final TypeEnum SCHEMA = new TypeEnum("SCHEMA");

        /**
         * Enum SCHEMA_VERSION for value: "SCHEMA_VERSION"
         */
        public static final TypeEnum SCHEMA_VERSION = new TypeEnum("SCHEMA_VERSION");

        /**
         * Enum CONNECTION for value: "CONNECTION"
         */
        public static final TypeEnum CONNECTION = new TypeEnum("CONNECTION");

        /**
         * Enum PRIVATE_ENDPOINT for value: "PRIVATE_ENDPOINT"
         */
        public static final TypeEnum PRIVATE_ENDPOINT = new TypeEnum("PRIVATE_ENDPOINT");

        /**
         * Enum SOURCE_RABBITMQ for value: "SOURCE_RABBITMQ"
         */
        public static final TypeEnum SOURCE_RABBITMQ = new TypeEnum("SOURCE_RABBITMQ");

        /**
         * Enum SOURCE_ROCKETMQ for value: "SOURCE_ROCKETMQ"
         */
        public static final TypeEnum SOURCE_ROCKETMQ = new TypeEnum("SOURCE_ROCKETMQ");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("CHANNEL", CHANNEL);
            map.put("CHANNEL_SUBSCRIPTION", CHANNEL_SUBSCRIPTION);
            map.put("SOURCE", SOURCE);
            map.put("SUBSCRIPTION", SUBSCRIPTION);
            map.put("SUBSCRIPTION_TARGET", SUBSCRIPTION_TARGET);
            map.put("SCHEMA", SCHEMA);
            map.put("SCHEMA_VERSION", SCHEMA_VERSION);
            map.put("CONNECTION", CONNECTION);
            map.put("PRIVATE_ENDPOINT", PRIVATE_ENDPOINT);
            map.put("SOURCE_RABBITMQ", SOURCE_RABBITMQ);
            map.put("SOURCE_ROCKETMQ", SOURCE_ROCKETMQ);
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
    @JsonProperty(value = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    public QuotaItemInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QuotaItemInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 配额类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public QuotaItemInfo withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 配额最大值
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public QuotaItemInfo withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 配额最小值
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public QuotaItemInfo withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 当前租户的配额
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public QuotaItemInfo withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * 当前租户已使用的配额
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaItemInfo quotaItemInfo = (QuotaItemInfo) o;
        return Objects.equals(this.name, quotaItemInfo.name) && Objects.equals(this.type, quotaItemInfo.type)
            && Objects.equals(this.max, quotaItemInfo.max) && Objects.equals(this.min, quotaItemInfo.min)
            && Objects.equals(this.quota, quotaItemInfo.quota) && Objects.equals(this.used, quotaItemInfo.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, max, min, quota, used);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaItemInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
