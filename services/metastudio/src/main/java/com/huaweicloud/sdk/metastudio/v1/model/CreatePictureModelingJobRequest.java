package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreatePictureModelingJobRequest {

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

    private CreatePictureModelingJobRequestBody body;

    public CreatePictureModelingJobRequest withAuthorization(String authorization) {
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

    public CreatePictureModelingJobRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，请求的发生时间。格式为YYYYMMDD'T'HHMMSS'Z'
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

    public CreatePictureModelingJobRequest withXProjectId(String xProjectId) {
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

    public CreatePictureModelingJobRequest withXAppUserId(String xAppUserId) {
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

    public CreatePictureModelingJobRequest withXUserPrivilege(String xUserPrivilege) {
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

    public CreatePictureModelingJobRequest withBody(CreatePictureModelingJobRequestBody body) {
        this.body = body;
        return this;
    }

    public CreatePictureModelingJobRequest withBody(Consumer<CreatePictureModelingJobRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreatePictureModelingJobRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreatePictureModelingJobRequestBody getBody() {
        return body;
    }

    public void setBody(CreatePictureModelingJobRequestBody body) {
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
        CreatePictureModelingJobRequest createPictureModelingJobRequest = (CreatePictureModelingJobRequest) o;
        return Objects.equals(this.authorization, createPictureModelingJobRequest.authorization)
            && Objects.equals(this.xSdkDate, createPictureModelingJobRequest.xSdkDate)
            && Objects.equals(this.xProjectId, createPictureModelingJobRequest.xProjectId)
            && Objects.equals(this.xAppUserId, createPictureModelingJobRequest.xAppUserId)
            && Objects.equals(this.xUserPrivilege, createPictureModelingJobRequest.xUserPrivilege)
            && Objects.equals(this.body, createPictureModelingJobRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization, xSdkDate, xProjectId, xAppUserId, xUserPrivilege, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePictureModelingJobRequest {\n");
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
