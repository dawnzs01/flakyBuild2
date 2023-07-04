package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PolicyItemAccess
 */
public class PolicyItemAccess {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_allowed")

    private Boolean isAllowed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public PolicyItemAccess withIsAllowed(Boolean isAllowed) {
        this.isAllowed = isAllowed;
        return this;
    }

    /**
     * 是否允许
     * @return isAllowed
     */
    public Boolean getIsAllowed() {
        return isAllowed;
    }

    public void setIsAllowed(Boolean isAllowed) {
        this.isAllowed = isAllowed;
    }

    public PolicyItemAccess withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyItemAccess policyItemAccess = (PolicyItemAccess) o;
        return Objects.equals(this.isAllowed, policyItemAccess.isAllowed)
            && Objects.equals(this.type, policyItemAccess.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAllowed, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyItemAccess {\n");
        sb.append("    isAllowed: ").append(toIndentedString(isAllowed)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
