package com.huaweicloud.sdk.rms.v1.model;

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
public class ShowOrganizationPolicyAssignmentStatusesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private List<OrganizationPolicyAssignmentStatusResponse> value = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ShowOrganizationPolicyAssignmentStatusesResponse withValue(
        List<OrganizationPolicyAssignmentStatusResponse> value) {
        this.value = value;
        return this;
    }

    public ShowOrganizationPolicyAssignmentStatusesResponse addValueItem(
        OrganizationPolicyAssignmentStatusResponse valueItem) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(valueItem);
        return this;
    }

    public ShowOrganizationPolicyAssignmentStatusesResponse withValue(
        Consumer<List<OrganizationPolicyAssignmentStatusResponse>> valueSetter) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        valueSetter.accept(this.value);
        return this;
    }

    /**
     * 组织合规规则部署状态结果列表。
     * @return value
     */
    public List<OrganizationPolicyAssignmentStatusResponse> getValue() {
        return value;
    }

    public void setValue(List<OrganizationPolicyAssignmentStatusResponse> value) {
        this.value = value;
    }

    public ShowOrganizationPolicyAssignmentStatusesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ShowOrganizationPolicyAssignmentStatusesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowOrganizationPolicyAssignmentStatusesResponse showOrganizationPolicyAssignmentStatusesResponse =
            (ShowOrganizationPolicyAssignmentStatusesResponse) o;
        return Objects.equals(this.value, showOrganizationPolicyAssignmentStatusesResponse.value)
            && Objects.equals(this.pageInfo, showOrganizationPolicyAssignmentStatusesResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOrganizationPolicyAssignmentStatusesResponse {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
