package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务实例信息体。
 */
public class JobNodeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private JobNodeSpecInfo spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private JobNodeVpcInfo vpc;

    public JobNodeInfo withSpec(JobNodeSpecInfo spec) {
        this.spec = spec;
        return this;
    }

    public JobNodeInfo withSpec(Consumer<JobNodeSpecInfo> specSetter) {
        if (this.spec == null) {
            this.spec = new JobNodeSpecInfo();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public JobNodeSpecInfo getSpec() {
        return spec;
    }

    public void setSpec(JobNodeSpecInfo spec) {
        this.spec = spec;
    }

    public JobNodeInfo withVpc(JobNodeVpcInfo vpc) {
        this.vpc = vpc;
        return this;
    }

    public JobNodeInfo withVpc(Consumer<JobNodeVpcInfo> vpcSetter) {
        if (this.vpc == null) {
            this.vpc = new JobNodeVpcInfo();
            vpcSetter.accept(this.vpc);
        }

        return this;
    }

    /**
     * Get vpc
     * @return vpc
     */
    public JobNodeVpcInfo getVpc() {
        return vpc;
    }

    public void setVpc(JobNodeVpcInfo vpc) {
        this.vpc = vpc;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobNodeInfo jobNodeInfo = (JobNodeInfo) o;
        return Objects.equals(this.spec, jobNodeInfo.spec) && Objects.equals(this.vpc, jobNodeInfo.vpc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spec, vpc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobNodeInfo {\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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
