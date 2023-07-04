package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateVideoMotionCaptureJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-App-UserId")

    private String xAppUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-User-Privilege")

    private String xUserPrivilege;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private VideoMotionCaptureJobReq body;

    public CreateVideoMotionCaptureJobRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带的鉴权信息。
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public CreateVideoMotionCaptureJobRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，请求的发生时间。格式为(YYYYMMDD'T'HHMMSS'Z')
     * @return xSdkDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public CreateVideoMotionCaptureJobRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带项目ID信息。
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public CreateVideoMotionCaptureJobRequest withXAppUserId(String xAppUserId) {
        this.xAppUserId = xAppUserId;
        return this;
    }

    /**
     * 开发者应用作为资产权属的可选字段。
     * @return xAppUserId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-App-UserId")
    public String getXAppUserId() {
        return xAppUserId;
    }

    public void setXAppUserId(String xAppUserId) {
        this.xAppUserId = xAppUserId;
    }

    public CreateVideoMotionCaptureJobRequest withXUserPrivilege(String xUserPrivilege) {
        this.xUserPrivilege = xUserPrivilege;
        return this;
    }

    /**
     * 测试用户判断。
     * @return xUserPrivilege
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-User-Privilege")
    public String getXUserPrivilege() {
        return xUserPrivilege;
    }

    public void setXUserPrivilege(String xUserPrivilege) {
        this.xUserPrivilege = xUserPrivilege;
    }

    public CreateVideoMotionCaptureJobRequest withBody(VideoMotionCaptureJobReq body) {
        this.body = body;
        return this;
    }

    public CreateVideoMotionCaptureJobRequest withBody(Consumer<VideoMotionCaptureJobReq> bodySetter) {
        if (this.body == null) {
            this.body = new VideoMotionCaptureJobReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public VideoMotionCaptureJobReq getBody() {
        return body;
    }

    public void setBody(VideoMotionCaptureJobReq body) {
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
        CreateVideoMotionCaptureJobRequest createVideoMotionCaptureJobRequest = (CreateVideoMotionCaptureJobRequest) o;
        return Objects.equals(this.authorization, createVideoMotionCaptureJobRequest.authorization)
            && Objects.equals(this.xSdkDate, createVideoMotionCaptureJobRequest.xSdkDate)
            && Objects.equals(this.xProjectId, createVideoMotionCaptureJobRequest.xProjectId)
            && Objects.equals(this.xAppUserId, createVideoMotionCaptureJobRequest.xAppUserId)
            && Objects.equals(this.xUserPrivilege, createVideoMotionCaptureJobRequest.xUserPrivilege)
            && Objects.equals(this.body, createVideoMotionCaptureJobRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization, xSdkDate, xProjectId, xAppUserId, xUserPrivilege, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVideoMotionCaptureJobRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    xAppUserId: ").append(toIndentedString(xAppUserId)).append("\n");
        sb.append("    xUserPrivilege: ").append(toIndentedString(xUserPrivilege)).append("\n");
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
