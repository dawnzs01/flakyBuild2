package com.huaweicloud.sdk.idme.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.idme.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class IdmeAsyncClient {

    protected HcClient hcClient;

    public IdmeAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdmeAsyncClient> newBuilder() {
        return new ClientBuilder<>(IdmeAsyncClient::new);
    }

    /**
     * 创建应用
     *
     * 本接口用于创建工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateXdmApplicationRequest 请求对象
     * @return CompletableFuture<CreateXdmApplicationResponse>
     */
    public CompletableFuture<CreateXdmApplicationResponse> createXdmApplicationAsync(
        CreateXdmApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdmeMeta.createXdmApplication);
    }

    /**
     * 创建应用
     *
     * 本接口用于创建工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateXdmApplicationRequest 请求对象
     * @return AsyncInvoker<CreateXdmApplicationRequest, CreateXdmApplicationResponse>
     */
    public AsyncInvoker<CreateXdmApplicationRequest, CreateXdmApplicationResponse> createXdmApplicationAsyncInvoker(
        CreateXdmApplicationRequest request) {
        return new AsyncInvoker<CreateXdmApplicationRequest, CreateXdmApplicationResponse>(request,
            IdmeMeta.createXdmApplication, hcClient);
    }

    /**
     * 删除应用
     *
     * 本接口用于删除工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteXdmApplicationRequest 请求对象
     * @return CompletableFuture<DeleteXdmApplicationResponse>
     */
    public CompletableFuture<DeleteXdmApplicationResponse> deleteXdmApplicationAsync(
        DeleteXdmApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdmeMeta.deleteXdmApplication);
    }

    /**
     * 删除应用
     *
     * 本接口用于删除工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteXdmApplicationRequest 请求对象
     * @return AsyncInvoker<DeleteXdmApplicationRequest, DeleteXdmApplicationResponse>
     */
    public AsyncInvoker<DeleteXdmApplicationRequest, DeleteXdmApplicationResponse> deleteXdmApplicationAsyncInvoker(
        DeleteXdmApplicationRequest request) {
        return new AsyncInvoker<DeleteXdmApplicationRequest, DeleteXdmApplicationResponse>(request,
            IdmeMeta.deleteXdmApplication, hcClient);
    }

    /**
     * 部署应用
     *
     * 本接口用于部署工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeployApplicationRequest 请求对象
     * @return CompletableFuture<DeployApplicationResponse>
     */
    public CompletableFuture<DeployApplicationResponse> deployApplicationAsync(DeployApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdmeMeta.deployApplication);
    }

    /**
     * 部署应用
     *
     * 本接口用于部署工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeployApplicationRequest 请求对象
     * @return AsyncInvoker<DeployApplicationRequest, DeployApplicationResponse>
     */
    public AsyncInvoker<DeployApplicationRequest, DeployApplicationResponse> deployApplicationAsyncInvoker(
        DeployApplicationRequest request) {
        return new AsyncInvoker<DeployApplicationRequest, DeployApplicationResponse>(request,
            IdmeMeta.deployApplication, hcClient);
    }

    /**
     * 获取租户下的应用清单
     *
     * 本接口用于获取租户在工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用清单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsRequest 请求对象
     * @return CompletableFuture<ListAppsResponse>
     */
    public CompletableFuture<ListAppsResponse> listAppsAsync(ListAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdmeMeta.listApps);
    }

    /**
     * 获取租户下的应用清单
     *
     * 本接口用于获取租户在工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用清单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsRequest 请求对象
     * @return AsyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public AsyncInvoker<ListAppsRequest, ListAppsResponse> listAppsAsyncInvoker(ListAppsRequest request) {
        return new AsyncInvoker<ListAppsRequest, ListAppsResponse>(request, IdmeMeta.listApps, hcClient);
    }

    /**
     * 获取运行服务清单
     *
     * 本接口用于获取租户在工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的运行服务清单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvsRequest 请求对象
     * @return CompletableFuture<ListEnvsResponse>
     */
    public CompletableFuture<ListEnvsResponse> listEnvsAsync(ListEnvsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdmeMeta.listEnvs);
    }

    /**
     * 获取运行服务清单
     *
     * 本接口用于获取租户在工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的运行服务清单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvsRequest 请求对象
     * @return AsyncInvoker<ListEnvsRequest, ListEnvsResponse>
     */
    public AsyncInvoker<ListEnvsRequest, ListEnvsResponse> listEnvsAsyncInvoker(ListEnvsRequest request) {
        return new AsyncInvoker<ListEnvsRequest, ListEnvsResponse>(request, IdmeMeta.listEnvs, hcClient);
    }

    /**
     * 编辑应用
     *
     * 本接口用于修改工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyApplicationRequest 请求对象
     * @return CompletableFuture<ModifyApplicationResponse>
     */
    public CompletableFuture<ModifyApplicationResponse> modifyApplicationAsync(ModifyApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdmeMeta.modifyApplication);
    }

    /**
     * 编辑应用
     *
     * 本接口用于修改工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyApplicationRequest 请求对象
     * @return AsyncInvoker<ModifyApplicationRequest, ModifyApplicationResponse>
     */
    public AsyncInvoker<ModifyApplicationRequest, ModifyApplicationResponse> modifyApplicationAsyncInvoker(
        ModifyApplicationRequest request) {
        return new AsyncInvoker<ModifyApplicationRequest, ModifyApplicationResponse>(request,
            IdmeMeta.modifyApplication, hcClient);
    }

    /**
     * 卸载应用
     *
     * 本接口用于卸载指定运行服务下的工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UninstallRequest 请求对象
     * @return CompletableFuture<UninstallResponse>
     */
    public CompletableFuture<UninstallResponse> uninstallAsync(UninstallRequest request) {
        return hcClient.asyncInvokeHttp(request, IdmeMeta.uninstall);
    }

    /**
     * 卸载应用
     *
     * 本接口用于卸载指定运行服务下的工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UninstallRequest 请求对象
     * @return AsyncInvoker<UninstallRequest, UninstallResponse>
     */
    public AsyncInvoker<UninstallRequest, UninstallResponse> uninstallAsyncInvoker(UninstallRequest request) {
        return new AsyncInvoker<UninstallRequest, UninstallResponse>(request, IdmeMeta.uninstall, hcClient);
    }

}
