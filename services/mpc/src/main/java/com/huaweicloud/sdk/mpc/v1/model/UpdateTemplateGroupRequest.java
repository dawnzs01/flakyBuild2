package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTemplateGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ModifyTransTemplateGroup body;

    public UpdateTemplateGroupRequest withBody(ModifyTransTemplateGroup body) {
        this.body = body;
        return this;
    }

    public UpdateTemplateGroupRequest withBody(Consumer<ModifyTransTemplateGroup> bodySetter) {
        if (this.body == null) {
            this.body = new ModifyTransTemplateGroup();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ModifyTransTemplateGroup getBody() {
        return body;
    }

    public void setBody(ModifyTransTemplateGroup body) {
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
        UpdateTemplateGroupRequest updateTemplateGroupRequest = (UpdateTemplateGroupRequest) o;
        return Objects.equals(this.body, updateTemplateGroupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTemplateGroupRequest {\n");
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
