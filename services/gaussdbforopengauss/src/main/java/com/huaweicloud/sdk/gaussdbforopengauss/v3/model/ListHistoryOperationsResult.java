package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 参数修改历史记录明细信息。
 */
public class ListHistoryOperationsResult  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameter_name")
    

    private String parameterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="old_value")
    

    private String oldValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="new_value")
    

    private String newValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_result")
    

    private String updateResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    

    private String updatedAt;

    public ListHistoryOperationsResult withParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    


    /**
     * 参数名称。
     * @return parameterName
     */
    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    

    public ListHistoryOperationsResult withOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    


    /**
     * 修改前参数值。
     * @return oldValue
     */
    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    

    public ListHistoryOperationsResult withNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    


    /**
     * 修改后参数值。
     * @return newValue
     */
    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    

    public ListHistoryOperationsResult withUpdateResult(String updateResult) {
        this.updateResult = updateResult;
        return this;
    }

    


    /**
     * 修改状态 (SUCCESS | FAILED)。
     * @return updateResult
     */
    public String getUpdateResult() {
        return updateResult;
    }

    public void setUpdateResult(String updateResult) {
        this.updateResult = updateResult;
    }

    

    public ListHistoryOperationsResult withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 修改时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHistoryOperationsResult listHistoryOperationsResult = (ListHistoryOperationsResult) o;
        return Objects.equals(this.parameterName, listHistoryOperationsResult.parameterName) &&
            Objects.equals(this.oldValue, listHistoryOperationsResult.oldValue) &&
            Objects.equals(this.newValue, listHistoryOperationsResult.newValue) &&
            Objects.equals(this.updateResult, listHistoryOperationsResult.updateResult) &&
            Objects.equals(this.updatedAt, listHistoryOperationsResult.updatedAt);
    }
    @Override
    public int hashCode() {
        return Objects.hash(parameterName, oldValue, newValue, updateResult, updatedAt);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHistoryOperationsResult {\n");
        sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
        sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
        sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
        sb.append("    updateResult: ").append(toIndentedString(updateResult)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

