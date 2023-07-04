package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Attribute {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_uses")

    private List<String> otherUses = null;

    public Attribute withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attribute withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 数据类型。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Attribute withOtherUses(List<String> otherUses) {
        this.otherUses = otherUses;
        return this;
    }

    public Attribute addOtherUsesItem(String otherUsesItem) {
        if (this.otherUses == null) {
            this.otherUses = new ArrayList<>();
        }
        this.otherUses.add(otherUsesItem);
        return this;
    }

    public Attribute withOtherUses(Consumer<List<String>> otherUsesSetter) {
        if (this.otherUses == null) {
            this.otherUses = new ArrayList<>();
        }
        otherUsesSetter.accept(this.otherUses);
        return this;
    }

    /**
     * 其他用途。
     * @return otherUses
     */
    public List<String> getOtherUses() {
        return otherUses;
    }

    public void setOtherUses(List<String> otherUses) {
        this.otherUses = otherUses;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Attribute attribute = (Attribute) o;
        return Objects.equals(this.name, attribute.name) && Objects.equals(this.dataType, attribute.dataType)
            && Objects.equals(this.otherUses, attribute.otherUses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dataType, otherUses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Attribute {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    otherUses: ").append(toIndentedString(otherUses)).append("\n");
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
