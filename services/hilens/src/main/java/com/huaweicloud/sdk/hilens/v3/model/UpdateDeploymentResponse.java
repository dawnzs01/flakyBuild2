package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateDeploymentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private DeploymentTemplate template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ready_replicas")

    private Integer readyReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicas")

    private Integer replicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_version")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ids")

    private List<String> nodeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<NodeResult> result = null;

    public UpdateDeploymentResponse withTemplate(DeploymentTemplate template) {
        this.template = template;
        return this;
    }

    public UpdateDeploymentResponse withTemplate(Consumer<DeploymentTemplate> templateSetter) {
        if (this.template == null) {
            this.template = new DeploymentTemplate();
            templateSetter.accept(this.template);
        }

        return this;
    }

    /**
     * Get template
     * @return template
     */
    public DeploymentTemplate getTemplate() {
        return template;
    }

    public void setTemplate(DeploymentTemplate template) {
        this.template = template;
    }

    public UpdateDeploymentResponse withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 部署成功失败的理由
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public UpdateDeploymentResponse withReadyReplicas(Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
        return this;
    }

    /**
     * 已经就绪的实例节点数
     * @return readyReplicas
     */
    public Integer getReadyReplicas() {
        return readyReplicas;
    }

    public void setReadyReplicas(Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
    }

    public UpdateDeploymentResponse withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    /**
     * 实例节点节点数
     * @return replicas
     */
    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    public UpdateDeploymentResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用部署描述，最大长度255，不允许^ ~ # $ % & * < > ( ) [ ] { } ' \" \\
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateDeploymentResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UpdateDeploymentResponse withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 应用部署来源: HiLens市场(hlm) or aigallery(aig) or 自定义(userdefined)
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public UpdateDeploymentResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * 应用部署版本
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public UpdateDeploymentResponse withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public UpdateDeploymentResponse addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public UpdateDeploymentResponse withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * 应用部署的指定节点，与clouster_id二选一
     * @return nodeIds
     */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    public UpdateDeploymentResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 应用部署的集群ID，与node_id二选一
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateDeploymentResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UpdateDeploymentResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateDeploymentResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 部署名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateDeploymentResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 部署ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateDeploymentResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * RUNNING：运行， FREEZE：冻结， UNFREEZE: 解冻， CREATING：创建中， CREATE_FAILED：创建失败， STARTING：启动中， START_FAILED：启动失败， STOPPING：停止中 STOP_FAILED：停止失败 DELETING：删除中 DELETE_FIALED：删除失败 HIBERNATED：休眠
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public UpdateDeploymentResponse withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 部署的节点数，最小为1，集群部署也为1
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public UpdateDeploymentResponse withResult(List<NodeResult> result) {
        this.result = result;
        return this;
    }

    public UpdateDeploymentResponse addResultItem(NodeResult resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public UpdateDeploymentResponse withResult(Consumer<List<NodeResult>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 每个节点的部署结果
     * @return result
     */
    public List<NodeResult> getResult() {
        return result;
    }

    public void setResult(List<NodeResult> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDeploymentResponse updateDeploymentResponse = (UpdateDeploymentResponse) o;
        return Objects.equals(this.template, updateDeploymentResponse.template)
            && Objects.equals(this.reason, updateDeploymentResponse.reason)
            && Objects.equals(this.readyReplicas, updateDeploymentResponse.readyReplicas)
            && Objects.equals(this.replicas, updateDeploymentResponse.replicas)
            && Objects.equals(this.description, updateDeploymentResponse.description)
            && Objects.equals(this.createdAt, updateDeploymentResponse.createdAt)
            && Objects.equals(this.source, updateDeploymentResponse.source)
            && Objects.equals(this.apiVersion, updateDeploymentResponse.apiVersion)
            && Objects.equals(this.nodeIds, updateDeploymentResponse.nodeIds)
            && Objects.equals(this.clusterId, updateDeploymentResponse.clusterId)
            && Objects.equals(this.updatedAt, updateDeploymentResponse.updatedAt)
            && Objects.equals(this.projectId, updateDeploymentResponse.projectId)
            && Objects.equals(this.name, updateDeploymentResponse.name)
            && Objects.equals(this.id, updateDeploymentResponse.id)
            && Objects.equals(this.state, updateDeploymentResponse.state)
            && Objects.equals(this.nodeNum, updateDeploymentResponse.nodeNum)
            && Objects.equals(this.result, updateDeploymentResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(template,
            reason,
            readyReplicas,
            replicas,
            description,
            createdAt,
            source,
            apiVersion,
            nodeIds,
            clusterId,
            updatedAt,
            projectId,
            name,
            id,
            state,
            nodeNum,
            result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDeploymentResponse {\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
        sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
