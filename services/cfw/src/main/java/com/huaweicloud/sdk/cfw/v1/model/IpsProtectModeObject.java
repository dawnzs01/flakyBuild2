package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IpsProtectModeObject
 */
public class IpsProtectModeObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private Integer mode;

    public IpsProtectModeObject withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ips防护模式id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IpsProtectModeObject withMode(Integer mode) {
        this.mode = mode;
        return this;
    }

    /**
     * ips防护模式，0：观察模式，1：严格模式，2：中等模式，3：宽松模式
     * @return mode
     */
    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IpsProtectModeObject ipsProtectModeObject = (IpsProtectModeObject) o;
        return Objects.equals(this.id, ipsProtectModeObject.id) && Objects.equals(this.mode, ipsProtectModeObject.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpsProtectModeObject {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
