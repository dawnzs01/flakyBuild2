package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ShowTaskInstanceMetricDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_points")

    private List<DataPointDto> dataPoints = null;

    public ShowTaskInstanceMetricDataResponse withDataPoints(List<DataPointDto> dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }

    public ShowTaskInstanceMetricDataResponse addDataPointsItem(DataPointDto dataPointsItem) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        this.dataPoints.add(dataPointsItem);
        return this;
    }

    public ShowTaskInstanceMetricDataResponse withDataPoints(Consumer<List<DataPointDto>> dataPointsSetter) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        dataPointsSetter.accept(this.dataPoints);
        return this;
    }

    /**
     * 监控数据列表
     * @return dataPoints
     */
    public List<DataPointDto> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<DataPointDto> dataPoints) {
        this.dataPoints = dataPoints;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTaskInstanceMetricDataResponse showTaskInstanceMetricDataResponse = (ShowTaskInstanceMetricDataResponse) o;
        return Objects.equals(this.dataPoints, showTaskInstanceMetricDataResponse.dataPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataPoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskInstanceMetricDataResponse {\n");
        sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
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
