package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群扩容请求详细描述。
 */
public class RoleExtendGrowReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodesize")

    private Integer nodesize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disksize")

    private Integer disksize;

    public RoleExtendGrowReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 扩容实例类型。取值为ess、ess-master或ess-client，可以选择其中一个或多个之间的组合但不可以重复选择。  ess-master、ess-client节点只支持增加实例个数。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RoleExtendGrowReq withNodesize(Integer nodesize) {
        this.nodesize = nodesize;
        return this;
    }

    /**
     * 扩容实例个数。集群已有实例个数和增加实例个数总和不能超过32。若无需扩容该参数将该参数设置为0即可。
     * @return nodesize
     */
    public Integer getNodesize() {
        return nodesize;
    }

    public void setNodesize(Integer nodesize) {
        this.nodesize = nodesize;
    }

    public RoleExtendGrowReq withDisksize(Integer disksize) {
        this.disksize = disksize;
        return this;
    }

    /**
     * 扩容实例存储容量。集群原实例存储容量和扩容实例存储容量之和不能超过创建集群时对应默认实例存储容量上限。若无需扩容该参数将该参数设置为0即可。[当集群为包周期集群时不支持同时修改节点个数和磁盘容量。](tag: hc,tag: hws)  单位：GB。  - ess节点、ess-cold节点扩容步长为20。  - ess-master节点、ess-client节点不允许扩容存储。
     * @return disksize
     */
    public Integer getDisksize() {
        return disksize;
    }

    public void setDisksize(Integer disksize) {
        this.disksize = disksize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RoleExtendGrowReq roleExtendGrowReq = (RoleExtendGrowReq) o;
        return Objects.equals(this.type, roleExtendGrowReq.type)
            && Objects.equals(this.nodesize, roleExtendGrowReq.nodesize)
            && Objects.equals(this.disksize, roleExtendGrowReq.disksize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, nodesize, disksize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleExtendGrowReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    nodesize: ").append(toIndentedString(nodesize)).append("\n");
        sb.append("    disksize: ").append(toIndentedString(disksize)).append("\n");
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
