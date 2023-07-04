package com.huaweicloud.sdk.ivs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 调用返回结果。
 */
public class IvsExtentionByIdCardImageResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resp_data")

    private List<ExtentionRespDataByIdCardImage> respData = null;

    public IvsExtentionByIdCardImageResponseBodyResult withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 子服务名称。
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public IvsExtentionByIdCardImageResponseBodyResult withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 成功的结果数量，与resp_data字段对应。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public IvsExtentionByIdCardImageResponseBodyResult withRespData(List<ExtentionRespDataByIdCardImage> respData) {
        this.respData = respData;
        return this;
    }

    public IvsExtentionByIdCardImageResponseBodyResult addRespDataItem(ExtentionRespDataByIdCardImage respDataItem) {
        if (this.respData == null) {
            this.respData = new ArrayList<>();
        }
        this.respData.add(respDataItem);
        return this;
    }

    public IvsExtentionByIdCardImageResponseBodyResult withRespData(
        Consumer<List<ExtentionRespDataByIdCardImage>> respDataSetter) {
        if (this.respData == null) {
            this.respData = new ArrayList<>();
        }
        respDataSetter.accept(this.respData);
        return this;
    }

    /**
     * 请求列表，用于支持批量调用。目前暂时只支持单个数据查询。
     * @return respData
     */
    public List<ExtentionRespDataByIdCardImage> getRespData() {
        return respData;
    }

    public void setRespData(List<ExtentionRespDataByIdCardImage> respData) {
        this.respData = respData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IvsExtentionByIdCardImageResponseBodyResult ivsExtentionByIdCardImageResponseBodyResult =
            (IvsExtentionByIdCardImageResponseBodyResult) o;
        return Objects.equals(this.serviceName, ivsExtentionByIdCardImageResponseBodyResult.serviceName)
            && Objects.equals(this.count, ivsExtentionByIdCardImageResponseBodyResult.count)
            && Objects.equals(this.respData, ivsExtentionByIdCardImageResponseBodyResult.respData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName, count, respData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IvsExtentionByIdCardImageResponseBodyResult {\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    respData: ").append(toIndentedString(respData)).append("\n");
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
