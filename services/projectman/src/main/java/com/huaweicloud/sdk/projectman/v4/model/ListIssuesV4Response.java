package com.huaweicloud.sdk.projectman.v4.model;

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
public class ListIssuesV4Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issues")

    private List<ListIssueItemResponse> issues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListIssuesV4Response withIssues(List<ListIssueItemResponse> issues) {
        this.issues = issues;
        return this;
    }

    public ListIssuesV4Response addIssuesItem(ListIssueItemResponse issuesItem) {
        if (this.issues == null) {
            this.issues = new ArrayList<>();
        }
        this.issues.add(issuesItem);
        return this;
    }

    public ListIssuesV4Response withIssues(Consumer<List<ListIssueItemResponse>> issuesSetter) {
        if (this.issues == null) {
            this.issues = new ArrayList<>();
        }
        issuesSetter.accept(this.issues);
        return this;
    }

    /**
     * 工作项列表
     * @return issues
     */
    public List<ListIssueItemResponse> getIssues() {
        return issues;
    }

    public void setIssues(List<ListIssueItemResponse> issues) {
        this.issues = issues;
    }

    public ListIssuesV4Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListIssuesV4Response listIssuesV4Response = (ListIssuesV4Response) o;
        return Objects.equals(this.issues, listIssuesV4Response.issues)
            && Objects.equals(this.total, listIssuesV4Response.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issues, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIssuesV4Response {\n");
        sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
