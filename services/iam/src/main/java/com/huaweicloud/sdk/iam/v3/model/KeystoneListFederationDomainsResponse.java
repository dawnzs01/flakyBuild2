package com.huaweicloud.sdk.iam.v3.model;

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
public class KeystoneListFederationDomainsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")

    private List<Domains> domains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private LinksSelf links;

    public KeystoneListFederationDomainsResponse withDomains(List<Domains> domains) {
        this.domains = domains;
        return this;
    }

    public KeystoneListFederationDomainsResponse addDomainsItem(Domains domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public KeystoneListFederationDomainsResponse withDomains(Consumer<List<Domains>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * 账号信息列表。
     * @return domains
     */
    public List<Domains> getDomains() {
        return domains;
    }

    public void setDomains(List<Domains> domains) {
        this.domains = domains;
    }

    public KeystoneListFederationDomainsResponse withLinks(LinksSelf links) {
        this.links = links;
        return this;
    }

    public KeystoneListFederationDomainsResponse withLinks(Consumer<LinksSelf> linksSetter) {
        if (this.links == null) {
            this.links = new LinksSelf();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /**
     * Get links
     * @return links
     */
    public LinksSelf getLinks() {
        return links;
    }

    public void setLinks(LinksSelf links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneListFederationDomainsResponse keystoneListFederationDomainsResponse =
            (KeystoneListFederationDomainsResponse) o;
        return Objects.equals(this.domains, keystoneListFederationDomainsResponse.domains)
            && Objects.equals(this.links, keystoneListFederationDomainsResponse.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domains, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListFederationDomainsResponse {\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
