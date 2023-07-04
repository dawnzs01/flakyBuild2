package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * {  \&quot;login_protect\&quot;:{         \&quot;user_id\&quot;: \&quot;16b26081f43d4c628c4bb88cf32e9f9b\&quot;,         \&quot;enabled\&quot;: true,         \&quot;verification_method\&quot;: \&quot;vmfa\&quot;     } } 
 */
public class UpdateLoginProtectRespon {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_method")

    private String verificationMethod;

    public UpdateLoginProtectRespon withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 待修改信息的IAM用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UpdateLoginProtectRespon withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * IAM用户是否开启登录保护，开启为\"true\"，不开启为\"false\"。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public UpdateLoginProtectRespon withVerificationMethod(String verificationMethod) {
        this.verificationMethod = verificationMethod;
        return this;
    }

    /**
     * IAM用户登录验证方式。手机验证为“sms”,邮箱验证为“email”,MFA验证为“vmfa”。
     * @return verificationMethod
     */
    public String getVerificationMethod() {
        return verificationMethod;
    }

    public void setVerificationMethod(String verificationMethod) {
        this.verificationMethod = verificationMethod;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateLoginProtectRespon updateLoginProtectRespon = (UpdateLoginProtectRespon) o;
        return Objects.equals(this.userId, updateLoginProtectRespon.userId)
            && Objects.equals(this.enabled, updateLoginProtectRespon.enabled)
            && Objects.equals(this.verificationMethod, updateLoginProtectRespon.verificationMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, enabled, verificationMethod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLoginProtectRespon {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    verificationMethod: ").append(toIndentedString(verificationMethod)).append("\n");
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
