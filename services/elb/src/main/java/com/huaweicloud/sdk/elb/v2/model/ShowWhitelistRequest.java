package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowWhitelistRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whitelist_id")

    private String whitelistId;

    public ShowWhitelistRequest withWhitelistId(String whitelistId) {
        this.whitelistId = whitelistId;
        return this;
    }

    /**
     * 白名单的id
     * @return whitelistId
     */
    public String getWhitelistId() {
        return whitelistId;
    }

    public void setWhitelistId(String whitelistId) {
        this.whitelistId = whitelistId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowWhitelistRequest showWhitelistRequest = (ShowWhitelistRequest) o;
        return Objects.equals(this.whitelistId, showWhitelistRequest.whitelistId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(whitelistId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWhitelistRequest {\n");
        sb.append("    whitelistId: ").append(toIndentedString(whitelistId)).append("\n");
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
