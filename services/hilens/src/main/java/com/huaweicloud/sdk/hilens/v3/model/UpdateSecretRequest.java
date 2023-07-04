package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateSecretRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_id")

    private String secretId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private SecretRequestBody body;

    public UpdateSecretRequest withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }

    /**
     * 密钥ID，从专业版HiLens控制台密钥管理[获取密钥列表](getSecretsListUsingGET.xml)获取
     * @return secretId
     */
    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public UpdateSecretRequest withBody(SecretRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateSecretRequest withBody(Consumer<SecretRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new SecretRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SecretRequestBody getBody() {
        return body;
    }

    public void setBody(SecretRequestBody body) {
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
        UpdateSecretRequest updateSecretRequest = (UpdateSecretRequest) o;
        return Objects.equals(this.secretId, updateSecretRequest.secretId)
            && Objects.equals(this.body, updateSecretRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secretId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecretRequest {\n");
        sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
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
