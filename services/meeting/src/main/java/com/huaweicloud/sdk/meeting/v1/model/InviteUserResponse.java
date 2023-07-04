package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class InviteUserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userExist")

    private Boolean userExist;

    public InviteUserResponse withUserExist(Boolean userExist) {
        this.userExist = userExist;
        return this;
    }

    /**
     * 用户是否存在
     * @return userExist
     */
    public Boolean getUserExist() {
        return userExist;
    }

    public void setUserExist(Boolean userExist) {
        this.userExist = userExist;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InviteUserResponse inviteUserResponse = (InviteUserResponse) o;
        return Objects.equals(this.userExist, inviteUserResponse.userExist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userExist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InviteUserResponse {\n");
        sb.append("    userExist: ").append(toIndentedString(userExist)).append("\n");
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
