package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自启动项统计信息
 */
public class AutoLaunchStatisticsResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    public AutoLaunchStatisticsResponseInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 自启动项名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AutoLaunchStatisticsResponseInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 自启动项类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AutoLaunchStatisticsResponseInfo withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * 数量
     * minimum: 0
     * maximum: 10000
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutoLaunchStatisticsResponseInfo autoLaunchStatisticsResponseInfo = (AutoLaunchStatisticsResponseInfo) o;
        return Objects.equals(this.name, autoLaunchStatisticsResponseInfo.name)
            && Objects.equals(this.type, autoLaunchStatisticsResponseInfo.type)
            && Objects.equals(this.num, autoLaunchStatisticsResponseInfo.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, num);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoLaunchStatisticsResponseInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
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
