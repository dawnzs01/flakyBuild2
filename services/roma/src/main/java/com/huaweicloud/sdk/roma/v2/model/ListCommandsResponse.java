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
public class ListCommandsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<Command> items = null;

    public ListCommandsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 1
     * maximum: 999999999999999999
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListCommandsResponse withSize(Integer size) {
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

    public ListCommandsResponse withItems(List<Command> items) {
        this.items = items;
        return this;
    }

    public ListCommandsResponse addItemsItem(Command itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListCommandsResponse withItems(Consumer<List<Command>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 命令列表
     * @return items
     */
    public List<Command> getItems() {
        return items;
    }

    public void setItems(List<Command> items) {
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
        ListCommandsResponse listCommandsResponse = (ListCommandsResponse) o;
        return Objects.equals(this.total, listCommandsResponse.total)
            && Objects.equals(this.size, listCommandsResponse.size)
            && Objects.equals(this.items, listCommandsResponse.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, size, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCommandsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
