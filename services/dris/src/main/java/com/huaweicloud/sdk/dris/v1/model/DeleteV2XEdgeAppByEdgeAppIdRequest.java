package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteV2XEdgeAppByEdgeAppIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_app_id")

    private String edgeAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "v2x_edge_id")

    private String v2xEdgeId;

    public DeleteV2XEdgeAppByEdgeAppIdRequest withEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
        return this;
    }

    /**
     * **参数说明**：用户自定义应用唯一ID。  **取值范围**：只允许字母、数字、下划线（_）、连接符（-）、美元符号（$）的组合。
     * @return edgeAppId
     */
    public String getEdgeAppId() {
        return edgeAppId;
    }

    public void setEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
    }

    public DeleteV2XEdgeAppByEdgeAppIdRequest withInstanceId(String instanceId) {
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

    public DeleteV2XEdgeAppByEdgeAppIdRequest withV2xEdgeId(String v2xEdgeId) {
        this.v2xEdgeId = v2xEdgeId;
        return this;
    }

    /**
     * **参数说明**：Edge ID，用于唯一标识一个Edge，创建Edge后获得。方法参见 [创建Edge](https://support.huaweicloud.com/api-v2x/v2x_04_0078.html)。
     * @return v2xEdgeId
     */
    public String getV2xEdgeId() {
        return v2xEdgeId;
    }

    public void setV2xEdgeId(String v2xEdgeId) {
        this.v2xEdgeId = v2xEdgeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteV2XEdgeAppByEdgeAppIdRequest deleteV2XEdgeAppByEdgeAppIdRequest = (DeleteV2XEdgeAppByEdgeAppIdRequest) o;
        return Objects.equals(this.edgeAppId, deleteV2XEdgeAppByEdgeAppIdRequest.edgeAppId)
            && Objects.equals(this.instanceId, deleteV2XEdgeAppByEdgeAppIdRequest.instanceId)
            && Objects.equals(this.v2xEdgeId, deleteV2XEdgeAppByEdgeAppIdRequest.v2xEdgeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeAppId, instanceId, v2xEdgeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteV2XEdgeAppByEdgeAppIdRequest {\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    v2xEdgeId: ").append(toIndentedString(v2xEdgeId)).append("\n");
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
