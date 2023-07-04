package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateIncidentNetworkList
 */
public class CreateIncidentNetworkList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private Object direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private String srcIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_port")

    private String srcPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_domain")

    private String srcDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_ip")

    private String destIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_port")

    private String destPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_domain")

    private String destDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_geo")

    private Object srcGeo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_geo")

    private Object destGeo;

    public CreateIncidentNetworkList withDirection(Object direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 方向，取值范围：IN | OUT
     * @return direction
     */
    public Object getDirection() {
        return direction;
    }

    public void setDirection(Object direction) {
        this.direction = direction;
    }

    public CreateIncidentNetworkList withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议，参考：IANA registered name
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public CreateIncidentNetworkList withSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    /**
     * 源IP地址
     * @return srcIp
     */
    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public CreateIncidentNetworkList withSrcPort(String srcPort) {
        this.srcPort = srcPort;
        return this;
    }

    /**
     * 源端口，0–65535
     * @return srcPort
     */
    public String getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(String srcPort) {
        this.srcPort = srcPort;
    }

    public CreateIncidentNetworkList withSrcDomain(String srcDomain) {
        this.srcDomain = srcDomain;
        return this;
    }

    /**
     * 源域名，最大128个字符
     * @return srcDomain
     */
    public String getSrcDomain() {
        return srcDomain;
    }

    public void setSrcDomain(String srcDomain) {
        this.srcDomain = srcDomain;
    }

    public CreateIncidentNetworkList withDestIp(String destIp) {
        this.destIp = destIp;
        return this;
    }

    /**
     * 目的IP地址
     * @return destIp
     */
    public String getDestIp() {
        return destIp;
    }

    public void setDestIp(String destIp) {
        this.destIp = destIp;
    }

    public CreateIncidentNetworkList withDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }

    /**
     * 目的端口，0–65535
     * @return destPort
     */
    public String getDestPort() {
        return destPort;
    }

    public void setDestPort(String destPort) {
        this.destPort = destPort;
    }

    public CreateIncidentNetworkList withDestDomain(String destDomain) {
        this.destDomain = destDomain;
        return this;
    }

    /**
     * 目的域名，最大128个字符
     * @return destDomain
     */
    public String getDestDomain() {
        return destDomain;
    }

    public void setDestDomain(String destDomain) {
        this.destDomain = destDomain;
    }

    public CreateIncidentNetworkList withSrcGeo(Object srcGeo) {
        this.srcGeo = srcGeo;
        return this;
    }

    /**
     * 源IP的地理位置信息
     * @return srcGeo
     */
    public Object getSrcGeo() {
        return srcGeo;
    }

    public void setSrcGeo(Object srcGeo) {
        this.srcGeo = srcGeo;
    }

    public CreateIncidentNetworkList withDestGeo(Object destGeo) {
        this.destGeo = destGeo;
        return this;
    }

    /**
     * 目的IP的地理位置信息
     * @return destGeo
     */
    public Object getDestGeo() {
        return destGeo;
    }

    public void setDestGeo(Object destGeo) {
        this.destGeo = destGeo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateIncidentNetworkList createIncidentNetworkList = (CreateIncidentNetworkList) o;
        return Objects.equals(this.direction, createIncidentNetworkList.direction)
            && Objects.equals(this.protocol, createIncidentNetworkList.protocol)
            && Objects.equals(this.srcIp, createIncidentNetworkList.srcIp)
            && Objects.equals(this.srcPort, createIncidentNetworkList.srcPort)
            && Objects.equals(this.srcDomain, createIncidentNetworkList.srcDomain)
            && Objects.equals(this.destIp, createIncidentNetworkList.destIp)
            && Objects.equals(this.destPort, createIncidentNetworkList.destPort)
            && Objects.equals(this.destDomain, createIncidentNetworkList.destDomain)
            && Objects.equals(this.srcGeo, createIncidentNetworkList.srcGeo)
            && Objects.equals(this.destGeo, createIncidentNetworkList.destGeo);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(direction, protocol, srcIp, srcPort, srcDomain, destIp, destPort, destDomain, srcGeo, destGeo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIncidentNetworkList {\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    srcPort: ").append(toIndentedString(srcPort)).append("\n");
        sb.append("    srcDomain: ").append(toIndentedString(srcDomain)).append("\n");
        sb.append("    destIp: ").append(toIndentedString(destIp)).append("\n");
        sb.append("    destPort: ").append(toIndentedString(destPort)).append("\n");
        sb.append("    destDomain: ").append(toIndentedString(destDomain)).append("\n");
        sb.append("    srcGeo: ").append(toIndentedString(srcGeo)).append("\n");
        sb.append("    destGeo: ").append(toIndentedString(destGeo)).append("\n");
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
