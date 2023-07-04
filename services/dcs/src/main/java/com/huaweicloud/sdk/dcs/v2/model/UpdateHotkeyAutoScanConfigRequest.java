package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateHotkeyAutoScanConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AutoscanConfigRequest body;

    public UpdateHotkeyAutoScanConfigRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateHotkeyAutoScanConfigRequest withBody(AutoscanConfigRequest body) {
        this.body = body;
        return this;
    }

    public UpdateHotkeyAutoScanConfigRequest withBody(Consumer<AutoscanConfigRequest> bodySetter) {
        if (this.body == null) {
            this.body = new AutoscanConfigRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AutoscanConfigRequest getBody() {
        return body;
    }

    public void setBody(AutoscanConfigRequest body) {
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
        UpdateHotkeyAutoScanConfigRequest updateHotkeyAutoScanConfigRequest = (UpdateHotkeyAutoScanConfigRequest) o;
        return Objects.equals(this.instanceId, updateHotkeyAutoScanConfigRequest.instanceId)
            && Objects.equals(this.body, updateHotkeyAutoScanConfigRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHotkeyAutoScanConfigRequest {\n");
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
