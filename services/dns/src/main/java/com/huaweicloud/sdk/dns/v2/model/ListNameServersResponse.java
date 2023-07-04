package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListNameServersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nameservers")

    private List<NameServersResp> nameservers = null;

    public ListNameServersResponse withNameservers(List<NameServersResp> nameservers) {
        this.nameservers = nameservers;
        return this;
    }

    public ListNameServersResponse addNameserversItem(NameServersResp nameserversItem) {
        if (this.nameservers == null) {
            this.nameservers = new ArrayList<>();
        }
        this.nameservers.add(nameserversItem);
        return this;
    }

    public ListNameServersResponse withNameservers(Consumer<List<NameServersResp>> nameserversSetter) {
        if (this.nameservers == null) {
            this.nameservers = new ArrayList<>();
        }
        nameserversSetter.accept(this.nameservers);
        return this;
    }

    /**
     * name server列表对象。
     * @return nameservers
     */
    public List<NameServersResp> getNameservers() {
        return nameservers;
    }

    public void setNameservers(List<NameServersResp> nameservers) {
        this.nameservers = nameservers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNameServersResponse listNameServersResponse = (ListNameServersResponse) o;
        return Objects.equals(this.nameservers, listNameServersResponse.nameservers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameservers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNameServersResponse {\n");
        sb.append("    nameservers: ").append(toIndentedString(nameservers)).append("\n");
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
