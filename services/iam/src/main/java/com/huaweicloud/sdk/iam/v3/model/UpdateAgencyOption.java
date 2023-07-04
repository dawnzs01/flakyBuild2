package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 
 */
public class UpdateAgencyOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_domain_id")

    private String trustDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_domain_name")

    private String trustDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 委托的期限。取值为“FOREVER\"表示委托的期限为永久，取值为\"ONEDAY\"表示委托的期限为一天。四个参数至少填写一个。
     */
    public static final class DurationEnum {

        /**
         * Enum FOREVER for value: "FOREVER"
         */
        public static final DurationEnum FOREVER = new DurationEnum("FOREVER");

        /**
         * Enum ONEDAY for value: "ONEDAY"
         */
        public static final DurationEnum ONEDAY = new DurationEnum("ONEDAY");

        private static final Map<String, DurationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DurationEnum> createStaticFields() {
            Map<String, DurationEnum> map = new HashMap<>();
            map.put("FOREVER", FOREVER);
            map.put("ONEDAY", ONEDAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DurationEnum(String value) {
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
        public static DurationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DurationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DurationEnum(value);
            }
            return result;
        }

        public static DurationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DurationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DurationEnum) {
                return this.value.equals(((DurationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private DurationEnum duration;

    public UpdateAgencyOption withTrustDomainId(String trustDomainId) {
        this.trustDomainId = trustDomainId;
        return this;
    }

    /**
     * 被委托方账号ID。如果trust_domain_id和trust_domain_name都填写，则优先校验trust_domain_name。四个参数至少填写一个。
     * @return trustDomainId
     */
    public String getTrustDomainId() {
        return trustDomainId;
    }

    public void setTrustDomainId(String trustDomainId) {
        this.trustDomainId = trustDomainId;
    }

    public UpdateAgencyOption withTrustDomainName(String trustDomainName) {
        this.trustDomainName = trustDomainName;
        return this;
    }

    /**
     * 被委托方账号名。如果trust_domain_id和trust_domain_name都填写，则优先校验trust_domain_name。四个参数至少填写一个。
     * @return trustDomainName
     */
    public String getTrustDomainName() {
        return trustDomainName;
    }

    public void setTrustDomainName(String trustDomainName) {
        this.trustDomainName = trustDomainName;
    }

    public UpdateAgencyOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 委托描述信息，长度不大于255位。四个参数至少填写一个。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateAgencyOption withDuration(DurationEnum duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 委托的期限。取值为“FOREVER\"表示委托的期限为永久，取值为\"ONEDAY\"表示委托的期限为一天。四个参数至少填写一个。
     * @return duration
     */
    public DurationEnum getDuration() {
        return duration;
    }

    public void setDuration(DurationEnum duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAgencyOption updateAgencyOption = (UpdateAgencyOption) o;
        return Objects.equals(this.trustDomainId, updateAgencyOption.trustDomainId)
            && Objects.equals(this.trustDomainName, updateAgencyOption.trustDomainName)
            && Objects.equals(this.description, updateAgencyOption.description)
            && Objects.equals(this.duration, updateAgencyOption.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trustDomainId, trustDomainName, description, duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAgencyOption {\n");
        sb.append("    trustDomainId: ").append(toIndentedString(trustDomainId)).append("\n");
        sb.append("    trustDomainName: ").append(toIndentedString(trustDomainName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
