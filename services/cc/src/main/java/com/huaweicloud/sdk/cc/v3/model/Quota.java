package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 配额实例
 */
public class Quota {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    /**
     * 配额类型： - cloud_connection: 可加载的云连接实例数 - cloud_connection_region: 某云连接实例下可加载的Region数 - cloud_connection_route: 某云连接实例下可加载的路由数 - region_network_instance: 某云连接实例下某个Region下可加载的网络实例数
     */
    public static final class QuotaTypeEnum {

        /**
         * Enum CLOUD_CONNECTION for value: "cloud_connection"
         */
        public static final QuotaTypeEnum CLOUD_CONNECTION = new QuotaTypeEnum("cloud_connection");

        /**
         * Enum CLOUD_CONNECTION_REGION for value: "cloud_connection_region"
         */
        public static final QuotaTypeEnum CLOUD_CONNECTION_REGION = new QuotaTypeEnum("cloud_connection_region");

        /**
         * Enum CLOUD_CONNECTION_ROUTE for value: "cloud_connection_route"
         */
        public static final QuotaTypeEnum CLOUD_CONNECTION_ROUTE = new QuotaTypeEnum("cloud_connection_route");

        /**
         * Enum REGION_NETWORK_INSTANCE for value: "region_network_instance"
         */
        public static final QuotaTypeEnum REGION_NETWORK_INSTANCE = new QuotaTypeEnum("region_network_instance");

        private static final Map<String, QuotaTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QuotaTypeEnum> createStaticFields() {
            Map<String, QuotaTypeEnum> map = new HashMap<>();
            map.put("cloud_connection", CLOUD_CONNECTION);
            map.put("cloud_connection_region", CLOUD_CONNECTION_REGION);
            map.put("cloud_connection_route", CLOUD_CONNECTION_ROUTE);
            map.put("region_network_instance", REGION_NETWORK_INSTANCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QuotaTypeEnum(String value) {
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
        public static QuotaTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            QuotaTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new QuotaTypeEnum(value);
            }
            return result;
        }

        public static QuotaTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            QuotaTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QuotaTypeEnum) {
                return this.value.equals(((QuotaTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_type")

    private QuotaTypeEnum quotaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_number")

    private Integer quotaNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_used")

    private Integer quotaUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection_id")

    private String cloudConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    public Quota withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public Quota withQuotaType(QuotaTypeEnum quotaType) {
        this.quotaType = quotaType;
        return this;
    }

    /**
     * 配额类型： - cloud_connection: 可加载的云连接实例数 - cloud_connection_region: 某云连接实例下可加载的Region数 - cloud_connection_route: 某云连接实例下可加载的路由数 - region_network_instance: 某云连接实例下某个Region下可加载的网络实例数
     * @return quotaType
     */
    public QuotaTypeEnum getQuotaType() {
        return quotaType;
    }

    public void setQuotaType(QuotaTypeEnum quotaType) {
        this.quotaType = quotaType;
    }

    public Quota withQuotaNumber(Integer quotaNumber) {
        this.quotaNumber = quotaNumber;
        return this;
    }

    /**
     * 配额数量。
     * minimum: 0
     * maximum: 102400
     * @return quotaNumber
     */
    public Integer getQuotaNumber() {
        return quotaNumber;
    }

    public void setQuotaNumber(Integer quotaNumber) {
        this.quotaNumber = quotaNumber;
    }

    public Quota withQuotaUsed(Integer quotaUsed) {
        this.quotaUsed = quotaUsed;
        return this;
    }

    /**
     * 配额使用数量。
     * minimum: 0
     * maximum: 102400
     * @return quotaUsed
     */
    public Integer getQuotaUsed() {
        return quotaUsed;
    }

    public void setQuotaUsed(Integer quotaUsed) {
        this.quotaUsed = quotaUsed;
    }

    public Quota withCloudConnectionId(String cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
        return this;
    }

    /**
     * 云连接ID。
     * @return cloudConnectionId
     */
    public String getCloudConnectionId() {
        return cloudConnectionId;
    }

    public void setCloudConnectionId(String cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
    }

    public Quota withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 网络实例的RegionID。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Quota quota = (Quota) o;
        return Objects.equals(this.domainId, quota.domainId) && Objects.equals(this.quotaType, quota.quotaType)
            && Objects.equals(this.quotaNumber, quota.quotaNumber) && Objects.equals(this.quotaUsed, quota.quotaUsed)
            && Objects.equals(this.cloudConnectionId, quota.cloudConnectionId)
            && Objects.equals(this.regionId, quota.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, quotaType, quotaNumber, quotaUsed, cloudConnectionId, regionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Quota {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
        sb.append("    quotaNumber: ").append(toIndentedString(quotaNumber)).append("\n");
        sb.append("    quotaUsed: ").append(toIndentedString(quotaUsed)).append("\n");
        sb.append("    cloudConnectionId: ").append(toIndentedString(cloudConnectionId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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
