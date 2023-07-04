package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeletePendingAggregationRequestRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requester_account_id")

    private String requesterAccountId;

    public DeletePendingAggregationRequestRequest withRequesterAccountId(String requesterAccountId) {
        this.requesterAccountId = requesterAccountId;
        return this;
    }

    /**
     * 请求聚合数据的帐号ID。
     * @return requesterAccountId
     */
    public String getRequesterAccountId() {
        return requesterAccountId;
    }

    public void setRequesterAccountId(String requesterAccountId) {
        this.requesterAccountId = requesterAccountId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeletePendingAggregationRequestRequest deletePendingAggregationRequestRequest =
            (DeletePendingAggregationRequestRequest) o;
        return Objects.equals(this.requesterAccountId, deletePendingAggregationRequestRequest.requesterAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requesterAccountId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePendingAggregationRequestRequest {\n");
        sb.append("    requesterAccountId: ").append(toIndentedString(requesterAccountId)).append("\n");
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
