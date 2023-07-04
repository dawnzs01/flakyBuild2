package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建任务请求体
 */
public class CreateTaskDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_ids")

    private List<String> dataIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shape_id")

    private String shapeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "production_level")

    private String productionLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_description")

    private String taskDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_alias")

    private Map<String, String> dataAlias = null;

    public CreateTaskDto withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称，支持中英文、数字和“_”，长度为[1,50]。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CreateTaskDto withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型，当前仅支持ORSIP（卫星影像处理）。
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public CreateTaskDto withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 任务所属工作共享空间ID。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public CreateTaskDto withDataIds(List<String> dataIds) {
        this.dataIds = dataIds;
        return this;
    }

    public CreateTaskDto addDataIdsItem(String dataIdsItem) {
        if (this.dataIds == null) {
            this.dataIds = new ArrayList<>();
        }
        this.dataIds.add(dataIdsItem);
        return this;
    }

    public CreateTaskDto withDataIds(Consumer<List<String>> dataIdsSetter) {
        if (this.dataIds == null) {
            this.dataIds = new ArrayList<>();
        }
        dataIdsSetter.accept(this.dataIds);
        return this;
    }

    /**
     * 待处理影像文件ID列表。
     * @return dataIds
     */
    public List<String> getDataIds() {
        return dataIds;
    }

    public void setDataIds(List<String> dataIds) {
        this.dataIds = dataIds;
    }

    public CreateTaskDto withShapeId(String shapeId) {
        this.shapeId = shapeId;
        return this;
    }

    /**
     * shape文件ID，当处理任务类型为clip或both时必填。
     * @return shapeId
     */
    public String getShapeId() {
        return shapeId;
    }

    public void setShapeId(String shapeId) {
        this.shapeId = shapeId;
    }

    public CreateTaskDto withProductionLevel(String productionLevel) {
        this.productionLevel = productionLevel;
        return this;
    }

    /**
     * 任务输出结果影像级别，当前支持以下级别： L2、L4、L5、clip（包含L5影像、矢量切割）、tile（包含L5影像、金字塔切割）、both（包含L5影像、金字塔切割和矢量切割影像）。
     * @return productionLevel
     */
    public String getProductionLevel() {
        return productionLevel;
    }

    public void setProductionLevel(String productionLevel) {
        this.productionLevel = productionLevel;
    }

    public CreateTaskDto withTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }

    /**
     * 任务描述，支持中英文、数字和“_”，长度为[0,255]。
     * @return taskDescription
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public CreateTaskDto withDataAlias(Map<String, String> dataAlias) {
        this.dataAlias = dataAlias;
        return this;
    }

    public CreateTaskDto putDataAliasItem(String key, String dataAliasItem) {
        if (this.dataAlias == null) {
            this.dataAlias = new HashMap<>();
        }
        this.dataAlias.put(key, dataAliasItem);
        return this;
    }

    public CreateTaskDto withDataAlias(Consumer<Map<String, String>> dataAliasSetter) {
        if (this.dataAlias == null) {
            this.dataAlias = new HashMap<>();
        }
        dataAliasSetter.accept(this.dataAlias);
        return this;
    }

    /**
     * 成果影像别名。 key从“校验原始影像文件”接口获取。 - key：成果影像名称 - value：成果影像别名
     * @return dataAlias
     */
    public Map<String, String> getDataAlias() {
        return dataAlias;
    }

    public void setDataAlias(Map<String, String> dataAlias) {
        this.dataAlias = dataAlias;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTaskDto createTaskDto = (CreateTaskDto) o;
        return Objects.equals(this.taskName, createTaskDto.taskName)
            && Objects.equals(this.taskType, createTaskDto.taskType)
            && Objects.equals(this.workspaceId, createTaskDto.workspaceId)
            && Objects.equals(this.dataIds, createTaskDto.dataIds)
            && Objects.equals(this.shapeId, createTaskDto.shapeId)
            && Objects.equals(this.productionLevel, createTaskDto.productionLevel)
            && Objects.equals(this.taskDescription, createTaskDto.taskDescription)
            && Objects.equals(this.dataAlias, createTaskDto.dataAlias);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(taskName, taskType, workspaceId, dataIds, shapeId, productionLevel, taskDescription, dataAlias);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTaskDto {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    dataIds: ").append(toIndentedString(dataIds)).append("\n");
        sb.append("    shapeId: ").append(toIndentedString(shapeId)).append("\n");
        sb.append("    productionLevel: ").append(toIndentedString(productionLevel)).append("\n");
        sb.append("    taskDescription: ").append(toIndentedString(taskDescription)).append("\n");
        sb.append("    dataAlias: ").append(toIndentedString(dataAlias)).append("\n");
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
