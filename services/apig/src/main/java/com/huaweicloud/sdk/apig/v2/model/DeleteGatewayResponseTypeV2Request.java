package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteGatewayResponseTypeV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_id")

    private String responseId;

    /**
     * 错误类型
     */
    public static final class ResponseTypeEnum {

        /**
         * Enum AUTH_FAILURE for value: "AUTH_FAILURE"
         */
        public static final ResponseTypeEnum AUTH_FAILURE = new ResponseTypeEnum("AUTH_FAILURE");

        /**
         * Enum AUTH_HEADER_MISSING for value: "AUTH_HEADER_MISSING"
         */
        public static final ResponseTypeEnum AUTH_HEADER_MISSING = new ResponseTypeEnum("AUTH_HEADER_MISSING");

        /**
         * Enum AUTHORIZER_FAILURE for value: "AUTHORIZER_FAILURE"
         */
        public static final ResponseTypeEnum AUTHORIZER_FAILURE = new ResponseTypeEnum("AUTHORIZER_FAILURE");

        /**
         * Enum AUTHORIZER_CONF_FAILURE for value: "AUTHORIZER_CONF_FAILURE"
         */
        public static final ResponseTypeEnum AUTHORIZER_CONF_FAILURE = new ResponseTypeEnum("AUTHORIZER_CONF_FAILURE");

        /**
         * Enum AUTHORIZER_IDENTITIES_FAILURE for value: "AUTHORIZER_IDENTITIES_FAILURE"
         */
        public static final ResponseTypeEnum AUTHORIZER_IDENTITIES_FAILURE =
            new ResponseTypeEnum("AUTHORIZER_IDENTITIES_FAILURE");

        /**
         * Enum BACKEND_UNAVAILABLE for value: "BACKEND_UNAVAILABLE"
         */
        public static final ResponseTypeEnum BACKEND_UNAVAILABLE = new ResponseTypeEnum("BACKEND_UNAVAILABLE");

        /**
         * Enum BACKEND_TIMEOUT for value: "BACKEND_TIMEOUT"
         */
        public static final ResponseTypeEnum BACKEND_TIMEOUT = new ResponseTypeEnum("BACKEND_TIMEOUT");

        /**
         * Enum THROTTLED for value: "THROTTLED"
         */
        public static final ResponseTypeEnum THROTTLED = new ResponseTypeEnum("THROTTLED");

        /**
         * Enum UNAUTHORIZED for value: "UNAUTHORIZED"
         */
        public static final ResponseTypeEnum UNAUTHORIZED = new ResponseTypeEnum("UNAUTHORIZED");

        /**
         * Enum ACCESS_DENIED for value: "ACCESS_DENIED"
         */
        public static final ResponseTypeEnum ACCESS_DENIED = new ResponseTypeEnum("ACCESS_DENIED");

        /**
         * Enum NOT_FOUND for value: "NOT_FOUND"
         */
        public static final ResponseTypeEnum NOT_FOUND = new ResponseTypeEnum("NOT_FOUND");

        /**
         * Enum REQUEST_PARAMETERS_FAILURE for value: "REQUEST_PARAMETERS_FAILURE"
         */
        public static final ResponseTypeEnum REQUEST_PARAMETERS_FAILURE =
            new ResponseTypeEnum("REQUEST_PARAMETERS_FAILURE");

        /**
         * Enum DEFAULT_4XX for value: "DEFAULT_4XX"
         */
        public static final ResponseTypeEnum DEFAULT_4XX = new ResponseTypeEnum("DEFAULT_4XX");

        /**
         * Enum DEFAULT_5XX for value: "DEFAULT_5XX"
         */
        public static final ResponseTypeEnum DEFAULT_5XX = new ResponseTypeEnum("DEFAULT_5XX");

        private static final Map<String, ResponseTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResponseTypeEnum> createStaticFields() {
            Map<String, ResponseTypeEnum> map = new HashMap<>();
            map.put("AUTH_FAILURE", AUTH_FAILURE);
            map.put("AUTH_HEADER_MISSING", AUTH_HEADER_MISSING);
            map.put("AUTHORIZER_FAILURE", AUTHORIZER_FAILURE);
            map.put("AUTHORIZER_CONF_FAILURE", AUTHORIZER_CONF_FAILURE);
            map.put("AUTHORIZER_IDENTITIES_FAILURE", AUTHORIZER_IDENTITIES_FAILURE);
            map.put("BACKEND_UNAVAILABLE", BACKEND_UNAVAILABLE);
            map.put("BACKEND_TIMEOUT", BACKEND_TIMEOUT);
            map.put("THROTTLED", THROTTLED);
            map.put("UNAUTHORIZED", UNAUTHORIZED);
            map.put("ACCESS_DENIED", ACCESS_DENIED);
            map.put("NOT_FOUND", NOT_FOUND);
            map.put("REQUEST_PARAMETERS_FAILURE", REQUEST_PARAMETERS_FAILURE);
            map.put("DEFAULT_4XX", DEFAULT_4XX);
            map.put("DEFAULT_5XX", DEFAULT_5XX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResponseTypeEnum(String value) {
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
        public static ResponseTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResponseTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResponseTypeEnum(value);
            }
            return result;
        }

        public static ResponseTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResponseTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResponseTypeEnum) {
                return this.value.equals(((ResponseTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_type")

    private ResponseTypeEnum responseType;

    public DeleteGatewayResponseTypeV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，在API网关控制台的“实例信息”中获取。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteGatewayResponseTypeV2Request withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 分组的编号
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public DeleteGatewayResponseTypeV2Request withResponseId(String responseId) {
        this.responseId = responseId;
        return this;
    }

    /**
     * 响应编号
     * @return responseId
     */
    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public DeleteGatewayResponseTypeV2Request withResponseType(ResponseTypeEnum responseType) {
        this.responseType = responseType;
        return this;
    }

    /**
     * 错误类型
     * @return responseType
     */
    public ResponseTypeEnum getResponseType() {
        return responseType;
    }

    public void setResponseType(ResponseTypeEnum responseType) {
        this.responseType = responseType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteGatewayResponseTypeV2Request deleteGatewayResponseTypeV2Request = (DeleteGatewayResponseTypeV2Request) o;
        return Objects.equals(this.instanceId, deleteGatewayResponseTypeV2Request.instanceId)
            && Objects.equals(this.groupId, deleteGatewayResponseTypeV2Request.groupId)
            && Objects.equals(this.responseId, deleteGatewayResponseTypeV2Request.responseId)
            && Objects.equals(this.responseType, deleteGatewayResponseTypeV2Request.responseType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, groupId, responseId, responseType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteGatewayResponseTypeV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
        sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
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
