package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateFlinkSqlJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateFlinkSqlJobRequestBody body;

    public CreateFlinkSqlJobRequest withBody(CreateFlinkSqlJobRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateFlinkSqlJobRequest withBody(Consumer<CreateFlinkSqlJobRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateFlinkSqlJobRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateFlinkSqlJobRequestBody getBody() {
        return body;
    }

    public void setBody(CreateFlinkSqlJobRequestBody body) {
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
        CreateFlinkSqlJobRequest createFlinkSqlJobRequest = (CreateFlinkSqlJobRequest) o;
        return Objects.equals(this.body, createFlinkSqlJobRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFlinkSqlJobRequest {\n");
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
