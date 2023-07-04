package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResetPasswordReq
 */
public class ResetPasswordReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_password")

    private String newPassword;

    public ResetPasswordReq withNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    /**
     * 8-32个字符。 至少包含以下字符中的3种： - 大写字母 - 小写字母 - 数字 - 特殊字符`~!@#$%^&*()-_=+\\\\|[{}];:\\'\\\",<.>/?  和空格，并且不能以-开头。
     * @return newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetPasswordReq resetPasswordReq = (ResetPasswordReq) o;
        return Objects.equals(this.newPassword, resetPasswordReq.newPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetPasswordReq {\n");
        sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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
