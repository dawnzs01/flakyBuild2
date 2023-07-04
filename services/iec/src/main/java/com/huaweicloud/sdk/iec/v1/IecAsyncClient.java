package com.huaweicloud.sdk.iec.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.iec.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class IecAsyncClient {

    protected HcClient hcClient;

    public IecAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IecAsyncClient> newBuilder() {
        return new ClientBuilder<>(IecAsyncClient::new, "GlobalCredentials");
    }

    /**
     * 添加网卡
     *
     * 添加网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddNicsRequest 请求对象
     * @return CompletableFuture<AddNicsResponse>
     */
    public CompletableFuture<AddNicsResponse> addNicsAsync(AddNicsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.addNics);
    }

    /**
     * 添加网卡
     *
     * 添加网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddNicsRequest 请求对象
     * @return AsyncInvoker<AddNicsRequest, AddNicsResponse>
     */
    public AsyncInvoker<AddNicsRequest, AddNicsResponse> addNicsAsyncInvoker(AddNicsRequest request) {
        return new AsyncInvoker<AddNicsRequest, AddNicsResponse>(request, IecMeta.addNics, hcClient);
    }

    /**
     * 路由表关联子网
     *
     * 路由表关联子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateSubnetRequest 请求对象
     * @return CompletableFuture<AssociateSubnetResponse>
     */
    public CompletableFuture<AssociateSubnetResponse> associateSubnetAsync(AssociateSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.associateSubnet);
    }

    /**
     * 路由表关联子网
     *
     * 路由表关联子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateSubnetRequest 请求对象
     * @return AsyncInvoker<AssociateSubnetRequest, AssociateSubnetResponse>
     */
    public AsyncInvoker<AssociateSubnetRequest, AssociateSubnetResponse> associateSubnetAsyncInvoker(
        AssociateSubnetRequest request) {
        return new AsyncInvoker<AssociateSubnetRequest, AssociateSubnetResponse>(request, IecMeta.associateSubnet,
            hcClient);
    }

    /**
     * 批量重启边缘实例
     *
     * 批量重启边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRebootInstanceRequest 请求对象
     * @return CompletableFuture<BatchRebootInstanceResponse>
     */
    public CompletableFuture<BatchRebootInstanceResponse> batchRebootInstanceAsync(BatchRebootInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.batchRebootInstance);
    }

    /**
     * 批量重启边缘实例
     *
     * 批量重启边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRebootInstanceRequest 请求对象
     * @return AsyncInvoker<BatchRebootInstanceRequest, BatchRebootInstanceResponse>
     */
    public AsyncInvoker<BatchRebootInstanceRequest, BatchRebootInstanceResponse> batchRebootInstanceAsyncInvoker(
        BatchRebootInstanceRequest request) {
        return new AsyncInvoker<BatchRebootInstanceRequest, BatchRebootInstanceResponse>(request,
            IecMeta.batchRebootInstance, hcClient);
    }

    /**
     * 批量启动边缘实例
     *
     * 批量操作启动边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStartInstanceRequest 请求对象
     * @return CompletableFuture<BatchStartInstanceResponse>
     */
    public CompletableFuture<BatchStartInstanceResponse> batchStartInstanceAsync(BatchStartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.batchStartInstance);
    }

    /**
     * 批量启动边缘实例
     *
     * 批量操作启动边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStartInstanceRequest 请求对象
     * @return AsyncInvoker<BatchStartInstanceRequest, BatchStartInstanceResponse>
     */
    public AsyncInvoker<BatchStartInstanceRequest, BatchStartInstanceResponse> batchStartInstanceAsyncInvoker(
        BatchStartInstanceRequest request) {
        return new AsyncInvoker<BatchStartInstanceRequest, BatchStartInstanceResponse>(request,
            IecMeta.batchStartInstance, hcClient);
    }

    /**
     * 批量关机边缘实例
     *
     * 批量关闭边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStopInstanceRequest 请求对象
     * @return CompletableFuture<BatchStopInstanceResponse>
     */
    public CompletableFuture<BatchStopInstanceResponse> batchStopInstanceAsync(BatchStopInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.batchStopInstance);
    }

    /**
     * 批量关机边缘实例
     *
     * 批量关闭边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStopInstanceRequest 请求对象
     * @return AsyncInvoker<BatchStopInstanceRequest, BatchStopInstanceResponse>
     */
    public AsyncInvoker<BatchStopInstanceRequest, BatchStopInstanceResponse> batchStopInstanceAsyncInvoker(
        BatchStopInstanceRequest request) {
        return new AsyncInvoker<BatchStopInstanceRequest, BatchStopInstanceResponse>(request, IecMeta.batchStopInstance,
            hcClient);
    }

    /**
     * 切换操作系统
     *
     * 切换边缘实例操作系统，支持边缘实例创建成功后，保持ip、数据盘不变的情况下重装操作系统。
     * 
     * 调用该接口后，系统将卸载系统盘，然后使用新镜像重新创建系统盘，并挂载至实例，实现切换操作系统功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeOsRequest 请求对象
     * @return CompletableFuture<ChangeOsResponse>
     */
    public CompletableFuture<ChangeOsResponse> changeOsAsync(ChangeOsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.changeOs);
    }

    /**
     * 切换操作系统
     *
     * 切换边缘实例操作系统，支持边缘实例创建成功后，保持ip、数据盘不变的情况下重装操作系统。
     * 
     * 调用该接口后，系统将卸载系统盘，然后使用新镜像重新创建系统盘，并挂载至实例，实现切换操作系统功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeOsRequest 请求对象
     * @return AsyncInvoker<ChangeOsRequest, ChangeOsResponse>
     */
    public AsyncInvoker<ChangeOsRequest, ChangeOsResponse> changeOsAsyncInvoker(ChangeOsRequest request) {
        return new AsyncInvoker<ChangeOsRequest, ChangeOsResponse>(request, IecMeta.changeOs, hcClient);
    }

    /**
     * 创建部署计划
     *
     * 为方便您的统一管理，以及跨边缘站点管理资源，IEC基于业务场景角度，定义了边缘业务。
     * 边缘业务即为逻辑层面的一套资源管理集合。这里的资源主要是指计算实例，包含实例规格、镜像、硬盘、网络等方面。通过指定计算实例的数量、调度策略以及区域分布等形成一套管理集合。[了解更多](https://support.huaweicloud.com/usermanual-iec/iec_02_0301.html)
     * 
     * 创建一个部署计划并执行，即可创建一个边缘业务。
     * 
     * - 边缘业务下实例分布取决于部署计划的实例分布与调度策略。
     * - 边缘业务下实例名称、规格、镜像等参数取决于部署计划配置计算实例字段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentRequest 请求对象
     * @return CompletableFuture<CreateDeploymentResponse>
     */
    public CompletableFuture<CreateDeploymentResponse> createDeploymentAsync(CreateDeploymentRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createDeployment);
    }

    /**
     * 创建部署计划
     *
     * 为方便您的统一管理，以及跨边缘站点管理资源，IEC基于业务场景角度，定义了边缘业务。
     * 边缘业务即为逻辑层面的一套资源管理集合。这里的资源主要是指计算实例，包含实例规格、镜像、硬盘、网络等方面。通过指定计算实例的数量、调度策略以及区域分布等形成一套管理集合。[了解更多](https://support.huaweicloud.com/usermanual-iec/iec_02_0301.html)
     * 
     * 创建一个部署计划并执行，即可创建一个边缘业务。
     * 
     * - 边缘业务下实例分布取决于部署计划的实例分布与调度策略。
     * - 边缘业务下实例名称、规格、镜像等参数取决于部署计划配置计算实例字段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentRequest 请求对象
     * @return AsyncInvoker<CreateDeploymentRequest, CreateDeploymentResponse>
     */
    public AsyncInvoker<CreateDeploymentRequest, CreateDeploymentResponse> createDeploymentAsyncInvoker(
        CreateDeploymentRequest request) {
        return new AsyncInvoker<CreateDeploymentRequest, CreateDeploymentResponse>(request, IecMeta.createDeployment,
            hcClient);
    }

    /**
     * 从边缘实例创建边缘私有镜像
     *
     * 使用指定边缘实例的系统盘创建边缘私有镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageRequest 请求对象
     * @return CompletableFuture<CreateImageResponse>
     */
    public CompletableFuture<CreateImageResponse> createImageAsync(CreateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createImage);
    }

    /**
     * 从边缘实例创建边缘私有镜像
     *
     * 使用指定边缘实例的系统盘创建边缘私有镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageRequest 请求对象
     * @return AsyncInvoker<CreateImageRequest, CreateImageResponse>
     */
    public AsyncInvoker<CreateImageRequest, CreateImageResponse> createImageAsyncInvoker(CreateImageRequest request) {
        return new AsyncInvoker<CreateImageRequest, CreateImageResponse>(request, IecMeta.createImage, hcClient);
    }

    /**
     * 创建和导入密钥
     *
     * 创建SSH密钥，或把公钥导入系统，生成密钥对。
     * 
     * 创建SSH密钥成功后，请把响应数据中的私钥内容保存到本地文件，用户使用该私钥登录边缘实例。为保证边缘实例安全，私钥数据只能读取一次，请妥善保管。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateKeypairRequest 请求对象
     * @return CompletableFuture<CreateKeypairResponse>
     */
    public CompletableFuture<CreateKeypairResponse> createKeypairAsync(CreateKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createKeypair);
    }

    /**
     * 创建和导入密钥
     *
     * 创建SSH密钥，或把公钥导入系统，生成密钥对。
     * 
     * 创建SSH密钥成功后，请把响应数据中的私钥内容保存到本地文件，用户使用该私钥登录边缘实例。为保证边缘实例安全，私钥数据只能读取一次，请妥善保管。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateKeypairRequest 请求对象
     * @return AsyncInvoker<CreateKeypairRequest, CreateKeypairResponse>
     */
    public AsyncInvoker<CreateKeypairRequest, CreateKeypairResponse> createKeypairAsyncInvoker(
        CreateKeypairRequest request) {
        return new AsyncInvoker<CreateKeypairRequest, CreateKeypairResponse>(request, IecMeta.createKeypair, hcClient);
    }

    /**
     * 创建端口
     *
     * 创建端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePortRequest 请求对象
     * @return CompletableFuture<CreatePortResponse>
     */
    public CompletableFuture<CreatePortResponse> createPortAsync(CreatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createPort);
    }

    /**
     * 创建端口
     *
     * 创建端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePortRequest 请求对象
     * @return AsyncInvoker<CreatePortRequest, CreatePortResponse>
     */
    public AsyncInvoker<CreatePortRequest, CreatePortResponse> createPortAsyncInvoker(CreatePortRequest request) {
        return new AsyncInvoker<CreatePortRequest, CreatePortResponse>(request, IecMeta.createPort, hcClient);
    }

    /**
     * 创建路由
     *
     * 创建路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoutesRequest 请求对象
     * @return CompletableFuture<CreateRoutesResponse>
     */
    public CompletableFuture<CreateRoutesResponse> createRoutesAsync(CreateRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createRoutes);
    }

    /**
     * 创建路由
     *
     * 创建路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoutesRequest 请求对象
     * @return AsyncInvoker<CreateRoutesRequest, CreateRoutesResponse>
     */
    public AsyncInvoker<CreateRoutesRequest, CreateRoutesResponse> createRoutesAsyncInvoker(
        CreateRoutesRequest request) {
        return new AsyncInvoker<CreateRoutesRequest, CreateRoutesResponse>(request, IecMeta.createRoutes, hcClient);
    }

    /**
     * 创建路由表
     *
     * 创建路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoutetableRequest 请求对象
     * @return CompletableFuture<CreateRoutetableResponse>
     */
    public CompletableFuture<CreateRoutetableResponse> createRoutetableAsync(CreateRoutetableRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createRoutetable);
    }

    /**
     * 创建路由表
     *
     * 创建路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoutetableRequest 请求对象
     * @return AsyncInvoker<CreateRoutetableRequest, CreateRoutetableResponse>
     */
    public AsyncInvoker<CreateRoutetableRequest, CreateRoutetableResponse> createRoutetableAsyncInvoker(
        CreateRoutetableRequest request) {
        return new AsyncInvoker<CreateRoutetableRequest, CreateRoutetableResponse>(request, IecMeta.createRoutetable,
            hcClient);
    }

    /**
     * 创建边缘安全组
     *
     * 根据用户的请求内容，创建对应的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return CompletableFuture<CreateSecurityGroupResponse>
     */
    public CompletableFuture<CreateSecurityGroupResponse> createSecurityGroupAsync(CreateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createSecurityGroup);
    }

    /**
     * 创建边缘安全组
     *
     * 根据用户的请求内容，创建对应的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>
     */
    public AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroupAsyncInvoker(
        CreateSecurityGroupRequest request) {
        return new AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>(request,
            IecMeta.createSecurityGroup, hcClient);
    }

    /**
     * 创建安全组规则
     *
     * 根据用户的请求内容，创建安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<CreateSecurityGroupRuleResponse>
     */
    public CompletableFuture<CreateSecurityGroupRuleResponse> createSecurityGroupRuleAsync(
        CreateSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createSecurityGroupRule);
    }

    /**
     * 创建安全组规则
     *
     * 根据用户的请求内容，创建安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>
     */
    public AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRuleAsyncInvoker(
        CreateSecurityGroupRuleRequest request) {
        return new AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>(request,
            IecMeta.createSecurityGroupRule, hcClient);
    }

    /**
     * 创建虚拟私有云
     *
     * 根据用户的请求内容，创建虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcRequest 请求对象
     * @return CompletableFuture<CreateVpcResponse>
     */
    public CompletableFuture<CreateVpcResponse> createVpcAsync(CreateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createVpc);
    }

    /**
     * 创建虚拟私有云
     *
     * 根据用户的请求内容，创建虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcRequest 请求对象
     * @return AsyncInvoker<CreateVpcRequest, CreateVpcResponse>
     */
    public AsyncInvoker<CreateVpcRequest, CreateVpcResponse> createVpcAsyncInvoker(CreateVpcRequest request) {
        return new AsyncInvoker<CreateVpcRequest, CreateVpcResponse>(request, IecMeta.createVpc, hcClient);
    }

    /**
     * 删除带宽
     *
     * 删除带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBandwidthRequest 请求对象
     * @return CompletableFuture<DeleteBandwidthResponse>
     */
    public CompletableFuture<DeleteBandwidthResponse> deleteBandwidthAsync(DeleteBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteBandwidth);
    }

    /**
     * 删除带宽
     *
     * 删除带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBandwidthRequest 请求对象
     * @return AsyncInvoker<DeleteBandwidthRequest, DeleteBandwidthResponse>
     */
    public AsyncInvoker<DeleteBandwidthRequest, DeleteBandwidthResponse> deleteBandwidthAsyncInvoker(
        DeleteBandwidthRequest request) {
        return new AsyncInvoker<DeleteBandwidthRequest, DeleteBandwidthResponse>(request, IecMeta.deleteBandwidth,
            hcClient);
    }

    /**
     * 删除部署计划
     *
     * 删除部署计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentRequest 请求对象
     * @return CompletableFuture<DeleteDeploymentResponse>
     */
    public CompletableFuture<DeleteDeploymentResponse> deleteDeploymentAsync(DeleteDeploymentRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteDeployment);
    }

    /**
     * 删除部署计划
     *
     * 删除部署计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentRequest 请求对象
     * @return AsyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse>
     */
    public AsyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse> deleteDeploymentAsyncInvoker(
        DeleteDeploymentRequest request) {
        return new AsyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse>(request, IecMeta.deleteDeployment,
            hcClient);
    }

    /**
     * 删除边缘业务
     *
     * 删除边缘业务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeCloudRequest 请求对象
     * @return CompletableFuture<DeleteEdgeCloudResponse>
     */
    public CompletableFuture<DeleteEdgeCloudResponse> deleteEdgeCloudAsync(DeleteEdgeCloudRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteEdgeCloud);
    }

    /**
     * 删除边缘业务
     *
     * 删除边缘业务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeCloudRequest 请求对象
     * @return AsyncInvoker<DeleteEdgeCloudRequest, DeleteEdgeCloudResponse>
     */
    public AsyncInvoker<DeleteEdgeCloudRequest, DeleteEdgeCloudResponse> deleteEdgeCloudAsyncInvoker(
        DeleteEdgeCloudRequest request) {
        return new AsyncInvoker<DeleteEdgeCloudRequest, DeleteEdgeCloudResponse>(request, IecMeta.deleteEdgeCloud,
            hcClient);
    }

    /**
     * 删除边缘私有镜像
     *
     * 将指定ID的边缘私有镜像删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteImageRequest 请求对象
     * @return CompletableFuture<DeleteImageResponse>
     */
    public CompletableFuture<DeleteImageResponse> deleteImageAsync(DeleteImageRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteImage);
    }

    /**
     * 删除边缘私有镜像
     *
     * 将指定ID的边缘私有镜像删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteImageRequest 请求对象
     * @return AsyncInvoker<DeleteImageRequest, DeleteImageResponse>
     */
    public AsyncInvoker<DeleteImageRequest, DeleteImageResponse> deleteImageAsyncInvoker(DeleteImageRequest request) {
        return new AsyncInvoker<DeleteImageRequest, DeleteImageResponse>(request, IecMeta.deleteImage, hcClient);
    }

    /**
     * 批量删除边缘实例
     *
     * 批量删除边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstancesRequest 请求对象
     * @return CompletableFuture<DeleteInstancesResponse>
     */
    public CompletableFuture<DeleteInstancesResponse> deleteInstancesAsync(DeleteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteInstances);
    }

    /**
     * 批量删除边缘实例
     *
     * 批量删除边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstancesRequest 请求对象
     * @return AsyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse>
     */
    public AsyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse> deleteInstancesAsyncInvoker(
        DeleteInstancesRequest request) {
        return new AsyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse>(request, IecMeta.deleteInstances,
            hcClient);
    }

    /**
     * 删除密钥
     *
     * 删除密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteKeypairRequest 请求对象
     * @return CompletableFuture<DeleteKeypairResponse>
     */
    public CompletableFuture<DeleteKeypairResponse> deleteKeypairAsync(DeleteKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteKeypair);
    }

    /**
     * 删除密钥
     *
     * 删除密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteKeypairRequest 请求对象
     * @return AsyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse>
     */
    public AsyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse> deleteKeypairAsyncInvoker(
        DeleteKeypairRequest request) {
        return new AsyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse>(request, IecMeta.deleteKeypair, hcClient);
    }

    /**
     * 删除网卡
     *
     * 删除网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNicsRequest 请求对象
     * @return CompletableFuture<DeleteNicsResponse>
     */
    public CompletableFuture<DeleteNicsResponse> deleteNicsAsync(DeleteNicsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteNics);
    }

    /**
     * 删除网卡
     *
     * 删除网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNicsRequest 请求对象
     * @return AsyncInvoker<DeleteNicsRequest, DeleteNicsResponse>
     */
    public AsyncInvoker<DeleteNicsRequest, DeleteNicsResponse> deleteNicsAsyncInvoker(DeleteNicsRequest request) {
        return new AsyncInvoker<DeleteNicsRequest, DeleteNicsResponse>(request, IecMeta.deleteNics, hcClient);
    }

    /**
     * 删除端口
     *
     * 删除端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePortRequest 请求对象
     * @return CompletableFuture<DeletePortResponse>
     */
    public CompletableFuture<DeletePortResponse> deletePortAsync(DeletePortRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deletePort);
    }

    /**
     * 删除端口
     *
     * 删除端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePortRequest 请求对象
     * @return AsyncInvoker<DeletePortRequest, DeletePortResponse>
     */
    public AsyncInvoker<DeletePortRequest, DeletePortResponse> deletePortAsyncInvoker(DeletePortRequest request) {
        return new AsyncInvoker<DeletePortRequest, DeletePortResponse>(request, IecMeta.deletePort, hcClient);
    }

    /**
     * 删除路由
     *
     * 删除路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoutesRequest 请求对象
     * @return CompletableFuture<DeleteRoutesResponse>
     */
    public CompletableFuture<DeleteRoutesResponse> deleteRoutesAsync(DeleteRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteRoutes);
    }

    /**
     * 删除路由
     *
     * 删除路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoutesRequest 请求对象
     * @return AsyncInvoker<DeleteRoutesRequest, DeleteRoutesResponse>
     */
    public AsyncInvoker<DeleteRoutesRequest, DeleteRoutesResponse> deleteRoutesAsyncInvoker(
        DeleteRoutesRequest request) {
        return new AsyncInvoker<DeleteRoutesRequest, DeleteRoutesResponse>(request, IecMeta.deleteRoutes, hcClient);
    }

    /**
     * 删除路由表
     *
     * 删除路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoutetableRequest 请求对象
     * @return CompletableFuture<DeleteRoutetableResponse>
     */
    public CompletableFuture<DeleteRoutetableResponse> deleteRoutetableAsync(DeleteRoutetableRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteRoutetable);
    }

    /**
     * 删除路由表
     *
     * 删除路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoutetableRequest 请求对象
     * @return AsyncInvoker<DeleteRoutetableRequest, DeleteRoutetableResponse>
     */
    public AsyncInvoker<DeleteRoutetableRequest, DeleteRoutetableResponse> deleteRoutetableAsyncInvoker(
        DeleteRoutetableRequest request) {
        return new AsyncInvoker<DeleteRoutetableRequest, DeleteRoutetableResponse>(request, IecMeta.deleteRoutetable,
            hcClient);
    }

    /**
     * 删除安全组
     *
     * 根据安全组的ID，删除对应的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return CompletableFuture<DeleteSecurityGroupResponse>
     */
    public CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroupAsync(DeleteSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteSecurityGroup);
    }

    /**
     * 删除安全组
     *
     * 根据安全组的ID，删除对应的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>
     */
    public AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroupAsyncInvoker(
        DeleteSecurityGroupRequest request) {
        return new AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>(request,
            IecMeta.deleteSecurityGroup, hcClient);
    }

    /**
     * 删除安全组规则
     *
     * 根据安全组的ID，删除对应的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<DeleteSecurityGroupRuleResponse>
     */
    public CompletableFuture<DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleAsync(
        DeleteSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteSecurityGroupRule);
    }

    /**
     * 删除安全组规则
     *
     * 根据安全组的ID，删除对应的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>
     */
    public AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleAsyncInvoker(
        DeleteSecurityGroupRuleRequest request) {
        return new AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>(request,
            IecMeta.deleteSecurityGroupRule, hcClient);
    }

    /**
     * 删除子网
     *
     * 根据子网的ID，删除子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubnetRequest 请求对象
     * @return CompletableFuture<DeleteSubnetResponse>
     */
    public CompletableFuture<DeleteSubnetResponse> deleteSubnetAsync(DeleteSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteSubnet);
    }

    /**
     * 删除子网
     *
     * 根据子网的ID，删除子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubnetRequest 请求对象
     * @return AsyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse>
     */
    public AsyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse> deleteSubnetAsyncInvoker(
        DeleteSubnetRequest request) {
        return new AsyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse>(request, IecMeta.deleteSubnet, hcClient);
    }

    /**
     * 删除虚拟私有云
     *
     * 根据虚拟机私有云的ID，删除对应的虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcRequest 请求对象
     * @return CompletableFuture<DeleteVpcResponse>
     */
    public CompletableFuture<DeleteVpcResponse> deleteVpcAsync(DeleteVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteVpc);
    }

    /**
     * 删除虚拟私有云
     *
     * 根据虚拟机私有云的ID，删除对应的虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcRequest 请求对象
     * @return AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse>
     */
    public AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse> deleteVpcAsyncInvoker(DeleteVpcRequest request) {
        return new AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse>(request, IecMeta.deleteVpc, hcClient);
    }

    /**
     * 路由表解关联子网
     *
     * 路由表解关联子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateSubnetRequest 请求对象
     * @return CompletableFuture<DisassociateSubnetResponse>
     */
    public CompletableFuture<DisassociateSubnetResponse> disassociateSubnetAsync(DisassociateSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.disassociateSubnet);
    }

    /**
     * 路由表解关联子网
     *
     * 路由表解关联子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateSubnetRequest 请求对象
     * @return AsyncInvoker<DisassociateSubnetRequest, DisassociateSubnetResponse>
     */
    public AsyncInvoker<DisassociateSubnetRequest, DisassociateSubnetResponse> disassociateSubnetAsyncInvoker(
        DisassociateSubnetRequest request) {
        return new AsyncInvoker<DisassociateSubnetRequest, DisassociateSubnetResponse>(request,
            IecMeta.disassociateSubnet, hcClient);
    }

    /**
     * 执行部署计划
     *
     * 执行部署计划，创建一个边缘业务。单租户默认可创建10个边缘业务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteDeploymentRequest 请求对象
     * @return CompletableFuture<ExecuteDeploymentResponse>
     */
    public CompletableFuture<ExecuteDeploymentResponse> executeDeploymentAsync(ExecuteDeploymentRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.executeDeployment);
    }

    /**
     * 执行部署计划
     *
     * 执行部署计划，创建一个边缘业务。单租户默认可创建10个边缘业务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteDeploymentRequest 请求对象
     * @return AsyncInvoker<ExecuteDeploymentRequest, ExecuteDeploymentResponse>
     */
    public AsyncInvoker<ExecuteDeploymentRequest, ExecuteDeploymentResponse> executeDeploymentAsyncInvoker(
        ExecuteDeploymentRequest request) {
        return new AsyncInvoker<ExecuteDeploymentRequest, ExecuteDeploymentResponse>(request, IecMeta.executeDeployment,
            hcClient);
    }

    /**
     * 扩容边缘业务
     *
     * 执行部署计划，对边缘业务进行扩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandEdgecloudRequest 请求对象
     * @return CompletableFuture<ExpandEdgecloudResponse>
     */
    public CompletableFuture<ExpandEdgecloudResponse> expandEdgecloudAsync(ExpandEdgecloudRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.expandEdgecloud);
    }

    /**
     * 扩容边缘业务
     *
     * 执行部署计划，对边缘业务进行扩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandEdgecloudRequest 请求对象
     * @return AsyncInvoker<ExpandEdgecloudRequest, ExpandEdgecloudResponse>
     */
    public AsyncInvoker<ExpandEdgecloudRequest, ExpandEdgecloudResponse> expandEdgecloudAsyncInvoker(
        ExpandEdgecloudRequest request) {
        return new AsyncInvoker<ExpandEdgecloudRequest, ExpandEdgecloudResponse>(request, IecMeta.expandEdgecloud,
            hcClient);
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBandwidthsRequest 请求对象
     * @return CompletableFuture<ListBandwidthsResponse>
     */
    public CompletableFuture<ListBandwidthsResponse> listBandwidthsAsync(ListBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listBandwidths);
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBandwidthsRequest 请求对象
     * @return AsyncInvoker<ListBandwidthsRequest, ListBandwidthsResponse>
     */
    public AsyncInvoker<ListBandwidthsRequest, ListBandwidthsResponse> listBandwidthsAsyncInvoker(
        ListBandwidthsRequest request) {
        return new AsyncInvoker<ListBandwidthsRequest, ListBandwidthsResponse>(request, IecMeta.listBandwidths,
            hcClient);
    }

    /**
     * 查询中心镜像列表
     *
     * 查询租户在某个云Region的可见镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudImagesRequest 请求对象
     * @return CompletableFuture<ListCloudImagesResponse>
     */
    public CompletableFuture<ListCloudImagesResponse> listCloudImagesAsync(ListCloudImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listCloudImages);
    }

    /**
     * 查询中心镜像列表
     *
     * 查询租户在某个云Region的可见镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudImagesRequest 请求对象
     * @return AsyncInvoker<ListCloudImagesRequest, ListCloudImagesResponse>
     */
    public AsyncInvoker<ListCloudImagesRequest, ListCloudImagesResponse> listCloudImagesAsyncInvoker(
        ListCloudImagesRequest request) {
        return new AsyncInvoker<ListCloudImagesRequest, ListCloudImagesResponse>(request, IecMeta.listCloudImages,
            hcClient);
    }

    /**
     * 查询部署计划列表
     *
     * 查询部署计划列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeploymentsRequest 请求对象
     * @return CompletableFuture<ListDeploymentsResponse>
     */
    public CompletableFuture<ListDeploymentsResponse> listDeploymentsAsync(ListDeploymentsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listDeployments);
    }

    /**
     * 查询部署计划列表
     *
     * 查询部署计划列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeploymentsRequest 请求对象
     * @return AsyncInvoker<ListDeploymentsRequest, ListDeploymentsResponse>
     */
    public AsyncInvoker<ListDeploymentsRequest, ListDeploymentsResponse> listDeploymentsAsyncInvoker(
        ListDeploymentsRequest request) {
        return new AsyncInvoker<ListDeploymentsRequest, ListDeploymentsResponse>(request, IecMeta.listDeployments,
            hcClient);
    }

    /**
     * 查询边缘业务列表
     *
     * 查询边缘业务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeCloudRequest 请求对象
     * @return CompletableFuture<ListEdgeCloudResponse>
     */
    public CompletableFuture<ListEdgeCloudResponse> listEdgeCloudAsync(ListEdgeCloudRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listEdgeCloud);
    }

    /**
     * 查询边缘业务列表
     *
     * 查询边缘业务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeCloudRequest 请求对象
     * @return AsyncInvoker<ListEdgeCloudRequest, ListEdgeCloudResponse>
     */
    public AsyncInvoker<ListEdgeCloudRequest, ListEdgeCloudResponse> listEdgeCloudAsyncInvoker(
        ListEdgeCloudRequest request) {
        return new AsyncInvoker<ListEdgeCloudRequest, ListEdgeCloudResponse>(request, IecMeta.listEdgeCloud, hcClient);
    }

    /**
     * 查询边缘规格列表
     *
     * 查询边缘规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listFlavors);
    }

    /**
     * 查询边缘规格列表
     *
     * 查询边缘规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, IecMeta.listFlavors, hcClient);
    }

    /**
     * 查询镜像列表
     *
     * 根据不同条件查询镜像列表，例:
     * 
     * -  查询已注册的私有镜像列表: visibility&#x3D;private
     * - 公共镜像: visibility&#x3D;public
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImagesRequest 请求对象
     * @return CompletableFuture<ListImagesResponse>
     */
    public CompletableFuture<ListImagesResponse> listImagesAsync(ListImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listImages);
    }

    /**
     * 查询镜像列表
     *
     * 根据不同条件查询镜像列表，例:
     * 
     * -  查询已注册的私有镜像列表: visibility&#x3D;private
     * - 公共镜像: visibility&#x3D;public
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImagesRequest 请求对象
     * @return AsyncInvoker<ListImagesRequest, ListImagesResponse>
     */
    public AsyncInvoker<ListImagesRequest, ListImagesResponse> listImagesAsyncInvoker(ListImagesRequest request) {
        return new AsyncInvoker<ListImagesRequest, ListImagesResponse>(request, IecMeta.listImages, hcClient);
    }

    /**
     * 查询边缘实例列表
     *
     * 查询边缘实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listInstances);
    }

    /**
     * 查询边缘实例列表
     *
     * 查询边缘实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, IecMeta.listInstances, hcClient);
    }

    /**
     * 查询密钥列表
     *
     * 查询密钥信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListKeypairsRequest 请求对象
     * @return CompletableFuture<ListKeypairsResponse>
     */
    public CompletableFuture<ListKeypairsResponse> listKeypairsAsync(ListKeypairsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listKeypairs);
    }

    /**
     * 查询密钥列表
     *
     * 查询密钥信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListKeypairsRequest 请求对象
     * @return AsyncInvoker<ListKeypairsRequest, ListKeypairsResponse>
     */
    public AsyncInvoker<ListKeypairsRequest, ListKeypairsResponse> listKeypairsAsyncInvoker(
        ListKeypairsRequest request) {
        return new AsyncInvoker<ListKeypairsRequest, ListKeypairsResponse>(request, IecMeta.listKeypairs, hcClient);
    }

    /**
     * 查询端口列表
     *
     * 查询端口的列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortsRequest 请求对象
     * @return CompletableFuture<ListPortsResponse>
     */
    public CompletableFuture<ListPortsResponse> listPortsAsync(ListPortsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listPorts);
    }

    /**
     * 查询端口列表
     *
     * 查询端口的列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortsRequest 请求对象
     * @return AsyncInvoker<ListPortsRequest, ListPortsResponse>
     */
    public AsyncInvoker<ListPortsRequest, ListPortsResponse> listPortsAsyncInvoker(ListPortsRequest request) {
        return new AsyncInvoker<ListPortsRequest, ListPortsResponse>(request, IecMeta.listPorts, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询租户资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaRequest 请求对象
     * @return CompletableFuture<ListQuotaResponse>
     */
    public CompletableFuture<ListQuotaResponse> listQuotaAsync(ListQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listQuota);
    }

    /**
     * 查询配额
     *
     * 查询租户资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaRequest 请求对象
     * @return AsyncInvoker<ListQuotaRequest, ListQuotaResponse>
     */
    public AsyncInvoker<ListQuotaRequest, ListQuotaResponse> listQuotaAsyncInvoker(ListQuotaRequest request) {
        return new AsyncInvoker<ListQuotaRequest, ListQuotaResponse>(request, IecMeta.listQuota, hcClient);
    }

    /**
     * 查询子网关联的路由表
     *
     * 查询子网关联的路由表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelatedRoutetablesRequest 请求对象
     * @return CompletableFuture<ListRelatedRoutetablesResponse>
     */
    public CompletableFuture<ListRelatedRoutetablesResponse> listRelatedRoutetablesAsync(
        ListRelatedRoutetablesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listRelatedRoutetables);
    }

    /**
     * 查询子网关联的路由表
     *
     * 查询子网关联的路由表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelatedRoutetablesRequest 请求对象
     * @return AsyncInvoker<ListRelatedRoutetablesRequest, ListRelatedRoutetablesResponse>
     */
    public AsyncInvoker<ListRelatedRoutetablesRequest, ListRelatedRoutetablesResponse> listRelatedRoutetablesAsyncInvoker(
        ListRelatedRoutetablesRequest request) {
        return new AsyncInvoker<ListRelatedRoutetablesRequest, ListRelatedRoutetablesResponse>(request,
            IecMeta.listRelatedRoutetables, hcClient);
    }

    /**
     * 查询路由列表
     *
     * 查询路由列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoutesRequest 请求对象
     * @return CompletableFuture<ListRoutesResponse>
     */
    public CompletableFuture<ListRoutesResponse> listRoutesAsync(ListRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listRoutes);
    }

    /**
     * 查询路由列表
     *
     * 查询路由列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoutesRequest 请求对象
     * @return AsyncInvoker<ListRoutesRequest, ListRoutesResponse>
     */
    public AsyncInvoker<ListRoutesRequest, ListRoutesResponse> listRoutesAsyncInvoker(ListRoutesRequest request) {
        return new AsyncInvoker<ListRoutesRequest, ListRoutesResponse>(request, IecMeta.listRoutes, hcClient);
    }

    /**
     * 查询路由表列表
     *
     * 查询路由列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoutetablesRequest 请求对象
     * @return CompletableFuture<ListRoutetablesResponse>
     */
    public CompletableFuture<ListRoutetablesResponse> listRoutetablesAsync(ListRoutetablesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listRoutetables);
    }

    /**
     * 查询路由表列表
     *
     * 查询路由列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoutetablesRequest 请求对象
     * @return AsyncInvoker<ListRoutetablesRequest, ListRoutetablesResponse>
     */
    public AsyncInvoker<ListRoutetablesRequest, ListRoutetablesResponse> listRoutetablesAsyncInvoker(
        ListRoutetablesRequest request) {
        return new AsyncInvoker<ListRoutetablesRequest, ListRoutetablesResponse>(request, IecMeta.listRoutetables,
            hcClient);
    }

    /**
     * 查询安全组规则列表
     *
     * 根据用户的查询条件，获取安全组规则的列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupRulesResponse>
     */
    public CompletableFuture<ListSecurityGroupRulesResponse> listSecurityGroupRulesAsync(
        ListSecurityGroupRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listSecurityGroupRules);
    }

    /**
     * 查询安全组规则列表
     *
     * 根据用户的查询条件，获取安全组规则的列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>
     */
    public AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRulesAsyncInvoker(
        ListSecurityGroupRulesRequest request) {
        return new AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>(request,
            IecMeta.listSecurityGroupRules, hcClient);
    }

    /**
     * 查询安全组列表
     *
     * 根据特定查询条件，获取安全组的列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupsResponse>
     */
    public CompletableFuture<ListSecurityGroupsResponse> listSecurityGroupsAsync(ListSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listSecurityGroups);
    }

    /**
     * 查询安全组列表
     *
     * 根据特定查询条件，获取安全组的列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>
     */
    public AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsAsyncInvoker(
        ListSecurityGroupsRequest request) {
        return new AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>(request,
            IecMeta.listSecurityGroups, hcClient);
    }

    /**
     * 查询边缘站点列表
     *
     * 查询边缘站点列表。
     * 
     * - 边缘站点：靠近终端应用的位置，基于一个或多个运营商建立的一个城市级站点。边缘站点提供物理隔离的资源池，提供多元算力、存储和网络的能力。用户可以将业务灵活就近部署在边缘站点上，以降低网络时延和成本。
     * - 边缘区域：为依据边缘站点的物理位置划分的区域，一个边缘区域包含多个相靠近的边缘站点的集合。IEC当前提供城市级、省级和大区级三个分布层级的边缘区域。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSitesRequest 请求对象
     * @return CompletableFuture<ListSitesResponse>
     */
    public CompletableFuture<ListSitesResponse> listSitesAsync(ListSitesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listSites);
    }

    /**
     * 查询边缘站点列表
     *
     * 查询边缘站点列表。
     * 
     * - 边缘站点：靠近终端应用的位置，基于一个或多个运营商建立的一个城市级站点。边缘站点提供物理隔离的资源池，提供多元算力、存储和网络的能力。用户可以将业务灵活就近部署在边缘站点上，以降低网络时延和成本。
     * - 边缘区域：为依据边缘站点的物理位置划分的区域，一个边缘区域包含多个相靠近的边缘站点的集合。IEC当前提供城市级、省级和大区级三个分布层级的边缘区域。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSitesRequest 请求对象
     * @return AsyncInvoker<ListSitesRequest, ListSitesResponse>
     */
    public AsyncInvoker<ListSitesRequest, ListSitesResponse> listSitesAsyncInvoker(ListSitesRequest request) {
        return new AsyncInvoker<ListSitesRequest, ListSitesResponse>(request, IecMeta.listSites, hcClient);
    }

    /**
     * 查询子网列表
     *
     * 根据查询条件获取子网的列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubnetsRequest 请求对象
     * @return CompletableFuture<ListSubnetsResponse>
     */
    public CompletableFuture<ListSubnetsResponse> listSubnetsAsync(ListSubnetsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listSubnets);
    }

    /**
     * 查询子网列表
     *
     * 根据查询条件获取子网的列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubnetsRequest 请求对象
     * @return AsyncInvoker<ListSubnetsRequest, ListSubnetsResponse>
     */
    public AsyncInvoker<ListSubnetsRequest, ListSubnetsResponse> listSubnetsAsyncInvoker(ListSubnetsRequest request) {
        return new AsyncInvoker<ListSubnetsRequest, ListSubnetsResponse>(request, IecMeta.listSubnets, hcClient);
    }

    /**
     * 查询虚拟私有云列表
     *
     * 获取虚拟私有云的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcsRequest 请求对象
     * @return CompletableFuture<ListVpcsResponse>
     */
    public CompletableFuture<ListVpcsResponse> listVpcsAsync(ListVpcsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listVpcs);
    }

    /**
     * 查询虚拟私有云列表
     *
     * 获取虚拟私有云的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcsRequest 请求对象
     * @return AsyncInvoker<ListVpcsRequest, ListVpcsResponse>
     */
    public AsyncInvoker<ListVpcsRequest, ListVpcsResponse> listVpcsAsyncInvoker(ListVpcsRequest request) {
        return new AsyncInvoker<ListVpcsRequest, ListVpcsResponse>(request, IecMeta.listVpcs, hcClient);
    }

    /**
     * 重试边缘镜像任务
     *
     * 重试边缘镜像任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RebuildImageRequest 请求对象
     * @return CompletableFuture<RebuildImageResponse>
     */
    public CompletableFuture<RebuildImageResponse> rebuildImageAsync(RebuildImageRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.rebuildImage);
    }

    /**
     * 重试边缘镜像任务
     *
     * 重试边缘镜像任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RebuildImageRequest 请求对象
     * @return AsyncInvoker<RebuildImageRequest, RebuildImageResponse>
     */
    public AsyncInvoker<RebuildImageRequest, RebuildImageResponse> rebuildImageAsyncInvoker(
        RebuildImageRequest request) {
        return new AsyncInvoker<RebuildImageRequest, RebuildImageResponse>(request, IecMeta.rebuildImage, hcClient);
    }

    /**
     * 注册边缘私有镜像
     *
     * 将指定Region和ID的IMS镜像注册到边缘IEC-IMS; 
     * 注意指定的Region必须在当前IEC-IMS支持的Region列表中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterImageRequest 请求对象
     * @return CompletableFuture<RegisterImageResponse>
     */
    public CompletableFuture<RegisterImageResponse> registerImageAsync(RegisterImageRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.registerImage);
    }

    /**
     * 注册边缘私有镜像
     *
     * 将指定Region和ID的IMS镜像注册到边缘IEC-IMS; 
     * 注意指定的Region必须在当前IEC-IMS支持的Region列表中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterImageRequest 请求对象
     * @return AsyncInvoker<RegisterImageRequest, RegisterImageResponse>
     */
    public AsyncInvoker<RegisterImageRequest, RegisterImageResponse> registerImageAsyncInvoker(
        RegisterImageRequest request) {
        return new AsyncInvoker<RegisterImageRequest, RegisterImageResponse>(request, IecMeta.registerImage, hcClient);
    }

    /**
     * 查询带宽详情
     *
     * 查询带宽详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBandwidthRequest 请求对象
     * @return CompletableFuture<ShowBandwidthResponse>
     */
    public CompletableFuture<ShowBandwidthResponse> showBandwidthAsync(ShowBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showBandwidth);
    }

    /**
     * 查询带宽详情
     *
     * 查询带宽详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBandwidthRequest 请求对象
     * @return AsyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse>
     */
    public AsyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse> showBandwidthAsyncInvoker(
        ShowBandwidthRequest request) {
        return new AsyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse>(request, IecMeta.showBandwidth, hcClient);
    }

    /**
     * 查询边缘业务详情
     *
     * 查询边缘业务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeCloudRequest 请求对象
     * @return CompletableFuture<ShowEdgeCloudResponse>
     */
    public CompletableFuture<ShowEdgeCloudResponse> showEdgeCloudAsync(ShowEdgeCloudRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showEdgeCloud);
    }

    /**
     * 查询边缘业务详情
     *
     * 查询边缘业务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeCloudRequest 请求对象
     * @return AsyncInvoker<ShowEdgeCloudRequest, ShowEdgeCloudResponse>
     */
    public AsyncInvoker<ShowEdgeCloudRequest, ShowEdgeCloudResponse> showEdgeCloudAsyncInvoker(
        ShowEdgeCloudRequest request) {
        return new AsyncInvoker<ShowEdgeCloudRequest, ShowEdgeCloudResponse>(request, IecMeta.showEdgeCloud, hcClient);
    }

    /**
     * 查询镜像详情
     *
     * 查询镜像详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageRequest 请求对象
     * @return CompletableFuture<ShowImageResponse>
     */
    public CompletableFuture<ShowImageResponse> showImageAsync(ShowImageRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showImage);
    }

    /**
     * 查询镜像详情
     *
     * 查询镜像详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageRequest 请求对象
     * @return AsyncInvoker<ShowImageRequest, ShowImageResponse>
     */
    public AsyncInvoker<ShowImageRequest, ShowImageResponse> showImageAsyncInvoker(ShowImageRequest request) {
        return new AsyncInvoker<ShowImageRequest, ShowImageResponse>(request, IecMeta.showImage, hcClient);
    }

    /**
     * 查询边缘实例详情
     *
     * 查询边缘实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showInstance);
    }

    /**
     * 查询边缘实例详情
     *
     * 查询边缘实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(
        ShowInstanceRequest request) {
        return new AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, IecMeta.showInstance, hcClient);
    }

    /**
     * 查询密钥详情
     *
     * 查询密钥信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowKeypairRequest 请求对象
     * @return CompletableFuture<ShowKeypairResponse>
     */
    public CompletableFuture<ShowKeypairResponse> showKeypairAsync(ShowKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showKeypair);
    }

    /**
     * 查询密钥详情
     *
     * 查询密钥信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowKeypairRequest 请求对象
     * @return AsyncInvoker<ShowKeypairRequest, ShowKeypairResponse>
     */
    public AsyncInvoker<ShowKeypairRequest, ShowKeypairResponse> showKeypairAsyncInvoker(ShowKeypairRequest request) {
        return new AsyncInvoker<ShowKeypairRequest, ShowKeypairResponse>(request, IecMeta.showKeypair, hcClient);
    }

    /**
     * 查询端口详情
     *
     * 根据端口的ID，获取端口的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPortRequest 请求对象
     * @return CompletableFuture<ShowPortResponse>
     */
    public CompletableFuture<ShowPortResponse> showPortAsync(ShowPortRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showPort);
    }

    /**
     * 查询端口详情
     *
     * 根据端口的ID，获取端口的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPortRequest 请求对象
     * @return AsyncInvoker<ShowPortRequest, ShowPortResponse>
     */
    public AsyncInvoker<ShowPortRequest, ShowPortResponse> showPortAsyncInvoker(ShowPortRequest request) {
        return new AsyncInvoker<ShowPortRequest, ShowPortResponse>(request, IecMeta.showPort, hcClient);
    }

    /**
     * 查询路由表详情
     *
     * 查询路由表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRoutetableRequest 请求对象
     * @return CompletableFuture<ShowRoutetableResponse>
     */
    public CompletableFuture<ShowRoutetableResponse> showRoutetableAsync(ShowRoutetableRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showRoutetable);
    }

    /**
     * 查询路由表详情
     *
     * 查询路由表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRoutetableRequest 请求对象
     * @return AsyncInvoker<ShowRoutetableRequest, ShowRoutetableResponse>
     */
    public AsyncInvoker<ShowRoutetableRequest, ShowRoutetableResponse> showRoutetableAsyncInvoker(
        ShowRoutetableRequest request) {
        return new AsyncInvoker<ShowRoutetableRequest, ShowRoutetableResponse>(request, IecMeta.showRoutetable,
            hcClient);
    }

    /**
     * 查询安全组详情
     *
     * 根据安全组的ID，获取特定安全组的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return CompletableFuture<ShowSecurityGroupResponse>
     */
    public CompletableFuture<ShowSecurityGroupResponse> showSecurityGroupAsync(ShowSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showSecurityGroup);
    }

    /**
     * 查询安全组详情
     *
     * 根据安全组的ID，获取特定安全组的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>
     */
    public AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroupAsyncInvoker(
        ShowSecurityGroupRequest request) {
        return new AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>(request, IecMeta.showSecurityGroup,
            hcClient);
    }

    /**
     * 查询安全组规则详情
     *
     * 根据安全组规则的ID，获取安全组规则的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<ShowSecurityGroupRuleResponse>
     */
    public CompletableFuture<ShowSecurityGroupRuleResponse> showSecurityGroupRuleAsync(
        ShowSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showSecurityGroupRule);
    }

    /**
     * 查询安全组规则详情
     *
     * 根据安全组规则的ID，获取安全组规则的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>
     */
    public AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRuleAsyncInvoker(
        ShowSecurityGroupRuleRequest request) {
        return new AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>(request,
            IecMeta.showSecurityGroupRule, hcClient);
    }

    /**
     * 查询子网详情
     *
     * 根据子网的ID，获取子网的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubnetRequest 请求对象
     * @return CompletableFuture<ShowSubnetResponse>
     */
    public CompletableFuture<ShowSubnetResponse> showSubnetAsync(ShowSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showSubnet);
    }

    /**
     * 查询子网详情
     *
     * 根据子网的ID，获取子网的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubnetRequest 请求对象
     * @return AsyncInvoker<ShowSubnetRequest, ShowSubnetResponse>
     */
    public AsyncInvoker<ShowSubnetRequest, ShowSubnetResponse> showSubnetAsyncInvoker(ShowSubnetRequest request) {
        return new AsyncInvoker<ShowSubnetRequest, ShowSubnetResponse>(request, IecMeta.showSubnet, hcClient);
    }

    /**
     * 查询硬盘详情
     *
     * 查询硬盘详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVolumeRequest 请求对象
     * @return CompletableFuture<ShowVolumeResponse>
     */
    public CompletableFuture<ShowVolumeResponse> showVolumeAsync(ShowVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showVolume);
    }

    /**
     * 查询硬盘详情
     *
     * 查询硬盘详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVolumeRequest 请求对象
     * @return AsyncInvoker<ShowVolumeRequest, ShowVolumeResponse>
     */
    public AsyncInvoker<ShowVolumeRequest, ShowVolumeResponse> showVolumeAsyncInvoker(ShowVolumeRequest request) {
        return new AsyncInvoker<ShowVolumeRequest, ShowVolumeResponse>(request, IecMeta.showVolume, hcClient);
    }

    /**
     * 查询硬盘类型列表
     *
     * 查询硬盘类型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVolumeTypesRequest 请求对象
     * @return CompletableFuture<ShowVolumeTypesResponse>
     */
    public CompletableFuture<ShowVolumeTypesResponse> showVolumeTypesAsync(ShowVolumeTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showVolumeTypes);
    }

    /**
     * 查询硬盘类型列表
     *
     * 查询硬盘类型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVolumeTypesRequest 请求对象
     * @return AsyncInvoker<ShowVolumeTypesRequest, ShowVolumeTypesResponse>
     */
    public AsyncInvoker<ShowVolumeTypesRequest, ShowVolumeTypesResponse> showVolumeTypesAsyncInvoker(
        ShowVolumeTypesRequest request) {
        return new AsyncInvoker<ShowVolumeTypesRequest, ShowVolumeTypesResponse>(request, IecMeta.showVolumeTypes,
            hcClient);
    }

    /**
     * 查询虚拟私有云详情
     *
     * 根据虚拟私有云ID，获取虚拟私有云的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcRequest 请求对象
     * @return CompletableFuture<ShowVpcResponse>
     */
    public CompletableFuture<ShowVpcResponse> showVpcAsync(ShowVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showVpc);
    }

    /**
     * 查询虚拟私有云详情
     *
     * 根据虚拟私有云ID，获取虚拟私有云的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcRequest 请求对象
     * @return AsyncInvoker<ShowVpcRequest, ShowVpcResponse>
     */
    public AsyncInvoker<ShowVpcRequest, ShowVpcResponse> showVpcAsyncInvoker(ShowVpcRequest request) {
        return new AsyncInvoker<ShowVpcRequest, ShowVpcResponse>(request, IecMeta.showVpc, hcClient);
    }

    /**
     * 更新带宽
     *
     * 更新带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBandwidthRequest 请求对象
     * @return CompletableFuture<UpdateBandwidthResponse>
     */
    public CompletableFuture<UpdateBandwidthResponse> updateBandwidthAsync(UpdateBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.updateBandwidth);
    }

    /**
     * 更新带宽
     *
     * 更新带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBandwidthRequest 请求对象
     * @return AsyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse>
     */
    public AsyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse> updateBandwidthAsyncInvoker(
        UpdateBandwidthRequest request) {
        return new AsyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse>(request, IecMeta.updateBandwidth,
            hcClient);
    }

    /**
     * 修改边缘实例
     *
     * 修改边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.updateInstance);
    }

    /**
     * 修改边缘实例
     *
     * 修改边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(
        UpdateInstanceRequest request) {
        return new AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, IecMeta.updateInstance,
            hcClient);
    }

    /**
     * 更新端口
     *
     * 更新端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePortRequest 请求对象
     * @return CompletableFuture<UpdatePortResponse>
     */
    public CompletableFuture<UpdatePortResponse> updatePortAsync(UpdatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.updatePort);
    }

    /**
     * 更新端口
     *
     * 更新端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePortRequest 请求对象
     * @return AsyncInvoker<UpdatePortRequest, UpdatePortResponse>
     */
    public AsyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortAsyncInvoker(UpdatePortRequest request) {
        return new AsyncInvoker<UpdatePortRequest, UpdatePortResponse>(request, IecMeta.updatePort, hcClient);
    }

    /**
     * 更新路由
     *
     * 更新路由信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoutesRequest 请求对象
     * @return CompletableFuture<UpdateRoutesResponse>
     */
    public CompletableFuture<UpdateRoutesResponse> updateRoutesAsync(UpdateRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.updateRoutes);
    }

    /**
     * 更新路由
     *
     * 更新路由信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoutesRequest 请求对象
     * @return AsyncInvoker<UpdateRoutesRequest, UpdateRoutesResponse>
     */
    public AsyncInvoker<UpdateRoutesRequest, UpdateRoutesResponse> updateRoutesAsyncInvoker(
        UpdateRoutesRequest request) {
        return new AsyncInvoker<UpdateRoutesRequest, UpdateRoutesResponse>(request, IecMeta.updateRoutes, hcClient);
    }

    /**
     * 更新路由表
     *
     * 更新路由表基本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoutetableRequest 请求对象
     * @return CompletableFuture<UpdateRoutetableResponse>
     */
    public CompletableFuture<UpdateRoutetableResponse> updateRoutetableAsync(UpdateRoutetableRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.updateRoutetable);
    }

    /**
     * 更新路由表
     *
     * 更新路由表基本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoutetableRequest 请求对象
     * @return AsyncInvoker<UpdateRoutetableRequest, UpdateRoutetableResponse>
     */
    public AsyncInvoker<UpdateRoutetableRequest, UpdateRoutetableResponse> updateRoutetableAsyncInvoker(
        UpdateRoutetableRequest request) {
        return new AsyncInvoker<UpdateRoutetableRequest, UpdateRoutetableResponse>(request, IecMeta.updateRoutetable,
            hcClient);
    }

    /**
     * 更新子网
     *
     * 更新子网的基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubnetRequest 请求对象
     * @return CompletableFuture<UpdateSubnetResponse>
     */
    public CompletableFuture<UpdateSubnetResponse> updateSubnetAsync(UpdateSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.updateSubnet);
    }

    /**
     * 更新子网
     *
     * 更新子网的基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubnetRequest 请求对象
     * @return AsyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse>
     */
    public AsyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse> updateSubnetAsyncInvoker(
        UpdateSubnetRequest request) {
        return new AsyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse>(request, IecMeta.updateSubnet, hcClient);
    }

    /**
     * 更新虚拟私有云
     *
     * 更新虚拟私有云的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcRequest 请求对象
     * @return CompletableFuture<UpdateVpcResponse>
     */
    public CompletableFuture<UpdateVpcResponse> updateVpcAsync(UpdateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.updateVpc);
    }

    /**
     * 更新虚拟私有云
     *
     * 更新虚拟私有云的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcRequest 请求对象
     * @return AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse>
     */
    public AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse> updateVpcAsyncInvoker(UpdateVpcRequest request) {
        return new AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse>(request, IecMeta.updateVpc, hcClient);
    }

    /**
     * 创建网络ACL
     *
     * 创建网络ACL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFirewallRequest 请求对象
     * @return CompletableFuture<CreateFirewallResponse>
     */
    public CompletableFuture<CreateFirewallResponse> createFirewallAsync(CreateFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createFirewall);
    }

    /**
     * 创建网络ACL
     *
     * 创建网络ACL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFirewallRequest 请求对象
     * @return AsyncInvoker<CreateFirewallRequest, CreateFirewallResponse>
     */
    public AsyncInvoker<CreateFirewallRequest, CreateFirewallResponse> createFirewallAsyncInvoker(
        CreateFirewallRequest request) {
        return new AsyncInvoker<CreateFirewallRequest, CreateFirewallResponse>(request, IecMeta.createFirewall,
            hcClient);
    }

    /**
     * 删除网络ACL
     *
     * 删除网络ACL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFirewallRequest 请求对象
     * @return CompletableFuture<DeleteFirewallResponse>
     */
    public CompletableFuture<DeleteFirewallResponse> deleteFirewallAsync(DeleteFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteFirewall);
    }

    /**
     * 删除网络ACL
     *
     * 删除网络ACL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFirewallRequest 请求对象
     * @return AsyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse>
     */
    public AsyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse> deleteFirewallAsyncInvoker(
        DeleteFirewallRequest request) {
        return new AsyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse>(request, IecMeta.deleteFirewall,
            hcClient);
    }

    /**
     * 查询网络ACL列表
     *
     * 查询网络ACL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFirewallsRequest 请求对象
     * @return CompletableFuture<ListFirewallsResponse>
     */
    public CompletableFuture<ListFirewallsResponse> listFirewallsAsync(ListFirewallsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listFirewalls);
    }

    /**
     * 查询网络ACL列表
     *
     * 查询网络ACL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFirewallsRequest 请求对象
     * @return AsyncInvoker<ListFirewallsRequest, ListFirewallsResponse>
     */
    public AsyncInvoker<ListFirewallsRequest, ListFirewallsResponse> listFirewallsAsyncInvoker(
        ListFirewallsRequest request) {
        return new AsyncInvoker<ListFirewallsRequest, ListFirewallsResponse>(request, IecMeta.listFirewalls, hcClient);
    }

    /**
     * 查询网络ACL详情
     *
     * 查询网络ACL详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFirewallRequest 请求对象
     * @return CompletableFuture<ShowFirewallResponse>
     */
    public CompletableFuture<ShowFirewallResponse> showFirewallAsync(ShowFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showFirewall);
    }

    /**
     * 查询网络ACL详情
     *
     * 查询网络ACL详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFirewallRequest 请求对象
     * @return AsyncInvoker<ShowFirewallRequest, ShowFirewallResponse>
     */
    public AsyncInvoker<ShowFirewallRequest, ShowFirewallResponse> showFirewallAsyncInvoker(
        ShowFirewallRequest request) {
        return new AsyncInvoker<ShowFirewallRequest, ShowFirewallResponse>(request, IecMeta.showFirewall, hcClient);
    }

    /**
     * 更新网络ACL
     *
     * 更新网络ACL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFirewallRequest 请求对象
     * @return CompletableFuture<UpdateFirewallResponse>
     */
    public CompletableFuture<UpdateFirewallResponse> updateFirewallAsync(UpdateFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.updateFirewall);
    }

    /**
     * 更新网络ACL
     *
     * 更新网络ACL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFirewallRequest 请求对象
     * @return AsyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse>
     */
    public AsyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse> updateFirewallAsyncInvoker(
        UpdateFirewallRequest request) {
        return new AsyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse>(request, IecMeta.updateFirewall,
            hcClient);
    }

    /**
     * 更新网络ACL规则
     *
     * 更新网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFirewallRuleRequest 请求对象
     * @return CompletableFuture<UpdateFirewallRuleResponse>
     */
    public CompletableFuture<UpdateFirewallRuleResponse> updateFirewallRuleAsync(UpdateFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.updateFirewallRule);
    }

    /**
     * 更新网络ACL规则
     *
     * 更新网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFirewallRuleRequest 请求对象
     * @return AsyncInvoker<UpdateFirewallRuleRequest, UpdateFirewallRuleResponse>
     */
    public AsyncInvoker<UpdateFirewallRuleRequest, UpdateFirewallRuleResponse> updateFirewallRuleAsyncInvoker(
        UpdateFirewallRuleRequest request) {
        return new AsyncInvoker<UpdateFirewallRuleRequest, UpdateFirewallRuleResponse>(request,
            IecMeta.updateFirewallRule, hcClient);
    }

    /**
     * 创建弹性公网IP
     *
     * 根据用户的请求内容，创建弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePublicIpRequest 请求对象
     * @return CompletableFuture<CreatePublicIpResponse>
     */
    public CompletableFuture<CreatePublicIpResponse> createPublicIpAsync(CreatePublicIpRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createPublicIp);
    }

    /**
     * 创建弹性公网IP
     *
     * 根据用户的请求内容，创建弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePublicIpRequest 请求对象
     * @return AsyncInvoker<CreatePublicIpRequest, CreatePublicIpResponse>
     */
    public AsyncInvoker<CreatePublicIpRequest, CreatePublicIpResponse> createPublicIpAsyncInvoker(
        CreatePublicIpRequest request) {
        return new AsyncInvoker<CreatePublicIpRequest, CreatePublicIpResponse>(request, IecMeta.createPublicIp,
            hcClient);
    }

    /**
     * 删除弹性公网IP
     *
     * 根据弹性公网IP的ID，删除对应的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePublicIpRequest 请求对象
     * @return CompletableFuture<DeletePublicIpResponse>
     */
    public CompletableFuture<DeletePublicIpResponse> deletePublicIpAsync(DeletePublicIpRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deletePublicIp);
    }

    /**
     * 删除弹性公网IP
     *
     * 根据弹性公网IP的ID，删除对应的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePublicIpRequest 请求对象
     * @return AsyncInvoker<DeletePublicIpRequest, DeletePublicIpResponse>
     */
    public AsyncInvoker<DeletePublicIpRequest, DeletePublicIpResponse> deletePublicIpAsyncInvoker(
        DeletePublicIpRequest request) {
        return new AsyncInvoker<DeletePublicIpRequest, DeletePublicIpResponse>(request, IecMeta.deletePublicIp,
            hcClient);
    }

    /**
     * 查询弹性公网IP列表
     *
     * 获取弹性公网IP列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicIpsRequest 请求对象
     * @return CompletableFuture<ListPublicIpsResponse>
     */
    public CompletableFuture<ListPublicIpsResponse> listPublicIpsAsync(ListPublicIpsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listPublicIps);
    }

    /**
     * 查询弹性公网IP列表
     *
     * 获取弹性公网IP列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicIpsRequest 请求对象
     * @return AsyncInvoker<ListPublicIpsRequest, ListPublicIpsResponse>
     */
    public AsyncInvoker<ListPublicIpsRequest, ListPublicIpsResponse> listPublicIpsAsyncInvoker(
        ListPublicIpsRequest request) {
        return new AsyncInvoker<ListPublicIpsRequest, ListPublicIpsResponse>(request, IecMeta.listPublicIps, hcClient);
    }

    /**
     * 查询弹性公网IP
     *
     * 获取弹性公网IP的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicIpRequest 请求对象
     * @return CompletableFuture<ShowPublicIpResponse>
     */
    public CompletableFuture<ShowPublicIpResponse> showPublicIpAsync(ShowPublicIpRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showPublicIp);
    }

    /**
     * 查询弹性公网IP
     *
     * 获取弹性公网IP的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicIpRequest 请求对象
     * @return AsyncInvoker<ShowPublicIpRequest, ShowPublicIpResponse>
     */
    public AsyncInvoker<ShowPublicIpRequest, ShowPublicIpResponse> showPublicIpAsyncInvoker(
        ShowPublicIpRequest request) {
        return new AsyncInvoker<ShowPublicIpRequest, ShowPublicIpResponse>(request, IecMeta.showPublicIp, hcClient);
    }

    /**
     * 更新弹性公网IP
     *
     * 更新弹性公网IP的信息，主要用于解绑和绑定EIP和VIP之间的关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicIpRequest 请求对象
     * @return CompletableFuture<UpdatePublicIpResponse>
     */
    public CompletableFuture<UpdatePublicIpResponse> updatePublicIpAsync(UpdatePublicIpRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.updatePublicIp);
    }

    /**
     * 更新弹性公网IP
     *
     * 更新弹性公网IP的信息，主要用于解绑和绑定EIP和VIP之间的关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicIpRequest 请求对象
     * @return AsyncInvoker<UpdatePublicIpRequest, UpdatePublicIpResponse>
     */
    public AsyncInvoker<UpdatePublicIpRequest, UpdatePublicIpResponse> updatePublicIpAsyncInvoker(
        UpdatePublicIpRequest request) {
        return new AsyncInvoker<UpdatePublicIpRequest, UpdatePublicIpResponse>(request, IecMeta.updatePublicIp,
            hcClient);
    }

}
