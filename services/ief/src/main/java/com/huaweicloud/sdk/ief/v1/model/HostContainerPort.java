package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 容器端口映射值
 */
public class HostContainerPort {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_port")

    private Integer containerPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_port")

    private Integer hostPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    public HostContainerPort withContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    /**
     * 构成一堆映射的容器端口
     * @return containerPort
     */
    public Integer getContainerPort() {
        return containerPort;
    }

    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    public HostContainerPort withHostPort(Integer hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * 构成一对映射的物理机对应网卡端口
     * @return hostPort
     */
    public Integer getHostPort() {
        return hostPort;
    }

    public void setHostPort(Integer hostPort) {
        this.hostPort = hostPort;
    }

    public HostContainerPort withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 对应网卡地址
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostContainerPort hostContainerPort = (HostContainerPort) o;
        return Objects.equals(this.containerPort, hostContainerPort.containerPort)
            && Objects.equals(this.hostPort, hostContainerPort.hostPort)
            && Objects.equals(this.hostIp, hostContainerPort.hostIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containerPort, hostPort, hostIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostContainerPort {\n");
        sb.append("    containerPort: ").append(toIndentedString(containerPort)).append("\n");
        sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
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
