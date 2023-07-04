package com.huaweicloud.sdk.ges.v2.model;





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
public class StartGraph2Response extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    

    private String jobId;

    public StartGraph2Response withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 启动图任务ID。请求失败时字段为空。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartGraph2Response startGraph2Response = (StartGraph2Response) o;
        return Objects.equals(this.jobId, startGraph2Response.jobId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartGraph2Response {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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

