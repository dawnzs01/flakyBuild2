package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateProtectedInstanceNameResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_instance")

    private ShowProtectedInstanceParams protectedInstance;

    public UpdateProtectedInstanceNameResponse withProtectedInstance(ShowProtectedInstanceParams protectedInstance) {
        this.protectedInstance = protectedInstance;
        return this;
    }

    public UpdateProtectedInstanceNameResponse withProtectedInstance(
        Consumer<ShowProtectedInstanceParams> protectedInstanceSetter) {
        if (this.protectedInstance == null) {
            this.protectedInstance = new ShowProtectedInstanceParams();
            protectedInstanceSetter.accept(this.protectedInstance);
        }

        return this;
    }

    /**
     * Get protectedInstance
     * @return protectedInstance
     */
    public ShowProtectedInstanceParams getProtectedInstance() {
        return protectedInstance;
    }

    public void setProtectedInstance(ShowProtectedInstanceParams protectedInstance) {
        this.protectedInstance = protectedInstance;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateProtectedInstanceNameResponse updateProtectedInstanceNameResponse =
            (UpdateProtectedInstanceNameResponse) o;
        return Objects.equals(this.protectedInstance, updateProtectedInstanceNameResponse.protectedInstance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectedInstance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProtectedInstanceNameResponse {\n");
        sb.append("    protectedInstance: ").append(toIndentedString(protectedInstance)).append("\n");
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
