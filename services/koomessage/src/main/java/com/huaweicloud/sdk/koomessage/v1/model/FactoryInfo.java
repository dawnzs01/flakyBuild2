package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 各终端厂商的审核状态。
 */
public class FactoryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "factory_type")

    private String factoryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private Integer state;

    public FactoryInfo withFactoryType(String factoryType) {
        this.factoryType = factoryType;
        return this;
    }

    /**
     * 厂商类型。  - HUAWEI：表示华为厂商 - XIAOMI：表示小米厂商 - OPPO：表示OPPO厂商 - VIVO：表示VIVO厂商 - MEIZU：表示魅族厂商 
     * @return factoryType
     */
    public String getFactoryType() {
        return factoryType;
    }

    public void setFactoryType(String factoryType) {
        this.factoryType = factoryType;
    }

    public FactoryInfo withState(Integer state) {
        this.state = state;
        return this;
    }

    /**
     * 模板状态。  - 1：激活  - 其他：未激活 
     * @return state
     */
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactoryInfo factoryInfo = (FactoryInfo) o;
        return Objects.equals(this.factoryType, factoryInfo.factoryType)
            && Objects.equals(this.state, factoryInfo.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(factoryType, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactoryInfo {\n");
        sb.append("    factoryType: ").append(toIndentedString(factoryType)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
