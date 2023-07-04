package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 规则动作结构体
 */
public class RuleAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_command")

    private ActionDeviceCommand deviceCommand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_forwarding")

    private ActionSmnForwarding smnForwarding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_alarm")

    private ActionDeviceAlarm deviceAlarm;

    public RuleAction withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数说明**：规则动作的类型，端侧执行只支持下发设备命令消息类型。 **取值范围**： - DEVICE_CMD：下发设备命令消息类型。 - SMN_FORWARDING：发送SMN消息类型。 - DEVICE_ALARM：上报设备告警消息类型。当选择该类型时，condition中必须有DEVICE_DATA条件类型。该类型动作只能唯一。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RuleAction withDeviceCommand(ActionDeviceCommand deviceCommand) {
        this.deviceCommand = deviceCommand;
        return this;
    }

    public RuleAction withDeviceCommand(Consumer<ActionDeviceCommand> deviceCommandSetter) {
        if (this.deviceCommand == null) {
            this.deviceCommand = new ActionDeviceCommand();
            deviceCommandSetter.accept(this.deviceCommand);
        }

        return this;
    }

    /**
     * Get deviceCommand
     * @return deviceCommand
     */
    public ActionDeviceCommand getDeviceCommand() {
        return deviceCommand;
    }

    public void setDeviceCommand(ActionDeviceCommand deviceCommand) {
        this.deviceCommand = deviceCommand;
    }

    public RuleAction withSmnForwarding(ActionSmnForwarding smnForwarding) {
        this.smnForwarding = smnForwarding;
        return this;
    }

    public RuleAction withSmnForwarding(Consumer<ActionSmnForwarding> smnForwardingSetter) {
        if (this.smnForwarding == null) {
            this.smnForwarding = new ActionSmnForwarding();
            smnForwardingSetter.accept(this.smnForwarding);
        }

        return this;
    }

    /**
     * Get smnForwarding
     * @return smnForwarding
     */
    public ActionSmnForwarding getSmnForwarding() {
        return smnForwarding;
    }

    public void setSmnForwarding(ActionSmnForwarding smnForwarding) {
        this.smnForwarding = smnForwarding;
    }

    public RuleAction withDeviceAlarm(ActionDeviceAlarm deviceAlarm) {
        this.deviceAlarm = deviceAlarm;
        return this;
    }

    public RuleAction withDeviceAlarm(Consumer<ActionDeviceAlarm> deviceAlarmSetter) {
        if (this.deviceAlarm == null) {
            this.deviceAlarm = new ActionDeviceAlarm();
            deviceAlarmSetter.accept(this.deviceAlarm);
        }

        return this;
    }

    /**
     * Get deviceAlarm
     * @return deviceAlarm
     */
    public ActionDeviceAlarm getDeviceAlarm() {
        return deviceAlarm;
    }

    public void setDeviceAlarm(ActionDeviceAlarm deviceAlarm) {
        this.deviceAlarm = deviceAlarm;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleAction ruleAction = (RuleAction) o;
        return Objects.equals(this.type, ruleAction.type)
            && Objects.equals(this.deviceCommand, ruleAction.deviceCommand)
            && Objects.equals(this.smnForwarding, ruleAction.smnForwarding)
            && Objects.equals(this.deviceAlarm, ruleAction.deviceAlarm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, deviceCommand, smnForwarding, deviceAlarm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleAction {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    deviceCommand: ").append(toIndentedString(deviceCommand)).append("\n");
        sb.append("    smnForwarding: ").append(toIndentedString(smnForwarding)).append("\n");
        sb.append("    deviceAlarm: ").append(toIndentedString(deviceAlarm)).append("\n");
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
