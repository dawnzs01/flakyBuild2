package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreatePrivateSnatRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreatePrivateSnatOptionBody body;

    public CreatePrivateSnatRequest withBody(CreatePrivateSnatOptionBody body) {
        this.body = body;
        return this;
    }

    public CreatePrivateSnatRequest withBody(Consumer<CreatePrivateSnatOptionBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreatePrivateSnatOptionBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreatePrivateSnatOptionBody getBody() {
        return body;
    }

    public void setBody(CreatePrivateSnatOptionBody body) {
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
        CreatePrivateSnatRequest createPrivateSnatRequest = (CreatePrivateSnatRequest) o;
        return Objects.equals(this.body, createPrivateSnatRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateSnatRequest {\n");
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
