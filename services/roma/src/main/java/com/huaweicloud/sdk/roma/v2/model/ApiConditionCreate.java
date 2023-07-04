package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ApiConditionCreate
 */
public class ApiConditionCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_param_name")

    private String reqParamName;

    /**
     * 系统参数名称。策略类型为system时必选。支持以下系统参数 - req_path：请求路径。如 /a/b - req_method：请求方法。如 GET 
     */
    public static final class SysParamNameEnum {

        /**
         * Enum REQ_PATH for value: "req_path"
         */
        public static final SysParamNameEnum REQ_PATH = new SysParamNameEnum("req_path");

        /**
         * Enum REQ_METHOD for value: "req_method"
         */
        public static final SysParamNameEnum REQ_METHOD = new SysParamNameEnum("req_method");

        private static final Map<String, SysParamNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SysParamNameEnum> createStaticFields() {
            Map<String, SysParamNameEnum> map = new HashMap<>();
            map.put("req_path", REQ_PATH);
            map.put("req_method", REQ_METHOD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SysParamNameEnum(String value) {
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
        public static SysParamNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SysParamNameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SysParamNameEnum(value);
            }
            return result;
        }

        public static SysParamNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SysParamNameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SysParamNameEnum) {
                return this.value.equals(((SysParamNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_param_name")

    private SysParamNameEnum sysParamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cookie_param_name")

    private String cookieParamName;

    /**
     * 策略条件 - exact：绝对匹配 - enum：枚举 - pattern：正则  策略类型为param时必选 
     */
    public static final class ConditionTypeEnum {

        /**
         * Enum EXACT for value: "exact"
         */
        public static final ConditionTypeEnum EXACT = new ConditionTypeEnum("exact");

        /**
         * Enum ENUM for value: "enum"
         */
        public static final ConditionTypeEnum ENUM = new ConditionTypeEnum("enum");

        /**
         * Enum PATTERN for value: "pattern"
         */
        public static final ConditionTypeEnum PATTERN = new ConditionTypeEnum("pattern");

        private static final Map<String, ConditionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConditionTypeEnum> createStaticFields() {
            Map<String, ConditionTypeEnum> map = new HashMap<>();
            map.put("exact", EXACT);
            map.put("enum", ENUM);
            map.put("pattern", PATTERN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConditionTypeEnum(String value) {
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
        public static ConditionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ConditionTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConditionTypeEnum(value);
            }
            return result;
        }

        public static ConditionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ConditionTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConditionTypeEnum) {
                return this.value.equals(((ConditionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_type")

    private ConditionTypeEnum conditionType;

    /**
     * 策略类型 - param：参数 - source：源IP - system：系统参数
     */
    public static final class ConditionOriginEnum {

        /**
         * Enum PARAM for value: "param"
         */
        public static final ConditionOriginEnum PARAM = new ConditionOriginEnum("param");

        /**
         * Enum SOURCE for value: "source"
         */
        public static final ConditionOriginEnum SOURCE = new ConditionOriginEnum("source");

        private static final Map<String, ConditionOriginEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConditionOriginEnum> createStaticFields() {
            Map<String, ConditionOriginEnum> map = new HashMap<>();
            map.put("param", PARAM);
            map.put("source", SOURCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConditionOriginEnum(String value) {
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
        public static ConditionOriginEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ConditionOriginEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConditionOriginEnum(value);
            }
            return result;
        }

        public static ConditionOriginEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ConditionOriginEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConditionOriginEnum) {
                return this.value.equals(((ConditionOriginEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_origin")

    private ConditionOriginEnum conditionOrigin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_value")

    private String conditionValue;

    public ApiConditionCreate withReqParamName(String reqParamName) {
        this.reqParamName = reqParamName;
        return this;
    }

    /**
     * 关联的请求参数对象名称。策略类型为param时必选
     * @return reqParamName
     */
    public String getReqParamName() {
        return reqParamName;
    }

    public void setReqParamName(String reqParamName) {
        this.reqParamName = reqParamName;
    }

    public ApiConditionCreate withSysParamName(SysParamNameEnum sysParamName) {
        this.sysParamName = sysParamName;
        return this;
    }

    /**
     * 系统参数名称。策略类型为system时必选。支持以下系统参数 - req_path：请求路径。如 /a/b - req_method：请求方法。如 GET 
     * @return sysParamName
     */
    public SysParamNameEnum getSysParamName() {
        return sysParamName;
    }

    public void setSysParamName(SysParamNameEnum sysParamName) {
        this.sysParamName = sysParamName;
    }

    public ApiConditionCreate withCookieParamName(String cookieParamName) {
        this.cookieParamName = cookieParamName;
        return this;
    }

    /**
     * COOKIE参数名称;策略类型为cookie时必选
     * @return cookieParamName
     */
    public String getCookieParamName() {
        return cookieParamName;
    }

    public void setCookieParamName(String cookieParamName) {
        this.cookieParamName = cookieParamName;
    }

    public ApiConditionCreate withConditionType(ConditionTypeEnum conditionType) {
        this.conditionType = conditionType;
        return this;
    }

    /**
     * 策略条件 - exact：绝对匹配 - enum：枚举 - pattern：正则  策略类型为param时必选 
     * @return conditionType
     */
    public ConditionTypeEnum getConditionType() {
        return conditionType;
    }

    public void setConditionType(ConditionTypeEnum conditionType) {
        this.conditionType = conditionType;
    }

    public ApiConditionCreate withConditionOrigin(ConditionOriginEnum conditionOrigin) {
        this.conditionOrigin = conditionOrigin;
        return this;
    }

    /**
     * 策略类型 - param：参数 - source：源IP - system：系统参数
     * @return conditionOrigin
     */
    public ConditionOriginEnum getConditionOrigin() {
        return conditionOrigin;
    }

    public void setConditionOrigin(ConditionOriginEnum conditionOrigin) {
        this.conditionOrigin = conditionOrigin;
    }

    public ApiConditionCreate withConditionValue(String conditionValue) {
        this.conditionValue = conditionValue;
        return this;
    }

    /**
     * 策略值
     * @return conditionValue
     */
    public String getConditionValue() {
        return conditionValue;
    }

    public void setConditionValue(String conditionValue) {
        this.conditionValue = conditionValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiConditionCreate apiConditionCreate = (ApiConditionCreate) o;
        return Objects.equals(this.reqParamName, apiConditionCreate.reqParamName)
            && Objects.equals(this.sysParamName, apiConditionCreate.sysParamName)
            && Objects.equals(this.cookieParamName, apiConditionCreate.cookieParamName)
            && Objects.equals(this.conditionType, apiConditionCreate.conditionType)
            && Objects.equals(this.conditionOrigin, apiConditionCreate.conditionOrigin)
            && Objects.equals(this.conditionValue, apiConditionCreate.conditionValue);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(reqParamName, sysParamName, cookieParamName, conditionType, conditionOrigin, conditionValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiConditionCreate {\n");
        sb.append("    reqParamName: ").append(toIndentedString(reqParamName)).append("\n");
        sb.append("    sysParamName: ").append(toIndentedString(sysParamName)).append("\n");
        sb.append("    cookieParamName: ").append(toIndentedString(cookieParamName)).append("\n");
        sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
        sb.append("    conditionOrigin: ").append(toIndentedString(conditionOrigin)).append("\n");
        sb.append("    conditionValue: ").append(toIndentedString(conditionValue)).append("\n");
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
