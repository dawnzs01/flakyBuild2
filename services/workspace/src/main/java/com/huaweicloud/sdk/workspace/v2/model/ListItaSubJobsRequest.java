package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListItaSubJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListItaSubJobsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态 - SUCCESS：成功。 - RUNNING：运行中。 - FAILED：失败。 - WAITING：等待。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListItaSubJobsRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListItaSubJobsRequest withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 任务类型  - createDesktops：创建桌面任务。  - applyWorkspace：开通云桌面服务。  - cancelWorkspace：注销云桌面服务。  - expandVolumes:  扩容磁盘。  - addVolumes: 添加磁盘。
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public ListItaSubJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 用于分页查询，取值范围0~1000，默认1000。
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListItaSubJobsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 用于分页查询，查询的起始记录序号，从0开始。
     * minimum: 0
     * maximum: 10000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListItaSubJobsRequest listItaSubJobsRequest = (ListItaSubJobsRequest) o;
        return Objects.equals(this.status, listItaSubJobsRequest.status)
            && Objects.equals(this.jobId, listItaSubJobsRequest.jobId)
            && Objects.equals(this.jobType, listItaSubJobsRequest.jobType)
            && Objects.equals(this.limit, listItaSubJobsRequest.limit)
            && Objects.equals(this.offset, listItaSubJobsRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, jobId, jobType, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListItaSubJobsRequest {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
