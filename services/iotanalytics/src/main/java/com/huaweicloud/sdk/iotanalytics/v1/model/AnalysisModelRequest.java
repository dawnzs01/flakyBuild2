package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分析任务
 */
public class AnalysisModelRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transform")

    private TransformModel transform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregate")

    private AggregateModel aggregate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private StreamModel stream;

    public AnalysisModelRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分析任务名称，正则：\"^[a-zA-Z][a-zA-Z0-9_]{0,63}$\"
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnalysisModelRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 分析任务显示名称，正则：\"^[\\\\u4E00-\\\\u9FA5A-Za-z0-9_@#.-]{1,64}$\"
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public AnalysisModelRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 分析任务类型，转换计算（transform）、聚合计算（aggregate）、流计算（stream）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AnalysisModelRequest withTransform(TransformModel transform) {
        this.transform = transform;
        return this;
    }

    public AnalysisModelRequest withTransform(Consumer<TransformModel> transformSetter) {
        if (this.transform == null) {
            this.transform = new TransformModel();
            transformSetter.accept(this.transform);
        }

        return this;
    }

    /**
     * Get transform
     * @return transform
     */
    public TransformModel getTransform() {
        return transform;
    }

    public void setTransform(TransformModel transform) {
        this.transform = transform;
    }

    public AnalysisModelRequest withAggregate(AggregateModel aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    public AnalysisModelRequest withAggregate(Consumer<AggregateModel> aggregateSetter) {
        if (this.aggregate == null) {
            this.aggregate = new AggregateModel();
            aggregateSetter.accept(this.aggregate);
        }

        return this;
    }

    /**
     * Get aggregate
     * @return aggregate
     */
    public AggregateModel getAggregate() {
        return aggregate;
    }

    public void setAggregate(AggregateModel aggregate) {
        this.aggregate = aggregate;
    }

    public AnalysisModelRequest withStream(StreamModel stream) {
        this.stream = stream;
        return this;
    }

    public AnalysisModelRequest withStream(Consumer<StreamModel> streamSetter) {
        if (this.stream == null) {
            this.stream = new StreamModel();
            streamSetter.accept(this.stream);
        }

        return this;
    }

    /**
     * Get stream
     * @return stream
     */
    public StreamModel getStream() {
        return stream;
    }

    public void setStream(StreamModel stream) {
        this.stream = stream;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnalysisModelRequest analysisModelRequest = (AnalysisModelRequest) o;
        return Objects.equals(this.name, analysisModelRequest.name)
            && Objects.equals(this.displayName, analysisModelRequest.displayName)
            && Objects.equals(this.type, analysisModelRequest.type)
            && Objects.equals(this.transform, analysisModelRequest.transform)
            && Objects.equals(this.aggregate, analysisModelRequest.aggregate)
            && Objects.equals(this.stream, analysisModelRequest.stream);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, displayName, type, transform, aggregate, stream);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalysisModelRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
        sb.append("    aggregate: ").append(toIndentedString(aggregate)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
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
