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
public class ListGlobalValuesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_vars")

    private List<ListGlobalValue> globalVars = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListGlobalValuesResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 请求执行是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ListGlobalValuesResponse withMessage(String message) {
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

    public ListGlobalValuesResponse withGlobalVars(List<ListGlobalValue> globalVars) {
        this.globalVars = globalVars;
        return this;
    }

    public ListGlobalValuesResponse addGlobalVarsItem(ListGlobalValue globalVarsItem) {
        if (this.globalVars == null) {
            this.globalVars = new ArrayList<>();
        }
        this.globalVars.add(globalVarsItem);
        return this;
    }

    public ListGlobalValuesResponse withGlobalVars(Consumer<List<ListGlobalValue>> globalVarsSetter) {
        if (this.globalVars == null) {
            this.globalVars = new ArrayList<>();
        }
        globalVarsSetter.accept(this.globalVars);
        return this;
    }

    /**
     * 全局变量
     * @return globalVars
     */
    public List<ListGlobalValue> getGlobalVars() {
        return globalVars;
    }

    public void setGlobalVars(List<ListGlobalValue> globalVars) {
        this.globalVars = globalVars;
    }

    public ListGlobalValuesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 全局变量总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListGlobalValuesResponse listGlobalValuesResponse = (ListGlobalValuesResponse) o;
        return Objects.equals(this.isSuccess, listGlobalValuesResponse.isSuccess)
            && Objects.equals(this.message, listGlobalValuesResponse.message)
            && Objects.equals(this.globalVars, listGlobalValuesResponse.globalVars)
            && Objects.equals(this.count, listGlobalValuesResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, globalVars, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalValuesResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    globalVars: ").append(toIndentedString(globalVars)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
