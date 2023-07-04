package com.huaweicloud.sdk.nat.v2.model;

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
public class ListTransitIpsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_ips")

    private List<TransitIp> transitIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListTransitIpsResponse withTransitIps(List<TransitIp> transitIps) {
        this.transitIps = transitIps;
        return this;
    }

    public ListTransitIpsResponse addTransitIpsItem(TransitIp transitIpsItem) {
        if (this.transitIps == null) {
            this.transitIps = new ArrayList<>();
        }
        this.transitIps.add(transitIpsItem);
        return this;
    }

    public ListTransitIpsResponse withTransitIps(Consumer<List<TransitIp>> transitIpsSetter) {
        if (this.transitIps == null) {
            this.transitIps = new ArrayList<>();
        }
        transitIpsSetter.accept(this.transitIps);
        return this;
    }

    /**
     * 查询中转IP列表的响应体。
     * @return transitIps
     */
    public List<TransitIp> getTransitIps() {
        return transitIps;
    }

    public void setTransitIps(List<TransitIp> transitIps) {
        this.transitIps = transitIps;
    }

    public ListTransitIpsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListTransitIpsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListTransitIpsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTransitIpsResponse listTransitIpsResponse = (ListTransitIpsResponse) o;
        return Objects.equals(this.transitIps, listTransitIpsResponse.transitIps)
            && Objects.equals(this.pageInfo, listTransitIpsResponse.pageInfo)
            && Objects.equals(this.requestId, listTransitIpsResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transitIps, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTransitIpsResponse {\n");
        sb.append("    transitIps: ").append(toIndentedString(transitIps)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
