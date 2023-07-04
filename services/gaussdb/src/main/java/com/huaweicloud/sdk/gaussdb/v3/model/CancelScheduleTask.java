package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 取消定时任务请求体
 */
public class CancelScheduleTask  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_ids")
    
    private List<String> jobIds = null;
    
    public CancelScheduleTask withJobIds(List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }

    
    public CancelScheduleTask addJobIdsItem(String jobIdsItem) {
        if(this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        this.jobIds.add(jobIdsItem);
        return this;
    }

    public CancelScheduleTask withJobIds(Consumer<List<String>> jobIdsSetter) {
        if(this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        jobIdsSetter.accept(this.jobIds);
        return this;
    }

    /**
     * 任务ID。
     * @return jobIds
     */
    public List<String> getJobIds() {
        return jobIds;
    }

    public void setJobIds(List<String> jobIds) {
        this.jobIds = jobIds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CancelScheduleTask cancelScheduleTask = (CancelScheduleTask) o;
        return Objects.equals(this.jobIds, cancelScheduleTask.jobIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelScheduleTask {\n");
        sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
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

