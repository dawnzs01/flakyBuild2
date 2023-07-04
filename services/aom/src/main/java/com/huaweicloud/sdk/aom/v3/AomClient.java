package com.huaweicloud.sdk.aom.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.aom.v3.model.*;

public class AomClient {
    protected HcClient hcClient;

    public AomClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AomClient> newBuilder() {
        return new ClientBuilder<>(AomClient::new);
    }


    /**
     * 新增应用
     *
     * 新增应用。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.createApp);
    }

    /**
     * 新增应用
     *
     * 新增应用。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return SyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public SyncInvoker<CreateAppRequest, CreateAppResponse> createAppInvoker(CreateAppRequest request) {
        return new SyncInvoker<CreateAppRequest, CreateAppResponse>(request, AomMeta.createApp, hcClient);
    }

    /**
     * 新增组件
     *
     * 新增组件。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComponentRequest 请求对象
     * @return CreateComponentResponse
     */
    public CreateComponentResponse createComponent(CreateComponentRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.createComponent);
    }

    /**
     * 新增组件
     *
     * 新增组件。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComponentRequest 请求对象
     * @return SyncInvoker<CreateComponentRequest, CreateComponentResponse>
     */
    public SyncInvoker<CreateComponentRequest, CreateComponentResponse> createComponentInvoker(CreateComponentRequest request) {
        return new SyncInvoker<CreateComponentRequest, CreateComponentResponse>(request, AomMeta.createComponent, hcClient);
    }

    /**
     * 创建环境
     *
     * 创建环境。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnvRequest 请求对象
     * @return CreateEnvResponse
     */
    public CreateEnvResponse createEnv(CreateEnvRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.createEnv);
    }

    /**
     * 创建环境
     *
     * 创建环境。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnvRequest 请求对象
     * @return SyncInvoker<CreateEnvRequest, CreateEnvResponse>
     */
    public SyncInvoker<CreateEnvRequest, CreateEnvResponse> createEnvInvoker(CreateEnvRequest request) {
        return new SyncInvoker<CreateEnvRequest, CreateEnvResponse>(request, AomMeta.createEnv, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deleteApp);
    }

    /**
     * 删除应用
     *
     * 删除应用。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return SyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public SyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppInvoker(DeleteAppRequest request) {
        return new SyncInvoker<DeleteAppRequest, DeleteAppResponse>(request, AomMeta.deleteApp, hcClient);
    }

    /**
     * 删除组件
     *
     * 删除组件。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComponentRequest 请求对象
     * @return DeleteComponentResponse
     */
    public DeleteComponentResponse deleteComponent(DeleteComponentRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deleteComponent);
    }

    /**
     * 删除组件
     *
     * 删除组件。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComponentRequest 请求对象
     * @return SyncInvoker<DeleteComponentRequest, DeleteComponentResponse>
     */
    public SyncInvoker<DeleteComponentRequest, DeleteComponentResponse> deleteComponentInvoker(DeleteComponentRequest request) {
        return new SyncInvoker<DeleteComponentRequest, DeleteComponentResponse>(request, AomMeta.deleteComponent, hcClient);
    }

    /**
     * 删除环境
     *
     * 删除环境。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnvRequest 请求对象
     * @return DeleteEnvResponse
     */
    public DeleteEnvResponse deleteEnv(DeleteEnvRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deleteEnv);
    }

    /**
     * 删除环境
     *
     * 删除环境。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnvRequest 请求对象
     * @return SyncInvoker<DeleteEnvRequest, DeleteEnvResponse>
     */
    public SyncInvoker<DeleteEnvRequest, DeleteEnvResponse> deleteEnvInvoker(DeleteEnvRequest request) {
        return new SyncInvoker<DeleteEnvRequest, DeleteEnvResponse>(request, AomMeta.deleteEnv, hcClient);
    }

    /**
     * 查询绑定在节点上的资源列表
     *
     * 查询绑定在节点上的资源列表。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceUnderNodeRequest 请求对象
     * @return ListResourceUnderNodeResponse
     */
    public ListResourceUnderNodeResponse listResourceUnderNode(ListResourceUnderNodeRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listResourceUnderNode);
    }

    /**
     * 查询绑定在节点上的资源列表
     *
     * 查询绑定在节点上的资源列表。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceUnderNodeRequest 请求对象
     * @return SyncInvoker<ListResourceUnderNodeRequest, ListResourceUnderNodeResponse>
     */
    public SyncInvoker<ListResourceUnderNodeRequest, ListResourceUnderNodeResponse> listResourceUnderNodeInvoker(ListResourceUnderNodeRequest request) {
        return new SyncInvoker<ListResourceUnderNodeRequest, ListResourceUnderNodeResponse>(request, AomMeta.listResourceUnderNode, hcClient);
    }

    /**
     * 查询应用详情
     *
     * 获取应用详情。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return ShowAppResponse
     */
    public ShowAppResponse showApp(ShowAppRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showApp);
    }

    /**
     * 查询应用详情
     *
     * 获取应用详情。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return SyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public SyncInvoker<ShowAppRequest, ShowAppResponse> showAppInvoker(ShowAppRequest request) {
        return new SyncInvoker<ShowAppRequest, ShowAppResponse>(request, AomMeta.showApp, hcClient);
    }

    /**
     * 根据应用名称查询应用详情
     *
     * 获取应用详情。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppByNameRequest 请求对象
     * @return ShowAppByNameResponse
     */
    public ShowAppByNameResponse showAppByName(ShowAppByNameRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showAppByName);
    }

    /**
     * 根据应用名称查询应用详情
     *
     * 获取应用详情。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppByNameRequest 请求对象
     * @return SyncInvoker<ShowAppByNameRequest, ShowAppByNameResponse>
     */
    public SyncInvoker<ShowAppByNameRequest, ShowAppByNameResponse> showAppByNameInvoker(ShowAppByNameRequest request) {
        return new SyncInvoker<ShowAppByNameRequest, ShowAppByNameResponse>(request, AomMeta.showAppByName, hcClient);
    }

    /**
     * 查询组件详情
     *
     * 查询组件详情。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentRequest 请求对象
     * @return ShowComponentResponse
     */
    public ShowComponentResponse showComponent(ShowComponentRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showComponent);
    }

    /**
     * 查询组件详情
     *
     * 查询组件详情。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentRequest 请求对象
     * @return SyncInvoker<ShowComponentRequest, ShowComponentResponse>
     */
    public SyncInvoker<ShowComponentRequest, ShowComponentResponse> showComponentInvoker(ShowComponentRequest request) {
        return new SyncInvoker<ShowComponentRequest, ShowComponentResponse>(request, AomMeta.showComponent, hcClient);
    }

    /**
     * 根据组件名称查询组件详情
     *
     * 查询组件详情。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentByNameRequest 请求对象
     * @return ShowComponentByNameResponse
     */
    public ShowComponentByNameResponse showComponentByName(ShowComponentByNameRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showComponentByName);
    }

    /**
     * 根据组件名称查询组件详情
     *
     * 查询组件详情。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentByNameRequest 请求对象
     * @return SyncInvoker<ShowComponentByNameRequest, ShowComponentByNameResponse>
     */
    public SyncInvoker<ShowComponentByNameRequest, ShowComponentByNameResponse> showComponentByNameInvoker(ShowComponentByNameRequest request) {
        return new SyncInvoker<ShowComponentByNameRequest, ShowComponentByNameResponse>(request, AomMeta.showComponentByName, hcClient);
    }

    /**
     * 查询环境详情
     *
     * 查询环境详情。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvRequest 请求对象
     * @return ShowEnvResponse
     */
    public ShowEnvResponse showEnv(ShowEnvRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showEnv);
    }

    /**
     * 查询环境详情
     *
     * 查询环境详情。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvRequest 请求对象
     * @return SyncInvoker<ShowEnvRequest, ShowEnvResponse>
     */
    public SyncInvoker<ShowEnvRequest, ShowEnvResponse> showEnvInvoker(ShowEnvRequest request) {
        return new SyncInvoker<ShowEnvRequest, ShowEnvResponse>(request, AomMeta.showEnv, hcClient);
    }

    /**
     * 根据环境名称查询环境详情
     *
     * 查询环境详情。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvByNameRequest 请求对象
     * @return ShowEnvByNameResponse
     */
    public ShowEnvByNameResponse showEnvByName(ShowEnvByNameRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showEnvByName);
    }

    /**
     * 根据环境名称查询环境详情
     *
     * 查询环境详情。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvByNameRequest 请求对象
     * @return SyncInvoker<ShowEnvByNameRequest, ShowEnvByNameResponse>
     */
    public SyncInvoker<ShowEnvByNameRequest, ShowEnvByNameResponse> showEnvByNameInvoker(ShowEnvByNameRequest request) {
        return new SyncInvoker<ShowEnvByNameRequest, ShowEnvByNameResponse>(request, AomMeta.showEnvByName, hcClient);
    }

    /**
     * 修改应用
     *
     * 修改应用。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return UpdateAppResponse
     */
    public UpdateAppResponse updateApp(UpdateAppRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.updateApp);
    }

    /**
     * 修改应用
     *
     * 修改应用。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return SyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public SyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppInvoker(UpdateAppRequest request) {
        return new SyncInvoker<UpdateAppRequest, UpdateAppResponse>(request, AomMeta.updateApp, hcClient);
    }

    /**
     * 修改组件
     *
     * 修改组件。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateComponentRequest 请求对象
     * @return UpdateComponentResponse
     */
    public UpdateComponentResponse updateComponent(UpdateComponentRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.updateComponent);
    }

    /**
     * 修改组件
     *
     * 修改组件。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateComponentRequest 请求对象
     * @return SyncInvoker<UpdateComponentRequest, UpdateComponentResponse>
     */
    public SyncInvoker<UpdateComponentRequest, UpdateComponentResponse> updateComponentInvoker(UpdateComponentRequest request) {
        return new SyncInvoker<UpdateComponentRequest, UpdateComponentResponse>(request, AomMeta.updateComponent, hcClient);
    }

    /**
     * 修改环境
     *
     * 修改环境。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEnvRequest 请求对象
     * @return UpdateEnvResponse
     */
    public UpdateEnvResponse updateEnv(UpdateEnvRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.updateEnv);
    }

    /**
     * 修改环境
     *
     * 修改环境。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEnvRequest 请求对象
     * @return SyncInvoker<UpdateEnvRequest, UpdateEnvResponse>
     */
    public SyncInvoker<UpdateEnvRequest, UpdateEnvResponse> updateEnvInvoker(UpdateEnvRequest request) {
        return new SyncInvoker<UpdateEnvRequest, UpdateEnvResponse>(request, AomMeta.updateEnv, hcClient);
    }

}