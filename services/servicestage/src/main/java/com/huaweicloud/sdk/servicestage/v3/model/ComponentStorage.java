package com.huaweicloud.sdk.servicestage.v3.model;

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
 * ComponentStorage
 */
public class ComponentStorage {

    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum HOSTPATH for value: "HostPath"
         */
        public static final TypeEnum HOSTPATH = new TypeEnum("HostPath");

        /**
         * Enum EMPTYDIR for value: "EmptyDir"
         */
        public static final TypeEnum EMPTYDIR = new TypeEnum("EmptyDir");

        /**
         * Enum CONFIGMAP for value: "ConfigMap"
         */
        public static final TypeEnum CONFIGMAP = new TypeEnum("ConfigMap");

        /**
         * Enum SECRET for value: "Secret"
         */
        public static final TypeEnum SECRET = new TypeEnum("Secret");

        /**
         * Enum PERSISTENTVOLUMECLAIM for value: "PersistentVolumeClaim"
         */
        public static final TypeEnum PERSISTENTVOLUMECLAIM = new TypeEnum("PersistentVolumeClaim");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("HostPath", HOSTPATH);
            map.put("EmptyDir", EMPTYDIR);
            map.put("ConfigMap", CONFIGMAP);
            map.put("Secret", SECRET);
            map.put("PersistentVolumeClaim", PERSISTENTVOLUMECLAIM);
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
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private ComponentStorageParameters parameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mounts")

    private List<ComponentMount> mounts = null;

    public ComponentStorage withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ComponentStorage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 存储盘的名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentStorage withParameters(ComponentStorageParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    public ComponentStorage withParameters(Consumer<ComponentStorageParameters> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ComponentStorageParameters();
            parametersSetter.accept(this.parameters);
        }

        return this;
    }

    /**
     * Get parameters
     * @return parameters
     */
    public ComponentStorageParameters getParameters() {
        return parameters;
    }

    public void setParameters(ComponentStorageParameters parameters) {
        this.parameters = parameters;
    }

    public ComponentStorage withMounts(List<ComponentMount> mounts) {
        this.mounts = mounts;
        return this;
    }

    public ComponentStorage addMountsItem(ComponentMount mountsItem) {
        if (this.mounts == null) {
            this.mounts = new ArrayList<>();
        }
        this.mounts.add(mountsItem);
        return this;
    }

    public ComponentStorage withMounts(Consumer<List<ComponentMount>> mountsSetter) {
        if (this.mounts == null) {
            this.mounts = new ArrayList<>();
        }
        mountsSetter.accept(this.mounts);
        return this;
    }

    /**
     * Get mounts
     * @return mounts
     */
    public List<ComponentMount> getMounts() {
        return mounts;
    }

    public void setMounts(List<ComponentMount> mounts) {
        this.mounts = mounts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentStorage componentStorage = (ComponentStorage) o;
        return Objects.equals(this.type, componentStorage.type) && Objects.equals(this.name, componentStorage.name)
            && Objects.equals(this.parameters, componentStorage.parameters)
            && Objects.equals(this.mounts, componentStorage.mounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, parameters, mounts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentStorage {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
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
