package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 增强型负载均衡器信息
 */
public class LbaasListenersResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private Integer protocolPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    public LbaasListenersResult withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * 监听器ID
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public LbaasListenersResult withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 后端云服务器组ID
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public LbaasListenersResult withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /**
     * 后端协议号，指后端云服务器监听的端口，取值范围[1,65535]
     * minimum: 1
     * maximum: 65535
     * @return protocolPort
     */
    public Integer getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
    }

    public LbaasListenersResult withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 权重，指后端云服务器经分发得到的请求数量比例，取值范围[0,1]，默认为1。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LbaasListenersResult lbaasListenersResult = (LbaasListenersResult) o;
        return Objects.equals(this.listenerId, lbaasListenersResult.listenerId)
            && Objects.equals(this.poolId, lbaasListenersResult.poolId)
            && Objects.equals(this.protocolPort, lbaasListenersResult.protocolPort)
            && Objects.equals(this.weight, lbaasListenersResult.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listenerId, poolId, protocolPort, weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LbaasListenersResult {\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
