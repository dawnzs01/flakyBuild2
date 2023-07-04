package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDatabaseOwnerRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateOwnerRequestBody body;

    public UpdateDatabaseOwnerRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 删除的数据库名称。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public UpdateDatabaseOwnerRequest withBody(UpdateOwnerRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateDatabaseOwnerRequest withBody(Consumer<UpdateOwnerRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateOwnerRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateOwnerRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateOwnerRequestBody body) {
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
        UpdateDatabaseOwnerRequest updateDatabaseOwnerRequest = (UpdateDatabaseOwnerRequest) o;
        return Objects.equals(this.databaseName, updateDatabaseOwnerRequest.databaseName)
            && Objects.equals(this.body, updateDatabaseOwnerRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDatabaseOwnerRequest {\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
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
