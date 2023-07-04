package com.huaweicloud.sdk.roma.v2.model;

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
public class ShowDeviceGroupTreeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<GroupTreeResponse> items = null;

    public ShowDeviceGroupTreeResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 本次返回数量
     * minimum: 1
     * maximum: 9999
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ShowDeviceGroupTreeResponse withItems(List<GroupTreeResponse> items) {
        this.items = items;
        return this;
    }

    public ShowDeviceGroupTreeResponse addItemsItem(GroupTreeResponse itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ShowDeviceGroupTreeResponse withItems(Consumer<List<GroupTreeResponse>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 设备分组信息
     * @return items
     */
    public List<GroupTreeResponse> getItems() {
        return items;
    }

    public void setItems(List<GroupTreeResponse> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDeviceGroupTreeResponse showDeviceGroupTreeResponse = (ShowDeviceGroupTreeResponse) o;
        return Objects.equals(this.size, showDeviceGroupTreeResponse.size)
            && Objects.equals(this.items, showDeviceGroupTreeResponse.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeviceGroupTreeResponse {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
