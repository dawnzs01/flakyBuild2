package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddForwardingConfigsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AddForwardingConfigRequestDTO body;

    public AddForwardingConfigsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数说明**：实例ID。dris物理实例的唯一标识。获取方法参见[获取Instance-Id](https://support.huaweicloud.com/api-v2x/v2x_04_0030.html)。  **取值范围**：仅支持数字，小写字母和连接符（-）的组合，长度36。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public AddForwardingConfigsRequest withBody(AddForwardingConfigRequestDTO body) {
        this.body = body;
        return this;
    }

    public AddForwardingConfigsRequest withBody(Consumer<AddForwardingConfigRequestDTO> bodySetter) {
        if (this.body == null) {
            this.body = new AddForwardingConfigRequestDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AddForwardingConfigRequestDTO getBody() {
        return body;
    }

    public void setBody(AddForwardingConfigRequestDTO body) {
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
        AddForwardingConfigsRequest addForwardingConfigsRequest = (AddForwardingConfigsRequest) o;
        return Objects.equals(this.instanceId, addForwardingConfigsRequest.instanceId)
            && Objects.equals(this.body, addForwardingConfigsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddForwardingConfigsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
