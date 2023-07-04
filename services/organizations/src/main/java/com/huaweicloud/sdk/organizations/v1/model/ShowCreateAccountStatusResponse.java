package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCreateAccountStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_account_status")

    private CreateAccountStatusDto createAccountStatus;

    public ShowCreateAccountStatusResponse withCreateAccountStatus(CreateAccountStatusDto createAccountStatus) {
        this.createAccountStatus = createAccountStatus;
        return this;
    }

    public ShowCreateAccountStatusResponse withCreateAccountStatus(
        Consumer<CreateAccountStatusDto> createAccountStatusSetter) {
        if (this.createAccountStatus == null) {
            this.createAccountStatus = new CreateAccountStatusDto();
            createAccountStatusSetter.accept(this.createAccountStatus);
        }

        return this;
    }

    /**
     * Get createAccountStatus
     * @return createAccountStatus
     */
    public CreateAccountStatusDto getCreateAccountStatus() {
        return createAccountStatus;
    }

    public void setCreateAccountStatus(CreateAccountStatusDto createAccountStatus) {
        this.createAccountStatus = createAccountStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCreateAccountStatusResponse showCreateAccountStatusResponse = (ShowCreateAccountStatusResponse) o;
        return Objects.equals(this.createAccountStatus, showCreateAccountStatusResponse.createAccountStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createAccountStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCreateAccountStatusResponse {\n");
        sb.append("    createAccountStatus: ").append(toIndentedString(createAccountStatus)).append("\n");
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
