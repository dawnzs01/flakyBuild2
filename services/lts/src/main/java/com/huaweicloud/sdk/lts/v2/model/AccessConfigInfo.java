package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 日志接入配置
 */
public class AccessConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_id")

    private String accessConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_name")

    private String accessConfigName;

    /**
     * 日志接入类型。AGENT：主机接入
     */
    public static final class AccessConfigTypeEnum {

        /**
         * Enum AGENT for value: "AGENT"
         */
        public static final AccessConfigTypeEnum AGENT = new AccessConfigTypeEnum("AGENT");

        private static final Map<String, AccessConfigTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessConfigTypeEnum> createStaticFields() {
            Map<String, AccessConfigTypeEnum> map = new HashMap<>();
            map.put("AGENT", AGENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessConfigTypeEnum(String value) {
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
        public static AccessConfigTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AccessConfigTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AccessConfigTypeEnum(value);
            }
            return result;
        }

        public static AccessConfigTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AccessConfigTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessConfigTypeEnum) {
                return this.value.equals(((AccessConfigTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_type")

    private AccessConfigTypeEnum accessConfigType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_detail")

    private AccessConfigDeatil accessConfigDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_info")

    private AccessConfigQueryLogInfo logInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_info")

    private AccessConfigHostGroupIdList hostGroupInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_tag")

    private List<AccessConfigTag> accessConfigTag = null;

    public AccessConfigInfo withAccessConfigId(String accessConfigId) {
        this.accessConfigId = accessConfigId;
        return this;
    }

    /**
     * 日志接入ID
     * @return accessConfigId
     */
    public String getAccessConfigId() {
        return accessConfigId;
    }

    public void setAccessConfigId(String accessConfigId) {
        this.accessConfigId = accessConfigId;
    }

    public AccessConfigInfo withAccessConfigName(String accessConfigName) {
        this.accessConfigName = accessConfigName;
        return this;
    }

    /**
     * 日志接入名称
     * @return accessConfigName
     */
    public String getAccessConfigName() {
        return accessConfigName;
    }

    public void setAccessConfigName(String accessConfigName) {
        this.accessConfigName = accessConfigName;
    }

    public AccessConfigInfo withAccessConfigType(AccessConfigTypeEnum accessConfigType) {
        this.accessConfigType = accessConfigType;
        return this;
    }

    /**
     * 日志接入类型。AGENT：主机接入
     * @return accessConfigType
     */
    public AccessConfigTypeEnum getAccessConfigType() {
        return accessConfigType;
    }

    public void setAccessConfigType(AccessConfigTypeEnum accessConfigType) {
        this.accessConfigType = accessConfigType;
    }

    public AccessConfigInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 1
     * maximum: 9999999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public AccessConfigInfo withAccessConfigDetail(AccessConfigDeatil accessConfigDetail) {
        this.accessConfigDetail = accessConfigDetail;
        return this;
    }

    public AccessConfigInfo withAccessConfigDetail(Consumer<AccessConfigDeatil> accessConfigDetailSetter) {
        if (this.accessConfigDetail == null) {
            this.accessConfigDetail = new AccessConfigDeatil();
            accessConfigDetailSetter.accept(this.accessConfigDetail);
        }

        return this;
    }

    /**
     * Get accessConfigDetail
     * @return accessConfigDetail
     */
    public AccessConfigDeatil getAccessConfigDetail() {
        return accessConfigDetail;
    }

    public void setAccessConfigDetail(AccessConfigDeatil accessConfigDetail) {
        this.accessConfigDetail = accessConfigDetail;
    }

    public AccessConfigInfo withLogInfo(AccessConfigQueryLogInfo logInfo) {
        this.logInfo = logInfo;
        return this;
    }

    public AccessConfigInfo withLogInfo(Consumer<AccessConfigQueryLogInfo> logInfoSetter) {
        if (this.logInfo == null) {
            this.logInfo = new AccessConfigQueryLogInfo();
            logInfoSetter.accept(this.logInfo);
        }

        return this;
    }

    /**
     * Get logInfo
     * @return logInfo
     */
    public AccessConfigQueryLogInfo getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(AccessConfigQueryLogInfo logInfo) {
        this.logInfo = logInfo;
    }

    public AccessConfigInfo withHostGroupInfo(AccessConfigHostGroupIdList hostGroupInfo) {
        this.hostGroupInfo = hostGroupInfo;
        return this;
    }

    public AccessConfigInfo withHostGroupInfo(Consumer<AccessConfigHostGroupIdList> hostGroupInfoSetter) {
        if (this.hostGroupInfo == null) {
            this.hostGroupInfo = new AccessConfigHostGroupIdList();
            hostGroupInfoSetter.accept(this.hostGroupInfo);
        }

        return this;
    }

    /**
     * Get hostGroupInfo
     * @return hostGroupInfo
     */
    public AccessConfigHostGroupIdList getHostGroupInfo() {
        return hostGroupInfo;
    }

    public void setHostGroupInfo(AccessConfigHostGroupIdList hostGroupInfo) {
        this.hostGroupInfo = hostGroupInfo;
    }

    public AccessConfigInfo withAccessConfigTag(List<AccessConfigTag> accessConfigTag) {
        this.accessConfigTag = accessConfigTag;
        return this;
    }

    public AccessConfigInfo addAccessConfigTagItem(AccessConfigTag accessConfigTagItem) {
        if (this.accessConfigTag == null) {
            this.accessConfigTag = new ArrayList<>();
        }
        this.accessConfigTag.add(accessConfigTagItem);
        return this;
    }

    public AccessConfigInfo withAccessConfigTag(Consumer<List<AccessConfigTag>> accessConfigTagSetter) {
        if (this.accessConfigTag == null) {
            this.accessConfigTag = new ArrayList<>();
        }
        accessConfigTagSetter.accept(this.accessConfigTag);
        return this;
    }

    /**
     * Get accessConfigTag
     * @return accessConfigTag
     */
    public List<AccessConfigTag> getAccessConfigTag() {
        return accessConfigTag;
    }

    public void setAccessConfigTag(List<AccessConfigTag> accessConfigTag) {
        this.accessConfigTag = accessConfigTag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessConfigInfo accessConfigInfo = (AccessConfigInfo) o;
        return Objects.equals(this.accessConfigId, accessConfigInfo.accessConfigId)
            && Objects.equals(this.accessConfigName, accessConfigInfo.accessConfigName)
            && Objects.equals(this.accessConfigType, accessConfigInfo.accessConfigType)
            && Objects.equals(this.createTime, accessConfigInfo.createTime)
            && Objects.equals(this.accessConfigDetail, accessConfigInfo.accessConfigDetail)
            && Objects.equals(this.logInfo, accessConfigInfo.logInfo)
            && Objects.equals(this.hostGroupInfo, accessConfigInfo.hostGroupInfo)
            && Objects.equals(this.accessConfigTag, accessConfigInfo.accessConfigTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessConfigId,
            accessConfigName,
            accessConfigType,
            createTime,
            accessConfigDetail,
            logInfo,
            hostGroupInfo,
            accessConfigTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConfigInfo {\n");
        sb.append("    accessConfigId: ").append(toIndentedString(accessConfigId)).append("\n");
        sb.append("    accessConfigName: ").append(toIndentedString(accessConfigName)).append("\n");
        sb.append("    accessConfigType: ").append(toIndentedString(accessConfigType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    accessConfigDetail: ").append(toIndentedString(accessConfigDetail)).append("\n");
        sb.append("    logInfo: ").append(toIndentedString(logInfo)).append("\n");
        sb.append("    hostGroupInfo: ").append(toIndentedString(hostGroupInfo)).append("\n");
        sb.append("    accessConfigTag: ").append(toIndentedString(accessConfigTag)).append("\n");
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
