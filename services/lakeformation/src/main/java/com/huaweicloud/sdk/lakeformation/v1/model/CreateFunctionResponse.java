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
public class CreateFunctionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_name")

    private String functionName;

    /**
     * 函数类型
     */
    public static final class FunctionTypeEnum {

        /**
         * Enum JAVA for value: "JAVA"
         */
        public static final FunctionTypeEnum JAVA = new FunctionTypeEnum("JAVA");

        private static final Map<String, FunctionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FunctionTypeEnum> createStaticFields() {
            Map<String, FunctionTypeEnum> map = new HashMap<>();
            map.put("JAVA", JAVA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FunctionTypeEnum(String value) {
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
        public static FunctionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FunctionTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FunctionTypeEnum(value);
            }
            return result;
        }

        public static FunctionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FunctionTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FunctionTypeEnum) {
                return this.value.equals(((FunctionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_type")

    private FunctionTypeEnum functionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    /**
     * 所有者类型
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
    @JsonProperty(value = "class_name")

    private String className;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_uris")

    private List<FunctionResourceUri> resourceUris = null;

    public CreateFunctionResponse withCatalogName(String catalogName) {
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

    public CreateFunctionResponse withDatabaseName(String databaseName) {
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

    public CreateFunctionResponse withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * 函数名
     * @return functionName
     */
    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public CreateFunctionResponse withFunctionType(FunctionTypeEnum functionType) {
        this.functionType = functionType;
        return this;
    }

    /**
     * 函数类型
     * @return functionType
     */
    public FunctionTypeEnum getFunctionType() {
        return functionType;
    }

    public void setFunctionType(FunctionTypeEnum functionType) {
        this.functionType = functionType;
    }

    public CreateFunctionResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 函数所有者
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public CreateFunctionResponse withOwnerType(OwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    /**
     * 所有者类型
     * @return ownerType
     */
    public OwnerTypeEnum getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(OwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
    }

    public CreateFunctionResponse withClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * 函数类名
     * @return className
     */
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public CreateFunctionResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间格式为yyyy-mm-ddThh:mm:sss
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public CreateFunctionResponse withResourceUris(List<FunctionResourceUri> resourceUris) {
        this.resourceUris = resourceUris;
        return this;
    }

    public CreateFunctionResponse addResourceUrisItem(FunctionResourceUri resourceUrisItem) {
        if (this.resourceUris == null) {
            this.resourceUris = new ArrayList<>();
        }
        this.resourceUris.add(resourceUrisItem);
        return this;
    }

    public CreateFunctionResponse withResourceUris(Consumer<List<FunctionResourceUri>> resourceUrisSetter) {
        if (this.resourceUris == null) {
            this.resourceUris = new ArrayList<>();
        }
        resourceUrisSetter.accept(this.resourceUris);
        return this;
    }

    /**
     * 函数地址信息
     * @return resourceUris
     */
    public List<FunctionResourceUri> getResourceUris() {
        return resourceUris;
    }

    public void setResourceUris(List<FunctionResourceUri> resourceUris) {
        this.resourceUris = resourceUris;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFunctionResponse createFunctionResponse = (CreateFunctionResponse) o;
        return Objects.equals(this.catalogName, createFunctionResponse.catalogName)
            && Objects.equals(this.databaseName, createFunctionResponse.databaseName)
            && Objects.equals(this.functionName, createFunctionResponse.functionName)
            && Objects.equals(this.functionType, createFunctionResponse.functionType)
            && Objects.equals(this.owner, createFunctionResponse.owner)
            && Objects.equals(this.ownerType, createFunctionResponse.ownerType)
            && Objects.equals(this.className, createFunctionResponse.className)
            && Objects.equals(this.createTime, createFunctionResponse.createTime)
            && Objects.equals(this.resourceUris, createFunctionResponse.resourceUris);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogName,
            databaseName,
            functionName,
            functionType,
            owner,
            ownerType,
            className,
            createTime,
            resourceUris);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFunctionResponse {\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    functionName: ").append(toIndentedString(functionName)).append("\n");
        sb.append("    functionType: ").append(toIndentedString(functionType)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    resourceUris: ").append(toIndentedString(resourceUris)).append("\n");
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
