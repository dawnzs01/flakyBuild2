package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResponsesInfo
 */
public class ResponsesInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "responses")

    private Map<String, ResponseInfoResp> responses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    private Boolean _default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public ResponsesInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 响应名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResponsesInfo withResponses(Map<String, ResponseInfoResp> responses) {
        this.responses = responses;
        return this;
    }

    public ResponsesInfo putResponsesItem(String key, ResponseInfoResp responsesItem) {
        if (this.responses == null) {
            this.responses = new HashMap<>();
        }
        this.responses.put(key, responsesItem);
        return this;
    }

    public ResponsesInfo withResponses(Consumer<Map<String, ResponseInfoResp>> responsesSetter) {
        if (this.responses == null) {
            this.responses = new HashMap<>();
        }
        responsesSetter.accept(this.responses);
        return this;
    }

    /**
     * 错误类型的响应定义，其中key为错误类型。key的枚举值为： - AUTH_FAILURE：认证失败 - AUTH_HEADER_MISSING：认证身份来源缺失 - AUTHORIZER_FAILURE：自定义认证失败 - AUTHORIZER_CONF_FAILURE：自定义认证配置错误 - AUTHORIZER_IDENTITIES_FAILURE：自定义认证身份来源错误 - BACKEND_UNAVAILABLE：后端不可用 - BACKEND_TIMEOUT：后端超时 - THROTTLED：调用次数超出阈值 - UNAUTHORIZED：应用未授权 - ACCESS_DENIED：拒绝访问 - NOT_FOUND：未找到匹配的API - REQUEST_PARAMETERS_FAILURE：请求参数错误 - DEFAULT_4XX：默认4XX - DEFAULT_5XX：默认5XX  每项错误类型均为一个JSON体
     * @return responses
     */
    public Map<String, ResponseInfoResp> getResponses() {
        return responses;
    }

    public void setResponses(Map<String, ResponseInfoResp> responses) {
        this.responses = responses;
    }

    public ResponsesInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 响应ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResponsesInfo withDefault(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * 是否为分组默认响应
     * @return _default
     */
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public ResponsesInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ResponsesInfo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponsesInfo responsesInfo = (ResponsesInfo) o;
        return Objects.equals(this.name, responsesInfo.name) && Objects.equals(this.responses, responsesInfo.responses)
            && Objects.equals(this.id, responsesInfo.id) && Objects.equals(this._default, responsesInfo._default)
            && Objects.equals(this.createTime, responsesInfo.createTime)
            && Objects.equals(this.updateTime, responsesInfo.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, responses, id, _default, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponsesInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
