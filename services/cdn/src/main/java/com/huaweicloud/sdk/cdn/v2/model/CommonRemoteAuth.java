package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 远程鉴权配置。
 */
public class CommonRemoteAuth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_authentication")

    private String remoteAuthentication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_auth_rules")

    private RemoteAuthRuleVo remoteAuthRules;

    public CommonRemoteAuth withRemoteAuthentication(String remoteAuthentication) {
        this.remoteAuthentication = remoteAuthentication;
        return this;
    }

    /**
     * 是否开启远程鉴权(on：开启，off：关闭)。
     * @return remoteAuthentication
     */
    public String getRemoteAuthentication() {
        return remoteAuthentication;
    }

    public void setRemoteAuthentication(String remoteAuthentication) {
        this.remoteAuthentication = remoteAuthentication;
    }

    public CommonRemoteAuth withRemoteAuthRules(RemoteAuthRuleVo remoteAuthRules) {
        this.remoteAuthRules = remoteAuthRules;
        return this;
    }

    public CommonRemoteAuth withRemoteAuthRules(Consumer<RemoteAuthRuleVo> remoteAuthRulesSetter) {
        if (this.remoteAuthRules == null) {
            this.remoteAuthRules = new RemoteAuthRuleVo();
            remoteAuthRulesSetter.accept(this.remoteAuthRules);
        }

        return this;
    }

    /**
     * Get remoteAuthRules
     * @return remoteAuthRules
     */
    public RemoteAuthRuleVo getRemoteAuthRules() {
        return remoteAuthRules;
    }

    public void setRemoteAuthRules(RemoteAuthRuleVo remoteAuthRules) {
        this.remoteAuthRules = remoteAuthRules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommonRemoteAuth commonRemoteAuth = (CommonRemoteAuth) o;
        return Objects.equals(this.remoteAuthentication, commonRemoteAuth.remoteAuthentication)
            && Objects.equals(this.remoteAuthRules, commonRemoteAuth.remoteAuthRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remoteAuthentication, remoteAuthRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonRemoteAuth {\n");
        sb.append("    remoteAuthentication: ").append(toIndentedString(remoteAuthentication)).append("\n");
        sb.append("    remoteAuthRules: ").append(toIndentedString(remoteAuthRules)).append("\n");
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
