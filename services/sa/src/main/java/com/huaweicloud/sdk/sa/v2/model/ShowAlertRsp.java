package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 告警详情
 */
public class ShowAlertRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private ShowAlertRspEnvironment environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource")

    private ShowAlertRspDatasource datasource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_observed_time")

    private String firstObservedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_observed_time")

    private String lastObservedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arrive_time")

    private String arriveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_url")

    private String sourceUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private String count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Integer confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverity")

    private String serverity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "criticality")

    private Integer criticality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_type")

    private Object alertType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_list")

    private List<ShowAlertRspNetworkList> networkList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_list")

    private List<ShowAlertRspResourceList> resourceList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remediation")

    private ShowAlertRspRemediation remediation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_state")

    private String verificationState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla")

    private Integer sla;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_time")

    private String closeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chop_phase")

    private String chopPhase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipdrr_phase")

    private String ipdrrPhase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ppdr_phase")

    private String ppdrPhase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "simulation")

    private Boolean simulation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actor")

    private String actor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cteator")

    private String cteator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_reason")

    private String closeReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_comment")

    private String closeComment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malware")

    private ShowAlertRspMalware malware;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_info")

    private Object systemInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    private List<ShowAlertRspProcess> process = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_info")

    private List<ShowAlertRspUserInfo> userInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_info")

    private List<ShowAlertRspFileInfo> fileInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_alert_table")

    private Object systemAlertTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public ShowAlertRsp withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowAlertRsp withEnvironment(ShowAlertRspEnvironment environment) {
        this.environment = environment;
        return this;
    }

    public ShowAlertRsp withEnvironment(Consumer<ShowAlertRspEnvironment> environmentSetter) {
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

    public ShowAlertRsp withDatasource(ShowAlertRspDatasource datasource) {
        this.datasource = datasource;
        return this;
    }

    public ShowAlertRsp withDatasource(Consumer<ShowAlertRspDatasource> datasourceSetter) {
        if (this.datasource == null) {
            this.datasource = new ShowAlertRspDatasource();
            datasourceSetter.accept(this.datasource);
        }

        return this;
    }

    /**
     * Get datasource
     * @return datasource
     */
    public ShowAlertRspDatasource getDatasource() {
        return datasource;
    }

    public void setDatasource(ShowAlertRspDatasource datasource) {
        this.datasource = datasource;
    }

    public ShowAlertRsp withFirstObservedTime(String firstObservedTime) {
        this.firstObservedTime = firstObservedTime;
        return this;
    }

    /**
     * Update time
     * @return firstObservedTime
     */
    public String getFirstObservedTime() {
        return firstObservedTime;
    }

    public void setFirstObservedTime(String firstObservedTime) {
        this.firstObservedTime = firstObservedTime;
    }

    public ShowAlertRsp withLastObservedTime(String lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
        return this;
    }

    /**
     * Update time
     * @return lastObservedTime
     */
    public String getLastObservedTime() {
        return lastObservedTime;
    }

    public void setLastObservedTime(String lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
    }

    public ShowAlertRsp withCreateTime(String createTime) {
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

    public ShowAlertRsp withArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
        return this;
    }

    /**
     * Update time
     * @return arriveTime
     */
    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public ShowAlertRsp withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * The name, display only
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ShowAlertRsp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description, display only
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowAlertRsp withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * 事件URL链接
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public ShowAlertRsp withCount(String count) {
        this.count = count;
        return this;
    }

    /**
     * 事件发生次数
     * @return count
     */
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public ShowAlertRsp withConfidence(Integer confidence) {
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

    public ShowAlertRsp withServerity(String serverity) {
        this.serverity = serverity;
        return this;
    }

    /**
     * 严重性等级
     * @return serverity
     */
    public String getServerity() {
        return serverity;
    }

    public void setServerity(String serverity) {
        this.serverity = serverity;
    }

    public ShowAlertRsp withCriticality(Integer criticality) {
        this.criticality = criticality;
        return this;
    }

    /**
     * 关键性，是指事件涉及的资源的重要性级别。
     * minimum: 0
     * maximum: 5
     * @return criticality
     */
    public Integer getCriticality() {
        return criticality;
    }

    public void setCriticality(Integer criticality) {
        this.criticality = criticality;
    }

    public ShowAlertRsp withAlertType(Object alertType) {
        this.alertType = alertType;
        return this;
    }

    /**
     * 事件分类
     * @return alertType
     */
    public Object getAlertType() {
        return alertType;
    }

    public void setAlertType(Object alertType) {
        this.alertType = alertType;
    }

    public ShowAlertRsp withNetworkList(List<ShowAlertRspNetworkList> networkList) {
        this.networkList = networkList;
        return this;
    }

    public ShowAlertRsp addNetworkListItem(ShowAlertRspNetworkList networkListItem) {
        if (this.networkList == null) {
            this.networkList = new ArrayList<>();
        }
        this.networkList.add(networkListItem);
        return this;
    }

    public ShowAlertRsp withNetworkList(Consumer<List<ShowAlertRspNetworkList>> networkListSetter) {
        if (this.networkList == null) {
            this.networkList = new ArrayList<>();
        }
        networkListSetter.accept(this.networkList);
        return this;
    }

    /**
     * network_list
     * @return networkList
     */
    public List<ShowAlertRspNetworkList> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(List<ShowAlertRspNetworkList> networkList) {
        this.networkList = networkList;
    }

    public ShowAlertRsp withResourceList(List<ShowAlertRspResourceList> resourceList) {
        this.resourceList = resourceList;
        return this;
    }

    public ShowAlertRsp addResourceListItem(ShowAlertRspResourceList resourceListItem) {
        if (this.resourceList == null) {
            this.resourceList = new ArrayList<>();
        }
        this.resourceList.add(resourceListItem);
        return this;
    }

    public ShowAlertRsp withResourceList(Consumer<List<ShowAlertRspResourceList>> resourceListSetter) {
        if (this.resourceList == null) {
            this.resourceList = new ArrayList<>();
        }
        resourceListSetter.accept(this.resourceList);
        return this;
    }

    /**
     * network_list
     * @return resourceList
     */
    public List<ShowAlertRspResourceList> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<ShowAlertRspResourceList> resourceList) {
        this.resourceList = resourceList;
    }

    public ShowAlertRsp withRemediation(ShowAlertRspRemediation remediation) {
        this.remediation = remediation;
        return this;
    }

    public ShowAlertRsp withRemediation(Consumer<ShowAlertRspRemediation> remediationSetter) {
        if (this.remediation == null) {
            this.remediation = new ShowAlertRspRemediation();
            remediationSetter.accept(this.remediation);
        }

        return this;
    }

    /**
     * Get remediation
     * @return remediation
     */
    public ShowAlertRspRemediation getRemediation() {
        return remediation;
    }

    public void setRemediation(ShowAlertRspRemediation remediation) {
        this.remediation = remediation;
    }

    public ShowAlertRsp withVerificationState(String verificationState) {
        this.verificationState = verificationState;
        return this;
    }

    /**
     * 验证状态
     * @return verificationState
     */
    public String getVerificationState() {
        return verificationState;
    }

    public void setVerificationState(String verificationState) {
        this.verificationState = verificationState;
    }

    public ShowAlertRsp withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * 事件处理状态
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public ShowAlertRsp withSla(Integer sla) {
        this.sla = sla;
        return this;
    }

    /**
     * sla
     * minimum: 0
     * maximum: 65535
     * @return sla
     */
    public Integer getSla() {
        return sla;
    }

    public void setSla(Integer sla) {
        this.sla = sla;
    }

    public ShowAlertRsp withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Create time
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowAlertRsp withCloseTime(String closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    /**
     * Create time
     * @return closeTime
     */
    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public ShowAlertRsp withChopPhase(String chopPhase) {
        this.chopPhase = chopPhase;
        return this;
    }

    /**
     * 周期/处置阶段编号
     * @return chopPhase
     */
    public String getChopPhase() {
        return chopPhase;
    }

    public void setChopPhase(String chopPhase) {
        this.chopPhase = chopPhase;
    }

    public ShowAlertRsp withIpdrrPhase(String ipdrrPhase) {
        this.ipdrrPhase = ipdrrPhase;
        return this;
    }

    /**
     * 周期/处置阶段编号
     * @return ipdrrPhase
     */
    public String getIpdrrPhase() {
        return ipdrrPhase;
    }

    public void setIpdrrPhase(String ipdrrPhase) {
        this.ipdrrPhase = ipdrrPhase;
    }

    public ShowAlertRsp withPpdrPhase(String ppdrPhase) {
        this.ppdrPhase = ppdrPhase;
        return this;
    }

    /**
     * 周期/处置阶段编号
     * @return ppdrPhase
     */
    public String getPpdrPhase() {
        return ppdrPhase;
    }

    public void setPpdrPhase(String ppdrPhase) {
        this.ppdrPhase = ppdrPhase;
    }

    public ShowAlertRsp withSimulation(Boolean simulation) {
        this.simulation = simulation;
        return this;
    }

    /**
     * 是否为调试事件.
     * @return simulation
     */
    public Boolean getSimulation() {
        return simulation;
    }

    public void setSimulation(Boolean simulation) {
        this.simulation = simulation;
    }

    public ShowAlertRsp withActor(String actor) {
        this.actor = actor;
        return this;
    }

    /**
     * 委托人
     * @return actor
     */
    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public ShowAlertRsp withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * The name, display only
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ShowAlertRsp withCteator(String cteator) {
        this.cteator = cteator;
        return this;
    }

    /**
     * The name, display only
     * @return cteator
     */
    public String getCteator() {
        return cteator;
    }

    public void setCteator(String cteator) {
        this.cteator = cteator;
    }

    public ShowAlertRsp withCloseReason(String closeReason) {
        this.closeReason = closeReason;
        return this;
    }

    /**
     * 关闭原因
     * @return closeReason
     */
    public String getCloseReason() {
        return closeReason;
    }

    public void setCloseReason(String closeReason) {
        this.closeReason = closeReason;
    }

    public ShowAlertRsp withCloseComment(String closeComment) {
        this.closeComment = closeComment;
        return this;
    }

    /**
     * 关闭原因
     * @return closeComment
     */
    public String getCloseComment() {
        return closeComment;
    }

    public void setCloseComment(String closeComment) {
        this.closeComment = closeComment;
    }

    public ShowAlertRsp withMalware(ShowAlertRspMalware malware) {
        this.malware = malware;
        return this;
    }

    public ShowAlertRsp withMalware(Consumer<ShowAlertRspMalware> malwareSetter) {
        if (this.malware == null) {
            this.malware = new ShowAlertRspMalware();
            malwareSetter.accept(this.malware);
        }

        return this;
    }

    /**
     * Get malware
     * @return malware
     */
    public ShowAlertRspMalware getMalware() {
        return malware;
    }

    public void setMalware(ShowAlertRspMalware malware) {
        this.malware = malware;
    }

    public ShowAlertRsp withSystemInfo(Object systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }

    /**
     * 系统信息
     * @return systemInfo
     */
    public Object getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(Object systemInfo) {
        this.systemInfo = systemInfo;
    }

    public ShowAlertRsp withProcess(List<ShowAlertRspProcess> process) {
        this.process = process;
        return this;
    }

    public ShowAlertRsp addProcessItem(ShowAlertRspProcess processItem) {
        if (this.process == null) {
            this.process = new ArrayList<>();
        }
        this.process.add(processItem);
        return this;
    }

    public ShowAlertRsp withProcess(Consumer<List<ShowAlertRspProcess>> processSetter) {
        if (this.process == null) {
            this.process = new ArrayList<>();
        }
        processSetter.accept(this.process);
        return this;
    }

    /**
     * 进程信息
     * @return process
     */
    public List<ShowAlertRspProcess> getProcess() {
        return process;
    }

    public void setProcess(List<ShowAlertRspProcess> process) {
        this.process = process;
    }

    public ShowAlertRsp withUserInfo(List<ShowAlertRspUserInfo> userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    public ShowAlertRsp addUserInfoItem(ShowAlertRspUserInfo userInfoItem) {
        if (this.userInfo == null) {
            this.userInfo = new ArrayList<>();
        }
        this.userInfo.add(userInfoItem);
        return this;
    }

    public ShowAlertRsp withUserInfo(Consumer<List<ShowAlertRspUserInfo>> userInfoSetter) {
        if (this.userInfo == null) {
            this.userInfo = new ArrayList<>();
        }
        userInfoSetter.accept(this.userInfo);
        return this;
    }

    /**
     * 用户信息
     * @return userInfo
     */
    public List<ShowAlertRspUserInfo> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(List<ShowAlertRspUserInfo> userInfo) {
        this.userInfo = userInfo;
    }

    public ShowAlertRsp withFileInfo(List<ShowAlertRspFileInfo> fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }

    public ShowAlertRsp addFileInfoItem(ShowAlertRspFileInfo fileInfoItem) {
        if (this.fileInfo == null) {
            this.fileInfo = new ArrayList<>();
        }
        this.fileInfo.add(fileInfoItem);
        return this;
    }

    public ShowAlertRsp withFileInfo(Consumer<List<ShowAlertRspFileInfo>> fileInfoSetter) {
        if (this.fileInfo == null) {
            this.fileInfo = new ArrayList<>();
        }
        fileInfoSetter.accept(this.fileInfo);
        return this;
    }

    /**
     * 文件信息
     * @return fileInfo
     */
    public List<ShowAlertRspFileInfo> getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(List<ShowAlertRspFileInfo> fileInfo) {
        this.fileInfo = fileInfo;
    }

    public ShowAlertRsp withSystemAlertTable(Object systemAlertTable) {
        this.systemAlertTable = systemAlertTable;
        return this;
    }

    /**
     * 系统信息
     * @return systemAlertTable
     */
    public Object getSystemAlertTable() {
        return systemAlertTable;
    }

    public void setSystemAlertTable(Object systemAlertTable) {
        this.systemAlertTable = systemAlertTable;
    }

    public ShowAlertRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Id value
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowAlertRsp withWorkspaceId(String workspaceId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAlertRsp showAlertRsp = (ShowAlertRsp) o;
        return Objects.equals(this.version, showAlertRsp.version)
            && Objects.equals(this.environment, showAlertRsp.environment)
            && Objects.equals(this.datasource, showAlertRsp.datasource)
            && Objects.equals(this.firstObservedTime, showAlertRsp.firstObservedTime)
            && Objects.equals(this.lastObservedTime, showAlertRsp.lastObservedTime)
            && Objects.equals(this.createTime, showAlertRsp.createTime)
            && Objects.equals(this.arriveTime, showAlertRsp.arriveTime)
            && Objects.equals(this.title, showAlertRsp.title)
            && Objects.equals(this.description, showAlertRsp.description)
            && Objects.equals(this.sourceUrl, showAlertRsp.sourceUrl) && Objects.equals(this.count, showAlertRsp.count)
            && Objects.equals(this.confidence, showAlertRsp.confidence)
            && Objects.equals(this.serverity, showAlertRsp.serverity)
            && Objects.equals(this.criticality, showAlertRsp.criticality)
            && Objects.equals(this.alertType, showAlertRsp.alertType)
            && Objects.equals(this.networkList, showAlertRsp.networkList)
            && Objects.equals(this.resourceList, showAlertRsp.resourceList)
            && Objects.equals(this.remediation, showAlertRsp.remediation)
            && Objects.equals(this.verificationState, showAlertRsp.verificationState)
            && Objects.equals(this.handleStatus, showAlertRsp.handleStatus)
            && Objects.equals(this.sla, showAlertRsp.sla) && Objects.equals(this.updateTime, showAlertRsp.updateTime)
            && Objects.equals(this.closeTime, showAlertRsp.closeTime)
            && Objects.equals(this.chopPhase, showAlertRsp.chopPhase)
            && Objects.equals(this.ipdrrPhase, showAlertRsp.ipdrrPhase)
            && Objects.equals(this.ppdrPhase, showAlertRsp.ppdrPhase)
            && Objects.equals(this.simulation, showAlertRsp.simulation)
            && Objects.equals(this.actor, showAlertRsp.actor) && Objects.equals(this.owner, showAlertRsp.owner)
            && Objects.equals(this.cteator, showAlertRsp.cteator)
            && Objects.equals(this.closeReason, showAlertRsp.closeReason)
            && Objects.equals(this.closeComment, showAlertRsp.closeComment)
            && Objects.equals(this.malware, showAlertRsp.malware)
            && Objects.equals(this.systemInfo, showAlertRsp.systemInfo)
            && Objects.equals(this.process, showAlertRsp.process)
            && Objects.equals(this.userInfo, showAlertRsp.userInfo)
            && Objects.equals(this.fileInfo, showAlertRsp.fileInfo)
            && Objects.equals(this.systemAlertTable, showAlertRsp.systemAlertTable)
            && Objects.equals(this.id, showAlertRsp.id) && Objects.equals(this.workspaceId, showAlertRsp.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version,
            environment,
            datasource,
            firstObservedTime,
            lastObservedTime,
            createTime,
            arriveTime,
            title,
            description,
            sourceUrl,
            count,
            confidence,
            serverity,
            criticality,
            alertType,
            networkList,
            resourceList,
            remediation,
            verificationState,
            handleStatus,
            sla,
            updateTime,
            closeTime,
            chopPhase,
            ipdrrPhase,
            ppdrPhase,
            simulation,
            actor,
            owner,
            cteator,
            closeReason,
            closeComment,
            malware,
            systemInfo,
            process,
            userInfo,
            fileInfo,
            systemAlertTable,
            id,
            workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAlertRsp {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
        sb.append("    firstObservedTime: ").append(toIndentedString(firstObservedTime)).append("\n");
        sb.append("    lastObservedTime: ").append(toIndentedString(lastObservedTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    arriveTime: ").append(toIndentedString(arriveTime)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    serverity: ").append(toIndentedString(serverity)).append("\n");
        sb.append("    criticality: ").append(toIndentedString(criticality)).append("\n");
        sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
        sb.append("    networkList: ").append(toIndentedString(networkList)).append("\n");
        sb.append("    resourceList: ").append(toIndentedString(resourceList)).append("\n");
        sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
        sb.append("    verificationState: ").append(toIndentedString(verificationState)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    sla: ").append(toIndentedString(sla)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
        sb.append("    chopPhase: ").append(toIndentedString(chopPhase)).append("\n");
        sb.append("    ipdrrPhase: ").append(toIndentedString(ipdrrPhase)).append("\n");
        sb.append("    ppdrPhase: ").append(toIndentedString(ppdrPhase)).append("\n");
        sb.append("    simulation: ").append(toIndentedString(simulation)).append("\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    cteator: ").append(toIndentedString(cteator)).append("\n");
        sb.append("    closeReason: ").append(toIndentedString(closeReason)).append("\n");
        sb.append("    closeComment: ").append(toIndentedString(closeComment)).append("\n");
        sb.append("    malware: ").append(toIndentedString(malware)).append("\n");
        sb.append("    systemInfo: ").append(toIndentedString(systemInfo)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
        sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
        sb.append("    systemAlertTable: ").append(toIndentedString(systemAlertTable)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
