package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateDomainProtectPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_policy")

    private UpdateDomainProtectPolicyResponseBodyProtectPolicy protectPolicy;

    public UpdateDomainProtectPolicyResponse withProtectPolicy(
        UpdateDomainProtectPolicyResponseBodyProtectPolicy protectPolicy) {
        this.protectPolicy = protectPolicy;
        return this;
    }

    public UpdateDomainProtectPolicyResponse withProtectPolicy(
        Consumer<UpdateDomainProtectPolicyResponseBodyProtectPolicy> protectPolicySetter) {
        if (this.protectPolicy == null) {
            this.protectPolicy = new UpdateDomainProtectPolicyResponseBodyProtectPolicy();
            protectPolicySetter.accept(this.protectPolicy);
        }

        return this;
    }

    /**
     * Get protectPolicy
     * @return protectPolicy
     */
    public UpdateDomainProtectPolicyResponseBodyProtectPolicy getProtectPolicy() {
        return protectPolicy;
    }

    public void setProtectPolicy(UpdateDomainProtectPolicyResponseBodyProtectPolicy protectPolicy) {
        this.protectPolicy = protectPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDomainProtectPolicyResponse updateDomainProtectPolicyResponse = (UpdateDomainProtectPolicyResponse) o;
        return Objects.equals(this.protectPolicy, updateDomainProtectPolicyResponse.protectPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainProtectPolicyResponse {\n");
        sb.append("    protectPolicy: ").append(toIndentedString(protectPolicy)).append("\n");
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
