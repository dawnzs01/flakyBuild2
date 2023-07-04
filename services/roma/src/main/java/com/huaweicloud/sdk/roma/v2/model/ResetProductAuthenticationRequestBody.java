package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResetProductAuthenticationRequestBody
 */
public class ResetProductAuthenticationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    public ResetProductAuthenticationRequestBody withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 产品用户名，支持英文大小写、英文符号(-)及数字，长度限制10-50位，传参空，用户名不被重置
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ResetProductAuthenticationRequestBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 产品密码，包含数字、英文字母大小写、特殊字符(-~!@#$%^&*()-_=+|[{}];:<>/?)，长度10-80位，传参空，密码不被重置。当用户名与密码都为空时，密码重置，由系统生成。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetProductAuthenticationRequestBody resetProductAuthenticationRequestBody =
            (ResetProductAuthenticationRequestBody) o;
        return Objects.equals(this.userName, resetProductAuthenticationRequestBody.userName)
            && Objects.equals(this.password, resetProductAuthenticationRequestBody.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetProductAuthenticationRequestBody {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
