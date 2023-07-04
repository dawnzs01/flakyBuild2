package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class RemoveAgentPathRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AgentRemovePathReq body;

    public RemoveAgentPathRequest withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 客户端ID
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public RemoveAgentPathRequest withBody(AgentRemovePathReq body) {
        this.body = body;
        return this;
    }

    public RemoveAgentPathRequest withBody(Consumer<AgentRemovePathReq> bodySetter) {
        if (this.body == null) {
            this.body = new AgentRemovePathReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AgentRemovePathReq getBody() {
        return body;
    }

    public void setBody(AgentRemovePathReq body) {
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
        RemoveAgentPathRequest removeAgentPathRequest = (RemoveAgentPathRequest) o;
        return Objects.equals(this.agentId, removeAgentPathRequest.agentId)
            && Objects.equals(this.body, removeAgentPathRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveAgentPathRequest {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
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
