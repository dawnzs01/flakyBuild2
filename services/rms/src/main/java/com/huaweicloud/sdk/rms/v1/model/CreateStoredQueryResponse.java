package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateStoredQueryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private String expression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    public CreateStoredQueryResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ResourceQL ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateStoredQueryResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * ResourceQL 名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateStoredQueryResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * ResourceQL 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateStoredQueryResponse withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * ResourceQL 表达式
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public CreateStoredQueryResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * ResourceQL 创建时间
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public CreateStoredQueryResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * ResourceQL 更新时间
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateStoredQueryResponse createStoredQueryResponse = (CreateStoredQueryResponse) o;
        return Objects.equals(this.id, createStoredQueryResponse.id)
            && Objects.equals(this.name, createStoredQueryResponse.name)
            && Objects.equals(this.description, createStoredQueryResponse.description)
            && Objects.equals(this.expression, createStoredQueryResponse.expression)
            && Objects.equals(this.created, createStoredQueryResponse.created)
            && Objects.equals(this.updated, createStoredQueryResponse.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, expression, created, updated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStoredQueryResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
