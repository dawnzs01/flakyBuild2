package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 实例规格详情。
 */
public class CreateInstanceFlavorOption {

    /**
     * 节点类型。 取值：   - 集群实例包含mongos、shard和config节点，各节点下该参数取值分别为“mongos”、“shard”和“config”。   - 副本集实例下该参数取值为“replica”。   - 单节点实例下该参数取值为“single”。
     */
    public static final class TypeEnum {

        /**
         * Enum MONGOS for value: "mongos"
         */
        public static final TypeEnum MONGOS = new TypeEnum("mongos");

        /**
         * Enum SHARD for value: "shard"
         */
        public static final TypeEnum SHARD = new TypeEnum("shard");

        /**
         * Enum CONFIG for value: "config"
         */
        public static final TypeEnum CONFIG = new TypeEnum("config");

        /**
         * Enum REPLICA for value: "replica"
         */
        public static final TypeEnum REPLICA = new TypeEnum("replica");

        /**
         * Enum SINGLE for value: "single"
         */
        public static final TypeEnum SINGLE = new TypeEnum("single");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("mongos", MONGOS);
            map.put("shard", SHARD);
            map.put("config", CONFIG);
            map.put("replica", REPLICA);
            map.put("single", SINGLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private String num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage")

    private String storage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    public CreateInstanceFlavorOption withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 节点类型。 取值：   - 集群实例包含mongos、shard和config节点，各节点下该参数取值分别为“mongos”、“shard”和“config”。   - 副本集实例下该参数取值为“replica”。   - 单节点实例下该参数取值为“single”。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateInstanceFlavorOption withNum(String num) {
        this.num = num;
        return this;
    }

    /**
     * 节点数量。 取值：   - 集群实例下“mongos”类型的节点数量可取2~16。   - 集群实例下“shard”类型的组数量可取2~16。   - “shard”类型的组数量可取2~16。   - “config”类型的组数量只能取1。   - “replica”类型的组数量可取3，5，7。   - “single”类型的节点数量只能取1。
     * @return num
     */
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public CreateInstanceFlavorOption withStorage(String storage) {
        this.storage = storage;
        return this;
    }

    /**
     * 磁盘类型。 取值：ULTRAHIGH，表示SSD。   - 对于集群实例的shard和config节点、副本集、以及单节点实例，该参数有效。mongos节点不涉及选择磁盘，该参数无意义。
     * @return storage
     */
    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public CreateInstanceFlavorOption withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * 磁盘大小。 取值：必须为10的整数倍。单位为GB。   - 对于集群实例，shard组可取10GB~2000GB，config组仅可取20GB。mongos节点不涉及选择磁盘，该参数无意义。   - 对于副本集实例，可取10GB~2000GB。   - 对于单节点实例，可取10GB~1000GB。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public CreateInstanceFlavorOption withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 资源规格编码
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceFlavorOption createInstanceFlavorOption = (CreateInstanceFlavorOption) o;
        return Objects.equals(this.type, createInstanceFlavorOption.type)
            && Objects.equals(this.num, createInstanceFlavorOption.num)
            && Objects.equals(this.storage, createInstanceFlavorOption.storage)
            && Objects.equals(this.size, createInstanceFlavorOption.size)
            && Objects.equals(this.specCode, createInstanceFlavorOption.specCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, num, storage, size, specCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceFlavorOption {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
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
