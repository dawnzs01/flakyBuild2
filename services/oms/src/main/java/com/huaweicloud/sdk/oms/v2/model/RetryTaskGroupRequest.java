package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class RetryTaskGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RetryTaskGroupReq body;

    public RetryTaskGroupRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 任务组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public RetryTaskGroupRequest withBody(RetryTaskGroupReq body) {
        this.body = body;
        return this;
    }

    public RetryTaskGroupRequest withBody(Consumer<RetryTaskGroupReq> bodySetter) {
        if (this.body == null) {
            this.body = new RetryTaskGroupReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RetryTaskGroupReq getBody() {
        return body;
    }

    public void setBody(RetryTaskGroupReq body) {
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
        RetryTaskGroupRequest retryTaskGroupRequest = (RetryTaskGroupRequest) o;
        return Objects.equals(this.groupId, retryTaskGroupRequest.groupId)
            && Objects.equals(this.body, retryTaskGroupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetryTaskGroupRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
