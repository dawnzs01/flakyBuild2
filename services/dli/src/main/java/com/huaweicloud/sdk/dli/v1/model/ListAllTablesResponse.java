package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAllTablesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_count")

    private Integer tableCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private List<Table> tables = null;

    public ListAllTablesResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 执行请求是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ListAllTablesResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，信息可能为空。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListAllTablesResponse withTableCount(Integer tableCount) {
        this.tableCount = tableCount;
        return this;
    }

    /**
     * 表的总个数。
     * @return tableCount
     */
    public Integer getTableCount() {
        return tableCount;
    }

    public void setTableCount(Integer tableCount) {
        this.tableCount = tableCount;
    }

    public ListAllTablesResponse withTables(List<Table> tables) {
        this.tables = tables;
        return this;
    }

    public ListAllTablesResponse addTablesItem(Table tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public ListAllTablesResponse withTables(Consumer<List<Table>> tablesSetter) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        tablesSetter.accept(this.tables);
        return this;
    }

    /**
     * 表的信息。
     * @return tables
     */
    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAllTablesResponse listAllTablesResponse = (ListAllTablesResponse) o;
        return Objects.equals(this.isSuccess, listAllTablesResponse.isSuccess)
            && Objects.equals(this.message, listAllTablesResponse.message)
            && Objects.equals(this.tableCount, listAllTablesResponse.tableCount)
            && Objects.equals(this.tables, listAllTablesResponse.tables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, tableCount, tables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllTablesResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    tableCount: ").append(toIndentedString(tableCount)).append("\n");
        sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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
