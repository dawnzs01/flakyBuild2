package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 可被参数模板应用的实例信息
 */
public class ApplicableInstancesInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entities")

    private List<EntityInfo> entities = null;

    public ApplicableInstancesInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ApplicableInstancesInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ApplicableInstancesInfo withEntities(List<EntityInfo> entities) {
        this.entities = entities;
        return this;
    }

    public ApplicableInstancesInfo addEntitiesItem(EntityInfo entitiesItem) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    public ApplicableInstancesInfo withEntities(Consumer<List<EntityInfo>> entitiesSetter) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        entitiesSetter.accept(this.entities);
        return this;
    }

    /**
     * 节点组信息或节点信息的列表对象。  当参数模板是集群类型时，如果是shard组或者config组的参数模板，则可应用到的是对应类型的节点组，如果是mongos组的参数模板，则可应用到的是对应类型的的节点。  当参数模板是副本集或单节点类型时，直接应用到对应实例。  例如：一个mongos参数模板可应用到一个或多个mongos节点。
     * @return entities
     */
    public List<EntityInfo> getEntities() {
        return entities;
    }

    public void setEntities(List<EntityInfo> entities) {
        this.entities = entities;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicableInstancesInfo applicableInstancesInfo = (ApplicableInstancesInfo) o;
        return Objects.equals(this.instanceId, applicableInstancesInfo.instanceId)
            && Objects.equals(this.instanceName, applicableInstancesInfo.instanceName)
            && Objects.equals(this.entities, applicableInstancesInfo.entities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceName, entities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicableInstancesInfo {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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
