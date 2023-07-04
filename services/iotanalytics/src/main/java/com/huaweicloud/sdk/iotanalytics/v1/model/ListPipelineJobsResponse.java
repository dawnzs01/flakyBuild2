package com.huaweicloud.sdk.iotanalytics.v1.model;

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
public class ListPipelineJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipelines")

    private List<PipelineJobInfoDto> pipelines = null;

    public ListPipelineJobsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListPipelineJobsResponse withPipelines(List<PipelineJobInfoDto> pipelines) {
        this.pipelines = pipelines;
        return this;
    }

    public ListPipelineJobsResponse addPipelinesItem(PipelineJobInfoDto pipelinesItem) {
        if (this.pipelines == null) {
            this.pipelines = new ArrayList<>();
        }
        this.pipelines.add(pipelinesItem);
        return this;
    }

    public ListPipelineJobsResponse withPipelines(Consumer<List<PipelineJobInfoDto>> pipelinesSetter) {
        if (this.pipelines == null) {
            this.pipelines = new ArrayList<>();
        }
        pipelinesSetter.accept(this.pipelines);
        return this;
    }

    /**
     * 管道列表
     * @return pipelines
     */
    public List<PipelineJobInfoDto> getPipelines() {
        return pipelines;
    }

    public void setPipelines(List<PipelineJobInfoDto> pipelines) {
        this.pipelines = pipelines;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPipelineJobsResponse listPipelineJobsResponse = (ListPipelineJobsResponse) o;
        return Objects.equals(this.count, listPipelineJobsResponse.count)
            && Objects.equals(this.pipelines, listPipelineJobsResponse.pipelines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, pipelines);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelineJobsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    pipelines: ").append(toIndentedString(pipelines)).append("\n");
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
