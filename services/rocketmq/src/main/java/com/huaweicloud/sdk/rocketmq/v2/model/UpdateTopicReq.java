package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateTopicReq
 */
public class UpdateTopicReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_queue_num")

    private BigDecimal readQueueNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "write_queue_num")

    private BigDecimal writeQueueNum;

    /**
     * 权限。
     */
    public static final class PermissionEnum {

        /**
         * Enum SUB for value: "sub"
         */
        public static final PermissionEnum SUB = new PermissionEnum("sub");

        /**
         * Enum PUB for value: "pub"
         */
        public static final PermissionEnum PUB = new PermissionEnum("pub");

        /**
         * Enum ALL for value: "all"
         */
        public static final PermissionEnum ALL = new PermissionEnum("all");

        private static final Map<String, PermissionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionEnum> createStaticFields() {
            Map<String, PermissionEnum> map = new HashMap<>();
            map.put("sub", SUB);
            map.put("pub", PUB);
            map.put("all", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionEnum(String value) {
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
        public static PermissionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PermissionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PermissionEnum(value);
            }
            return result;
        }

        public static PermissionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PermissionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionEnum) {
                return this.value.equals(((PermissionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private PermissionEnum permission;

    public UpdateTopicReq withReadQueueNum(BigDecimal readQueueNum) {
        this.readQueueNum = readQueueNum;
        return this;
    }

    /**
     * 总读队列个数。
     * @return readQueueNum
     */
    public BigDecimal getReadQueueNum() {
        return readQueueNum;
    }

    public void setReadQueueNum(BigDecimal readQueueNum) {
        this.readQueueNum = readQueueNum;
    }

    public UpdateTopicReq withWriteQueueNum(BigDecimal writeQueueNum) {
        this.writeQueueNum = writeQueueNum;
        return this;
    }

    /**
     * 总写队列个数。
     * @return writeQueueNum
     */
    public BigDecimal getWriteQueueNum() {
        return writeQueueNum;
    }

    public void setWriteQueueNum(BigDecimal writeQueueNum) {
        this.writeQueueNum = writeQueueNum;
    }

    public UpdateTopicReq withPermission(PermissionEnum permission) {
        this.permission = permission;
        return this;
    }

    /**
     * 权限。
     * @return permission
     */
    public PermissionEnum getPermission() {
        return permission;
    }

    public void setPermission(PermissionEnum permission) {
        this.permission = permission;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTopicReq updateTopicReq = (UpdateTopicReq) o;
        return Objects.equals(this.readQueueNum, updateTopicReq.readQueueNum)
            && Objects.equals(this.writeQueueNum, updateTopicReq.writeQueueNum)
            && Objects.equals(this.permission, updateTopicReq.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readQueueNum, writeQueueNum, permission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTopicReq {\n");
        sb.append("    readQueueNum: ").append(toIndentedString(readQueueNum)).append("\n");
        sb.append("    writeQueueNum: ").append(toIndentedString(writeQueueNum)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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
