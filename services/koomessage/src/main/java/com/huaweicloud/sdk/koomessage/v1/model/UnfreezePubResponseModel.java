package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 解绑服务号返回体。
 */
public class UnfreezePubResponseModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private FreezePubResponseModelData data;

    public UnfreezePubResponseModel withData(FreezePubResponseModelData data) {
        this.data = data;
        return this;
    }

    public UnfreezePubResponseModel withData(Consumer<FreezePubResponseModelData> dataSetter) {
        if (this.data == null) {
            this.data = new FreezePubResponseModelData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public FreezePubResponseModelData getData() {
        return data;
    }

    public void setData(FreezePubResponseModelData data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnfreezePubResponseModel unfreezePubResponseModel = (UnfreezePubResponseModel) o;
        return Objects.equals(this.data, unfreezePubResponseModel.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnfreezePubResponseModel {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
