package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 端口信息
 */
public class PortResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "laddr")

    private String laddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private Integer pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    public PortResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public PortResponseInfo withLaddr(String laddr) {
        this.laddr = laddr;
        return this;
    }

    /**
     * 监听ip
     * @return laddr
     */
    public String getLaddr() {
        return laddr;
    }

    public void setLaddr(String laddr) {
        this.laddr = laddr;
    }

    public PortResponseInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * port status, normal, danger or unknow   - \"normal\" : 正常   - \"danger\" : 危险   - \"unknow\" : 未知
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PortResponseInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口号
     * minimum: 0
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public PortResponseInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PortResponseInfo withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    /**
     * 进程ID
     * minimum: 1
     * maximum: 65535
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public PortResponseInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 程序文件
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PortResponseInfo portResponseInfo = (PortResponseInfo) o;
        return Objects.equals(this.hostId, portResponseInfo.hostId)
            && Objects.equals(this.laddr, portResponseInfo.laddr)
            && Objects.equals(this.status, portResponseInfo.status) && Objects.equals(this.port, portResponseInfo.port)
            && Objects.equals(this.type, portResponseInfo.type) && Objects.equals(this.pid, portResponseInfo.pid)
            && Objects.equals(this.path, portResponseInfo.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, laddr, status, port, type, pid, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortResponseInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    laddr: ").append(toIndentedString(laddr)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
