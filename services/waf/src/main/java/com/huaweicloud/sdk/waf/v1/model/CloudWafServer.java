package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 防护域名的源站服务器配置信息
 */
public class CloudWafServer {

    /**
     * 客户端请求访问防护域名源站服务器的协议
     */
    public static final class FrontProtocolEnum {

        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final FrontProtocolEnum HTTP = new FrontProtocolEnum("HTTP");

        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final FrontProtocolEnum HTTPS = new FrontProtocolEnum("HTTPS");

        private static final Map<String, FrontProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FrontProtocolEnum> createStaticFields() {
            Map<String, FrontProtocolEnum> map = new HashMap<>();
            map.put("HTTP", HTTP);
            map.put("HTTPS", HTTPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FrontProtocolEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FrontProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FrontProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FrontProtocolEnum(value);
            }
            return result;
        }

        public static FrontProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FrontProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FrontProtocolEnum) {
                return this.value.equals(((FrontProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "front_protocol")

    private FrontProtocolEnum frontProtocol;

    /**
     * WAF转发客户端请求到防护域名源站服务器的协议
     */
    public static final class BackProtocolEnum {

        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final BackProtocolEnum HTTP = new BackProtocolEnum("HTTP");

        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final BackProtocolEnum HTTPS = new BackProtocolEnum("HTTPS");

        private static final Map<String, BackProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BackProtocolEnum> createStaticFields() {
            Map<String, BackProtocolEnum> map = new HashMap<>();
            map.put("HTTP", HTTP);
            map.put("HTTPS", HTTPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BackProtocolEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BackProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            BackProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BackProtocolEnum(value);
            }
            return result;
        }

        public static BackProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BackProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BackProtocolEnum) {
                return this.value.equals(((BackProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "back_protocol")

    private BackProtocolEnum backProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    /**
     * 源站地址为ipv4或ipv6
     */
    public static final class TypeEnum {

        /**
         * Enum IPV4 for value: "ipv4"
         */
        public static final TypeEnum IPV4 = new TypeEnum("ipv4");

        /**
         * Enum IPV6 for value: "ipv6"
         */
        public static final TypeEnum IPV6 = new TypeEnum("ipv6");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("ipv4", IPV4);
            map.put("ipv6", IPV6);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    public CloudWafServer withFrontProtocol(FrontProtocolEnum frontProtocol) {
        this.frontProtocol = frontProtocol;
        return this;
    }

    /**
     * 客户端请求访问防护域名源站服务器的协议
     * @return frontProtocol
     */
    public FrontProtocolEnum getFrontProtocol() {
        return frontProtocol;
    }

    public void setFrontProtocol(FrontProtocolEnum frontProtocol) {
        this.frontProtocol = frontProtocol;
    }

    public CloudWafServer withBackProtocol(BackProtocolEnum backProtocol) {
        this.backProtocol = backProtocol;
        return this;
    }

    /**
     * WAF转发客户端请求到防护域名源站服务器的协议
     * @return backProtocol
     */
    public BackProtocolEnum getBackProtocol() {
        return backProtocol;
    }

    public void setBackProtocol(BackProtocolEnum backProtocol) {
        this.backProtocol = backProtocol;
    }

    public CloudWafServer withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 源站权重，负载均衡算法将按该权重将请求分配给源站，默认值是1，云模式的冗余字段
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public CloudWafServer withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 客户端访问的源站服务器的IP地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CloudWafServer withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * WAF转发客户端请求到源站服务的业务端口
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public CloudWafServer withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 源站地址为ipv4或ipv6
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
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
        CloudWafServer cloudWafServer = (CloudWafServer) o;
        return Objects.equals(this.frontProtocol, cloudWafServer.frontProtocol)
            && Objects.equals(this.backProtocol, cloudWafServer.backProtocol)
            && Objects.equals(this.weight, cloudWafServer.weight)
            && Objects.equals(this.address, cloudWafServer.address) && Objects.equals(this.port, cloudWafServer.port)
            && Objects.equals(this.type, cloudWafServer.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frontProtocol, backProtocol, weight, address, port, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudWafServer {\n");
        sb.append("    frontProtocol: ").append(toIndentedString(frontProtocol)).append("\n");
        sb.append("    backProtocol: ").append(toIndentedString(backProtocol)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
