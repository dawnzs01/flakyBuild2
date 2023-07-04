package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowUserLoginProtectResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_protect")

    private LoginProtectResult loginProtect;

    public ShowUserLoginProtectResponse withLoginProtect(LoginProtectResult loginProtect) {
        this.loginProtect = loginProtect;
        return this;
    }

    public ShowUserLoginProtectResponse withLoginProtect(Consumer<LoginProtectResult> loginProtectSetter) {
        if (this.loginProtect == null) {
            this.loginProtect = new LoginProtectResult();
            loginProtectSetter.accept(this.loginProtect);
        }

        return this;
    }

    /**
     * Get loginProtect
     * @return loginProtect
     */
    public LoginProtectResult getLoginProtect() {
        return loginProtect;
    }

    public void setLoginProtect(LoginProtectResult loginProtect) {
        this.loginProtect = loginProtect;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowUserLoginProtectResponse showUserLoginProtectResponse = (ShowUserLoginProtectResponse) o;
        return Objects.equals(this.loginProtect, showUserLoginProtectResponse.loginProtect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginProtect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserLoginProtectResponse {\n");
        sb.append("    loginProtect: ").append(toIndentedString(loginProtect)).append("\n");
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
