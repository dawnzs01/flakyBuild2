package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class SendDlqMessageRequest {

    /**
     * 消息引擎。
     */
    public static final class EngineEnum {

        /**
         * Enum RELIABILITY for value: "reliability"
         */
        public static final EngineEnum RELIABILITY = new EngineEnum("reliability");

        private static final Map<String, EngineEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineEnum> createStaticFields() {
            Map<String, EngineEnum> map = new HashMap<>();
            map.put("reliability", RELIABILITY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineEnum(String value) {
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
        public static EngineEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            EngineEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EngineEnum(value);
            }
            return result;
        }

        public static EngineEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EngineEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineEnum) {
                return this.value.equals(((EngineEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private EngineEnum engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeadletterResendReq body;

    public SendDlqMessageRequest withEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 消息引擎。
     * @return engine
     */
    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }

    public SendDlqMessageRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public SendDlqMessageRequest withBody(DeadletterResendReq body) {
        this.body = body;
        return this;
    }

    public SendDlqMessageRequest withBody(Consumer<DeadletterResendReq> bodySetter) {
        if (this.body == null) {
            this.body = new DeadletterResendReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeadletterResendReq getBody() {
        return body;
    }

    public void setBody(DeadletterResendReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendDlqMessageRequest sendDlqMessageRequest = (SendDlqMessageRequest) o;
        return Objects.equals(this.engine, sendDlqMessageRequest.engine)
            && Objects.equals(this.instanceId, sendDlqMessageRequest.instanceId)
            && Objects.equals(this.body, sendDlqMessageRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, instanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendDlqMessageRequest {\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
