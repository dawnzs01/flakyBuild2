package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SendVerificationCodeV2Req
 */
public class SendVerificationCodeV2Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receiver_type")

    private Integer receiverType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lang")

    private String lang;

    public SendVerificationCodeV2Req withReceiverType(Integer receiverType) {
        this.receiverType = receiverType;
        return this;
    }

    /**
     * 发送验证码的类型： 2：发送邮件验证码
     * minimum: 1
     * maximum: 2
     * @return receiverType
     */
    public Integer getReceiverType() {
        return receiverType;
    }

    public void setReceiverType(Integer receiverType) {
        this.receiverType = receiverType;
    }

    public SendVerificationCodeV2Req withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 发送验证码的超时时间。 如果不填的话，采用系统默认超时时间5分钟。 单位：分钟
     * minimum: 1
     * maximum: 2147483647
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public SendVerificationCodeV2Req withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 指定发送验证码的邮箱地址。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SendVerificationCodeV2Req withLang(String lang) {
        this.lang = lang;
        return this;
    }

    /**
     * 根据该参数的取值选择发送邮件验证码的语言。 zh-cn：中文en-us：英文
     * @return lang
     */
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendVerificationCodeV2Req sendVerificationCodeV2Req = (SendVerificationCodeV2Req) o;
        return Objects.equals(this.receiverType, sendVerificationCodeV2Req.receiverType)
            && Objects.equals(this.timeout, sendVerificationCodeV2Req.timeout)
            && Objects.equals(this.email, sendVerificationCodeV2Req.email)
            && Objects.equals(this.lang, sendVerificationCodeV2Req.lang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receiverType, timeout, email, lang);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendVerificationCodeV2Req {\n");
        sb.append("    receiverType: ").append(toIndentedString(receiverType)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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
