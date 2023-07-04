package com.huaweicloud.sdk.gaussdbfornosql.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.*;

public class GaussDBforNoSQLClient {

    protected HcClient hcClient;

    public GaussDBforNoSQLClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBforNoSQLClient> newBuilder() {
        return new ClientBuilder<>(GaussDBforNoSQLClient::new);
    }

    /**
     * 应用参数模板
     *
     * 将参数模板应用到实例，可以指定一个或多个实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyConfigurationRequest 请求对象
     * @return ApplyConfigurationResponse
     */
    public ApplyConfigurationResponse applyConfiguration(ApplyConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.applyConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 将参数模板应用到实例，可以指定一个或多个实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyConfigurationRequest 请求对象
     * @return SyncInvoker<ApplyConfigurationRequest, ApplyConfigurationResponse>
     */
    public SyncInvoker<ApplyConfigurationRequest, ApplyConfigurationResponse> applyConfigurationInvoker(
        ApplyConfigurationRequest request) {
        return new SyncInvoker<ApplyConfigurationRequest, ApplyConfigurationResponse>(request,
            GaussDBforNoSQLMeta.applyConfiguration, hcClient);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加或删除指定数据库实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchTagActionRequest 请求对象
     * @return BatchTagActionResponse
     */
    public BatchTagActionResponse batchTagAction(BatchTagActionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.batchTagAction);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加或删除指定数据库实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchTagActionRequest 请求对象
     * @return SyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    public SyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionInvoker(
        BatchTagActionRequest request) {
        return new SyncInvoker<BatchTagActionRequest, BatchTagActionResponse>(request,
            GaussDBforNoSQLMeta.batchTagAction, hcClient);
    }

    /**
     * 校验实例是否可以与指定实例建立/解除容灾关系
     *
     * 校验实例是否可以与指定实例建立/解除容灾关系。若接口返回成功，表示可以与指定实例建立/解除容灾关系。
     * 该接口需要对建立/解除容灾关系的两个实例各调用一次，2次调用都响应成功才能进行容灾关系的搭建/解除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckDisasterRecoveryOperationRequest 请求对象
     * @return CheckDisasterRecoveryOperationResponse
     */
    public CheckDisasterRecoveryOperationResponse checkDisasterRecoveryOperation(
        CheckDisasterRecoveryOperationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.checkDisasterRecoveryOperation);
    }

    /**
     * 校验实例是否可以与指定实例建立/解除容灾关系
     *
     * 校验实例是否可以与指定实例建立/解除容灾关系。若接口返回成功，表示可以与指定实例建立/解除容灾关系。
     * 该接口需要对建立/解除容灾关系的两个实例各调用一次，2次调用都响应成功才能进行容灾关系的搭建/解除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckDisasterRecoveryOperationRequest 请求对象
     * @return SyncInvoker<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse>
     */
    public SyncInvoker<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse> checkDisasterRecoveryOperationInvoker(
        CheckDisasterRecoveryOperationRequest request) {
        return new SyncInvoker<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse>(request,
            GaussDBforNoSQLMeta.checkDisasterRecoveryOperation, hcClient);
    }

    /**
     * 判断弱密码
     *
     * 判断弱密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckWeekPasswordRequest 请求对象
     * @return CheckWeekPasswordResponse
     */
    public CheckWeekPasswordResponse checkWeekPassword(CheckWeekPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.checkWeekPassword);
    }

    /**
     * 判断弱密码
     *
     * 判断弱密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckWeekPasswordRequest 请求对象
     * @return SyncInvoker<CheckWeekPasswordRequest, CheckWeekPasswordResponse>
     */
    public SyncInvoker<CheckWeekPasswordRequest, CheckWeekPasswordResponse> checkWeekPasswordInvoker(
        CheckWeekPasswordRequest request) {
        return new SyncInvoker<CheckWeekPasswordRequest, CheckWeekPasswordResponse>(request,
            GaussDBforNoSQLMeta.checkWeekPassword, hcClient);
    }

