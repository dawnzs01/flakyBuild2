package com.huaweicloud.sdk.ief.v1.model;

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
public class ListEdgeGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_groups")

    private List<EdgeGroupResp> edgeGroups = null;

    public ListEdgeGroupsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 边缘节点组数目
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListEdgeGroupsResponse withEdgeGroups(List<EdgeGroupResp> edgeGroups) {
        this.edgeGroups = edgeGroups;
        return this;
    }

    public ListEdgeGroupsResponse addEdgeGroupsItem(EdgeGroupResp edgeGroupsItem) {
        if (this.edgeGroups == null) {
            this.edgeGroups = new ArrayList<>();
        }
        this.edgeGroups.add(edgeGroupsItem);
        return this;
    }

    public ListEdgeGroupsResponse withEdgeGroups(Consumer<List<EdgeGroupResp>> edgeGroupsSetter) {
        if (this.edgeGroups == null) {
            this.edgeGroups = new ArrayList<>();
        }
        edgeGroupsSetter.accept(this.edgeGroups);
        return this;
    }

    /**
     * 边缘节点组详情
     * @return edgeGroups
     */
    public List<EdgeGroupResp> getEdgeGroups() {
        return edgeGroups;
    }

    public void setEdgeGroups(List<EdgeGroupResp> edgeGroups) {
        this.edgeGroups = edgeGroups;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEdgeGroupsResponse listEdgeGroupsResponse = (ListEdgeGroupsResponse) o;
        return Objects.equals(this.count, listEdgeGroupsResponse.count)
            && Objects.equals(this.edgeGroups, listEdgeGroupsResponse.edgeGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, edgeGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEdgeGroupsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    edgeGroups: ").append(toIndentedString(edgeGroups)).append("\n");
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
