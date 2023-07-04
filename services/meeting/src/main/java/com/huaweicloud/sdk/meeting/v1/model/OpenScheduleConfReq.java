package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建网络研讨会请求。
 */
public class OpenScheduleConfReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeZoneId")

    private Integer timeZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attendees")

    private List<OpenAttendeeEntity> attendees = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notifySetting")

    private OpenNotifySetting notifySetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrID")

    private String vmrID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guestPasswd")

    private String guestPasswd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audiencePasswd")

    private String audiencePasswd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callRestriction")

    private Boolean callRestriction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private Integer scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audienceScope")

    private Integer audienceScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableRecording")

    private YesNoEnum enableRecording;

    public OpenScheduleConfReq withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 网络研讨会主题。长度限制为128个字符。
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public OpenScheduleConfReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 网络研讨会描述，长度限制为1000个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OpenScheduleConfReq withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 网络研讨会开始时间（UTC时间），格式“yyyy-MM-dd HH:mm”。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public OpenScheduleConfReq withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 网络研讨会持续时长，单位分钟，取值范围[15,1440]。
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public OpenScheduleConfReq withTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
        return this;
    }

    /**
     * 会议通知中会议时间的时区信息。时区信息，参考[[时区映射关系](https://support.huaweicloud.com/api-meeting/meeting_21_0110.html#ZH-CN_TOPIC_0212714472__table137407441463)](tag:hws)[[时区映射关系](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0110.html#ZH-CN_TOPIC_0212714472__table137407441463)](tag:hk)。 > * 举例：“timeZoneID”:\"26\"，则通过华为云会议发送的会议通知中的时间将会标记为如“2021/11/11 星期四 00:00 - 02:00 (GMT) 格林威治标准时间:都柏林, 爱丁堡, 里斯本, 伦敦”。 
     * @return timeZoneId
     */
    public Integer getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    public OpenScheduleConfReq withAttendees(List<OpenAttendeeEntity> attendees) {
        this.attendees = attendees;
        return this;
    }

    public OpenScheduleConfReq addAttendeesItem(OpenAttendeeEntity attendeesItem) {
        if (this.attendees == null) {
            this.attendees = new ArrayList<>();
        }
        this.attendees.add(attendeesItem);
        return this;
    }

    public OpenScheduleConfReq withAttendees(Consumer<List<OpenAttendeeEntity>> attendeesSetter) {
        if (this.attendees == null) {
            this.attendees = new ArrayList<>();
        }
        attendeesSetter.accept(this.attendees);
        return this;
    }

    /**
     * 与会嘉宾列表。 > 观众只能自己通过链接或者会议ID+密码加入，不支持被邀请。 
     * @return attendees
     */
    public List<OpenAttendeeEntity> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<OpenAttendeeEntity> attendees) {
        this.attendees = attendees;
    }

    public OpenScheduleConfReq withNotifySetting(OpenNotifySetting notifySetting) {
        this.notifySetting = notifySetting;
        return this;
    }

    public OpenScheduleConfReq withNotifySetting(Consumer<OpenNotifySetting> notifySettingSetter) {
        if (this.notifySetting == null) {
            this.notifySetting = new OpenNotifySetting();
            notifySettingSetter.accept(this.notifySetting);
        }

        return this;
    }

    /**
     * Get notifySetting
     * @return notifySetting
     */
    public OpenNotifySetting getNotifySetting() {
        return notifySetting;
    }

    public void setNotifySetting(OpenNotifySetting notifySetting) {
        this.notifySetting = notifySetting;
    }

    public OpenScheduleConfReq withVmrID(String vmrID) {
        this.vmrID = vmrID;
        return this;
    }

    /**
     * 绑定给当前创建网络研讨会帐号的VMR ID。通过[[查询云会议室及个人会议ID](https://support.huaweicloud.com/api-meeting/meeting_21_1106.html)](tag:hws)[[查询云会议室及个人会议ID](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_1106.html)](tag:hk)接口获取。 > * vmrID取上述查询接口中返回的id，不是vmrId。 > * 创建网络研讨会时，使用vmrMode=2的VMR。 
     * @return vmrID
     */
    public String getVmrID() {
        return vmrID;
    }

    public void setVmrID(String vmrID) {
        this.vmrID = vmrID;
    }

    public OpenScheduleConfReq withGuestPasswd(String guestPasswd) {
        this.guestPasswd = guestPasswd;
        return this;
    }

    /**
     * 嘉宾密码（4-16位长度的纯数字)。不指定则系统自动生成。
     * @return guestPasswd
     */
    public String getGuestPasswd() {
        return guestPasswd;
    }

    public void setGuestPasswd(String guestPasswd) {
        this.guestPasswd = guestPasswd;
    }

    public OpenScheduleConfReq withAudiencePasswd(String audiencePasswd) {
        this.audiencePasswd = audiencePasswd;
        return this;
    }

    /**
     * 观众密码（4-16位长度的纯数字)。不指定则系统自动生成。
     * @return audiencePasswd
     */
    public String getAudiencePasswd() {
        return audiencePasswd;
    }

    public void setAudiencePasswd(String audiencePasswd) {
        this.audiencePasswd = audiencePasswd;
    }

    public OpenScheduleConfReq withCallRestriction(Boolean callRestriction) {
        this.callRestriction = callRestriction;
        return this;
    }

    /**
     * 入会范围开关。 * false：不限制入会范围 * true：限制入会范围 
     * @return callRestriction
     */
    public Boolean getCallRestriction() {
        return callRestriction;
    }

    public void setCallRestriction(Boolean callRestriction) {
        this.callRestriction = callRestriction;
    }

    public OpenScheduleConfReq withScope(Integer scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 主持人、嘉宾入会范围 。仅callRestriction设置成true后生效。 * 0: 所有用户 * 2: 企业内用户 * 3: 被邀请用户 
     * @return scope
     */
    public Integer getScope() {
        return scope;
    }

    public void setScope(Integer scope) {
        this.scope = scope;
    }

    public OpenScheduleConfReq withAudienceScope(Integer audienceScope) {
        this.audienceScope = audienceScope;
        return this;
    }

    /**
     * 观众入会范围。仅callRestriction设置成true后生效。 * 0: 所有用户 * 2: 企业内用户和被邀请用户 
     * @return audienceScope
     */
    public Integer getAudienceScope() {
        return audienceScope;
    }

    public void setAudienceScope(Integer audienceScope) {
        this.audienceScope = audienceScope;
    }

    public OpenScheduleConfReq withEnableRecording(YesNoEnum enableRecording) {
        this.enableRecording = enableRecording;
        return this;
    }

    /**
     * Get enableRecording
     * @return enableRecording
     */
    public YesNoEnum getEnableRecording() {
        return enableRecording;
    }

    public void setEnableRecording(YesNoEnum enableRecording) {
        this.enableRecording = enableRecording;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenScheduleConfReq openScheduleConfReq = (OpenScheduleConfReq) o;
        return Objects.equals(this.subject, openScheduleConfReq.subject)
            && Objects.equals(this.description, openScheduleConfReq.description)
            && Objects.equals(this.startTime, openScheduleConfReq.startTime)
            && Objects.equals(this.duration, openScheduleConfReq.duration)
            && Objects.equals(this.timeZoneId, openScheduleConfReq.timeZoneId)
            && Objects.equals(this.attendees, openScheduleConfReq.attendees)
            && Objects.equals(this.notifySetting, openScheduleConfReq.notifySetting)
            && Objects.equals(this.vmrID, openScheduleConfReq.vmrID)
            && Objects.equals(this.guestPasswd, openScheduleConfReq.guestPasswd)
            && Objects.equals(this.audiencePasswd, openScheduleConfReq.audiencePasswd)
            && Objects.equals(this.callRestriction, openScheduleConfReq.callRestriction)
            && Objects.equals(this.scope, openScheduleConfReq.scope)
            && Objects.equals(this.audienceScope, openScheduleConfReq.audienceScope)
            && Objects.equals(this.enableRecording, openScheduleConfReq.enableRecording);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject,
            description,
            startTime,
            duration,
            timeZoneId,
            attendees,
            notifySetting,
            vmrID,
            guestPasswd,
            audiencePasswd,
            callRestriction,
            scope,
            audienceScope,
            enableRecording);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenScheduleConfReq {\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
        sb.append("    attendees: ").append(toIndentedString(attendees)).append("\n");
        sb.append("    notifySetting: ").append(toIndentedString(notifySetting)).append("\n");
        sb.append("    vmrID: ").append(toIndentedString(vmrID)).append("\n");
        sb.append("    guestPasswd: ").append(toIndentedString(guestPasswd)).append("\n");
        sb.append("    audiencePasswd: ").append(toIndentedString(audiencePasswd)).append("\n");
        sb.append("    callRestriction: ").append(toIndentedString(callRestriction)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    audienceScope: ").append(toIndentedString(audienceScope)).append("\n");
        sb.append("    enableRecording: ").append(toIndentedString(enableRecording)).append("\n");
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
