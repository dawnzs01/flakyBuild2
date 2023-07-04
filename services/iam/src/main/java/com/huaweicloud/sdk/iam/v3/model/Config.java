package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Config {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_compliance")

    private SecurityCompliance securityCompliance;

    public Config withSecurityCompliance(SecurityCompliance securityCompliance) {
        this.securityCompliance = securityCompliance;
        return this;
    }

    public Config withSecurityCompliance(Consumer<SecurityCompliance> securityComplianceSetter) {
        if (this.securityCompliance == null) {
            this.securityCompliance = new SecurityCompliance();
            securityComplianceSetter.accept(this.securityCompliance);
        }

        return this;
    }

    /**
     * Get securityCompliance
     * @return securityCompliance
     */
    public SecurityCompliance getSecurityCompliance() {
        return securityCompliance;
    }

    public void setSecurityCompliance(SecurityCompliance securityCompliance) {
        this.securityCompliance = securityCompliance;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Config config = (Config) o;
        return Objects.equals(this.securityCompliance, config.securityCompliance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityCompliance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Config {\n");
        sb.append("    securityCompliance: ").append(toIndentedString(securityCompliance)).append("\n");
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
