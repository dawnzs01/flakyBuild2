package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateL7ruleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policy_id")

    private String l7policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateL7ruleRequestBody body;

    public CreateL7ruleRequest withL7policyId(String l7policyId) {
        this.l7policyId = l7policyId;
        return this;
    }

    /**
     * 转发策略id
     * @return l7policyId
     */
    public String getL7policyId() {
        return l7policyId;
    }

    public void setL7policyId(String l7policyId) {
        this.l7policyId = l7policyId;
    }

    public CreateL7ruleRequest withBody(CreateL7ruleRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateL7ruleRequest withBody(Consumer<CreateL7ruleRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateL7ruleRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateL7ruleRequestBody getBody() {
        return body;
    }

    public void setBody(CreateL7ruleRequestBody body) {
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
        CreateL7ruleRequest createL7ruleRequest = (CreateL7ruleRequest) o;
        return Objects.equals(this.l7policyId, createL7ruleRequest.l7policyId)
            && Objects.equals(this.body, createL7ruleRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(l7policyId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateL7ruleRequest {\n");
        sb.append("    l7policyId: ").append(toIndentedString(l7policyId)).append("\n");
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
