package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_access_time")

    private OffsetDateTime lastAccessTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_analyzed_time")

    private OffsetDateTime lastAnalyzedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    /**
     * 用户类型
     */
    public static final class OwnerTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final OwnerTypeEnum USER = new OwnerTypeEnum("USER");

        /**
         * Enum GROUP for value: "GROUP"
         */
        public static final OwnerTypeEnum GROUP = new OwnerTypeEnum("GROUP");

        /**
         * Enum ROLE for value: "ROLE"
         */
        public static final OwnerTypeEnum ROLE = new OwnerTypeEnum("ROLE");

        private static final Map<String, OwnerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OwnerTypeEnum> createStaticFields() {
            Map<String, OwnerTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("GROUP", GROUP);
            map.put("ROLE", ROLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OwnerTypeEnum(String value) {
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
        public static OwnerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OwnerTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OwnerTypeEnum(value);
            }
            return result;
        }

        public static OwnerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OwnerTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OwnerTypeEnum) {
                return this.value.equals(((OwnerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_type")

    private OwnerTypeEnum ownerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Map<String, String> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_keys")

    private List<Column> partitionKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention")

    private Integer retention;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_descriptor")

    private StorageDescriptor storageDescriptor;

    /**
     * 表类型
     */
    public static final class TableTypeEnum {

        /**
         * Enum MANAGED_TABLE for value: "MANAGED_TABLE"
         */
        public static final TableTypeEnum MANAGED_TABLE = new TableTypeEnum("MANAGED_TABLE");

        /**
         * Enum EXTERNAL_TABLE for value: "EXTERNAL_TABLE"
         */
        public static final TableTypeEnum EXTERNAL_TABLE = new TableTypeEnum("EXTERNAL_TABLE");

        /**
         * Enum VIRTUAL_VIEW for value: "VIRTUAL_VIEW"
         */
        public static final TableTypeEnum VIRTUAL_VIEW = new TableTypeEnum("VIRTUAL_VIEW");

        /**
         * Enum MATERIALIZED_VIEW for value: "MATERIALIZED_VIEW"
         */
        public static final TableTypeEnum MATERIALIZED_VIEW = new TableTypeEnum("MATERIALIZED_VIEW");

        private static final Map<String, TableTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TableTypeEnum> createStaticFields() {
            Map<String, TableTypeEnum> map = new HashMap<>();
            map.put("MANAGED_TABLE", MANAGED_TABLE);
            map.put("EXTERNAL_TABLE", EXTERNAL_TABLE);
            map.put("VIRTUAL_VIEW", VIRTUAL_VIEW);
            map.put("MATERIALIZED_VIEW", MATERIALIZED_VIEW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TableTypeEnum(String value) {
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
        public static TableTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TableTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TableTypeEnum(value);
            }
            return result;
        }

        public static TableTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TableTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TableTypeEnum) {
                return this.value.equals(((TableTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_type")

    private TableTypeEnum tableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comments")

    private String comments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_expanded_text")

    private String viewExpandedText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_original_text")

    private String viewOriginalText;

    public ShowTableResponse withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * catalog名字
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public ShowTableResponse withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名字
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ShowTableResponse withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名字
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ShowTableResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ShowTableResponse withLastAccessTime(OffsetDateTime lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }

    /**
     * 最后访问时间
     * @return lastAccessTime
     */
    public OffsetDateTime getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(OffsetDateTime lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public ShowTableResponse withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 表元数据最后一次修改时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ShowTableResponse withLastAnalyzedTime(OffsetDateTime lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
        return this;
    }

    /**
     * 上一次做列级别的统计信息计算的时间
     * @return lastAnalyzedTime
     */
    public OffsetDateTime getLastAnalyzedTime() {
        return lastAnalyzedTime;
    }

    public void setLastAnalyzedTime(OffsetDateTime lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
    }

    public ShowTableResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 用户信息
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ShowTableResponse withOwnerType(OwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    /**
     * 用户类型
     * @return ownerType
     */
    public OwnerTypeEnum getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(OwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
    }

    public ShowTableResponse withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public ShowTableResponse putParametersItem(String key, String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public ShowTableResponse withParameters(Consumer<Map<String, String>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 参数
     * @return parameters
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public ShowTableResponse withPartitionKeys(List<Column> partitionKeys) {
        this.partitionKeys = partitionKeys;
        return this;
    }

    public ShowTableResponse addPartitionKeysItem(Column partitionKeysItem) {
        if (this.partitionKeys == null) {
            this.partitionKeys = new ArrayList<>();
        }
        this.partitionKeys.add(partitionKeysItem);
        return this;
    }

    public ShowTableResponse withPartitionKeys(Consumer<List<Column>> partitionKeysSetter) {
        if (this.partitionKeys == null) {
            this.partitionKeys = new ArrayList<>();
        }
        partitionKeysSetter.accept(this.partitionKeys);
        return this;
    }

    /**
     * 表分区列的列表
     * @return partitionKeys
     */
    public List<Column> getPartitionKeys() {
        return partitionKeys;
    }

    public void setPartitionKeys(List<Column> partitionKeys) {
        this.partitionKeys = partitionKeys;
    }

    public ShowTableResponse withRetention(Integer retention) {
        this.retention = retention;
        return this;
    }

    /**
     * 表保留时间
     * @return retention
     */
    public Integer getRetention() {
        return retention;
    }

    public void setRetention(Integer retention) {
        this.retention = retention;
    }

    public ShowTableResponse withStorageDescriptor(StorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
        return this;
    }

    public ShowTableResponse withStorageDescriptor(Consumer<StorageDescriptor> storageDescriptorSetter) {
        if (this.storageDescriptor == null) {
            this.storageDescriptor = new StorageDescriptor();
            storageDescriptorSetter.accept(this.storageDescriptor);
        }

        return this;
    }

    /**
     * Get storageDescriptor
     * @return storageDescriptor
     */
    public StorageDescriptor getStorageDescriptor() {
        return storageDescriptor;
    }

    public void setStorageDescriptor(StorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
    }

    public ShowTableResponse withTableType(TableTypeEnum tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * 表类型
     * @return tableType
     */
    public TableTypeEnum getTableType() {
        return tableType;
    }

    public void setTableType(TableTypeEnum tableType) {
        this.tableType = tableType;
    }

    public ShowTableResponse withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * 表描述信息
     * @return comments
     */
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public ShowTableResponse withViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
        return this;
    }

    /**
     * 如果表是视图，则为视图的扩展文本；否则为 null
     * @return viewExpandedText
     */
    public String getViewExpandedText() {
        return viewExpandedText;
    }

    public void setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
    }

    public ShowTableResponse withViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
        return this;
    }

    /**
     * 如果表是视图，则为视图的原始文本；否则为 null
     * @return viewOriginalText
     */
    public String getViewOriginalText() {
        return viewOriginalText;
    }

    public void setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTableResponse showTableResponse = (ShowTableResponse) o;
        return Objects.equals(this.catalogName, showTableResponse.catalogName)
            && Objects.equals(this.databaseName, showTableResponse.databaseName)
            && Objects.equals(this.tableName, showTableResponse.tableName)
            && Objects.equals(this.createTime, showTableResponse.createTime)
            && Objects.equals(this.lastAccessTime, showTableResponse.lastAccessTime)
            && Objects.equals(this.updateTime, showTableResponse.updateTime)
            && Objects.equals(this.lastAnalyzedTime, showTableResponse.lastAnalyzedTime)
            && Objects.equals(this.owner, showTableResponse.owner)
            && Objects.equals(this.ownerType, showTableResponse.ownerType)
            && Objects.equals(this.parameters, showTableResponse.parameters)
            && Objects.equals(this.partitionKeys, showTableResponse.partitionKeys)
            && Objects.equals(this.retention, showTableResponse.retention)
            && Objects.equals(this.storageDescriptor, showTableResponse.storageDescriptor)
            && Objects.equals(this.tableType, showTableResponse.tableType)
            && Objects.equals(this.comments, showTableResponse.comments)
            && Objects.equals(this.viewExpandedText, showTableResponse.viewExpandedText)
            && Objects.equals(this.viewOriginalText, showTableResponse.viewOriginalText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogName,
            databaseName,
            tableName,
            createTime,
            lastAccessTime,
            updateTime,
            lastAnalyzedTime,
            owner,
            ownerType,
            parameters,
            partitionKeys,
            retention,
            storageDescriptor,
            tableType,
            comments,
            viewExpandedText,
            viewOriginalText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTableResponse {\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastAccessTime: ").append(toIndentedString(lastAccessTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    lastAnalyzedTime: ").append(toIndentedString(lastAnalyzedTime)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    partitionKeys: ").append(toIndentedString(partitionKeys)).append("\n");
        sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
        sb.append("    storageDescriptor: ").append(toIndentedString(storageDescriptor)).append("\n");
        sb.append("    tableType: ").append(toIndentedString(tableType)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    viewExpandedText: ").append(toIndentedString(viewExpandedText)).append("\n");
        sb.append("    viewOriginalText: ").append(toIndentedString(viewOriginalText)).append("\n");
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
