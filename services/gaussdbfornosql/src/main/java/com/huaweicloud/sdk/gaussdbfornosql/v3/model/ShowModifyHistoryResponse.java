package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class ShowModifyHistoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "histories")

    private List<ConfigurationHistoryRsp> histories = null;

    public ShowModifyHistoryResponse withHistories(List<ConfigurationHistoryRsp> histories) {
        this.histories = histories;
        return this;
    }

    public ShowModifyHistoryResponse addHistoriesItem(ConfigurationHistoryRsp historiesItem) {
        if (this.histories == null) {
            this.histories = new ArrayList<>();
        }
        this.histories.add(historiesItem);
        return this;
    }

    public ShowModifyHistoryResponse withHistories(Consumer<List<ConfigurationHistoryRsp>> historiesSetter) {
        if (this.histories == null) {
            this.histories = new ArrayList<>();
        }
        historiesSetter.accept(this.histories);
        return this;
    }

    /**
     * 实例参数的修改历史列表
     * @return histories
     */
    public List<ConfigurationHistoryRsp> getHistories() {
        return histories;
    }

    public void setHistories(List<ConfigurationHistoryRsp> histories) {
        this.histories = histories;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowModifyHistoryResponse showModifyHistoryResponse = (ShowModifyHistoryResponse) o;
        return Objects.equals(this.histories, showModifyHistoryResponse.histories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(histories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowModifyHistoryResponse {\n");
        sb.append("    histories: ").append(toIndentedString(histories)).append("\n");
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
