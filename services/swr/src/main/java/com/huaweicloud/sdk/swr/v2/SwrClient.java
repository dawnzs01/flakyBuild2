package com.huaweicloud.sdk.swr.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.swr.v2.model.*;

public class SwrClient {

    protected HcClient hcClient;

    public SwrClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SwrClient> newBuilder() {
        return new ClientBuilder<>(SwrClient::new);
    }

    /**
     * 创建镜像自动同步任务
     *
     * 创建镜像自动同步任务，帮助您把最新推送的镜像自动同步到其他区域镜像仓库内。 镜像自动同步帮助您把最新推送的镜像自动同步到其他区域镜像仓库内，后期镜像有更新时，目标仓库的镜像也会自动更新，但已有的镜像不会自动同步。已有镜像的同步需要手动操作，详情请参见手动同步镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageSyncRepoRequest 请求对象
     * @return CreateImageSyncRepoResponse
     */
    public CreateImageSyncRepoResponse createImageSyncRepo(CreateImageSyncRepoRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createImageSyncRepo);
    }

    /**
     * 创建镜像自动同步任务
     *
     * 创建镜像自动同步任务，帮助您把最新推送的镜像自动同步到其他区域镜像仓库内。 镜像自动同步帮助您把最新推送的镜像自动同步到其他区域镜像仓库内，后期镜像有更新时，目标仓库的镜像也会自动更新，但已有的镜像不会自动同步。已有镜像的同步需要手动操作，详情请参见手动同步镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageSyncRepoRequest 请求对象
     * @return SyncInvoker<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse>
     */
    public SyncInvoker<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse> createImageSyncRepoInvoker(
        CreateImageSyncRepoRequest request) {
        return new SyncInvoker<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse>(request,
            SwrMeta.createImageSyncRepo, hcClient);
    }

    /**
     * 手动同步镜像
     *
     * 对于镜像仓库已有的镜像，如果想在其他区域使用，需要手动触发镜像同步。 判断是否同步成功的方法如下：响应状态码为200，无报错信息，表示同步成功。通过SWR管理控制台或调用查询镜像仓库概要信息接口，在目标区域的目标组织下，若存在所同步的镜像版本表示同步成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateManualImageSyncRepoRequest 请求对象
     * @return CreateManualImageSyncRepoResponse
     */
    public CreateManualImageSyncRepoResponse createManualImageSyncRepo(CreateManualImageSyncRepoRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createManualImageSyncRepo);
    }

    /**
     * 手动同步镜像
     *
     * 对于镜像仓库已有的镜像，如果想在其他区域使用，需要手动触发镜像同步。 判断是否同步成功的方法如下：响应状态码为200，无报错信息，表示同步成功。通过SWR管理控制台或调用查询镜像仓库概要信息接口，在目标区域的目标组织下，若存在所同步的镜像版本表示同步成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateManualImageSyncRepoRequest 请求对象
     * @return SyncInvoker<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse>
     */
    public SyncInvoker<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse> createManualImageSyncRepoInvoker(
        CreateManualImageSyncRepoRequest request) {
        return new SyncInvoker<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse>(request,
            SwrMeta.createManualImageSyncRepo, hcClient);
    }

    /**
     * 创建组织
     *
     * 创建组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNamespaceRequest 请求对象
     * @return CreateNamespaceResponse
     */
    public CreateNamespaceResponse createNamespace(CreateNamespaceRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createNamespace);
    }

    /**
     * 创建组织
     *
     * 创建组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNamespaceRequest 请求对象
     * @return SyncInvoker<CreateNamespaceRequest, CreateNamespaceResponse>
     */
    public SyncInvoker<CreateNamespaceRequest, CreateNamespaceResponse> createNamespaceInvoker(
        CreateNamespaceRequest request) {
        return new SyncInvoker<CreateNamespaceRequest, CreateNamespaceResponse>(request, SwrMeta.createNamespace,
            hcClient);
    }

    /**
     * 创建组织权限
     *
     * 创建组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNamespaceAuthRequest 请求对象
     * @return CreateNamespaceAuthResponse
     */
    public CreateNamespaceAuthResponse createNamespaceAuth(CreateNamespaceAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createNamespaceAuth);
    }

    /**
     * 创建组织权限
     *
     * 创建组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNamespaceAuthRequest 请求对象
     * @return SyncInvoker<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse>
     */
    public SyncInvoker<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse> createNamespaceAuthInvoker(
        CreateNamespaceAuthRequest request) {
        return new SyncInvoker<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse>(request,
            SwrMeta.createNamespaceAuth, hcClient);
    }

    /**
     * 在组织下创建镜像仓库
     *
     * 在组织下创建镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRepoRequest 请求对象
     * @return CreateRepoResponse
     */
    public CreateRepoResponse createRepo(CreateRepoRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createRepo);
    }

    /**
     * 在组织下创建镜像仓库
     *
     * 在组织下创建镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRepoRequest 请求对象
     * @return SyncInvoker<CreateRepoRequest, CreateRepoResponse>
     */
    public SyncInvoker<CreateRepoRequest, CreateRepoResponse> createRepoInvoker(CreateRepoRequest request) {
        return new SyncInvoker<CreateRepoRequest, CreateRepoResponse>(request, SwrMeta.createRepo, hcClient);
    }

    /**
     * 创建共享帐号
     *
     * 创建共享帐号。镜像上传后，您可以共享私有镜像给其他帐号，并授予下载该镜像的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRepoDomainsRequest 请求对象
     * @return CreateRepoDomainsResponse
     */
    public CreateRepoDomainsResponse createRepoDomains(CreateRepoDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createRepoDomains);
    }

    /**
     * 创建共享帐号
     *
     * 创建共享帐号。镜像上传后，您可以共享私有镜像给其他帐号，并授予下载该镜像的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRepoDomainsRequest 请求对象
     * @return SyncInvoker<CreateRepoDomainsRequest, CreateRepoDomainsResponse>
     */
    public SyncInvoker<CreateRepoDomainsRequest, CreateRepoDomainsResponse> createRepoDomainsInvoker(
        CreateRepoDomainsRequest request) {
        return new SyncInvoker<CreateRepoDomainsRequest, CreateRepoDomainsResponse>(request, SwrMeta.createRepoDomains,
            hcClient);
    }

    /**
     * 创建镜像老化规则
     *
     * 创建镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRetentionRequest 请求对象
     * @return CreateRetentionResponse
     */
    public CreateRetentionResponse createRetention(CreateRetentionRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createRetention);
    }

    /**
     * 创建镜像老化规则
     *
     * 创建镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRetentionRequest 请求对象
     * @return SyncInvoker<CreateRetentionRequest, CreateRetentionResponse>
     */
    public SyncInvoker<CreateRetentionRequest, CreateRetentionResponse> createRetentionInvoker(
        CreateRetentionRequest request) {
        return new SyncInvoker<CreateRetentionRequest, CreateRetentionResponse>(request, SwrMeta.createRetention,
            hcClient);
    }

    /**
     * 生成临时登录指令
     *
     * 调用该接口，通过获取响应消息头的X-Swr-Dockerlogin的值及响应消息体的host值，可生成临时登录指令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecretRequest 请求对象
     * @return CreateSecretResponse
     */
    public CreateSecretResponse createSecret(CreateSecretRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createSecret);
    }

    /**
     * 生成临时登录指令
     *
     * 调用该接口，通过获取响应消息头的X-Swr-Dockerlogin的值及响应消息体的host值，可生成临时登录指令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecretRequest 请求对象
     * @return SyncInvoker<CreateSecretRequest, CreateSecretResponse>
     */
    public SyncInvoker<CreateSecretRequest, CreateSecretResponse> createSecretInvoker(CreateSecretRequest request) {
        return new SyncInvoker<CreateSecretRequest, CreateSecretResponse>(request, SwrMeta.createSecret, hcClient);
    }

    /**
     * 创建触发器
     *
     * 创建触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTriggerRequest 请求对象
     * @return CreateTriggerResponse
     */
    public CreateTriggerResponse createTrigger(CreateTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createTrigger);
    }

    /**
     * 创建触发器
     *
     * 创建触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTriggerRequest 请求对象
     * @return SyncInvoker<CreateTriggerRequest, CreateTriggerResponse>
     */
    public SyncInvoker<CreateTriggerRequest, CreateTriggerResponse> createTriggerInvoker(CreateTriggerRequest request) {
        return new SyncInvoker<CreateTriggerRequest, CreateTriggerResponse>(request, SwrMeta.createTrigger, hcClient);
    }

    /**
     * 创建镜像权限
     *
     * 创建镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateUserRepositoryAuthRequest 请求对象
     * @return CreateUserRepositoryAuthResponse
     */
    public CreateUserRepositoryAuthResponse createUserRepositoryAuth(CreateUserRepositoryAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createUserRepositoryAuth);
    }

    /**
     * 创建镜像权限
     *
     * 创建镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateUserRepositoryAuthRequest 请求对象
     * @return SyncInvoker<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse>
     */
    public SyncInvoker<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse> createUserRepositoryAuthInvoker(
        CreateUserRepositoryAuthRequest request) {
        return new SyncInvoker<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse>(request,
            SwrMeta.createUserRepositoryAuth, hcClient);
    }

    /**
     * 删除镜像自动同步任务
     *
     * 根据目标区域、目标组织删除指定的镜像自动同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteImageSyncRepoRequest 请求对象
     * @return DeleteImageSyncRepoResponse
     */
    public DeleteImageSyncRepoResponse deleteImageSyncRepo(DeleteImageSyncRepoRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteImageSyncRepo);
    }

    /**
     * 删除镜像自动同步任务
     *
     * 根据目标区域、目标组织删除指定的镜像自动同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteImageSyncRepoRequest 请求对象
     * @return SyncInvoker<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse>
     */
    public SyncInvoker<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse> deleteImageSyncRepoInvoker(
        DeleteImageSyncRepoRequest request) {
        return new SyncInvoker<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse>(request,
            SwrMeta.deleteImageSyncRepo, hcClient);
    }

    /**
     * 删除组织权限
     *
     * 删除组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNamespaceAuthRequest 请求对象
     * @return DeleteNamespaceAuthResponse
     */
    public DeleteNamespaceAuthResponse deleteNamespaceAuth(DeleteNamespaceAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteNamespaceAuth);
    }

    /**
     * 删除组织权限
     *
     * 删除组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNamespaceAuthRequest 请求对象
     * @return SyncInvoker<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse>
     */
    public SyncInvoker<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse> deleteNamespaceAuthInvoker(
        DeleteNamespaceAuthRequest request) {
        return new SyncInvoker<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse>(request,
            SwrMeta.deleteNamespaceAuth, hcClient);
    }

    /**
     * 删除组织
     *
     * 删除组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNamespacesRequest 请求对象
     * @return DeleteNamespacesResponse
     */
    public DeleteNamespacesResponse deleteNamespaces(DeleteNamespacesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteNamespaces);
    }

    /**
     * 删除组织
     *
     * 删除组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNamespacesRequest 请求对象
     * @return SyncInvoker<DeleteNamespacesRequest, DeleteNamespacesResponse>
     */
    public SyncInvoker<DeleteNamespacesRequest, DeleteNamespacesResponse> deleteNamespacesInvoker(
        DeleteNamespacesRequest request) {
        return new SyncInvoker<DeleteNamespacesRequest, DeleteNamespacesResponse>(request, SwrMeta.deleteNamespaces,
            hcClient);
    }

    /**
     * 删除组织下的镜像仓库
     *
     * 删除组织下的镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRepoRequest 请求对象
     * @return DeleteRepoResponse
     */
    public DeleteRepoResponse deleteRepo(DeleteRepoRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteRepo);
    }

    /**
     * 删除组织下的镜像仓库
     *
     * 删除组织下的镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRepoRequest 请求对象
     * @return SyncInvoker<DeleteRepoRequest, DeleteRepoResponse>
     */
    public SyncInvoker<DeleteRepoRequest, DeleteRepoResponse> deleteRepoInvoker(DeleteRepoRequest request) {
        return new SyncInvoker<DeleteRepoRequest, DeleteRepoResponse>(request, SwrMeta.deleteRepo, hcClient);
    }

    /**
     * 删除共享帐号
     *
     * 删除共享帐号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRepoDomainsRequest 请求对象
     * @return DeleteRepoDomainsResponse
     */
    public DeleteRepoDomainsResponse deleteRepoDomains(DeleteRepoDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteRepoDomains);
    }

    /**
     * 删除共享帐号
     *
     * 删除共享帐号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRepoDomainsRequest 请求对象
     * @return SyncInvoker<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse>
     */
    public SyncInvoker<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse> deleteRepoDomainsInvoker(
        DeleteRepoDomainsRequest request) {
        return new SyncInvoker<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse>(request, SwrMeta.deleteRepoDomains,
            hcClient);
    }

    /**
     * 删除指定tag的镜像
     *
     * 删除镜像仓库中指定tag的镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRepoTagRequest 请求对象
     * @return DeleteRepoTagResponse
     */
    public DeleteRepoTagResponse deleteRepoTag(DeleteRepoTagRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteRepoTag);
    }

    /**
     * 删除指定tag的镜像
     *
     * 删除镜像仓库中指定tag的镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRepoTagRequest 请求对象
     * @return SyncInvoker<DeleteRepoTagRequest, DeleteRepoTagResponse>
     */
    public SyncInvoker<DeleteRepoTagRequest, DeleteRepoTagResponse> deleteRepoTagInvoker(DeleteRepoTagRequest request) {
        return new SyncInvoker<DeleteRepoTagRequest, DeleteRepoTagResponse>(request, SwrMeta.deleteRepoTag, hcClient);
    }

    /**
     * 删除镜像老化规则
     *
     * 删除镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRetentionRequest 请求对象
     * @return DeleteRetentionResponse
     */
    public DeleteRetentionResponse deleteRetention(DeleteRetentionRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteRetention);
    }

    /**
     * 删除镜像老化规则
     *
     * 删除镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRetentionRequest 请求对象
     * @return SyncInvoker<DeleteRetentionRequest, DeleteRetentionResponse>
     */
    public SyncInvoker<DeleteRetentionRequest, DeleteRetentionResponse> deleteRetentionInvoker(
        DeleteRetentionRequest request) {
        return new SyncInvoker<DeleteRetentionRequest, DeleteRetentionResponse>(request, SwrMeta.deleteRetention,
            hcClient);
    }

    /**
     * 删除触发器
     *
     * 删除触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTriggerRequest 请求对象
     * @return DeleteTriggerResponse
     */
    public DeleteTriggerResponse deleteTrigger(DeleteTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteTrigger);
    }

    /**
     * 删除触发器
     *
     * 删除触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTriggerRequest 请求对象
     * @return SyncInvoker<DeleteTriggerRequest, DeleteTriggerResponse>
     */
    public SyncInvoker<DeleteTriggerRequest, DeleteTriggerResponse> deleteTriggerInvoker(DeleteTriggerRequest request) {
        return new SyncInvoker<DeleteTriggerRequest, DeleteTriggerResponse>(request, SwrMeta.deleteTrigger, hcClient);
    }

    /**
     * 删除镜像权限
     *
     * 删除镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUserRepositoryAuthRequest 请求对象
     * @return DeleteUserRepositoryAuthResponse
     */
    public DeleteUserRepositoryAuthResponse deleteUserRepositoryAuth(DeleteUserRepositoryAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteUserRepositoryAuth);
    }

    /**
     * 删除镜像权限
     *
     * 删除镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUserRepositoryAuthRequest 请求对象
     * @return SyncInvoker<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse>
     */
    public SyncInvoker<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse> deleteUserRepositoryAuthInvoker(
        DeleteUserRepositoryAuthRequest request) {
        return new SyncInvoker<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse>(request,
            SwrMeta.deleteUserRepositoryAuth, hcClient);
    }

    /**
     * 获取镜像自动同步任务列表
     *
     * 获取为当前镜像仓库所创建的所有自动同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImageAutoSyncReposDetailsRequest 请求对象
     * @return ListImageAutoSyncReposDetailsResponse
     */
    public ListImageAutoSyncReposDetailsResponse listImageAutoSyncReposDetails(
        ListImageAutoSyncReposDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listImageAutoSyncReposDetails);
    }

    /**
     * 获取镜像自动同步任务列表
     *
     * 获取为当前镜像仓库所创建的所有自动同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImageAutoSyncReposDetailsRequest 请求对象
     * @return SyncInvoker<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse>
     */
    public SyncInvoker<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse> listImageAutoSyncReposDetailsInvoker(
        ListImageAutoSyncReposDetailsRequest request) {
        return new SyncInvoker<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse>(request,
            SwrMeta.listImageAutoSyncReposDetails, hcClient);
    }

    /**
     * 查询组织列表
     *
     * 查询组织列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNamespacesRequest 请求对象
     * @return ListNamespacesResponse
     */
    public ListNamespacesResponse listNamespaces(ListNamespacesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listNamespaces);
    }

    /**
     * 查询组织列表
     *
     * 查询组织列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNamespacesRequest 请求对象
     * @return SyncInvoker<ListNamespacesRequest, ListNamespacesResponse>
     */
    public SyncInvoker<ListNamespacesRequest, ListNamespacesResponse> listNamespacesInvoker(
        ListNamespacesRequest request) {
        return new SyncInvoker<ListNamespacesRequest, ListNamespacesResponse>(request, SwrMeta.listNamespaces,
            hcClient);
    }

    /**
     * 获取配额信息
     *
     * 获取配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listQuotas);
    }

    /**
     * 获取配额信息
     *
     * 获取配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, SwrMeta.listQuotas, hcClient);
    }

    /**
     * 获取共享帐号列表
     *
     * 获取共享帐号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRepoDomainsRequest 请求对象
     * @return ListRepoDomainsResponse
     */
    public ListRepoDomainsResponse listRepoDomains(ListRepoDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listRepoDomains);
    }

    /**
     * 获取共享帐号列表
     *
     * 获取共享帐号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRepoDomainsRequest 请求对象
     * @return SyncInvoker<ListRepoDomainsRequest, ListRepoDomainsResponse>
     */
    public SyncInvoker<ListRepoDomainsRequest, ListRepoDomainsResponse> listRepoDomainsInvoker(
        ListRepoDomainsRequest request) {
        return new SyncInvoker<ListRepoDomainsRequest, ListRepoDomainsResponse>(request, SwrMeta.listRepoDomains,
            hcClient);
    }

    /**
     * 查询镜像仓库列表
     *
     * 查询镜像仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListReposDetailsRequest 请求对象
     * @return ListReposDetailsResponse
     */
    public ListReposDetailsResponse listReposDetails(ListReposDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listReposDetails);
    }

    /**
     * 查询镜像仓库列表
     *
     * 查询镜像仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListReposDetailsRequest 请求对象
     * @return SyncInvoker<ListReposDetailsRequest, ListReposDetailsResponse>
     */
    public SyncInvoker<ListReposDetailsRequest, ListReposDetailsResponse> listReposDetailsInvoker(
        ListReposDetailsRequest request) {
        return new SyncInvoker<ListReposDetailsRequest, ListReposDetailsResponse>(request, SwrMeta.listReposDetails,
            hcClient);
    }

    /**
     * 查询镜像tag列表
     *
     * 查询镜像tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRepositoryTagsRequest 请求对象
     * @return ListRepositoryTagsResponse
     */
    public ListRepositoryTagsResponse listRepositoryTags(ListRepositoryTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listRepositoryTags);
    }

    /**
     * 查询镜像tag列表
     *
     * 查询镜像tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRepositoryTagsRequest 请求对象
     * @return SyncInvoker<ListRepositoryTagsRequest, ListRepositoryTagsResponse>
     */
    public SyncInvoker<ListRepositoryTagsRequest, ListRepositoryTagsResponse> listRepositoryTagsInvoker(
        ListRepositoryTagsRequest request) {
        return new SyncInvoker<ListRepositoryTagsRequest, ListRepositoryTagsResponse>(request,
            SwrMeta.listRepositoryTags, hcClient);
    }

    /**
     * 获取镜像老化记录
     *
     * 获取镜像老化记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRetentionHistoriesRequest 请求对象
     * @return ListRetentionHistoriesResponse
     */
    public ListRetentionHistoriesResponse listRetentionHistories(ListRetentionHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listRetentionHistories);
    }

    /**
     * 获取镜像老化记录
     *
     * 获取镜像老化记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRetentionHistoriesRequest 请求对象
     * @return SyncInvoker<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse>
     */
    public SyncInvoker<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse> listRetentionHistoriesInvoker(
        ListRetentionHistoriesRequest request) {
        return new SyncInvoker<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse>(request,
            SwrMeta.listRetentionHistories, hcClient);
    }

    /**
     * 获取镜像老化规则列表
     *
     * 获取镜像老化规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRetentionsRequest 请求对象
     * @return ListRetentionsResponse
     */
    public ListRetentionsResponse listRetentions(ListRetentionsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listRetentions);
    }

    /**
     * 获取镜像老化规则列表
     *
     * 获取镜像老化规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRetentionsRequest 请求对象
     * @return SyncInvoker<ListRetentionsRequest, ListRetentionsResponse>
     */
    public SyncInvoker<ListRetentionsRequest, ListRetentionsResponse> listRetentionsInvoker(
        ListRetentionsRequest request) {
        return new SyncInvoker<ListRetentionsRequest, ListRetentionsResponse>(request, SwrMeta.listRetentions,
            hcClient);
    }

    /**
     * 查询共享镜像列表
     *
     * 查询共享镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSharedReposDetailsRequest 请求对象
     * @return ListSharedReposDetailsResponse
     */
    public ListSharedReposDetailsResponse listSharedReposDetails(ListSharedReposDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listSharedReposDetails);
    }

    /**
     * 查询共享镜像列表
     *
     * 查询共享镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSharedReposDetailsRequest 请求对象
     * @return SyncInvoker<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse>
     */
    public SyncInvoker<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse> listSharedReposDetailsInvoker(
        ListSharedReposDetailsRequest request) {
        return new SyncInvoker<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse>(request,
            SwrMeta.listSharedReposDetails, hcClient);
    }

    /**
     * 获取镜像仓库下的触发器列表
     *
     * 获取镜像仓库下的触发器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTriggersDetailsRequest 请求对象
     * @return ListTriggersDetailsResponse
     */
    public ListTriggersDetailsResponse listTriggersDetails(ListTriggersDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listTriggersDetails);
    }

    /**
     * 获取镜像仓库下的触发器列表
     *
     * 获取镜像仓库下的触发器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTriggersDetailsRequest 请求对象
     * @return SyncInvoker<ListTriggersDetailsRequest, ListTriggersDetailsResponse>
     */
    public SyncInvoker<ListTriggersDetailsRequest, ListTriggersDetailsResponse> listTriggersDetailsInvoker(
        ListTriggersDetailsRequest request) {
        return new SyncInvoker<ListTriggersDetailsRequest, ListTriggersDetailsResponse>(request,
            SwrMeta.listTriggersDetails, hcClient);
    }

    /**
     * 判断共享帐号是否存在
     *
     * 判断共享租户是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAccessDomainRequest 请求对象
     * @return ShowAccessDomainResponse
     */
    public ShowAccessDomainResponse showAccessDomain(ShowAccessDomainRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showAccessDomain);
    }

    /**
     * 判断共享帐号是否存在
     *
     * 判断共享租户是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAccessDomainRequest 请求对象
     * @return SyncInvoker<ShowAccessDomainRequest, ShowAccessDomainResponse>
     */
    public SyncInvoker<ShowAccessDomainRequest, ShowAccessDomainResponse> showAccessDomainInvoker(
        ShowAccessDomainRequest request) {
        return new SyncInvoker<ShowAccessDomainRequest, ShowAccessDomainResponse>(request, SwrMeta.showAccessDomain,
            hcClient);
    }

    /**
     * 获取组织详情
     *
     * 获取组织详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNamespaceRequest 请求对象
     * @return ShowNamespaceResponse
     */
    public ShowNamespaceResponse showNamespace(ShowNamespaceRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showNamespace);
    }

    /**
     * 获取组织详情
     *
     * 获取组织详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNamespaceRequest 请求对象
     * @return SyncInvoker<ShowNamespaceRequest, ShowNamespaceResponse>
     */
    public SyncInvoker<ShowNamespaceRequest, ShowNamespaceResponse> showNamespaceInvoker(ShowNamespaceRequest request) {
        return new SyncInvoker<ShowNamespaceRequest, ShowNamespaceResponse>(request, SwrMeta.showNamespace, hcClient);
    }

    /**
     * 查询组织权限
     *
     * 查询组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNamespaceAuthRequest 请求对象
     * @return ShowNamespaceAuthResponse
     */
    public ShowNamespaceAuthResponse showNamespaceAuth(ShowNamespaceAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showNamespaceAuth);
    }

    /**
     * 查询组织权限
     *
     * 查询组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNamespaceAuthRequest 请求对象
     * @return SyncInvoker<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse>
     */
    public SyncInvoker<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse> showNamespaceAuthInvoker(
        ShowNamespaceAuthRequest request) {
        return new SyncInvoker<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse>(request, SwrMeta.showNamespaceAuth,
            hcClient);
    }

    /**
     * 查询镜像仓库概要信息
     *
     * 查询镜像仓库概要信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRepositoryRequest 请求对象
     * @return ShowRepositoryResponse
     */
    public ShowRepositoryResponse showRepository(ShowRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showRepository);
    }

    /**
     * 查询镜像仓库概要信息
     *
     * 查询镜像仓库概要信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRepositoryRequest 请求对象
     * @return SyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse>
     */
    public SyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse> showRepositoryInvoker(
        ShowRepositoryRequest request) {
        return new SyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse>(request, SwrMeta.showRepository,
            hcClient);
    }

    /**
     * 获取镜像老化规则记录
     *
     * 获取镜像老化规则记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRetentionRequest 请求对象
     * @return ShowRetentionResponse
     */
    public ShowRetentionResponse showRetention(ShowRetentionRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showRetention);
    }

    /**
     * 获取镜像老化规则记录
     *
     * 获取镜像老化规则记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRetentionRequest 请求对象
     * @return SyncInvoker<ShowRetentionRequest, ShowRetentionResponse>
     */
    public SyncInvoker<ShowRetentionRequest, ShowRetentionResponse> showRetentionInvoker(ShowRetentionRequest request) {
        return new SyncInvoker<ShowRetentionRequest, ShowRetentionResponse>(request, SwrMeta.showRetention, hcClient);
    }

    /**
     * 获取镜像自动同步任务信息
     *
     * 创建镜像自动同步任务后，可以通过此接口查询该任务的状态，以判断是否同步成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSyncJobRequest 请求对象
     * @return ShowSyncJobResponse
     */
    public ShowSyncJobResponse showSyncJob(ShowSyncJobRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showSyncJob);
    }

    /**
     * 获取镜像自动同步任务信息
     *
     * 创建镜像自动同步任务后，可以通过此接口查询该任务的状态，以判断是否同步成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSyncJobRequest 请求对象
     * @return SyncInvoker<ShowSyncJobRequest, ShowSyncJobResponse>
     */
    public SyncInvoker<ShowSyncJobRequest, ShowSyncJobResponse> showSyncJobInvoker(ShowSyncJobRequest request) {
        return new SyncInvoker<ShowSyncJobRequest, ShowSyncJobResponse>(request, SwrMeta.showSyncJob, hcClient);
    }

    /**
     * 获取触发器详情
     *
     * 获取触发器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTriggerRequest 请求对象
     * @return ShowTriggerResponse
     */
    public ShowTriggerResponse showTrigger(ShowTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showTrigger);
    }

    /**
     * 获取触发器详情
     *
     * 获取触发器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTriggerRequest 请求对象
     * @return SyncInvoker<ShowTriggerRequest, ShowTriggerResponse>
     */
    public SyncInvoker<ShowTriggerRequest, ShowTriggerResponse> showTriggerInvoker(ShowTriggerRequest request) {
        return new SyncInvoker<ShowTriggerRequest, ShowTriggerResponse>(request, SwrMeta.showTrigger, hcClient);
    }

    /**
     * 查询镜像权限
     *
     * 查询镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUserRepositoryAuthRequest 请求对象
     * @return ShowUserRepositoryAuthResponse
     */
    public ShowUserRepositoryAuthResponse showUserRepositoryAuth(ShowUserRepositoryAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showUserRepositoryAuth);
    }

    /**
     * 查询镜像权限
     *
     * 查询镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUserRepositoryAuthRequest 请求对象
     * @return SyncInvoker<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse>
     */
    public SyncInvoker<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse> showUserRepositoryAuthInvoker(
        ShowUserRepositoryAuthRequest request) {
        return new SyncInvoker<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse>(request,
            SwrMeta.showUserRepositoryAuth, hcClient);
    }

    /**
     * 更新组织权限
     *
     * 更新组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNamespaceAuthRequest 请求对象
     * @return UpdateNamespaceAuthResponse
     */
    public UpdateNamespaceAuthResponse updateNamespaceAuth(UpdateNamespaceAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateNamespaceAuth);
    }

    /**
     * 更新组织权限
     *
     * 更新组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNamespaceAuthRequest 请求对象
     * @return SyncInvoker<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse>
     */
    public SyncInvoker<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse> updateNamespaceAuthInvoker(
        UpdateNamespaceAuthRequest request) {
        return new SyncInvoker<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse>(request,
            SwrMeta.updateNamespaceAuth, hcClient);
    }

    /**
     * 更新镜像仓库的概要信息
     *
     * 更新租户组织下的镜像概要信息，包括镜像类型、是否公有、描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRepoRequest 请求对象
     * @return UpdateRepoResponse
     */
    public UpdateRepoResponse updateRepo(UpdateRepoRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateRepo);
    }

    /**
     * 更新镜像仓库的概要信息
     *
     * 更新租户组织下的镜像概要信息，包括镜像类型、是否公有、描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRepoRequest 请求对象
     * @return SyncInvoker<UpdateRepoRequest, UpdateRepoResponse>
     */
    public SyncInvoker<UpdateRepoRequest, UpdateRepoResponse> updateRepoInvoker(UpdateRepoRequest request) {
        return new SyncInvoker<UpdateRepoRequest, UpdateRepoResponse>(request, SwrMeta.updateRepo, hcClient);
    }

    /**
     * 更新共享帐号
     *
     * 更新共享帐号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRepoDomainsRequest 请求对象
     * @return UpdateRepoDomainsResponse
     */
    public UpdateRepoDomainsResponse updateRepoDomains(UpdateRepoDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateRepoDomains);
    }

    /**
     * 更新共享帐号
     *
     * 更新共享帐号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRepoDomainsRequest 请求对象
     * @return SyncInvoker<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse>
     */
    public SyncInvoker<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse> updateRepoDomainsInvoker(
        UpdateRepoDomainsRequest request) {
        return new SyncInvoker<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse>(request, SwrMeta.updateRepoDomains,
            hcClient);
    }

    /**
     * 修改镜像老化规则
     *
     * 修改镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRetentionRequest 请求对象
     * @return UpdateRetentionResponse
     */
    public UpdateRetentionResponse updateRetention(UpdateRetentionRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateRetention);
    }

    /**
     * 修改镜像老化规则
     *
     * 修改镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRetentionRequest 请求对象
     * @return SyncInvoker<UpdateRetentionRequest, UpdateRetentionResponse>
     */
    public SyncInvoker<UpdateRetentionRequest, UpdateRetentionResponse> updateRetentionInvoker(
        UpdateRetentionRequest request) {
        return new SyncInvoker<UpdateRetentionRequest, UpdateRetentionResponse>(request, SwrMeta.updateRetention,
            hcClient);
    }

    /**
     * 更新触发器配置
     *
     * 更新触发器配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTriggerRequest 请求对象
     * @return UpdateTriggerResponse
     */
    public UpdateTriggerResponse updateTrigger(UpdateTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateTrigger);
    }

    /**
     * 更新触发器配置
     *
     * 更新触发器配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTriggerRequest 请求对象
     * @return SyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse>
     */
    public SyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse> updateTriggerInvoker(UpdateTriggerRequest request) {
        return new SyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse>(request, SwrMeta.updateTrigger, hcClient);
    }

    /**
     * 更新镜像权限
     *
     * 更新镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserRepositoryAuthRequest 请求对象
     * @return UpdateUserRepositoryAuthResponse
     */
    public UpdateUserRepositoryAuthResponse updateUserRepositoryAuth(UpdateUserRepositoryAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateUserRepositoryAuth);
    }

    /**
     * 更新镜像权限
     *
     * 更新镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserRepositoryAuthRequest 请求对象
     * @return SyncInvoker<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse>
     */
    public SyncInvoker<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse> updateUserRepositoryAuthInvoker(
        UpdateUserRepositoryAuthRequest request) {
        return new SyncInvoker<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse>(request,
            SwrMeta.updateUserRepositoryAuth, hcClient);
    }

    /**
     * 查询所有API版本信息
     *
     * 查询所有API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listApiVersions);
    }

    /**
     * 查询所有API版本信息
     *
     * 查询所有API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, SwrMeta.listApiVersions,
            hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse
     */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showApiVersion);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(
        ShowApiVersionRequest request) {
        return new SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, SwrMeta.showApiVersion,
            hcClient);
    }

}
