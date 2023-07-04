package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 动态属性的期望信息
 */
public class Excepted {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private ExceptedMetadata metadata;

    public Excepted withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 动态属性的初始值，最大长度512，value允许英文字母、数字、下划线、中划线、点、逗号、冒号、/、@、+、?、^、=、%、&、~、#、!、*
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Excepted withMetadata(ExceptedMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Excepted withMetadata(Consumer<ExceptedMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ExceptedMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public ExceptedMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ExceptedMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Excepted excepted = (Excepted) o;
        return Objects.equals(this.value, excepted.value) && Objects.equals(this.metadata, excepted.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Excepted {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
