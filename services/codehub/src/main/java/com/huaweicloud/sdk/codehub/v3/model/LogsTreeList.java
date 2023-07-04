package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LogsTreeList
 */
public class LogsTreeList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trees")

    private List<LogsTree> trees = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public LogsTreeList withTrees(List<LogsTree> trees) {
        this.trees = trees;
        return this;
    }

    public LogsTreeList addTreesItem(LogsTree treesItem) {
        if (this.trees == null) {
            this.trees = new ArrayList<>();
        }
        this.trees.add(treesItem);
        return this;
    }

    public LogsTreeList withTrees(Consumer<List<LogsTree>> treesSetter) {
        if (this.trees == null) {
            this.trees = new ArrayList<>();
        }
        treesSetter.accept(this.trees);
        return this;
    }

    /**
     * 文件日志树
     * @return trees
     */
    public List<LogsTree> getTrees() {
        return trees;
    }

    public void setTrees(List<LogsTree> trees) {
        this.trees = trees;
    }

    public LogsTreeList withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 记录总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogsTreeList logsTreeList = (LogsTreeList) o;
        return Objects.equals(this.trees, logsTreeList.trees) && Objects.equals(this.total, logsTreeList.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trees, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogsTreeList {\n");
        sb.append("    trees: ").append(toIndentedString(trees)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
