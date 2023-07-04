package com.huaweicloud.sdk.dli.v1.model;

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
public class ListElasticResourcePoolScaleRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<List<Object>> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Auth-Token")

    private String xAuthToken;

    public ListElasticResourcePoolScaleRecordsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 返回数组长度
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListElasticResourcePoolScaleRecordsResponse withItems(List<List<Object>> items) {
        this.items = items;
        return this;
    }

    public ListElasticResourcePoolScaleRecordsResponse addItemsItem(List<Object> itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListElasticResourcePoolScaleRecordsResponse withItems(Consumer<List<List<Object>>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 数组中返回的数据
     * @return items
     */
    public List<List<Object>> getItems() {
        return items;
    }

    public void setItems(List<List<Object>> items) {
        this.items = items;
    }

    public ListElasticResourcePoolScaleRecordsResponse withXAuthToken(String xAuthToken) {
        this.xAuthToken = xAuthToken;
        return this;
    }

    /**
     * Get xAuthToken
     * @return xAuthToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Auth-Token")
    public String getXAuthToken() {
        return xAuthToken;
    }

    public void setXAuthToken(String xAuthToken) {
        this.xAuthToken = xAuthToken;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListElasticResourcePoolScaleRecordsResponse listElasticResourcePoolScaleRecordsResponse =
            (ListElasticResourcePoolScaleRecordsResponse) o;
        return Objects.equals(this.count, listElasticResourcePoolScaleRecordsResponse.count)
            && Objects.equals(this.items, listElasticResourcePoolScaleRecordsResponse.items)
            && Objects.equals(this.xAuthToken, listElasticResourcePoolScaleRecordsResponse.xAuthToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items, xAuthToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListElasticResourcePoolScaleRecordsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    xAuthToken: ").append(toIndentedString(xAuthToken)).append("\n");
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
