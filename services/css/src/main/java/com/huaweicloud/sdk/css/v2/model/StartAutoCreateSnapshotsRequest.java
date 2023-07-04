package com.huaweicloud.sdk.css.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class StartAutoCreateSnapshotsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private StartAutoCreateSnapshotsReq body;

    public StartAutoCreateSnapshotsRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 快照所属的集群的ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public StartAutoCreateSnapshotsRequest withBody(StartAutoCreateSnapshotsReq body) {
        this.body = body;
        return this;
    }

    public StartAutoCreateSnapshotsRequest withBody(Consumer<StartAutoCreateSnapshotsReq> bodySetter) {
        if (this.body == null) {
            this.body = new StartAutoCreateSnapshotsReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public StartAutoCreateSnapshotsReq getBody() {
        return body;
    }

    public void setBody(StartAutoCreateSnapshotsReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartAutoCreateSnapshotsRequest startAutoCreateSnapshotsRequest = (StartAutoCreateSnapshotsRequest) o;
        return Objects.equals(this.clusterId, startAutoCreateSnapshotsRequest.clusterId)
            && Objects.equals(this.body, startAutoCreateSnapshotsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartAutoCreateSnapshotsRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
