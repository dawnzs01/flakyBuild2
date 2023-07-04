package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReservedInstanceConfigs
 */
public class ReservedInstanceConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_urn")

    private String functionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qualifier_type")

    private String qualifierType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qualifier_name")

    private String qualifierName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_count")

    private Integer minCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_mode")

    private Boolean idleMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tactics_config")

    private TacticsConfig tacticsConfig;

    public ReservedInstanceConfigs withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    /**
     * 函数URN
     * @return functionUrn
     */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    public ReservedInstanceConfigs withQualifierType(String qualifierType) {
        this.qualifierType = qualifierType;
        return this;
    }

    /**
     * 限定类型, 支持version和alias
     * @return qualifierType
     */
    public String getQualifierType() {
        return qualifierType;
    }

    public void setQualifierType(String qualifierType) {
        this.qualifierType = qualifierType;
    }

    public ReservedInstanceConfigs withQualifierName(String qualifierName) {
        this.qualifierName = qualifierName;
        return this;
    }

    /**
     * 限定类型对应的取值
     * @return qualifierName
     */
    public String getQualifierName() {
        return qualifierName;
    }

    public void setQualifierName(String qualifierName) {
        this.qualifierName = qualifierName;
    }

    public ReservedInstanceConfigs withMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     * 预留实例个数
     * @return minCount
     */
    public Integer getMinCount() {
        return minCount;
    }

    public void setMinCount(Integer minCount) {
        this.minCount = minCount;
    }

    public ReservedInstanceConfigs withIdleMode(Boolean idleMode) {
        this.idleMode = idleMode;
        return this;
    }

    /**
     * 是否开启闲置模式配置
     * @return idleMode
     */
    public Boolean getIdleMode() {
        return idleMode;
    }

    public void setIdleMode(Boolean idleMode) {
        this.idleMode = idleMode;
    }

    public ReservedInstanceConfigs withTacticsConfig(TacticsConfig tacticsConfig) {
        this.tacticsConfig = tacticsConfig;
        return this;
    }

    public ReservedInstanceConfigs withTacticsConfig(Consumer<TacticsConfig> tacticsConfigSetter) {
        if (this.tacticsConfig == null) {
            this.tacticsConfig = new TacticsConfig();
            tacticsConfigSetter.accept(this.tacticsConfig);
        }

        return this;
    }

    /**
     * Get tacticsConfig
     * @return tacticsConfig
     */
    public TacticsConfig getTacticsConfig() {
        return tacticsConfig;
    }

    public void setTacticsConfig(TacticsConfig tacticsConfig) {
        this.tacticsConfig = tacticsConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReservedInstanceConfigs reservedInstanceConfigs = (ReservedInstanceConfigs) o;
        return Objects.equals(this.functionUrn, reservedInstanceConfigs.functionUrn)
            && Objects.equals(this.qualifierType, reservedInstanceConfigs.qualifierType)
            && Objects.equals(this.qualifierName, reservedInstanceConfigs.qualifierName)
            && Objects.equals(this.minCount, reservedInstanceConfigs.minCount)
            && Objects.equals(this.idleMode, reservedInstanceConfigs.idleMode)
            && Objects.equals(this.tacticsConfig, reservedInstanceConfigs.tacticsConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, qualifierType, qualifierName, minCount, idleMode, tacticsConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReservedInstanceConfigs {\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
        sb.append("    qualifierType: ").append(toIndentedString(qualifierType)).append("\n");
        sb.append("    qualifierName: ").append(toIndentedString(qualifierName)).append("\n");
        sb.append("    minCount: ").append(toIndentedString(minCount)).append("\n");
        sb.append("    idleMode: ").append(toIndentedString(idleMode)).append("\n");
        sb.append("    tacticsConfig: ").append(toIndentedString(tacticsConfig)).append("\n");
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
