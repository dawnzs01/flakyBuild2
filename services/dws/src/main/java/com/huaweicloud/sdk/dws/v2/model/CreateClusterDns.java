package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 申请的域名信息。
 */
public class CreateClusterDns {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    public CreateClusterDns withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 待创建的域名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateClusterDns withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 域名类型。 - public：公网域名。 - private：内网域名。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateClusterDns withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * 用于填写默认生成的SOA记录中有效缓存时间，以秒为单位。 - 取值范围：300~2147483647。 - 默认值为300s。
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterDns createClusterDns = (CreateClusterDns) o;
        return Objects.equals(this.name, createClusterDns.name) && Objects.equals(this.type, createClusterDns.type)
            && Objects.equals(this.ttl, createClusterDns.ttl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, ttl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterDns {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
