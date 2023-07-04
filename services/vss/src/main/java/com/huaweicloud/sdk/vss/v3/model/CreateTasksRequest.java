package com.huaweicloud.sdk.vss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade")

    private Boolean upgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateTasksRequestBody body;

    public CreateTasksRequest withUpgrade(Boolean upgrade) {
        this.upgrade = upgrade;
        return this;
    }

    /**
     * 是否将本次扫描升级为专业版规格（￥99.00/次）
     * @return upgrade
     */
    public Boolean getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(Boolean upgrade) {
        this.upgrade = upgrade;
    }

    public CreateTasksRequest withBody(CreateTasksRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateTasksRequest withBody(Consumer<CreateTasksRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateTasksRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateTasksRequestBody getBody() {
        return body;
    }

    public void setBody(CreateTasksRequestBody body) {
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
        CreateTasksRequest createTasksRequest = (CreateTasksRequest) o;
        return Objects.equals(this.upgrade, createTasksRequest.upgrade)
            && Objects.equals(this.body, createTasksRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upgrade, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTasksRequest {\n");
        sb.append("    upgrade: ").append(toIndentedString(upgrade)).append("\n");
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
