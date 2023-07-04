package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdatePrivateSnatResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snat_rule")

    private PrivateSnat snatRule;

    public UpdatePrivateSnatResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdatePrivateSnatResponse withSnatRule(PrivateSnat snatRule) {
        this.snatRule = snatRule;
        return this;
    }

    public UpdatePrivateSnatResponse withSnatRule(Consumer<PrivateSnat> snatRuleSetter) {
        if (this.snatRule == null) {
            this.snatRule = new PrivateSnat();
            snatRuleSetter.accept(this.snatRule);
        }

        return this;
    }

    /**
     * Get snatRule
     * @return snatRule
     */
    public PrivateSnat getSnatRule() {
        return snatRule;
    }

    public void setSnatRule(PrivateSnat snatRule) {
        this.snatRule = snatRule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePrivateSnatResponse updatePrivateSnatResponse = (UpdatePrivateSnatResponse) o;
        return Objects.equals(this.requestId, updatePrivateSnatResponse.requestId)
            && Objects.equals(this.snatRule, updatePrivateSnatResponse.snatRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, snatRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrivateSnatResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    snatRule: ").append(toIndentedString(snatRule)).append("\n");
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
