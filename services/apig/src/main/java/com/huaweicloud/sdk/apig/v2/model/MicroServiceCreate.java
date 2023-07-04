package com.huaweicloud.sdk.apig.v2.model;

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
 * 微服务详情。
 */
public class MicroServiceCreate {

    /**
     * 微服务类型： - CSE：CSE微服务注册中心 - CCE：CCE云容器引擎
     */
    public static final class ServiceTypeEnum {

        /**
         * Enum CSE for value: "CSE"
         */
        public static final ServiceTypeEnum CSE = new ServiceTypeEnum("CSE");

        /**
         * Enum CCE for value: "CCE"
         */
        public static final ServiceTypeEnum CCE = new ServiceTypeEnum("CCE");

        private static final Map<String, ServiceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServiceTypeEnum> createStaticFields() {
            Map<String, ServiceTypeEnum> map = new HashMap<>();
            map.put("CSE", CSE);
            map.put("CCE", CCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ServiceTypeEnum(String value) {
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
        public static ServiceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ServiceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ServiceTypeEnum(value);
            }
            return result;
        }

        public static ServiceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ServiceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ServiceTypeEnum) {
                return this.value.equals(((ServiceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private ServiceTypeEnum serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cse_info")

    private MicroServiceInfoCSEBase cseInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_info")

    private MicroServiceInfoCCEBase cceInfo;

    public MicroServiceCreate withServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 微服务类型： - CSE：CSE微服务注册中心 - CCE：CCE云容器引擎
     * @return serviceType
     */
    public ServiceTypeEnum getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
    }

    public MicroServiceCreate withCseInfo(MicroServiceInfoCSEBase cseInfo) {
        this.cseInfo = cseInfo;
        return this;
    }

    public MicroServiceCreate withCseInfo(Consumer<MicroServiceInfoCSEBase> cseInfoSetter) {
        if (this.cseInfo == null) {
            this.cseInfo = new MicroServiceInfoCSEBase();
            cseInfoSetter.accept(this.cseInfo);
        }

        return this;
    }

    /**
     * Get cseInfo
     * @return cseInfo
     */
    public MicroServiceInfoCSEBase getCseInfo() {
        return cseInfo;
    }

    public void setCseInfo(MicroServiceInfoCSEBase cseInfo) {
        this.cseInfo = cseInfo;
    }

    public MicroServiceCreate withCceInfo(MicroServiceInfoCCEBase cceInfo) {
        this.cceInfo = cceInfo;
        return this;
    }

    public MicroServiceCreate withCceInfo(Consumer<MicroServiceInfoCCEBase> cceInfoSetter) {
        if (this.cceInfo == null) {
            this.cceInfo = new MicroServiceInfoCCEBase();
            cceInfoSetter.accept(this.cceInfo);
        }

        return this;
    }

    /**
     * Get cceInfo
     * @return cceInfo
     */
    public MicroServiceInfoCCEBase getCceInfo() {
        return cceInfo;
    }

    public void setCceInfo(MicroServiceInfoCCEBase cceInfo) {
        this.cceInfo = cceInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MicroServiceCreate microServiceCreate = (MicroServiceCreate) o;
        return Objects.equals(this.serviceType, microServiceCreate.serviceType)
            && Objects.equals(this.cseInfo, microServiceCreate.cseInfo)
            && Objects.equals(this.cceInfo, microServiceCreate.cceInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceType, cseInfo, cceInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MicroServiceCreate {\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    cseInfo: ").append(toIndentedString(cseInfo)).append("\n");
        sb.append("    cceInfo: ").append(toIndentedString(cceInfo)).append("\n");
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
