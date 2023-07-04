package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AllowClientRecordRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceID")

    private String conferenceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Conference-Authorization")

    private String xConferenceAuthorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participantID")

    private String participantID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RestAllowClientRecordReqBody body;

    public AllowClientRecordRequest withConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
        return this;
    }

    /**
     * 会议ID。
     * @return conferenceID
     */
    public String getConferenceID() {
        return conferenceID;
    }

    public void setConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
    }

    public AllowClientRecordRequest withXConferenceAuthorization(String xConferenceAuthorization) {
        this.xConferenceAuthorization = xConferenceAuthorization;
        return this;
    }

    /**
     * 会控Token，通过[[获取会控token](https://support.huaweicloud.com/api-meeting/meeting_21_0027.html)](tag:hws)[[获取会控token](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0027.html)](tag:hk)接口获得。
     * @return xConferenceAuthorization
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Conference-Authorization")
    public String getXConferenceAuthorization() {
        return xConferenceAuthorization;
    }

    public void setXConferenceAuthorization(String xConferenceAuthorization) {
        this.xConferenceAuthorization = xConferenceAuthorization;
    }

    public AllowClientRecordRequest withParticipantID(String participantID) {
        this.participantID = participantID;
        return this;
    }

    /**
     * 与会者标识。
     * @return participantID
     */
    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    public AllowClientRecordRequest withBody(RestAllowClientRecordReqBody body) {
        this.body = body;
        return this;
    }

    public AllowClientRecordRequest withBody(Consumer<RestAllowClientRecordReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new RestAllowClientRecordReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RestAllowClientRecordReqBody getBody() {
        return body;
    }

    public void setBody(RestAllowClientRecordReqBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllowClientRecordRequest allowClientRecordRequest = (AllowClientRecordRequest) o;
        return Objects.equals(this.conferenceID, allowClientRecordRequest.conferenceID)
            && Objects.equals(this.xConferenceAuthorization, allowClientRecordRequest.xConferenceAuthorization)
            && Objects.equals(this.participantID, allowClientRecordRequest.participantID)
            && Objects.equals(this.body, allowClientRecordRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conferenceID, xConferenceAuthorization, participantID, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllowClientRecordRequest {\n");
        sb.append("    conferenceID: ").append(toIndentedString(conferenceID)).append("\n");
        sb.append("    xConferenceAuthorization: ").append(toIndentedString(xConferenceAuthorization)).append("\n");
        sb.append("    participantID: ").append(toIndentedString(participantID)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
