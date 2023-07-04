package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDetailsOfEnvironmentVariableV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_value")

    private String variableValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_name")

    private String variableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public ShowDetailsOfEnvironmentVariableV2Response withVariableValue(String variableValue) {
        this.variableValue = variableValue;
        return this;
    }

    /**
     * 变量值支持英文字母、数字、英文格式的下划线、中划线，斜线（/）、点、冒号，1 ~ 255个字符。
     * @return variableValue
     */
    public String getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue;
    }

    public ShowDetailsOfEnvironmentVariableV2Response withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 环境编号
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public ShowDetailsOfEnvironmentVariableV2Response withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * API分组编号
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowDetailsOfEnvironmentVariableV2Response withVariableName(String variableName) {
        this.variableName = variableName;
        return this;
    }

    /**
     * 变量名，支持英文字母、数字、英文格式的下划线、中划线，必须以英文字母开头，3~32个字符。在API定义中等于#Name的值#部分（区分大小写），发布到环境里的API被变量值换。 > 中文字符必须为UTF-8或者unicode编码。
     * @return variableName
     */
    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public ShowDetailsOfEnvironmentVariableV2Response withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 环境变量编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDetailsOfEnvironmentVariableV2Response showDetailsOfEnvironmentVariableV2Response =
            (ShowDetailsOfEnvironmentVariableV2Response) o;
        return Objects.equals(this.variableValue, showDetailsOfEnvironmentVariableV2Response.variableValue)
            && Objects.equals(this.envId, showDetailsOfEnvironmentVariableV2Response.envId)
            && Objects.equals(this.groupId, showDetailsOfEnvironmentVariableV2Response.groupId)
            && Objects.equals(this.variableName, showDetailsOfEnvironmentVariableV2Response.variableName)
            && Objects.equals(this.id, showDetailsOfEnvironmentVariableV2Response.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variableValue, envId, groupId, variableName, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailsOfEnvironmentVariableV2Response {\n");
        sb.append("    variableValue: ").append(toIndentedString(variableValue)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
