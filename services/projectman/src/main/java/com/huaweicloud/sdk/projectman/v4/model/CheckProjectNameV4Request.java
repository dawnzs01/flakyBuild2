package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CheckProjectNameV4Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CheckProjectNameRequestV4 body;

    public CheckProjectNameV4Request withBody(CheckProjectNameRequestV4 body) {
        this.body = body;
        return this;
    }

    public CheckProjectNameV4Request withBody(Consumer<CheckProjectNameRequestV4> bodySetter) {
        if (this.body == null) {
            this.body = new CheckProjectNameRequestV4();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CheckProjectNameRequestV4 getBody() {
        return body;
    }

    public void setBody(CheckProjectNameRequestV4 body) {
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
        CheckProjectNameV4Request checkProjectNameV4Request = (CheckProjectNameV4Request) o;
        return Objects.equals(this.body, checkProjectNameV4Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckProjectNameV4Request {\n");
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
