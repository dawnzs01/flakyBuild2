package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDisassociateCertsV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AttachOrDetachCertsReqBody body;

    public BatchDisassociateCertsV2Request withInstanceId(String instanceId) {
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

    public BatchDisassociateCertsV2Request withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 分组的编号
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public BatchDisassociateCertsV2Request withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 域名的编号
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public BatchDisassociateCertsV2Request withBody(AttachOrDetachCertsReqBody body) {
        this.body = body;
        return this;
    }

    public BatchDisassociateCertsV2Request withBody(Consumer<AttachOrDetachCertsReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new AttachOrDetachCertsReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AttachOrDetachCertsReqBody getBody() {
        return body;
    }

    public void setBody(AttachOrDetachCertsReqBody body) {
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
        BatchDisassociateCertsV2Request batchDisassociateCertsV2Request = (BatchDisassociateCertsV2Request) o;
        return Objects.equals(this.instanceId, batchDisassociateCertsV2Request.instanceId)
            && Objects.equals(this.groupId, batchDisassociateCertsV2Request.groupId)
            && Objects.equals(this.domainId, batchDisassociateCertsV2Request.domainId)
            && Objects.equals(this.body, batchDisassociateCertsV2Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, groupId, domainId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDisassociateCertsV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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
