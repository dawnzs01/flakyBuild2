package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class CreateWhitelistReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_whitelist")

    private Boolean enableWhitelist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whitelist")

    private String whitelist;

    public CreateWhitelistReq withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 白名单所在的项目ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public CreateWhitelistReq withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * 白名单关联的监听器ID
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public CreateWhitelistReq withEnableWhitelist(Boolean enableWhitelist) {
        this.enableWhitelist = enableWhitelist;
        return this;
    }

    /**
     * 是否开启白名单访问控制开关。true：开启；false：关闭
     * @return enableWhitelist
     */
    public Boolean getEnableWhitelist() {
        return enableWhitelist;
    }

    public void setEnableWhitelist(Boolean enableWhitelist) {
        this.enableWhitelist = enableWhitelist;
    }

    public CreateWhitelistReq withWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }

    /**
     * 白名单IP列表。可以是ip，例如192.168.10.123。也可以是一个网段，例如192.168.10.1/24。不同的值之间用逗号分隔。 不传，默认为空。
     * @return whitelist
     */
    public String getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(String whitelist) {
        this.whitelist = whitelist;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateWhitelistReq createWhitelistReq = (CreateWhitelistReq) o;
        return Objects.equals(this.tenantId, createWhitelistReq.tenantId)
            && Objects.equals(this.listenerId, createWhitelistReq.listenerId)
            && Objects.equals(this.enableWhitelist, createWhitelistReq.enableWhitelist)
            && Objects.equals(this.whitelist, createWhitelistReq.whitelist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId, listenerId, enableWhitelist, whitelist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWhitelistReq {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    enableWhitelist: ").append(toIndentedString(enableWhitelist)).append("\n");
        sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
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
