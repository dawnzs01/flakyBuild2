package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 更新DNAT规则的请求体。
 */
public class UpdateNatGatewayDnatRuleOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_gateway_id")

    private String natGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    /**
     * 协议类型，目前支持TCP/tcp、UDP/udp、ANY/any。 对应协议号6、17、0。
     */
    public static final class ProtocolEnum {

        /**
         * Enum TCP for value: "TCP"
         */
        public static final ProtocolEnum TCP = new ProtocolEnum("TCP");

        /**
         * Enum UDP for value: "UDP"
         */
        public static final ProtocolEnum UDP = new ProtocolEnum("UDP");

        /**
         * Enum ANY for value: "ANY"
         */
        public static final ProtocolEnum ANY = new ProtocolEnum("ANY");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("TCP", TCP);
            map.put("UDP", UDP);
            map.put("ANY", ANY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floating_ip_id")

    private String floatingIpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_service_port")

    private Integer internalServicePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_service_port")

    private Integer externalServicePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_service_port_range")

    private String internalServicePortRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_service_port_range")

    private String externalServicePortRange;

    public UpdateNatGatewayDnatRuleOption withNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }

    /**
     * NAT网关的id。
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    public UpdateNatGatewayDnatRuleOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * DNAT规则的描述，长度限制为255。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateNatGatewayDnatRuleOption withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * 虚拟机或者裸机的Port ID，对应虚拟私有云场景，与private_ip参数二选一。
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public UpdateNatGatewayDnatRuleOption withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 用户私有IP地址，对应专线、云连接场景，与port_id参数二选一。
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public UpdateNatGatewayDnatRuleOption withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议类型，目前支持TCP/tcp、UDP/udp、ANY/any。 对应协议号6、17、0。
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public UpdateNatGatewayDnatRuleOption withFloatingIpId(String floatingIpId) {
        this.floatingIpId = floatingIpId;
        return this;
    }

    /**
     * 弹性公网IP的id。
     * @return floatingIpId
     */
    public String getFloatingIpId() {
        return floatingIpId;
    }

    public void setFloatingIpId(String floatingIpId) {
        this.floatingIpId = floatingIpId;
    }

    public UpdateNatGatewayDnatRuleOption withInternalServicePort(Integer internalServicePort) {
        this.internalServicePort = internalServicePort;
        return this;
    }

    /**
     * 虚拟机或者裸机对外提供服务的协议端口号。 取值范围：0~65535。
     * minimum: 0
     * maximum: 65535
     * @return internalServicePort
     */
    public Integer getInternalServicePort() {
        return internalServicePort;
    }

    public void setInternalServicePort(Integer internalServicePort) {
        this.internalServicePort = internalServicePort;
    }

    public UpdateNatGatewayDnatRuleOption withExternalServicePort(Integer externalServicePort) {
        this.externalServicePort = externalServicePort;
        return this;
    }

    /**
     * Floatingip对外提供服务的端口号。 取值范围：0~65535。
     * minimum: 0
     * maximum: 65535
     * @return externalServicePort
     */
    public Integer getExternalServicePort() {
        return externalServicePort;
    }

    public void setExternalServicePort(Integer externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    public UpdateNatGatewayDnatRuleOption withInternalServicePortRange(String internalServicePortRange) {
        this.internalServicePortRange = internalServicePortRange;
        return this;
    }

    /**
     * 虚拟机或者裸机对外提供服务的协议端口号范围。 功能说明：该端口范围与external _service_port_range按顺序实现1:1映射。 取值范围：1~65535。 约束：只能以’-’字符连接端口范围。
     * @return internalServicePortRange
     */
    public String getInternalServicePortRange() {
        return internalServicePortRange;
    }

    public void setInternalServicePortRange(String internalServicePortRange) {
        this.internalServicePortRange = internalServicePortRange;
    }

    public UpdateNatGatewayDnatRuleOption withExternalServicePortRange(String externalServicePortRange) {
        this.externalServicePortRange = externalServicePortRange;
        return this;
    }

    /**
     * Floatingip对外提供服务的端口号范围。 功能说明：该端口范围与internal _service_port_range按顺序实现1:1映射。 取值范围：1~65535。 约束：只能以’-’字符连接端口范围。
     * @return externalServicePortRange
     */
    public String getExternalServicePortRange() {
        return externalServicePortRange;
    }

    public void setExternalServicePortRange(String externalServicePortRange) {
        this.externalServicePortRange = externalServicePortRange;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNatGatewayDnatRuleOption updateNatGatewayDnatRuleOption = (UpdateNatGatewayDnatRuleOption) o;
        return Objects.equals(this.natGatewayId, updateNatGatewayDnatRuleOption.natGatewayId)
            && Objects.equals(this.description, updateNatGatewayDnatRuleOption.description)
            && Objects.equals(this.portId, updateNatGatewayDnatRuleOption.portId)
            && Objects.equals(this.privateIp, updateNatGatewayDnatRuleOption.privateIp)
            && Objects.equals(this.protocol, updateNatGatewayDnatRuleOption.protocol)
            && Objects.equals(this.floatingIpId, updateNatGatewayDnatRuleOption.floatingIpId)
            && Objects.equals(this.internalServicePort, updateNatGatewayDnatRuleOption.internalServicePort)
            && Objects.equals(this.externalServicePort, updateNatGatewayDnatRuleOption.externalServicePort)
            && Objects.equals(this.internalServicePortRange, updateNatGatewayDnatRuleOption.internalServicePortRange)
            && Objects.equals(this.externalServicePortRange, updateNatGatewayDnatRuleOption.externalServicePortRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(natGatewayId,
            description,
            portId,
            privateIp,
            protocol,
            floatingIpId,
            internalServicePort,
            externalServicePort,
            internalServicePortRange,
            externalServicePortRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNatGatewayDnatRuleOption {\n");
        sb.append("    natGatewayId: ").append(toIndentedString(natGatewayId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    floatingIpId: ").append(toIndentedString(floatingIpId)).append("\n");
        sb.append("    internalServicePort: ").append(toIndentedString(internalServicePort)).append("\n");
        sb.append("    externalServicePort: ").append(toIndentedString(externalServicePort)).append("\n");
        sb.append("    internalServicePortRange: ").append(toIndentedString(internalServicePortRange)).append("\n");
        sb.append("    externalServicePortRange: ").append(toIndentedString(externalServicePortRange)).append("\n");
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
