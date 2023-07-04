package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 会议信息。
 */
public class RestInviteWithPwdReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callNum")

    private String callNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orgID")

    private String orgID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confID")

    private String confID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd")

    private String pwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "numBelongsType")

    private Integer numBelongsType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isNotOverlayPidName")

    private Boolean isNotOverlayPidName;

    public RestInviteWithPwdReqBody withCallNum(String callNum) {
        this.callNum = callNum;
        return this;
    }

    /**
     * 被邀请者的SIP号码。
     * @return callNum
     */
    public String getCallNum() {
        return callNum;
    }

    public void setCallNum(String callNum) {
        this.callNum = callNum;
    }

    public RestInviteWithPwdReqBody withOrgID(String orgID) {
        this.orgID = orgID;
        return this;
    }

    /**
     * 被邀请者所属企业ID。
     * @return orgID
     */
    public String getOrgID() {
        return orgID;
    }

    public void setOrgID(String orgID) {
        this.orgID = orgID;
    }

    public RestInviteWithPwdReqBody withConfID(String confID) {
        this.confID = confID;
        return this;
    }

    /**
     * 会议ID。
     * @return confID
     */
    public String getConfID() {
        return confID;
    }

    public void setConfID(String confID) {
        this.confID = confID;
    }

    public RestInviteWithPwdReqBody withPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    /**
     * 会议的密码（主持人或者来宾）。
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public RestInviteWithPwdReqBody withNumBelongsType(Integer numBelongsType) {
        this.numBelongsType = numBelongsType;
        return this;
    }

    /**
     * SIP号码类型。默认是0。 * 0：华为云会议的号码 * 1：VC会议的号码 
     * @return numBelongsType
     */
    public Integer getNumBelongsType() {
        return numBelongsType;
    }

    public void setNumBelongsType(Integer numBelongsType) {
        this.numBelongsType = numBelongsType;
    }

    public RestInviteWithPwdReqBody withIsNotOverlayPidName(Boolean isNotOverlayPidName) {
        this.isNotOverlayPidName = isNotOverlayPidName;
        return this;
    }

    /**
     * 是否不叠加会场名（VDC场景下适用）。
     * @return isNotOverlayPidName
     */
    public Boolean getIsNotOverlayPidName() {
        return isNotOverlayPidName;
    }

    public void setIsNotOverlayPidName(Boolean isNotOverlayPidName) {
        this.isNotOverlayPidName = isNotOverlayPidName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestInviteWithPwdReqBody restInviteWithPwdReqBody = (RestInviteWithPwdReqBody) o;
        return Objects.equals(this.callNum, restInviteWithPwdReqBody.callNum)
            && Objects.equals(this.orgID, restInviteWithPwdReqBody.orgID)
            && Objects.equals(this.confID, restInviteWithPwdReqBody.confID)
            && Objects.equals(this.pwd, restInviteWithPwdReqBody.pwd)
            && Objects.equals(this.numBelongsType, restInviteWithPwdReqBody.numBelongsType)
            && Objects.equals(this.isNotOverlayPidName, restInviteWithPwdReqBody.isNotOverlayPidName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callNum, orgID, confID, pwd, numBelongsType, isNotOverlayPidName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestInviteWithPwdReqBody {\n");
        sb.append("    callNum: ").append(toIndentedString(callNum)).append("\n");
        sb.append("    orgID: ").append(toIndentedString(orgID)).append("\n");
        sb.append("    confID: ").append(toIndentedString(confID)).append("\n");
        sb.append("    pwd: ").append(toIndentedString(pwd)).append("\n");
        sb.append("    numBelongsType: ").append(toIndentedString(numBelongsType)).append("\n");
        sb.append("    isNotOverlayPidName: ").append(toIndentedString(isNotOverlayPidName)).append("\n");
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
