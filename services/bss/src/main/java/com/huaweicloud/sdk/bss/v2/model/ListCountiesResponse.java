package com.huaweicloud.sdk.bss.v2.model;

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
public class ListCountiesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "counties")

    private List<County> counties = null;

    public ListCountiesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 查询个数，成功的时候返回。
     * minimum: 0
     * maximum: 1000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListCountiesResponse withCounties(List<County> counties) {
        this.counties = counties;
        return this;
    }

    public ListCountiesResponse addCountiesItem(County countiesItem) {
        if (this.counties == null) {
            this.counties = new ArrayList<>();
        }
        this.counties.add(countiesItem);
        return this;
    }

    public ListCountiesResponse withCounties(Consumer<List<County>> countiesSetter) {
        if (this.counties == null) {
            this.counties = new ArrayList<>();
        }
        countiesSetter.accept(this.counties);
        return this;
    }

    /**
     * 区县信息列表，成功的时候返回，具体参见表2。
     * @return counties
     */
    public List<County> getCounties() {
        return counties;
    }

    public void setCounties(List<County> counties) {
        this.counties = counties;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCountiesResponse listCountiesResponse = (ListCountiesResponse) o;
        return Objects.equals(this.count, listCountiesResponse.count)
            && Objects.equals(this.counties, listCountiesResponse.counties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, counties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCountiesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    counties: ").append(toIndentedString(counties)).append("\n");
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
