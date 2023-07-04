package com.huaweicloud.sdk.iotanalytics.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.iotanalytics.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class IoTAnalyticsAsyncClient {

    protected HcClient hcClient;

    public IoTAnalyticsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IoTAnalyticsAsyncClient> newBuilder() {
        return new ClientBuilder<>(IoTAnalyticsAsyncClient::new);
    }

    /**
     * 创建资产模型
     *
     * 创建资产模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAssetModelRequest 请求对象
     * @return CompletableFuture<CreateAssetModelResponse>
     */
    public CompletableFuture<CreateAssetModelResponse> createAssetModelAsync(CreateAssetModelRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.createAssetModel);
    }

    /**
     * 创建资产模型
     *
     * 创建资产模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAssetModelRequest 请求对象
     * @return AsyncInvoker<CreateAssetModelRequest, CreateAssetModelResponse>
     */
    public AsyncInvoker<CreateAssetModelRequest, CreateAssetModelResponse> createAssetModelAsyncInvoker(
        CreateAssetModelRequest request) {
        return new AsyncInvoker<CreateAssetModelRequest, CreateAssetModelResponse>(request,
            IoTAnalyticsMeta.createAssetModel, hcClient);
    }

    /**
     * 删除资产模型
     *
     * 删除资产模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetModelRequest 请求对象
     * @return CompletableFuture<DeleteAssetModelResponse>
     */
    public CompletableFuture<DeleteAssetModelResponse> deleteAssetModelAsync(DeleteAssetModelRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.deleteAssetModel);
    }

    /**
     * 删除资产模型
     *
     * 删除资产模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetModelRequest 请求对象
     * @return AsyncInvoker<DeleteAssetModelRequest, DeleteAssetModelResponse>
     */
    public AsyncInvoker<DeleteAssetModelRequest, DeleteAssetModelResponse> deleteAssetModelAsyncInvoker(
        DeleteAssetModelRequest request) {
        return new AsyncInvoker<DeleteAssetModelRequest, DeleteAssetModelResponse>(request,
            IoTAnalyticsMeta.deleteAssetModel, hcClient);
    }

    /**
     * 获取资产模型列表
     *
     * 获取资产模型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetModelsRequest 请求对象
     * @return CompletableFuture<ListAssetModelsResponse>
     */
    public CompletableFuture<ListAssetModelsResponse> listAssetModelsAsync(ListAssetModelsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.listAssetModels);
    }

    /**
     * 获取资产模型列表
     *
     * 获取资产模型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetModelsRequest 请求对象
     * @return AsyncInvoker<ListAssetModelsRequest, ListAssetModelsResponse>
     */
    public AsyncInvoker<ListAssetModelsRequest, ListAssetModelsResponse> listAssetModelsAsyncInvoker(
        ListAssetModelsRequest request) {
        return new AsyncInvoker<ListAssetModelsRequest, ListAssetModelsResponse>(request,
            IoTAnalyticsMeta.listAssetModels, hcClient);
    }

    /**
     * 获取资产模型详情
     *
     * 获取资产模型详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetModelRequest 请求对象
     * @return CompletableFuture<ShowAssetModelResponse>
     */
    public CompletableFuture<ShowAssetModelResponse> showAssetModelAsync(ShowAssetModelRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.showAssetModel);
    }

    /**
     * 获取资产模型详情
     *
     * 获取资产模型详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetModelRequest 请求对象
     * @return AsyncInvoker<ShowAssetModelRequest, ShowAssetModelResponse>
     */
    public AsyncInvoker<ShowAssetModelRequest, ShowAssetModelResponse> showAssetModelAsyncInvoker(
        ShowAssetModelRequest request) {
        return new AsyncInvoker<ShowAssetModelRequest, ShowAssetModelResponse>(request, IoTAnalyticsMeta.showAssetModel,
            hcClient);
    }

    /**
     * 修改资产模型
     *
     * 修改资产模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssetModelRequest 请求对象
     * @return CompletableFuture<UpdateAssetModelResponse>
     */
    public CompletableFuture<UpdateAssetModelResponse> updateAssetModelAsync(UpdateAssetModelRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.updateAssetModel);
    }

    /**
     * 修改资产模型
     *
     * 修改资产模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssetModelRequest 请求对象
     * @return AsyncInvoker<UpdateAssetModelRequest, UpdateAssetModelResponse>
     */
    public AsyncInvoker<UpdateAssetModelRequest, UpdateAssetModelResponse> updateAssetModelAsyncInvoker(
        UpdateAssetModelRequest request) {
        return new AsyncInvoker<UpdateAssetModelRequest, UpdateAssetModelResponse>(request,
            IoTAnalyticsMeta.updateAssetModel, hcClient);
    }

    /**
     * 创建资产
     *
     * 创建资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAssetNewRequest 请求对象
     * @return CompletableFuture<CreateAssetNewResponse>
     */
    public CompletableFuture<CreateAssetNewResponse> createAssetNewAsync(CreateAssetNewRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.createAssetNew);
    }

    /**
     * 创建资产
     *
     * 创建资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAssetNewRequest 请求对象
     * @return AsyncInvoker<CreateAssetNewRequest, CreateAssetNewResponse>
     */
    public AsyncInvoker<CreateAssetNewRequest, CreateAssetNewResponse> createAssetNewAsyncInvoker(
        CreateAssetNewRequest request) {
        return new AsyncInvoker<CreateAssetNewRequest, CreateAssetNewResponse>(request, IoTAnalyticsMeta.createAssetNew,
            hcClient);
    }

    /**
     * 删除资产
     *
     * 删除资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetNewRequest 请求对象
     * @return CompletableFuture<DeleteAssetNewResponse>
     */
    public CompletableFuture<DeleteAssetNewResponse> deleteAssetNewAsync(DeleteAssetNewRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.deleteAssetNew);
    }

    /**
     * 删除资产
     *
     * 删除资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetNewRequest 请求对象
     * @return AsyncInvoker<DeleteAssetNewRequest, DeleteAssetNewResponse>
     */
    public AsyncInvoker<DeleteAssetNewRequest, DeleteAssetNewResponse> deleteAssetNewAsyncInvoker(
        DeleteAssetNewRequest request) {
        return new AsyncInvoker<DeleteAssetNewRequest, DeleteAssetNewResponse>(request, IoTAnalyticsMeta.deleteAssetNew,
            hcClient);
    }

    /**
     * 获取资产列表
     *
     * 获取资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetsNewRequest 请求对象
     * @return CompletableFuture<ListAssetsNewResponse>
     */
    public CompletableFuture<ListAssetsNewResponse> listAssetsNewAsync(ListAssetsNewRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.listAssetsNew);
    }

    /**
     * 获取资产列表
     *
     * 获取资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetsNewRequest 请求对象
     * @return AsyncInvoker<ListAssetsNewRequest, ListAssetsNewResponse>
     */
    public AsyncInvoker<ListAssetsNewRequest, ListAssetsNewResponse> listAssetsNewAsyncInvoker(
        ListAssetsNewRequest request) {
        return new AsyncInvoker<ListAssetsNewRequest, ListAssetsNewResponse>(request, IoTAnalyticsMeta.listAssetsNew,
            hcClient);
    }

    /**
     * 发布资产
     *
     * 发布资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishRootAssetRequest 请求对象
     * @return CompletableFuture<PublishRootAssetResponse>
     */
    public CompletableFuture<PublishRootAssetResponse> publishRootAssetAsync(PublishRootAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.publishRootAsset);
    }

    /**
     * 发布资产
     *
     * 发布资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishRootAssetRequest 请求对象
     * @return AsyncInvoker<PublishRootAssetRequest, PublishRootAssetResponse>
     */
    public AsyncInvoker<PublishRootAssetRequest, PublishRootAssetResponse> publishRootAssetAsyncInvoker(
        PublishRootAssetRequest request) {
        return new AsyncInvoker<PublishRootAssetRequest, PublishRootAssetResponse>(request,
            IoTAnalyticsMeta.publishRootAsset, hcClient);
    }

    /**
     * 获取资产详情
     *
     * 获取资产详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetNewRequest 请求对象
     * @return CompletableFuture<ShowAssetNewResponse>
     */
    public CompletableFuture<ShowAssetNewResponse> showAssetNewAsync(ShowAssetNewRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.showAssetNew);
    }

    /**
     * 获取资产详情
     *
     * 获取资产详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetNewRequest 请求对象
     * @return AsyncInvoker<ShowAssetNewRequest, ShowAssetNewResponse>
     */
    public AsyncInvoker<ShowAssetNewRequest, ShowAssetNewResponse> showAssetNewAsyncInvoker(
        ShowAssetNewRequest request) {
        return new AsyncInvoker<ShowAssetNewRequest, ShowAssetNewResponse>(request, IoTAnalyticsMeta.showAssetNew,
            hcClient);
    }

    /**
     * 修改资产
     *
     * 修改资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssetNewRequest 请求对象
     * @return CompletableFuture<UpdateAssetNewResponse>
     */
    public CompletableFuture<UpdateAssetNewResponse> updateAssetNewAsync(UpdateAssetNewRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.updateAssetNew);
    }

    /**
     * 修改资产
     *
     * 修改资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssetNewRequest 请求对象
     * @return AsyncInvoker<UpdateAssetNewRequest, UpdateAssetNewResponse>
     */
    public AsyncInvoker<UpdateAssetNewRequest, UpdateAssetNewResponse> updateAssetNewAsyncInvoker(
        UpdateAssetNewRequest request) {
        return new AsyncInvoker<UpdateAssetNewRequest, UpdateAssetNewResponse>(request, IoTAnalyticsMeta.updateAssetNew,
            hcClient);
    }

    /**
     * 获取资产属性最新值
     *
     * 获取资产属性最新值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLastPropertyValueRequest 请求对象
     * @return CompletableFuture<ShowLastPropertyValueResponse>
     */
    public CompletableFuture<ShowLastPropertyValueResponse> showLastPropertyValueAsync(
        ShowLastPropertyValueRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.showLastPropertyValue);
    }

    /**
     * 获取资产属性最新值
     *
     * 获取资产属性最新值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLastPropertyValueRequest 请求对象
     * @return AsyncInvoker<ShowLastPropertyValueRequest, ShowLastPropertyValueResponse>
     */
    public AsyncInvoker<ShowLastPropertyValueRequest, ShowLastPropertyValueResponse> showLastPropertyValueAsyncInvoker(
        ShowLastPropertyValueRequest request) {
        return new AsyncInvoker<ShowLastPropertyValueRequest, ShowLastPropertyValueResponse>(request,
            IoTAnalyticsMeta.showLastPropertyValue, hcClient);
    }

    /**
     * 获取资产属性聚合值
     *
     * 获取资产属性聚合值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMetricValueRequest 请求对象
     * @return CompletableFuture<ShowMetricValueResponse>
     */
    public CompletableFuture<ShowMetricValueResponse> showMetricValueAsync(ShowMetricValueRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.showMetricValue);
    }

    /**
     * 获取资产属性聚合值
     *
     * 获取资产属性聚合值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMetricValueRequest 请求对象
     * @return AsyncInvoker<ShowMetricValueRequest, ShowMetricValueResponse>
     */
    public AsyncInvoker<ShowMetricValueRequest, ShowMetricValueResponse> showMetricValueAsyncInvoker(
        ShowMetricValueRequest request) {
        return new AsyncInvoker<ShowMetricValueRequest, ShowMetricValueResponse>(request,
            IoTAnalyticsMeta.showMetricValue, hcClient);
    }

    /**
     * 获取资产属性历史值
     *
     * 获取资产属性历史值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPropertyRawValueRequest 请求对象
     * @return CompletableFuture<ShowPropertyRawValueResponse>
     */
    public CompletableFuture<ShowPropertyRawValueResponse> showPropertyRawValueAsync(
        ShowPropertyRawValueRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.showPropertyRawValue);
    }

    /**
     * 获取资产属性历史值
     *
     * 获取资产属性历史值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPropertyRawValueRequest 请求对象
     * @return AsyncInvoker<ShowPropertyRawValueRequest, ShowPropertyRawValueResponse>
     */
    public AsyncInvoker<ShowPropertyRawValueRequest, ShowPropertyRawValueResponse> showPropertyRawValueAsyncInvoker(
        ShowPropertyRawValueRequest request) {
        return new AsyncInvoker<ShowPropertyRawValueRequest, ShowPropertyRawValueResponse>(request,
            IoTAnalyticsMeta.showPropertyRawValue, hcClient);
    }

    /**
     * 创建批计算资源
     *
     * 创建批计算资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComputingResourceRequest 请求对象
     * @return CompletableFuture<CreateComputingResourceResponse>
     */
    public CompletableFuture<CreateComputingResourceResponse> createComputingResourceAsync(
        CreateComputingResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.createComputingResource);
    }

    /**
     * 创建批计算资源
     *
     * 创建批计算资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComputingResourceRequest 请求对象
     * @return AsyncInvoker<CreateComputingResourceRequest, CreateComputingResourceResponse>
     */
    public AsyncInvoker<CreateComputingResourceRequest, CreateComputingResourceResponse> createComputingResourceAsyncInvoker(
        CreateComputingResourceRequest request) {
        return new AsyncInvoker<CreateComputingResourceRequest, CreateComputingResourceResponse>(request,
            IoTAnalyticsMeta.createComputingResource, hcClient);
    }

    /**
     * 删除批计算资源
     *
     * 删除批计算资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComputingResourceRequest 请求对象
     * @return CompletableFuture<DeleteComputingResourceResponse>
     */
    public CompletableFuture<DeleteComputingResourceResponse> deleteComputingResourceAsync(
        DeleteComputingResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.deleteComputingResource);
    }

    /**
     * 删除批计算资源
     *
     * 删除批计算资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComputingResourceRequest 请求对象
     * @return AsyncInvoker<DeleteComputingResourceRequest, DeleteComputingResourceResponse>
     */
    public AsyncInvoker<DeleteComputingResourceRequest, DeleteComputingResourceResponse> deleteComputingResourceAsyncInvoker(
        DeleteComputingResourceRequest request) {
        return new AsyncInvoker<DeleteComputingResourceRequest, DeleteComputingResourceResponse>(request,
            IoTAnalyticsMeta.deleteComputingResource, hcClient);
    }

    /**
     * 查询批计算资源列表
     *
     * 查询批计算资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComputingResourcesRequest 请求对象
     * @return CompletableFuture<ListComputingResourcesResponse>
     */
    public CompletableFuture<ListComputingResourcesResponse> listComputingResourcesAsync(
        ListComputingResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.listComputingResources);
    }

    /**
     * 查询批计算资源列表
     *
     * 查询批计算资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComputingResourcesRequest 请求对象
     * @return AsyncInvoker<ListComputingResourcesRequest, ListComputingResourcesResponse>
     */
    public AsyncInvoker<ListComputingResourcesRequest, ListComputingResourcesResponse> listComputingResourcesAsyncInvoker(
        ListComputingResourcesRequest request) {
        return new AsyncInvoker<ListComputingResourcesRequest, ListComputingResourcesResponse>(request,
            IoTAnalyticsMeta.listComputingResources, hcClient);
    }

    /**
     * 创建数据源
     *
     * 创建数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatasourceRequest 请求对象
     * @return CompletableFuture<CreateDatasourceResponse>
     */
    public CompletableFuture<CreateDatasourceResponse> createDatasourceAsync(CreateDatasourceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.createDatasource);
    }

    /**
     * 创建数据源
     *
     * 创建数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatasourceRequest 请求对象
     * @return AsyncInvoker<CreateDatasourceRequest, CreateDatasourceResponse>
     */
    public AsyncInvoker<CreateDatasourceRequest, CreateDatasourceResponse> createDatasourceAsyncInvoker(
        CreateDatasourceRequest request) {
        return new AsyncInvoker<CreateDatasourceRequest, CreateDatasourceResponse>(request,
            IoTAnalyticsMeta.createDatasource, hcClient);
    }

    /**
     * 删除数据源
     *
     * 删除数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatasourceRequest 请求对象
     * @return CompletableFuture<DeleteDatasourceResponse>
     */
    public CompletableFuture<DeleteDatasourceResponse> deleteDatasourceAsync(DeleteDatasourceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.deleteDatasource);
    }

    /**
     * 删除数据源
     *
     * 删除数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatasourceRequest 请求对象
     * @return AsyncInvoker<DeleteDatasourceRequest, DeleteDatasourceResponse>
     */
    public AsyncInvoker<DeleteDatasourceRequest, DeleteDatasourceResponse> deleteDatasourceAsyncInvoker(
        DeleteDatasourceRequest request) {
        return new AsyncInvoker<DeleteDatasourceRequest, DeleteDatasourceResponse>(request,
            IoTAnalyticsMeta.deleteDatasource, hcClient);
    }

    /**
     * 查询数据源列表
     *
     * 查询数据源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllDataSourceRequest 请求对象
     * @return CompletableFuture<ShowAllDataSourceResponse>
     */
    public CompletableFuture<ShowAllDataSourceResponse> showAllDataSourceAsync(ShowAllDataSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.showAllDataSource);
    }

    /**
     * 查询数据源列表
     *
     * 查询数据源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllDataSourceRequest 请求对象
     * @return AsyncInvoker<ShowAllDataSourceRequest, ShowAllDataSourceResponse>
     */
    public AsyncInvoker<ShowAllDataSourceRequest, ShowAllDataSourceResponse> showAllDataSourceAsyncInvoker(
        ShowAllDataSourceRequest request) {
        return new AsyncInvoker<ShowAllDataSourceRequest, ShowAllDataSourceResponse>(request,
            IoTAnalyticsMeta.showAllDataSource, hcClient);
    }

    /**
     * 查询数据源详情
     *
     * 查询数据源详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataSourceRequest 请求对象
     * @return CompletableFuture<ShowDataSourceResponse>
     */
    public CompletableFuture<ShowDataSourceResponse> showDataSourceAsync(ShowDataSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.showDataSource);
    }

    /**
     * 查询数据源详情
     *
     * 查询数据源详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataSourceRequest 请求对象
     * @return AsyncInvoker<ShowDataSourceRequest, ShowDataSourceResponse>
     */
    public AsyncInvoker<ShowDataSourceRequest, ShowDataSourceResponse> showDataSourceAsyncInvoker(
        ShowDataSourceRequest request) {
        return new AsyncInvoker<ShowDataSourceRequest, ShowDataSourceResponse>(request, IoTAnalyticsMeta.showDataSource,
            hcClient);
    }

    /**
     * 修改数据源
     *
     * 修改数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataSourceRequest 请求对象
     * @return CompletableFuture<UpdateDataSourceResponse>
     */
    public CompletableFuture<UpdateDataSourceResponse> updateDataSourceAsync(UpdateDataSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.updateDataSource);
    }

    /**
     * 修改数据源
     *
     * 修改数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataSourceRequest 请求对象
     * @return AsyncInvoker<UpdateDataSourceRequest, UpdateDataSourceResponse>
     */
    public AsyncInvoker<UpdateDataSourceRequest, UpdateDataSourceResponse> updateDataSourceAsyncInvoker(
        UpdateDataSourceRequest request) {
        return new AsyncInvoker<UpdateDataSourceRequest, UpdateDataSourceResponse>(request,
            IoTAnalyticsMeta.updateDataSource, hcClient);
    }

    /**
     * 创建存储组
     *
     * 创建存储组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGroupRequest 请求对象
     * @return CompletableFuture<CreateGroupResponse>
     */
    public CompletableFuture<CreateGroupResponse> createGroupAsync(CreateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.createGroup);
    }

    /**
     * 创建存储组
     *
     * 创建存储组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGroupRequest 请求对象
     * @return AsyncInvoker<CreateGroupRequest, CreateGroupResponse>
     */
    public AsyncInvoker<CreateGroupRequest, CreateGroupResponse> createGroupAsyncInvoker(CreateGroupRequest request) {
        return new AsyncInvoker<CreateGroupRequest, CreateGroupResponse>(request, IoTAnalyticsMeta.createGroup,
            hcClient);
    }

    /**
     * 删除存储组
     *
     * 删除存储组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGroupRequest 请求对象
     * @return CompletableFuture<DeleteGroupResponse>
     */
    public CompletableFuture<DeleteGroupResponse> deleteGroupAsync(DeleteGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.deleteGroup);
    }

    /**
     * 删除存储组
     *
     * 删除存储组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGroupRequest 请求对象
     * @return AsyncInvoker<DeleteGroupRequest, DeleteGroupResponse>
     */
    public AsyncInvoker<DeleteGroupRequest, DeleteGroupResponse> deleteGroupAsyncInvoker(DeleteGroupRequest request) {
        return new AsyncInvoker<DeleteGroupRequest, DeleteGroupResponse>(request, IoTAnalyticsMeta.deleteGroup,
            hcClient);
    }

    /**
     * 查询存储组列表
     *
     * 查询存储组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGroupsRequest 请求对象
     * @return CompletableFuture<ListGroupsResponse>
     */
    public CompletableFuture<ListGroupsResponse> listGroupsAsync(ListGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.listGroups);
    }

    /**
     * 查询存储组列表
     *
     * 查询存储组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGroupsRequest 请求对象
     * @return AsyncInvoker<ListGroupsRequest, ListGroupsResponse>
     */
    public AsyncInvoker<ListGroupsRequest, ListGroupsResponse> listGroupsAsyncInvoker(ListGroupsRequest request) {
        return new AsyncInvoker<ListGroupsRequest, ListGroupsResponse>(request, IoTAnalyticsMeta.listGroups, hcClient);
    }

    /**
     * 更新存储组
     *
     * 更新存储组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGroupRequest 请求对象
     * @return CompletableFuture<UpdateGroupResponse>
     */
    public CompletableFuture<UpdateGroupResponse> updateGroupAsync(UpdateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.updateGroup);
    }

    /**
     * 更新存储组
     *
     * 更新存储组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGroupRequest 请求对象
     * @return AsyncInvoker<UpdateGroupRequest, UpdateGroupResponse>
     */
    public AsyncInvoker<UpdateGroupRequest, UpdateGroupResponse> updateGroupAsyncInvoker(UpdateGroupRequest request) {
        return new AsyncInvoker<UpdateGroupRequest, UpdateGroupResponse>(request, IoTAnalyticsMeta.updateGroup,
            hcClient);
    }

    /**
     * 删除存储
     *
     * 删除存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataStoreRequest 请求对象
     * @return CompletableFuture<DeleteDataStoreResponse>
     */
    public CompletableFuture<DeleteDataStoreResponse> deleteDataStoreAsync(DeleteDataStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.deleteDataStore);
    }

    /**
     * 删除存储
     *
     * 删除存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataStoreRequest 请求对象
     * @return AsyncInvoker<DeleteDataStoreRequest, DeleteDataStoreResponse>
     */
    public AsyncInvoker<DeleteDataStoreRequest, DeleteDataStoreResponse> deleteDataStoreAsyncInvoker(
        DeleteDataStoreRequest request) {
        return new AsyncInvoker<DeleteDataStoreRequest, DeleteDataStoreResponse>(request,
            IoTAnalyticsMeta.deleteDataStore, hcClient);
    }

    /**
     * 查询存储列表
     *
     * 查询存储列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataStoresRequest 请求对象
     * @return CompletableFuture<ListDataStoresResponse>
     */
    public CompletableFuture<ListDataStoresResponse> listDataStoresAsync(ListDataStoresRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.listDataStores);
    }

    /**
     * 查询存储列表
     *
     * 查询存储列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataStoresRequest 请求对象
     * @return AsyncInvoker<ListDataStoresRequest, ListDataStoresResponse>
     */
    public AsyncInvoker<ListDataStoresRequest, ListDataStoresResponse> listDataStoresAsyncInvoker(
        ListDataStoresRequest request) {
        return new AsyncInvoker<ListDataStoresRequest, ListDataStoresResponse>(request, IoTAnalyticsMeta.listDataStores,
            hcClient);
    }

    /**
     * 更新存储
     *
     * 更新存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataStoreRequest 请求对象
     * @return CompletableFuture<UpdateDataStoreResponse>
     */
    public CompletableFuture<UpdateDataStoreResponse> updateDataStoreAsync(UpdateDataStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.updateDataStore);
    }

    /**
     * 更新存储
     *
     * 更新存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataStoreRequest 请求对象
     * @return AsyncInvoker<UpdateDataStoreRequest, UpdateDataStoreResponse>
     */
    public AsyncInvoker<UpdateDataStoreRequest, UpdateDataStoreResponse> updateDataStoreAsyncInvoker(
        UpdateDataStoreRequest request) {
        return new AsyncInvoker<UpdateDataStoreRequest, UpdateDataStoreResponse>(request,
            IoTAnalyticsMeta.updateDataStore, hcClient);
    }

    /**
     * 根据标签查询设备历史值
     *
     * 根据标签查询设备历史值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHistoryRequest 请求对象
     * @return CompletableFuture<ListHistoryResponse>
     */
    public CompletableFuture<ListHistoryResponse> listHistoryAsync(ListHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.listHistory);
    }

    /**
     * 根据标签查询设备历史值
     *
     * 根据标签查询设备历史值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHistoryRequest 请求对象
     * @return AsyncInvoker<ListHistoryRequest, ListHistoryResponse>
     */
    public AsyncInvoker<ListHistoryRequest, ListHistoryResponse> listHistoryAsyncInvoker(ListHistoryRequest request) {
        return new AsyncInvoker<ListHistoryRequest, ListHistoryResponse>(request, IoTAnalyticsMeta.listHistory,
            hcClient);
    }

    /**
     * 根据标签聚合、查询指标数据
     *
     * 根据标签聚合、查询数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMetricsRequest 请求对象
     * @return CompletableFuture<ListMetricsResponse>
     */
    public CompletableFuture<ListMetricsResponse> listMetricsAsync(ListMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.listMetrics);
    }

    /**
     * 根据标签聚合、查询指标数据
     *
     * 根据标签聚合、查询数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMetricsRequest 请求对象
     * @return AsyncInvoker<ListMetricsRequest, ListMetricsResponse>
     */
    public AsyncInvoker<ListMetricsRequest, ListMetricsResponse> listMetricsAsyncInvoker(ListMetricsRequest request) {
        return new AsyncInvoker<ListMetricsRequest, ListMetricsResponse>(request, IoTAnalyticsMeta.listMetrics,
            hcClient);
    }

    /**
     * 查询设备属性最新状态值
     *
     * 查询设备属性最新状态值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPropertyValuesRequest 请求对象
     * @return CompletableFuture<ShowPropertyValuesResponse>
     */
    public CompletableFuture<ShowPropertyValuesResponse> showPropertyValuesAsync(ShowPropertyValuesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.showPropertyValues);
    }

    /**
     * 查询设备属性最新状态值
     *
     * 查询设备属性最新状态值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPropertyValuesRequest 请求对象
     * @return AsyncInvoker<ShowPropertyValuesRequest, ShowPropertyValuesResponse>
     */
    public AsyncInvoker<ShowPropertyValuesRequest, ShowPropertyValuesResponse> showPropertyValuesAsyncInvoker(
        ShowPropertyValuesRequest request) {
        return new AsyncInvoker<ShowPropertyValuesRequest, ShowPropertyValuesResponse>(request,
            IoTAnalyticsMeta.showPropertyValues, hcClient);
    }

    /**
     * 查询标签的值列表
     *
     * 查询标签的值列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagValuesRequest 请求对象
     * @return CompletableFuture<ListTagValuesResponse>
     */
    public CompletableFuture<ListTagValuesResponse> listTagValuesAsync(ListTagValuesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.listTagValues);
    }

    /**
     * 查询标签的值列表
     *
     * 查询标签的值列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagValuesRequest 请求对象
     * @return AsyncInvoker<ListTagValuesRequest, ListTagValuesResponse>
     */
    public AsyncInvoker<ListTagValuesRequest, ListTagValuesResponse> listTagValuesAsyncInvoker(
        ListTagValuesRequest request) {
        return new AsyncInvoker<ListTagValuesRequest, ListTagValuesResponse>(request, IoTAnalyticsMeta.listTagValues,
            hcClient);
    }

    /**
     * 下载离线作业结果
     *
     * 将SQL语句的查询结果下载到本地，只支持下载“QUERY”类型作业的查询结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportDatasetRequest 请求对象
     * @return CompletableFuture<ExportDatasetResponse>
     */
    public CompletableFuture<ExportDatasetResponse> exportDatasetAsync(ExportDatasetRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.exportDataset);
    }

    /**
     * 下载离线作业结果
     *
     * 将SQL语句的查询结果下载到本地，只支持下载“QUERY”类型作业的查询结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportDatasetRequest 请求对象
     * @return AsyncInvoker<ExportDatasetRequest, ExportDatasetResponse>
     */
    public AsyncInvoker<ExportDatasetRequest, ExportDatasetResponse> exportDatasetAsyncInvoker(
        ExportDatasetRequest request) {
        return new AsyncInvoker<ExportDatasetRequest, ExportDatasetResponse>(request, IoTAnalyticsMeta.exportDataset,
            hcClient);
    }

    /**
     * 执行导入数据离线作业
     *
     * 将数据从文件导入OBS表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportDataRequest 请求对象
     * @return CompletableFuture<ImportDataResponse>
     */
    public CompletableFuture<ImportDataResponse> importDataAsync(ImportDataRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.importData);
    }

    /**
     * 执行导入数据离线作业
     *
     * 将数据从文件导入OBS表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportDataRequest 请求对象
     * @return AsyncInvoker<ImportDataRequest, ImportDataResponse>
     */
    public AsyncInvoker<ImportDataRequest, ImportDataResponse> importDataAsyncInvoker(ImportDataRequest request) {
        return new AsyncInvoker<ImportDataRequest, ImportDataResponse>(request, IoTAnalyticsMeta.importData, hcClient);
    }

    /**
     * 查询离线作业结果
     *
     * 在执行SQL查询语句的作业完成后，查看该作业执行的结果。目前仅支持查看“QUERY”类型作业的执行结果。该API只能查看前1000条的结果记录，若要查看全部的结果记录，需要先导出查询结果再进行查看。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatasetRequest 请求对象
     * @return CompletableFuture<ShowDatasetResponse>
     */
    public CompletableFuture<ShowDatasetResponse> showDatasetAsync(ShowDatasetRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.showDataset);
    }

    /**
     * 查询离线作业结果
     *
     * 在执行SQL查询语句的作业完成后，查看该作业执行的结果。目前仅支持查看“QUERY”类型作业的执行结果。该API只能查看前1000条的结果记录，若要查看全部的结果记录，需要先导出查询结果再进行查看。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatasetRequest 请求对象
     * @return AsyncInvoker<ShowDatasetRequest, ShowDatasetResponse>
     */
    public AsyncInvoker<ShowDatasetRequest, ShowDatasetResponse> showDatasetAsyncInvoker(ShowDatasetRequest request) {
        return new AsyncInvoker<ShowDatasetRequest, ShowDatasetResponse>(request, IoTAnalyticsMeta.showDataset,
            hcClient);
    }

    /**
     * 检查离线作业SQL语法
     *
     * 检查离线作业SQL语法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateSqlRequest 请求对象
     * @return CompletableFuture<ValidateSqlResponse>
     */
    public CompletableFuture<ValidateSqlResponse> validateSqlAsync(ValidateSqlRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.validateSql);
    }

    /**
     * 检查离线作业SQL语法
     *
     * 检查离线作业SQL语法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateSqlRequest 请求对象
     * @return AsyncInvoker<ValidateSqlRequest, ValidateSqlResponse>
     */
    public AsyncInvoker<ValidateSqlRequest, ValidateSqlResponse> validateSqlAsyncInvoker(ValidateSqlRequest request) {
        return new AsyncInvoker<ValidateSqlRequest, ValidateSqlResponse>(request, IoTAnalyticsMeta.validateSql,
            hcClient);
    }

    /**
     * 通过API数据源上报设备数据
     *
     * 通过API数据源上报设备数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDevDataRequest 请求对象
     * @return CompletableFuture<AddDevDataResponse>
     */
    public CompletableFuture<AddDevDataResponse> addDevDataAsync(AddDevDataRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.addDevData);
    }

    /**
     * 通过API数据源上报设备数据
     *
     * 通过API数据源上报设备数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDevDataRequest 请求对象
     * @return AsyncInvoker<AddDevDataRequest, AddDevDataResponse>
     */
    public AsyncInvoker<AddDevDataRequest, AddDevDataResponse> addDevDataAsyncInvoker(AddDevDataRequest request) {
        return new AsyncInvoker<AddDevDataRequest, AddDevDataResponse>(request, IoTAnalyticsMeta.addDevData, hcClient);
    }

    /**
     * 创建离线作业
     *
     * 创建离线作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBatchJobRequest 请求对象
     * @return CompletableFuture<CreateBatchJobResponse>
     */
    public CompletableFuture<CreateBatchJobResponse> createBatchJobAsync(CreateBatchJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.createBatchJob);
    }

    /**
     * 创建离线作业
     *
     * 创建离线作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBatchJobRequest 请求对象
     * @return AsyncInvoker<CreateBatchJobRequest, CreateBatchJobResponse>
     */
    public AsyncInvoker<CreateBatchJobRequest, CreateBatchJobResponse> createBatchJobAsyncInvoker(
        CreateBatchJobRequest request) {
        return new AsyncInvoker<CreateBatchJobRequest, CreateBatchJobResponse>(request, IoTAnalyticsMeta.createBatchJob,
            hcClient);
    }

    /**
     * 删除离线作业
     *
     * 删除离线作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBatchJobRequest 请求对象
     * @return CompletableFuture<DeleteBatchJobResponse>
     */
    public CompletableFuture<DeleteBatchJobResponse> deleteBatchJobAsync(DeleteBatchJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.deleteBatchJob);
    }

    /**
     * 删除离线作业
     *
     * 删除离线作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBatchJobRequest 请求对象
     * @return AsyncInvoker<DeleteBatchJobRequest, DeleteBatchJobResponse>
     */
    public AsyncInvoker<DeleteBatchJobRequest, DeleteBatchJobResponse> deleteBatchJobAsyncInvoker(
        DeleteBatchJobRequest request) {
        return new AsyncInvoker<DeleteBatchJobRequest, DeleteBatchJobResponse>(request, IoTAnalyticsMeta.deleteBatchJob,
            hcClient);
    }

    /**
     * 查询离线作业列表
     *
     * 查询离线作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBatchJobsRequest 请求对象
     * @return CompletableFuture<ListBatchJobsResponse>
     */
    public CompletableFuture<ListBatchJobsResponse> listBatchJobsAsync(ListBatchJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.listBatchJobs);
    }

    /**
     * 查询离线作业列表
     *
     * 查询离线作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBatchJobsRequest 请求对象
     * @return AsyncInvoker<ListBatchJobsRequest, ListBatchJobsResponse>
     */
    public AsyncInvoker<ListBatchJobsRequest, ListBatchJobsResponse> listBatchJobsAsyncInvoker(
        ListBatchJobsRequest request) {
        return new AsyncInvoker<ListBatchJobsRequest, ListBatchJobsResponse>(request, IoTAnalyticsMeta.listBatchJobs,
            hcClient);
    }

    /**
     * 查询离线作业详情
     *
     * 查询离线作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBatchJobRequest 请求对象
     * @return CompletableFuture<ShowBatchJobResponse>
     */
    public CompletableFuture<ShowBatchJobResponse> showBatchJobAsync(ShowBatchJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.showBatchJob);
    }

    /**
     * 查询离线作业详情
     *
     * 查询离线作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBatchJobRequest 请求对象
     * @return AsyncInvoker<ShowBatchJobRequest, ShowBatchJobResponse>
     */
    public AsyncInvoker<ShowBatchJobRequest, ShowBatchJobResponse> showBatchJobAsyncInvoker(
        ShowBatchJobRequest request) {
        return new AsyncInvoker<ShowBatchJobRequest, ShowBatchJobResponse>(request, IoTAnalyticsMeta.showBatchJob,
            hcClient);
    }

    /**
     * 修改离线作业
     *
     * 修改离线作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBatchJobRequest 请求对象
     * @return CompletableFuture<UpdateBatchJobResponse>
     */
    public CompletableFuture<UpdateBatchJobResponse> updateBatchJobAsync(UpdateBatchJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.updateBatchJob);
    }

    /**
     * 修改离线作业
     *
     * 修改离线作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBatchJobRequest 请求对象
     * @return AsyncInvoker<UpdateBatchJobRequest, UpdateBatchJobResponse>
     */
    public AsyncInvoker<UpdateBatchJobRequest, UpdateBatchJobResponse> updateBatchJobAsyncInvoker(
        UpdateBatchJobRequest request) {
        return new AsyncInvoker<UpdateBatchJobRequest, UpdateBatchJobResponse>(request, IoTAnalyticsMeta.updateBatchJob,
            hcClient);
    }

    /**
     * 新建管道作业
     *
     * 新建管道作业时，需要在URL中指定是更新哪一个作业，将在body中附带完整的作业信息。（作业中各算子的详细配置请参考算子配置章节。） check参数表示是否需要对作业配置进行检查，若为false，则不检查，将作业保存为草稿；若为true，则对作业配置进行检查。当检查不通过时，将作业状态修改为草稿；检查通过时，将作业状态修改为就绪，并返回成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddPipelineJobRequest 请求对象
     * @return CompletableFuture<AddPipelineJobResponse>
     */
    public CompletableFuture<AddPipelineJobResponse> addPipelineJobAsync(AddPipelineJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.addPipelineJob);
    }

    /**
     * 新建管道作业
     *
     * 新建管道作业时，需要在URL中指定是更新哪一个作业，将在body中附带完整的作业信息。（作业中各算子的详细配置请参考算子配置章节。） check参数表示是否需要对作业配置进行检查，若为false，则不检查，将作业保存为草稿；若为true，则对作业配置进行检查。当检查不通过时，将作业状态修改为草稿；检查通过时，将作业状态修改为就绪，并返回成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddPipelineJobRequest 请求对象
     * @return AsyncInvoker<AddPipelineJobRequest, AddPipelineJobResponse>
     */
    public AsyncInvoker<AddPipelineJobRequest, AddPipelineJobResponse> addPipelineJobAsyncInvoker(
        AddPipelineJobRequest request) {
        return new AsyncInvoker<AddPipelineJobRequest, AddPipelineJobResponse>(request, IoTAnalyticsMeta.addPipelineJob,
            hcClient);
    }

    /**
     * 删除管道作业
     *
     * 删除用户指定的管道作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePipelineJobRequest 请求对象
     * @return CompletableFuture<DeletePipelineJobResponse>
     */
    public CompletableFuture<DeletePipelineJobResponse> deletePipelineJobAsync(DeletePipelineJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.deletePipelineJob);
    }

    /**
     * 删除管道作业
     *
     * 删除用户指定的管道作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePipelineJobRequest 请求对象
     * @return AsyncInvoker<DeletePipelineJobRequest, DeletePipelineJobResponse>
     */
    public AsyncInvoker<DeletePipelineJobRequest, DeletePipelineJobResponse> deletePipelineJobAsyncInvoker(
        DeletePipelineJobRequest request) {
        return new AsyncInvoker<DeletePipelineJobRequest, DeletePipelineJobResponse>(request,
            IoTAnalyticsMeta.deletePipelineJob, hcClient);
    }

    /**
     * 获取管道作业列表
     *
     * 获取用户下的所有管道作业，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelineJobsRequest 请求对象
     * @return CompletableFuture<ListPipelineJobsResponse>
     */
    public CompletableFuture<ListPipelineJobsResponse> listPipelineJobsAsync(ListPipelineJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.listPipelineJobs);
    }

    /**
     * 获取管道作业列表
     *
     * 获取用户下的所有管道作业，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelineJobsRequest 请求对象
     * @return AsyncInvoker<ListPipelineJobsRequest, ListPipelineJobsResponse>
     */
    public AsyncInvoker<ListPipelineJobsRequest, ListPipelineJobsResponse> listPipelineJobsAsyncInvoker(
        ListPipelineJobsRequest request) {
        return new AsyncInvoker<ListPipelineJobsRequest, ListPipelineJobsResponse>(request,
            IoTAnalyticsMeta.listPipelineJobs, hcClient);
    }

    /**
     * 获取管道作业详情
     *
     * 获取指定管道作业的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineJobRequest 请求对象
     * @return CompletableFuture<ShowPipelineJobResponse>
     */
    public CompletableFuture<ShowPipelineJobResponse> showPipelineJobAsync(ShowPipelineJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.showPipelineJob);
    }

    /**
     * 获取管道作业详情
     *
     * 获取指定管道作业的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineJobRequest 请求对象
     * @return AsyncInvoker<ShowPipelineJobRequest, ShowPipelineJobResponse>
     */
    public AsyncInvoker<ShowPipelineJobRequest, ShowPipelineJobResponse> showPipelineJobAsyncInvoker(
        ShowPipelineJobRequest request) {
        return new AsyncInvoker<ShowPipelineJobRequest, ShowPipelineJobResponse>(request,
            IoTAnalyticsMeta.showPipelineJob, hcClient);
    }

    /**
     * 启动管道作业
     *
     * 提交管道作业到运行环境，实时接收数据源的数据并按用户定义的数据清洗逻辑对数据进行处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartPipelineJobRequest 请求对象
     * @return CompletableFuture<StartPipelineJobResponse>
     */
    public CompletableFuture<StartPipelineJobResponse> startPipelineJobAsync(StartPipelineJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.startPipelineJob);
    }

    /**
     * 启动管道作业
     *
     * 提交管道作业到运行环境，实时接收数据源的数据并按用户定义的数据清洗逻辑对数据进行处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartPipelineJobRequest 请求对象
     * @return AsyncInvoker<StartPipelineJobRequest, StartPipelineJobResponse>
     */
    public AsyncInvoker<StartPipelineJobRequest, StartPipelineJobResponse> startPipelineJobAsyncInvoker(
        StartPipelineJobRequest request) {
        return new AsyncInvoker<StartPipelineJobRequest, StartPipelineJobResponse>(request,
            IoTAnalyticsMeta.startPipelineJob, hcClient);
    }

    /**
     * 停止管道作业
     *
     * 停止一个正在运行中的管道作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopPipelineJobRequest 请求对象
     * @return CompletableFuture<StopPipelineJobResponse>
     */
    public CompletableFuture<StopPipelineJobResponse> stopPipelineJobAsync(StopPipelineJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.stopPipelineJob);
    }

    /**
     * 停止管道作业
     *
     * 停止一个正在运行中的管道作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopPipelineJobRequest 请求对象
     * @return AsyncInvoker<StopPipelineJobRequest, StopPipelineJobResponse>
     */
    public AsyncInvoker<StopPipelineJobRequest, StopPipelineJobResponse> stopPipelineJobAsyncInvoker(
        StopPipelineJobRequest request) {
        return new AsyncInvoker<StopPipelineJobRequest, StopPipelineJobResponse>(request,
            IoTAnalyticsMeta.stopPipelineJob, hcClient);
    }

    /**
     * 更新管道作业
     *
     * 更新管道作业时，需要在URL中指定是更新哪一个作业，将在body中附带完整的作业信息。（管道作业详细配置，每个作业可选择不同的算子进行组合，各算子的使用方法详见：数据管道算子配置指南。） check参数表示是否需要对作业配置进行检查，若为false，则不检查，将作业保存为草稿；若为true，则对作业配置进行检查。当检查不通过时，将作业状态修改为草稿；检查通过时，将作业状态修改为就绪，并返回成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePipelineJobRequest 请求对象
     * @return CompletableFuture<UpdatePipelineJobResponse>
     */
    public CompletableFuture<UpdatePipelineJobResponse> updatePipelineJobAsync(UpdatePipelineJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.updatePipelineJob);
    }

    /**
     * 更新管道作业
     *
     * 更新管道作业时，需要在URL中指定是更新哪一个作业，将在body中附带完整的作业信息。（管道作业详细配置，每个作业可选择不同的算子进行组合，各算子的使用方法详见：数据管道算子配置指南。） check参数表示是否需要对作业配置进行检查，若为false，则不检查，将作业保存为草稿；若为true，则对作业配置进行检查。当检查不通过时，将作业状态修改为草稿；检查通过时，将作业状态修改为就绪，并返回成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePipelineJobRequest 请求对象
     * @return AsyncInvoker<UpdatePipelineJobRequest, UpdatePipelineJobResponse>
     */
    public AsyncInvoker<UpdatePipelineJobRequest, UpdatePipelineJobResponse> updatePipelineJobAsyncInvoker(
        UpdatePipelineJobRequest request) {
        return new AsyncInvoker<UpdatePipelineJobRequest, UpdatePipelineJobResponse>(request,
            IoTAnalyticsMeta.updatePipelineJob, hcClient);
    }

    /**
     * 新建实时作业
     *
     * 除名称和描述外，可先不提供作业的详细配置信息。 check参数表示是否需要对作业配置进行检查，若为false，则不检查，将作业保存为草稿；若为true，则对作业配置进行检查，无论检查是否通过，都将作业及配置信息保存为草稿，当检查不通过时，返回失败及错误信息，检查通过时，将作业状态修改为就绪，并返回成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStreamingJobRequest 请求对象
     * @return CompletableFuture<CreateStreamingJobResponse>
     */
    public CompletableFuture<CreateStreamingJobResponse> createStreamingJobAsync(CreateStreamingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.createStreamingJob);
    }

    /**
     * 新建实时作业
     *
     * 除名称和描述外，可先不提供作业的详细配置信息。 check参数表示是否需要对作业配置进行检查，若为false，则不检查，将作业保存为草稿；若为true，则对作业配置进行检查，无论检查是否通过，都将作业及配置信息保存为草稿，当检查不通过时，返回失败及错误信息，检查通过时，将作业状态修改为就绪，并返回成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStreamingJobRequest 请求对象
     * @return AsyncInvoker<CreateStreamingJobRequest, CreateStreamingJobResponse>
     */
    public AsyncInvoker<CreateStreamingJobRequest, CreateStreamingJobResponse> createStreamingJobAsyncInvoker(
        CreateStreamingJobRequest request) {
        return new AsyncInvoker<CreateStreamingJobRequest, CreateStreamingJobResponse>(request,
            IoTAnalyticsMeta.createStreamingJob, hcClient);
    }

    /**
     * 删除实时作业
     *
     * 删除用户指定的作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStreamingJobByIdRequest 请求对象
     * @return CompletableFuture<DeleteStreamingJobByIdResponse>
     */
    public CompletableFuture<DeleteStreamingJobByIdResponse> deleteStreamingJobByIdAsync(
        DeleteStreamingJobByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.deleteStreamingJobById);
    }

    /**
     * 删除实时作业
     *
     * 删除用户指定的作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStreamingJobByIdRequest 请求对象
     * @return AsyncInvoker<DeleteStreamingJobByIdRequest, DeleteStreamingJobByIdResponse>
     */
    public AsyncInvoker<DeleteStreamingJobByIdRequest, DeleteStreamingJobByIdResponse> deleteStreamingJobByIdAsyncInvoker(
        DeleteStreamingJobByIdRequest request) {
        return new AsyncInvoker<DeleteStreamingJobByIdRequest, DeleteStreamingJobByIdResponse>(request,
            IoTAnalyticsMeta.deleteStreamingJobById, hcClient);
    }

    /**
     * 获取实时作业详情
     *
     * 获取指定作业的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobByIdRequest 请求对象
     * @return CompletableFuture<ShowJobByIdResponse>
     */
    public CompletableFuture<ShowJobByIdResponse> showJobByIdAsync(ShowJobByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.showJobById);
    }

    /**
     * 获取实时作业详情
     *
     * 获取指定作业的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobByIdRequest 请求对象
     * @return AsyncInvoker<ShowJobByIdRequest, ShowJobByIdResponse>
     */
    public AsyncInvoker<ShowJobByIdRequest, ShowJobByIdResponse> showJobByIdAsyncInvoker(ShowJobByIdRequest request) {
        return new AsyncInvoker<ShowJobByIdRequest, ShowJobByIdResponse>(request, IoTAnalyticsMeta.showJobById,
            hcClient);
    }

    /**
     * 获取实时作业列表
     *
     * 获取用户下的所有实时分析作业，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobsRequest 请求对象
     * @return CompletableFuture<ShowJobsResponse>
     */
    public CompletableFuture<ShowJobsResponse> showJobsAsync(ShowJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.showJobs);
    }

    /**
     * 获取实时作业列表
     *
     * 获取用户下的所有实时分析作业，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobsRequest 请求对象
     * @return AsyncInvoker<ShowJobsRequest, ShowJobsResponse>
     */
    public AsyncInvoker<ShowJobsRequest, ShowJobsResponse> showJobsAsyncInvoker(ShowJobsRequest request) {
        return new AsyncInvoker<ShowJobsRequest, ShowJobsResponse>(request, IoTAnalyticsMeta.showJobs, hcClient);
    }

    /**
     * 更新实时作业
     *
     * 更新作业时，需要在URL中指定是更新哪一个作业，将在body中附带完整的作业信息。 check参数表示是否需要对作业配置进行检查，若为false，则不检查，将作业保存为草稿；若为true，则对作业配置进行检查，无论检查是否通过，都将作业及配置信息保存为草稿，当检查不通过时，返回失败及错误信息，检查通过时，将作业状态修改为就绪，并返回成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStreamingJobRequest 请求对象
     * @return CompletableFuture<UpdateStreamingJobResponse>
     */
    public CompletableFuture<UpdateStreamingJobResponse> updateStreamingJobAsync(UpdateStreamingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.updateStreamingJob);
    }

    /**
     * 更新实时作业
     *
     * 更新作业时，需要在URL中指定是更新哪一个作业，将在body中附带完整的作业信息。 check参数表示是否需要对作业配置进行检查，若为false，则不检查，将作业保存为草稿；若为true，则对作业配置进行检查，无论检查是否通过，都将作业及配置信息保存为草稿，当检查不通过时，返回失败及错误信息，检查通过时，将作业状态修改为就绪，并返回成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStreamingJobRequest 请求对象
     * @return AsyncInvoker<UpdateStreamingJobRequest, UpdateStreamingJobResponse>
     */
    public AsyncInvoker<UpdateStreamingJobRequest, UpdateStreamingJobResponse> updateStreamingJobAsyncInvoker(
        UpdateStreamingJobRequest request) {
        return new AsyncInvoker<UpdateStreamingJobRequest, UpdateStreamingJobResponse>(request,
            IoTAnalyticsMeta.updateStreamingJob, hcClient);
    }

    /**
     * 启动实时作业
     *
     * 提交作业到运行环境，实时接收数据并按用户定义的业务逻辑对数据进行处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartJobRequest 请求对象
     * @return CompletableFuture<StartJobResponse>
     */
    public CompletableFuture<StartJobResponse> startJobAsync(StartJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.startJob);
    }

    /**
     * 启动实时作业
     *
     * 提交作业到运行环境，实时接收数据并按用户定义的业务逻辑对数据进行处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartJobRequest 请求对象
     * @return AsyncInvoker<StartJobRequest, StartJobResponse>
     */
    public AsyncInvoker<StartJobRequest, StartJobResponse> startJobAsyncInvoker(StartJobRequest request) {
        return new AsyncInvoker<StartJobRequest, StartJobResponse>(request, IoTAnalyticsMeta.startJob, hcClient);
    }

    /**
     * 停止实时作业
     *
     * 停止一个正在运行中的作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobRequest 请求对象
     * @return CompletableFuture<StopJobResponse>
     */
    public CompletableFuture<StopJobResponse> stopJobAsync(StopJobRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.stopJob);
    }

    /**
     * 停止实时作业
     *
     * 停止一个正在运行中的作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobRequest 请求对象
     * @return AsyncInvoker<StopJobRequest, StopJobResponse>
     */
    public AsyncInvoker<StopJobRequest, StopJobResponse> stopJobAsyncInvoker(StopJobRequest request) {
        return new AsyncInvoker<StopJobRequest, StopJobResponse>(request, IoTAnalyticsMeta.stopJob, hcClient);
    }

    /**
     * 执行离线作业
     *
     * 执行离线作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRunRequest 请求对象
     * @return CompletableFuture<CreateRunResponse>
     */
    public CompletableFuture<CreateRunResponse> createRunAsync(CreateRunRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.createRun);
    }

    /**
     * 执行离线作业
     *
     * 执行离线作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRunRequest 请求对象
     * @return AsyncInvoker<CreateRunRequest, CreateRunResponse>
     */
    public AsyncInvoker<CreateRunRequest, CreateRunResponse> createRunAsyncInvoker(CreateRunRequest request) {
        return new AsyncInvoker<CreateRunRequest, CreateRunResponse>(request, IoTAnalyticsMeta.createRun, hcClient);
    }

    /**
     * 停止离线作业
     *
     * 停止提交中或运行中的离线作业，若作业已经执行结束或失败则无法停止。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRunRequest 请求对象
     * @return CompletableFuture<DeleteRunResponse>
     */
    public CompletableFuture<DeleteRunResponse> deleteRunAsync(DeleteRunRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.deleteRun);
    }

    /**
     * 停止离线作业
     *
     * 停止提交中或运行中的离线作业，若作业已经执行结束或失败则无法停止。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRunRequest 请求对象
     * @return AsyncInvoker<DeleteRunRequest, DeleteRunResponse>
     */
    public AsyncInvoker<DeleteRunRequest, DeleteRunResponse> deleteRunAsyncInvoker(DeleteRunRequest request) {
        return new AsyncInvoker<DeleteRunRequest, DeleteRunResponse>(request, IoTAnalyticsMeta.deleteRun, hcClient);
    }

    /**
     * 查询离线作业运行列表
     *
     * 查询离线作业运行列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRunsRequest 请求对象
     * @return CompletableFuture<ListRunsResponse>
     */
    public CompletableFuture<ListRunsResponse> listRunsAsync(ListRunsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.listRuns);
    }

    /**
     * 查询离线作业运行列表
     *
     * 查询离线作业运行列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRunsRequest 请求对象
     * @return AsyncInvoker<ListRunsRequest, ListRunsResponse>
     */
    public AsyncInvoker<ListRunsRequest, ListRunsResponse> listRunsAsyncInvoker(ListRunsRequest request) {
        return new AsyncInvoker<ListRunsRequest, ListRunsResponse>(request, IoTAnalyticsMeta.listRuns, hcClient);
    }

    /**
     * 查询离线作业运行详情
     *
     * 查询离线作业运行详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRunRequest 请求对象
     * @return CompletableFuture<ShowRunResponse>
     */
    public CompletableFuture<ShowRunResponse> showRunAsync(ShowRunRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.showRun);
    }

    /**
     * 查询离线作业运行详情
     *
     * 查询离线作业运行详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRunRequest 请求对象
     * @return AsyncInvoker<ShowRunRequest, ShowRunResponse>
     */
    public AsyncInvoker<ShowRunRequest, ShowRunResponse> showRunAsyncInvoker(ShowRunRequest request) {
        return new AsyncInvoker<ShowRunRequest, ShowRunResponse>(request, IoTAnalyticsMeta.showRun, hcClient);
    }

    /**
     * 创建离线数据表
     *
     * 创建离线数据表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return CompletableFuture<CreateTableResponse>
     */
    public CompletableFuture<CreateTableResponse> createTableAsync(CreateTableRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.createTable);
    }

    /**
     * 创建离线数据表
     *
     * 创建离线数据表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return AsyncInvoker<CreateTableRequest, CreateTableResponse>
     */
    public AsyncInvoker<CreateTableRequest, CreateTableResponse> createTableAsyncInvoker(CreateTableRequest request) {
        return new AsyncInvoker<CreateTableRequest, CreateTableResponse>(request, IoTAnalyticsMeta.createTable,
            hcClient);
    }

    /**
     * 删除离线数据表
     *
     * 删除离线数据表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableRequest 请求对象
     * @return CompletableFuture<DeleteTableResponse>
     */
    public CompletableFuture<DeleteTableResponse> deleteTableAsync(DeleteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.deleteTable);
    }

    /**
     * 删除离线数据表
     *
     * 删除离线数据表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableRequest 请求对象
     * @return AsyncInvoker<DeleteTableRequest, DeleteTableResponse>
     */
    public AsyncInvoker<DeleteTableRequest, DeleteTableResponse> deleteTableAsyncInvoker(DeleteTableRequest request) {
        return new AsyncInvoker<DeleteTableRequest, DeleteTableResponse>(request, IoTAnalyticsMeta.deleteTable,
            hcClient);
    }

    /**
     * 查询离线数据表列表
     *
     * 查询离线数据表列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesRequest 请求对象
     * @return CompletableFuture<ListTablesResponse>
     */
    public CompletableFuture<ListTablesResponse> listTablesAsync(ListTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.listTables);
    }

    /**
     * 查询离线数据表列表
     *
     * 查询离线数据表列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesRequest 请求对象
     * @return AsyncInvoker<ListTablesRequest, ListTablesResponse>
     */
    public AsyncInvoker<ListTablesRequest, ListTablesResponse> listTablesAsyncInvoker(ListTablesRequest request) {
        return new AsyncInvoker<ListTablesRequest, ListTablesResponse>(request, IoTAnalyticsMeta.listTables, hcClient);
    }

    /**
     * 预览离线数据表内容
     *
     * 预览离线数据表内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTablePreviewRequest 请求对象
     * @return CompletableFuture<ShowTablePreviewResponse>
     */
    public CompletableFuture<ShowTablePreviewResponse> showTablePreviewAsync(ShowTablePreviewRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.showTablePreview);
    }

    /**
     * 预览离线数据表内容
     *
     * 预览离线数据表内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTablePreviewRequest 请求对象
     * @return AsyncInvoker<ShowTablePreviewRequest, ShowTablePreviewResponse>
     */
    public AsyncInvoker<ShowTablePreviewRequest, ShowTablePreviewResponse> showTablePreviewAsyncInvoker(
        ShowTablePreviewRequest request) {
        return new AsyncInvoker<ShowTablePreviewRequest, ShowTablePreviewResponse>(request,
            IoTAnalyticsMeta.showTablePreview, hcClient);
    }

    /**
     * 查询离线数据表结构
     *
     * 查询离线数据表结构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTableSchemaRequest 请求对象
     * @return CompletableFuture<ShowTableSchemaResponse>
     */
    public CompletableFuture<ShowTableSchemaResponse> showTableSchemaAsync(ShowTableSchemaRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTAnalyticsMeta.showTableSchema);
    }

    /**
     * 查询离线数据表结构
     *
     * 查询离线数据表结构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTableSchemaRequest 请求对象
     * @return AsyncInvoker<ShowTableSchemaRequest, ShowTableSchemaResponse>
     */
    public AsyncInvoker<ShowTableSchemaRequest, ShowTableSchemaResponse> showTableSchemaAsyncInvoker(
        ShowTableSchemaRequest request) {
        return new AsyncInvoker<ShowTableSchemaRequest, ShowTableSchemaResponse>(request,
            IoTAnalyticsMeta.showTableSchema, hcClient);
    }

}
