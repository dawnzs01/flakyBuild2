package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设备接入类型不返回密钥模式。
 */
public class AuthInfoWithoutSecret {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secure_access")

    private Boolean secureAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    public AuthInfoWithoutSecret withSecureAccess(Boolean secureAccess) {
        this.secureAccess = secureAccess;
        return this;
    }

    /**
     * **参数说明**：指设备是否通过安全协议方式接入。 **取值范围**： - true：通过安全协议方式接入。 - false：通过非安全协议方式接入。非安全接入的设备存在被仿冒等安全风险，请谨慎使用。
     * @return secureAccess
     */
    public Boolean getSecureAccess() {
        return secureAccess;
    }

    public void setSecureAccess(Boolean secureAccess) {
        this.secureAccess = secureAccess;
    }

    public AuthInfoWithoutSecret withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * **参数说明**：设备接入的有效时间，单位：秒，默认值：0。若设备在有效时间内未接入物联网平台并激活，则平台会删除该设备的注册信息。若设置为“0”，则表示平台不会删除该设备的注册信息（建议填写为“0”）。
     * minimum: 0
     * maximum: 2147483647
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthInfoWithoutSecret authInfoWithoutSecret = (AuthInfoWithoutSecret) o;
        return Objects.equals(this.secureAccess, authInfoWithoutSecret.secureAccess)
            && Objects.equals(this.timeout, authInfoWithoutSecret.timeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secureAccess, timeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthInfoWithoutSecret {\n");
        sb.append("    secureAccess: ").append(toIndentedString(secureAccess)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
