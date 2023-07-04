package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowRoutetableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetable")

    private Routetable routetable;

    public ShowRoutetableResponse withRoutetable(Routetable routetable) {
        this.routetable = routetable;
        return this;
    }

    public ShowRoutetableResponse withRoutetable(Consumer<Routetable> routetableSetter) {
        if (this.routetable == null) {
            this.routetable = new Routetable();
            routetableSetter.accept(this.routetable);
        }

        return this;
    }

    /**
     * Get routetable
     * @return routetable
     */
    public Routetable getRoutetable() {
        return routetable;
    }

    public void setRoutetable(Routetable routetable) {
        this.routetable = routetable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRoutetableResponse showRoutetableResponse = (ShowRoutetableResponse) o;
        return Objects.equals(this.routetable, showRoutetableResponse.routetable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routetable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRoutetableResponse {\n");
        sb.append("    routetable: ").append(toIndentedString(routetable)).append("\n");
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
