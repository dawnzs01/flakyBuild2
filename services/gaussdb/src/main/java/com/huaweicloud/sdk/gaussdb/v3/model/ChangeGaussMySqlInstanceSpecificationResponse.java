package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ChangeGaussMySqlInstanceSpecificationResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    

    private String orderId;

    public ChangeGaussMySqlInstanceSpecificationResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 规格变更的任务ID，仅变更按需实例时会返回该参数
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public ChangeGaussMySqlInstanceSpecificationResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * 订单ID，仅变更包周期实例时会返回该参数
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeGaussMySqlInstanceSpecificationResponse changeGaussMySqlInstanceSpecificationResponse = (ChangeGaussMySqlInstanceSpecificationResponse) o;
        return Objects.equals(this.jobId, changeGaussMySqlInstanceSpecificationResponse.jobId) &&
            Objects.equals(this.orderId, changeGaussMySqlInstanceSpecificationResponse.orderId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, orderId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeGaussMySqlInstanceSpecificationResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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

