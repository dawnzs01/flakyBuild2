package com.huaweicloud.sdk.waf.v1.model;

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
public class ListAntitamperRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<AntiTamperRuleResponseBody> items = null;

    public ListAntitamperRuleResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 网页防篡改规则总条数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListAntitamperRuleResponse withItems(List<AntiTamperRuleResponseBody> items) {
        this.items = items;
        return this;
    }

    public ListAntitamperRuleResponse addItemsItem(AntiTamperRuleResponseBody itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListAntitamperRuleResponse withItems(Consumer<List<AntiTamperRuleResponseBody>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 网页防篡改规则数组
     * @return items
     */
    public List<AntiTamperRuleResponseBody> getItems() {
        return items;
    }

    public void setItems(List<AntiTamperRuleResponseBody> items) {
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
        ListAntitamperRuleResponse listAntitamperRuleResponse = (ListAntitamperRuleResponse) o;
        return Objects.equals(this.total, listAntitamperRuleResponse.total)
            && Objects.equals(this.items, listAntitamperRuleResponse.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAntitamperRuleResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
