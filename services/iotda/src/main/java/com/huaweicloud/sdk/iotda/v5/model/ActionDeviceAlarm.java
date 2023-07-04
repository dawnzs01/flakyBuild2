package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 上报设备告警消息结构
 */
public class ActionDeviceAlarm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_status")

    private String alarmStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension")

    private String dimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ActionDeviceAlarm withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数说明**：告警名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionDeviceAlarm withAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }

    /**
     * **参数说明**：告警状态。 **取值范围**： - fault：上报告警。 - recovery：恢复告警。
     * @return alarmStatus
     */
    public String getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public ActionDeviceAlarm withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数说明**：告警级别。 **取值范围**：warning（警告）、minor（一般）、major（严重）和critical（致命）。
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ActionDeviceAlarm withDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * **参数说明**：告警维度，与告警名称和告警级别组合起来共同标识一条告警，默认不携带该字段为用户维度告警，支持设备维度和资源空间维度告警。 **取值范围**： - device：设备维度。 - app：资源空间维度。
     * @return dimension
     */
    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public ActionDeviceAlarm withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：告警的描述信息。
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
        ActionDeviceAlarm actionDeviceAlarm = (ActionDeviceAlarm) o;
        return Objects.equals(this.name, actionDeviceAlarm.name)
            && Objects.equals(this.alarmStatus, actionDeviceAlarm.alarmStatus)
            && Objects.equals(this.severity, actionDeviceAlarm.severity)
            && Objects.equals(this.dimension, actionDeviceAlarm.dimension)
            && Objects.equals(this.description, actionDeviceAlarm.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, alarmStatus, severity, dimension, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionDeviceAlarm {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    alarmStatus: ").append(toIndentedString(alarmStatus)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
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