    /**
     * 参数模板比较
     *
     * 比较两个参数模板之间的差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CompareConfigurationRequest 请求对象
     * @return CompareConfigurationResponse
     */
    public CompareConfigurationResponse compareConfiguration(CompareConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.compareConfiguration);
    }

    /**
     * 参数模板比较
     *
     * 比较两个参数模板之间的差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CompareConfigurationRequest 请求对象
     * @return SyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse>
     */
    public SyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse> compareConfigurationInvoker(
        CompareConfigurationRequest request) {
        return new SyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse>(request,
            GaussDBforNoSQLMeta.compareConfiguration, hcClient);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyConfigurationRequest 请求对象
     * @return CopyConfigurationResponse
     */
    public CopyConfigurationResponse copyConfiguration(CopyConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.copyConfiguration);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyConfigurationRequest 请求对象
     * @return SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>
     */
    public SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse> copyConfigurationInvoker(
        CopyConfigurationRequest request) {
        return new SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>(request,
            GaussDBforNoSQLMeta.copyConfiguration, hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBackRequest 请求对象
     * @return CreateBackResponse
     */
    public CreateBackResponse createBack(CreateBackRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.createBack);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBackRequest 请求对象
     * @return SyncInvoker<CreateBackRequest, CreateBackResponse>
     */
    public SyncInvoker<CreateBackRequest, CreateBackResponse> createBackInvoker(CreateBackRequest request) {
        return new SyncInvoker<CreateBackRequest, CreateBackResponse>(request, GaussDBforNoSQLMeta.createBack,
            hcClient);
    }

    /**
     * ‘创建冷数据存储’
     *
     * ‘创建冷数据存储’
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateColdVolumeRequest 请求对象
     * @return CreateColdVolumeResponse
     */
    public CreateColdVolumeResponse createColdVolume(CreateColdVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.createColdVolume);
    }

    /**
     * ‘创建冷数据存储’
     *
     * ‘创建冷数据存储’
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateColdVolumeRequest 请求对象
     * @return SyncInvoker<CreateColdVolumeRequest, CreateColdVolumeResponse>
     */
    public SyncInvoker<CreateColdVolumeRequest, CreateColdVolumeResponse> createColdVolumeInvoker(
        CreateColdVolumeRequest request) {
        return new SyncInvoker<CreateColdVolumeRequest, CreateColdVolumeResponse>(request,
            GaussDBforNoSQLMeta.createColdVolume, hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConfigurationRequest 请求对象
     * @return CreateConfigurationResponse
     */
    public CreateConfigurationResponse createConfiguration(CreateConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.createConfiguration);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConfigurationRequest 请求对象
     * @return SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>
     */
    public SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> createConfigurationInvoker(
        CreateConfigurationRequest request) {
        return new SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>(request,
            GaussDBforNoSQLMeta.createConfiguration, hcClient);
    }

    /**
     * 创建Redis数据库账号
     *
     * 在Redis实例中创建数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDbUserRequest 请求对象
     * @return CreateDbUserResponse
     */
    public CreateDbUserResponse createDbUser(CreateDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.createDbUser);
    }

    /**
     * 创建Redis数据库账号
     *
     * 在Redis实例中创建数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDbUserRequest 请求对象
     * @return SyncInvoker<CreateDbUserRequest, CreateDbUserResponse>
     */
    public SyncInvoker<CreateDbUserRequest, CreateDbUserResponse> createDbUserInvoker(CreateDbUserRequest request) {
        return new SyncInvoker<CreateDbUserRequest, CreateDbUserResponse>(request, GaussDBforNoSQLMeta.createDbUser,
            hcClient);
    }

    /**
     * 搭建实例与特定实例的容灾关系
     *
     * 搭建实例与特定实例的容灾关系。 该接口需要对搭建容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功搭建容灾关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDisasterRecoveryRequest 请求对象
     * @return CreateDisasterRecoveryResponse
     */
    public CreateDisasterRecoveryResponse createDisasterRecovery(CreateDisasterRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.createDisasterRecovery);
    }

    /**
     * 搭建实例与特定实例的容灾关系
     *
     * 搭建实例与特定实例的容灾关系。 该接口需要对搭建容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功搭建容灾关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDisasterRecoveryRequest 请求对象
     * @return SyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse>
     */
    public SyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> createDisasterRecoveryInvoker(
        CreateDisasterRecoveryRequest request) {
        return new SyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse>(request,
            GaussDBforNoSQLMeta.createDisasterRecovery, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.createInstance);
    }

    /**
     * 创建实例
     *
     * 创建数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request,
            GaussDBforNoSQLMeta.createInstance, hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackupRequest 请求对象
     * @return DeleteBackupResponse
     */
    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteBackup);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackupRequest 请求对象
     * @return SyncInvoker<DeleteBackupRequest, DeleteBackupResponse>
     */
    public SyncInvoker<DeleteBackupRequest, DeleteBackupResponse> deleteBackupInvoker(DeleteBackupRequest request) {
        return new SyncInvoker<DeleteBackupRequest, DeleteBackupResponse>(request, GaussDBforNoSQLMeta.deleteBackup,
            hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除指定参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return DeleteConfigurationResponse
     */
    public DeleteConfigurationResponse deleteConfiguration(DeleteConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteConfiguration);
    }

    /**
     * 删除参数模板
     *
     * 删除指定参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>
     */
    public SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationInvoker(
        DeleteConfigurationRequest request) {
        return new SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>(request,
            GaussDBforNoSQLMeta.deleteConfiguration, hcClient);
    }

    /**
     * 删除Redis数据库账号
     *
     * 删除Redis实例的数据库账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDbUserRequest 请求对象
     * @return DeleteDbUserResponse
     */
    public DeleteDbUserResponse deleteDbUser(DeleteDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteDbUser);
    }

    /**
     * 删除Redis数据库账号
     *
     * 删除Redis实例的数据库账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDbUserRequest 请求对象
     * @return SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserInvoker(DeleteDbUserRequest request) {
        return new SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>(request, GaussDBforNoSQLMeta.deleteDbUser,
            hcClient);
    }

    /**
     * 解除实例与特定实例的容灾关系
     *
     * 解除实例与特定实例的容灾关系。 该接口需要对搭建容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功解除容灾关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDisasterRecoveryRequest 请求对象
     * @return DeleteDisasterRecoveryResponse
     */
    public DeleteDisasterRecoveryResponse deleteDisasterRecovery(DeleteDisasterRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteDisasterRecovery);
    }

    /**
     * 解除实例与特定实例的容灾关系
     *
     * 解除实例与特定实例的容灾关系。 该接口需要对搭建容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功解除容灾关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDisasterRecoveryRequest 请求对象
     * @return SyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse>
     */
    public SyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> deleteDisasterRecoveryInvoker(
        DeleteDisasterRecoveryRequest request) {
        return new SyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse>(request,
            GaussDBforNoSQLMeta.deleteDisasterRecovery, hcClient);
    }

    /**
     * 删除扩容失败的节点
     *
     * 删除扩容失败的节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnlargeFailNodeRequest 请求对象
     * @return DeleteEnlargeFailNodeResponse
     */
    public DeleteEnlargeFailNodeResponse deleteEnlargeFailNode(DeleteEnlargeFailNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteEnlargeFailNode);
    }

    /**
     * 删除扩容失败的节点
     *
     * 删除扩容失败的节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnlargeFailNodeRequest 请求对象
     * @return SyncInvoker<DeleteEnlargeFailNodeRequest, DeleteEnlargeFailNodeResponse>
     */
    public SyncInvoker<DeleteEnlargeFailNodeRequest, DeleteEnlargeFailNodeResponse> deleteEnlargeFailNodeInvoker(
        DeleteEnlargeFailNodeRequest request) {
        return new SyncInvoker<DeleteEnlargeFailNodeRequest, DeleteEnlargeFailNodeResponse>(request,
            GaussDBforNoSQLMeta.deleteEnlargeFailNode, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request,
            GaussDBforNoSQLMeta.deleteInstance, hcClient);
    }

    /**
     * 扩容指定集群实例的节点数量
     *
     * 扩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandInstanceNodeRequest 请求对象
     * @return ExpandInstanceNodeResponse
     */
    public ExpandInstanceNodeResponse expandInstanceNode(ExpandInstanceNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.expandInstanceNode);
    }

    /**
     * 扩容指定集群实例的节点数量
     *
     * 扩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandInstanceNodeRequest 请求对象
     * @return SyncInvoker<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse>
     */
    public SyncInvoker<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse> expandInstanceNodeInvoker(
        ExpandInstanceNodeRequest request) {
        return new SyncInvoker<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse>(request,
            GaussDBforNoSQLMeta.expandInstanceNode, hcClient);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailableFlavorInfosRequest 请求对象
     * @return ListAvailableFlavorInfosResponse
     */
    public ListAvailableFlavorInfosResponse listAvailableFlavorInfos(ListAvailableFlavorInfosRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listAvailableFlavorInfos);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailableFlavorInfosRequest 请求对象
     * @return SyncInvoker<ListAvailableFlavorInfosRequest, ListAvailableFlavorInfosResponse>
     */
    public SyncInvoker<ListAvailableFlavorInfosRequest, ListAvailableFlavorInfosResponse> listAvailableFlavorInfosInvoker(
        ListAvailableFlavorInfosRequest request) {
        return new SyncInvoker<ListAvailableFlavorInfosRequest, ListAvailableFlavorInfosResponse>(request,
            GaussDBforNoSQLMeta.listAvailableFlavorInfos, hcClient);
    }

    /**
     * 查询支持参数模板的引擎信息
     *
     * 查询支持参数模板的引擎信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationDatastoresRequest 请求对象
     * @return ListConfigurationDatastoresResponse
     */
    public ListConfigurationDatastoresResponse listConfigurationDatastores(ListConfigurationDatastoresRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listConfigurationDatastores);
    }

    /**
     * 查询支持参数模板的引擎信息
     *
     * 查询支持参数模板的引擎信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationDatastoresRequest 请求对象
     * @return SyncInvoker<ListConfigurationDatastoresRequest, ListConfigurationDatastoresResponse>
     */
    public SyncInvoker<ListConfigurationDatastoresRequest, ListConfigurationDatastoresResponse> listConfigurationDatastoresInvoker(
        ListConfigurationDatastoresRequest request) {
        return new SyncInvoker<ListConfigurationDatastoresRequest, ListConfigurationDatastoresResponse>(request,
            GaussDBforNoSQLMeta.listConfigurationDatastores, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationTemplatesRequest 请求对象
     * @return ListConfigurationTemplatesResponse
     */
    public ListConfigurationTemplatesResponse listConfigurationTemplates(ListConfigurationTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listConfigurationTemplates);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationTemplatesRequest 请求对象
     * @return SyncInvoker<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse>
     */
    public SyncInvoker<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse> listConfigurationTemplatesInvoker(
        ListConfigurationTemplatesRequest request) {
        return new SyncInvoker<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse>(request,
            GaussDBforNoSQLMeta.listConfigurationTemplates, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationsRequest 请求对象
     * @return ListConfigurationsResponse
     */
    public ListConfigurationsResponse listConfigurations(ListConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listConfigurations);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationsRequest 请求对象
     * @return SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsInvoker(
        ListConfigurationsRequest request) {
        return new SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>(request,
            GaussDBforNoSQLMeta.listConfigurations, hcClient);
    }

    /**
     * 查询指定实例类型的数据库版本信息
     *
     * 查询指定实例类型的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatastoresRequest 请求对象
     * @return ListDatastoresResponse
     */
    public ListDatastoresResponse listDatastores(ListDatastoresRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listDatastores);
    }

    /**
     * 查询指定实例类型的数据库版本信息
     *
     * 查询指定实例类型的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatastoresRequest 请求对象
     * @return SyncInvoker<ListDatastoresRequest, ListDatastoresResponse>
     */
    public SyncInvoker<ListDatastoresRequest, ListDatastoresResponse> listDatastoresInvoker(
        ListDatastoresRequest request) {
        return new SyncInvoker<ListDatastoresRequest, ListDatastoresResponse>(request,
            GaussDBforNoSQLMeta.listDatastores, hcClient);
    }

    /**
     * 获取Redis数据库账号列表和详情
     *
     * 获取Redis数据库账号列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDbUsersRequest 请求对象
     * @return ListDbUsersResponse
     */
    public ListDbUsersResponse listDbUsers(ListDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listDbUsers);
    }

    /**
     * 获取Redis数据库账号列表和详情
     *
     * 获取Redis数据库账号列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDbUsersRequest 请求对象
     * @return SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public SyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersInvoker(ListDbUsersRequest request) {
        return new SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>(request, GaussDBforNoSQLMeta.listDbUsers,
            hcClient);
    }

    /**
     * 查询专属资源列表
     *
     * 查询专属资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDedicatedResourcesRequest 请求对象
     * @return ListDedicatedResourcesResponse
     */
    public ListDedicatedResourcesResponse listDedicatedResources(ListDedicatedResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listDedicatedResources);
    }

    /**
     * 查询专属资源列表
     *
     * 查询专属资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDedicatedResourcesRequest 请求对象
     * @return SyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse>
     */
    public SyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> listDedicatedResourcesInvoker(
        ListDedicatedResourcesRequest request) {
        return new SyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse>(request,
            GaussDBforNoSQLMeta.listDedicatedResources, hcClient);
    }

    /**
     * 查询企业项目配额
     *
     * 查询企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEpsQuotasRequest 请求对象
     * @return ListEpsQuotasResponse
     */
    public ListEpsQuotasResponse listEpsQuotas(ListEpsQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listEpsQuotas);
    }

    /**
     * 查询企业项目配额
     *
     * 查询企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEpsQuotasRequest 请求对象
     * @return SyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse>
     */
    public SyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse> listEpsQuotasInvoker(ListEpsQuotasRequest request) {
        return new SyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse>(request, GaussDBforNoSQLMeta.listEpsQuotas,
            hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询指定条件下的实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorInfosRequest 请求对象
     * @return ListFlavorInfosResponse
     */
    public ListFlavorInfosResponse listFlavorInfos(ListFlavorInfosRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listFlavorInfos);
    }

    /**
     * 查询数据库规格
     *
     * 查询指定条件下的实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorInfosRequest 请求对象
     * @return SyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse>
     */
    public SyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse> listFlavorInfosInvoker(
        ListFlavorInfosRequest request) {
        return new SyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse>(request,
            GaussDBforNoSQLMeta.listFlavorInfos, hcClient);
    }

    /**
     * 查询指定条件下的所有实例规格信息
     *
     * 查询指定条件下的所有实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listFlavors);
    }

    /**
     * 查询指定条件下的所有实例规格信息
     *
     * 查询指定条件下的所有实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, GaussDBforNoSQLMeta.listFlavors,
            hcClient);
    }

    /**
     * 获取Redis实例数据库列表
     *
     * 获取Redis实例数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceDatabasesRequest 请求对象
     * @return ListInstanceDatabasesResponse
     */
    public ListInstanceDatabasesResponse listInstanceDatabases(ListInstanceDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listInstanceDatabases);
    }

    /**
     * 获取Redis实例数据库列表
     *
     * 获取Redis实例数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceDatabasesRequest 请求对象
     * @return SyncInvoker<ListInstanceDatabasesRequest, ListInstanceDatabasesResponse>
     */
    public SyncInvoker<ListInstanceDatabasesRequest, ListInstanceDatabasesResponse> listInstanceDatabasesInvoker(
        ListInstanceDatabasesRequest request) {
        return new SyncInvoker<ListInstanceDatabasesRequest, ListInstanceDatabasesResponse>(request,
            GaussDBforNoSQLMeta.listInstanceDatabases, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return ListInstanceTagsResponse
     */
    public ListInstanceTagsResponse listInstanceTags(ListInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listInstanceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsInvoker(
        ListInstanceTagsRequest request) {
        return new SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>(request,
            GaussDBforNoSQLMeta.listInstanceTags, hcClient);
    }

    /**
     * 查询实例列表和详情
     *
     * 根据指定条件查询数据库实例列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listInstances);
    }

    /**
     * 查询实例列表和详情
     *
     * 根据指定条件查询数据库实例列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, GaussDBforNoSQLMeta.listInstances,
            hcClient);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesByResourceTagsRequest 请求对象
     * @return ListInstancesByResourceTagsResponse
     */
    public ListInstancesByResourceTagsResponse listInstancesByResourceTags(ListInstancesByResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listInstancesByResourceTags);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesByResourceTagsRequest 请求对象
     * @return SyncInvoker<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse>
     */
    public SyncInvoker<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse> listInstancesByResourceTagsInvoker(
        ListInstancesByResourceTagsRequest request) {
        return new SyncInvoker<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse>(request,
            GaussDBforNoSQLMeta.listInstancesByResourceTags, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesByTagsRequest 请求对象
     * @return ListInstancesByTagsResponse
     */
    public ListInstancesByTagsResponse listInstancesByTags(ListInstancesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listInstancesByTags);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesByTagsRequest 请求对象
     * @return SyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse>
     */
    public SyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTagsInvoker(
        ListInstancesByTagsRequest request) {
        return new SyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse>(request,
            GaussDBforNoSQLMeta.listInstancesByTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询指定项目的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询指定项目的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request,
            GaussDBforNoSQLMeta.listProjectTags, hcClient);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站所有引擎的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecycleInstancesRequest 请求对象
     * @return ListRecycleInstancesResponse
     */
    public ListRecycleInstancesResponse listRecycleInstances(ListRecycleInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listRecycleInstances);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站所有引擎的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecycleInstancesRequest 请求对象
     * @return SyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>
     */
    public SyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstancesInvoker(
        ListRecycleInstancesRequest request) {
        return new SyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>(request,
            GaussDBforNoSQLMeta.listRecycleInstances, hcClient);
    }

    /**
     * 查询实例可恢复的时间段
     *
     * 查询实例可恢复的时间段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRestoreTimeRequest 请求对象
     * @return ListRestoreTimeResponse
     */
    public ListRestoreTimeResponse listRestoreTime(ListRestoreTimeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listRestoreTime);
    }

    /**
     * 查询实例可恢复的时间段
     *
     * 查询实例可恢复的时间段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRestoreTimeRequest 请求对象
     * @return SyncInvoker<ListRestoreTimeRequest, ListRestoreTimeResponse>
     */
    public SyncInvoker<ListRestoreTimeRequest, ListRestoreTimeResponse> listRestoreTimeInvoker(
        ListRestoreTimeRequest request) {
        return new SyncInvoker<ListRestoreTimeRequest, ListRestoreTimeResponse>(request,
            GaussDBforNoSQLMeta.listRestoreTime, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowLogsRequest 请求对象
     * @return ListSlowLogsResponse
     */
    public ListSlowLogsResponse listSlowLogs(ListSlowLogsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listSlowLogs);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowLogsRequest 请求对象
     * @return SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>
     */
    public SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsInvoker(ListSlowLogsRequest request) {
        return new SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>(request, GaussDBforNoSQLMeta.listSlowLogs,
            hcClient);
    }

    /**
     * 修改Redis数据库帐号权限
     *
     * 修改Redis数据库帐号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyDbUserPrivilegeRequest 请求对象
     * @return ModifyDbUserPrivilegeResponse
     */
    public ModifyDbUserPrivilegeResponse modifyDbUserPrivilege(ModifyDbUserPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.modifyDbUserPrivilege);
    }

    /**
     * 修改Redis数据库帐号权限
     *
     * 修改Redis数据库帐号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyDbUserPrivilegeRequest 请求对象
     * @return SyncInvoker<ModifyDbUserPrivilegeRequest, ModifyDbUserPrivilegeResponse>
     */
    public SyncInvoker<ModifyDbUserPrivilegeRequest, ModifyDbUserPrivilegeResponse> modifyDbUserPrivilegeInvoker(
        ModifyDbUserPrivilegeRequest request) {
        return new SyncInvoker<ModifyDbUserPrivilegeRequest, ModifyDbUserPrivilegeResponse>(request,
            GaussDBforNoSQLMeta.modifyDbUserPrivilege, hcClient);
    }

    /**
     * 修改企业项目配额
     *
     * 修改企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyEpsQuotasRequest 请求对象
     * @return ModifyEpsQuotasResponse
     */
    public ModifyEpsQuotasResponse modifyEpsQuotas(ModifyEpsQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.modifyEpsQuotas);
    }

    /**
     * 修改企业项目配额
     *
     * 修改企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyEpsQuotasRequest 请求对象
     * @return SyncInvoker<ModifyEpsQuotasRequest, ModifyEpsQuotasResponse>
     */
    public SyncInvoker<ModifyEpsQuotasRequest, ModifyEpsQuotasResponse> modifyEpsQuotasInvoker(
        ModifyEpsQuotasRequest request) {
        return new SyncInvoker<ModifyEpsQuotasRequest, ModifyEpsQuotasResponse>(request,
            GaussDBforNoSQLMeta.modifyEpsQuotas, hcClient);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库实例的端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyPortRequest 请求对象
     * @return ModifyPortResponse
     */
    public ModifyPortResponse modifyPort(ModifyPortRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.modifyPort);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库实例的端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyPortRequest 请求对象
     * @return SyncInvoker<ModifyPortRequest, ModifyPortResponse>
     */
    public SyncInvoker<ModifyPortRequest, ModifyPortResponse> modifyPortInvoker(ModifyPortRequest request) {
        return new SyncInvoker<ModifyPortRequest, ModifyPortResponse>(request, GaussDBforNoSQLMeta.modifyPort,
            hcClient);
    }

    /**
     * 绑定/解绑弹性公网IP
     *
     * 实例下的节点绑定弹性公网IP/解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyPublicIpRequest 请求对象
     * @return ModifyPublicIpResponse
     */
    public ModifyPublicIpResponse modifyPublicIp(ModifyPublicIpRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.modifyPublicIp);
    }

    /**
     * 绑定/解绑弹性公网IP
     *
     * 实例下的节点绑定弹性公网IP/解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyPublicIpRequest 请求对象
     * @return SyncInvoker<ModifyPublicIpRequest, ModifyPublicIpResponse>
     */
    public SyncInvoker<ModifyPublicIpRequest, ModifyPublicIpResponse> modifyPublicIpInvoker(
        ModifyPublicIpRequest request) {
        return new SyncInvoker<ModifyPublicIpRequest, ModifyPublicIpResponse>(request,
            GaussDBforNoSQLMeta.modifyPublicIp, hcClient);
    }

    /**
     * 变更实例存储容量
     *
     * 变更实例的存储容量大小
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyVolumeRequest 请求对象
     * @return ModifyVolumeResponse
     */
    public ModifyVolumeResponse modifyVolume(ModifyVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.modifyVolume);
    }

    /**
     * 变更实例存储容量
     *
     * 变更实例的存储容量大小
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyVolumeRequest 请求对象
     * @return SyncInvoker<ModifyVolumeRequest, ModifyVolumeResponse>
     */
    public SyncInvoker<ModifyVolumeRequest, ModifyVolumeResponse> modifyVolumeInvoker(ModifyVolumeRequest request) {
        return new SyncInvoker<ModifyVolumeRequest, ModifyVolumeResponse>(request, GaussDBforNoSQLMeta.modifyVolume,
            hcClient);
    }

    /**
     * 暂停/恢复具备容灾关系的实例数据同步
     *
     * 该接口用于暂停/恢复具备容灾关系的实例数据同步。
     * 
     * 该接口需要对具备容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功暂停/恢复容灾实例数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PauseResumeDataSynchronizationRequest 请求对象
     * @return PauseResumeDataSynchronizationResponse
     */
    public PauseResumeDataSynchronizationResponse pauseResumeDataSynchronization(
        PauseResumeDataSynchronizationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.pauseResumeDataSynchronization);
    }

    /**
     * 暂停/恢复具备容灾关系的实例数据同步
     *
     * 该接口用于暂停/恢复具备容灾关系的实例数据同步。
     * 
     * 该接口需要对具备容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功暂停/恢复容灾实例数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PauseResumeDataSynchronizationRequest 请求对象
     * @return SyncInvoker<PauseResumeDataSynchronizationRequest, PauseResumeDataSynchronizationResponse>
     */
    public SyncInvoker<PauseResumeDataSynchronizationRequest, PauseResumeDataSynchronizationResponse> pauseResumeDataSynchronizationInvoker(
        PauseResumeDataSynchronizationRequest request) {
        return new SyncInvoker<PauseResumeDataSynchronizationRequest, PauseResumeDataSynchronizationResponse>(request,
            GaussDBforNoSQLMeta.pauseResumeDataSynchronization, hcClient);
    }

    /**
     * 重置Redis数据库账号密码
     *
     * 重置Redis数据库账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetDbUserPasswordRequest 请求对象
     * @return ResetDbUserPasswordResponse
     */
    public ResetDbUserPasswordResponse resetDbUserPassword(ResetDbUserPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.resetDbUserPassword);
    }

    /**
     * 重置Redis数据库账号密码
     *
     * 重置Redis数据库账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetDbUserPasswordRequest 请求对象
     * @return SyncInvoker<ResetDbUserPasswordRequest, ResetDbUserPasswordResponse>
     */
    public SyncInvoker<ResetDbUserPasswordRequest, ResetDbUserPasswordResponse> resetDbUserPasswordInvoker(
        ResetDbUserPasswordRequest request) {
        return new SyncInvoker<ResetDbUserPasswordRequest, ResetDbUserPasswordResponse>(request,
            GaussDBforNoSQLMeta.resetDbUserPassword, hcClient);
    }

    /**
     * 修改实例的管理员密码
     *
     * 修改实例的管理员密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
     * @return ResetPasswordResponse
     */
    public ResetPasswordResponse resetPassword(ResetPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.resetPassword);
    }

    /**
     * 修改实例的管理员密码
     *
     * 修改实例的管理员密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
     * @return SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public SyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordInvoker(ResetPasswordRequest request) {
        return new SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, GaussDBforNoSQLMeta.resetPassword,
            hcClient);
    }

    /**
     * 扩容冷数据存储
     *
     * 扩容冷数据存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeColdVolumeRequest 请求对象
     * @return ResizeColdVolumeResponse
     */
    public ResizeColdVolumeResponse resizeColdVolume(ResizeColdVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.resizeColdVolume);
    }

    /**
     * 扩容冷数据存储
     *
     * 扩容冷数据存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeColdVolumeRequest 请求对象
     * @return SyncInvoker<ResizeColdVolumeRequest, ResizeColdVolumeResponse>
     */
    public SyncInvoker<ResizeColdVolumeRequest, ResizeColdVolumeResponse> resizeColdVolumeInvoker(
        ResizeColdVolumeRequest request) {
        return new SyncInvoker<ResizeColdVolumeRequest, ResizeColdVolumeResponse>(request,
            GaussDBforNoSQLMeta.resizeColdVolume, hcClient);
    }

    /**
     * 变更实例规格
     *
     * 变更实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceRequest 请求对象
     * @return ResizeInstanceResponse
     */
    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.resizeInstance);
    }

    /**
     * 变更实例规格
     *
     * 变更实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceRequest 请求对象
     * @return SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceInvoker(
        ResizeInstanceRequest request) {
        return new SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>(request,
            GaussDBforNoSQLMeta.resizeInstance, hcClient);
    }

    /**
     * 扩容实例存储容量
     *
     * 扩容实例的存储容量大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceVolumeRequest 请求对象
     * @return ResizeInstanceVolumeResponse
     */
    public ResizeInstanceVolumeResponse resizeInstanceVolume(ResizeInstanceVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.resizeInstanceVolume);
    }

    /**
     * 扩容实例存储容量
     *
     * 扩容实例的存储容量大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceVolumeRequest 请求对象
     * @return SyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse>
     */
    public SyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> resizeInstanceVolumeInvoker(
        ResizeInstanceVolumeRequest request) {
        return new SyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse>(request,
            GaussDBforNoSQLMeta.resizeInstanceVolume, hcClient);
    }

    /**
     * 重启实例的数据库服务
     *
     * 重启实例的数据库服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartInstanceRequest 请求对象
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.restartInstance);
    }

    /**
     * 重启实例的数据库服务
     *
     * 重启实例的数据库服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartInstanceRequest 请求对象
     * @return SyncInvoker<RestartInstanceRequest, RestartInstanceResponse>
     */
    public SyncInvoker<RestartInstanceRequest, RestartInstanceResponse> restartInstanceInvoker(
        RestartInstanceRequest request) {
        return new SyncInvoker<RestartInstanceRequest, RestartInstanceResponse>(request,
            GaussDBforNoSQLMeta.restartInstance, hcClient);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreExistingInstanceRequest 请求对象
     * @return RestoreExistingInstanceResponse
     */
    public RestoreExistingInstanceResponse restoreExistingInstance(RestoreExistingInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.restoreExistingInstance);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreExistingInstanceRequest 请求对象
     * @return SyncInvoker<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse>
     */
    public SyncInvoker<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse> restoreExistingInstanceInvoker(
        RestoreExistingInstanceRequest request) {
        return new SyncInvoker<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse>(request,
            GaussDBforNoSQLMeta.restoreExistingInstance, hcClient);
    }

    /**
     * 设置磁盘自动扩容策略
     *
     * 设置磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetAutoEnlargePolicyRequest 请求对象
     * @return SetAutoEnlargePolicyResponse
     */
    public SetAutoEnlargePolicyResponse setAutoEnlargePolicy(SetAutoEnlargePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.setAutoEnlargePolicy);
    }

    /**
     * 设置磁盘自动扩容策略
     *
     * 设置磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetAutoEnlargePolicyRequest 请求对象
     * @return SyncInvoker<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse>
     */
    public SyncInvoker<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse> setAutoEnlargePolicyInvoker(
        SetAutoEnlargePolicyRequest request) {
        return new SyncInvoker<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse>(request,
            GaussDBforNoSQLMeta.setAutoEnlargePolicy, hcClient);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return SetBackupPolicyResponse
     */
    public SetBackupPolicyResponse setBackupPolicy(SetBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>
     */
    public SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyInvoker(
        SetBackupPolicyRequest request) {
        return new SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>(request,
            GaussDBforNoSQLMeta.setBackupPolicy, hcClient);
    }

    /**
     * 设置回收策略
     *
     * 设置已删除实例保留天数，修改保留天数后删除的实例按照新的天数保留，修改之前已在回收站的实例保留天数不变。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRecyclePolicyRequest 请求对象
     * @return SetRecyclePolicyResponse
     */
    public SetRecyclePolicyResponse setRecyclePolicy(SetRecyclePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.setRecyclePolicy);
    }

    /**
     * 设置回收策略
     *
     * 设置已删除实例保留天数，修改保留天数后删除的实例按照新的天数保留，修改之前已在回收站的实例保留天数不变。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRecyclePolicyRequest 请求对象
     * @return SyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse>
     */
    public SyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicyInvoker(
        SetRecyclePolicyRequest request) {
        return new SyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse>(request,
            GaussDBforNoSQLMeta.setRecyclePolicy, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllInstancesBackupsRequest 请求对象
     * @return ShowAllInstancesBackupsResponse
     */
    public ShowAllInstancesBackupsResponse showAllInstancesBackups(ShowAllInstancesBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showAllInstancesBackups);
    }

    /**
     * 查询备份列表
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllInstancesBackupsRequest 请求对象
     * @return SyncInvoker<ShowAllInstancesBackupsRequest, ShowAllInstancesBackupsResponse>
     */
    public SyncInvoker<ShowAllInstancesBackupsRequest, ShowAllInstancesBackupsResponse> showAllInstancesBackupsInvoker(
        ShowAllInstancesBackupsRequest request) {
        return new SyncInvoker<ShowAllInstancesBackupsRequest, ShowAllInstancesBackupsResponse>(request,
            GaussDBforNoSQLMeta.showAllInstancesBackups, hcClient);
    }

    /**
     * 查询备份列表（推荐）
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllInstancesBackupsNewRequest 请求对象
     * @return ShowAllInstancesBackupsNewResponse
     */
    public ShowAllInstancesBackupsNewResponse showAllInstancesBackupsNew(ShowAllInstancesBackupsNewRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showAllInstancesBackupsNew);
    }

    /**
     * 查询备份列表（推荐）
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllInstancesBackupsNewRequest 请求对象
     * @return SyncInvoker<ShowAllInstancesBackupsNewRequest, ShowAllInstancesBackupsNewResponse>
     */
    public SyncInvoker<ShowAllInstancesBackupsNewRequest, ShowAllInstancesBackupsNewResponse> showAllInstancesBackupsNewInvoker(
        ShowAllInstancesBackupsNewRequest request) {
        return new SyncInvoker<ShowAllInstancesBackupsNewRequest, ShowAllInstancesBackupsNewResponse>(request,
            GaussDBforNoSQLMeta.showAllInstancesBackupsNew, hcClient);
    }

    /**
     * 查询参数模板可应用的实例列表
     *
     * 查询参数模板可应用的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicableInstancesRequest 请求对象
     * @return ShowApplicableInstancesResponse
     */
    public ShowApplicableInstancesResponse showApplicableInstances(ShowApplicableInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showApplicableInstances);
    }

    /**
     * 查询参数模板可应用的实例列表
     *
     * 查询参数模板可应用的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicableInstancesRequest 请求对象
     * @return SyncInvoker<ShowApplicableInstancesRequest, ShowApplicableInstancesResponse>
     */
    public SyncInvoker<ShowApplicableInstancesRequest, ShowApplicableInstancesResponse> showApplicableInstancesInvoker(
        ShowApplicableInstancesRequest request) {
        return new SyncInvoker<ShowApplicableInstancesRequest, ShowApplicableInstancesResponse>(request,
            GaussDBforNoSQLMeta.showApplicableInstances, hcClient);
    }

    /**
     * 查询参数模板应用历史
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplyHistoryRequest 请求对象
     * @return ShowApplyHistoryResponse
     */
    public ShowApplyHistoryResponse showApplyHistory(ShowApplyHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showApplyHistory);
    }

    /**
     * 查询参数模板应用历史
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplyHistoryRequest 请求对象
     * @return SyncInvoker<ShowApplyHistoryRequest, ShowApplyHistoryResponse>
     */
    public SyncInvoker<ShowApplyHistoryRequest, ShowApplyHistoryResponse> showApplyHistoryInvoker(
        ShowApplyHistoryRequest request) {
        return new SyncInvoker<ShowApplyHistoryRequest, ShowApplyHistoryResponse>(request,
            GaussDBforNoSQLMeta.showApplyHistory, hcClient);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAutoEnlargePolicyRequest 请求对象
     * @return ShowAutoEnlargePolicyResponse
     */
    public ShowAutoEnlargePolicyResponse showAutoEnlargePolicy(ShowAutoEnlargePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showAutoEnlargePolicy);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAutoEnlargePolicyRequest 请求对象
     * @return SyncInvoker<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse>
     */
    public SyncInvoker<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse> showAutoEnlargePolicyInvoker(
        ShowAutoEnlargePolicyRequest request) {
        return new SyncInvoker<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse>(request,
            GaussDBforNoSQLMeta.showAutoEnlargePolicy, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return ShowBackupPolicyResponse
     */
    public ShowBackupPolicyResponse showBackupPolicy(ShowBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showBackupPolicy);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>
     */
    public SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyInvoker(
        ShowBackupPolicyRequest request) {
        return new SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>(request,
            GaussDBforNoSQLMeta.showBackupPolicy, hcClient);
    }

    /**
     * 获取指定参数模板的参数
     *
     * 获取指定参数模板的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationDetailRequest 请求对象
     * @return ShowConfigurationDetailResponse
     */
    public ShowConfigurationDetailResponse showConfigurationDetail(ShowConfigurationDetailRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showConfigurationDetail);
    }

    /**
     * 获取指定参数模板的参数
     *
     * 获取指定参数模板的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationDetailRequest 请求对象
     * @return SyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse>
     */
    public SyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> showConfigurationDetailInvoker(
        ShowConfigurationDetailRequest request) {
        return new SyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse>(request,
            GaussDBforNoSQLMeta.showConfigurationDetail, hcClient);
    }

    /**
     * 查询数据库错误日志信息
     *
     * 查询数据库错误日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowErrorLogRequest 请求对象
     * @return ShowErrorLogResponse
     */
    public ShowErrorLogResponse showErrorLog(ShowErrorLogRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showErrorLog);
    }

    /**
     * 查询数据库错误日志信息
     *
     * 查询数据库错误日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowErrorLogRequest 请求对象
     * @return SyncInvoker<ShowErrorLogRequest, ShowErrorLogResponse>
     */
    public SyncInvoker<ShowErrorLogRequest, ShowErrorLogResponse> showErrorLogInvoker(ShowErrorLogRequest request) {
        return new SyncInvoker<ShowErrorLogRequest, ShowErrorLogResponse>(request, GaussDBforNoSQLMeta.showErrorLog,
            hcClient);
    }

    /**
     * 获取指定实例的参数
     *
     * 获取指定实例的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceConfigurationRequest 请求对象
     * @return ShowInstanceConfigurationResponse
     */
    public ShowInstanceConfigurationResponse showInstanceConfiguration(ShowInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showInstanceConfiguration);
    }

    /**
     * 获取指定实例的参数
     *
     * 获取指定实例的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceConfigurationRequest 请求对象
     * @return SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>
     */
    public SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationInvoker(
        ShowInstanceConfigurationRequest request) {
        return new SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>(request,
            GaussDBforNoSQLMeta.showInstanceConfiguration, hcClient);
    }

    /**
     * 获取容灾实例主/备角色信息
     *
     * 该接口用于获取容灾实例主/备角色信息，以便后续容灾实例备升主和容灾实例主降备接口调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRoleRequest 请求对象
     * @return ShowInstanceRoleResponse
     */
    public ShowInstanceRoleResponse showInstanceRole(ShowInstanceRoleRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showInstanceRole);
    }

    /**
     * 获取容灾实例主/备角色信息
     *
     * 该接口用于获取容灾实例主/备角色信息，以便后续容灾实例备升主和容灾实例主降备接口调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRoleRequest 请求对象
     * @return SyncInvoker<ShowInstanceRoleRequest, ShowInstanceRoleResponse>
     */
    public SyncInvoker<ShowInstanceRoleRequest, ShowInstanceRoleResponse> showInstanceRoleInvoker(
        ShowInstanceRoleRequest request) {
        return new SyncInvoker<ShowInstanceRoleRequest, ShowInstanceRoleResponse>(request,
            GaussDBforNoSQLMeta.showInstanceRole, hcClient);
    }

    /**
     * 查询创建实例或扩容节点时需要的IP数量
     *
     * 查询创建实例或扩容节点时需要的IP数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIpNumRequirementRequest 请求对象
     * @return ShowIpNumRequirementResponse
     */
    public ShowIpNumRequirementResponse showIpNumRequirement(ShowIpNumRequirementRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showIpNumRequirement);
    }

    /**
     * 查询创建实例或扩容节点时需要的IP数量
     *
     * 查询创建实例或扩容节点时需要的IP数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIpNumRequirementRequest 请求对象
     * @return SyncInvoker<ShowIpNumRequirementRequest, ShowIpNumRequirementResponse>
     */
    public SyncInvoker<ShowIpNumRequirementRequest, ShowIpNumRequirementResponse> showIpNumRequirementInvoker(
        ShowIpNumRequirementRequest request) {
        return new SyncInvoker<ShowIpNumRequirementRequest, ShowIpNumRequirementResponse>(request,
            GaussDBforNoSQLMeta.showIpNumRequirement, hcClient);
    }

    /**
     * 查询实例参数的修改历史
     *
     * 查询实例参数的修改历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowModifyHistoryRequest 请求对象
     * @return ShowModifyHistoryResponse
     */
    public ShowModifyHistoryResponse showModifyHistory(ShowModifyHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showModifyHistory);
    }

    /**
     * 查询实例参数的修改历史
     *
     * 查询实例参数的修改历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowModifyHistoryRequest 请求对象
     * @return SyncInvoker<ShowModifyHistoryRequest, ShowModifyHistoryResponse>
     */
    public SyncInvoker<ShowModifyHistoryRequest, ShowModifyHistoryResponse> showModifyHistoryInvoker(
        ShowModifyHistoryRequest request) {
        return new SyncInvoker<ShowModifyHistoryRequest, ShowModifyHistoryResponse>(request,
            GaussDBforNoSQLMeta.showModifyHistory, hcClient);
    }

    /**
     * 获取容灾实例数据同步状态
     *
     * 获取容灾实例数据同步状态，主备实例id，数据同步指标值，以及倒换和切换场景下的RPO，RTO指标值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPauseResumeStutusRequest 请求对象
     * @return ShowPauseResumeStutusResponse
     */
    public ShowPauseResumeStutusResponse showPauseResumeStutus(ShowPauseResumeStutusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showPauseResumeStutus);
    }

    /**
     * 获取容灾实例数据同步状态
     *
     * 获取容灾实例数据同步状态，主备实例id，数据同步指标值，以及倒换和切换场景下的RPO，RTO指标值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPauseResumeStutusRequest 请求对象
     * @return SyncInvoker<ShowPauseResumeStutusRequest, ShowPauseResumeStutusResponse>
     */
    public SyncInvoker<ShowPauseResumeStutusRequest, ShowPauseResumeStutusResponse> showPauseResumeStutusInvoker(
        ShowPauseResumeStutusRequest request) {
        return new SyncInvoker<ShowPauseResumeStutusRequest, ShowPauseResumeStutusResponse>(request,
            GaussDBforNoSQLMeta.showPauseResumeStutus, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询单租户在GaussDBforNoSQL服务下的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showQuotas);
    }

    /**
     * 查询配额
     *
     * 查询单租户在GaussDBforNoSQL服务下的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, GaussDBforNoSQLMeta.showQuotas,
            hcClient);
    }

    /**
     * 查询回收策略
     *
     * 查询回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecyclePolicyRequest 请求对象
     * @return ShowRecyclePolicyResponse
     */
    public ShowRecyclePolicyResponse showRecyclePolicy(ShowRecyclePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showRecyclePolicy);
    }

    /**
     * 查询回收策略
     *
     * 查询回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecyclePolicyRequest 请求对象
     * @return SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>
     */
    public SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicyInvoker(
        ShowRecyclePolicyRequest request) {
        return new SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>(request,
            GaussDBforNoSQLMeta.showRecyclePolicy, hcClient);
    }

    /**
     * 查询可恢复的实例列表
     *
     * 查询用户可恢复的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRestorableListRequest 请求对象
     * @return ShowRestorableListResponse
     */
    public ShowRestorableListResponse showRestorableList(ShowRestorableListRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showRestorableList);
    }

    /**
     * 查询可恢复的实例列表
     *
     * 查询用户可恢复的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRestorableListRequest 请求对象
     * @return SyncInvoker<ShowRestorableListRequest, ShowRestorableListResponse>
     */
    public SyncInvoker<ShowRestorableListRequest, ShowRestorableListResponse> showRestorableListInvoker(
        ShowRestorableListRequest request) {
        return new SyncInvoker<ShowRestorableListRequest, ShowRestorableListResponse>(request,
            GaussDBforNoSQLMeta.showRestorableList, hcClient);
    }

    /**
     * 查询慢日志脱敏状态
     *
     * 查询慢日志脱敏状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSlowLogDesensitizationRequest 请求对象
     * @return ShowSlowLogDesensitizationResponse
     */
    public ShowSlowLogDesensitizationResponse showSlowLogDesensitization(ShowSlowLogDesensitizationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showSlowLogDesensitization);
    }

    /**
     * 查询慢日志脱敏状态
     *
     * 查询慢日志脱敏状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSlowLogDesensitizationRequest 请求对象
     * @return SyncInvoker<ShowSlowLogDesensitizationRequest, ShowSlowLogDesensitizationResponse>
     */
    public SyncInvoker<ShowSlowLogDesensitizationRequest, ShowSlowLogDesensitizationResponse> showSlowLogDesensitizationInvoker(
        ShowSlowLogDesensitizationRequest request) {
        return new SyncInvoker<ShowSlowLogDesensitizationRequest, ShowSlowLogDesensitizationResponse>(request,
            GaussDBforNoSQLMeta.showSlowLogDesensitization, hcClient);
    }

    /**
     * 缩容指定集群实例的节点数量
     *
     * 缩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShrinkInstanceNodeRequest 请求对象
     * @return ShrinkInstanceNodeResponse
     */
    public ShrinkInstanceNodeResponse shrinkInstanceNode(ShrinkInstanceNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.shrinkInstanceNode);
    }

    /**
     * 缩容指定集群实例的节点数量
     *
     * 缩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShrinkInstanceNodeRequest 请求对象
     * @return SyncInvoker<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse>
     */
    public SyncInvoker<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse> shrinkInstanceNodeInvoker(
        ShrinkInstanceNodeRequest request) {
        return new SyncInvoker<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse>(request,
            GaussDBforNoSQLMeta.shrinkInstanceNode, hcClient);
    }

    /**
     * 设置慢日志脱敏状态
     *
     * 设置慢日志脱敏状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSlowlogDesensitizationRequest 请求对象
     * @return SwitchSlowlogDesensitizationResponse
     */
    public SwitchSlowlogDesensitizationResponse switchSlowlogDesensitization(
        SwitchSlowlogDesensitizationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.switchSlowlogDesensitization);
    }

    /**
     * 设置慢日志脱敏状态
     *
     * 设置慢日志脱敏状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSlowlogDesensitizationRequest 请求对象
     * @return SyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse>
     */
    public SyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse> switchSlowlogDesensitizationInvoker(
        SwitchSlowlogDesensitizationRequest request) {
        return new SyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse>(request,
            GaussDBforNoSQLMeta.switchSlowlogDesensitization, hcClient);
    }

    /**
     * 切换实例SSL开关
     *
     * 切换实例SSL开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSslRequest 请求对象
     * @return SwitchSslResponse
     */
    public SwitchSslResponse switchSsl(SwitchSslRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.switchSsl);
    }

    /**
     * 切换实例SSL开关
     *
     * 切换实例SSL开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSslRequest 请求对象
     * @return SyncInvoker<SwitchSslRequest, SwitchSslResponse>
     */
    public SyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslInvoker(SwitchSslRequest request) {
        return new SyncInvoker<SwitchSslRequest, SwitchSslResponse>(request, GaussDBforNoSQLMeta.switchSsl, hcClient);
    }

    /**
     * 容灾实例备升主
     *
     * 该接口用于对已经搭建容灾关系的实例，将备实例升级为主实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchToMasterRequest 请求对象
     * @return SwitchToMasterResponse
     */
    public SwitchToMasterResponse switchToMaster(SwitchToMasterRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.switchToMaster);
    }

    /**
     * 容灾实例备升主
     *
     * 该接口用于对已经搭建容灾关系的实例，将备实例升级为主实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchToMasterRequest 请求对象
     * @return SyncInvoker<SwitchToMasterRequest, SwitchToMasterResponse>
     */
    public SyncInvoker<SwitchToMasterRequest, SwitchToMasterResponse> switchToMasterInvoker(
        SwitchToMasterRequest request) {
        return new SyncInvoker<SwitchToMasterRequest, SwitchToMasterResponse>(request,
            GaussDBforNoSQLMeta.switchToMaster, hcClient);
    }

    /**
     * 容灾实例主降备
     *
     * 该接口用于对已经搭建容灾关系的实例，将主实例降级为备实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchToSlaveRequest 请求对象
     * @return SwitchToSlaveResponse
     */
    public SwitchToSlaveResponse switchToSlave(SwitchToSlaveRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.switchToSlave);
    }

    /**
     * 容灾实例主降备
     *
     * 该接口用于对已经搭建容灾关系的实例，将主实例降级为备实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchToSlaveRequest 请求对象
     * @return SyncInvoker<SwitchToSlaveRequest, SwitchToSlaveResponse>
     */
    public SyncInvoker<SwitchToSlaveRequest, SwitchToSlaveResponse> switchToSlaveInvoker(SwitchToSlaveRequest request) {
        return new SyncInvoker<SwitchToSlaveRequest, SwitchToSlaveResponse>(request, GaussDBforNoSQLMeta.switchToSlave,
            hcClient);
    }

    /**
     * 修改副本集跨网段访问配置
     *
     * 修改副本集跨网段访问配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClientNetworkRequest 请求对象
     * @return UpdateClientNetworkResponse
     */
    public UpdateClientNetworkResponse updateClientNetwork(UpdateClientNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.updateClientNetwork);
    }

    /**
     * 修改副本集跨网段访问配置
     *
     * 修改副本集跨网段访问配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClientNetworkRequest 请求对象
     * @return SyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse>
     */
    public SyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse> updateClientNetworkInvoker(
        UpdateClientNetworkRequest request) {
        return new SyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse>(request,
            GaussDBforNoSQLMeta.updateClientNetwork, hcClient);
    }

    /**
     * 修改参数模板参数
     *
     * 修改参数模板参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigurationRequest 请求对象
     * @return UpdateConfigurationResponse
     */
    public UpdateConfigurationResponse updateConfiguration(UpdateConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.updateConfiguration);
    }

    /**
     * 修改参数模板参数
     *
     * 修改参数模板参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>
     */
    public SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfigurationInvoker(
        UpdateConfigurationRequest request) {
        return new SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>(request,
            GaussDBforNoSQLMeta.updateConfiguration, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceConfigurationRequest 请求对象
     * @return UpdateInstanceConfigurationResponse
     */
    public UpdateInstanceConfigurationResponse updateInstanceConfiguration(UpdateInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.updateInstanceConfiguration);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>
     */
    public SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfigurationInvoker(
        UpdateInstanceConfigurationRequest request) {
        return new SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>(request,
            GaussDBforNoSQLMeta.updateInstanceConfiguration, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceName(UpdateInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.updateInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameInvoker(
        UpdateInstanceNameRequest request) {
        return new SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>(request,
            GaussDBforNoSQLMeta.updateInstanceName, hcClient);
    }

    /**
     * 变更实例安全组
     *
     * 变更实例关联的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecurityGroupRequest 请求对象
     * @return UpdateSecurityGroupResponse
     */
    public UpdateSecurityGroupResponse updateSecurityGroup(UpdateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.updateSecurityGroup);
    }

    /**
     * 变更实例安全组
     *
     * 变更实例关联的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecurityGroupRequest 请求对象
     * @return SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>
     */
    public SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroupInvoker(
        UpdateSecurityGroupRequest request) {
        return new SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>(request,
            GaussDBforNoSQLMeta.updateSecurityGroup, hcClient);
    }

    /**
     * 数据库补丁升级
     *
     * 升级数据库补丁版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeDbVersionRequest 请求对象
     * @return UpgradeDbVersionResponse
     */
    public UpgradeDbVersionResponse upgradeDbVersion(UpgradeDbVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.upgradeDbVersion);
    }

    /**
     * 数据库补丁升级
     *
     * 升级数据库补丁版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeDbVersionRequest 请求对象
     * @return SyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse>
     */
    public SyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse> upgradeDbVersionInvoker(
        UpgradeDbVersionRequest request) {
        return new SyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse>(request,
            GaussDBforNoSQLMeta.upgradeDbVersion, hcClient);
    }

    /**
     * 查询当前支持的API版本信息列表
     *
     * 查询当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionRequest 请求对象
     * @return ListApiVersionResponse
     */
    public ListApiVersionResponse listApiVersion(ListApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listApiVersion);
    }

    /**
     * 查询当前支持的API版本信息列表
     *
     * 查询当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionRequest 请求对象
     * @return SyncInvoker<ListApiVersionRequest, ListApiVersionResponse>
     */
    public SyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionInvoker(
        ListApiVersionRequest request) {
        return new SyncInvoker<ListApiVersionRequest, ListApiVersionResponse>(request,
            GaussDBforNoSQLMeta.listApiVersion, hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse
     */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showApiVersion);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(
        ShowApiVersionRequest request) {
        return new SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request,
            GaussDBforNoSQLMeta.showApiVersion, hcClient);
    }

}
