package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * IP池对象。 支持IPv4和IPv6
 */
public class IpPool {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    private String siteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private String ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private Operator operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    public IpPool withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 线路的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IpPool withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 线路所属站点ID。
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public IpPool withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 线路标识。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public IpPool withIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * IPv4[或IPv6](tag:hide)线路。  取值范围： - 4：IPv4线路 [- 6：IPv6线路](tag:hide)
     * @return ipVersion
     */
    public String getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    public IpPool withOperator(Operator operator) {
        this.operator = operator;
        return this;
    }

    public IpPool withOperator(Consumer<Operator> operatorSetter) {
        if (this.operator == null) {
            this.operator = new Operator();
            operatorSetter.accept(this.operator);
        }

        return this;
    }

    /**
     * Get operator
     * @return operator
     */
    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public IpPool withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 线路的显示名称。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IpPool ipPool = (IpPool) o;
        return Objects.equals(this.id, ipPool.id) && Objects.equals(this.siteId, ipPool.siteId)
            && Objects.equals(this.poolId, ipPool.poolId) && Objects.equals(this.ipVersion, ipPool.ipVersion)
            && Objects.equals(this.operator, ipPool.operator) && Objects.equals(this.displayName, ipPool.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, siteId, poolId, ipVersion, operator, displayName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpPool {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
