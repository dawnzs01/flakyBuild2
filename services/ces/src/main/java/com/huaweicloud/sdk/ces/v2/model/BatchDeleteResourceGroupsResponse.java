package com.huaweicloud.sdk.ces.v2.model;

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
public class BatchDeleteResourceGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_ids")

    private List<String> groupIds = null;

    public BatchDeleteResourceGroupsResponse withGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }

    public BatchDeleteResourceGroupsResponse addGroupIdsItem(String groupIdsItem) {
        if (this.groupIds == null) {
            this.groupIds = new ArrayList<>();
        }
        this.groupIds.add(groupIdsItem);
        return this;
    }

    public BatchDeleteResourceGroupsResponse withGroupIds(Consumer<List<String>> groupIdsSetter) {
        if (this.groupIds == null) {
            this.groupIds = new ArrayList<>();
        }
        groupIdsSetter.accept(this.groupIds);
        return this;
    }

    /**
     * 成功删除的资源分组ID列表
     * @return groupIds
     */
    public List<String> getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteResourceGroupsResponse batchDeleteResourceGroupsResponse = (BatchDeleteResourceGroupsResponse) o;
        return Objects.equals(this.groupIds, batchDeleteResourceGroupsResponse.groupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteResourceGroupsResponse {\n");
        sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
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
