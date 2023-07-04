package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 定时、周期任务策略
 */
public class ScheduledPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launch_time")

    private String launchTime;

    /**
     * 周期触发类型，scaling_policy_type为RECURRENCE时该项必选。Daily：每天执行一次。Weekly：每周指定天执行一次。Monthly：每月指定天执行一次。
     */
    public static final class RecurrenceTypeEnum {

        /**
         * Enum DAILY for value: "Daily"
         */
        public static final RecurrenceTypeEnum DAILY = new RecurrenceTypeEnum("Daily");

        /**
         * Enum WEEKLY for value: "Weekly"
         */
        public static final RecurrenceTypeEnum WEEKLY = new RecurrenceTypeEnum("Weekly");

        /**
         * Enum MONTHLY for value: "Monthly"
         */
        public static final RecurrenceTypeEnum MONTHLY = new RecurrenceTypeEnum("Monthly");

        private static final Map<String, RecurrenceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecurrenceTypeEnum> createStaticFields() {
            Map<String, RecurrenceTypeEnum> map = new HashMap<>();
            map.put("Daily", DAILY);
            map.put("Weekly", WEEKLY);
            map.put("Monthly", MONTHLY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecurrenceTypeEnum(String value) {
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
        public static RecurrenceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RecurrenceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RecurrenceTypeEnum(value);
            }
            return result;
        }

        public static RecurrenceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RecurrenceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RecurrenceTypeEnum) {
                return this.value.equals(((RecurrenceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recurrence_type")

    private RecurrenceTypeEnum recurrenceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recurrence_value")

    private String recurrenceValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ScheduledPolicy withLaunchTime(String launchTime) {
        this.launchTime = launchTime;
        return this;
    }

    /**
     * 触发时间，遵循UTC时间。如果scaling_policy_type为SCHEDULED，则格式为：YYYY-MM-DDThh:mmZ。如果scaling_policy_type为RECURRENCE，则格式为：hh:mm。
     * @return launchTime
     */
    public String getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
    }

    public ScheduledPolicy withRecurrenceType(RecurrenceTypeEnum recurrenceType) {
        this.recurrenceType = recurrenceType;
        return this;
    }

    /**
     * 周期触发类型，scaling_policy_type为RECURRENCE时该项必选。Daily：每天执行一次。Weekly：每周指定天执行一次。Monthly：每月指定天执行一次。
     * @return recurrenceType
     */
    public RecurrenceTypeEnum getRecurrenceType() {
        return recurrenceType;
    }

    public void setRecurrenceType(RecurrenceTypeEnum recurrenceType) {
        this.recurrenceType = recurrenceType;
    }

    public ScheduledPolicy withRecurrenceValue(String recurrenceValue) {
        this.recurrenceValue = recurrenceValue;
        return this;
    }

    /**
     * 周期触发任务数值，scaling_policy_type为RECURRENCE时该项必选。类型为Daily时，该字段为null，表示每天执行类型为Weekly时，该字段取值范围为1-7，1表示星期日，以此类推，以”,”分割，例如：1,3,5。类型为Monthly时，该字段取值范围为1-31，分别表示每月的日期，以“,”分割，例如：1,10,13,28。 说明： - 当recurrence_type类型为Daily时，recurrence_value参数不生效。
     * @return recurrenceValue
     */
    public String getRecurrenceValue() {
        return recurrenceValue;
    }

    public void setRecurrenceValue(String recurrenceValue) {
        this.recurrenceValue = recurrenceValue;
    }

    public ScheduledPolicy withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 周期策略重复执行开始时间，遵循UTC时间。默认为当前时间，格式为：YYYY-MM-DDThh：mZ
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ScheduledPolicy withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 周期策略重复执行结束时间，遵循UTC时间，scaling_policy_type为RECURRENCE时该项必选。当为周期类型策略时，不得早于当前时间和开始时间。格式为：YYYY-MM-DDThh：mmZ
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScheduledPolicy scheduledPolicy = (ScheduledPolicy) o;
        return Objects.equals(this.launchTime, scheduledPolicy.launchTime)
            && Objects.equals(this.recurrenceType, scheduledPolicy.recurrenceType)
            && Objects.equals(this.recurrenceValue, scheduledPolicy.recurrenceValue)
            && Objects.equals(this.startTime, scheduledPolicy.startTime)
            && Objects.equals(this.endTime, scheduledPolicy.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(launchTime, recurrenceType, recurrenceValue, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduledPolicy {\n");
        sb.append("    launchTime: ").append(toIndentedString(launchTime)).append("\n");
        sb.append("    recurrenceType: ").append(toIndentedString(recurrenceType)).append("\n");
        sb.append("    recurrenceValue: ").append(toIndentedString(recurrenceValue)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
