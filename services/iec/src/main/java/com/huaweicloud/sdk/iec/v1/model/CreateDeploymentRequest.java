package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateDeploymentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateDeploymentRequestBody body;

    public CreateDeploymentRequest withBody(CreateDeploymentRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateDeploymentRequest withBody(Consumer<CreateDeploymentRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateDeploymentRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateDeploymentRequestBody getBody() {
        return body;
    }

    public void setBody(CreateDeploymentRequestBody body) {
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
        CreateDeploymentRequest createDeploymentRequest = (CreateDeploymentRequest) o;
        return Objects.equals(this.body, createDeploymentRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDeploymentRequest {\n");
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
