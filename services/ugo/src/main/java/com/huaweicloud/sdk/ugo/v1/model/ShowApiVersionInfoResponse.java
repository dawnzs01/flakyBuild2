package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowApiVersionInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private String links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    /**
     * 版本的状态。
     */
    public static final class StatusEnum {

        /**
         * Enum CURRENT for value: "CURRENT"
         */
        public static final StatusEnum CURRENT = new StatusEnum("CURRENT");

        /**
         * Enum SUPPORTED for value: "SUPPORTED"
         */
        public static final StatusEnum SUPPORTED = new StatusEnum("SUPPORTED");

        /**
         * Enum DEPRECATED for value: "DEPRECATED"
         */
        public static final StatusEnum DEPRECATED = new StatusEnum("DEPRECATED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CURRENT", CURRENT);
            map.put("SUPPORTED", SUPPORTED);
            map.put("DEPRECATED", DEPRECATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    public ShowApiVersionInfoResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 版本ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowApiVersionInfoResponse withLinks(String links) {
        this.links = links;
        return this;
    }

    /**
     * 版本详情的URL地址。
     * @return links
     */
    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public ShowApiVersionInfoResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 该版本API的微版本信息。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowApiVersionInfoResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 版本的状态。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowApiVersionInfoResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 版本更新时间。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowApiVersionInfoResponse showApiVersionInfoResponse = (ShowApiVersionInfoResponse) o;
        return Objects.equals(this.id, showApiVersionInfoResponse.id)
            && Objects.equals(this.links, showApiVersionInfoResponse.links)
            && Objects.equals(this.version, showApiVersionInfoResponse.version)
            && Objects.equals(this.status, showApiVersionInfoResponse.status)
            && Objects.equals(this.updated, showApiVersionInfoResponse.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, links, version, status, updated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowApiVersionInfoResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
