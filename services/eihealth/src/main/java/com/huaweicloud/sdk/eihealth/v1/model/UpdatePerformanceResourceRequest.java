package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePerformanceResourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePerformanceResourceReq body;

    public UpdatePerformanceResourceRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 性能加速ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdatePerformanceResourceRequest withBody(UpdatePerformanceResourceReq body) {
        this.body = body;
        return this;
    }

    public UpdatePerformanceResourceRequest withBody(Consumer<UpdatePerformanceResourceReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePerformanceResourceReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePerformanceResourceReq getBody() {
        return body;
    }

    public void setBody(UpdatePerformanceResourceReq body) {
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
        UpdatePerformanceResourceRequest updatePerformanceResourceRequest = (UpdatePerformanceResourceRequest) o;
        return Objects.equals(this.id, updatePerformanceResourceRequest.id)
            && Objects.equals(this.body, updatePerformanceResourceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePerformanceResourceRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
