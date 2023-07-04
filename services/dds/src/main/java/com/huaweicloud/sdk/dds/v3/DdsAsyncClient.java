package com.huaweicloud.sdk.dds.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dds.v3.model.*;

import java.util.concurrent.CompletableFuture;

public class DdsAsyncClient {

    protected HcClient hcClient;

    public DdsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DdsAsyncClient> newBuilder() {
        return new ClientBuilder<>(DdsAsyncClient::new);
    }

    /**
     * 实例新增只读节点
     *
     * DDS副本集实例新增只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddReadonlyNodeRequest 请求对象
     * @return CompletableFuture<AddReadonlyNodeResponse>
     */
    public CompletableFuture<AddReadonlyNodeResponse> addReadonlyNodeAsync(AddReadonlyNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.addReadonlyNode);
    }

    /**
     * 实例新增只读节点
     *
     * DDS副本集实例新增只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddReadonlyNodeRequest 请求对象
     * @return AsyncInvoker<AddReadonlyNodeRequest, AddReadonlyNodeResponse>
     */
    public AsyncInvoker<AddReadonlyNodeRequest, AddReadonlyNodeResponse> addReadonlyNodeAsyncInvoker(
        AddReadonlyNodeRequest request) {
        return new AsyncInvoker<AddReadonlyNodeRequest, AddReadonlyNodeResponse>(request, DdsMeta.addReadonlyNode,
            hcClient);
    }

    /**
     * 扩容集群实例的节点数量
     *
     * 扩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddShardingNodeRequest 请求对象
     * @return CompletableFuture<AddShardingNodeResponse>
     */
    public CompletableFuture<AddShardingNodeResponse> addShardingNodeAsync(AddShardingNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.addShardingNode);
    }

    /**
     * 扩容集群实例的节点数量
     *
     * 扩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddShardingNodeRequest 请求对象
     * @return AsyncInvoker<AddShardingNodeRequest, AddShardingNodeResponse>
     */
    public AsyncInvoker<AddShardingNodeRequest, AddShardingNodeResponse> addShardingNodeAsyncInvoker(
        AddShardingNodeRequest request) {
        return new AsyncInvoker<AddShardingNodeRequest, AddShardingNodeResponse>(request, DdsMeta.addShardingNode,
            hcClient);
    }

    /**
     * 绑定弹性公网IP
     *
     * 为实例下的节点绑定弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachEipRequest 请求对象
     * @return CompletableFuture<AttachEipResponse>
     */
    public CompletableFuture<AttachEipResponse> attachEipAsync(AttachEipRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.attachEip);
    }

    /**
     * 绑定弹性公网IP
     *
     * 为实例下的节点绑定弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachEipRequest 请求对象
     * @return AsyncInvoker<AttachEipRequest, AttachEipResponse>
     */
    public AsyncInvoker<AttachEipRequest, AttachEipResponse> attachEipAsyncInvoker(AttachEipRequest request) {
        return new AsyncInvoker<AttachEipRequest, AttachEipResponse>(request, DdsMeta.attachEip, hcClient);
    }

    /**
     * 修改实例内网地址
     *
     * 修改实例的内网地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachInternalIpRequest 请求对象
     * @return CompletableFuture<AttachInternalIpResponse>
     */
    public CompletableFuture<AttachInternalIpResponse> attachInternalIpAsync(AttachInternalIpRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.attachInternalIp);
    }

    /**
     * 修改实例内网地址
     *
     * 修改实例的内网地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachInternalIpRequest 请求对象
     * @return AsyncInvoker<AttachInternalIpRequest, AttachInternalIpResponse>
     */
    public AsyncInvoker<AttachInternalIpRequest, AttachInternalIpResponse> attachInternalIpAsyncInvoker(
        AttachInternalIpRequest request) {
        return new AsyncInvoker<AttachInternalIpRequest, AttachInternalIpResponse>(request, DdsMeta.attachInternalIp,
            hcClient);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加或删除指定实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchTagActionRequest 请求对象
     * @return CompletableFuture<BatchTagActionResponse>
     */
    public CompletableFuture<BatchTagActionResponse> batchTagActionAsync(BatchTagActionRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.batchTagAction);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加或删除指定实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchTagActionRequest 请求对象
     * @return AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    public AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionAsyncInvoker(
        BatchTagActionRequest request) {
        return new AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse>(request, DdsMeta.batchTagAction,
            hcClient);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑实例下节点已经绑定的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelEipRequest 请求对象
     * @return CompletableFuture<CancelEipResponse>
     */
    public CompletableFuture<CancelEipResponse> cancelEipAsync(CancelEipRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.cancelEip);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑实例下节点已经绑定的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelEipRequest 请求对象
     * @return AsyncInvoker<CancelEipRequest, CancelEipResponse>
     */
    public AsyncInvoker<CancelEipRequest, CancelEipResponse> cancelEipAsyncInvoker(CancelEipRequest request) {
        return new AsyncInvoker<CancelEipRequest, CancelEipResponse>(request, DdsMeta.cancelEip, hcClient);
    }

    /**
     * 设置可维护时间段
     *
     * 修改用户允许启动某项对数据库实例运行有影响的任务的时间范围，例如操作系统升级和数据库软件版本升级的时间窗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeOpsWindowRequest 请求对象
     * @return CompletableFuture<ChangeOpsWindowResponse>
     */
    public CompletableFuture<ChangeOpsWindowResponse> changeOpsWindowAsync(ChangeOpsWindowRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.changeOpsWindow);
    }

    /**
     * 设置可维护时间段
     *
     * 修改用户允许启动某项对数据库实例运行有影响的任务的时间范围，例如操作系统升级和数据库软件版本升级的时间窗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeOpsWindowRequest 请求对象
     * @return AsyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>
     */
    public AsyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse> changeOpsWindowAsyncInvoker(
        ChangeOpsWindowRequest request) {
        return new AsyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>(request, DdsMeta.changeOpsWindow,
            hcClient);
    }

    /**
     * 检查数据库密码
     *
     * 检查数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckPasswordRequest 请求对象
     * @return CompletableFuture<CheckPasswordResponse>
     */
    public CompletableFuture<CheckPasswordResponse> checkPasswordAsync(CheckPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.checkPassword);
    }

    /**
     * 检查数据库密码
     *
     * 检查数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckPasswordRequest 请求对象
     * @return AsyncInvoker<CheckPasswordRequest, CheckPasswordResponse>
     */
    public AsyncInvoker<CheckPasswordRequest, CheckPasswordResponse> checkPasswordAsyncInvoker(
        CheckPasswordRequest request) {
        return new AsyncInvoker<CheckPasswordRequest, CheckPasswordResponse>(request, DdsMeta.checkPassword, hcClient);
    }

    /**
     * 检查弱密码
     *
     * 检查弱密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckWeakPasswordRequest 请求对象
     * @return CompletableFuture<CheckWeakPasswordResponse>
     */
    public CompletableFuture<CheckWeakPasswordResponse> checkWeakPasswordAsync(CheckWeakPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.checkWeakPassword);
    }

    /**
     * 检查弱密码
     *
     * 检查弱密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckWeakPasswordRequest 请求对象
     * @return AsyncInvoker<CheckWeakPasswordRequest, CheckWeakPasswordResponse>
     */
    public AsyncInvoker<CheckWeakPasswordRequest, CheckWeakPasswordResponse> checkWeakPasswordAsyncInvoker(
        CheckWeakPasswordRequest request) {
        return new AsyncInvoker<CheckWeakPasswordRequest, CheckWeakPasswordResponse>(request, DdsMeta.checkWeakPassword,
            hcClient);
    }

    /**
     * 参数模板比较
     *
     * 比较两个参数模板之间的差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CompareConfigurationRequest 请求对象
     * @return CompletableFuture<CompareConfigurationResponse>
     */
    public CompletableFuture<CompareConfigurationResponse> compareConfigurationAsync(
        CompareConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.compareConfiguration);
    }

    /**
     * 参数模板比较
     *
     * 比较两个参数模板之间的差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CompareConfigurationRequest 请求对象
     * @return AsyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse>
     */
    public AsyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse> compareConfigurationAsyncInvoker(
        CompareConfigurationRequest request) {
        return new AsyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse>(request,
            DdsMeta.compareConfiguration, hcClient);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyConfigurationRequest 请求对象
     * @return CompletableFuture<CopyConfigurationResponse>
     */
    public CompletableFuture<CopyConfigurationResponse> copyConfigurationAsync(CopyConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.copyConfiguration);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyConfigurationRequest 请求对象
     * @return AsyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>
     */
    public AsyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse> copyConfigurationAsyncInvoker(
        CopyConfigurationRequest request) {
        return new AsyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>(request, DdsMeta.copyConfiguration,
            hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConfigurationRequest 请求对象
     * @return CompletableFuture<CreateConfigurationResponse>
     */
    public CompletableFuture<CreateConfigurationResponse> createConfigurationAsync(CreateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createConfiguration);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConfigurationRequest 请求对象
     * @return AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>
     */
    public AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> createConfigurationAsyncInvoker(
        CreateConfigurationRequest request) {
        return new AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>(request,
            DdsMeta.createConfiguration, hcClient);
    }

    /**
     * 创建数据库角色
     *
     * 创建数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseRoleRequest 请求对象
     * @return CompletableFuture<CreateDatabaseRoleResponse>
     */
    public CompletableFuture<CreateDatabaseRoleResponse> createDatabaseRoleAsync(CreateDatabaseRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createDatabaseRole);
    }

    /**
     * 创建数据库角色
     *
     * 创建数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseRoleRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse>
     */
    public AsyncInvoker<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse> createDatabaseRoleAsyncInvoker(
        CreateDatabaseRoleRequest request) {
        return new AsyncInvoker<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse>(request,
            DdsMeta.createDatabaseRole, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseUserRequest 请求对象
     * @return CompletableFuture<CreateDatabaseUserResponse>
     */
    public CompletableFuture<CreateDatabaseUserResponse> createDatabaseUserAsync(CreateDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createDatabaseUser);
    }

    /**
     * 创建数据库用户
     *
     * 创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseUserRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseUserRequest, CreateDatabaseUserResponse>
     */
    public AsyncInvoker<CreateDatabaseUserRequest, CreateDatabaseUserResponse> createDatabaseUserAsyncInvoker(
        CreateDatabaseUserRequest request) {
        return new AsyncInvoker<CreateDatabaseUserRequest, CreateDatabaseUserResponse>(request,
            DdsMeta.createDatabaseUser, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建文档数据库实例，包括集群实例、副本集实例、以及单节点实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createInstance);
    }

    /**
     * 创建实例
     *
     * 创建文档数据库实例，包括集群实例、副本集实例、以及单节点实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, DdsMeta.createInstance,
            hcClient);
    }

    /**
     * 创建集群的Shard/Config IP
     *
     * 创建集群的Shard/Config IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIpRequest 请求对象
     * @return CompletableFuture<CreateIpResponse>
     */
    public CompletableFuture<CreateIpResponse> createIpAsync(CreateIpRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createIp);
    }

    /**
     * 创建集群的Shard/Config IP
     *
     * 创建集群的Shard/Config IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIpRequest 请求对象
     * @return AsyncInvoker<CreateIpRequest, CreateIpResponse>
     */
    public AsyncInvoker<CreateIpRequest, CreateIpResponse> createIpAsyncInvoker(CreateIpRequest request) {
        return new AsyncInvoker<CreateIpRequest, CreateIpResponse>(request, DdsMeta.createIp, hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateManualBackupRequest 请求对象
     * @return CompletableFuture<CreateManualBackupResponse>
     */
    public CompletableFuture<CreateManualBackupResponse> createManualBackupAsync(CreateManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createManualBackup);
    }

    /**
     * 创建手动备份
     *
     * 创建数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateManualBackupRequest 请求对象
     * @return AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>
     */
    public AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackupAsyncInvoker(
        CreateManualBackupRequest request) {
        return new AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>(request,
            DdsMeta.createManualBackup, hcClient);
    }

    /**
     * 删除审计日志
     *
     * 删除审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAuditLogRequest 请求对象
     * @return CompletableFuture<DeleteAuditLogResponse>
     */
    public CompletableFuture<DeleteAuditLogResponse> deleteAuditLogAsync(DeleteAuditLogRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteAuditLog);
    }

    /**
     * 删除审计日志
     *
     * 删除审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAuditLogRequest 请求对象
     * @return AsyncInvoker<DeleteAuditLogRequest, DeleteAuditLogResponse>
     */
    public AsyncInvoker<DeleteAuditLogRequest, DeleteAuditLogResponse> deleteAuditLogAsyncInvoker(
        DeleteAuditLogRequest request) {
        return new AsyncInvoker<DeleteAuditLogRequest, DeleteAuditLogResponse>(request, DdsMeta.deleteAuditLog,
            hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return CompletableFuture<DeleteConfigurationResponse>
     */
    public CompletableFuture<DeleteConfigurationResponse> deleteConfigurationAsync(DeleteConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteConfiguration);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>
     */
    public AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationAsyncInvoker(
        DeleteConfigurationRequest request) {
        return new AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>(request,
            DdsMeta.deleteConfiguration, hcClient);
    }

    /**
     * 删除数据库角色
     *
     * 删除数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseRoleRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseRoleResponse>
     */
    public CompletableFuture<DeleteDatabaseRoleResponse> deleteDatabaseRoleAsync(DeleteDatabaseRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteDatabaseRole);
    }

    /**
     * 删除数据库角色
     *
     * 删除数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseRoleRequest 请求对象
     * @return AsyncInvoker<DeleteDatabaseRoleRequest, DeleteDatabaseRoleResponse>
     */
    public AsyncInvoker<DeleteDatabaseRoleRequest, DeleteDatabaseRoleResponse> deleteDatabaseRoleAsyncInvoker(
        DeleteDatabaseRoleRequest request) {
        return new AsyncInvoker<DeleteDatabaseRoleRequest, DeleteDatabaseRoleResponse>(request,
            DdsMeta.deleteDatabaseRole, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseUserRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseUserResponse>
     */
    public CompletableFuture<DeleteDatabaseUserResponse> deleteDatabaseUserAsync(DeleteDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteDatabaseUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseUserRequest 请求对象
     * @return AsyncInvoker<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse>
     */
    public AsyncInvoker<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse> deleteDatabaseUserAsyncInvoker(
        DeleteDatabaseUserRequest request) {
        return new AsyncInvoker<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse>(request,
            DdsMeta.deleteDatabaseUser, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, DdsMeta.deleteInstance,
            hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteManualBackupRequest 请求对象
     * @return CompletableFuture<DeleteManualBackupResponse>
     */
    public CompletableFuture<DeleteManualBackupResponse> deleteManualBackupAsync(DeleteManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteManualBackup);
    }

    /**
     * 删除手动备份
     *
     * 删除数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteManualBackupRequest 请求对象
     * @return AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>
     */
    public AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackupAsyncInvoker(
        DeleteManualBackupRequest request) {
        return new AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>(request,
            DdsMeta.deleteManualBackup, hcClient);
    }

    /**
     * 终结实例节点会话
     *
     * 终结实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSessionRequest 请求对象
     * @return CompletableFuture<DeleteSessionResponse>
     */
    public CompletableFuture<DeleteSessionResponse> deleteSessionAsync(DeleteSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteSession);
    }

    /**
     * 终结实例节点会话
     *
     * 终结实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSessionRequest 请求对象
     * @return AsyncInvoker<DeleteSessionRequest, DeleteSessionResponse>
     */
    public AsyncInvoker<DeleteSessionRequest, DeleteSessionResponse> deleteSessionAsyncInvoker(
        DeleteSessionRequest request) {
        return new AsyncInvoker<DeleteSessionRequest, DeleteSessionResponse>(request, DdsMeta.deleteSession, hcClient);
    }

    /**
     * 获取错误日志下载链接
     *
     * 获取错误日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadErrorlogRequest 请求对象
     * @return CompletableFuture<DownloadErrorlogResponse>
     */
    public CompletableFuture<DownloadErrorlogResponse> downloadErrorlogAsync(DownloadErrorlogRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.downloadErrorlog);
    }

    /**
     * 获取错误日志下载链接
     *
     * 获取错误日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadErrorlogRequest 请求对象
     * @return AsyncInvoker<DownloadErrorlogRequest, DownloadErrorlogResponse>
     */
    public AsyncInvoker<DownloadErrorlogRequest, DownloadErrorlogResponse> downloadErrorlogAsyncInvoker(
        DownloadErrorlogRequest request) {
        return new AsyncInvoker<DownloadErrorlogRequest, DownloadErrorlogResponse>(request, DdsMeta.downloadErrorlog,
            hcClient);
    }

    /**
     * 获取慢日志下载链接
     *
     * 获取慢日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadSlowlogRequest 请求对象
     * @return CompletableFuture<DownloadSlowlogResponse>
     */
    public CompletableFuture<DownloadSlowlogResponse> downloadSlowlogAsync(DownloadSlowlogRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.downloadSlowlog);
    }

    /**
     * 获取慢日志下载链接
     *
     * 获取慢日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadSlowlogRequest 请求对象
     * @return AsyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>
     */
    public AsyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse> downloadSlowlogAsyncInvoker(
        DownloadSlowlogRequest request) {
        return new AsyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>(request, DdsMeta.downloadSlowlog,
            hcClient);
    }

    /**
     * 扩容副本集实例的节点数量
     *
     * 扩容指定副本集实例的节点数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandReplicasetNodeRequest 请求对象
     * @return CompletableFuture<ExpandReplicasetNodeResponse>
     */
    public CompletableFuture<ExpandReplicasetNodeResponse> expandReplicasetNodeAsync(
        ExpandReplicasetNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.expandReplicasetNode);
    }

    /**
     * 扩容副本集实例的节点数量
     *
     * 扩容指定副本集实例的节点数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandReplicasetNodeRequest 请求对象
     * @return AsyncInvoker<ExpandReplicasetNodeRequest, ExpandReplicasetNodeResponse>
     */
    public AsyncInvoker<ExpandReplicasetNodeRequest, ExpandReplicasetNodeResponse> expandReplicasetNodeAsyncInvoker(
        ExpandReplicasetNodeRequest request) {
        return new AsyncInvoker<ExpandReplicasetNodeRequest, ExpandReplicasetNodeResponse>(request,
            DdsMeta.expandReplicasetNode, hcClient);
    }

    /**
     * 查询可应用的实例
     *
     * 查询指定参数模板可被应用的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppliedInstancesRequest 请求对象
     * @return CompletableFuture<ListAppliedInstancesResponse>
     */
    public CompletableFuture<ListAppliedInstancesResponse> listAppliedInstancesAsync(
        ListAppliedInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listAppliedInstances);
    }

    /**
     * 查询可应用的实例
     *
     * 查询指定参数模板可被应用的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppliedInstancesRequest 请求对象
     * @return AsyncInvoker<ListAppliedInstancesRequest, ListAppliedInstancesResponse>
     */
    public AsyncInvoker<ListAppliedInstancesRequest, ListAppliedInstancesResponse> listAppliedInstancesAsyncInvoker(
        ListAppliedInstancesRequest request) {
        return new AsyncInvoker<ListAppliedInstancesRequest, ListAppliedInstancesResponse>(request,
            DdsMeta.listAppliedInstances, hcClient);
    }

    /**
     * 获取审计日志下载链接
     *
     * 获取审计日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditlogLinksRequest 请求对象
     * @return CompletableFuture<ListAuditlogLinksResponse>
     */
    public CompletableFuture<ListAuditlogLinksResponse> listAuditlogLinksAsync(ListAuditlogLinksRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listAuditlogLinks);
    }

    /**
     * 获取审计日志下载链接
     *
     * 获取审计日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditlogLinksRequest 请求对象
     * @return AsyncInvoker<ListAuditlogLinksRequest, ListAuditlogLinksResponse>
     */
    public AsyncInvoker<ListAuditlogLinksRequest, ListAuditlogLinksResponse> listAuditlogLinksAsyncInvoker(
        ListAuditlogLinksRequest request) {
        return new AsyncInvoker<ListAuditlogLinksRequest, ListAuditlogLinksResponse>(request, DdsMeta.listAuditlogLinks,
            hcClient);
    }

    /**
     * 获取审计日志列表
     *
     * 获取审计日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditlogsRequest 请求对象
     * @return CompletableFuture<ListAuditlogsResponse>
     */
    public CompletableFuture<ListAuditlogsResponse> listAuditlogsAsync(ListAuditlogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listAuditlogs);
    }

    /**
     * 获取审计日志列表
     *
     * 获取审计日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditlogsRequest 请求对象
     * @return AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>
     */
    public AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse> listAuditlogsAsyncInvoker(
        ListAuditlogsRequest request) {
        return new AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>(request, DdsMeta.listAuditlogs, hcClient);
    }

    /**
     * 查询实例可迁移到的可用区
     *
     * 查询实例可迁移到的可用区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAz2MigrateRequest 请求对象
     * @return CompletableFuture<ListAz2MigrateResponse>
     */
    public CompletableFuture<ListAz2MigrateResponse> listAz2MigrateAsync(ListAz2MigrateRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listAz2Migrate);
    }

    /**
     * 查询实例可迁移到的可用区
     *
     * 查询实例可迁移到的可用区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAz2MigrateRequest 请求对象
     * @return AsyncInvoker<ListAz2MigrateRequest, ListAz2MigrateResponse>
     */
    public AsyncInvoker<ListAz2MigrateRequest, ListAz2MigrateResponse> listAz2MigrateAsyncInvoker(
        ListAz2MigrateRequest request) {
        return new AsyncInvoker<ListAz2MigrateRequest, ListAz2MigrateResponse>(request, DdsMeta.listAz2Migrate,
            hcClient);
    }

    /**
     * 查询备份列表
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackupsRequest 请求对象
     * @return CompletableFuture<ListBackupsResponse>
     */
    public CompletableFuture<ListBackupsResponse> listBackupsAsync(ListBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listBackups);
    }

    /**
     * 查询备份列表
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackupsRequest 请求对象
     * @return AsyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public AsyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsAsyncInvoker(ListBackupsRequest request) {
        return new AsyncInvoker<ListBackupsRequest, ListBackupsResponse>(request, DdsMeta.listBackups, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括DDS数据库的所有默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationsRequest 请求对象
     * @return CompletableFuture<ListConfigurationsResponse>
     */
    public CompletableFuture<ListConfigurationsResponse> listConfigurationsAsync(ListConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listConfigurations);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括DDS数据库的所有默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsAsyncInvoker(
        ListConfigurationsRequest request) {
        return new AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>(request,
            DdsMeta.listConfigurations, hcClient);
    }

    /**
     * 查询数据库角色列表
     *
     * 查询数据库角色列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseRolesRequest 请求对象
     * @return CompletableFuture<ListDatabaseRolesResponse>
     */
    public CompletableFuture<ListDatabaseRolesResponse> listDatabaseRolesAsync(ListDatabaseRolesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listDatabaseRoles);
    }

    /**
     * 查询数据库角色列表
     *
     * 查询数据库角色列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseRolesRequest 请求对象
     * @return AsyncInvoker<ListDatabaseRolesRequest, ListDatabaseRolesResponse>
     */
    public AsyncInvoker<ListDatabaseRolesRequest, ListDatabaseRolesResponse> listDatabaseRolesAsyncInvoker(
        ListDatabaseRolesRequest request) {
        return new AsyncInvoker<ListDatabaseRolesRequest, ListDatabaseRolesResponse>(request, DdsMeta.listDatabaseRoles,
            hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseUsersRequest 请求对象
     * @return CompletableFuture<ListDatabaseUsersResponse>
     */
    public CompletableFuture<ListDatabaseUsersResponse> listDatabaseUsersAsync(ListDatabaseUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listDatabaseUsers);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseUsersRequest 请求对象
     * @return AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>
     */
    public AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsersAsyncInvoker(
        ListDatabaseUsersRequest request) {
        return new AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>(request, DdsMeta.listDatabaseUsers,
            hcClient);
    }

    /**
     * 查询数据库版本信息
     *
     * 查询指定实例类型的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatastoreVersionsRequest 请求对象
     * @return CompletableFuture<ListDatastoreVersionsResponse>
     */
    public CompletableFuture<ListDatastoreVersionsResponse> listDatastoreVersionsAsync(
        ListDatastoreVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listDatastoreVersions);
    }

    /**
     * 查询数据库版本信息
     *
     * 查询指定实例类型的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatastoreVersionsRequest 请求对象
     * @return AsyncInvoker<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse>
     */
    public AsyncInvoker<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse> listDatastoreVersionsAsyncInvoker(
        ListDatastoreVersionsRequest request) {
        return new AsyncInvoker<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse>(request,
            DdsMeta.listDatastoreVersions, hcClient);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListErrorLogsRequest 请求对象
     * @return CompletableFuture<ListErrorLogsResponse>
     */
    public CompletableFuture<ListErrorLogsResponse> listErrorLogsAsync(ListErrorLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listErrorLogs);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListErrorLogsRequest 请求对象
     * @return AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>
     */
    public AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse> listErrorLogsAsyncInvoker(
        ListErrorLogsRequest request) {
        return new AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>(request, DdsMeta.listErrorLogs, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询指定条件下的实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorInfosRequest 请求对象
     * @return CompletableFuture<ListFlavorInfosResponse>
     */
    public CompletableFuture<ListFlavorInfosResponse> listFlavorInfosAsync(ListFlavorInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listFlavorInfos);
    }

    /**
     * 查询数据库规格
     *
     * 查询指定条件下的实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorInfosRequest 请求对象
     * @return AsyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse>
     */
    public AsyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse> listFlavorInfosAsyncInvoker(
        ListFlavorInfosRequest request) {
        return new AsyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse>(request, DdsMeta.listFlavorInfos,
            hcClient);
    }

    /**
     * 查询所有实例规格信息
     *
     * 查询指定条件下的所有实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listFlavors);
    }

    /**
     * 查询所有实例规格信息
     *
     * 查询指定条件下的所有实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, DdsMeta.listFlavors, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceTagsResponse>
     */
    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listInstanceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsAsyncInvoker(
        ListInstanceTagsRequest request) {
        return new AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>(request, DdsMeta.listInstanceTags,
            hcClient);
    }

    /**
     * 查询实例列表和详情
     *
     * 根据指定条件查询实例列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listInstances);
    }

    /**
     * 查询实例列表和详情
     *
     * 根据指定条件查询实例列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, DdsMeta.listInstances, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesByTagsRequest 请求对象
     * @return CompletableFuture<ListInstancesByTagsResponse>
     */
    public CompletableFuture<ListInstancesByTagsResponse> listInstancesByTagsAsync(ListInstancesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listInstancesByTags);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesByTagsRequest 请求对象
     * @return AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse>
     */
    public AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTagsAsyncInvoker(
        ListInstancesByTagsRequest request) {
        return new AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse>(request,
            DdsMeta.listInstancesByTags, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLtsSlowLogsRequest 请求对象
     * @return CompletableFuture<ListLtsSlowLogsResponse>
     */
    public CompletableFuture<ListLtsSlowLogsResponse> listLtsSlowLogsAsync(ListLtsSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listLtsSlowLogs);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLtsSlowLogsRequest 请求对象
     * @return AsyncInvoker<ListLtsSlowLogsRequest, ListLtsSlowLogsResponse>
     */
    public AsyncInvoker<ListLtsSlowLogsRequest, ListLtsSlowLogsResponse> listLtsSlowLogsAsyncInvoker(
        ListLtsSlowLogsRequest request) {
        return new AsyncInvoker<ListLtsSlowLogsRequest, ListLtsSlowLogsResponse>(request, DdsMeta.listLtsSlowLogs,
            hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下实例的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下实例的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, DdsMeta.listProjectTags,
            hcClient);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecycleInstancesRequest 请求对象
     * @return CompletableFuture<ListRecycleInstancesResponse>
     */
    public CompletableFuture<ListRecycleInstancesResponse> listRecycleInstancesAsync(
        ListRecycleInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listRecycleInstances);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecycleInstancesRequest 请求对象
     * @return AsyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>
     */
    public AsyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstancesAsyncInvoker(
        ListRecycleInstancesRequest request) {
        return new AsyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>(request,
            DdsMeta.listRecycleInstances, hcClient);
    }

    /**
     * 获取可恢复的数据库集合列表
     *
     * 获取可恢复的数据库集合列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRestoreCollectionsRequest 请求对象
     * @return CompletableFuture<ListRestoreCollectionsResponse>
     */
    public CompletableFuture<ListRestoreCollectionsResponse> listRestoreCollectionsAsync(
        ListRestoreCollectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listRestoreCollections);
    }

    /**
     * 获取可恢复的数据库集合列表
     *
     * 获取可恢复的数据库集合列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRestoreCollectionsRequest 请求对象
     * @return AsyncInvoker<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse>
     */
    public AsyncInvoker<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse> listRestoreCollectionsAsyncInvoker(
        ListRestoreCollectionsRequest request) {
        return new AsyncInvoker<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse>(request,
            DdsMeta.listRestoreCollections, hcClient);
    }

    /**
     * 获取可恢复的数据库列表
     *
     * 获取可恢复的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRestoreDatabasesRequest 请求对象
     * @return CompletableFuture<ListRestoreDatabasesResponse>
     */
    public CompletableFuture<ListRestoreDatabasesResponse> listRestoreDatabasesAsync(
        ListRestoreDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listRestoreDatabases);
    }

    /**
     * 获取可恢复的数据库列表
     *
     * 获取可恢复的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRestoreDatabasesRequest 请求对象
     * @return AsyncInvoker<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse>
     */
    public AsyncInvoker<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse> listRestoreDatabasesAsyncInvoker(
        ListRestoreDatabasesRequest request) {
        return new AsyncInvoker<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse>(request,
            DdsMeta.listRestoreDatabases, hcClient);
    }

    /**
     * 查询可恢复的时间段
     *
     * 查询实例的可恢复时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRestoreTimesRequest 请求对象
     * @return CompletableFuture<ListRestoreTimesResponse>
     */
    public CompletableFuture<ListRestoreTimesResponse> listRestoreTimesAsync(ListRestoreTimesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listRestoreTimes);
    }

    /**
     * 查询可恢复的时间段
     *
     * 查询实例的可恢复时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRestoreTimesRequest 请求对象
     * @return AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>
     */
    public AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimesAsyncInvoker(
        ListRestoreTimesRequest request) {
        return new AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>(request, DdsMeta.listRestoreTimes,
            hcClient);
    }

    /**
     * 查询实例节点会话
     *
     * 查询实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSessionsRequest 请求对象
     * @return CompletableFuture<ListSessionsResponse>
     */
    public CompletableFuture<ListSessionsResponse> listSessionsAsync(ListSessionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listSessions);
    }

    /**
     * 查询实例节点会话
     *
     * 查询实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSessionsRequest 请求对象
     * @return AsyncInvoker<ListSessionsRequest, ListSessionsResponse>
     */
    public AsyncInvoker<ListSessionsRequest, ListSessionsResponse> listSessionsAsyncInvoker(
        ListSessionsRequest request) {
        return new AsyncInvoker<ListSessionsRequest, ListSessionsResponse>(request, DdsMeta.listSessions, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowLogsRequest 请求对象
     * @return CompletableFuture<ListSlowLogsResponse>
     */
    public CompletableFuture<ListSlowLogsResponse> listSlowLogsAsync(ListSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listSlowLogs);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowLogsRequest 请求对象
     * @return AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>
     */
    public AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsAsyncInvoker(
        ListSlowLogsRequest request) {
        return new AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>(request, DdsMeta.listSlowLogs, hcClient);
    }

    /**
     * 获取SSL证书下载地址
     *
     * 获取SSL证书下载地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSslCertDownloadAddressRequest 请求对象
     * @return CompletableFuture<ListSslCertDownloadAddressResponse>
     */
    public CompletableFuture<ListSslCertDownloadAddressResponse> listSslCertDownloadAddressAsync(
        ListSslCertDownloadAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listSslCertDownloadAddress);
    }

    /**
     * 获取SSL证书下载地址
     *
     * 获取SSL证书下载地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSslCertDownloadAddressRequest 请求对象
     * @return AsyncInvoker<ListSslCertDownloadAddressRequest, ListSslCertDownloadAddressResponse>
     */
    public AsyncInvoker<ListSslCertDownloadAddressRequest, ListSslCertDownloadAddressResponse> listSslCertDownloadAddressAsyncInvoker(
        ListSslCertDownloadAddressRequest request) {
        return new AsyncInvoker<ListSslCertDownloadAddressRequest, ListSslCertDownloadAddressResponse>(request,
            DdsMeta.listSslCertDownloadAddress, hcClient);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询当前区域下的数据库磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStorageTypeRequest 请求对象
     * @return CompletableFuture<ListStorageTypeResponse>
     */
    public CompletableFuture<ListStorageTypeResponse> listStorageTypeAsync(ListStorageTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listStorageType);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询当前区域下的数据库磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStorageTypeRequest 请求对象
     * @return AsyncInvoker<ListStorageTypeRequest, ListStorageTypeResponse>
     */
    public AsyncInvoker<ListStorageTypeRequest, ListStorageTypeResponse> listStorageTypeAsyncInvoker(
        ListStorageTypeRequest request) {
        return new AsyncInvoker<ListStorageTypeRequest, ListStorageTypeResponse>(request, DdsMeta.listStorageType,
            hcClient);
    }

    /**
     * 查询任务列表和详情
     *
     * 根据指定条件查询任务中心中的任务列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksRequest 请求对象
     * @return CompletableFuture<ListTasksResponse>
     */
    public CompletableFuture<ListTasksResponse> listTasksAsync(ListTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listTasks);
    }

    /**
     * 查询任务列表和详情
     *
     * 根据指定条件查询任务中心中的任务列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksRequest 请求对象
     * @return AsyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public AsyncInvoker<ListTasksRequest, ListTasksResponse> listTasksAsyncInvoker(ListTasksRequest request) {
        return new AsyncInvoker<ListTasksRequest, ListTasksResponse>(request, DdsMeta.listTasks, hcClient);
    }

    /**
     * 实例可用区迁移
     *
     * 实例可用区迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateAzRequest 请求对象
     * @return CompletableFuture<MigrateAzResponse>
     */
    public CompletableFuture<MigrateAzResponse> migrateAzAsync(MigrateAzRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.migrateAz);
    }

    /**
     * 实例可用区迁移
     *
     * 实例可用区迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateAzRequest 请求对象
     * @return AsyncInvoker<MigrateAzRequest, MigrateAzResponse>
     */
    public AsyncInvoker<MigrateAzRequest, MigrateAzResponse> migrateAzAsyncInvoker(MigrateAzRequest request) {
        return new AsyncInvoker<MigrateAzRequest, MigrateAzResponse>(request, DdsMeta.migrateAz, hcClient);
    }

    /**
     * 重置参数模板
     *
     * 重置参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetConfigurationRequest 请求对象
     * @return CompletableFuture<ResetConfigurationResponse>
     */
    public CompletableFuture<ResetConfigurationResponse> resetConfigurationAsync(ResetConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.resetConfiguration);
    }

    /**
     * 重置参数模板
     *
     * 重置参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetConfigurationRequest 请求对象
     * @return AsyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse>
     */
    public AsyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse> resetConfigurationAsyncInvoker(
        ResetConfigurationRequest request) {
        return new AsyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse>(request,
            DdsMeta.resetConfiguration, hcClient);
    }

    /**
     * 修改数据库用户密码
     *
     * 修改数据库用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse>
     */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.resetPassword);
    }

    /**
     * 修改数据库用户密码
     *
     * 修改数据库用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(
        ResetPasswordRequest request) {
        return new AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, DdsMeta.resetPassword, hcClient);
    }

    /**
     * 变更实例规格
     *
     * 变更实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse>
     */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.resizeInstance);
    }

    /**
     * 变更实例规格
     *
     * 变更实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceAsyncInvoker(
        ResizeInstanceRequest request) {
        return new AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>(request, DdsMeta.resizeInstance,
            hcClient);
    }

    /**
     * 扩容实例存储容量
     *
     * 扩容实例相关的存储容量大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceVolumeRequest 请求对象
     * @return CompletableFuture<ResizeInstanceVolumeResponse>
     */
    public CompletableFuture<ResizeInstanceVolumeResponse> resizeInstanceVolumeAsync(
        ResizeInstanceVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.resizeInstanceVolume);
    }

    /**
     * 扩容实例存储容量
     *
     * 扩容实例相关的存储容量大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceVolumeRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse>
     */
    public AsyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> resizeInstanceVolumeAsyncInvoker(
        ResizeInstanceVolumeRequest request) {
        return new AsyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse>(request,
            DdsMeta.resizeInstanceVolume, hcClient);
    }

    /**
     * 重启实例
     *
     * 重启实例的数据库服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartInstanceRequest 请求对象
     * @return CompletableFuture<RestartInstanceResponse>
     */
    public CompletableFuture<RestartInstanceResponse> restartInstanceAsync(RestartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.restartInstance);
    }

    /**
     * 重启实例
     *
     * 重启实例的数据库服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartInstanceRequest 请求对象
     * @return AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse>
     */
    public AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse> restartInstanceAsyncInvoker(
        RestartInstanceRequest request) {
        return new AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse>(request, DdsMeta.restartInstance,
            hcClient);
    }

    /**
     * 恢复到当前实例
     *
     * 恢复到当前实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreInstanceRequest 请求对象
     * @return CompletableFuture<RestoreInstanceResponse>
     */
    public CompletableFuture<RestoreInstanceResponse> restoreInstanceAsync(RestoreInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.restoreInstance);
    }

    /**
     * 恢复到当前实例
     *
     * 恢复到当前实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>
     */
    public AsyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstanceAsyncInvoker(
        RestoreInstanceRequest request) {
        return new AsyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>(request, DdsMeta.restoreInstance,
            hcClient);
    }

    /**
     * 库表级时间点恢复
     *
     * 库表级时间点恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreInstanceFromCollectionRequest 请求对象
     * @return CompletableFuture<RestoreInstanceFromCollectionResponse>
     */
    public CompletableFuture<RestoreInstanceFromCollectionResponse> restoreInstanceFromCollectionAsync(
        RestoreInstanceFromCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.restoreInstanceFromCollection);
    }

    /**
     * 库表级时间点恢复
     *
     * 库表级时间点恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreInstanceFromCollectionRequest 请求对象
     * @return AsyncInvoker<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse>
     */
    public AsyncInvoker<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse> restoreInstanceFromCollectionAsyncInvoker(
        RestoreInstanceFromCollectionRequest request) {
        return new AsyncInvoker<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse>(request,
            DdsMeta.restoreInstanceFromCollection, hcClient);
    }

    /**
     * 恢复到新实例
     *
     * 根据备份恢复新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreNewInstanceRequest 请求对象
     * @return CompletableFuture<RestoreNewInstanceResponse>
     */
    public CompletableFuture<RestoreNewInstanceResponse> restoreNewInstanceAsync(RestoreNewInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.restoreNewInstance);
    }

    /**
     * 恢复到新实例
     *
     * 根据备份恢复新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreNewInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreNewInstanceRequest, RestoreNewInstanceResponse>
     */
    public AsyncInvoker<RestoreNewInstanceRequest, RestoreNewInstanceResponse> restoreNewInstanceAsyncInvoker(
        RestoreNewInstanceRequest request) {
        return new AsyncInvoker<RestoreNewInstanceRequest, RestoreNewInstanceResponse>(request,
            DdsMeta.restoreNewInstance, hcClient);
    }

    /**
     * 设置审计日志策略
     *
     * 设置审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetAuditlogPolicyRequest 请求对象
     * @return CompletableFuture<SetAuditlogPolicyResponse>
     */
    public CompletableFuture<SetAuditlogPolicyResponse> setAuditlogPolicyAsync(SetAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.setAuditlogPolicy);
    }

    /**
     * 设置审计日志策略
     *
     * 设置审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetAuditlogPolicyRequest 请求对象
     * @return AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>
     */
    public AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> setAuditlogPolicyAsyncInvoker(
        SetAuditlogPolicyRequest request) {
        return new AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>(request, DdsMeta.setAuditlogPolicy,
            hcClient);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetBackupPolicyResponse>
     */
    public CompletableFuture<SetBackupPolicyResponse> setBackupPolicyAsync(SetBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>
     */
    public AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyAsyncInvoker(
        SetBackupPolicyRequest request) {
        return new AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>(request, DdsMeta.setBackupPolicy,
            hcClient);
    }

    /**
     * 设置集群均衡开关
     *
     * 设置集群均衡开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBalancerSwitchRequest 请求对象
     * @return CompletableFuture<SetBalancerSwitchResponse>
     */
    public CompletableFuture<SetBalancerSwitchResponse> setBalancerSwitchAsync(SetBalancerSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.setBalancerSwitch);
    }

    /**
     * 设置集群均衡开关
     *
     * 设置集群均衡开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBalancerSwitchRequest 请求对象
     * @return AsyncInvoker<SetBalancerSwitchRequest, SetBalancerSwitchResponse>
     */
    public AsyncInvoker<SetBalancerSwitchRequest, SetBalancerSwitchResponse> setBalancerSwitchAsyncInvoker(
        SetBalancerSwitchRequest request) {
        return new AsyncInvoker<SetBalancerSwitchRequest, SetBalancerSwitchResponse>(request, DdsMeta.setBalancerSwitch,
            hcClient);
    }

    /**
     * 设置集群均衡活动时间窗
     *
     * 设置集群均衡活动时间窗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBalancerWindowRequest 请求对象
     * @return CompletableFuture<SetBalancerWindowResponse>
     */
    public CompletableFuture<SetBalancerWindowResponse> setBalancerWindowAsync(SetBalancerWindowRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.setBalancerWindow);
    }

    /**
     * 设置集群均衡活动时间窗
     *
     * 设置集群均衡活动时间窗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBalancerWindowRequest 请求对象
     * @return AsyncInvoker<SetBalancerWindowRequest, SetBalancerWindowResponse>
     */
    public AsyncInvoker<SetBalancerWindowRequest, SetBalancerWindowResponse> setBalancerWindowAsyncInvoker(
        SetBalancerWindowRequest request) {
        return new AsyncInvoker<SetBalancerWindowRequest, SetBalancerWindowResponse>(request, DdsMeta.setBalancerWindow,
            hcClient);
    }

    /**
     * 设置实例回收站策略
     *
     * 设置实例回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRecyclePolicyRequest 请求对象
     * @return CompletableFuture<SetRecyclePolicyResponse>
     */
    public CompletableFuture<SetRecyclePolicyResponse> setRecyclePolicyAsync(SetRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.setRecyclePolicy);
    }

    /**
     * 设置实例回收站策略
     *
     * 设置实例回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse>
     */
    public AsyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicyAsyncInvoker(
        SetRecyclePolicyRequest request) {
        return new AsyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse>(request, DdsMeta.setRecyclePolicy,
            hcClient);
    }

    /**
     * 查询审计日志策略
     *
     * 查询审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuditlogPolicyRequest 请求对象
     * @return CompletableFuture<ShowAuditlogPolicyResponse>
     */
    public CompletableFuture<ShowAuditlogPolicyResponse> showAuditlogPolicyAsync(ShowAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showAuditlogPolicy);
    }

    /**
     * 查询审计日志策略
     *
     * 查询审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuditlogPolicyRequest 请求对象
     * @return AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>
     */
    public AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> showAuditlogPolicyAsyncInvoker(
        ShowAuditlogPolicyRequest request) {
        return new AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>(request,
            DdsMeta.showAuditlogPolicy, hcClient);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupDownloadLinkRequest 请求对象
     * @return CompletableFuture<ShowBackupDownloadLinkResponse>
     */
    public CompletableFuture<ShowBackupDownloadLinkResponse> showBackupDownloadLinkAsync(
        ShowBackupDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showBackupDownloadLink);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupDownloadLinkRequest 请求对象
     * @return AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>
     */
    public AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLinkAsyncInvoker(
        ShowBackupDownloadLinkRequest request) {
        return new AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>(request,
            DdsMeta.showBackupDownloadLink, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowBackupPolicyResponse>
     */
    public CompletableFuture<ShowBackupPolicyResponse> showBackupPolicyAsync(ShowBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showBackupPolicy);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>
     */
    public AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyAsyncInvoker(
        ShowBackupPolicyRequest request) {
        return new AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>(request, DdsMeta.showBackupPolicy,
            hcClient);
    }

    /**
     * 查询参数模板被应用历史
     *
     * 查询参数模板应用历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationAppliedHistoryRequest 请求对象
     * @return CompletableFuture<ShowConfigurationAppliedHistoryResponse>
     */
    public CompletableFuture<ShowConfigurationAppliedHistoryResponse> showConfigurationAppliedHistoryAsync(
        ShowConfigurationAppliedHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showConfigurationAppliedHistory);
    }

    /**
     * 查询参数模板被应用历史
     *
     * 查询参数模板应用历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationAppliedHistoryRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationAppliedHistoryRequest, ShowConfigurationAppliedHistoryResponse>
     */
    public AsyncInvoker<ShowConfigurationAppliedHistoryRequest, ShowConfigurationAppliedHistoryResponse> showConfigurationAppliedHistoryAsyncInvoker(
        ShowConfigurationAppliedHistoryRequest request) {
        return new AsyncInvoker<ShowConfigurationAppliedHistoryRequest, ShowConfigurationAppliedHistoryResponse>(
            request, DdsMeta.showConfigurationAppliedHistory, hcClient);
    }

    /**
     * 查询参数模板修改历史
     *
     * 查询参数模板修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationModifyHistoryRequest 请求对象
     * @return CompletableFuture<ShowConfigurationModifyHistoryResponse>
     */
    public CompletableFuture<ShowConfigurationModifyHistoryResponse> showConfigurationModifyHistoryAsync(
        ShowConfigurationModifyHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showConfigurationModifyHistory);
    }

    /**
     * 查询参数模板修改历史
     *
     * 查询参数模板修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationModifyHistoryRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationModifyHistoryRequest, ShowConfigurationModifyHistoryResponse>
     */
    public AsyncInvoker<ShowConfigurationModifyHistoryRequest, ShowConfigurationModifyHistoryResponse> showConfigurationModifyHistoryAsyncInvoker(
        ShowConfigurationModifyHistoryRequest request) {
        return new AsyncInvoker<ShowConfigurationModifyHistoryRequest, ShowConfigurationModifyHistoryResponse>(request,
            DdsMeta.showConfigurationModifyHistory, hcClient);
    }

    /**
     * 获取参数模板的详情
     *
     * 获取参数模板的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationParameterRequest 请求对象
     * @return CompletableFuture<ShowConfigurationParameterResponse>
     */
    public CompletableFuture<ShowConfigurationParameterResponse> showConfigurationParameterAsync(
        ShowConfigurationParameterRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showConfigurationParameter);
    }

    /**
     * 获取参数模板的详情
     *
     * 获取参数模板的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationParameterRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationParameterRequest, ShowConfigurationParameterResponse>
     */
    public AsyncInvoker<ShowConfigurationParameterRequest, ShowConfigurationParameterResponse> showConfigurationParameterAsyncInvoker(
        ShowConfigurationParameterRequest request) {
        return new AsyncInvoker<ShowConfigurationParameterRequest, ShowConfigurationParameterResponse>(request,
            DdsMeta.showConfigurationParameter, hcClient);
    }

    /**
     * 查询实例连接数统计信息
     *
     * 查询客户端IP访问至DDS数据库实例的连接数统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConnectionStatisticsRequest 请求对象
     * @return CompletableFuture<ShowConnectionStatisticsResponse>
     */
    public CompletableFuture<ShowConnectionStatisticsResponse> showConnectionStatisticsAsync(
        ShowConnectionStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showConnectionStatistics);
    }

    /**
     * 查询实例连接数统计信息
     *
     * 查询客户端IP访问至DDS数据库实例的连接数统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConnectionStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowConnectionStatisticsRequest, ShowConnectionStatisticsResponse>
     */
    public AsyncInvoker<ShowConnectionStatisticsRequest, ShowConnectionStatisticsResponse> showConnectionStatisticsAsyncInvoker(
        ShowConnectionStatisticsRequest request) {
        return new AsyncInvoker<ShowConnectionStatisticsRequest, ShowConnectionStatisticsResponse>(request,
            DdsMeta.showConnectionStatistics, hcClient);
    }

    /**
     * 查询实例磁盘信息
     *
     * 查询实例磁盘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDiskUsageRequest 请求对象
     * @return CompletableFuture<ShowDiskUsageResponse>
     */
    public CompletableFuture<ShowDiskUsageResponse> showDiskUsageAsync(ShowDiskUsageRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showDiskUsage);
    }

    /**
     * 查询实例磁盘信息
     *
     * 查询实例磁盘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDiskUsageRequest 请求对象
     * @return AsyncInvoker<ShowDiskUsageRequest, ShowDiskUsageResponse>
     */
    public AsyncInvoker<ShowDiskUsageRequest, ShowDiskUsageResponse> showDiskUsageAsyncInvoker(
        ShowDiskUsageRequest request) {
        return new AsyncInvoker<ShowDiskUsageRequest, ShowDiskUsageResponse>(request, DdsMeta.showDiskUsage, hcClient);
    }

    /**
     * 获取指定实例的参数信息
     *
     * 获取指定实例的参数，可以是实例，组，节点的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEntityConfigurationRequest 请求对象
     * @return CompletableFuture<ShowEntityConfigurationResponse>
     */
    public CompletableFuture<ShowEntityConfigurationResponse> showEntityConfigurationAsync(
        ShowEntityConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showEntityConfiguration);
    }

    /**
     * 获取指定实例的参数信息
     *
     * 获取指定实例的参数，可以是实例，组，节点的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEntityConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowEntityConfigurationRequest, ShowEntityConfigurationResponse>
     */
    public AsyncInvoker<ShowEntityConfigurationRequest, ShowEntityConfigurationResponse> showEntityConfigurationAsyncInvoker(
        ShowEntityConfigurationRequest request) {
        return new AsyncInvoker<ShowEntityConfigurationRequest, ShowEntityConfigurationResponse>(request,
            DdsMeta.showEntityConfiguration, hcClient);
    }

    /**
     * 获取DDS任务中心指定ID的任务信息。
     *
     * 获取DDS任务中心指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobDetailRequest 请求对象
     * @return CompletableFuture<ShowJobDetailResponse>
     */
    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showJobDetail);
    }

    /**
     * 获取DDS任务中心指定ID的任务信息。
     *
     * 获取DDS任务中心指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobDetailRequest 请求对象
     * @return AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailAsyncInvoker(
        ShowJobDetailRequest request) {
        return new AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>(request, DdsMeta.showJobDetail, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询单租户在DDS服务下的资源配额，包括单节点实例配额、副本集实例配额、集群实例配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showQuotas);
    }

    /**
     * 查询配额
     *
     * 查询单租户在DDS服务下的资源配额，包括单节点实例配额、副本集实例配额、集群实例配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, DdsMeta.showQuotas, hcClient);
    }

    /**
     * 查询实例回收站策略
     *
     * 查询实例回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecyclePolicyRequest 请求对象
     * @return CompletableFuture<ShowRecyclePolicyResponse>
     */
    public CompletableFuture<ShowRecyclePolicyResponse> showRecyclePolicyAsync(ShowRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showRecyclePolicy);
    }

    /**
     * 查询实例回收站策略
     *
     * 查询实例回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>
     */
    public AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicyAsyncInvoker(
        ShowRecyclePolicyRequest request) {
        return new AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>(request, DdsMeta.showRecyclePolicy,
            hcClient);
    }

    /**
     * 查询数据库复制集名称
     *
     * 查询数据库复制集名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReplSetNameRequest 请求对象
     * @return CompletableFuture<ShowReplSetNameResponse>
     */
    public CompletableFuture<ShowReplSetNameResponse> showReplSetNameAsync(ShowReplSetNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showReplSetName);
    }

    /**
     * 查询数据库复制集名称
     *
     * 查询数据库复制集名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReplSetNameRequest 请求对象
     * @return AsyncInvoker<ShowReplSetNameRequest, ShowReplSetNameResponse>
     */
    public AsyncInvoker<ShowReplSetNameRequest, ShowReplSetNameResponse> showReplSetNameAsyncInvoker(
        ShowReplSetNameRequest request) {
        return new AsyncInvoker<ShowReplSetNameRequest, ShowReplSetNameResponse>(request, DdsMeta.showReplSetName,
            hcClient);
    }

    /**
     * 查询秒级监控配置
     *
     * 查询秒级监控配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecondLevelMonitoringStatusRequest 请求对象
     * @return CompletableFuture<ShowSecondLevelMonitoringStatusResponse>
     */
    public CompletableFuture<ShowSecondLevelMonitoringStatusResponse> showSecondLevelMonitoringStatusAsync(
        ShowSecondLevelMonitoringStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showSecondLevelMonitoringStatus);
    }

    /**
     * 查询秒级监控配置
     *
     * 查询秒级监控配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecondLevelMonitoringStatusRequest 请求对象
     * @return AsyncInvoker<ShowSecondLevelMonitoringStatusRequest, ShowSecondLevelMonitoringStatusResponse>
     */
    public AsyncInvoker<ShowSecondLevelMonitoringStatusRequest, ShowSecondLevelMonitoringStatusResponse> showSecondLevelMonitoringStatusAsyncInvoker(
        ShowSecondLevelMonitoringStatusRequest request) {
        return new AsyncInvoker<ShowSecondLevelMonitoringStatusRequest, ShowSecondLevelMonitoringStatusResponse>(
            request, DdsMeta.showSecondLevelMonitoringStatus, hcClient);
    }

    /**
     * 查询集群均衡设置
     *
     * 查询集群均衡设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowShardingBalancerRequest 请求对象
     * @return CompletableFuture<ShowShardingBalancerResponse>
     */
    public CompletableFuture<ShowShardingBalancerResponse> showShardingBalancerAsync(
        ShowShardingBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showShardingBalancer);
    }

    /**
     * 查询集群均衡设置
     *
     * 查询集群均衡设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowShardingBalancerRequest 请求对象
     * @return AsyncInvoker<ShowShardingBalancerRequest, ShowShardingBalancerResponse>
     */
    public AsyncInvoker<ShowShardingBalancerRequest, ShowShardingBalancerResponse> showShardingBalancerAsyncInvoker(
        ShowShardingBalancerRequest request) {
        return new AsyncInvoker<ShowShardingBalancerRequest, ShowShardingBalancerResponse>(request,
            DdsMeta.showShardingBalancer, hcClient);
    }

    /**
     * 查询慢日志明文开关
     *
     * 查询慢日志明文开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSlowlogDesensitizationSwitchRequest 请求对象
     * @return CompletableFuture<ShowSlowlogDesensitizationSwitchResponse>
     */
    public CompletableFuture<ShowSlowlogDesensitizationSwitchResponse> showSlowlogDesensitizationSwitchAsync(
        ShowSlowlogDesensitizationSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showSlowlogDesensitizationSwitch);
    }

    /**
     * 查询慢日志明文开关
     *
     * 查询慢日志明文开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSlowlogDesensitizationSwitchRequest 请求对象
     * @return AsyncInvoker<ShowSlowlogDesensitizationSwitchRequest, ShowSlowlogDesensitizationSwitchResponse>
     */
    public AsyncInvoker<ShowSlowlogDesensitizationSwitchRequest, ShowSlowlogDesensitizationSwitchResponse> showSlowlogDesensitizationSwitchAsyncInvoker(
        ShowSlowlogDesensitizationSwitchRequest request) {
        return new AsyncInvoker<ShowSlowlogDesensitizationSwitchRequest, ShowSlowlogDesensitizationSwitchResponse>(
            request, DdsMeta.showSlowlogDesensitizationSwitch, hcClient);
    }

    /**
     * 查询数据库补丁升级预估时长
     *
     * 查询数据库补丁升级预估时长
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpgradeDurationRequest 请求对象
     * @return CompletableFuture<ShowUpgradeDurationResponse>
     */
    public CompletableFuture<ShowUpgradeDurationResponse> showUpgradeDurationAsync(ShowUpgradeDurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showUpgradeDuration);
    }

    /**
     * 查询数据库补丁升级预估时长
     *
     * 查询数据库补丁升级预估时长
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpgradeDurationRequest 请求对象
     * @return AsyncInvoker<ShowUpgradeDurationRequest, ShowUpgradeDurationResponse>
     */
    public AsyncInvoker<ShowUpgradeDurationRequest, ShowUpgradeDurationResponse> showUpgradeDurationAsyncInvoker(
        ShowUpgradeDurationRequest request) {
        return new AsyncInvoker<ShowUpgradeDurationRequest, ShowUpgradeDurationResponse>(request,
            DdsMeta.showUpgradeDuration, hcClient);
    }

    /**
     * 删除实例的节点
     *
     * 删除实例的节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShrinkInstanceNodesRequest 请求对象
     * @return CompletableFuture<ShrinkInstanceNodesResponse>
     */
    public CompletableFuture<ShrinkInstanceNodesResponse> shrinkInstanceNodesAsync(ShrinkInstanceNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.shrinkInstanceNodes);
    }

    /**
     * 删除实例的节点
     *
     * 删除实例的节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShrinkInstanceNodesRequest 请求对象
     * @return AsyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse>
     */
    public AsyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse> shrinkInstanceNodesAsyncInvoker(
        ShrinkInstanceNodesRequest request) {
        return new AsyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse>(request,
            DdsMeta.shrinkInstanceNodes, hcClient);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchConfigurationRequest 请求对象
     * @return CompletableFuture<SwitchConfigurationResponse>
     */
    public CompletableFuture<SwitchConfigurationResponse> switchConfigurationAsync(SwitchConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.switchConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchConfigurationRequest 请求对象
     * @return AsyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse>
     */
    public AsyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse> switchConfigurationAsyncInvoker(
        SwitchConfigurationRequest request) {
        return new AsyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse>(request,
            DdsMeta.switchConfiguration, hcClient);
    }

    /**
     * 开启/关闭秒级监控
     *
     * 开启或关闭指定实例的秒级监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSecondLevelMonitoringRequest 请求对象
     * @return CompletableFuture<SwitchSecondLevelMonitoringResponse>
     */
    public CompletableFuture<SwitchSecondLevelMonitoringResponse> switchSecondLevelMonitoringAsync(
        SwitchSecondLevelMonitoringRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.switchSecondLevelMonitoring);
    }

    /**
     * 开启/关闭秒级监控
     *
     * 开启或关闭指定实例的秒级监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSecondLevelMonitoringRequest 请求对象
     * @return AsyncInvoker<SwitchSecondLevelMonitoringRequest, SwitchSecondLevelMonitoringResponse>
     */
    public AsyncInvoker<SwitchSecondLevelMonitoringRequest, SwitchSecondLevelMonitoringResponse> switchSecondLevelMonitoringAsyncInvoker(
        SwitchSecondLevelMonitoringRequest request) {
        return new AsyncInvoker<SwitchSecondLevelMonitoringRequest, SwitchSecondLevelMonitoringResponse>(request,
            DdsMeta.switchSecondLevelMonitoring, hcClient);
    }

    /**
     * 设置慢日志明文开关
     *
     * 设置实例的慢日志明文开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSlowlogDesensitizationRequest 请求对象
     * @return CompletableFuture<SwitchSlowlogDesensitizationResponse>
     */
    public CompletableFuture<SwitchSlowlogDesensitizationResponse> switchSlowlogDesensitizationAsync(
        SwitchSlowlogDesensitizationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.switchSlowlogDesensitization);
    }

    /**
     * 设置慢日志明文开关
     *
     * 设置实例的慢日志明文开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSlowlogDesensitizationRequest 请求对象
     * @return AsyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse>
     */
    public AsyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse> switchSlowlogDesensitizationAsyncInvoker(
        SwitchSlowlogDesensitizationRequest request) {
        return new AsyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse>(request,
            DdsMeta.switchSlowlogDesensitization, hcClient);
    }

    /**
     * 切换SSL开关
     *
     * 切换实例的SSL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSslRequest 请求对象
     * @return CompletableFuture<SwitchSslResponse>
     */
    public CompletableFuture<SwitchSslResponse> switchSslAsync(SwitchSslRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.switchSsl);
    }

    /**
     * 切换SSL开关
     *
     * 切换实例的SSL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSslRequest 请求对象
     * @return AsyncInvoker<SwitchSslRequest, SwitchSslResponse>
     */
    public AsyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslAsyncInvoker(SwitchSslRequest request) {
        return new AsyncInvoker<SwitchSslRequest, SwitchSslResponse>(request, DdsMeta.switchSsl, hcClient);
    }

    /**
     * 切换副本集实例的主备节点
     *
     * 切换副本集实例下的主备节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchoverReplicaSetRequest 请求对象
     * @return CompletableFuture<SwitchoverReplicaSetResponse>
     */
    public CompletableFuture<SwitchoverReplicaSetResponse> switchoverReplicaSetAsync(
        SwitchoverReplicaSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.switchoverReplicaSet);
    }

    /**
     * 切换副本集实例的主备节点
     *
     * 切换副本集实例下的主备节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchoverReplicaSetRequest 请求对象
     * @return AsyncInvoker<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse>
     */
    public AsyncInvoker<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse> switchoverReplicaSetAsyncInvoker(
        SwitchoverReplicaSetRequest request) {
        return new AsyncInvoker<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse>(request,
            DdsMeta.switchoverReplicaSet, hcClient);
    }

    /**
     * 副本集跨网段访问配置。
     *
     * 副本集跨网段访问配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClientNetworkRequest 请求对象
     * @return CompletableFuture<UpdateClientNetworkResponse>
     */
    public CompletableFuture<UpdateClientNetworkResponse> updateClientNetworkAsync(UpdateClientNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateClientNetwork);
    }

    /**
     * 副本集跨网段访问配置。
     *
     * 副本集跨网段访问配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClientNetworkRequest 请求对象
     * @return AsyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse>
     */
    public AsyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse> updateClientNetworkAsyncInvoker(
        UpdateClientNetworkRequest request) {
        return new AsyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse>(request,
            DdsMeta.updateClientNetwork, hcClient);
    }

    /**
     * 修改参数模板
     *
     * 修改指定参数模板的参数信息，包括名称、描述、指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigurationParameterRequest 请求对象
     * @return CompletableFuture<UpdateConfigurationParameterResponse>
     */
    public CompletableFuture<UpdateConfigurationParameterResponse> updateConfigurationParameterAsync(
        UpdateConfigurationParameterRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateConfigurationParameter);
    }

    /**
     * 修改参数模板
     *
     * 修改指定参数模板的参数信息，包括名称、描述、指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigurationParameterRequest 请求对象
     * @return AsyncInvoker<UpdateConfigurationParameterRequest, UpdateConfigurationParameterResponse>
     */
    public AsyncInvoker<UpdateConfigurationParameterRequest, UpdateConfigurationParameterResponse> updateConfigurationParameterAsyncInvoker(
        UpdateConfigurationParameterRequest request) {
        return new AsyncInvoker<UpdateConfigurationParameterRequest, UpdateConfigurationParameterResponse>(request,
            DdsMeta.updateConfigurationParameter, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数，可以是实例，组，节点的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEntityConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateEntityConfigurationResponse>
     */
    public CompletableFuture<UpdateEntityConfigurationResponse> updateEntityConfigurationAsync(
        UpdateEntityConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateEntityConfiguration);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数，可以是实例，组，节点的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEntityConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateEntityConfigurationRequest, UpdateEntityConfigurationResponse>
     */
    public AsyncInvoker<UpdateEntityConfigurationRequest, UpdateEntityConfigurationResponse> updateEntityConfigurationAsyncInvoker(
        UpdateEntityConfigurationRequest request) {
        return new AsyncInvoker<UpdateEntityConfigurationRequest, UpdateEntityConfigurationResponse>(request,
            DdsMeta.updateEntityConfiguration, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateInstanceNameResponse>
     */
    public CompletableFuture<UpdateInstanceNameResponse> updateInstanceNameAsync(UpdateInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameAsyncInvoker(
        UpdateInstanceNameRequest request) {
        return new AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>(request,
            DdsMeta.updateInstanceName, hcClient);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库实例的端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstancePortRequest 请求对象
     * @return CompletableFuture<UpdateInstancePortResponse>
     */
    public CompletableFuture<UpdateInstancePortResponse> updateInstancePortAsync(UpdateInstancePortRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateInstancePort);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库实例的端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstancePortRequest 请求对象
     * @return AsyncInvoker<UpdateInstancePortRequest, UpdateInstancePortResponse>
     */
    public AsyncInvoker<UpdateInstancePortRequest, UpdateInstancePortResponse> updateInstancePortAsyncInvoker(
        UpdateInstancePortRequest request) {
        return new AsyncInvoker<UpdateInstancePortRequest, UpdateInstancePortResponse>(request,
            DdsMeta.updateInstancePort, hcClient);
    }

    /**
     * 修改实例备注
     *
     * 修改实例备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRemarkRequest 请求对象
     * @return CompletableFuture<UpdateInstanceRemarkResponse>
     */
    public CompletableFuture<UpdateInstanceRemarkResponse> updateInstanceRemarkAsync(
        UpdateInstanceRemarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateInstanceRemark);
    }

    /**
     * 修改实例备注
     *
     * 修改实例备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRemarkRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRemarkRequest, UpdateInstanceRemarkResponse>
     */
    public AsyncInvoker<UpdateInstanceRemarkRequest, UpdateInstanceRemarkResponse> updateInstanceRemarkAsyncInvoker(
        UpdateInstanceRemarkRequest request) {
        return new AsyncInvoker<UpdateInstanceRemarkRequest, UpdateInstanceRemarkResponse>(request,
            DdsMeta.updateInstanceRemark, hcClient);
    }

    /**
     * 修改数据库复制集名称
     *
     * 修改数据库复制集名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateReplSetNameRequest 请求对象
     * @return CompletableFuture<UpdateReplSetNameResponse>
     */
    public CompletableFuture<UpdateReplSetNameResponse> updateReplSetNameAsync(UpdateReplSetNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateReplSetName);
    }

    /**
     * 修改数据库复制集名称
     *
     * 修改数据库复制集名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateReplSetNameRequest 请求对象
     * @return AsyncInvoker<UpdateReplSetNameRequest, UpdateReplSetNameResponse>
     */
    public AsyncInvoker<UpdateReplSetNameRequest, UpdateReplSetNameResponse> updateReplSetNameAsyncInvoker(
        UpdateReplSetNameRequest request) {
        return new AsyncInvoker<UpdateReplSetNameRequest, UpdateReplSetNameResponse>(request, DdsMeta.updateReplSetName,
            hcClient);
    }

    /**
     * 变更实例安全组
     *
     * 变更实例关联的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecurityGroupRequest 请求对象
     * @return CompletableFuture<UpdateSecurityGroupResponse>
     */
    public CompletableFuture<UpdateSecurityGroupResponse> updateSecurityGroupAsync(UpdateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateSecurityGroup);
    }

    /**
     * 变更实例安全组
     *
     * 变更实例关联的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>
     */
    public AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroupAsyncInvoker(
        UpdateSecurityGroupRequest request) {
        return new AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>(request,
            DdsMeta.updateSecurityGroup, hcClient);
    }

    /**
     * 数据库补丁升级
     *
     * 升级数据库补丁版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeDatabaseVersionRequest 请求对象
     * @return CompletableFuture<UpgradeDatabaseVersionResponse>
     */
    public CompletableFuture<UpgradeDatabaseVersionResponse> upgradeDatabaseVersionAsync(
        UpgradeDatabaseVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.upgradeDatabaseVersion);
    }

    /**
     * 数据库补丁升级
     *
     * 升级数据库补丁版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeDatabaseVersionRequest 请求对象
     * @return AsyncInvoker<UpgradeDatabaseVersionRequest, UpgradeDatabaseVersionResponse>
     */
    public AsyncInvoker<UpgradeDatabaseVersionRequest, UpgradeDatabaseVersionResponse> upgradeDatabaseVersionAsyncInvoker(
        UpgradeDatabaseVersionRequest request) {
        return new AsyncInvoker<UpgradeDatabaseVersionRequest, UpgradeDatabaseVersionResponse>(request,
            DdsMeta.upgradeDatabaseVersion, hcClient);
    }

    /**
     * 查询当前支持的API版本信息列表
     *
     * 查询当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionRequest 请求对象
     * @return CompletableFuture<ListApiVersionResponse>
     */
    public CompletableFuture<ListApiVersionResponse> listApiVersionAsync(ListApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listApiVersion);
    }

    /**
     * 查询当前支持的API版本信息列表
     *
     * 查询当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionRequest 请求对象
     * @return AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse>
     */
    public AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionAsyncInvoker(
        ListApiVersionRequest request) {
        return new AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse>(request, DdsMeta.listApiVersion,
            hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showApiVersion);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, DdsMeta.showApiVersion,
            hcClient);
    }

}
