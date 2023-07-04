package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 会控Token信息。
 */
public class TokenInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tmpWsToken")

    private String tmpWsToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wsURL")

    private String wsURL;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private Integer role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expireTime")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userID")

    private String userID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orgID")

    private String orgID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participantID")

    private String participantID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confTokenExpireTime")

    private Integer confTokenExpireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrCurrentConfID")

    private String vmrCurrentConfID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supportNotifyType")

    private List<String> supportNotifyType = null;

    public TokenInfo withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 会控Token。有效期半个小时。
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public TokenInfo withTmpWsToken(String tmpWsToken) {
        this.tmpWsToken = tmpWsToken;
        return this;
    }

    /**
     * 会控WebSocket建链鉴权Token。
     * @return tmpWsToken
     */
    public String getTmpWsToken() {
        return tmpWsToken;
    }

    public void setTmpWsToken(String tmpWsToken) {
        this.tmpWsToken = tmpWsToken;
    }

    public TokenInfo withWsURL(String wsURL) {
        this.wsURL = wsURL;
        return this;
    }

    /**
     * 会控WebSocket建链URL。
     * @return wsURL
     */
    public String getWsURL() {
        return wsURL;
    }

    public void setWsURL(String wsURL) {
        this.wsURL = wsURL;
    }

    public TokenInfo withRole(Integer role) {
        this.role = role;
        return this;
    }

    /**
     * 会议中的角色。 * 0 ：普通与会者 * 1 ：会议主持人 
     * minimum: 0
     * maximum: 1
     * @return role
     */
    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public TokenInfo withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 会控Token过期时间戳（单位：毫秒）。
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public TokenInfo withUserID(String userID) {
        this.userID = userID;
        return this;
    }

    /**
     * 会议预定者的用户UUID。
     * @return userID
     */
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public TokenInfo withOrgID(String orgID) {
        this.orgID = orgID;
        return this;
    }

    /**
     * 会议所属企业ID。
     * @return orgID
     */
    public String getOrgID() {
        return orgID;
    }

    public void setOrgID(String orgID) {
        this.orgID = orgID;
    }

    public TokenInfo withParticipantID(String participantID) {
        this.participantID = participantID;
        return this;
    }

    /**
     * 终端请求时，返回终端入会后会场ID。 > 该参数将废弃，请勿使用。 
     * @return participantID
     */
    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    public TokenInfo withConfTokenExpireTime(Integer confTokenExpireTime) {
        this.confTokenExpireTime = confTokenExpireTime;
        return this;
    }

    /**
     * 会控Token有效时长（单位秒）。
     * @return confTokenExpireTime
     */
    public Integer getConfTokenExpireTime() {
        return confTokenExpireTime;
    }

    public void setConfTokenExpireTime(Integer confTokenExpireTime) {
        this.confTokenExpireTime = confTokenExpireTime;
    }

    public TokenInfo withVmrCurrentConfID(String vmrCurrentConfID) {
        this.vmrCurrentConfID = vmrCurrentConfID;
        return this;
    }

    /**
     * 云会议室会议的当前会议ID。
     * @return vmrCurrentConfID
     */
    public String getVmrCurrentConfID() {
        return vmrCurrentConfID;
    }

    public void setVmrCurrentConfID(String vmrCurrentConfID) {
        this.vmrCurrentConfID = vmrCurrentConfID;
    }

    public TokenInfo withSupportNotifyType(List<String> supportNotifyType) {
        this.supportNotifyType = supportNotifyType;
        return this;
    }

    public TokenInfo addSupportNotifyTypeItem(String supportNotifyTypeItem) {
        if (this.supportNotifyType == null) {
            this.supportNotifyType = new ArrayList<>();
        }
        this.supportNotifyType.add(supportNotifyTypeItem);
        return this;
    }

    public TokenInfo withSupportNotifyType(Consumer<List<String>> supportNotifyTypeSetter) {
        if (this.supportNotifyType == null) {
            this.supportNotifyType = new ArrayList<>();
        }
        supportNotifyTypeSetter.accept(this.supportNotifyType);
        return this;
    }

    /**
     * 会控WebSocket消息推送支持类型。
     * @return supportNotifyType
     */
    public List<String> getSupportNotifyType() {
        return supportNotifyType;
    }

    public void setSupportNotifyType(List<String> supportNotifyType) {
        this.supportNotifyType = supportNotifyType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenInfo tokenInfo = (TokenInfo) o;
        return Objects.equals(this.token, tokenInfo.token) && Objects.equals(this.tmpWsToken, tokenInfo.tmpWsToken)
            && Objects.equals(this.wsURL, tokenInfo.wsURL) && Objects.equals(this.role, tokenInfo.role)
            && Objects.equals(this.expireTime, tokenInfo.expireTime) && Objects.equals(this.userID, tokenInfo.userID)
            && Objects.equals(this.orgID, tokenInfo.orgID)
            && Objects.equals(this.participantID, tokenInfo.participantID)
            && Objects.equals(this.confTokenExpireTime, tokenInfo.confTokenExpireTime)
            && Objects.equals(this.vmrCurrentConfID, tokenInfo.vmrCurrentConfID)
            && Objects.equals(this.supportNotifyType, tokenInfo.supportNotifyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token,
            tmpWsToken,
            wsURL,
            role,
            expireTime,
            userID,
            orgID,
            participantID,
            confTokenExpireTime,
            vmrCurrentConfID,
            supportNotifyType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenInfo {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    tmpWsToken: ").append(toIndentedString(tmpWsToken)).append("\n");
        sb.append("    wsURL: ").append(toIndentedString(wsURL)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
        sb.append("    orgID: ").append(toIndentedString(orgID)).append("\n");
        sb.append("    participantID: ").append(toIndentedString(participantID)).append("\n");
        sb.append("    confTokenExpireTime: ").append(toIndentedString(confTokenExpireTime)).append("\n");
        sb.append("    vmrCurrentConfID: ").append(toIndentedString(vmrCurrentConfID)).append("\n");
        sb.append("    supportNotifyType: ").append(toIndentedString(supportNotifyType)).append("\n");
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
