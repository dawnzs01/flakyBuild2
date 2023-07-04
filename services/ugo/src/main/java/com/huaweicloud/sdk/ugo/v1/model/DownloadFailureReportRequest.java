package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.progress.ProgressListener;
import com.huaweicloud.sdk.core.progress.ProgressRequest;

import java.util.Objects;

/**
 * Request Object
 */
public class DownloadFailureReportRequest implements ProgressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_project_id")

    private String migrationProjectId;

    private ProgressListener progressListener;

    private long progressInterval;

    @Override
    public void setProgressListener(ProgressListener progressListener) {
        this.progressListener = progressListener;
    }

    @Override
    public ProgressListener getProgressListener() {
        return progressListener;
    }

    @Override
    public void setProgressInterval(long progressInterval) {
        this.progressInterval = progressInterval;
    }

    @Override
    public long getProgressInterval() {
        return progressInterval;
    }

    public DownloadFailureReportRequest withMigrationProjectId(String migrationProjectId) {
        this.migrationProjectId = migrationProjectId;
        return this;
    }

    /**
     * 迁移项目ID。
     * @return migrationProjectId
     */
    public String getMigrationProjectId() {
        return migrationProjectId;
    }

    public void setMigrationProjectId(String migrationProjectId) {
        this.migrationProjectId = migrationProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadFailureReportRequest downloadFailureReportRequest = (DownloadFailureReportRequest) o;
        return Objects.equals(this.migrationProjectId, downloadFailureReportRequest.migrationProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrationProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadFailureReportRequest {\n");
        sb.append("    migrationProjectId: ").append(toIndentedString(migrationProjectId)).append("\n");
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
