package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAttackLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private HttpQueryCfwAttackLogsResponseDTOData data;

    public ListAttackLogsResponse withData(HttpQueryCfwAttackLogsResponseDTOData data) {
        this.data = data;
        return this;
    }

    public ListAttackLogsResponse withData(Consumer<HttpQueryCfwAttackLogsResponseDTOData> dataSetter) {
        if (this.data == null) {
            this.data = new HttpQueryCfwAttackLogsResponseDTOData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public HttpQueryCfwAttackLogsResponseDTOData getData() {
        return data;
    }

    public void setData(HttpQueryCfwAttackLogsResponseDTOData data) {
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
        ListAttackLogsResponse listAttackLogsResponse = (ListAttackLogsResponse) o;
        return Objects.equals(this.data, listAttackLogsResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAttackLogsResponse {\n");
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
