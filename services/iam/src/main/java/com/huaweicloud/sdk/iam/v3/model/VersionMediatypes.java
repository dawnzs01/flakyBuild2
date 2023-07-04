package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class VersionMediatypes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base")

    private String base;

    public VersionMediatypes withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 媒体类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VersionMediatypes withBase(String base) {
        this.base = base;
        return this;
    }

    /**
     * 基础类型。
     * @return base
     */
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionMediatypes versionMediatypes = (VersionMediatypes) o;
        return Objects.equals(this.type, versionMediatypes.type) && Objects.equals(this.base, versionMediatypes.base);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, base);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionMediatypes {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    base: ").append(toIndentedString(base)).append("\n");
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
