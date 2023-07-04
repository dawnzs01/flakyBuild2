package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置服务器自动分配弹性IP时，创建弹性IP的配置参数，详情见 eip 结构体
 */
public class CreateNet2CloudPhoneServerRequestBodyPublicIpEip {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public CreateNet2CloudPhoneServerRequestBodyPublicIpEip withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 弹性公网IP的类型，取值范围：5_telcom（电信），5_union（联通），5_bgp（全动态BGP），5_sbgp（静态BGP）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateNet2CloudPhoneServerRequestBodyPublicIpEip createNet2CloudPhoneServerRequestBodyPublicIpEip =
            (CreateNet2CloudPhoneServerRequestBodyPublicIpEip) o;
        return Objects.equals(this.type, createNet2CloudPhoneServerRequestBodyPublicIpEip.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNet2CloudPhoneServerRequestBodyPublicIpEip {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
