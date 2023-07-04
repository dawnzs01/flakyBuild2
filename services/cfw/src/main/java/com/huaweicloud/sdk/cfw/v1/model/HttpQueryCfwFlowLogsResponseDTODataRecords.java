package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * HttpQueryCfwFlowLogsResponseDTODataRecords
 */
public class HttpQueryCfwFlowLogsResponseDTODataRecords {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bytes")

    private Integer bytes;

    /**
     * 方向，有内到外和外到内两种
     */
    public static final class DirectionEnum {

        /**
         * Enum OUT2IN for value: "out2in"
         */
        public static final DirectionEnum OUT2IN = new DirectionEnum("out2in");

        /**
         * Enum IN2OUT for value: "in2out"
         */
        public static final DirectionEnum IN2OUT = new DirectionEnum("in2out");

        private static final Map<String, DirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DirectionEnum> createStaticFields() {
            Map<String, DirectionEnum> map = new HashMap<>();
            map.put("out2in", OUT2IN);
            map.put("in2out", IN2OUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DirectionEnum(String value) {
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
        public static DirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DirectionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DirectionEnum(value);
            }
            return result;
        }

        public static DirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DirectionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DirectionEnum) {
                return this.value.equals(((DirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private DirectionEnum direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packets")

    private Integer packets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Integer startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Integer endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_id")

    private String logId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private String srcIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_port")

    private String srcPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ip")

    private String dstIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_port")

    private String dstPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    public HttpQueryCfwFlowLogsResponseDTODataRecords withBytes(Integer bytes) {
        this.bytes = bytes;
        return this;
    }

    /**
     * 字节
     * @return bytes
     */
    public Integer getBytes() {
        return bytes;
    }

    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withDirection(DirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 方向，有内到外和外到内两种
     * @return direction
     */
    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withPackets(Integer packets) {
        this.packets = packets;
        return this;
    }

    /**
     * 包
     * @return packets
     */
    public Integer getPackets() {
        return packets;
    }

    public void setPackets(Integer packets) {
        this.packets = packets;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withLogId(String logId) {
        this.logId = logId;
        return this;
    }

    /**
     * 文档ID
     * @return logId
     */
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    /**
     * 源IP
     * @return srcIp
     */
    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withSrcPort(String srcPort) {
        this.srcPort = srcPort;
        return this;
    }

    /**
     * 源端口
     * @return srcPort
     */
    public String getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(String srcPort) {
        this.srcPort = srcPort;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withDstIp(String dstIp) {
        this.dstIp = dstIp;
        return this;
    }

    /**
     * 目的IP
     * @return dstIp
     */
    public String getDstIp() {
        return dstIp;
    }

    public void setDstIp(String dstIp) {
        this.dstIp = dstIp;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用协议
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withDstPort(String dstPort) {
        this.dstPort = dstPort;
        return this;
    }

    /**
     * 目的端口
     * @return dstPort
     */
    public String getDstPort() {
        return dstPort;
    }

    public void setDstPort(String dstPort) {
        this.dstPort = dstPort;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议类型:TCP为6,UDP为17,ICMP为1,ICMPV6为58,ANY为-1,手动类型不为空，自动类型为空
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HttpQueryCfwFlowLogsResponseDTODataRecords httpQueryCfwFlowLogsResponseDTODataRecords =
            (HttpQueryCfwFlowLogsResponseDTODataRecords) o;
        return Objects.equals(this.bytes, httpQueryCfwFlowLogsResponseDTODataRecords.bytes)
            && Objects.equals(this.direction, httpQueryCfwFlowLogsResponseDTODataRecords.direction)
            && Objects.equals(this.packets, httpQueryCfwFlowLogsResponseDTODataRecords.packets)
            && Objects.equals(this.startTime, httpQueryCfwFlowLogsResponseDTODataRecords.startTime)
            && Objects.equals(this.endTime, httpQueryCfwFlowLogsResponseDTODataRecords.endTime)
            && Objects.equals(this.logId, httpQueryCfwFlowLogsResponseDTODataRecords.logId)
            && Objects.equals(this.srcIp, httpQueryCfwFlowLogsResponseDTODataRecords.srcIp)
            && Objects.equals(this.srcPort, httpQueryCfwFlowLogsResponseDTODataRecords.srcPort)
            && Objects.equals(this.dstIp, httpQueryCfwFlowLogsResponseDTODataRecords.dstIp)
            && Objects.equals(this.app, httpQueryCfwFlowLogsResponseDTODataRecords.app)
            && Objects.equals(this.dstPort, httpQueryCfwFlowLogsResponseDTODataRecords.dstPort)
            && Objects.equals(this.protocol, httpQueryCfwFlowLogsResponseDTODataRecords.protocol);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(bytes, direction, packets, startTime, endTime, logId, srcIp, srcPort, dstIp, app, dstPort, protocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpQueryCfwFlowLogsResponseDTODataRecords {\n");
        sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    packets: ").append(toIndentedString(packets)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    srcPort: ").append(toIndentedString(srcPort)).append("\n");
        sb.append("    dstIp: ").append(toIndentedString(dstIp)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    dstPort: ").append(toIndentedString(dstPort)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
