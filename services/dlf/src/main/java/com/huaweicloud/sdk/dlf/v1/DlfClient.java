package com.huaweicloud.sdk.dlf.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dlf.v1.model.*;

public class DlfClient {

    protected HcClient hcClient;

    public DlfClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DlfClient> newBuilder() {
        return new ClientBuilder<>(DlfClient::new);
    }

    /**
     * 停止脚本实例的执行
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelScriptRequest 请求对象
     * @return CancelScriptResponse
     */
    public CancelScriptResponse cancelScript(CancelScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.cancelScript);
    }

    /**
     * 停止脚本实例的执行
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelScriptRequest 请求对象
     * @return SyncInvoker<CancelScriptRequest, CancelScriptResponse>
     */
    public SyncInvoker<CancelScriptRequest, CancelScriptResponse> cancelScriptInvoker(CancelScriptRequest request) {
        return new SyncInvoker<CancelScriptRequest, CancelScriptResponse>(request, DlfMeta.cancelScript, hcClient);
    }

    /**
     * 创建连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConnectionRequest 请求对象
     * @return CreateConnectionResponse
     */
    public CreateConnectionResponse createConnection(CreateConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.createConnection);
    }

    /**
     * 创建连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConnectionRequest 请求对象
     * @return SyncInvoker<CreateConnectionRequest, CreateConnectionResponse>
     */
    public SyncInvoker<CreateConnectionRequest, CreateConnectionResponse> createConnectionInvoker(
        CreateConnectionRequest request) {
        return new SyncInvoker<CreateConnectionRequest, CreateConnectionResponse>(request, DlfMeta.createConnection,
            hcClient);
    }

    /**
     * 创建作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateJobRequest 请求对象
     * @return CreateJobResponse
     */
    public CreateJobResponse createJob(CreateJobRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.createJob);
    }

    /**
     * 创建作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateJobRequest 请求对象
     * @return SyncInvoker<CreateJobRequest, CreateJobResponse>
     */
    public SyncInvoker<CreateJobRequest, CreateJobResponse> createJobInvoker(CreateJobRequest request) {
        return new SyncInvoker<CreateJobRequest, CreateJobResponse>(request, DlfMeta.createJob, hcClient);
    }

    /**
     * 创建资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceRequest 请求对象
     * @return CreateResourceResponse
     */
    public CreateResourceResponse createResource(CreateResourceRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.createResource);
    }

    /**
     * 创建资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceRequest 请求对象
     * @return SyncInvoker<CreateResourceRequest, CreateResourceResponse>
     */
    public SyncInvoker<CreateResourceRequest, CreateResourceResponse> createResourceInvoker(
        CreateResourceRequest request) {
        return new SyncInvoker<CreateResourceRequest, CreateResourceResponse>(request, DlfMeta.createResource,
            hcClient);
    }

    /**
     * 创建脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateScriptRequest 请求对象
     * @return CreateScriptResponse
     */
    public CreateScriptResponse createScript(CreateScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.createScript);
    }

    /**
     * 创建脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateScriptRequest 请求对象
     * @return SyncInvoker<CreateScriptRequest, CreateScriptResponse>
     */
    public SyncInvoker<CreateScriptRequest, CreateScriptResponse> createScriptInvoker(CreateScriptRequest request) {
        return new SyncInvoker<CreateScriptRequest, CreateScriptResponse>(request, DlfMeta.createScript, hcClient);
    }

    /**
     * 删除连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConnctionRequest 请求对象
     * @return DeleteConnctionResponse
     */
    public DeleteConnctionResponse deleteConnction(DeleteConnctionRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.deleteConnction);
    }

    /**
     * 删除连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConnctionRequest 请求对象
     * @return SyncInvoker<DeleteConnctionRequest, DeleteConnctionResponse>
     */
    public SyncInvoker<DeleteConnctionRequest, DeleteConnctionResponse> deleteConnctionInvoker(
        DeleteConnctionRequest request) {
        return new SyncInvoker<DeleteConnctionRequest, DeleteConnctionResponse>(request, DlfMeta.deleteConnction,
            hcClient);
    }

    /**
     * 删除作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJob(DeleteJobRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.deleteJob);
    }

    /**
     * 删除作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return SyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public SyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobInvoker(DeleteJobRequest request) {
        return new SyncInvoker<DeleteJobRequest, DeleteJobResponse>(request, DlfMeta.deleteJob, hcClient);
    }

    /**
     * 删除资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceRequest 请求对象
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResource(DeleteResourceRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.deleteResource);
    }

    /**
     * 删除资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceRequest 请求对象
     * @return SyncInvoker<DeleteResourceRequest, DeleteResourceResponse>
     */
    public SyncInvoker<DeleteResourceRequest, DeleteResourceResponse> deleteResourceInvoker(
        DeleteResourceRequest request) {
        return new SyncInvoker<DeleteResourceRequest, DeleteResourceResponse>(request, DlfMeta.deleteResource,
            hcClient);
    }

    /**
     * 删除脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteScriptRequest 请求对象
     * @return DeleteScriptResponse
     */
    public DeleteScriptResponse deleteScript(DeleteScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.deleteScript);
    }

    /**
     * 删除脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteScriptRequest 请求对象
     * @return SyncInvoker<DeleteScriptRequest, DeleteScriptResponse>
     */
    public SyncInvoker<DeleteScriptRequest, DeleteScriptResponse> deleteScriptInvoker(DeleteScriptRequest request) {
        return new SyncInvoker<DeleteScriptRequest, DeleteScriptResponse>(request, DlfMeta.deleteScript, hcClient);
    }

    /**
     * 执行脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteScriptRequest 请求对象
     * @return ExecuteScriptResponse
     */
    public ExecuteScriptResponse executeScript(ExecuteScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.executeScript);
    }

    /**
     * 执行脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteScriptRequest 请求对象
     * @return SyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse>
     */
    public SyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse> executeScriptInvoker(ExecuteScriptRequest request) {
        return new SyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse>(request, DlfMeta.executeScript, hcClient);
    }

    /**
     * 导出连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportConnectionsRequest 请求对象
     * @return ExportConnectionsResponse
     */
    public ExportConnectionsResponse exportConnections(ExportConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.exportConnections);
    }

    /**
     * 导出连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportConnectionsRequest 请求对象
     * @return SyncInvoker<ExportConnectionsRequest, ExportConnectionsResponse>
     */
    public SyncInvoker<ExportConnectionsRequest, ExportConnectionsResponse> exportConnectionsInvoker(
        ExportConnectionsRequest request) {
        return new SyncInvoker<ExportConnectionsRequest, ExportConnectionsResponse>(request, DlfMeta.exportConnections,
            hcClient);
    }

    /**
     * 导出作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportJobRequest 请求对象
     * @return ExportJobResponse
     */
    public ExportJobResponse exportJob(ExportJobRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.exportJob);
    }

    /**
     * 导出作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportJobRequest 请求对象
     * @return SyncInvoker<ExportJobRequest, ExportJobResponse>
     */
    public SyncInvoker<ExportJobRequest, ExportJobResponse> exportJobInvoker(ExportJobRequest request) {
        return new SyncInvoker<ExportJobRequest, ExportJobResponse>(request, DlfMeta.exportJob, hcClient);
    }

    /**
     * 批量导出作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportJobListRequest 请求对象
     * @return ExportJobListResponse
     */
    public ExportJobListResponse exportJobList(ExportJobListRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.exportJobList);
    }

    /**
     * 批量导出作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportJobListRequest 请求对象
     * @return SyncInvoker<ExportJobListRequest, ExportJobListResponse>
     */
    public SyncInvoker<ExportJobListRequest, ExportJobListResponse> exportJobListInvoker(ExportJobListRequest request) {
        return new SyncInvoker<ExportJobListRequest, ExportJobListResponse>(request, DlfMeta.exportJobList, hcClient);
    }

    /**
     * 导入连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportConnectionsRequest 请求对象
     * @return ImportConnectionsResponse
     */
    public ImportConnectionsResponse importConnections(ImportConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.importConnections);
    }

    /**
     * 导入连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportConnectionsRequest 请求对象
     * @return SyncInvoker<ImportConnectionsRequest, ImportConnectionsResponse>
     */
    public SyncInvoker<ImportConnectionsRequest, ImportConnectionsResponse> importConnectionsInvoker(
        ImportConnectionsRequest request) {
        return new SyncInvoker<ImportConnectionsRequest, ImportConnectionsResponse>(request, DlfMeta.importConnections,
            hcClient);
    }

    /**
     * 导入作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportJobRequest 请求对象
     * @return ImportJobResponse
     */
    public ImportJobResponse importJob(ImportJobRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.importJob);
    }

    /**
     * 导入作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportJobRequest 请求对象
     * @return SyncInvoker<ImportJobRequest, ImportJobResponse>
     */
    public SyncInvoker<ImportJobRequest, ImportJobResponse> importJobInvoker(ImportJobRequest request) {
        return new SyncInvoker<ImportJobRequest, ImportJobResponse>(request, DlfMeta.importJob, hcClient);
    }

    /**
     * 查询连接列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConnectionsRequest 请求对象
     * @return ListConnectionsResponse
     */
    public ListConnectionsResponse listConnections(ListConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.listConnections);
    }

    /**
     * 查询连接列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConnectionsRequest 请求对象
     * @return SyncInvoker<ListConnectionsRequest, ListConnectionsResponse>
     */
    public SyncInvoker<ListConnectionsRequest, ListConnectionsResponse> listConnectionsInvoker(
        ListConnectionsRequest request) {
        return new SyncInvoker<ListConnectionsRequest, ListConnectionsResponse>(request, DlfMeta.listConnections,
            hcClient);
    }

    /**
     * 查询作业实例列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobInstancesRequest 请求对象
     * @return ListJobInstancesResponse
     */
    public ListJobInstancesResponse listJobInstances(ListJobInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.listJobInstances);
    }

    /**
     * 查询作业实例列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobInstancesRequest 请求对象
     * @return SyncInvoker<ListJobInstancesRequest, ListJobInstancesResponse>
     */
    public SyncInvoker<ListJobInstancesRequest, ListJobInstancesResponse> listJobInstancesInvoker(
        ListJobInstancesRequest request) {
        return new SyncInvoker<ListJobInstancesRequest, ListJobInstancesResponse>(request, DlfMeta.listJobInstances,
            hcClient);
    }

    /**
     * 查询作业列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.listJobs);
    }

    /**
     * 查询作业列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return SyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public SyncInvoker<ListJobsRequest, ListJobsResponse> listJobsInvoker(ListJobsRequest request) {
        return new SyncInvoker<ListJobsRequest, ListJobsResponse>(request, DlfMeta.listJobs, hcClient);
    }

    /**
     * 查询资源列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourcesRequest 请求对象
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.listResources);
    }

    /**
     * 查询资源列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourcesRequest 请求对象
     * @return SyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public SyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesInvoker(ListResourcesRequest request) {
        return new SyncInvoker<ListResourcesRequest, ListResourcesResponse>(request, DlfMeta.listResources, hcClient);
    }

    /**
     * 查询脚本实例执行结果
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListScriptResultsRequest 请求对象
     * @return ListScriptResultsResponse
     */
    public ListScriptResultsResponse listScriptResults(ListScriptResultsRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.listScriptResults);
    }

    /**
     * 查询脚本实例执行结果
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListScriptResultsRequest 请求对象
     * @return SyncInvoker<ListScriptResultsRequest, ListScriptResultsResponse>
     */
    public SyncInvoker<ListScriptResultsRequest, ListScriptResultsResponse> listScriptResultsInvoker(
        ListScriptResultsRequest request) {
        return new SyncInvoker<ListScriptResultsRequest, ListScriptResultsResponse>(request, DlfMeta.listScriptResults,
            hcClient);
    }

    /**
     * 查询脚本列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListScriptsRequest 请求对象
     * @return ListScriptsResponse
     */
    public ListScriptsResponse listScripts(ListScriptsRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.listScripts);
    }

    /**
     * 查询脚本列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListScriptsRequest 请求对象
     * @return SyncInvoker<ListScriptsRequest, ListScriptsResponse>
     */
    public SyncInvoker<ListScriptsRequest, ListScriptsResponse> listScriptsInvoker(ListScriptsRequest request) {
        return new SyncInvoker<ListScriptsRequest, ListScriptsResponse>(request, DlfMeta.listScripts, hcClient);
    }

    /**
     * 查询系统任务详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSystemTasksRequest 请求对象
     * @return ListSystemTasksResponse
     */
    public ListSystemTasksResponse listSystemTasks(ListSystemTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.listSystemTasks);
    }

    /**
     * 查询系统任务详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSystemTasksRequest 请求对象
     * @return SyncInvoker<ListSystemTasksRequest, ListSystemTasksResponse>
     */
    public SyncInvoker<ListSystemTasksRequest, ListSystemTasksResponse> listSystemTasksInvoker(
        ListSystemTasksRequest request) {
        return new SyncInvoker<ListSystemTasksRequest, ListSystemTasksResponse>(request, DlfMeta.listSystemTasks,
            hcClient);
    }

    /**
     * 重跑作业实例
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreJobInstanceRequest 请求对象
     * @return RestoreJobInstanceResponse
     */
    public RestoreJobInstanceResponse restoreJobInstance(RestoreJobInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.restoreJobInstance);
    }

    /**
     * 重跑作业实例
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreJobInstanceRequest 请求对象
     * @return SyncInvoker<RestoreJobInstanceRequest, RestoreJobInstanceResponse>
     */
    public SyncInvoker<RestoreJobInstanceRequest, RestoreJobInstanceResponse> restoreJobInstanceInvoker(
        RestoreJobInstanceRequest request) {
        return new SyncInvoker<RestoreJobInstanceRequest, RestoreJobInstanceResponse>(request,
            DlfMeta.restoreJobInstance, hcClient);
    }

    /**
     * 单次执行作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunOnceRequest 请求对象
     * @return RunOnceResponse
     */
    public RunOnceResponse runOnce(RunOnceRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.runOnce);
    }

    /**
     * 单次执行作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunOnceRequest 请求对象
     * @return SyncInvoker<RunOnceRequest, RunOnceResponse>
     */
    public SyncInvoker<RunOnceRequest, RunOnceResponse> runOnceInvoker(RunOnceRequest request) {
        return new SyncInvoker<RunOnceRequest, RunOnceResponse>(request, DlfMeta.runOnce, hcClient);
    }

    /**
     * 查询连接详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConnectionRequest 请求对象
     * @return ShowConnectionResponse
     */
    public ShowConnectionResponse showConnection(ShowConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.showConnection);
    }

    /**
     * 查询连接详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConnectionRequest 请求对象
     * @return SyncInvoker<ShowConnectionRequest, ShowConnectionResponse>
     */
    public SyncInvoker<ShowConnectionRequest, ShowConnectionResponse> showConnectionInvoker(
        ShowConnectionRequest request) {
        return new SyncInvoker<ShowConnectionRequest, ShowConnectionResponse>(request, DlfMeta.showConnection,
            hcClient);
    }

    /**
     * 查询目录树
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDirectoryTreeRequest 请求对象
     * @return ShowDirectoryTreeResponse
     */
    public ShowDirectoryTreeResponse showDirectoryTree(ShowDirectoryTreeRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.showDirectoryTree);
    }

    /**
     * 查询目录树
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDirectoryTreeRequest 请求对象
     * @return SyncInvoker<ShowDirectoryTreeRequest, ShowDirectoryTreeResponse>
     */
    public SyncInvoker<ShowDirectoryTreeRequest, ShowDirectoryTreeResponse> showDirectoryTreeInvoker(
        ShowDirectoryTreeRequest request) {
        return new SyncInvoker<ShowDirectoryTreeRequest, ShowDirectoryTreeResponse>(request, DlfMeta.showDirectoryTree,
            hcClient);
    }

    /**
     * 检查导入作业文件中的作业和脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFileInfoRequest 请求对象
     * @return ShowFileInfoResponse
     */
    public ShowFileInfoResponse showFileInfo(ShowFileInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.showFileInfo);
    }

    /**
     * 检查导入作业文件中的作业和脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFileInfoRequest 请求对象
     * @return SyncInvoker<ShowFileInfoRequest, ShowFileInfoResponse>
     */
    public SyncInvoker<ShowFileInfoRequest, ShowFileInfoResponse> showFileInfoInvoker(ShowFileInfoRequest request) {
        return new SyncInvoker<ShowFileInfoRequest, ShowFileInfoResponse>(request, DlfMeta.showFileInfo, hcClient);
    }

    /**
     * 查询作业详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.showJob);
    }

    /**
     * 查询作业详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<ShowJobRequest, ShowJobResponse>(request, DlfMeta.showJob, hcClient);
    }

    /**
     * 查询作业实例详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobInstanceRequest 请求对象
     * @return ShowJobInstanceResponse
     */
    public ShowJobInstanceResponse showJobInstance(ShowJobInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.showJobInstance);
    }

    /**
     * 查询作业实例详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobInstanceRequest 请求对象
     * @return SyncInvoker<ShowJobInstanceRequest, ShowJobInstanceResponse>
     */
    public SyncInvoker<ShowJobInstanceRequest, ShowJobInstanceResponse> showJobInstanceInvoker(
        ShowJobInstanceRequest request) {
        return new SyncInvoker<ShowJobInstanceRequest, ShowJobInstanceResponse>(request, DlfMeta.showJobInstance,
            hcClient);
    }

    /**
     * 查询实时作业的运行状态
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobStatusRequest 请求对象
     * @return ShowJobStatusResponse
     */
    public ShowJobStatusResponse showJobStatus(ShowJobStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.showJobStatus);
    }

    /**
     * 查询实时作业的运行状态
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobStatusRequest 请求对象
     * @return SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>
     */
    public SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatusInvoker(ShowJobStatusRequest request) {
        return new SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>(request, DlfMeta.showJobStatus, hcClient);
    }

    /**
     * 查询资源详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceRequest 请求对象
     * @return ShowResourceResponse
     */
    public ShowResourceResponse showResource(ShowResourceRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.showResource);
    }

    /**
     * 查询资源详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceRequest 请求对象
     * @return SyncInvoker<ShowResourceRequest, ShowResourceResponse>
     */
    public SyncInvoker<ShowResourceRequest, ShowResourceResponse> showResourceInvoker(ShowResourceRequest request) {
        return new SyncInvoker<ShowResourceRequest, ShowResourceResponse>(request, DlfMeta.showResource, hcClient);
    }

    /**
     * 查询脚本信息
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowScriptRequest 请求对象
     * @return ShowScriptResponse
     */
    public ShowScriptResponse showScript(ShowScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.showScript);
    }

    /**
     * 查询脚本信息
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowScriptRequest 请求对象
     * @return SyncInvoker<ShowScriptRequest, ShowScriptResponse>
     */
    public SyncInvoker<ShowScriptRequest, ShowScriptResponse> showScriptInvoker(ShowScriptRequest request) {
        return new SyncInvoker<ShowScriptRequest, ShowScriptResponse>(request, DlfMeta.showScript, hcClient);
    }

    /**
     * 启动作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartJobRequest 请求对象
     * @return StartJobResponse
     */
    public StartJobResponse startJob(StartJobRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.startJob);
    }

    /**
     * 启动作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartJobRequest 请求对象
     * @return SyncInvoker<StartJobRequest, StartJobResponse>
     */
    public SyncInvoker<StartJobRequest, StartJobResponse> startJobInvoker(StartJobRequest request) {
        return new SyncInvoker<StartJobRequest, StartJobResponse>(request, DlfMeta.startJob, hcClient);
    }

    /**
     * 停止作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobRequest 请求对象
     * @return StopJobResponse
     */
    public StopJobResponse stopJob(StopJobRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.stopJob);
    }

    /**
     * 停止作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobRequest 请求对象
     * @return SyncInvoker<StopJobRequest, StopJobResponse>
     */
    public SyncInvoker<StopJobRequest, StopJobResponse> stopJobInvoker(StopJobRequest request) {
        return new SyncInvoker<StopJobRequest, StopJobResponse>(request, DlfMeta.stopJob, hcClient);
    }

    /**
     * 停止作业实例
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobInstanceRequest 请求对象
     * @return StopJobInstanceResponse
     */
    public StopJobInstanceResponse stopJobInstance(StopJobInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.stopJobInstance);
    }

    /**
     * 停止作业实例
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobInstanceRequest 请求对象
     * @return SyncInvoker<StopJobInstanceRequest, StopJobInstanceResponse>
     */
    public SyncInvoker<StopJobInstanceRequest, StopJobInstanceResponse> stopJobInstanceInvoker(
        StopJobInstanceRequest request) {
        return new SyncInvoker<StopJobInstanceRequest, StopJobInstanceResponse>(request, DlfMeta.stopJobInstance,
            hcClient);
    }

    /**
     * 修改连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConnectionRequest 请求对象
     * @return UpdateConnectionResponse
     */
    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.updateConnection);
    }

    /**
     * 修改连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConnectionRequest 请求对象
     * @return SyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse>
     */
    public SyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse> updateConnectionInvoker(
        UpdateConnectionRequest request) {
        return new SyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse>(request, DlfMeta.updateConnection,
            hcClient);
    }

    /**
     * 修改作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobRequest 请求对象
     * @return UpdateJobResponse
     */
    public UpdateJobResponse updateJob(UpdateJobRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.updateJob);
    }

    /**
     * 修改作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobRequest 请求对象
     * @return SyncInvoker<UpdateJobRequest, UpdateJobResponse>
     */
    public SyncInvoker<UpdateJobRequest, UpdateJobResponse> updateJobInvoker(UpdateJobRequest request) {
        return new SyncInvoker<UpdateJobRequest, UpdateJobResponse>(request, DlfMeta.updateJob, hcClient);
    }

    /**
     * 修改资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResourceRequest 请求对象
     * @return UpdateResourceResponse
     */
    public UpdateResourceResponse updateResource(UpdateResourceRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.updateResource);
    }

    /**
     * 修改资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResourceRequest 请求对象
     * @return SyncInvoker<UpdateResourceRequest, UpdateResourceResponse>
     */
    public SyncInvoker<UpdateResourceRequest, UpdateResourceResponse> updateResourceInvoker(
        UpdateResourceRequest request) {
        return new SyncInvoker<UpdateResourceRequest, UpdateResourceResponse>(request, DlfMeta.updateResource,
            hcClient);
    }

    /**
     * 修改脚本内容
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateScriptRequest 请求对象
     * @return UpdateScriptResponse
     */
    public UpdateScriptResponse updateScript(UpdateScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DlfMeta.updateScript);
    }

    /**
     * 修改脚本内容
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateScriptRequest 请求对象
     * @return SyncInvoker<UpdateScriptRequest, UpdateScriptResponse>
     */
    public SyncInvoker<UpdateScriptRequest, UpdateScriptResponse> updateScriptInvoker(UpdateScriptRequest request) {
        return new SyncInvoker<UpdateScriptRequest, UpdateScriptResponse>(request, DlfMeta.updateScript, hcClient);
    }

}
