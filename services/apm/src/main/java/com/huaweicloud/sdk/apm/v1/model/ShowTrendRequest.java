package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowTrendRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-business-id")

    private Long xBusinessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private TrendParam body;

    public ShowTrendRequest withXBusinessId(Long xBusinessId) {
        this.xBusinessId = xBusinessId;
        return this;
    }

    /**
     * 应用id。
     * @return xBusinessId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-business-id")
    public Long getXBusinessId() {
        return xBusinessId;
    }

    public void setXBusinessId(Long xBusinessId) {
        this.xBusinessId = xBusinessId;
    }

    public ShowTrendRequest withBody(TrendParam body) {
        this.body = body;
        return this;
    }

    public ShowTrendRequest withBody(Consumer<TrendParam> bodySetter) {
        if (this.body == null) {
            this.body = new TrendParam();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public TrendParam getBody() {
        return body;
    }

    public void setBody(TrendParam body) {
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
        ShowTrendRequest showTrendRequest = (ShowTrendRequest) o;
        return Objects.equals(this.xBusinessId, showTrendRequest.xBusinessId)
            && Objects.equals(this.body, showTrendRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xBusinessId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTrendRequest {\n");
        sb.append("    xBusinessId: ").append(toIndentedString(xBusinessId)).append("\n");
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
