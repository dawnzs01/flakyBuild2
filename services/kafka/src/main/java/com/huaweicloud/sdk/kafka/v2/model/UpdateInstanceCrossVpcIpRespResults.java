package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改broker跨VPC访问的结果。
 */
public class UpdateInstanceCrossVpcIpRespResults {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advertised_ip")

    private String advertisedIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    public UpdateInstanceCrossVpcIpRespResults withAdvertisedIp(String advertisedIp) {
        this.advertisedIp = advertisedIp;
        return this;
    }

    /**
     * advertised.listeners IP/域名。
     * @return advertisedIp
     */
    public String getAdvertisedIp() {
        return advertisedIp;
    }

    public void setAdvertisedIp(String advertisedIp) {
        this.advertisedIp = advertisedIp;
    }

    public UpdateInstanceCrossVpcIpRespResults withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 修改broker跨VPC访问的状态。
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public UpdateInstanceCrossVpcIpRespResults withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * listeners IP。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateInstanceCrossVpcIpRespResults updateInstanceCrossVpcIpRespResults =
            (UpdateInstanceCrossVpcIpRespResults) o;
        return Objects.equals(this.advertisedIp, updateInstanceCrossVpcIpRespResults.advertisedIp)
            && Objects.equals(this.success, updateInstanceCrossVpcIpRespResults.success)
            && Objects.equals(this.ip, updateInstanceCrossVpcIpRespResults.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(advertisedIp, success, ip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceCrossVpcIpRespResults {\n");
        sb.append("    advertisedIp: ").append(toIndentedString(advertisedIp)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
