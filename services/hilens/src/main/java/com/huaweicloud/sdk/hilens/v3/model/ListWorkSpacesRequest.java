package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListWorkSpacesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_user_id")

    private String iamUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListWorkSpacesRequest withIamUserId(String iamUserId) {
        this.iamUserId = iamUserId;
        return this;
    }

    /**
     * 用户的userId，用于查询指定的的子工作空间
     * @return iamUserId
     */
    public String getIamUserId() {
        return iamUserId;
    }

    public void setIamUserId(String iamUserId) {
        this.iamUserId = iamUserId;
    }

    public ListWorkSpacesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的起始位置，取值范围为非负整数，默认为0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListWorkSpacesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量，取值范围1~100，默认为100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWorkSpacesRequest listWorkSpacesRequest = (ListWorkSpacesRequest) o;
        return Objects.equals(this.iamUserId, listWorkSpacesRequest.iamUserId)
            && Objects.equals(this.offset, listWorkSpacesRequest.offset)
            && Objects.equals(this.limit, listWorkSpacesRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iamUserId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkSpacesRequest {\n");
        sb.append("    iamUserId: ").append(toIndentedString(iamUserId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
