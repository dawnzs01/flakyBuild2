package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateStreamForbiddenRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private StreamForbiddenSetting body;

    public CreateStreamForbiddenRequest withBody(StreamForbiddenSetting body) {
        this.body = body;
        return this;
    }

    public CreateStreamForbiddenRequest withBody(Consumer<StreamForbiddenSetting> bodySetter) {
        if (this.body == null) {
            this.body = new StreamForbiddenSetting();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public StreamForbiddenSetting getBody() {
        return body;
    }

    public void setBody(StreamForbiddenSetting body) {
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
        CreateStreamForbiddenRequest createStreamForbiddenRequest = (CreateStreamForbiddenRequest) o;
        return Objects.equals(this.body, createStreamForbiddenRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStreamForbiddenRequest {\n");
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
