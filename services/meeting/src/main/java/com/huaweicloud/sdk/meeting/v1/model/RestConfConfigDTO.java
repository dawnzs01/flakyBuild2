package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 会议其他配置信息。
 */
public class RestConfConfigDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSendNotify")

    private Boolean isSendNotify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSendSms")

    private Boolean isSendSms;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSendCalendar")

    private Boolean isSendCalendar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoMute")

    private Boolean isAutoMute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isHardTerminalAutoMute")

    private Boolean isHardTerminalAutoMute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isGuestFreePwd")

    private Boolean isGuestFreePwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callInRestriction")

    private Integer callInRestriction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowGuestStartConf")

    private Boolean allowGuestStartConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guestPwd")

    private String guestPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrIDType")

    private Integer vmrIDType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prolongLength")

    private Integer prolongLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableWaitingRoom")

    private Boolean enableWaitingRoom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isHostCameraOn")

    private Boolean isHostCameraOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isGuestCameraOn")

    private Boolean isGuestCameraOn;

    public RestConfConfigDTO withIsSendNotify(Boolean isSendNotify) {
        this.isSendNotify = isSendNotify;
        return this;
    }

    /**
     * 是否需要发送会议邮件通知。默认值由企业级配置决定。 - true: 需要 - false: 不需要
     * @return isSendNotify
     */
    public Boolean getIsSendNotify() {
        return isSendNotify;
    }

    public void setIsSendNotify(Boolean isSendNotify) {
        this.isSendNotify = isSendNotify;
    }

    public RestConfConfigDTO withIsSendSms(Boolean isSendSms) {
        this.isSendSms = isSendSms;
        return this;
    }

    /**
     * 是否需要发送会议短信通知。默认值由企业级配置决定。 - true: 需要 - false: 不需要 > 只有正式商用企业才有发送会议短信通知的权限，免费企业即使isSendSms设置成true也不会发送会议短信通知。
     * @return isSendSms
     */
    public Boolean getIsSendSms() {
        return isSendSms;
    }

    public void setIsSendSms(Boolean isSendSms) {
        this.isSendSms = isSendSms;
    }

    public RestConfConfigDTO withIsSendCalendar(Boolean isSendCalendar) {
        this.isSendCalendar = isSendCalendar;
        return this;
    }

    /**
     * 是否需要发送会议邮件日历通知。默认值由企业级配置决定。 - true: 需要 - false: 不需要
     * @return isSendCalendar
     */
    public Boolean getIsSendCalendar() {
        return isSendCalendar;
    }

    public void setIsSendCalendar(Boolean isSendCalendar) {
        this.isSendCalendar = isSendCalendar;
    }

    public RestConfConfigDTO withIsAutoMute(Boolean isAutoMute) {
        this.isAutoMute = isAutoMute;
        return this;
    }

    /**
     * 来宾入会,软终端是否自动静音。默认值由企业级配置决定。 - true: 自动静音 - false: 不自动静音
     * @return isAutoMute
     */
    public Boolean getIsAutoMute() {
        return isAutoMute;
    }

    public void setIsAutoMute(Boolean isAutoMute) {
        this.isAutoMute = isAutoMute;
    }

    public RestConfConfigDTO withIsHardTerminalAutoMute(Boolean isHardTerminalAutoMute) {
        this.isHardTerminalAutoMute = isHardTerminalAutoMute;
        return this;
    }

    /**
     * 来宾入会,硬终端是否自动静音。默认值由企业级配置决定。 - true: 自动静音 - false: 不自动静音
     * @return isHardTerminalAutoMute
     */
    public Boolean getIsHardTerminalAutoMute() {
        return isHardTerminalAutoMute;
    }

    public void setIsHardTerminalAutoMute(Boolean isHardTerminalAutoMute) {
        this.isHardTerminalAutoMute = isHardTerminalAutoMute;
    }

    public RestConfConfigDTO withIsGuestFreePwd(Boolean isGuestFreePwd) {
        this.isGuestFreePwd = isGuestFreePwd;
        return this;
    }

    /**
     * 是否来宾免密。 - true: 免密 - false: 需要密码 > 仅随机会议ID的会议生效。
     * @return isGuestFreePwd
     */
    public Boolean getIsGuestFreePwd() {
        return isGuestFreePwd;
    }

    public void setIsGuestFreePwd(Boolean isGuestFreePwd) {
        this.isGuestFreePwd = isGuestFreePwd;
    }

    public RestConfConfigDTO withCallInRestriction(Integer callInRestriction) {
        this.callInRestriction = callInRestriction;
        return this;
    }

    /**
     * 允许加入会议的范围。 - 0: 所有用户 - 2: 企业内用户 - 3: 被邀请用户
     * @return callInRestriction
     */
    public Integer getCallInRestriction() {
        return callInRestriction;
    }

    public void setCallInRestriction(Integer callInRestriction) {
        this.callInRestriction = callInRestriction;
    }

    public RestConfConfigDTO withAllowGuestStartConf(Boolean allowGuestStartConf) {
        this.allowGuestStartConf = allowGuestStartConf;
        return this;
    }

    /**
     * 是否允许来宾启动会议。 - true: 允许来宾启动会议 - false: 禁止来宾启动会议 > 仅随机会议ID的会议生效。
     * @return allowGuestStartConf
     */
    public Boolean getAllowGuestStartConf() {
        return allowGuestStartConf;
    }

    public void setAllowGuestStartConf(Boolean allowGuestStartConf) {
        this.allowGuestStartConf = allowGuestStartConf;
    }

    public RestConfConfigDTO withGuestPwd(String guestPwd) {
        this.guestPwd = guestPwd;
        return this;
    }

    /**
     * 来宾密码（4-16位长度的纯数字）。
     * @return guestPwd
     */
    public String getGuestPwd() {
        return guestPwd;
    }

    public void setGuestPwd(String guestPwd) {
        this.guestPwd = guestPwd;
    }

    public RestConfConfigDTO withVmrIDType(Integer vmrIDType) {
        this.vmrIDType = vmrIDType;
        return this;
    }

    /**
     * 云会议室的会议ID模式。 * 0：固定会议ID * 1：随机会议ID
     * minimum: 0
     * maximum: 1
     * @return vmrIDType
     */
    public Integer getVmrIDType() {
        return vmrIDType;
    }

    public void setVmrIDType(Integer vmrIDType) {
        this.vmrIDType = vmrIDType;
    }

    public RestConfConfigDTO withProlongLength(Integer prolongLength) {
        this.prolongLength = prolongLength;
        return this;
    }

    /**
     * 自动延长会议时长（取值范围0-60）。 * 0：表示会议到点自动结束，不延长会议 * 其他：表示自动延长的时长 > * 自动结束会议是按照会议时长计算。比如预定的会议是9:00开始11:00结束，会议时长2个小时，如果与会者8:00就加入会议了，那会议在10:00就会自动结束 > * 设置成其他值时，只要会中还有与会者，会议自动多次延长
     * @return prolongLength
     */
    public Integer getProlongLength() {
        return prolongLength;
    }

    public void setProlongLength(Integer prolongLength) {
        this.prolongLength = prolongLength;
    }

    public RestConfConfigDTO withEnableWaitingRoom(Boolean enableWaitingRoom) {
        this.enableWaitingRoom = enableWaitingRoom;
        return this;
    }

    /**
     * 开启或者关闭等候室。 * true：开启 * false：不开启
     * @return enableWaitingRoom
     */
    public Boolean getEnableWaitingRoom() {
        return enableWaitingRoom;
    }

    public void setEnableWaitingRoom(Boolean enableWaitingRoom) {
        this.enableWaitingRoom = enableWaitingRoom;
    }

    public RestConfConfigDTO withIsHostCameraOn(Boolean isHostCameraOn) {
        this.isHostCameraOn = isHostCameraOn;
        return this;
    }

    /**
     * 主持人入会是否开启摄像头。 * true：开启 * false：不开启
     * @return isHostCameraOn
     */
    public Boolean getIsHostCameraOn() {
        return isHostCameraOn;
    }

    public void setIsHostCameraOn(Boolean isHostCameraOn) {
        this.isHostCameraOn = isHostCameraOn;
    }

    public RestConfConfigDTO withIsGuestCameraOn(Boolean isGuestCameraOn) {
        this.isGuestCameraOn = isGuestCameraOn;
        return this;
    }

    /**
     * 来宾入会是否开启摄像头。 * true：开启 * false：不开启
     * @return isGuestCameraOn
     */
    public Boolean getIsGuestCameraOn() {
        return isGuestCameraOn;
    }

    public void setIsGuestCameraOn(Boolean isGuestCameraOn) {
        this.isGuestCameraOn = isGuestCameraOn;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestConfConfigDTO restConfConfigDTO = (RestConfConfigDTO) o;
        return Objects.equals(this.isSendNotify, restConfConfigDTO.isSendNotify)
            && Objects.equals(this.isSendSms, restConfConfigDTO.isSendSms)
            && Objects.equals(this.isSendCalendar, restConfConfigDTO.isSendCalendar)
            && Objects.equals(this.isAutoMute, restConfConfigDTO.isAutoMute)
            && Objects.equals(this.isHardTerminalAutoMute, restConfConfigDTO.isHardTerminalAutoMute)
            && Objects.equals(this.isGuestFreePwd, restConfConfigDTO.isGuestFreePwd)
            && Objects.equals(this.callInRestriction, restConfConfigDTO.callInRestriction)
            && Objects.equals(this.allowGuestStartConf, restConfConfigDTO.allowGuestStartConf)
            && Objects.equals(this.guestPwd, restConfConfigDTO.guestPwd)
            && Objects.equals(this.vmrIDType, restConfConfigDTO.vmrIDType)
            && Objects.equals(this.prolongLength, restConfConfigDTO.prolongLength)
            && Objects.equals(this.enableWaitingRoom, restConfConfigDTO.enableWaitingRoom)
            && Objects.equals(this.isHostCameraOn, restConfConfigDTO.isHostCameraOn)
            && Objects.equals(this.isGuestCameraOn, restConfConfigDTO.isGuestCameraOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSendNotify,
            isSendSms,
            isSendCalendar,
            isAutoMute,
            isHardTerminalAutoMute,
            isGuestFreePwd,
            callInRestriction,
            allowGuestStartConf,
            guestPwd,
            vmrIDType,
            prolongLength,
            enableWaitingRoom,
            isHostCameraOn,
            isGuestCameraOn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestConfConfigDTO {\n");
        sb.append("    isSendNotify: ").append(toIndentedString(isSendNotify)).append("\n");
        sb.append("    isSendSms: ").append(toIndentedString(isSendSms)).append("\n");
        sb.append("    isSendCalendar: ").append(toIndentedString(isSendCalendar)).append("\n");
        sb.append("    isAutoMute: ").append(toIndentedString(isAutoMute)).append("\n");
        sb.append("    isHardTerminalAutoMute: ").append(toIndentedString(isHardTerminalAutoMute)).append("\n");
        sb.append("    isGuestFreePwd: ").append(toIndentedString(isGuestFreePwd)).append("\n");
        sb.append("    callInRestriction: ").append(toIndentedString(callInRestriction)).append("\n");
        sb.append("    allowGuestStartConf: ").append(toIndentedString(allowGuestStartConf)).append("\n");
        sb.append("    guestPwd: ").append(toIndentedString(guestPwd)).append("\n");
        sb.append("    vmrIDType: ").append(toIndentedString(vmrIDType)).append("\n");
        sb.append("    prolongLength: ").append(toIndentedString(prolongLength)).append("\n");
        sb.append("    enableWaitingRoom: ").append(toIndentedString(enableWaitingRoom)).append("\n");
        sb.append("    isHostCameraOn: ").append(toIndentedString(isHostCameraOn)).append("\n");
        sb.append("    isGuestCameraOn: ").append(toIndentedString(isGuestCameraOn)).append("\n");
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
