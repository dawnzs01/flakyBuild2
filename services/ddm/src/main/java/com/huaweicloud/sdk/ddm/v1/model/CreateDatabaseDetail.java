package com.huaweicloud.sdk.ddm.v1.model;

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
 * databases参数说明
 */
public class CreateDatabaseDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 逻辑库的拆分模式。 - cluster表示逻辑库是拆分模式。 - single表示逻辑库是非拆分模式。
     */
    public static final class ShardModeEnum {

        /**
         * Enum CLUSTER for value: "cluster"
         */
        public static final ShardModeEnum CLUSTER = new ShardModeEnum("cluster");

        /**
         * Enum SINGLE for value: "single"
         */
        public static final ShardModeEnum SINGLE = new ShardModeEnum("single");

        private static final Map<String, ShardModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ShardModeEnum> createStaticFields() {
            Map<String, ShardModeEnum> map = new HashMap<>();
            map.put("cluster", CLUSTER);
            map.put("single", SINGLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ShardModeEnum(String value) {
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
        public static ShardModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ShardModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ShardModeEnum(value);
            }
            return result;
        }

        public static ShardModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ShardModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ShardModeEnum) {
                return this.value.equals(((ShardModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_mode")

    private ShardModeEnum shardMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_number")

    private Integer shardNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_unit")

    private Integer shardUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_rds")

    private List<DatabaseInstabcesParam> usedRds = null;

    public CreateDatabaseDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 逻辑库名称，需要满足以下条件：  - 长度为2-48个字符。 - 必须以小写字母开头。 - 可以包含小写字母、数字、下划线，不能包含大写字母和其它特殊字符。 - 禁用关键字：  \"information_schema\"、\"mysql\"、\"performance_schema\"、\"sys\"。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDatabaseDetail withShardMode(ShardModeEnum shardMode) {
        this.shardMode = shardMode;
        return this;
    }

    /**
     * 逻辑库的拆分模式。 - cluster表示逻辑库是拆分模式。 - single表示逻辑库是非拆分模式。
     * @return shardMode
     */
    public ShardModeEnum getShardMode() {
        return shardMode;
    }

    public void setShardMode(ShardModeEnum shardMode) {
        this.shardMode = shardMode;
    }

    public CreateDatabaseDetail withShardNumber(Integer shardNumber) {
        this.shardNumber = shardNumber;
        return this;
    }

    /**
     * 同一种工作模式下逻辑库分片的数量。 - shard_unit不为空， shard_unit与关联rds数量的乘积 - shard_unit为空，大于关联的RDS数量，小于等于关联rds数量*64。
     * @return shardNumber
     */
    public Integer getShardNumber() {
        return shardNumber;
    }

    public void setShardNumber(Integer shardNumber) {
        this.shardNumber = shardNumber;
    }

    public CreateDatabaseDetail withShardUnit(Integer shardUnit) {
        this.shardUnit = shardUnit;
        return this;
    }

    /**
     * 单个RDS上的逻辑库分片数。非必选  - 非拆分逻辑库，固定为1。 - 拆分逻辑库，大于等于1，小于等于64。
     * minimum: 1
     * maximum: 64
     * @return shardUnit
     */
    public Integer getShardUnit() {
        return shardUnit;
    }

    public void setShardUnit(Integer shardUnit) {
        this.shardUnit = shardUnit;
    }

    public CreateDatabaseDetail withUsedRds(List<DatabaseInstabcesParam> usedRds) {
        this.usedRds = usedRds;
        return this;
    }

    public CreateDatabaseDetail addUsedRdsItem(DatabaseInstabcesParam usedRdsItem) {
        if (this.usedRds == null) {
            this.usedRds = new ArrayList<>();
        }
        this.usedRds.add(usedRdsItem);
        return this;
    }

    public CreateDatabaseDetail withUsedRds(Consumer<List<DatabaseInstabcesParam>> usedRdsSetter) {
        if (this.usedRds == null) {
            this.usedRds = new ArrayList<>();
        }
        usedRdsSetter.accept(this.usedRds);
        return this;
    }

    /**
     * 逻辑库关联的RDS。
     * @return usedRds
     */
    public List<DatabaseInstabcesParam> getUsedRds() {
        return usedRds;
    }

    public void setUsedRds(List<DatabaseInstabcesParam> usedRds) {
        this.usedRds = usedRds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDatabaseDetail createDatabaseDetail = (CreateDatabaseDetail) o;
        return Objects.equals(this.name, createDatabaseDetail.name)
            && Objects.equals(this.shardMode, createDatabaseDetail.shardMode)
            && Objects.equals(this.shardNumber, createDatabaseDetail.shardNumber)
            && Objects.equals(this.shardUnit, createDatabaseDetail.shardUnit)
            && Objects.equals(this.usedRds, createDatabaseDetail.usedRds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shardMode, shardNumber, shardUnit, usedRds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatabaseDetail {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shardMode: ").append(toIndentedString(shardMode)).append("\n");
        sb.append("    shardNumber: ").append(toIndentedString(shardNumber)).append("\n");
        sb.append("    shardUnit: ").append(toIndentedString(shardUnit)).append("\n");
        sb.append("    usedRds: ").append(toIndentedString(usedRds)).append("\n");
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
