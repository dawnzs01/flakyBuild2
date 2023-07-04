package com.huaweicloud.sdk.css.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.css.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class CssAsyncClient {

    protected HcClient hcClient;

    public CssAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CssAsyncClient> newBuilder() {
        return new ClientBuilder<>(CssAsyncClient::new);
    }

    /**
     * 添加独立master、client
     *
     * 由于集群数据面业务的增长或者不确定性，很难在一开始就能够把集群的规模形态想明白，该接口能够在非独立master和client的集群上面独立master、client角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddIndependentNodeRequest 请求对象
     * @return CompletableFuture<AddIndependentNodeResponse>
     */
    public CompletableFuture<AddIndependentNodeResponse> addIndependentNodeAsync(AddIndependentNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.addIndependentNode);
    }

    /**
     * 添加独立master、client
     *
     * 由于集群数据面业务的增长或者不确定性，很难在一开始就能够把集群的规模形态想明白，该接口能够在非独立master和client的集群上面独立master、client角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddIndependentNodeRequest 请求对象
     * @return AsyncInvoker<AddIndependentNodeRequest, AddIndependentNodeResponse>
     */
    public AsyncInvoker<AddIndependentNodeRequest, AddIndependentNodeResponse> addIndependentNodeAsyncInvoker(
        AddIndependentNodeRequest request) {
        return new AsyncInvoker<AddIndependentNodeRequest, AddIndependentNodeResponse>(request,
            CssMeta.addIndependentNode, hcClient);
    }

    /**
     * 安全模式修改
     *
     * 该接口用于切换集群的安全模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeModeRequest 请求对象
     * @return CompletableFuture<ChangeModeResponse>
     */
    public CompletableFuture<ChangeModeResponse> changeModeAsync(ChangeModeRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.changeMode);
    }

    /**
     * 安全模式修改
     *
     * 该接口用于切换集群的安全模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeModeRequest 请求对象
     * @return AsyncInvoker<ChangeModeRequest, ChangeModeResponse>
     */
    public AsyncInvoker<ChangeModeRequest, ChangeModeResponse> changeModeAsyncInvoker(ChangeModeRequest request) {
        return new AsyncInvoker<ChangeModeRequest, ChangeModeResponse>(request, CssMeta.changeMode, hcClient);
    }

    /**
     * 切换安全组
     *
     * 该接口可以在集群创建成功后，修改安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeSecurityGroupRequest 请求对象
     * @return CompletableFuture<ChangeSecurityGroupResponse>
     */
    public CompletableFuture<ChangeSecurityGroupResponse> changeSecurityGroupAsync(ChangeSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.changeSecurityGroup);
    }

    /**
     * 切换安全组
     *
     * 该接口可以在集群创建成功后，修改安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeSecurityGroupRequest 请求对象
     * @return AsyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse>
     */
    public AsyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> changeSecurityGroupAsyncInvoker(
        ChangeSecurityGroupRequest request) {
        return new AsyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse>(request,
            CssMeta.changeSecurityGroup, hcClient);
    }

    /**
     * 设置自动创建快照策略
     *
     * 该接口用于设置自动创建快照，默认一天创建一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAutoCreatePolicyRequest 请求对象
     * @return CompletableFuture<CreateAutoCreatePolicyResponse>
     */
    public CompletableFuture<CreateAutoCreatePolicyResponse> createAutoCreatePolicyAsync(
        CreateAutoCreatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createAutoCreatePolicy);
    }

    /**
     * 设置自动创建快照策略
     *
     * 该接口用于设置自动创建快照，默认一天创建一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAutoCreatePolicyRequest 请求对象
     * @return AsyncInvoker<CreateAutoCreatePolicyRequest, CreateAutoCreatePolicyResponse>
     */
    public AsyncInvoker<CreateAutoCreatePolicyRequest, CreateAutoCreatePolicyResponse> createAutoCreatePolicyAsyncInvoker(
        CreateAutoCreatePolicyRequest request) {
        return new AsyncInvoker<CreateAutoCreatePolicyRequest, CreateAutoCreatePolicyResponse>(request,
            CssMeta.createAutoCreatePolicy, hcClient);
    }

    /**
     * 开启公网访问
     *
     * 该接口用于开启公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBindPublicRequest 请求对象
     * @return CompletableFuture<CreateBindPublicResponse>
     */
    public CompletableFuture<CreateBindPublicResponse> createBindPublicAsync(CreateBindPublicRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createBindPublic);
    }

    /**
     * 开启公网访问
     *
     * 该接口用于开启公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBindPublicRequest 请求对象
     * @return AsyncInvoker<CreateBindPublicRequest, CreateBindPublicResponse>
     */
    public AsyncInvoker<CreateBindPublicRequest, CreateBindPublicResponse> createBindPublicAsyncInvoker(
        CreateBindPublicRequest request) {
        return new AsyncInvoker<CreateBindPublicRequest, CreateBindPublicResponse>(request, CssMeta.createBindPublic,
            hcClient);
    }

    /**
     * 创建集群
     *
     * 该接口用于创建集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return CompletableFuture<CreateClusterResponse>
     */
    public CompletableFuture<CreateClusterResponse> createClusterAsync(CreateClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createCluster);
    }

    /**
     * 创建集群
     *
     * 该接口用于创建集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return AsyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(
        CreateClusterRequest request) {
        return new AsyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, CssMeta.createCluster, hcClient);
    }

    /**
     * 添加指定集群标签
     *
     * 该接口用于给指定集群添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClustersTagsRequest 请求对象
     * @return CompletableFuture<CreateClustersTagsResponse>
     */
    public CompletableFuture<CreateClustersTagsResponse> createClustersTagsAsync(CreateClustersTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createClustersTags);
    }

    /**
     * 添加指定集群标签
     *
     * 该接口用于给指定集群添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClustersTagsRequest 请求对象
     * @return AsyncInvoker<CreateClustersTagsRequest, CreateClustersTagsResponse>
     */
    public AsyncInvoker<CreateClustersTagsRequest, CreateClustersTagsResponse> createClustersTagsAsyncInvoker(
        CreateClustersTagsRequest request) {
        return new AsyncInvoker<CreateClustersTagsRequest, CreateClustersTagsResponse>(request,
            CssMeta.createClustersTags, hcClient);
    }

    /**
     * 加载自定义词库
     *
     * 该接口用于加载存放于OBS的自定义词库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLoadIkThesaurusRequest 请求对象
     * @return CompletableFuture<CreateLoadIkThesaurusResponse>
     */
    public CompletableFuture<CreateLoadIkThesaurusResponse> createLoadIkThesaurusAsync(
        CreateLoadIkThesaurusRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createLoadIkThesaurus);
    }

    /**
     * 加载自定义词库
     *
     * 该接口用于加载存放于OBS的自定义词库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLoadIkThesaurusRequest 请求对象
     * @return AsyncInvoker<CreateLoadIkThesaurusRequest, CreateLoadIkThesaurusResponse>
     */
    public AsyncInvoker<CreateLoadIkThesaurusRequest, CreateLoadIkThesaurusResponse> createLoadIkThesaurusAsyncInvoker(
        CreateLoadIkThesaurusRequest request) {
        return new AsyncInvoker<CreateLoadIkThesaurusRequest, CreateLoadIkThesaurusResponse>(request,
            CssMeta.createLoadIkThesaurus, hcClient);
    }

    /**
     * 备份日志
     *
     * 该接口用于备份日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLogBackupRequest 请求对象
     * @return CompletableFuture<CreateLogBackupResponse>
     */
    public CompletableFuture<CreateLogBackupResponse> createLogBackupAsync(CreateLogBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createLogBackup);
    }

    /**
     * 备份日志
     *
     * 该接口用于备份日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLogBackupRequest 请求对象
     * @return AsyncInvoker<CreateLogBackupRequest, CreateLogBackupResponse>
     */
    public AsyncInvoker<CreateLogBackupRequest, CreateLogBackupResponse> createLogBackupAsyncInvoker(
        CreateLogBackupRequest request) {
        return new AsyncInvoker<CreateLogBackupRequest, CreateLogBackupResponse>(request, CssMeta.createLogBackup,
            hcClient);
    }

    /**
     * 手动创建快照
     *
     * 该接口用于手动创建一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSnapshotRequest 请求对象
     * @return CompletableFuture<CreateSnapshotResponse>
     */
    public CompletableFuture<CreateSnapshotResponse> createSnapshotAsync(CreateSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createSnapshot);
    }

    /**
     * 手动创建快照
     *
     * 该接口用于手动创建一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSnapshotRequest 请求对象
     * @return AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>
     */
    public AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshotAsyncInvoker(
        CreateSnapshotRequest request) {
        return new AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>(request, CssMeta.createSnapshot,
            hcClient);
    }

    /**
     * 删除集群
     *
     * 此接口用于删除集群。集群删除将释放此集群的所有资源，包括客户数据。如果需要保留客户集群数据，建议在删除集群前先创建快照。
     * 
     * &gt;此接口亦可用于包年/包月集群退订。公安冻结的集群不能删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return CompletableFuture<DeleteClusterResponse>
     */
    public CompletableFuture<DeleteClusterResponse> deleteClusterAsync(DeleteClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.deleteCluster);
    }

    /**
     * 删除集群
     *
     * 此接口用于删除集群。集群删除将释放此集群的所有资源，包括客户数据。如果需要保留客户集群数据，建议在删除集群前先创建快照。
     * 
     * &gt;此接口亦可用于包年/包月集群退订。公安冻结的集群不能删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterAsyncInvoker(
        DeleteClusterRequest request) {
        return new AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, CssMeta.deleteCluster, hcClient);
    }

    /**
     * 删除集群标签
     *
     * 此接口用于删除集群标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClustersTagsRequest 请求对象
     * @return CompletableFuture<DeleteClustersTagsResponse>
     */
    public CompletableFuture<DeleteClustersTagsResponse> deleteClustersTagsAsync(DeleteClustersTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.deleteClustersTags);
    }

    /**
     * 删除集群标签
     *
     * 此接口用于删除集群标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClustersTagsRequest 请求对象
     * @return AsyncInvoker<DeleteClustersTagsRequest, DeleteClustersTagsResponse>
     */
    public AsyncInvoker<DeleteClustersTagsRequest, DeleteClustersTagsResponse> deleteClustersTagsAsyncInvoker(
        DeleteClustersTagsRequest request) {
        return new AsyncInvoker<DeleteClustersTagsRequest, DeleteClustersTagsResponse>(request,
            CssMeta.deleteClustersTags, hcClient);
    }

    /**
     * 删除自定义词库
     *
     * 该接口用于删除自定义词库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIkThesaurusRequest 请求对象
     * @return CompletableFuture<DeleteIkThesaurusResponse>
     */
    public CompletableFuture<DeleteIkThesaurusResponse> deleteIkThesaurusAsync(DeleteIkThesaurusRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.deleteIkThesaurus);
    }

    /**
     * 删除自定义词库
     *
     * 该接口用于删除自定义词库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIkThesaurusRequest 请求对象
     * @return AsyncInvoker<DeleteIkThesaurusRequest, DeleteIkThesaurusResponse>
     */
    public AsyncInvoker<DeleteIkThesaurusRequest, DeleteIkThesaurusResponse> deleteIkThesaurusAsyncInvoker(
        DeleteIkThesaurusRequest request) {
        return new AsyncInvoker<DeleteIkThesaurusRequest, DeleteIkThesaurusResponse>(request, CssMeta.deleteIkThesaurus,
            hcClient);
    }

    /**
     * 删除快照
     *
     * 该接口用于删除快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSnapshotRequest 请求对象
     * @return CompletableFuture<DeleteSnapshotResponse>
     */
    public CompletableFuture<DeleteSnapshotResponse> deleteSnapshotAsync(DeleteSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.deleteSnapshot);
    }

    /**
     * 删除快照
     *
     * 该接口用于删除快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSnapshotRequest 请求对象
     * @return AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>
     */
    public AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshotAsyncInvoker(
        DeleteSnapshotRequest request) {
        return new AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>(request, CssMeta.deleteSnapshot,
            hcClient);
    }

    /**
     * 下载安全证书
     *
     * 该接口用于下载安全证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadCertRequest 请求对象
     * @return CompletableFuture<DownloadCertResponse>
     */
    public CompletableFuture<DownloadCertResponse> downloadCertAsync(DownloadCertRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.downloadCert);
    }

    /**
     * 下载安全证书
     *
     * 该接口用于下载安全证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadCertRequest 请求对象
     * @return AsyncInvoker<DownloadCertRequest, DownloadCertResponse>
     */
    public AsyncInvoker<DownloadCertRequest, DownloadCertResponse> downloadCertAsyncInvoker(
        DownloadCertRequest request) {
        return new AsyncInvoker<DownloadCertRequest, DownloadCertResponse>(request, CssMeta.downloadCert, hcClient);
    }

    /**
     * 查询集群列表
     *
     * 该接口用于查询并显示集群列表以及集群的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersDetailsRequest 请求对象
     * @return CompletableFuture<ListClustersDetailsResponse>
     */
    public CompletableFuture<ListClustersDetailsResponse> listClustersDetailsAsync(ListClustersDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listClustersDetails);
    }

    /**
     * 查询集群列表
     *
     * 该接口用于查询并显示集群列表以及集群的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersDetailsRequest 请求对象
     * @return AsyncInvoker<ListClustersDetailsRequest, ListClustersDetailsResponse>
     */
    public AsyncInvoker<ListClustersDetailsRequest, ListClustersDetailsResponse> listClustersDetailsAsyncInvoker(
        ListClustersDetailsRequest request) {
        return new AsyncInvoker<ListClustersDetailsRequest, ListClustersDetailsResponse>(request,
            CssMeta.listClustersDetails, hcClient);
    }

    /**
     * 查询所有标签
     *
     * 该接口用于查询指定region下的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersTagsRequest 请求对象
     * @return CompletableFuture<ListClustersTagsResponse>
     */
    public CompletableFuture<ListClustersTagsResponse> listClustersTagsAsync(ListClustersTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listClustersTags);
    }

    /**
     * 查询所有标签
     *
     * 该接口用于查询指定region下的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersTagsRequest 请求对象
     * @return AsyncInvoker<ListClustersTagsRequest, ListClustersTagsResponse>
     */
    public AsyncInvoker<ListClustersTagsRequest, ListClustersTagsResponse> listClustersTagsAsyncInvoker(
        ListClustersTagsRequest request) {
        return new AsyncInvoker<ListClustersTagsRequest, ListClustersTagsResponse>(request, CssMeta.listClustersTags,
            hcClient);
    }

    /**
     * 获取实例规格列表
     *
     * 该接口用于查询并显示支持的实例规格对应的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listFlavors);
    }

    /**
     * 获取实例规格列表
     *
     * 该接口用于查询并显示支持的实例规格对应的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, CssMeta.listFlavors, hcClient);
    }

    /**
     * 查询作业列表
     *
     * 该接口用于查询具体某个集群的日志任务记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLogsJobRequest 请求对象
     * @return CompletableFuture<ListLogsJobResponse>
     */
    public CompletableFuture<ListLogsJobResponse> listLogsJobAsync(ListLogsJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listLogsJob);
    }

    /**
     * 查询作业列表
     *
     * 该接口用于查询具体某个集群的日志任务记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLogsJobRequest 请求对象
     * @return AsyncInvoker<ListLogsJobRequest, ListLogsJobResponse>
     */
    public AsyncInvoker<ListLogsJobRequest, ListLogsJobResponse> listLogsJobAsyncInvoker(ListLogsJobRequest request) {
        return new AsyncInvoker<ListLogsJobRequest, ListLogsJobResponse>(request, CssMeta.listLogsJob, hcClient);
    }

    /**
     * 查询快照列表
     *
     * 该接口用于查询集群的所有快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSnapshotsRequest 请求对象
     * @return CompletableFuture<ListSnapshotsResponse>
     */
    public CompletableFuture<ListSnapshotsResponse> listSnapshotsAsync(ListSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listSnapshots);
    }

    /**
     * 查询快照列表
     *
     * 该接口用于查询集群的所有快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSnapshotsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>
     */
    public AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsAsyncInvoker(
        ListSnapshotsRequest request) {
        return new AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>(request, CssMeta.listSnapshots, hcClient);
    }

    /**
     * 获取参数配置列表
     *
     * 该接口用于获取当前集群现有的参数配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListYmlsRequest 请求对象
     * @return CompletableFuture<ListYmlsResponse>
     */
    public CompletableFuture<ListYmlsResponse> listYmlsAsync(ListYmlsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listYmls);
    }

    /**
     * 获取参数配置列表
     *
     * 该接口用于获取当前集群现有的参数配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListYmlsRequest 请求对象
     * @return AsyncInvoker<ListYmlsRequest, ListYmlsResponse>
     */
    public AsyncInvoker<ListYmlsRequest, ListYmlsResponse> listYmlsAsyncInvoker(ListYmlsRequest request) {
        return new AsyncInvoker<ListYmlsRequest, ListYmlsResponse>(request, CssMeta.listYmls, hcClient);
    }

    /**
     * 获取参数配置任务列表
     *
     * 该接口可获取参数配置的任务操作列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListYmlsJobRequest 请求对象
     * @return CompletableFuture<ListYmlsJobResponse>
     */
    public CompletableFuture<ListYmlsJobResponse> listYmlsJobAsync(ListYmlsJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listYmlsJob);
    }

    /**
     * 获取参数配置任务列表
     *
     * 该接口可获取参数配置的任务操作列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListYmlsJobRequest 请求对象
     * @return AsyncInvoker<ListYmlsJobRequest, ListYmlsJobResponse>
     */
    public AsyncInvoker<ListYmlsJobRequest, ListYmlsJobResponse> listYmlsJobAsyncInvoker(ListYmlsJobRequest request) {
        return new AsyncInvoker<ListYmlsJobRequest, ListYmlsJobResponse>(request, CssMeta.listYmlsJob, hcClient);
    }

    /**
     * 修改密码
     *
     * 该接口用于修改集群密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse>
     */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.resetPassword);
    }

    /**
     * 修改密码
     *
     * 该接口用于修改集群密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(
        ResetPasswordRequest request) {
        return new AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, CssMeta.resetPassword, hcClient);
    }

    /**
     * 重启集群
     *
     * 此接口用于重启集群，重启集群将导致业务中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartClusterRequest 请求对象
     * @return CompletableFuture<RestartClusterResponse>
     */
    public CompletableFuture<RestartClusterResponse> restartClusterAsync(RestartClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.restartCluster);
    }

    /**
     * 重启集群
     *
     * 此接口用于重启集群，重启集群将导致业务中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartClusterRequest 请求对象
     * @return AsyncInvoker<RestartClusterRequest, RestartClusterResponse>
     */
    public AsyncInvoker<RestartClusterRequest, RestartClusterResponse> restartClusterAsyncInvoker(
        RestartClusterRequest request) {
        return new AsyncInvoker<RestartClusterRequest, RestartClusterResponse>(request, CssMeta.restartCluster,
            hcClient);
    }

    /**
     * 恢复快照
     *
     * 该接口用于手动恢复一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreSnapshotRequest 请求对象
     * @return CompletableFuture<RestoreSnapshotResponse>
     */
    public CompletableFuture<RestoreSnapshotResponse> restoreSnapshotAsync(RestoreSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.restoreSnapshot);
    }

    /**
     * 恢复快照
     *
     * 该接口用于手动恢复一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreSnapshotRequest 请求对象
     * @return AsyncInvoker<RestoreSnapshotRequest, RestoreSnapshotResponse>
     */
    public AsyncInvoker<RestoreSnapshotRequest, RestoreSnapshotResponse> restoreSnapshotAsyncInvoker(
        RestoreSnapshotRequest request) {
        return new AsyncInvoker<RestoreSnapshotRequest, RestoreSnapshotResponse>(request, CssMeta.restoreSnapshot,
            hcClient);
    }

    /**
     * 查询自动创建快照的策略
     *
     * 该接口用于查询自动创建快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAutoCreatePolicyRequest 请求对象
     * @return CompletableFuture<ShowAutoCreatePolicyResponse>
     */
    public CompletableFuture<ShowAutoCreatePolicyResponse> showAutoCreatePolicyAsync(
        ShowAutoCreatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.showAutoCreatePolicy);
    }

    /**
     * 查询自动创建快照的策略
     *
     * 该接口用于查询自动创建快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAutoCreatePolicyRequest 请求对象
     * @return AsyncInvoker<ShowAutoCreatePolicyRequest, ShowAutoCreatePolicyResponse>
     */
    public AsyncInvoker<ShowAutoCreatePolicyRequest, ShowAutoCreatePolicyResponse> showAutoCreatePolicyAsyncInvoker(
        ShowAutoCreatePolicyRequest request) {
        return new AsyncInvoker<ShowAutoCreatePolicyRequest, ShowAutoCreatePolicyResponse>(request,
            CssMeta.showAutoCreatePolicy, hcClient);
    }

    /**
     * 查询集群详情
     *
     * 该接口用于查询并显示单个集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterDetailRequest 请求对象
     * @return CompletableFuture<ShowClusterDetailResponse>
     */
    public CompletableFuture<ShowClusterDetailResponse> showClusterDetailAsync(ShowClusterDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.showClusterDetail);
    }

    /**
     * 查询集群详情
     *
     * 该接口用于查询并显示单个集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterDetailRequest 请求对象
     * @return AsyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse>
     */
    public AsyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse> showClusterDetailAsyncInvoker(
        ShowClusterDetailRequest request) {
        return new AsyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse>(request, CssMeta.showClusterDetail,
            hcClient);
    }

    /**
     * 查询指定集群的标签
     *
     * 该接口用于查询指定集群的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterTagRequest 请求对象
     * @return CompletableFuture<ShowClusterTagResponse>
     */
    public CompletableFuture<ShowClusterTagResponse> showClusterTagAsync(ShowClusterTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.showClusterTag);
    }

    /**
     * 查询指定集群的标签
     *
     * 该接口用于查询指定集群的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterTagRequest 请求对象
     * @return AsyncInvoker<ShowClusterTagRequest, ShowClusterTagResponse>
     */
    public AsyncInvoker<ShowClusterTagRequest, ShowClusterTagResponse> showClusterTagAsyncInvoker(
        ShowClusterTagRequest request) {
        return new AsyncInvoker<ShowClusterTagRequest, ShowClusterTagResponse>(request, CssMeta.showClusterTag,
            hcClient);
    }

    /**
     * 查询日志基础配置
     *
     * 该接口用于日志基础配置查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGetLogSettingRequest 请求对象
     * @return CompletableFuture<ShowGetLogSettingResponse>
     */
    public CompletableFuture<ShowGetLogSettingResponse> showGetLogSettingAsync(ShowGetLogSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.showGetLogSetting);
    }

    /**
     * 查询日志基础配置
     *
     * 该接口用于日志基础配置查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGetLogSettingRequest 请求对象
     * @return AsyncInvoker<ShowGetLogSettingRequest, ShowGetLogSettingResponse>
     */
    public AsyncInvoker<ShowGetLogSettingRequest, ShowGetLogSettingResponse> showGetLogSettingAsyncInvoker(
        ShowGetLogSettingRequest request) {
        return new AsyncInvoker<ShowGetLogSettingRequest, ShowGetLogSettingResponse>(request, CssMeta.showGetLogSetting,
            hcClient);
    }

    /**
     * 查询自定义词库状态
     *
     * 该接口用于查询自定义词库的加载状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIkThesaurusRequest 请求对象
     * @return CompletableFuture<ShowIkThesaurusResponse>
     */
    public CompletableFuture<ShowIkThesaurusResponse> showIkThesaurusAsync(ShowIkThesaurusRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.showIkThesaurus);
    }

    /**
     * 查询自定义词库状态
     *
     * 该接口用于查询自定义词库的加载状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIkThesaurusRequest 请求对象
     * @return AsyncInvoker<ShowIkThesaurusRequest, ShowIkThesaurusResponse>
     */
    public AsyncInvoker<ShowIkThesaurusRequest, ShowIkThesaurusResponse> showIkThesaurusAsyncInvoker(
        ShowIkThesaurusRequest request) {
        return new AsyncInvoker<ShowIkThesaurusRequest, ShowIkThesaurusResponse>(request, CssMeta.showIkThesaurus,
            hcClient);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLogBackupRequest 请求对象
     * @return CompletableFuture<ShowLogBackupResponse>
     */
    public CompletableFuture<ShowLogBackupResponse> showLogBackupAsync(ShowLogBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.showLogBackup);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLogBackupRequest 请求对象
     * @return AsyncInvoker<ShowLogBackupRequest, ShowLogBackupResponse>
     */
    public AsyncInvoker<ShowLogBackupRequest, ShowLogBackupResponse> showLogBackupAsyncInvoker(
        ShowLogBackupRequest request) {
        return new AsyncInvoker<ShowLogBackupRequest, ShowLogBackupResponse>(request, CssMeta.showLogBackup, hcClient);
    }

    /**
     * 获取终端节点连接
     *
     * 该接口用于获取终端节点连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcepConnectionRequest 请求对象
     * @return CompletableFuture<ShowVpcepConnectionResponse>
     */
    public CompletableFuture<ShowVpcepConnectionResponse> showVpcepConnectionAsync(ShowVpcepConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.showVpcepConnection);
    }

    /**
     * 获取终端节点连接
     *
     * 该接口用于获取终端节点连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcepConnectionRequest 请求对象
     * @return AsyncInvoker<ShowVpcepConnectionRequest, ShowVpcepConnectionResponse>
     */
    public AsyncInvoker<ShowVpcepConnectionRequest, ShowVpcepConnectionResponse> showVpcepConnectionAsyncInvoker(
        ShowVpcepConnectionRequest request) {
        return new AsyncInvoker<ShowVpcepConnectionRequest, ShowVpcepConnectionResponse>(request,
            CssMeta.showVpcepConnection, hcClient);
    }

    /**
     * 自动设置集群快照的基础配置（不推荐使用）
     *
     * 该接口用于自动设置集群快照的基础配置，包括配置OBS桶和IAM委托。
     * 
     * 
     * - “OBS桶”：快照存储的OBS桶位置。
     * 
     * - “备份路径”：快照在OBS桶中的存放路径。
     * 
     * - “IAM委托”：由于需要将快照保存在OBS中，所以需要在IAM中设置对应的委托获取对OBS服务的授权。
     * 
     * &gt;自动设置集群快照接口将会自动创建快照OBS桶和委托。如果有多个集群，每个集群使用这个接口都会创建一个不一样的OBS桶，可能会导致OBS的配额不够，较多的OBS桶也难以维护。建议可以直接使用[修改集群快照的基础配置](UpdateSnapshotSetting.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartAutoSettingRequest 请求对象
     * @return CompletableFuture<StartAutoSettingResponse>
     */
    public CompletableFuture<StartAutoSettingResponse> startAutoSettingAsync(StartAutoSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startAutoSetting);
    }

    /**
     * 自动设置集群快照的基础配置（不推荐使用）
     *
     * 该接口用于自动设置集群快照的基础配置，包括配置OBS桶和IAM委托。
     * 
     * 
     * - “OBS桶”：快照存储的OBS桶位置。
     * 
     * - “备份路径”：快照在OBS桶中的存放路径。
     * 
     * - “IAM委托”：由于需要将快照保存在OBS中，所以需要在IAM中设置对应的委托获取对OBS服务的授权。
     * 
     * &gt;自动设置集群快照接口将会自动创建快照OBS桶和委托。如果有多个集群，每个集群使用这个接口都会创建一个不一样的OBS桶，可能会导致OBS的配额不够，较多的OBS桶也难以维护。建议可以直接使用[修改集群快照的基础配置](UpdateSnapshotSetting.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartAutoSettingRequest 请求对象
     * @return AsyncInvoker<StartAutoSettingRequest, StartAutoSettingResponse>
     */
    public AsyncInvoker<StartAutoSettingRequest, StartAutoSettingResponse> startAutoSettingAsyncInvoker(
        StartAutoSettingRequest request) {
        return new AsyncInvoker<StartAutoSettingRequest, StartAutoSettingResponse>(request, CssMeta.startAutoSetting,
            hcClient);
    }

    /**
     * 开启日志自动备份策略
     *
     * 该接口用于日志自动备份策略开启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartLogAutoBackupPolicyRequest 请求对象
     * @return CompletableFuture<StartLogAutoBackupPolicyResponse>
     */
    public CompletableFuture<StartLogAutoBackupPolicyResponse> startLogAutoBackupPolicyAsync(
        StartLogAutoBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startLogAutoBackupPolicy);
    }

    /**
     * 开启日志自动备份策略
     *
     * 该接口用于日志自动备份策略开启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartLogAutoBackupPolicyRequest 请求对象
     * @return AsyncInvoker<StartLogAutoBackupPolicyRequest, StartLogAutoBackupPolicyResponse>
     */
    public AsyncInvoker<StartLogAutoBackupPolicyRequest, StartLogAutoBackupPolicyResponse> startLogAutoBackupPolicyAsyncInvoker(
        StartLogAutoBackupPolicyRequest request) {
        return new AsyncInvoker<StartLogAutoBackupPolicyRequest, StartLogAutoBackupPolicyResponse>(request,
            CssMeta.startLogAutoBackupPolicy, hcClient);
    }

    /**
     * 开启日志功能
     *
     * 该接口用于开启日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartLogsRequest 请求对象
     * @return CompletableFuture<StartLogsResponse>
     */
    public CompletableFuture<StartLogsResponse> startLogsAsync(StartLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startLogs);
    }

    /**
     * 开启日志功能
     *
     * 该接口用于开启日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartLogsRequest 请求对象
     * @return AsyncInvoker<StartLogsRequest, StartLogsResponse>
     */
    public AsyncInvoker<StartLogsRequest, StartLogsResponse> startLogsAsyncInvoker(StartLogsRequest request) {
        return new AsyncInvoker<StartLogsRequest, StartLogsResponse>(request, CssMeta.startLogs, hcClient);
    }

    /**
     * 开启公网访问控制白名单
     *
     * 该接口用于开启公网访问控制白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartPublicWhitelistRequest 请求对象
     * @return CompletableFuture<StartPublicWhitelistResponse>
     */
    public CompletableFuture<StartPublicWhitelistResponse> startPublicWhitelistAsync(
        StartPublicWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startPublicWhitelist);
    }

    /**
     * 开启公网访问控制白名单
     *
     * 该接口用于开启公网访问控制白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartPublicWhitelistRequest 请求对象
     * @return AsyncInvoker<StartPublicWhitelistRequest, StartPublicWhitelistResponse>
     */
    public AsyncInvoker<StartPublicWhitelistRequest, StartPublicWhitelistResponse> startPublicWhitelistAsyncInvoker(
        StartPublicWhitelistRequest request) {
        return new AsyncInvoker<StartPublicWhitelistRequest, StartPublicWhitelistResponse>(request,
            CssMeta.startPublicWhitelist, hcClient);
    }

    /**
     * 开启终端节点服务
     *
     * 该接口用于开启终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartVpecpRequest 请求对象
     * @return CompletableFuture<StartVpecpResponse>
     */
    public CompletableFuture<StartVpecpResponse> startVpecpAsync(StartVpecpRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startVpecp);
    }

    /**
     * 开启终端节点服务
     *
     * 该接口用于开启终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartVpecpRequest 请求对象
     * @return AsyncInvoker<StartVpecpRequest, StartVpecpResponse>
     */
    public AsyncInvoker<StartVpecpRequest, StartVpecpResponse> startVpecpAsyncInvoker(StartVpecpRequest request) {
        return new AsyncInvoker<StartVpecpRequest, StartVpecpResponse>(request, CssMeta.startVpecp, hcClient);
    }

    /**
     * 关闭日志自动备份策略
     *
     * 该接口用于日志自动备份策略关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopLogAutoBackupPolicyRequest 请求对象
     * @return CompletableFuture<StopLogAutoBackupPolicyResponse>
     */
    public CompletableFuture<StopLogAutoBackupPolicyResponse> stopLogAutoBackupPolicyAsync(
        StopLogAutoBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.stopLogAutoBackupPolicy);
    }

    /**
     * 关闭日志自动备份策略
     *
     * 该接口用于日志自动备份策略关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopLogAutoBackupPolicyRequest 请求对象
     * @return AsyncInvoker<StopLogAutoBackupPolicyRequest, StopLogAutoBackupPolicyResponse>
     */
    public AsyncInvoker<StopLogAutoBackupPolicyRequest, StopLogAutoBackupPolicyResponse> stopLogAutoBackupPolicyAsyncInvoker(
        StopLogAutoBackupPolicyRequest request) {
        return new AsyncInvoker<StopLogAutoBackupPolicyRequest, StopLogAutoBackupPolicyResponse>(request,
            CssMeta.stopLogAutoBackupPolicy, hcClient);
    }

    /**
     * 关闭日志功能
     *
     * 该接口用于关闭日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopLogsRequest 请求对象
     * @return CompletableFuture<StopLogsResponse>
     */
    public CompletableFuture<StopLogsResponse> stopLogsAsync(StopLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.stopLogs);
    }

    /**
     * 关闭日志功能
     *
     * 该接口用于关闭日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopLogsRequest 请求对象
     * @return AsyncInvoker<StopLogsRequest, StopLogsResponse>
     */
    public AsyncInvoker<StopLogsRequest, StopLogsResponse> stopLogsAsyncInvoker(StopLogsRequest request) {
        return new AsyncInvoker<StopLogsRequest, StopLogsResponse>(request, CssMeta.stopLogs, hcClient);
    }

    /**
     * 关闭公网访问控制白名单
     *
     * 该接口用于关闭公网访问控制白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopPublicWhitelistRequest 请求对象
     * @return CompletableFuture<StopPublicWhitelistResponse>
     */
    public CompletableFuture<StopPublicWhitelistResponse> stopPublicWhitelistAsync(StopPublicWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.stopPublicWhitelist);
    }

    /**
     * 关闭公网访问控制白名单
     *
     * 该接口用于关闭公网访问控制白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopPublicWhitelistRequest 请求对象
     * @return AsyncInvoker<StopPublicWhitelistRequest, StopPublicWhitelistResponse>
     */
    public AsyncInvoker<StopPublicWhitelistRequest, StopPublicWhitelistResponse> stopPublicWhitelistAsyncInvoker(
        StopPublicWhitelistRequest request) {
        return new AsyncInvoker<StopPublicWhitelistRequest, StopPublicWhitelistResponse>(request,
            CssMeta.stopPublicWhitelist, hcClient);
    }

    /**
     * 停用快照功能
     *
     * 该接口用于停用快照功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopSnapshotRequest 请求对象
     * @return CompletableFuture<StopSnapshotResponse>
     */
    public CompletableFuture<StopSnapshotResponse> stopSnapshotAsync(StopSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.stopSnapshot);
    }

    /**
     * 停用快照功能
     *
     * 该接口用于停用快照功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopSnapshotRequest 请求对象
     * @return AsyncInvoker<StopSnapshotRequest, StopSnapshotResponse>
     */
    public AsyncInvoker<StopSnapshotRequest, StopSnapshotResponse> stopSnapshotAsyncInvoker(
        StopSnapshotRequest request) {
        return new AsyncInvoker<StopSnapshotRequest, StopSnapshotResponse>(request, CssMeta.stopSnapshot, hcClient);
    }

    /**
     * 关闭终端节点服务
     *
     * 该接口用于关闭终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopVpecpRequest 请求对象
     * @return CompletableFuture<StopVpecpResponse>
     */
    public CompletableFuture<StopVpecpResponse> stopVpecpAsync(StopVpecpRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.stopVpecp);
    }

    /**
     * 关闭终端节点服务
     *
     * 该接口用于关闭终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopVpecpRequest 请求对象
     * @return AsyncInvoker<StopVpecpRequest, StopVpecpResponse>
     */
    public AsyncInvoker<StopVpecpRequest, StopVpecpResponse> stopVpecpAsyncInvoker(StopVpecpRequest request) {
        return new AsyncInvoker<StopVpecpRequest, StopVpecpResponse>(request, CssMeta.stopVpecp, hcClient);
    }

    /**
     * 批量添加或删除集群标签
     *
     * 该接口用于对集群批量添加或删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBatchClustersTagsRequest 请求对象
     * @return CompletableFuture<UpdateBatchClustersTagsResponse>
     */
    public CompletableFuture<UpdateBatchClustersTagsResponse> updateBatchClustersTagsAsync(
        UpdateBatchClustersTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateBatchClustersTags);
    }

    /**
     * 批量添加或删除集群标签
     *
     * 该接口用于对集群批量添加或删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBatchClustersTagsRequest 请求对象
     * @return AsyncInvoker<UpdateBatchClustersTagsRequest, UpdateBatchClustersTagsResponse>
     */
    public AsyncInvoker<UpdateBatchClustersTagsRequest, UpdateBatchClustersTagsResponse> updateBatchClustersTagsAsyncInvoker(
        UpdateBatchClustersTagsRequest request) {
        return new AsyncInvoker<UpdateBatchClustersTagsRequest, UpdateBatchClustersTagsResponse>(request,
            CssMeta.updateBatchClustersTags, hcClient);
    }

    /**
     * 修改集群名称
     *
     * 该接口用于修改集群名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterNameRequest 请求对象
     * @return CompletableFuture<UpdateClusterNameResponse>
     */
    public CompletableFuture<UpdateClusterNameResponse> updateClusterNameAsync(UpdateClusterNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateClusterName);
    }

    /**
     * 修改集群名称
     *
     * 该接口用于修改集群名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterNameRequest 请求对象
     * @return AsyncInvoker<UpdateClusterNameRequest, UpdateClusterNameResponse>
     */
    public AsyncInvoker<UpdateClusterNameRequest, UpdateClusterNameResponse> updateClusterNameAsyncInvoker(
        UpdateClusterNameRequest request) {
        return new AsyncInvoker<UpdateClusterNameRequest, UpdateClusterNameResponse>(request, CssMeta.updateClusterName,
            hcClient);
    }

    /**
     * 扩容集群
     *
     * 该接口用于集群扩容实例（仅支持扩容elasticsearch实例）。只扩容普通节点，且只针对要扩容的集群实例不存在特殊节点（Master、Client、冷数据节点）的情况。
     * 
     * 集群扩容实例的数量和存储容量，请参考[扩容实例的数量和存储容量](UpdateExtendInstanceStorage.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateExtendClusterRequest 请求对象
     * @return CompletableFuture<UpdateExtendClusterResponse>
     */
    public CompletableFuture<UpdateExtendClusterResponse> updateExtendClusterAsync(UpdateExtendClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateExtendCluster);
    }

    /**
     * 扩容集群
     *
     * 该接口用于集群扩容实例（仅支持扩容elasticsearch实例）。只扩容普通节点，且只针对要扩容的集群实例不存在特殊节点（Master、Client、冷数据节点）的情况。
     * 
     * 集群扩容实例的数量和存储容量，请参考[扩容实例的数量和存储容量](UpdateExtendInstanceStorage.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateExtendClusterRequest 请求对象
     * @return AsyncInvoker<UpdateExtendClusterRequest, UpdateExtendClusterResponse>
     */
    public AsyncInvoker<UpdateExtendClusterRequest, UpdateExtendClusterResponse> updateExtendClusterAsyncInvoker(
        UpdateExtendClusterRequest request) {
        return new AsyncInvoker<UpdateExtendClusterRequest, UpdateExtendClusterResponse>(request,
            CssMeta.updateExtendCluster, hcClient);
    }

    /**
     * 扩容实例的数量和存储容量
     *
     * 该接口用于集群扩容不同类型实例的个数以及存储容量。已经存在独立Master、Client、冷数据节点的集群使用该接口扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateExtendInstanceStorageRequest 请求对象
     * @return CompletableFuture<UpdateExtendInstanceStorageResponse>
     */
    public CompletableFuture<UpdateExtendInstanceStorageResponse> updateExtendInstanceStorageAsync(
        UpdateExtendInstanceStorageRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateExtendInstanceStorage);
    }

    /**
     * 扩容实例的数量和存储容量
     *
     * 该接口用于集群扩容不同类型实例的个数以及存储容量。已经存在独立Master、Client、冷数据节点的集群使用该接口扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateExtendInstanceStorageRequest 请求对象
     * @return AsyncInvoker<UpdateExtendInstanceStorageRequest, UpdateExtendInstanceStorageResponse>
     */
    public AsyncInvoker<UpdateExtendInstanceStorageRequest, UpdateExtendInstanceStorageResponse> updateExtendInstanceStorageAsyncInvoker(
        UpdateExtendInstanceStorageRequest request) {
        return new AsyncInvoker<UpdateExtendInstanceStorageRequest, UpdateExtendInstanceStorageResponse>(request,
            CssMeta.updateExtendInstanceStorage, hcClient);
    }

    /**
     * 变更规格
     *
     * 该接口用于变更集群规格。只支持变更ess节点类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlavorRequest 请求对象
     * @return CompletableFuture<UpdateFlavorResponse>
     */
    public CompletableFuture<UpdateFlavorResponse> updateFlavorAsync(UpdateFlavorRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateFlavor);
    }

    /**
     * 变更规格
     *
     * 该接口用于变更集群规格。只支持变更ess节点类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlavorRequest 请求对象
     * @return AsyncInvoker<UpdateFlavorRequest, UpdateFlavorResponse>
     */
    public AsyncInvoker<UpdateFlavorRequest, UpdateFlavorResponse> updateFlavorAsyncInvoker(
        UpdateFlavorRequest request) {
        return new AsyncInvoker<UpdateFlavorRequest, UpdateFlavorResponse>(request, CssMeta.updateFlavor, hcClient);
    }

    /**
     * 指定节点类型规格变更
     *
     * 修改集群规格。支持修改:
     * - ess： 数据节点。
     * - ess-cold: 冷数据节点。
     * - ess-client: Client节点。
     * - ess-master: Master节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlavorByTypeRequest 请求对象
     * @return CompletableFuture<UpdateFlavorByTypeResponse>
     */
    public CompletableFuture<UpdateFlavorByTypeResponse> updateFlavorByTypeAsync(UpdateFlavorByTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateFlavorByType);
    }

    /**
     * 指定节点类型规格变更
     *
     * 修改集群规格。支持修改:
     * - ess： 数据节点。
     * - ess-cold: 冷数据节点。
     * - ess-client: Client节点。
     * - ess-master: Master节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlavorByTypeRequest 请求对象
     * @return AsyncInvoker<UpdateFlavorByTypeRequest, UpdateFlavorByTypeResponse>
     */
    public AsyncInvoker<UpdateFlavorByTypeRequest, UpdateFlavorByTypeResponse> updateFlavorByTypeAsyncInvoker(
        UpdateFlavorByTypeRequest request) {
        return new AsyncInvoker<UpdateFlavorByTypeRequest, UpdateFlavorByTypeResponse>(request,
            CssMeta.updateFlavorByType, hcClient);
    }

    /**
     * 节点替换
     *
     * 该接口用于替换失败节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateInstance);
    }

    /**
     * 节点替换
     *
     * 该接口用于替换失败节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(
        UpdateInstanceRequest request) {
        return new AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, CssMeta.updateInstance,
            hcClient);
    }

    /**
     * 修改日志基础配置
     *
     * 该接口用于修改日志基础配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLogSettingRequest 请求对象
     * @return CompletableFuture<UpdateLogSettingResponse>
     */
    public CompletableFuture<UpdateLogSettingResponse> updateLogSettingAsync(UpdateLogSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateLogSetting);
    }

    /**
     * 修改日志基础配置
     *
     * 该接口用于修改日志基础配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLogSettingRequest 请求对象
     * @return AsyncInvoker<UpdateLogSettingRequest, UpdateLogSettingResponse>
     */
    public AsyncInvoker<UpdateLogSettingRequest, UpdateLogSettingResponse> updateLogSettingAsyncInvoker(
        UpdateLogSettingRequest request) {
        return new AsyncInvoker<UpdateLogSettingRequest, UpdateLogSettingResponse>(request, CssMeta.updateLogSetting,
            hcClient);
    }

    /**
     * 按需集群转包周期
     *
     * 该接口用于按需集群转包周期集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateOndemandClusterToPeriodRequest 请求对象
     * @return CompletableFuture<UpdateOndemandClusterToPeriodResponse>
     */
    public CompletableFuture<UpdateOndemandClusterToPeriodResponse> updateOndemandClusterToPeriodAsync(
        UpdateOndemandClusterToPeriodRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateOndemandClusterToPeriod);
    }

    /**
     * 按需集群转包周期
     *
     * 该接口用于按需集群转包周期集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateOndemandClusterToPeriodRequest 请求对象
     * @return AsyncInvoker<UpdateOndemandClusterToPeriodRequest, UpdateOndemandClusterToPeriodResponse>
     */
    public AsyncInvoker<UpdateOndemandClusterToPeriodRequest, UpdateOndemandClusterToPeriodResponse> updateOndemandClusterToPeriodAsyncInvoker(
        UpdateOndemandClusterToPeriodRequest request) {
        return new AsyncInvoker<UpdateOndemandClusterToPeriodRequest, UpdateOndemandClusterToPeriodResponse>(request,
            CssMeta.updateOndemandClusterToPeriod, hcClient);
    }

    /**
     * 修改公网访问带宽
     *
     * 该接口用于修改公网访问带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicBandWidthRequest 请求对象
     * @return CompletableFuture<UpdatePublicBandWidthResponse>
     */
    public CompletableFuture<UpdatePublicBandWidthResponse> updatePublicBandWidthAsync(
        UpdatePublicBandWidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updatePublicBandWidth);
    }

    /**
     * 修改公网访问带宽
     *
     * 该接口用于修改公网访问带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicBandWidthRequest 请求对象
     * @return AsyncInvoker<UpdatePublicBandWidthRequest, UpdatePublicBandWidthResponse>
     */
    public AsyncInvoker<UpdatePublicBandWidthRequest, UpdatePublicBandWidthResponse> updatePublicBandWidthAsyncInvoker(
        UpdatePublicBandWidthRequest request) {
        return new AsyncInvoker<UpdatePublicBandWidthRequest, UpdatePublicBandWidthResponse>(request,
            CssMeta.updatePublicBandWidth, hcClient);
    }

    /**
     * 指定节点类型缩容
     *
     * 该接口用于集群对不同类型实例的个数以及存储容量进行缩容。包周期类型的集群不支持通过api进行指定节点类型缩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateShrinkClusterRequest 请求对象
     * @return CompletableFuture<UpdateShrinkClusterResponse>
     */
    public CompletableFuture<UpdateShrinkClusterResponse> updateShrinkClusterAsync(UpdateShrinkClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateShrinkCluster);
    }

    /**
     * 指定节点类型缩容
     *
     * 该接口用于集群对不同类型实例的个数以及存储容量进行缩容。包周期类型的集群不支持通过api进行指定节点类型缩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateShrinkClusterRequest 请求对象
     * @return AsyncInvoker<UpdateShrinkClusterRequest, UpdateShrinkClusterResponse>
     */
    public AsyncInvoker<UpdateShrinkClusterRequest, UpdateShrinkClusterResponse> updateShrinkClusterAsyncInvoker(
        UpdateShrinkClusterRequest request) {
        return new AsyncInvoker<UpdateShrinkClusterRequest, UpdateShrinkClusterResponse>(request,
            CssMeta.updateShrinkCluster, hcClient);
    }

    /**
     * 指定节点缩容
     *
     * 该接口可以对集群现有节点中指定节点进行缩容。包周期类型的集群不支持通过api进行指定节点缩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateShrinkNodesRequest 请求对象
     * @return CompletableFuture<UpdateShrinkNodesResponse>
     */
    public CompletableFuture<UpdateShrinkNodesResponse> updateShrinkNodesAsync(UpdateShrinkNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateShrinkNodes);
    }

    /**
     * 指定节点缩容
     *
     * 该接口可以对集群现有节点中指定节点进行缩容。包周期类型的集群不支持通过api进行指定节点缩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateShrinkNodesRequest 请求对象
     * @return AsyncInvoker<UpdateShrinkNodesRequest, UpdateShrinkNodesResponse>
     */
    public AsyncInvoker<UpdateShrinkNodesRequest, UpdateShrinkNodesResponse> updateShrinkNodesAsyncInvoker(
        UpdateShrinkNodesRequest request) {
        return new AsyncInvoker<UpdateShrinkNodesRequest, UpdateShrinkNodesResponse>(request, CssMeta.updateShrinkNodes,
            hcClient);
    }

    /**
     * 修改集群快照的基础配置
     *
     * 该接口用于修改集群快照的基础配置，可修改OBS桶和IAM委托。
     * 
     * 可以使用该接口开启快照功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSnapshotSettingRequest 请求对象
     * @return CompletableFuture<UpdateSnapshotSettingResponse>
     */
    public CompletableFuture<UpdateSnapshotSettingResponse> updateSnapshotSettingAsync(
        UpdateSnapshotSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateSnapshotSetting);
    }

    /**
     * 修改集群快照的基础配置
     *
     * 该接口用于修改集群快照的基础配置，可修改OBS桶和IAM委托。
     * 
     * 可以使用该接口开启快照功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSnapshotSettingRequest 请求对象
     * @return AsyncInvoker<UpdateSnapshotSettingRequest, UpdateSnapshotSettingResponse>
     */
    public AsyncInvoker<UpdateSnapshotSettingRequest, UpdateSnapshotSettingResponse> updateSnapshotSettingAsyncInvoker(
        UpdateSnapshotSettingRequest request) {
        return new AsyncInvoker<UpdateSnapshotSettingRequest, UpdateSnapshotSettingResponse>(request,
            CssMeta.updateSnapshotSetting, hcClient);
    }

    /**
     * 关闭公网访问
     *
     * 该接口用于关闭公网访问。包周期类型的集群不支持通过api进行关闭公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUnbindPublicRequest 请求对象
     * @return CompletableFuture<UpdateUnbindPublicResponse>
     */
    public CompletableFuture<UpdateUnbindPublicResponse> updateUnbindPublicAsync(UpdateUnbindPublicRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateUnbindPublic);
    }

    /**
     * 关闭公网访问
     *
     * 该接口用于关闭公网访问。包周期类型的集群不支持通过api进行关闭公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUnbindPublicRequest 请求对象
     * @return AsyncInvoker<UpdateUnbindPublicRequest, UpdateUnbindPublicResponse>
     */
    public AsyncInvoker<UpdateUnbindPublicRequest, UpdateUnbindPublicResponse> updateUnbindPublicAsyncInvoker(
        UpdateUnbindPublicRequest request) {
        return new AsyncInvoker<UpdateUnbindPublicRequest, UpdateUnbindPublicResponse>(request,
            CssMeta.updateUnbindPublic, hcClient);
    }

    /**
     * 更新终端节点连接
     *
     * 该接口用于更新终端节点连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcepConnectionRequest 请求对象
     * @return CompletableFuture<UpdateVpcepConnectionResponse>
     */
    public CompletableFuture<UpdateVpcepConnectionResponse> updateVpcepConnectionAsync(
        UpdateVpcepConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateVpcepConnection);
    }

    /**
     * 更新终端节点连接
     *
     * 该接口用于更新终端节点连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcepConnectionRequest 请求对象
     * @return AsyncInvoker<UpdateVpcepConnectionRequest, UpdateVpcepConnectionResponse>
     */
    public AsyncInvoker<UpdateVpcepConnectionRequest, UpdateVpcepConnectionResponse> updateVpcepConnectionAsyncInvoker(
        UpdateVpcepConnectionRequest request) {
        return new AsyncInvoker<UpdateVpcepConnectionRequest, UpdateVpcepConnectionResponse>(request,
            CssMeta.updateVpcepConnection, hcClient);
    }

    /**
     * 修改终端节点服务白名单
     *
     * 该接口用于修改终端节点服务白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcepWhitelistRequest 请求对象
     * @return CompletableFuture<UpdateVpcepWhitelistResponse>
     */
    public CompletableFuture<UpdateVpcepWhitelistResponse> updateVpcepWhitelistAsync(
        UpdateVpcepWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateVpcepWhitelist);
    }

    /**
     * 修改终端节点服务白名单
     *
     * 该接口用于修改终端节点服务白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcepWhitelistRequest 请求对象
     * @return AsyncInvoker<UpdateVpcepWhitelistRequest, UpdateVpcepWhitelistResponse>
     */
    public AsyncInvoker<UpdateVpcepWhitelistRequest, UpdateVpcepWhitelistResponse> updateVpcepWhitelistAsyncInvoker(
        UpdateVpcepWhitelistRequest request) {
        return new AsyncInvoker<UpdateVpcepWhitelistRequest, UpdateVpcepWhitelistResponse>(request,
            CssMeta.updateVpcepWhitelist, hcClient);
    }

    /**
     * 修改参数配置
     *
     * 该接口用于修改参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateYmlsRequest 请求对象
     * @return CompletableFuture<UpdateYmlsResponse>
     */
    public CompletableFuture<UpdateYmlsResponse> updateYmlsAsync(UpdateYmlsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateYmls);
    }

    /**
     * 修改参数配置
     *
     * 该接口用于修改参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateYmlsRequest 请求对象
     * @return AsyncInvoker<UpdateYmlsRequest, UpdateYmlsResponse>
     */
    public AsyncInvoker<UpdateYmlsRequest, UpdateYmlsResponse> updateYmlsAsyncInvoker(UpdateYmlsRequest request) {
        return new AsyncInvoker<UpdateYmlsRequest, UpdateYmlsResponse>(request, CssMeta.updateYmls, hcClient);
    }

    /**
     * 开启Kibana公网访问
     *
     * 该接口用于开启Kibana公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartKibanaPublicRequest 请求对象
     * @return CompletableFuture<StartKibanaPublicResponse>
     */
    public CompletableFuture<StartKibanaPublicResponse> startKibanaPublicAsync(StartKibanaPublicRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startKibanaPublic);
    }

    /**
     * 开启Kibana公网访问
     *
     * 该接口用于开启Kibana公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartKibanaPublicRequest 请求对象
     * @return AsyncInvoker<StartKibanaPublicRequest, StartKibanaPublicResponse>
     */
    public AsyncInvoker<StartKibanaPublicRequest, StartKibanaPublicResponse> startKibanaPublicAsyncInvoker(
        StartKibanaPublicRequest request) {
        return new AsyncInvoker<StartKibanaPublicRequest, StartKibanaPublicResponse>(request, CssMeta.startKibanaPublic,
            hcClient);
    }

    /**
     * 关闭Kibana公网访问控制
     *
     * 该接口用于关闭Kibana公网访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopPublicKibanaWhitelistRequest 请求对象
     * @return CompletableFuture<StopPublicKibanaWhitelistResponse>
     */
    public CompletableFuture<StopPublicKibanaWhitelistResponse> stopPublicKibanaWhitelistAsync(
        StopPublicKibanaWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.stopPublicKibanaWhitelist);
    }

    /**
     * 关闭Kibana公网访问控制
     *
     * 该接口用于关闭Kibana公网访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopPublicKibanaWhitelistRequest 请求对象
     * @return AsyncInvoker<StopPublicKibanaWhitelistRequest, StopPublicKibanaWhitelistResponse>
     */
    public AsyncInvoker<StopPublicKibanaWhitelistRequest, StopPublicKibanaWhitelistResponse> stopPublicKibanaWhitelistAsyncInvoker(
        StopPublicKibanaWhitelistRequest request) {
        return new AsyncInvoker<StopPublicKibanaWhitelistRequest, StopPublicKibanaWhitelistResponse>(request,
            CssMeta.stopPublicKibanaWhitelist, hcClient);
    }

    /**
     * 修改Kibana公网带宽
     *
     * 该接口用于修改Kibana公网带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlterKibanaRequest 请求对象
     * @return CompletableFuture<UpdateAlterKibanaResponse>
     */
    public CompletableFuture<UpdateAlterKibanaResponse> updateAlterKibanaAsync(UpdateAlterKibanaRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateAlterKibana);
    }

    /**
     * 修改Kibana公网带宽
     *
     * 该接口用于修改Kibana公网带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlterKibanaRequest 请求对象
     * @return AsyncInvoker<UpdateAlterKibanaRequest, UpdateAlterKibanaResponse>
     */
    public AsyncInvoker<UpdateAlterKibanaRequest, UpdateAlterKibanaResponse> updateAlterKibanaAsyncInvoker(
        UpdateAlterKibanaRequest request) {
        return new AsyncInvoker<UpdateAlterKibanaRequest, UpdateAlterKibanaResponse>(request, CssMeta.updateAlterKibana,
            hcClient);
    }

    /**
     * 关闭Kibana公网访问
     *
     * 该接口用于关闭Kibana公网访问。包周期类型集群不支持通过api进行关闭Kibana公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCloseKibanaRequest 请求对象
     * @return CompletableFuture<UpdateCloseKibanaResponse>
     */
    public CompletableFuture<UpdateCloseKibanaResponse> updateCloseKibanaAsync(UpdateCloseKibanaRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateCloseKibana);
    }

    /**
     * 关闭Kibana公网访问
     *
     * 该接口用于关闭Kibana公网访问。包周期类型集群不支持通过api进行关闭Kibana公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCloseKibanaRequest 请求对象
     * @return AsyncInvoker<UpdateCloseKibanaRequest, UpdateCloseKibanaResponse>
     */
    public AsyncInvoker<UpdateCloseKibanaRequest, UpdateCloseKibanaResponse> updateCloseKibanaAsyncInvoker(
        UpdateCloseKibanaRequest request) {
        return new AsyncInvoker<UpdateCloseKibanaRequest, UpdateCloseKibanaResponse>(request, CssMeta.updateCloseKibana,
            hcClient);
    }

    /**
     * 修改Kibana公网访问控制
     *
     * 该接口通过修改kibana白名单，修改kibana的访问权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicKibanaWhitelistRequest 请求对象
     * @return CompletableFuture<UpdatePublicKibanaWhitelistResponse>
     */
    public CompletableFuture<UpdatePublicKibanaWhitelistResponse> updatePublicKibanaWhitelistAsync(
        UpdatePublicKibanaWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updatePublicKibanaWhitelist);
    }

    /**
     * 修改Kibana公网访问控制
     *
     * 该接口通过修改kibana白名单，修改kibana的访问权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicKibanaWhitelistRequest 请求对象
     * @return AsyncInvoker<UpdatePublicKibanaWhitelistRequest, UpdatePublicKibanaWhitelistResponse>
     */
    public AsyncInvoker<UpdatePublicKibanaWhitelistRequest, UpdatePublicKibanaWhitelistResponse> updatePublicKibanaWhitelistAsyncInvoker(
        UpdatePublicKibanaWhitelistRequest request) {
        return new AsyncInvoker<UpdatePublicKibanaWhitelistRequest, UpdatePublicKibanaWhitelistResponse>(request,
            CssMeta.updatePublicKibanaWhitelist, hcClient);
    }

    /**
     * 添加到自定义模板
     *
     * 该接口用于添加到自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddFavoriteRequest 请求对象
     * @return CompletableFuture<AddFavoriteResponse>
     */
    public CompletableFuture<AddFavoriteResponse> addFavoriteAsync(AddFavoriteRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.addFavorite);
    }

    /**
     * 添加到自定义模板
     *
     * 该接口用于添加到自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddFavoriteRequest 请求对象
     * @return AsyncInvoker<AddFavoriteRequest, AddFavoriteResponse>
     */
    public AsyncInvoker<AddFavoriteRequest, AddFavoriteResponse> addFavoriteAsyncInvoker(AddFavoriteRequest request) {
        return new AsyncInvoker<AddFavoriteRequest, AddFavoriteResponse>(request, CssMeta.addFavorite, hcClient);
    }

    /**
     * 创建配置文件
     *
     * 该接口用于创建配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCnfRequest 请求对象
     * @return CompletableFuture<CreateCnfResponse>
     */
    public CompletableFuture<CreateCnfResponse> createCnfAsync(CreateCnfRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createCnf);
    }

    /**
     * 创建配置文件
     *
     * 该接口用于创建配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCnfRequest 请求对象
     * @return AsyncInvoker<CreateCnfRequest, CreateCnfResponse>
     */
    public AsyncInvoker<CreateCnfRequest, CreateCnfResponse> createCnfAsyncInvoker(CreateCnfRequest request) {
        return new AsyncInvoker<CreateCnfRequest, CreateCnfResponse>(request, CssMeta.createCnf, hcClient);
    }

    /**
     * 删除配置文件
     *
     * 删除配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfRequest 请求对象
     * @return CompletableFuture<DeleteConfResponse>
     */
    public CompletableFuture<DeleteConfResponse> deleteConfAsync(DeleteConfRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.deleteConf);
    }

    /**
     * 删除配置文件
     *
     * 删除配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfRequest 请求对象
     * @return AsyncInvoker<DeleteConfRequest, DeleteConfResponse>
     */
    public AsyncInvoker<DeleteConfRequest, DeleteConfResponse> deleteConfAsyncInvoker(DeleteConfRequest request) {
        return new AsyncInvoker<DeleteConfRequest, DeleteConfResponse>(request, CssMeta.deleteConf, hcClient);
    }

    /**
     * 删除自定义模板
     *
     * 该接口用于删除自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateRequest 请求对象
     * @return CompletableFuture<DeleteTemplateResponse>
     */
    public CompletableFuture<DeleteTemplateResponse> deleteTemplateAsync(DeleteTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.deleteTemplate);
    }

    /**
     * 删除自定义模板
     *
     * 该接口用于删除自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateAsyncInvoker(
        DeleteTemplateRequest request) {
        return new AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>(request, CssMeta.deleteTemplate,
            hcClient);
    }

    /**
     * 查询操作记录
     *
     * 该接口用于查询操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListActionsRequest 请求对象
     * @return CompletableFuture<ListActionsResponse>
     */
    public CompletableFuture<ListActionsResponse> listActionsAsync(ListActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listActions);
    }

    /**
     * 查询操作记录
     *
     * 该接口用于查询操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListActionsRequest 请求对象
     * @return AsyncInvoker<ListActionsRequest, ListActionsResponse>
     */
    public AsyncInvoker<ListActionsRequest, ListActionsResponse> listActionsAsyncInvoker(ListActionsRequest request) {
        return new AsyncInvoker<ListActionsRequest, ListActionsResponse>(request, CssMeta.listActions, hcClient);
    }

    /**
     * 查询配置文件列表
     *
     * 该接口用于查询配置文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfsRequest 请求对象
     * @return CompletableFuture<ListConfsResponse>
     */
    public CompletableFuture<ListConfsResponse> listConfsAsync(ListConfsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listConfs);
    }

    /**
     * 查询配置文件列表
     *
     * 该接口用于查询配置文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfsRequest 请求对象
     * @return AsyncInvoker<ListConfsRequest, ListConfsResponse>
     */
    public AsyncInvoker<ListConfsRequest, ListConfsResponse> listConfsAsyncInvoker(ListConfsRequest request) {
        return new AsyncInvoker<ListConfsRequest, ListConfsResponse>(request, CssMeta.listConfs, hcClient);
    }

    /**
     * 查询pipeline列表
     *
     * 该接口用于查询pipeline列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelinesRequest 请求对象
     * @return CompletableFuture<ListPipelinesResponse>
     */
    public CompletableFuture<ListPipelinesResponse> listPipelinesAsync(ListPipelinesRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listPipelines);
    }

    /**
     * 查询pipeline列表
     *
     * 该接口用于查询pipeline列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelinesRequest 请求对象
     * @return AsyncInvoker<ListPipelinesRequest, ListPipelinesResponse>
     */
    public AsyncInvoker<ListPipelinesRequest, ListPipelinesResponse> listPipelinesAsyncInvoker(
        ListPipelinesRequest request) {
        return new AsyncInvoker<ListPipelinesRequest, ListPipelinesResponse>(request, CssMeta.listPipelines, hcClient);
    }

    /**
     * 查询模板列表
     *
     * 该接口用于查询模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplatesRequest 请求对象
     * @return CompletableFuture<ListTemplatesResponse>
     */
    public CompletableFuture<ListTemplatesResponse> listTemplatesAsync(ListTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listTemplates);
    }

    /**
     * 查询模板列表
     *
     * 该接口用于查询模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplatesRequest 请求对象
     * @return AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesAsyncInvoker(
        ListTemplatesRequest request) {
        return new AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>(request, CssMeta.listTemplates, hcClient);
    }

    /**
     * 查询配置文件内容
     *
     * 该接口用于查询配置文件内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGetConfDetailRequest 请求对象
     * @return CompletableFuture<ShowGetConfDetailResponse>
     */
    public CompletableFuture<ShowGetConfDetailResponse> showGetConfDetailAsync(ShowGetConfDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.showGetConfDetail);
    }

    /**
     * 查询配置文件内容
     *
     * 该接口用于查询配置文件内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGetConfDetailRequest 请求对象
     * @return AsyncInvoker<ShowGetConfDetailRequest, ShowGetConfDetailResponse>
     */
    public AsyncInvoker<ShowGetConfDetailRequest, ShowGetConfDetailResponse> showGetConfDetailAsyncInvoker(
        ShowGetConfDetailRequest request) {
        return new AsyncInvoker<ShowGetConfDetailRequest, ShowGetConfDetailResponse>(request, CssMeta.showGetConfDetail,
            hcClient);
    }

    /**
     * 连通性测试
     *
     * 该接口用于连通性测试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartConnectivityTestRequest 请求对象
     * @return CompletableFuture<StartConnectivityTestResponse>
     */
    public CompletableFuture<StartConnectivityTestResponse> startConnectivityTestAsync(
        StartConnectivityTestRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startConnectivityTest);
    }

    /**
     * 连通性测试
     *
     * 该接口用于连通性测试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartConnectivityTestRequest 请求对象
     * @return AsyncInvoker<StartConnectivityTestRequest, StartConnectivityTestResponse>
     */
    public AsyncInvoker<StartConnectivityTestRequest, StartConnectivityTestResponse> startConnectivityTestAsyncInvoker(
        StartConnectivityTestRequest request) {
        return new AsyncInvoker<StartConnectivityTestRequest, StartConnectivityTestResponse>(request,
            CssMeta.startConnectivityTest, hcClient);
    }

    /**
     * 启动pipeline迁移数据
     *
     * 该接口用于启动pipeline迁移数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartPipelineRequest 请求对象
     * @return CompletableFuture<StartPipelineResponse>
     */
    public CompletableFuture<StartPipelineResponse> startPipelineAsync(StartPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startPipeline);
    }

    /**
     * 启动pipeline迁移数据
     *
     * 该接口用于启动pipeline迁移数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartPipelineRequest 请求对象
     * @return AsyncInvoker<StartPipelineRequest, StartPipelineResponse>
     */
    public AsyncInvoker<StartPipelineRequest, StartPipelineResponse> startPipelineAsyncInvoker(
        StartPipelineRequest request) {
        return new AsyncInvoker<StartPipelineRequest, StartPipelineResponse>(request, CssMeta.startPipeline, hcClient);
    }

    /**
     * 停止pipeline迁移数据
     *
     * 该接口用于停止pipeline迁移数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopPipelineRequest 请求对象
     * @return CompletableFuture<StopPipelineResponse>
     */
    public CompletableFuture<StopPipelineResponse> stopPipelineAsync(StopPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.stopPipeline);
    }

    /**
     * 停止pipeline迁移数据
     *
     * 该接口用于停止pipeline迁移数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopPipelineRequest 请求对象
     * @return AsyncInvoker<StopPipelineRequest, StopPipelineResponse>
     */
    public AsyncInvoker<StopPipelineRequest, StopPipelineResponse> stopPipelineAsyncInvoker(
        StopPipelineRequest request) {
        return new AsyncInvoker<StopPipelineRequest, StopPipelineResponse>(request, CssMeta.stopPipeline, hcClient);
    }

    /**
     * 更新配置文件
     *
     * 该接口用于更新配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCnfRequest 请求对象
     * @return CompletableFuture<UpdateCnfResponse>
     */
    public CompletableFuture<UpdateCnfResponse> updateCnfAsync(UpdateCnfRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateCnf);
    }

    /**
     * 更新配置文件
     *
     * 该接口用于更新配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCnfRequest 请求对象
     * @return AsyncInvoker<UpdateCnfRequest, UpdateCnfResponse>
     */
    public AsyncInvoker<UpdateCnfRequest, UpdateCnfResponse> updateCnfAsyncInvoker(UpdateCnfRequest request) {
        return new AsyncInvoker<UpdateCnfRequest, UpdateCnfResponse>(request, CssMeta.updateCnf, hcClient);
    }

}
