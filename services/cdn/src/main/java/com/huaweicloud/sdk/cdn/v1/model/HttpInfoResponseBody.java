package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * HttpInfoResponseBody
 */
public class HttpInfoResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_status")

    private Integer httpsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_name")

    private String certName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_type")

    private Integer certificateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_redirect_https")

    private Integer forceRedirectHttps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_redirect_config")

    private ForceRedirect forceRedirectConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http2")

    private Integer http2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private Long expirationTime;

    public HttpInfoResponseBody withHttpsStatus(Integer httpsStatus) {
        this.httpsStatus = httpsStatus;
        return this;
    }

    /**
     * HTTPS证书是否启用。0：不启用，此时无需填写证书及私钥参数；1：启用HTTPS加速并协议跟随回源；2：启用HTTPS加速并HTTP回源；3：启用HTTPS加速并HTTPS回源，开启时需要传递证书及私钥
     * @return httpsStatus
     */
    public Integer getHttpsStatus() {
        return httpsStatus;
    }

    public void setHttpsStatus(Integer httpsStatus) {
        this.httpsStatus = httpsStatus;
    }

    public HttpInfoResponseBody withCertName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * 证书名称。（长度限制为3-32字符）。
     * @return certName
     */
    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public HttpInfoResponseBody withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * 证书内容。
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public HttpInfoResponseBody withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * 功能说明： HTTPS协议使用的私钥，不启用证书则无需输入。（为了客户信息安全，接口返回私钥为空）
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public HttpInfoResponseBody withCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * 证书类型。1：代表华为云托管证书；0：表示自有证书。
     * @return certificateType
     */
    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    public HttpInfoResponseBody withForceRedirectHttps(Integer forceRedirectHttps) {
        this.forceRedirectHttps = forceRedirectHttps;
        return this;
    }

    /**
     * 客户端请求是否强制重定向。1是，0否。（如果为2，表示强制跳转HTTP）
     * @return forceRedirectHttps
     */
    public Integer getForceRedirectHttps() {
        return forceRedirectHttps;
    }

    public void setForceRedirectHttps(Integer forceRedirectHttps) {
        this.forceRedirectHttps = forceRedirectHttps;
    }

    public HttpInfoResponseBody withForceRedirectConfig(ForceRedirect forceRedirectConfig) {
        this.forceRedirectConfig = forceRedirectConfig;
        return this;
    }

    public HttpInfoResponseBody withForceRedirectConfig(Consumer<ForceRedirect> forceRedirectConfigSetter) {
        if (this.forceRedirectConfig == null) {
            this.forceRedirectConfig = new ForceRedirect();
            forceRedirectConfigSetter.accept(this.forceRedirectConfig);
        }

        return this;
    }

    /**
     * Get forceRedirectConfig
     * @return forceRedirectConfig
     */
    public ForceRedirect getForceRedirectConfig() {
        return forceRedirectConfig;
    }

    public void setForceRedirectConfig(ForceRedirect forceRedirectConfig) {
        this.forceRedirectConfig = forceRedirectConfig;
    }

    public HttpInfoResponseBody withHttp2(Integer http2) {
        this.http2 = http2;
        return this;
    }

    /**
     * 是否使用HTTP2.0。（1是，0否。）
     * @return http2
     */
    public Integer getHttp2() {
        return http2;
    }

    public void setHttp2(Integer http2) {
        this.http2 = http2;
    }

    public HttpInfoResponseBody withExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * 证书过期时间
     * @return expirationTime
     */
    public Long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HttpInfoResponseBody httpInfoResponseBody = (HttpInfoResponseBody) o;
        return Objects.equals(this.httpsStatus, httpInfoResponseBody.httpsStatus)
            && Objects.equals(this.certName, httpInfoResponseBody.certName)
            && Objects.equals(this.certificate, httpInfoResponseBody.certificate)
            && Objects.equals(this.privateKey, httpInfoResponseBody.privateKey)
            && Objects.equals(this.certificateType, httpInfoResponseBody.certificateType)
            && Objects.equals(this.forceRedirectHttps, httpInfoResponseBody.forceRedirectHttps)
            && Objects.equals(this.forceRedirectConfig, httpInfoResponseBody.forceRedirectConfig)
            && Objects.equals(this.http2, httpInfoResponseBody.http2)
            && Objects.equals(this.expirationTime, httpInfoResponseBody.expirationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpsStatus,
            certName,
            certificate,
            privateKey,
            certificateType,
            forceRedirectHttps,
            forceRedirectConfig,
            http2,
            expirationTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpInfoResponseBody {\n");
        sb.append("    httpsStatus: ").append(toIndentedString(httpsStatus)).append("\n");
        sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
        sb.append("    forceRedirectHttps: ").append(toIndentedString(forceRedirectHttps)).append("\n");
        sb.append("    forceRedirectConfig: ").append(toIndentedString(forceRedirectConfig)).append("\n");
        sb.append("    http2: ").append(toIndentedString(http2)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
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
