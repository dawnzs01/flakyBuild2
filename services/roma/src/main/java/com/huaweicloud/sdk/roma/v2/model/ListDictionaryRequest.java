package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDictionaryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_code")

    private String parentCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public ListDictionaryRequest withInstanceId(String instanceId) {
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

    public ListDictionaryRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，大于等于0
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListDictionaryRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListDictionaryRequest withParentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }

    /**
     * 指定父字典编码，返回子字典列表信息，未指定时查询顶级字典列表信息
     * @return parentCode
     */
    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public ListDictionaryRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 通过code进行模糊匹配查询
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListDictionaryRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 通过name进行模糊匹配查询
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDictionaryRequest listDictionaryRequest = (ListDictionaryRequest) o;
        return Objects.equals(this.instanceId, listDictionaryRequest.instanceId)
            && Objects.equals(this.offset, listDictionaryRequest.offset)
            && Objects.equals(this.limit, listDictionaryRequest.limit)
            && Objects.equals(this.parentCode, listDictionaryRequest.parentCode)
            && Objects.equals(this.code, listDictionaryRequest.code)
            && Objects.equals(this.name, listDictionaryRequest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, offset, limit, parentCode, code, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDictionaryRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    parentCode: ").append(toIndentedString(parentCode)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
