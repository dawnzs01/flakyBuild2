package com.huaweicloud.sdk.organizations.v1.model;

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
public class ListPoliciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<PolicySummaryDto> policies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListPoliciesResponse withPolicies(List<PolicySummaryDto> policies) {
        this.policies = policies;
        return this;
    }

    public ListPoliciesResponse addPoliciesItem(PolicySummaryDto policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ListPoliciesResponse withPolicies(Consumer<List<PolicySummaryDto>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 组织中的策略列表。
     * @return policies
     */
    public List<PolicySummaryDto> getPolicies() {
        return policies;
    }

    public void setPolicies(List<PolicySummaryDto> policies) {
        this.policies = policies;
    }

    public ListPoliciesResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPoliciesResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDto();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDto getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDto pageInfo) {
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
        ListPoliciesResponse listPoliciesResponse = (ListPoliciesResponse) o;
        return Objects.equals(this.policies, listPoliciesResponse.policies)
            && Objects.equals(this.pageInfo, listPoliciesResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policies, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPoliciesResponse {\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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
