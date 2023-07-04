package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DomainMapping
 */
public class DomainMapping {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pull_domain")

    private String pullDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_domain")

    private String pushDomain;

    public DomainMapping withPullDomain(String pullDomain) {
        this.pullDomain = pullDomain;
        return this;
    }

    /**
     * 直播播放域名
     * @return pullDomain
     */
    public String getPullDomain() {
        return pullDomain;
    }

    public void setPullDomain(String pullDomain) {
        this.pullDomain = pullDomain;
    }

    public DomainMapping withPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
        return this;
    }

    /**
     * 直播播放域名关联的推流域名
     * @return pushDomain
     */
    public String getPushDomain() {
        return pushDomain;
    }

    public void setPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainMapping domainMapping = (DomainMapping) o;
        return Objects.equals(this.pullDomain, domainMapping.pullDomain)
            && Objects.equals(this.pushDomain, domainMapping.pushDomain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pullDomain, pushDomain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainMapping {\n");
        sb.append("    pullDomain: ").append(toIndentedString(pullDomain)).append("\n");
        sb.append("    pushDomain: ").append(toIndentedString(pushDomain)).append("\n");
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
