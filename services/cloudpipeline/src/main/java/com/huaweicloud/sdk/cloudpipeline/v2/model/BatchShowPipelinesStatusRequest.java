package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class BatchShowPipelinesStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_ids")

    private String pipelineIds;

    public BatchShowPipelinesStatusRequest withPipelineIds(String pipelineIds) {
        this.pipelineIds = pipelineIds;
        return this;
    }

    /**
     * 要获取状态的流水线ID，用逗号隔开
     * @return pipelineIds
     */
    public String getPipelineIds() {
        return pipelineIds;
    }

    public void setPipelineIds(String pipelineIds) {
        this.pipelineIds = pipelineIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchShowPipelinesStatusRequest batchShowPipelinesStatusRequest = (BatchShowPipelinesStatusRequest) o;
        return Objects.equals(this.pipelineIds, batchShowPipelinesStatusRequest.pipelineIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowPipelinesStatusRequest {\n");
        sb.append("    pipelineIds: ").append(toIndentedString(pipelineIds)).append("\n");
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
