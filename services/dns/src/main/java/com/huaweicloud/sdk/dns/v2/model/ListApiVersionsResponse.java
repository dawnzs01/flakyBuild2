package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListApiVersionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private ValuesItem versions;

    public ListApiVersionsResponse withVersions(ValuesItem versions) {
        this.versions = versions;
        return this;
    }

    public ListApiVersionsResponse withVersions(Consumer<ValuesItem> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ValuesItem();
            versionsSetter.accept(this.versions);
        }

        return this;
    }

    /**
     * Get versions
     * @return versions
     */
    public ValuesItem getVersions() {
        return versions;
    }

    public void setVersions(ValuesItem versions) {
        this.versions = versions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApiVersionsResponse listApiVersionsResponse = (ListApiVersionsResponse) o;
        return Objects.equals(this.versions, listApiVersionsResponse.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApiVersionsResponse {\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
