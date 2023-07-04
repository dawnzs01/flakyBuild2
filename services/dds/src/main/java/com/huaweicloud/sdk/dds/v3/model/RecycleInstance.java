package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RecycleInstance
 */
public class RecycleInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private RecycleDatastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_mode")

    private String payMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted_at")

    private String deletedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retained_until")

    private String retainedUntil;

    public RecycleInstance withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RecycleInstance withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecycleInstance withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 实例类型。支持集群、副本集、以及单节点。 取值   - Sharding   - ReplicaSet   - Single
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public RecycleInstance withDatastore(RecycleDatastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public RecycleInstance withDatastore(Consumer<RecycleDatastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new RecycleDatastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public RecycleDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(RecycleDatastore datastore) {
        this.datastore = datastore;
    }

    public RecycleInstance withPayMode(String payMode) {
        this.payMode = payMode;
        return this;
    }

    /**
     * 计费方式。 - 取值为“0”，表示按需计费。 - 取值为“1”，表示包年/包月计费。
     * @return payMode
     */
    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public RecycleInstance withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，取值为“0”，表示为default企业项目
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public RecycleInstance withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 备份ID
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public RecycleInstance withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RecycleInstance withDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }

    /**
     * 删除时间
     * @return deletedAt
     */
    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public RecycleInstance withRetainedUntil(String retainedUntil) {
        this.retainedUntil = retainedUntil;
        return this;
    }

    /**
     * 保留截止时间
     * @return retainedUntil
     */
    public String getRetainedUntil() {
        return retainedUntil;
    }

    public void setRetainedUntil(String retainedUntil) {
        this.retainedUntil = retainedUntil;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecycleInstance recycleInstance = (RecycleInstance) o;
        return Objects.equals(this.id, recycleInstance.id) && Objects.equals(this.name, recycleInstance.name)
            && Objects.equals(this.mode, recycleInstance.mode)
            && Objects.equals(this.datastore, recycleInstance.datastore)
            && Objects.equals(this.payMode, recycleInstance.payMode)
            && Objects.equals(this.enterpriseProjectId, recycleInstance.enterpriseProjectId)
            && Objects.equals(this.backupId, recycleInstance.backupId)
            && Objects.equals(this.createdAt, recycleInstance.createdAt)
            && Objects.equals(this.deletedAt, recycleInstance.deletedAt)
            && Objects.equals(this.retainedUntil, recycleInstance.retainedUntil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            mode,
            datastore,
            payMode,
            enterpriseProjectId,
            backupId,
            createdAt,
            deletedAt,
            retainedUntil);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecycleInstance {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    payMode: ").append(toIndentedString(payMode)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
        sb.append("    retainedUntil: ").append(toIndentedString(retainedUntil)).append("\n");
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
