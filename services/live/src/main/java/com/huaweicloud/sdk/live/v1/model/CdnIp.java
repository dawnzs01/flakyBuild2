package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CdnIp
 */
public class CdnIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belongs")

    private Boolean belongs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isp")

    private String isp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    public CdnIp withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 需查询的IP地址。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public CdnIp withBelongs(Boolean belongs) {
        this.belongs = belongs;
        return this;
    }

    /**
     * 是否是华为云CDN节点。（true:是华为云CDN节点，false:不是华为云CDN节点）
     * @return belongs
     */
    public Boolean getBelongs() {
        return belongs;
    }

    public void setBelongs(Boolean belongs) {
        this.belongs = belongs;
    }

    public CdnIp withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * IP归属地省份。（Unknown:表示未知归属地）
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CdnIp withIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * 运营商名称。如果IP归属地未知，该字段返回null。
     * @return isp
     */
    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public CdnIp withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 平台。如果IP归属地未知，该字段返回null。
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CdnIp cdnIp = (CdnIp) o;
        return Objects.equals(this.ip, cdnIp.ip) && Objects.equals(this.belongs, cdnIp.belongs)
            && Objects.equals(this.region, cdnIp.region) && Objects.equals(this.isp, cdnIp.isp)
            && Objects.equals(this.platform, cdnIp.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, belongs, region, isp, platform);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdnIp {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    belongs: ").append(toIndentedString(belongs)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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
