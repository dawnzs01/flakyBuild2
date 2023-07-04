package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LB状态树的监听器状态信息
 */
public class LoadBalancerStatusListener {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_status")

    private String provisioningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pools")

    private List<LoadBalancerStatusPool> pools = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policies")

    private List<LoadBalancerStatusPolicy> l7policies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_status")

    private String operatingStatus;

    public LoadBalancerStatusListener withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 监听器的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LoadBalancerStatusListener withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    /**
     * 监听器的配置状态。  取值： - ACTIVE：使用中。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public LoadBalancerStatusListener withPools(List<LoadBalancerStatusPool> pools) {
        this.pools = pools;
        return this;
    }

    public LoadBalancerStatusListener addPoolsItem(LoadBalancerStatusPool poolsItem) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        this.pools.add(poolsItem);
        return this;
    }

    public LoadBalancerStatusListener withPools(Consumer<List<LoadBalancerStatusPool>> poolsSetter) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        poolsSetter.accept(this.pools);
        return this;
    }

    /**
     * 监听器下的后端主机组操作状态。
     * @return pools
     */
    public List<LoadBalancerStatusPool> getPools() {
        return pools;
    }

    public void setPools(List<LoadBalancerStatusPool> pools) {
        this.pools = pools;
    }

    public LoadBalancerStatusListener withL7policies(List<LoadBalancerStatusPolicy> l7policies) {
        this.l7policies = l7policies;
        return this;
    }

    public LoadBalancerStatusListener addL7policiesItem(LoadBalancerStatusPolicy l7policiesItem) {
        if (this.l7policies == null) {
            this.l7policies = new ArrayList<>();
        }
        this.l7policies.add(l7policiesItem);
        return this;
    }

    public LoadBalancerStatusListener withL7policies(Consumer<List<LoadBalancerStatusPolicy>> l7policiesSetter) {
        if (this.l7policies == null) {
            this.l7policies = new ArrayList<>();
        }
        l7policiesSetter.accept(this.l7policies);
        return this;
    }

    /**
     * 监听器下的7层转发策略操作状态。
     * @return l7policies
     */
    public List<LoadBalancerStatusPolicy> getL7policies() {
        return l7policies;
    }

    public void setL7policies(List<LoadBalancerStatusPolicy> l7policies) {
        this.l7policies = l7policies;
    }

    public LoadBalancerStatusListener withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 监听器ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LoadBalancerStatusListener withOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    /**
     * 监听器的操作状态。  取值： - ONLINE：创建时默认状态，表示监听器正常运行。 - DEGRADED：该监听器下存在l7policy或l7rule的Provisioning_status=ERROR时返回这个状态。 或者状态树该监听器下存在member的operating_status=OFFLINE。 - DISABLED：负载均衡器或监听器的admin_state_up=false。  说明： DEGRADED和DISABLED状态仅在当前接口返回，查询监听器详情等其他接口返回字段operating_status不存在这两个状态值。
     * @return operatingStatus
     */
    public String getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoadBalancerStatusListener loadBalancerStatusListener = (LoadBalancerStatusListener) o;
        return Objects.equals(this.name, loadBalancerStatusListener.name)
            && Objects.equals(this.provisioningStatus, loadBalancerStatusListener.provisioningStatus)
            && Objects.equals(this.pools, loadBalancerStatusListener.pools)
            && Objects.equals(this.l7policies, loadBalancerStatusListener.l7policies)
            && Objects.equals(this.id, loadBalancerStatusListener.id)
            && Objects.equals(this.operatingStatus, loadBalancerStatusListener.operatingStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, provisioningStatus, pools, l7policies, id, operatingStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadBalancerStatusListener {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
        sb.append("    l7policies: ").append(toIndentedString(l7policies)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
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
