package com.huaweicloud.sdk.dc.v3.model;

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
public class ListHostedDirectConnectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosted_connects")

    private List<HostedDirectConnect> hostedConnects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListHostedDirectConnectsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 本次操作的请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListHostedDirectConnectsResponse withHostedConnects(List<HostedDirectConnect> hostedConnects) {
        this.hostedConnects = hostedConnects;
        return this;
    }

    public ListHostedDirectConnectsResponse addHostedConnectsItem(HostedDirectConnect hostedConnectsItem) {
        if (this.hostedConnects == null) {
            this.hostedConnects = new ArrayList<>();
        }
        this.hostedConnects.add(hostedConnectsItem);
        return this;
    }

    public ListHostedDirectConnectsResponse withHostedConnects(
        Consumer<List<HostedDirectConnect>> hostedConnectsSetter) {
        if (this.hostedConnects == null) {
            this.hostedConnects = new ArrayList<>();
        }
        hostedConnectsSetter.accept(this.hostedConnects);
        return this;
    }

    /**
     * Get hostedConnects
     * @return hostedConnects
     */
    public List<HostedDirectConnect> getHostedConnects() {
        return hostedConnects;
    }

    public void setHostedConnects(List<HostedDirectConnect> hostedConnects) {
        this.hostedConnects = hostedConnects;
    }

    public ListHostedDirectConnectsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListHostedDirectConnectsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListHostedDirectConnectsResponse listHostedDirectConnectsResponse = (ListHostedDirectConnectsResponse) o;
        return Objects.equals(this.requestId, listHostedDirectConnectsResponse.requestId)
            && Objects.equals(this.hostedConnects, listHostedDirectConnectsResponse.hostedConnects)
            && Objects.equals(this.pageInfo, listHostedDirectConnectsResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, hostedConnects, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHostedDirectConnectsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    hostedConnects: ").append(toIndentedString(hostedConnects)).append("\n");
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
