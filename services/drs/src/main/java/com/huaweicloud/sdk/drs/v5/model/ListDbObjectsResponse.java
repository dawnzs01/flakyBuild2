package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDbObjectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_root_db")

    private TargetRootDb targetRootDb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_info")

    private Map<String, DatabaseObject> objectInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_table_num")

    private Integer maxTableNum;

    /**
     * 获取提交查询对象选择信息的状态
     */
    public static final class StatusEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum _FAILED for value: " failed"
         */
        public static final StatusEnum _FAILED = new StatusEnum(" failed");

        /**
         * Enum _PENDING for value: " pending"
         */
        public static final StatusEnum _PENDING = new StatusEnum(" pending");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put(" failed", _FAILED);
            map.put(" pending", _PENDING);
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
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_scope")

    private String objectScope;

    public ListDbObjectsResponse withTargetRootDb(TargetRootDb targetRootDb) {
        this.targetRootDb = targetRootDb;
        return this;
    }

    public ListDbObjectsResponse withTargetRootDb(Consumer<TargetRootDb> targetRootDbSetter) {
        if (this.targetRootDb == null) {
            this.targetRootDb = new TargetRootDb();
            targetRootDbSetter.accept(this.targetRootDb);
        }

        return this;
    }

    /**
     * Get targetRootDb
     * @return targetRootDb
     */
    public TargetRootDb getTargetRootDb() {
        return targetRootDb;
    }

    public void setTargetRootDb(TargetRootDb targetRootDb) {
        this.targetRootDb = targetRootDb;
    }

    public ListDbObjectsResponse withObjectInfo(Map<String, DatabaseObject> objectInfo) {
        this.objectInfo = objectInfo;
        return this;
    }

    public ListDbObjectsResponse putObjectInfoItem(String key, DatabaseObject objectInfoItem) {
        if (this.objectInfo == null) {
            this.objectInfo = new HashMap<>();
        }
        this.objectInfo.put(key, objectInfoItem);
        return this;
    }

    public ListDbObjectsResponse withObjectInfo(Consumer<Map<String, DatabaseObject>> objectInfoSetter) {
        if (this.objectInfo == null) {
            this.objectInfo = new HashMap<>();
        }
        objectInfoSetter.accept(this.objectInfo);
        return this;
    }

    /**
     * 数据库对象迁移或同步信息。
     * @return objectInfo
     */
    public Map<String, DatabaseObject> getObjectInfo() {
        return objectInfo;
    }

    public void setObjectInfo(Map<String, DatabaseObject> objectInfo) {
        this.objectInfo = objectInfo;
    }

    public ListDbObjectsResponse withMaxTableNum(Integer maxTableNum) {
        this.maxTableNum = maxTableNum;
        return this;
    }

    /**
     * 库下表数量的阈值。
     * @return maxTableNum
     */
    public Integer getMaxTableNum() {
        return maxTableNum;
    }

    public void setMaxTableNum(Integer maxTableNum) {
        this.maxTableNum = maxTableNum;
    }

    public ListDbObjectsResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 获取提交查询对象选择信息的状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListDbObjectsResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListDbObjectsResponse withObjectScope(String objectScope) {
        this.objectScope = objectScope;
        return this;
    }

    /**
     * 该数据库在实时同步场景下的类型
     * @return objectScope
     */
    public String getObjectScope() {
        return objectScope;
    }

    public void setObjectScope(String objectScope) {
        this.objectScope = objectScope;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDbObjectsResponse listDbObjectsResponse = (ListDbObjectsResponse) o;
        return Objects.equals(this.targetRootDb, listDbObjectsResponse.targetRootDb)
            && Objects.equals(this.objectInfo, listDbObjectsResponse.objectInfo)
            && Objects.equals(this.maxTableNum, listDbObjectsResponse.maxTableNum)
            && Objects.equals(this.status, listDbObjectsResponse.status)
            && Objects.equals(this.id, listDbObjectsResponse.id)
            && Objects.equals(this.objectScope, listDbObjectsResponse.objectScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetRootDb, objectInfo, maxTableNum, status, id, objectScope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDbObjectsResponse {\n");
        sb.append("    targetRootDb: ").append(toIndentedString(targetRootDb)).append("\n");
        sb.append("    objectInfo: ").append(toIndentedString(objectInfo)).append("\n");
        sb.append("    maxTableNum: ").append(toIndentedString(maxTableNum)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    objectScope: ").append(toIndentedString(objectScope)).append("\n");
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
