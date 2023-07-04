package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ThrottleForApi
 */
public class ThrottleForApi {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_call_limits")

    private Integer appCallLimits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 流控的时间单位
     */
    public static final class TimeUnitEnum {

        /**
         * Enum SECOND for value: "SECOND"
         */
        public static final TimeUnitEnum SECOND = new TimeUnitEnum("SECOND");

        /**
         * Enum MINUTE for value: "MINUTE"
         */
        public static final TimeUnitEnum MINUTE = new TimeUnitEnum("MINUTE");

        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final TimeUnitEnum HOUR = new TimeUnitEnum("HOUR");

        /**
         * Enum DAY for value: "DAY"
         */
        public static final TimeUnitEnum DAY = new TimeUnitEnum("DAY");

        private static final Map<String, TimeUnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TimeUnitEnum> createStaticFields() {
            Map<String, TimeUnitEnum> map = new HashMap<>();
            map.put("SECOND", SECOND);
            map.put("MINUTE", MINUTE);
            map.put("HOUR", HOUR);
            map.put("DAY", DAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TimeUnitEnum(String value) {
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
        public static TimeUnitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TimeUnitEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TimeUnitEnum(value);
            }
            return result;
        }

        public static TimeUnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TimeUnitEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TimeUnitEnum) {
                return this.value.equals(((TimeUnitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_unit")

    private TimeUnitEnum timeUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_call_limits")

    private Integer apiCallLimits;

    /**
     * 流控策略的类型 - 1：基础，表示绑定到流控策略的单个API流控时间内能够被调用多少次。 - 2：共享，表示绑定到流控策略的所有API流控时间内能够被调用多少次。
     */
    public static final class TypeEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final TypeEnum NUMBER_1 = new TypeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final TypeEnum NUMBER_2 = new TypeEnum(2);

        private static final Map<Integer, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TypeEnum> createStaticFields() {
            Map<Integer, TypeEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(Integer value) {
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
    @JsonProperty(value = "enable_adaptive_control")

    private String enableAdaptiveControl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_call_limits")

    private Integer userCallLimits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_interval")

    private Integer timeInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_call_limits")

    private Integer ipCallLimits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_num")

    private Integer bindNum;

    /**
     * 是否包含特殊流控配置 - 1：包含 - 2：不包含
     */
    public static final class IsIncluSpecialThrottleEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final IsIncluSpecialThrottleEnum NUMBER_1 = new IsIncluSpecialThrottleEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final IsIncluSpecialThrottleEnum NUMBER_2 = new IsIncluSpecialThrottleEnum(2);

        private static final Map<Integer, IsIncluSpecialThrottleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IsIncluSpecialThrottleEnum> createStaticFields() {
            Map<Integer, IsIncluSpecialThrottleEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IsIncluSpecialThrottleEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsIncluSpecialThrottleEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            IsIncluSpecialThrottleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IsIncluSpecialThrottleEnum(value);
            }
            return result;
        }

        public static IsIncluSpecialThrottleEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            IsIncluSpecialThrottleEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsIncluSpecialThrottleEnum) {
                return this.value.equals(((IsIncluSpecialThrottleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_inclu_special_throttle")

    private IsIncluSpecialThrottleEnum isIncluSpecialThrottle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_name")

    private String envName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_id")

    private String bindId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_time")

    private OffsetDateTime bindTime;

    public ThrottleForApi withAppCallLimits(Integer appCallLimits) {
        this.appCallLimits = appCallLimits;
        return this;
    }

    /**
     * APP流量限制是指一个API在时长之内被每个APP访问的次数上限，该数值不超过用户流量限制值。输入的值不超过2147483647。正整数。 
     * @return appCallLimits
     */
    public Integer getAppCallLimits() {
        return appCallLimits;
    }

    public void setAppCallLimits(Integer appCallLimits) {
        this.appCallLimits = appCallLimits;
    }

    public ThrottleForApi withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 流控策略名称。支持汉字，英文，数字，下划线，且只能以英文和汉字开头，3 ~ 64字符。 > 中文字符必须为UTF-8或者unicode编码。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ThrottleForApi withTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * 流控的时间单位
     * @return timeUnit
     */
    public TimeUnitEnum getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
    }

    public ThrottleForApi withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 流控策略描述字符长度不超过255。 > 中文字符必须为UTF-8或者unicode编码。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public ThrottleForApi withApiCallLimits(Integer apiCallLimits) {
        this.apiCallLimits = apiCallLimits;
        return this;
    }

    /**
     * API流量限制是指时长内一个API能够被访问的次数上限。该值不超过系统默认配额限制，系统默认配额为200tps，用户可根据实际情况修改该系统默认配额。输入的值不超过2147483647。正整数。 
     * @return apiCallLimits
     */
    public Integer getApiCallLimits() {
        return apiCallLimits;
    }

    public void setApiCallLimits(Integer apiCallLimits) {
        this.apiCallLimits = apiCallLimits;
    }

    public ThrottleForApi withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 流控策略的类型 - 1：基础，表示绑定到流控策略的单个API流控时间内能够被调用多少次。 - 2：共享，表示绑定到流控策略的所有API流控时间内能够被调用多少次。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ThrottleForApi withEnableAdaptiveControl(String enableAdaptiveControl) {
        this.enableAdaptiveControl = enableAdaptiveControl;
        return this;
    }

    /**
     * 是否开启动态流控： - TRUE - FALSE  暂不支持
     * @return enableAdaptiveControl
     */
    public String getEnableAdaptiveControl() {
        return enableAdaptiveControl;
    }

    public void setEnableAdaptiveControl(String enableAdaptiveControl) {
        this.enableAdaptiveControl = enableAdaptiveControl;
    }

    public ThrottleForApi withUserCallLimits(Integer userCallLimits) {
        this.userCallLimits = userCallLimits;
        return this;
    }

    /**
     * 用户流量限制是指一个API在时长之内每一个用户能访问的次数上限，该数值不超过API流量限制值。输入的值不超过2147483647。正整数。
     * @return userCallLimits
     */
    public Integer getUserCallLimits() {
        return userCallLimits;
    }

    public void setUserCallLimits(Integer userCallLimits) {
        this.userCallLimits = userCallLimits;
    }

    public ThrottleForApi withTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /**
     * 流量控制的时长单位。与“流量限制次数”配合使用，表示单位时间内的API请求次数上限。输入的值不超过2147483647。正整数。
     * @return timeInterval
     */
    public Integer getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
    }

    public ThrottleForApi withIpCallLimits(Integer ipCallLimits) {
        this.ipCallLimits = ipCallLimits;
        return this;
    }

    /**
     * 源IP流量限制是指一个API在时长之内被每个IP访问的次数上限，该数值不超过API流量限制值。输入的值不超过2147483647。正整数。
     * @return ipCallLimits
     */
    public Integer getIpCallLimits() {
        return ipCallLimits;
    }

    public void setIpCallLimits(Integer ipCallLimits) {
        this.ipCallLimits = ipCallLimits;
    }

    public ThrottleForApi withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 流控策略的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ThrottleForApi withBindNum(Integer bindNum) {
        this.bindNum = bindNum;
        return this;
    }

    /**
     * 流控绑定的API数量
     * @return bindNum
     */
    public Integer getBindNum() {
        return bindNum;
    }

    public void setBindNum(Integer bindNum) {
        this.bindNum = bindNum;
    }

    public ThrottleForApi withIsIncluSpecialThrottle(IsIncluSpecialThrottleEnum isIncluSpecialThrottle) {
        this.isIncluSpecialThrottle = isIncluSpecialThrottle;
        return this;
    }

    /**
     * 是否包含特殊流控配置 - 1：包含 - 2：不包含
     * @return isIncluSpecialThrottle
     */
    public IsIncluSpecialThrottleEnum getIsIncluSpecialThrottle() {
        return isIncluSpecialThrottle;
    }

    public void setIsIncluSpecialThrottle(IsIncluSpecialThrottleEnum isIncluSpecialThrottle) {
        this.isIncluSpecialThrottle = isIncluSpecialThrottle;
    }

    public ThrottleForApi withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ThrottleForApi withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    /**
     * 流控策略生效的环境（即在哪个环境上有效）
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public ThrottleForApi withBindId(String bindId) {
        this.bindId = bindId;
        return this;
    }

    /**
     * 流控策略与API绑定关系编号
     * @return bindId
     */
    public String getBindId() {
        return bindId;
    }

    public void setBindId(String bindId) {
        this.bindId = bindId;
    }

    public ThrottleForApi withBindTime(OffsetDateTime bindTime) {
        this.bindTime = bindTime;
        return this;
    }

    /**
     * 流控策略与API绑定时间
     * @return bindTime
     */
    public OffsetDateTime getBindTime() {
        return bindTime;
    }

    public void setBindTime(OffsetDateTime bindTime) {
        this.bindTime = bindTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThrottleForApi throttleForApi = (ThrottleForApi) o;
        return Objects.equals(this.appCallLimits, throttleForApi.appCallLimits)
            && Objects.equals(this.name, throttleForApi.name) && Objects.equals(this.timeUnit, throttleForApi.timeUnit)
            && Objects.equals(this.remark, throttleForApi.remark)
            && Objects.equals(this.apiCallLimits, throttleForApi.apiCallLimits)
            && Objects.equals(this.type, throttleForApi.type)
            && Objects.equals(this.enableAdaptiveControl, throttleForApi.enableAdaptiveControl)
            && Objects.equals(this.userCallLimits, throttleForApi.userCallLimits)
            && Objects.equals(this.timeInterval, throttleForApi.timeInterval)
            && Objects.equals(this.ipCallLimits, throttleForApi.ipCallLimits)
            && Objects.equals(this.id, throttleForApi.id) && Objects.equals(this.bindNum, throttleForApi.bindNum)
            && Objects.equals(this.isIncluSpecialThrottle, throttleForApi.isIncluSpecialThrottle)
            && Objects.equals(this.createTime, throttleForApi.createTime)
            && Objects.equals(this.envName, throttleForApi.envName)
            && Objects.equals(this.bindId, throttleForApi.bindId)
            && Objects.equals(this.bindTime, throttleForApi.bindTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appCallLimits,
            name,
            timeUnit,
            remark,
            apiCallLimits,
            type,
            enableAdaptiveControl,
            userCallLimits,
            timeInterval,
            ipCallLimits,
            id,
            bindNum,
            isIncluSpecialThrottle,
            createTime,
            envName,
            bindId,
            bindTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThrottleForApi {\n");
        sb.append("    appCallLimits: ").append(toIndentedString(appCallLimits)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    apiCallLimits: ").append(toIndentedString(apiCallLimits)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enableAdaptiveControl: ").append(toIndentedString(enableAdaptiveControl)).append("\n");
        sb.append("    userCallLimits: ").append(toIndentedString(userCallLimits)).append("\n");
        sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
        sb.append("    ipCallLimits: ").append(toIndentedString(ipCallLimits)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    bindNum: ").append(toIndentedString(bindNum)).append("\n");
        sb.append("    isIncluSpecialThrottle: ").append(toIndentedString(isIncluSpecialThrottle)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    bindId: ").append(toIndentedString(bindId)).append("\n");
        sb.append("    bindTime: ").append(toIndentedString(bindTime)).append("\n");
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
