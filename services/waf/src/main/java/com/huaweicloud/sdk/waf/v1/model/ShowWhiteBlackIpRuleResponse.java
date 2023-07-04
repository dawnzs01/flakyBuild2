package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowWhiteBlackIpRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white")

    private Integer white;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_group")

    private IpGroup ipGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    public ShowWhiteBlackIpRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowWhiteBlackIpRuleResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 黑白名单规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowWhiteBlackIpRuleResponse withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /**
     * 策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public ShowWhiteBlackIpRuleResponse withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * 黑白名单ip地址，需要输入标准的ip地址或地址段，例如：42.123.120.66或42.123.120.0/16
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public ShowWhiteBlackIpRuleResponse withWhite(Integer white) {
        this.white = white;
        return this;
    }

    /**
     * 防护动作：  - 0 拦截  - 1 放行  - 2 仅记录
     * @return white
     */
    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    public ShowWhiteBlackIpRuleResponse withIpGroup(IpGroup ipGroup) {
        this.ipGroup = ipGroup;
        return this;
    }

    public ShowWhiteBlackIpRuleResponse withIpGroup(Consumer<IpGroup> ipGroupSetter) {
        if (this.ipGroup == null) {
            this.ipGroup = new IpGroup();
            ipGroupSetter.accept(this.ipGroup);
        }

        return this;
    }

    /**
     * Get ipGroup
     * @return ipGroup
     */
    public IpGroup getIpGroup() {
        return ipGroup;
    }

    public void setIpGroup(IpGroup ipGroup) {
        this.ipGroup = ipGroup;
    }

    public ShowWhiteBlackIpRuleResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 规则状态，0：关闭，1：开启
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowWhiteBlackIpRuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowWhiteBlackIpRuleResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 创建规则的时间戳,13位毫秒时间戳
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowWhiteBlackIpRuleResponse showWhiteBlackIpRuleResponse = (ShowWhiteBlackIpRuleResponse) o;
        return Objects.equals(this.id, showWhiteBlackIpRuleResponse.id)
            && Objects.equals(this.name, showWhiteBlackIpRuleResponse.name)
            && Objects.equals(this.policyid, showWhiteBlackIpRuleResponse.policyid)
            && Objects.equals(this.addr, showWhiteBlackIpRuleResponse.addr)
            && Objects.equals(this.white, showWhiteBlackIpRuleResponse.white)
            && Objects.equals(this.ipGroup, showWhiteBlackIpRuleResponse.ipGroup)
            && Objects.equals(this.status, showWhiteBlackIpRuleResponse.status)
            && Objects.equals(this.description, showWhiteBlackIpRuleResponse.description)
            && Objects.equals(this.timestamp, showWhiteBlackIpRuleResponse.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, policyid, addr, white, ipGroup, status, description, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWhiteBlackIpRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    white: ").append(toIndentedString(white)).append("\n");
        sb.append("    ipGroup: ").append(toIndentedString(ipGroup)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
