package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 进程统计信息
 */
public class ProcessStatisticResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    public ProcessStatisticResponseInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 进程名称
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ProcessStatisticResponseInfo withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * 进程数量
     * minimum: 0
     * maximum: 100000
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
        ProcessStatisticResponseInfo processStatisticResponseInfo = (ProcessStatisticResponseInfo) o;
        return Objects.equals(this.path, processStatisticResponseInfo.path)
            && Objects.equals(this.num, processStatisticResponseInfo.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, num);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessStatisticResponseInfo {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
