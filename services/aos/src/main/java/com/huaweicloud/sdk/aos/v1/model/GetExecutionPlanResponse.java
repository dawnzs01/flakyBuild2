package com.huaweicloud.sdk.aos.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.ExecutionPlanItem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class GetExecutionPlanResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execution_plan_items")
    
    private List<ExecutionPlanItem> executionPlanItems = null;
    
    public GetExecutionPlanResponse withExecutionPlanItems(List<ExecutionPlanItem> executionPlanItems) {
        this.executionPlanItems = executionPlanItems;
        return this;
    }

    
    public GetExecutionPlanResponse addExecutionPlanItemsItem(ExecutionPlanItem executionPlanItemsItem) {
        if(this.executionPlanItems == null) {
            this.executionPlanItems = new ArrayList<>();
        }
        this.executionPlanItems.add(executionPlanItemsItem);
        return this;
    }

    public GetExecutionPlanResponse withExecutionPlanItems(Consumer<List<ExecutionPlanItem>> executionPlanItemsSetter) {
        if(this.executionPlanItems == null) {
            this.executionPlanItems = new ArrayList<>();
        }
        executionPlanItemsSetter.accept(this.executionPlanItems);
        return this;
    }

    /**
     * 执行计划项目的列表
     * @return executionPlanItems
     */
    public List<ExecutionPlanItem> getExecutionPlanItems() {
        return executionPlanItems;
    }

    public void setExecutionPlanItems(List<ExecutionPlanItem> executionPlanItems) {
        this.executionPlanItems = executionPlanItems;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetExecutionPlanResponse getExecutionPlanResponse = (GetExecutionPlanResponse) o;
        return Objects.equals(this.executionPlanItems, getExecutionPlanResponse.executionPlanItems);
    }
    @Override
    public int hashCode() {
        return Objects.hash(executionPlanItems);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetExecutionPlanResponse {\n");
        sb.append("    executionPlanItems: ").append(toIndentedString(executionPlanItems)).append("\n");
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

