package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateConfigurationAggregatorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregator_id")

    private String aggregatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ConfigurationAggregatorRequest body;

    public UpdateConfigurationAggregatorRequest withAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }

    /**
     * 资源聚合器ID。
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return aggregatorId;
    }

    public void setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
    }

    public UpdateConfigurationAggregatorRequest withBody(ConfigurationAggregatorRequest body) {
        this.body = body;
        return this;
    }

    public UpdateConfigurationAggregatorRequest withBody(Consumer<ConfigurationAggregatorRequest> bodySetter) {
        if (this.body == null) {
            this.body = new ConfigurationAggregatorRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ConfigurationAggregatorRequest getBody() {
        return body;
    }

    public void setBody(ConfigurationAggregatorRequest body) {
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
        UpdateConfigurationAggregatorRequest updateConfigurationAggregatorRequest =
            (UpdateConfigurationAggregatorRequest) o;
        return Objects.equals(this.aggregatorId, updateConfigurationAggregatorRequest.aggregatorId)
            && Objects.equals(this.body, updateConfigurationAggregatorRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregatorId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConfigurationAggregatorRequest {\n");
        sb.append("    aggregatorId: ").append(toIndentedString(aggregatorId)).append("\n");
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
