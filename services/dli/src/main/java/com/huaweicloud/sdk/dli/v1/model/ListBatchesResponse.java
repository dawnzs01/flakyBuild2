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
public class ListBatchesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Integer from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sessions")

    private List<ShowBatchJobDetailResp> sessions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public ListBatchesResponse withFrom(Integer from) {
        this.from = from;
        return this;
    }

    /**
     * 起始批处理作业的索引号。
     * @return from
     */
    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public ListBatchesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 返回批处理作业的总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListBatchesResponse withSessions(List<ShowBatchJobDetailResp> sessions) {
        this.sessions = sessions;
        return this;
    }

    public ListBatchesResponse addSessionsItem(ShowBatchJobDetailResp sessionsItem) {
        if (this.sessions == null) {
            this.sessions = new ArrayList<>();
        }
        this.sessions.add(sessionsItem);
        return this;
    }

    public ListBatchesResponse withSessions(Consumer<List<ShowBatchJobDetailResp>> sessionsSetter) {
        if (this.sessions == null) {
            this.sessions = new ArrayList<>();
        }
        sessionsSetter.accept(this.sessions);
        return this;
    }

    /**
     * 批处理作业信息。
     * @return sessions
     */
    public List<ShowBatchJobDetailResp> getSessions() {
        return sessions;
    }

    public void setSessions(List<ShowBatchJobDetailResp> sessions) {
        this.sessions = sessions;
    }

    public ListBatchesResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 批处理作业的创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBatchesResponse listBatchesResponse = (ListBatchesResponse) o;
        return Objects.equals(this.from, listBatchesResponse.from)
            && Objects.equals(this.total, listBatchesResponse.total)
            && Objects.equals(this.sessions, listBatchesResponse.sessions)
            && Objects.equals(this.createTime, listBatchesResponse.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, total, sessions, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBatchesResponse {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
