package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListAimTemplateReportsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ListAimTemplateReportsRequestBody body;

    public ListAimTemplateReportsRequest withBody(ListAimTemplateReportsRequestBody body) {
        this.body = body;
        return this;
    }

    public ListAimTemplateReportsRequest withBody(Consumer<ListAimTemplateReportsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ListAimTemplateReportsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ListAimTemplateReportsRequestBody getBody() {
        return body;
    }

    public void setBody(ListAimTemplateReportsRequestBody body) {
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
        ListAimTemplateReportsRequest listAimTemplateReportsRequest = (ListAimTemplateReportsRequest) o;
        return Objects.equals(this.body, listAimTemplateReportsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAimTemplateReportsRequest {\n");
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
