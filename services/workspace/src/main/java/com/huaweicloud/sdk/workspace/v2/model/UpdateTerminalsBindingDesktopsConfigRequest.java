package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTerminalsBindingDesktopsConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private TerminalsBindingDesktopsConfig body;

    public UpdateTerminalsBindingDesktopsConfigRequest withBody(TerminalsBindingDesktopsConfig body) {
        this.body = body;
        return this;
    }

    public UpdateTerminalsBindingDesktopsConfigRequest withBody(Consumer<TerminalsBindingDesktopsConfig> bodySetter) {
        if (this.body == null) {
            this.body = new TerminalsBindingDesktopsConfig();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public TerminalsBindingDesktopsConfig getBody() {
        return body;
    }

    public void setBody(TerminalsBindingDesktopsConfig body) {
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
        UpdateTerminalsBindingDesktopsConfigRequest updateTerminalsBindingDesktopsConfigRequest =
            (UpdateTerminalsBindingDesktopsConfigRequest) o;
        return Objects.equals(this.body, updateTerminalsBindingDesktopsConfigRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTerminalsBindingDesktopsConfigRequest {\n");
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
