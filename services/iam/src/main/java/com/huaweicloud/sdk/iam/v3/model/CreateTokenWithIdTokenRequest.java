package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateTokenWithIdTokenRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Idp-Id")

    private String xIdpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private GetIdTokenRequestBody body;

    public CreateTokenWithIdTokenRequest withXIdpId(String xIdpId) {
        this.xIdpId = xIdpId;
        return this;
    }

    /**
     * 身份提供商ID。
     * @return xIdpId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Idp-Id")
    public String getXIdpId() {
        return xIdpId;
    }

    public void setXIdpId(String xIdpId) {
        this.xIdpId = xIdpId;
    }

    public CreateTokenWithIdTokenRequest withBody(GetIdTokenRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateTokenWithIdTokenRequest withBody(Consumer<GetIdTokenRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new GetIdTokenRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public GetIdTokenRequestBody getBody() {
        return body;
    }

    public void setBody(GetIdTokenRequestBody body) {
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
        CreateTokenWithIdTokenRequest createTokenWithIdTokenRequest = (CreateTokenWithIdTokenRequest) o;
        return Objects.equals(this.xIdpId, createTokenWithIdTokenRequest.xIdpId)
            && Objects.equals(this.body, createTokenWithIdTokenRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xIdpId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTokenWithIdTokenRequest {\n");
        sb.append("    xIdpId: ").append(toIndentedString(xIdpId)).append("\n");
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
