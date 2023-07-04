package com.huaweicloud.sdk.dlf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StartJobReq
 */
public class StartJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobParams")

    private List<JobParam> jobParams = null;

    public StartJobReq withJobParams(List<JobParam> jobParams) {
        this.jobParams = jobParams;
        return this;
    }

    public StartJobReq addJobParamsItem(JobParam jobParamsItem) {
        if (this.jobParams == null) {
            this.jobParams = new ArrayList<>();
        }
        this.jobParams.add(jobParamsItem);
        return this;
    }

    public StartJobReq withJobParams(Consumer<List<JobParam>> jobParamsSetter) {
        if (this.jobParams == null) {
            this.jobParams = new ArrayList<>();
        }
        jobParamsSetter.accept(this.jobParams);
        return this;
    }

    /**
     * Get jobParams
     * @return jobParams
     */
    public List<JobParam> getJobParams() {
        return jobParams;
    }

    public void setJobParams(List<JobParam> jobParams) {
        this.jobParams = jobParams;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartJobReq startJobReq = (StartJobReq) o;
        return Objects.equals(this.jobParams, startJobReq.jobParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartJobReq {\n");
        sb.append("    jobParams: ").append(toIndentedString(jobParams)).append("\n");
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
