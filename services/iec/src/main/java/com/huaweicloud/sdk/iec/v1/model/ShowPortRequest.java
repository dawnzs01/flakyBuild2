package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPortRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    public ShowPortRequest withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * 端口ID。
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPortRequest showPortRequest = (ShowPortRequest) o;
        return Objects.equals(this.portId, showPortRequest.portId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPortRequest {\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
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
