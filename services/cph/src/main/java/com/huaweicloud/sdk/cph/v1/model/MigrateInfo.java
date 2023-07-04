package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 待迁移数据的云手机信息。
 */
public class MigrateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_phone_id")

    private String sourcePhoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_phone_id")

    private String targetPhoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_migrate_property")

    private String isMigrateProperty;

    public MigrateInfo withSourcePhoneId(String sourcePhoneId) {
        this.sourcePhoneId = sourcePhoneId;
        return this;
    }

    /**
     * 源云手机ID
     * @return sourcePhoneId
     */
    public String getSourcePhoneId() {
        return sourcePhoneId;
    }

    public void setSourcePhoneId(String sourcePhoneId) {
        this.sourcePhoneId = sourcePhoneId;
    }

    public MigrateInfo withTargetPhoneId(String targetPhoneId) {
        this.targetPhoneId = targetPhoneId;
        return this;
    }

    /**
     * 目标云手机ID
     * @return targetPhoneId
     */
    public String getTargetPhoneId() {
        return targetPhoneId;
    }

    public void setTargetPhoneId(String targetPhoneId) {
        this.targetPhoneId = targetPhoneId;
    }

    public MigrateInfo withIsMigrateProperty(String isMigrateProperty) {
        this.isMigrateProperty = isMigrateProperty;
        return this;
    }

    /**
     * 是否迁移原手机的属性到目标手机。为\"true\"时迁移（忽略大小写），不填写或者其他值，则不迁移
     * @return isMigrateProperty
     */
    public String getIsMigrateProperty() {
        return isMigrateProperty;
    }

    public void setIsMigrateProperty(String isMigrateProperty) {
        this.isMigrateProperty = isMigrateProperty;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrateInfo migrateInfo = (MigrateInfo) o;
        return Objects.equals(this.sourcePhoneId, migrateInfo.sourcePhoneId)
            && Objects.equals(this.targetPhoneId, migrateInfo.targetPhoneId)
            && Objects.equals(this.isMigrateProperty, migrateInfo.isMigrateProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourcePhoneId, targetPhoneId, isMigrateProperty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateInfo {\n");
        sb.append("    sourcePhoneId: ").append(toIndentedString(sourcePhoneId)).append("\n");
        sb.append("    targetPhoneId: ").append(toIndentedString(targetPhoneId)).append("\n");
        sb.append("    isMigrateProperty: ").append(toIndentedString(isMigrateProperty)).append("\n");
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
