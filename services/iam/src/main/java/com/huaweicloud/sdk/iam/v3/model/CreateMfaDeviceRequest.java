package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateMfaDeviceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateMfaDeviceReq body;

    public CreateMfaDeviceRequest withBody(CreateMfaDeviceReq body) {
        this.body = body;
        return this;
    }

    public CreateMfaDeviceRequest withBody(Consumer<CreateMfaDeviceReq> bodySetter) {
        if (this.body == null) {
            this.body = new CreateMfaDeviceReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateMfaDeviceReq getBody() {
        return body;
    }

    public void setBody(CreateMfaDeviceReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMfaDeviceRequest createMfaDeviceRequest = (CreateMfaDeviceRequest) o;
        return Objects.equals(this.body, createMfaDeviceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMfaDeviceRequest {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
