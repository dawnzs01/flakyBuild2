package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateRoutingRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateRuleReq body;

    public UpdateRoutingRuleRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数说明**：实例ID。物理多租下各实例的唯一标识，一般华为云租户无需携带该参数，仅在物理多租场景下从管理面访问API时需要携带该参数。您可以在IoTDA管理控制台界面，选择左侧导航栏“总览”页签查看当前实例的ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateRoutingRuleRequest withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * **参数说明**：规则条件ID。 **取值范围**：长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public UpdateRoutingRuleRequest withBody(UpdateRuleReq body) {
        this.body = body;
        return this;
    }

    public UpdateRoutingRuleRequest withBody(Consumer<UpdateRuleReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateRuleReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateRuleReq getBody() {
        return body;
    }

    public void setBody(UpdateRuleReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRoutingRuleRequest updateRoutingRuleRequest = (UpdateRoutingRuleRequest) o;
        return Objects.equals(this.instanceId, updateRoutingRuleRequest.instanceId)
            && Objects.equals(this.ruleId, updateRoutingRuleRequest.ruleId)
            && Objects.equals(this.body, updateRoutingRuleRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, ruleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRoutingRuleRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
