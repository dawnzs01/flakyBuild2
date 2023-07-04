package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListApiAttachedPluginsRequest {

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
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_id")

    private String pluginId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_name")

    private String envName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_type")

    private String pluginType;

    public ListApiAttachedPluginsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，在API网关控制台的“实例信息”中获取。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListApiAttachedPluginsRequest withOffset(Long offset) {
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

    public ListApiAttachedPluginsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量，条目数量小于等于0时，自动转换为20，条目数量大于500时，自动转换为500
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

    public ListApiAttachedPluginsRequest withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * API编号
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public ListApiAttachedPluginsRequest withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 发布的环境编号
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public ListApiAttachedPluginsRequest withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * 插件名称
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public ListApiAttachedPluginsRequest withPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }

    /**
     * 插件编号
     * @return pluginId
     */
    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    public ListApiAttachedPluginsRequest withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    /**
     * 环境名称
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public ListApiAttachedPluginsRequest withPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }

    /**
     * 插件类型
     * @return pluginType
     */
    public String getPluginType() {
        return pluginType;
    }

    public void setPluginType(String pluginType) {
        this.pluginType = pluginType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApiAttachedPluginsRequest listApiAttachedPluginsRequest = (ListApiAttachedPluginsRequest) o;
        return Objects.equals(this.instanceId, listApiAttachedPluginsRequest.instanceId)
            && Objects.equals(this.offset, listApiAttachedPluginsRequest.offset)
            && Objects.equals(this.limit, listApiAttachedPluginsRequest.limit)
            && Objects.equals(this.apiId, listApiAttachedPluginsRequest.apiId)
            && Objects.equals(this.envId, listApiAttachedPluginsRequest.envId)
            && Objects.equals(this.pluginName, listApiAttachedPluginsRequest.pluginName)
            && Objects.equals(this.pluginId, listApiAttachedPluginsRequest.pluginId)
            && Objects.equals(this.envName, listApiAttachedPluginsRequest.envName)
            && Objects.equals(this.pluginType, listApiAttachedPluginsRequest.pluginType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, offset, limit, apiId, envId, pluginName, pluginId, envName, pluginType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApiAttachedPluginsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    pluginType: ").append(toIndentedString(pluginType)).append("\n");
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
