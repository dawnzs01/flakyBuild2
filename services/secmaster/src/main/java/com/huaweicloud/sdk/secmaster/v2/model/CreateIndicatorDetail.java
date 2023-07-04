package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * indicator detail
 */
public class CreateIndicatorDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source")

    private CreateAlertDataSource dataSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verdict")

    private String verdict;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Integer confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private String labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "granular_marking")

    private String granularMarking;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private ShowAlertRspEnvironment environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defanged")

    private Boolean defanged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_report_time")

    private String firstReportTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_report_time")

    private String lastReportTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indicator_type")

    private CreateIndicatorDetailIndicatorType indicatorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_id")

    private String dataclassId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object")

    private IndicatorDataObjectDetail dataObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_id")

    private String layoutId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass")

    private DataClassRefPojo dataclass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public CreateIndicatorDetail withDataSource(CreateAlertDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public CreateIndicatorDetail withDataSource(Consumer<CreateAlertDataSource> dataSourceSetter) {
        if (this.dataSource == null) {
            this.dataSource = new CreateAlertDataSource();
            dataSourceSetter.accept(this.dataSource);
        }

        return this;
    }

    /**
     * Get dataSource
     * @return dataSource
     */
    public CreateAlertDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(CreateAlertDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public CreateIndicatorDetail withVerdict(String verdict) {
        this.verdict = verdict;
        return this;
    }

    /**
     * 威胁度
     * @return verdict
     */
    public String getVerdict() {
        return verdict;
    }

    public void setVerdict(String verdict) {
        this.verdict = verdict;
    }

    public CreateIndicatorDetail withConfidence(Integer confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 置信度
     * minimum: 0
     * maximum: 99
     * @return confidence
     */
    public Integer getConfidence() {
        return confidence;
    }

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    public CreateIndicatorDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateIndicatorDetail withLabels(String labels) {
        this.labels = labels;
        return this;
    }

    /**
     * 标签
     * @return labels
     */
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public CreateIndicatorDetail withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CreateIndicatorDetail withGranularMarking(String granularMarking) {
        this.granularMarking = granularMarking;
        return this;
    }

    /**
     * 粒度（保密等级），由高到低：1（首次发现）、2（自产数据）、3（需购买）、4（外网直接查询）
     * @return granularMarking
     */
    public String getGranularMarking() {
        return granularMarking;
    }

    public void setGranularMarking(String granularMarking) {
        this.granularMarking = granularMarking;
    }

    public CreateIndicatorDetail withEnvironment(ShowAlertRspEnvironment environment) {
        this.environment = environment;
        return this;
    }

    public CreateIndicatorDetail withEnvironment(Consumer<ShowAlertRspEnvironment> environmentSetter) {
        if (this.environment == null) {
            this.environment = new ShowAlertRspEnvironment();
            environmentSetter.accept(this.environment);
        }

        return this;
    }

    /**
     * Get environment
     * @return environment
     */
    public ShowAlertRspEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(ShowAlertRspEnvironment environment) {
        this.environment = environment;
    }

    public CreateIndicatorDetail withDefanged(Boolean defanged) {
        this.defanged = defanged;
        return this;
    }

    /**
     * 是否失效
     * @return defanged
     */
    public Boolean getDefanged() {
        return defanged;
    }

    public void setDefanged(Boolean defanged) {
        this.defanged = defanged;
    }

    public CreateIndicatorDetail withFirstReportTime(String firstReportTime) {
        this.firstReportTime = firstReportTime;
        return this;
    }

    /**
     * Create time
     * @return firstReportTime
     */
    public String getFirstReportTime() {
        return firstReportTime;
    }

    public void setFirstReportTime(String firstReportTime) {
        this.firstReportTime = firstReportTime;
    }

    public CreateIndicatorDetail withLastReportTime(String lastReportTime) {
        this.lastReportTime = lastReportTime;
        return this;
    }

    /**
     * Update time
     * @return lastReportTime
     */
    public String getLastReportTime() {
        return lastReportTime;
    }

    public void setLastReportTime(String lastReportTime) {
        this.lastReportTime = lastReportTime;
    }

    public CreateIndicatorDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 指标ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateIndicatorDetail withIndicatorType(CreateIndicatorDetailIndicatorType indicatorType) {
        this.indicatorType = indicatorType;
        return this;
    }

    public CreateIndicatorDetail withIndicatorType(Consumer<CreateIndicatorDetailIndicatorType> indicatorTypeSetter) {
        if (this.indicatorType == null) {
            this.indicatorType = new CreateIndicatorDetailIndicatorType();
            indicatorTypeSetter.accept(this.indicatorType);
        }

        return this;
    }

    /**
     * Get indicatorType
     * @return indicatorType
     */
    public CreateIndicatorDetailIndicatorType getIndicatorType() {
        return indicatorType;
    }

    public void setIndicatorType(CreateIndicatorDetailIndicatorType indicatorType) {
        this.indicatorType = indicatorType;
    }

    public CreateIndicatorDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 指标名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateIndicatorDetail withDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
        return this;
    }

    /**
     * 数据类ID
     * @return dataclassId
     */
    public String getDataclassId() {
        return dataclassId;
    }

    public void setDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
    }

    public CreateIndicatorDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型（SIMULATION,PLAYBOOK,MANUAL,INSTANCE,DATA_SOURCE）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateIndicatorDetail withDataObject(IndicatorDataObjectDetail dataObject) {
        this.dataObject = dataObject;
        return this;
    }

    public CreateIndicatorDetail withDataObject(Consumer<IndicatorDataObjectDetail> dataObjectSetter) {
        if (this.dataObject == null) {
            this.dataObject = new IndicatorDataObjectDetail();
            dataObjectSetter.accept(this.dataObject);
        }

        return this;
    }

    /**
     * Get dataObject
     * @return dataObject
     */
    public IndicatorDataObjectDetail getDataObject() {
        return dataObject;
    }

    public void setDataObject(IndicatorDataObjectDetail dataObject) {
        this.dataObject = dataObject;
    }

    public CreateIndicatorDetail withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * workspace id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public CreateIndicatorDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Project id value
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateIndicatorDetail withLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }

    /**
     * 布局ID
     * @return layoutId
     */
    public String getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    public CreateIndicatorDetail withDataclass(DataClassRefPojo dataclass) {
        this.dataclass = dataclass;
        return this;
    }

    public CreateIndicatorDetail withDataclass(Consumer<DataClassRefPojo> dataclassSetter) {
        if (this.dataclass == null) {
            this.dataclass = new DataClassRefPojo();
            dataclassSetter.accept(this.dataclass);
        }

        return this;
    }

    /**
     * Get dataclass
     * @return dataclass
     */
    public DataClassRefPojo getDataclass() {
        return dataclass;
    }

    public void setDataclass(DataClassRefPojo dataclass) {
        this.dataclass = dataclass;
    }

    public CreateIndicatorDetail withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Create time
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CreateIndicatorDetail withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Update time
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateIndicatorDetail createIndicatorDetail = (CreateIndicatorDetail) o;
        return Objects.equals(this.dataSource, createIndicatorDetail.dataSource)
            && Objects.equals(this.verdict, createIndicatorDetail.verdict)
            && Objects.equals(this.confidence, createIndicatorDetail.confidence)
            && Objects.equals(this.status, createIndicatorDetail.status)
            && Objects.equals(this.labels, createIndicatorDetail.labels)
            && Objects.equals(this.value, createIndicatorDetail.value)
            && Objects.equals(this.granularMarking, createIndicatorDetail.granularMarking)
            && Objects.equals(this.environment, createIndicatorDetail.environment)
            && Objects.equals(this.defanged, createIndicatorDetail.defanged)
            && Objects.equals(this.firstReportTime, createIndicatorDetail.firstReportTime)
            && Objects.equals(this.lastReportTime, createIndicatorDetail.lastReportTime)
            && Objects.equals(this.id, createIndicatorDetail.id)
            && Objects.equals(this.indicatorType, createIndicatorDetail.indicatorType)
            && Objects.equals(this.name, createIndicatorDetail.name)
            && Objects.equals(this.dataclassId, createIndicatorDetail.dataclassId)
            && Objects.equals(this.type, createIndicatorDetail.type)
            && Objects.equals(this.dataObject, createIndicatorDetail.dataObject)
            && Objects.equals(this.workspaceId, createIndicatorDetail.workspaceId)
            && Objects.equals(this.projectId, createIndicatorDetail.projectId)
            && Objects.equals(this.layoutId, createIndicatorDetail.layoutId)
            && Objects.equals(this.dataclass, createIndicatorDetail.dataclass)
            && Objects.equals(this.createTime, createIndicatorDetail.createTime)
            && Objects.equals(this.updateTime, createIndicatorDetail.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSource,
            verdict,
            confidence,
            status,
            labels,
            value,
            granularMarking,
            environment,
            defanged,
            firstReportTime,
            lastReportTime,
            id,
            indicatorType,
            name,
            dataclassId,
            type,
            dataObject,
            workspaceId,
            projectId,
            layoutId,
            dataclass,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIndicatorDetail {\n");
        sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
        sb.append("    verdict: ").append(toIndentedString(verdict)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    granularMarking: ").append(toIndentedString(granularMarking)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    defanged: ").append(toIndentedString(defanged)).append("\n");
        sb.append("    firstReportTime: ").append(toIndentedString(firstReportTime)).append("\n");
        sb.append("    lastReportTime: ").append(toIndentedString(lastReportTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    indicatorType: ").append(toIndentedString(indicatorType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dataclassId: ").append(toIndentedString(dataclassId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    dataObject: ").append(toIndentedString(dataObject)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    layoutId: ").append(toIndentedString(layoutId)).append("\n");
        sb.append("    dataclass: ").append(toIndentedString(dataclass)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
