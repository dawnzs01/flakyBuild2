package com.huaweicloud.sdk.tms.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.tms.v1.model.*;

public class TmsClient {

    protected HcClient hcClient;

    public TmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<TmsClient> newBuilder() {
        return new ClientBuilder<>(TmsClient::new, "GlobalCredentials");
    }

    /**
     * 创建预定义标签
     *
     * 用于创建预定标签。用户创建预定义标签后，可以使用预定义标签来给资源创建标签。该接口支持幂等特性和处理批量数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePredefineTagsRequest 请求对象
     * @return CreatePredefineTagsResponse
     */
    public CreatePredefineTagsResponse createPredefineTags(CreatePredefineTagsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.createPredefineTags);
    }

    /**
     * 创建预定义标签
     *
     * 用于创建预定标签。用户创建预定义标签后，可以使用预定义标签来给资源创建标签。该接口支持幂等特性和处理批量数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePredefineTagsRequest 请求对象
     * @return SyncInvoker<CreatePredefineTagsRequest, CreatePredefineTagsResponse>
     */
    public SyncInvoker<CreatePredefineTagsRequest, CreatePredefineTagsResponse> createPredefineTagsInvoker(
        CreatePredefineTagsRequest request) {
        return new SyncInvoker<CreatePredefineTagsRequest, CreatePredefineTagsResponse>(request,
            TmsMeta.createPredefineTags, hcClient);
    }

    /**
     * 批量添加标签
     *
     * 用于给云服务的多个资源添加标签，每个资源最多可添加10个标签，每次最多支持批量操作20个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceTagRequest 请求对象
     * @return CreateResourceTagResponse
     */
    public CreateResourceTagResponse createResourceTag(CreateResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.createResourceTag);
    }

    /**
     * 批量添加标签
     *
     * 用于给云服务的多个资源添加标签，每个资源最多可添加10个标签，每次最多支持批量操作20个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceTagRequest 请求对象
     * @return SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>
     */
    public SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTagInvoker(
        CreateResourceTagRequest request) {
        return new SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>(request, TmsMeta.createResourceTag,
            hcClient);
    }

    /**
     * 删除预定义标签
     *
     * 用于删除预定标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePredefineTagsRequest 请求对象
     * @return DeletePredefineTagsResponse
     */
    public DeletePredefineTagsResponse deletePredefineTags(DeletePredefineTagsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.deletePredefineTags);
    }

    /**
     * 删除预定义标签
     *
     * 用于删除预定标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePredefineTagsRequest 请求对象
     * @return SyncInvoker<DeletePredefineTagsRequest, DeletePredefineTagsResponse>
     */
    public SyncInvoker<DeletePredefineTagsRequest, DeletePredefineTagsResponse> deletePredefineTagsInvoker(
        DeletePredefineTagsRequest request) {
        return new SyncInvoker<DeletePredefineTagsRequest, DeletePredefineTagsResponse>(request,
            TmsMeta.deletePredefineTags, hcClient);
    }

    /**
     * 批量移除标签
     *
     * 用于批量移除云服务多个资源的标签，每个资源最多支持移除10个标签，每次最多支持批量操作20个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return DeleteResourceTagResponse
     */
    public DeleteResourceTagResponse deleteResourceTag(DeleteResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.deleteResourceTag);
    }

    /**
     * 批量移除标签
     *
     * 用于批量移除云服务多个资源的标签，每个资源最多支持移除10个标签，每次最多支持批量操作20个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>
     */
    public SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagInvoker(
        DeleteResourceTagRequest request) {
        return new SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>(request, TmsMeta.deleteResourceTag,
            hcClient);
    }

    /**
     * 查询API版本列表
     *
     * 查询标签管理服务的API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listApiVersions);
    }

    /**
     * 查询API版本列表
     *
     * 查询标签管理服务的API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, TmsMeta.listApiVersions,
            hcClient);
    }

    /**
     * 查询预定义标签列表
     *
     * 用于查询预定义标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPredefineTagsRequest 请求对象
     * @return ListPredefineTagsResponse
     */
    public ListPredefineTagsResponse listPredefineTags(ListPredefineTagsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listPredefineTags);
    }

    /**
     * 查询预定义标签列表
     *
     * 用于查询预定义标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPredefineTagsRequest 请求对象
     * @return SyncInvoker<ListPredefineTagsRequest, ListPredefineTagsResponse>
     */
    public SyncInvoker<ListPredefineTagsRequest, ListPredefineTagsResponse> listPredefineTagsInvoker(
        ListPredefineTagsRequest request) {
        return new SyncInvoker<ListPredefineTagsRequest, ListPredefineTagsResponse>(request, TmsMeta.listPredefineTags,
            hcClient);
    }

    /**
     * 查询标签管理支持的服务
     *
     * 查询标签管理支持的服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProvidersRequest 请求对象
     * @return ListProvidersResponse
     */
    public ListProvidersResponse listProviders(ListProvidersRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listProviders);
    }

    /**
     * 查询标签管理支持的服务
     *
     * 查询标签管理支持的服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProvidersRequest 请求对象
     * @return SyncInvoker<ListProvidersRequest, ListProvidersResponse>
     */
    public SyncInvoker<ListProvidersRequest, ListProvidersResponse> listProvidersInvoker(ListProvidersRequest request) {
        return new SyncInvoker<ListProvidersRequest, ListProvidersResponse>(request, TmsMeta.listProviders, hcClient);
    }

    /**
     * 根据标签过滤资源
     *
     * 根据标签过滤资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceRequest 请求对象
     * @return ListResourceResponse
     */
    public ListResourceResponse listResource(ListResourceRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listResource);
    }

    /**
     * 根据标签过滤资源
     *
     * 根据标签过滤资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceRequest 请求对象
     * @return SyncInvoker<ListResourceRequest, ListResourceResponse>
     */
    public SyncInvoker<ListResourceRequest, ListResourceResponse> listResourceInvoker(ListResourceRequest request) {
        return new SyncInvoker<ListResourceRequest, ListResourceResponse>(request, TmsMeta.listResource, hcClient);
    }

    /**
     * 查询标签键列表
     *
     * 查询指定区域的所有标签键.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagKeysRequest 请求对象
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listTagKeys);
    }

    /**
     * 查询标签键列表
     *
     * 查询指定区域的所有标签键.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagKeysRequest 请求对象
     * @return SyncInvoker<ListTagKeysRequest, ListTagKeysResponse>
     */
    public SyncInvoker<ListTagKeysRequest, ListTagKeysResponse> listTagKeysInvoker(ListTagKeysRequest request) {
        return new SyncInvoker<ListTagKeysRequest, ListTagKeysResponse>(request, TmsMeta.listTagKeys, hcClient);
    }

    /**
     * 查询标签值列表
     *
     * 查询指定区域的标签键下的所有标签值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagValuesRequest 请求对象
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listTagValues);
    }

    /**
     * 查询标签值列表
     *
     * 查询指定区域的标签键下的所有标签值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagValuesRequest 请求对象
     * @return SyncInvoker<ListTagValuesRequest, ListTagValuesResponse>
     */
    public SyncInvoker<ListTagValuesRequest, ListTagValuesResponse> listTagValuesInvoker(ListTagValuesRequest request) {
        return new SyncInvoker<ListTagValuesRequest, ListTagValuesResponse>(request, TmsMeta.listTagValues, hcClient);
    }

    /**
     * 查询API版本号详情
     *
     * 查询指定的标签管理服务API版本号详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse
     */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.showApiVersion);
    }

    /**
     * 查询API版本号详情
     *
     * 查询指定的标签管理服务API版本号详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(
        ShowApiVersionRequest request) {
        return new SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, TmsMeta.showApiVersion,
            hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询单个资源上的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceTagRequest 请求对象
     * @return ShowResourceTagResponse
     */
    public ShowResourceTagResponse showResourceTag(ShowResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.showResourceTag);
    }

    /**
     * 查询资源标签
     *
     * 查询单个资源上的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceTagRequest 请求对象
     * @return SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>
     */
    public SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTagInvoker(
        ShowResourceTagRequest request) {
        return new SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>(request, TmsMeta.showResourceTag,
            hcClient);
    }

    /**
     * 查询标签配额
     *
     * 查询标签的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTagQuotaRequest 请求对象
     * @return ShowTagQuotaResponse
     */
    public ShowTagQuotaResponse showTagQuota(ShowTagQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.showTagQuota);
    }

    /**
     * 查询标签配额
     *
     * 查询标签的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTagQuotaRequest 请求对象
     * @return SyncInvoker<ShowTagQuotaRequest, ShowTagQuotaResponse>
     */
    public SyncInvoker<ShowTagQuotaRequest, ShowTagQuotaResponse> showTagQuotaInvoker(ShowTagQuotaRequest request) {
        return new SyncInvoker<ShowTagQuotaRequest, ShowTagQuotaResponse>(request, TmsMeta.showTagQuota, hcClient);
    }

    /**
     * 修改预定义标签
     *
     * 修改预定义标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePredefineTagsRequest 请求对象
     * @return UpdatePredefineTagsResponse
     */
    public UpdatePredefineTagsResponse updatePredefineTags(UpdatePredefineTagsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.updatePredefineTags);
    }

    /**
     * 修改预定义标签
     *
     * 修改预定义标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePredefineTagsRequest 请求对象
     * @return SyncInvoker<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse>
     */
    public SyncInvoker<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse> updatePredefineTagsInvoker(
        UpdatePredefineTagsRequest request) {
        return new SyncInvoker<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse>(request,
            TmsMeta.updatePredefineTags, hcClient);
    }

}
