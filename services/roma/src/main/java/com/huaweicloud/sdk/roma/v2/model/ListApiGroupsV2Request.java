package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListApiGroupsV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roma_app_id")

    private String romaAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precise_search")

    private String preciseSearch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    public ListApiGroupsV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListApiGroupsV2Request withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，偏移量小于0时，自动转换为0
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListApiGroupsV2Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListApiGroupsV2Request withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * API分组编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListApiGroupsV2Request withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * API分组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListApiGroupsV2Request withRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
        return this;
    }

    /**
     * 集成应用编号
     * @return romaAppId
     */
    public String getRomaAppId() {
        return romaAppId;
    }

    public void setRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
    }

    public ListApiGroupsV2Request withPreciseSearch(String preciseSearch) {
        this.preciseSearch = preciseSearch;
        return this;
    }

    /**
     * 指定需要精确匹配查找的参数名称，多个参数需要支持精确匹配时参数之间使用“,”隔开。  [当前支持name，domain_name。](tag:hws;hws_hk;hcs;fcs;g42;)[目前仅支持API分组名称](tag:Site)
     * @return preciseSearch
     */
    public String getPreciseSearch() {
        return preciseSearch;
    }

    public void setPreciseSearch(String preciseSearch) {
        this.preciseSearch = preciseSearch;
    }

    public ListApiGroupsV2Request withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApiGroupsV2Request listApiGroupsV2Request = (ListApiGroupsV2Request) o;
        return Objects.equals(this.instanceId, listApiGroupsV2Request.instanceId)
            && Objects.equals(this.offset, listApiGroupsV2Request.offset)
            && Objects.equals(this.limit, listApiGroupsV2Request.limit)
            && Objects.equals(this.id, listApiGroupsV2Request.id)
            && Objects.equals(this.name, listApiGroupsV2Request.name)
            && Objects.equals(this.romaAppId, listApiGroupsV2Request.romaAppId)
            && Objects.equals(this.preciseSearch, listApiGroupsV2Request.preciseSearch)
            && Objects.equals(this.domainName, listApiGroupsV2Request.domainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, offset, limit, id, name, romaAppId, preciseSearch, domainName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApiGroupsV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    romaAppId: ").append(toIndentedString(romaAppId)).append("\n");
        sb.append("    preciseSearch: ").append(toIndentedString(preciseSearch)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
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
