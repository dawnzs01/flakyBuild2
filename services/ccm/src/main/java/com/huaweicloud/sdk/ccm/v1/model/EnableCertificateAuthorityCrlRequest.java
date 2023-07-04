package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class EnableCertificateAuthorityCrlRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca_id")

    private String caId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EnableCertificateAuthorityCrlRequestBody body;

    public EnableCertificateAuthorityCrlRequest withCaId(String caId) {
        this.caId = caId;
        return this;
    }

    /**
     * 所要启用CRL的CA证书ID。
     * @return caId
     */
    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    public EnableCertificateAuthorityCrlRequest withBody(EnableCertificateAuthorityCrlRequestBody body) {
        this.body = body;
        return this;
    }

    public EnableCertificateAuthorityCrlRequest withBody(
        Consumer<EnableCertificateAuthorityCrlRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new EnableCertificateAuthorityCrlRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public EnableCertificateAuthorityCrlRequestBody getBody() {
        return body;
    }

    public void setBody(EnableCertificateAuthorityCrlRequestBody body) {
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
        EnableCertificateAuthorityCrlRequest enableCertificateAuthorityCrlRequest =
            (EnableCertificateAuthorityCrlRequest) o;
        return Objects.equals(this.caId, enableCertificateAuthorityCrlRequest.caId)
            && Objects.equals(this.body, enableCertificateAuthorityCrlRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableCertificateAuthorityCrlRequest {\n");
        sb.append("    caId: ").append(toIndentedString(caId)).append("\n");
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
