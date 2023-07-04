package com.huaweicloud.sdk.dds.v3.model;

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
public class ListAuditlogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_record")

    private Integer totalRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_logs")

    private List<ListAuditlogsResult> auditLogs = null;

    public ListAuditlogsResponse withTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }

    /**
     * 总记录数。
     * @return totalRecord
     */
    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    public ListAuditlogsResponse withAuditLogs(List<ListAuditlogsResult> auditLogs) {
        this.auditLogs = auditLogs;
        return this;
    }

    public ListAuditlogsResponse addAuditLogsItem(ListAuditlogsResult auditLogsItem) {
        if (this.auditLogs == null) {
            this.auditLogs = new ArrayList<>();
        }
        this.auditLogs.add(auditLogsItem);
        return this;
    }

    public ListAuditlogsResponse withAuditLogs(Consumer<List<ListAuditlogsResult>> auditLogsSetter) {
        if (this.auditLogs == null) {
            this.auditLogs = new ArrayList<>();
        }
        auditLogsSetter.accept(this.auditLogs);
        return this;
    }

    /**
     * 审计日志具体信息。
     * @return auditLogs
     */
    public List<ListAuditlogsResult> getAuditLogs() {
        return auditLogs;
    }

    public void setAuditLogs(List<ListAuditlogsResult> auditLogs) {
        this.auditLogs = auditLogs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAuditlogsResponse listAuditlogsResponse = (ListAuditlogsResponse) o;
        return Objects.equals(this.totalRecord, listAuditlogsResponse.totalRecord)
            && Objects.equals(this.auditLogs, listAuditlogsResponse.auditLogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalRecord, auditLogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditlogsResponse {\n");
        sb.append("    totalRecord: ").append(toIndentedString(totalRecord)).append("\n");
        sb.append("    auditLogs: ").append(toIndentedString(auditLogs)).append("\n");
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
