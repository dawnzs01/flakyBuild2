package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskVo
 */
public class TaskVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_id")

    private String dataId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_description")

    private String taskDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_start_time")

    private String execStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_stop_time")

    private String execStopTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_data_alias")

    private String originDataAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "production_level")

    private String productionLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_progress")

    private String taskProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shape_id")

    private String shapeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_deleted")

    private Integer isDeleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    public TaskVo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务唯一标识ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TaskVo withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 所属工作共享空间ID。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public TaskVo withDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }

    /**
     * 数据ID。
     * @return dataId
     */
    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public TaskVo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TaskVo withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建者ID。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public TaskVo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public TaskVo withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态。包括INIT（初始化）、RUNNING（运行中）、SUCCESS（执行成功）、ARCHIVED（已归档）、FAILED（执行失败）、STOPPING（停止中）、STOP_SUCCESS（已停止）、STOP_FAILED（停止失败）。
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public TaskVo withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型。 当前仅支持ORSIP（卫星影像处理）。
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public TaskVo withTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }

    /**
     * 任务描述。
     * @return taskDescription
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public TaskVo withExecStartTime(String execStartTime) {
        this.execStartTime = execStartTime;
        return this;
    }

    /**
     * 开始操作时间。 缺省值：null
     * @return execStartTime
     */
    public String getExecStartTime() {
        return execStartTime;
    }

    public void setExecStartTime(String execStartTime) {
        this.execStartTime = execStartTime;
    }

    public TaskVo withExecStopTime(String execStopTime) {
        this.execStopTime = execStopTime;
        return this;
    }

    /**
     * 停止操作时间。 缺省值：null
     * @return execStopTime
     */
    public String getExecStopTime() {
        return execStopTime;
    }

    public void setExecStopTime(String execStopTime) {
        this.execStopTime = execStopTime;
    }

    public TaskVo withOriginDataAlias(String originDataAlias) {
        this.originDataAlias = originDataAlias;
        return this;
    }

    /**
     * 原始数据别名。
     * @return originDataAlias
     */
    public String getOriginDataAlias() {
        return originDataAlias;
    }

    public void setOriginDataAlias(String originDataAlias) {
        this.originDataAlias = originDataAlias;
    }

    public TaskVo withProductionLevel(String productionLevel) {
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

    public TaskVo withTaskProgress(String taskProgress) {
        this.taskProgress = taskProgress;
        return this;
    }

    /**
     * 任务执行进度。
     * @return taskProgress
     */
    public String getTaskProgress() {
        return taskProgress;
    }

    public void setTaskProgress(String taskProgress) {
        this.taskProgress = taskProgress;
    }

    public TaskVo withShapeId(String shapeId) {
        this.shapeId = shapeId;
        return this;
    }

    /**
     * 影像ID。
     * @return shapeId
     */
    public String getShapeId() {
        return shapeId;
    }

    public void setShapeId(String shapeId) {
        this.shapeId = shapeId;
    }

    public TaskVo withIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * 是否删除。 - 0：未删除 - 1：已删除
     * @return isDeleted
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public TaskVo withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * 影像链接。
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public TaskVo withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskVo taskVo = (TaskVo) o;
        return Objects.equals(this.taskId, taskVo.taskId) && Objects.equals(this.workspaceId, taskVo.workspaceId)
            && Objects.equals(this.dataId, taskVo.dataId) && Objects.equals(this.taskName, taskVo.taskName)
            && Objects.equals(this.creator, taskVo.creator) && Objects.equals(this.createTime, taskVo.createTime)
            && Objects.equals(this.taskStatus, taskVo.taskStatus) && Objects.equals(this.taskType, taskVo.taskType)
            && Objects.equals(this.taskDescription, taskVo.taskDescription)
            && Objects.equals(this.execStartTime, taskVo.execStartTime)
            && Objects.equals(this.execStopTime, taskVo.execStopTime)
            && Objects.equals(this.originDataAlias, taskVo.originDataAlias)
            && Objects.equals(this.productionLevel, taskVo.productionLevel)
            && Objects.equals(this.taskProgress, taskVo.taskProgress) && Objects.equals(this.shapeId, taskVo.shapeId)
            && Objects.equals(this.isDeleted, taskVo.isDeleted) && Objects.equals(this.imageUrl, taskVo.imageUrl)
            && Objects.equals(this.domainId, taskVo.domainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            workspaceId,
            dataId,
            taskName,
            creator,
            createTime,
            taskStatus,
            taskType,
            taskDescription,
            execStartTime,
            execStopTime,
            originDataAlias,
            productionLevel,
            taskProgress,
            shapeId,
            isDeleted,
            imageUrl,
            domainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskVo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    dataId: ").append(toIndentedString(dataId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    taskDescription: ").append(toIndentedString(taskDescription)).append("\n");
        sb.append("    execStartTime: ").append(toIndentedString(execStartTime)).append("\n");
        sb.append("    execStopTime: ").append(toIndentedString(execStopTime)).append("\n");
        sb.append("    originDataAlias: ").append(toIndentedString(originDataAlias)).append("\n");
        sb.append("    productionLevel: ").append(toIndentedString(productionLevel)).append("\n");
        sb.append("    taskProgress: ").append(toIndentedString(taskProgress)).append("\n");
        sb.append("    shapeId: ").append(toIndentedString(shapeId)).append("\n");
        sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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
