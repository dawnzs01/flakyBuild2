package com.huaweicloud.sdk.dris.v1.model;

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
public class ListRsuModelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsu_models")

    private List<RsuModelSummary> rsuModels = null;

    public ListRsuModelsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数说明**：满足查询条件的记录总数。
     * minimum: 0
     * maximum: 20000
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListRsuModelsResponse withRsuModels(List<RsuModelSummary> rsuModels) {
        this.rsuModels = rsuModels;
        return this;
    }

    public ListRsuModelsResponse addRsuModelsItem(RsuModelSummary rsuModelsItem) {
        if (this.rsuModels == null) {
            this.rsuModels = new ArrayList<>();
        }
        this.rsuModels.add(rsuModelsItem);
        return this;
    }

    public ListRsuModelsResponse withRsuModels(Consumer<List<RsuModelSummary>> rsuModelsSetter) {
        if (this.rsuModels == null) {
            this.rsuModels = new ArrayList<>();
        }
        rsuModelsSetter.accept(this.rsuModels);
        return this;
    }

    /**
     * **参数说明**：RSU型号信息列表。
     * @return rsuModels
     */
    public List<RsuModelSummary> getRsuModels() {
        return rsuModels;
    }

    public void setRsuModels(List<RsuModelSummary> rsuModels) {
        this.rsuModels = rsuModels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRsuModelsResponse listRsuModelsResponse = (ListRsuModelsResponse) o;
        return Objects.equals(this.count, listRsuModelsResponse.count)
            && Objects.equals(this.rsuModels, listRsuModelsResponse.rsuModels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, rsuModels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRsuModelsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    rsuModels: ").append(toIndentedString(rsuModels)).append("\n");
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
