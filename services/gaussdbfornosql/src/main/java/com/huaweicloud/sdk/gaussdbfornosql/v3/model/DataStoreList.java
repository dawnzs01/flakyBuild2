package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DataStoreList
 */
public class DataStoreList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_name")

    private String datastoreName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public DataStoreList withDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
        return this;
    }

    /**
     * 数据库引擎。
     * @return datastoreName
     */
    public String getDatastoreName() {
        return datastoreName;
    }

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    public DataStoreList withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 数据库引擎版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataStoreList dataStoreList = (DataStoreList) o;
        return Objects.equals(this.datastoreName, dataStoreList.datastoreName)
            && Objects.equals(this.version, dataStoreList.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreName, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataStoreList {\n");
        sb.append("    datastoreName: ").append(toIndentedString(datastoreName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
