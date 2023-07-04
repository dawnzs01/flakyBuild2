package com.huaweicloud.sdk.elb.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.elb.v2.model.*;

public class ElbClient {

    protected HcClient hcClient;

    public ElbClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ElbClient> newBuilder() {
        return new ClientBuilder<>(ElbClient::new);
    }

    /**
     * 批量添加监听器标签
     *
     * 批量添加监听器标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateListenerTagsRequest 请求对象
     * @return BatchCreateListenerTagsResponse
     */
    public BatchCreateListenerTagsResponse batchCreateListenerTags(BatchCreateListenerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchCreateListenerTags);
    }

    /**
     * 批量添加监听器标签
     *
     * 批量添加监听器标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateListenerTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateListenerTagsRequest, BatchCreateListenerTagsResponse>
     */
    public SyncInvoker<BatchCreateListenerTagsRequest, BatchCreateListenerTagsResponse> batchCreateListenerTagsInvoker(
        BatchCreateListenerTagsRequest request) {
        return new SyncInvoker<BatchCreateListenerTagsRequest, BatchCreateListenerTagsResponse>(request,
            ElbMeta.batchCreateListenerTags, hcClient);
    }

    /**
     * 批量添加负载均衡器标签
     *
     * 批量添加负载均衡器标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateLoadbalancerTagsRequest 请求对象
     * @return BatchCreateLoadbalancerTagsResponse
     */
    public BatchCreateLoadbalancerTagsResponse batchCreateLoadbalancerTags(BatchCreateLoadbalancerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchCreateLoadbalancerTags);
    }

    /**
     * 批量添加负载均衡器标签
     *
     * 批量添加负载均衡器标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateLoadbalancerTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateLoadbalancerTagsRequest, BatchCreateLoadbalancerTagsResponse>
     */
    public SyncInvoker<BatchCreateLoadbalancerTagsRequest, BatchCreateLoadbalancerTagsResponse> batchCreateLoadbalancerTagsInvoker(
        BatchCreateLoadbalancerTagsRequest request) {
        return new SyncInvoker<BatchCreateLoadbalancerTagsRequest, BatchCreateLoadbalancerTagsResponse>(request,
            ElbMeta.batchCreateLoadbalancerTags, hcClient);
    }

    /**
     * 批量删除监听器标签
     *
     * 批量删除监听器标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteListenerTagsRequest 请求对象
     * @return BatchDeleteListenerTagsResponse
     */
    public BatchDeleteListenerTagsResponse batchDeleteListenerTags(BatchDeleteListenerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchDeleteListenerTags);
    }

    /**
     * 批量删除监听器标签
     *
     * 批量删除监听器标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteListenerTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteListenerTagsRequest, BatchDeleteListenerTagsResponse>
     */
    public SyncInvoker<BatchDeleteListenerTagsRequest, BatchDeleteListenerTagsResponse> batchDeleteListenerTagsInvoker(
        BatchDeleteListenerTagsRequest request) {
        return new SyncInvoker<BatchDeleteListenerTagsRequest, BatchDeleteListenerTagsResponse>(request,
            ElbMeta.batchDeleteListenerTags, hcClient);
    }

    /**
     * 批量删除负载均衡器标签
     *
     * 批量删除负载均衡器标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteLoadbalancerTagsRequest 请求对象
     * @return BatchDeleteLoadbalancerTagsResponse
     */
    public BatchDeleteLoadbalancerTagsResponse batchDeleteLoadbalancerTags(BatchDeleteLoadbalancerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchDeleteLoadbalancerTags);
    }

    /**
     * 批量删除负载均衡器标签
     *
     * 批量删除负载均衡器标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteLoadbalancerTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteLoadbalancerTagsRequest, BatchDeleteLoadbalancerTagsResponse>
     */
    public SyncInvoker<BatchDeleteLoadbalancerTagsRequest, BatchDeleteLoadbalancerTagsResponse> batchDeleteLoadbalancerTagsInvoker(
        BatchDeleteLoadbalancerTagsRequest request) {
        return new SyncInvoker<BatchDeleteLoadbalancerTagsRequest, BatchDeleteLoadbalancerTagsResponse>(request,
            ElbMeta.batchDeleteLoadbalancerTags, hcClient);
    }

    /**
     * 创建健康检查
     *
     * 给后端云服务器组添加健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateHealthmonitorRequest 请求对象
     * @return CreateHealthmonitorResponse
     */
    public CreateHealthmonitorResponse createHealthmonitor(CreateHealthmonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createHealthmonitor);
    }

    /**
     * 创建健康检查
     *
     * 给后端云服务器组添加健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateHealthmonitorRequest 请求对象
     * @return SyncInvoker<CreateHealthmonitorRequest, CreateHealthmonitorResponse>
     */
    public SyncInvoker<CreateHealthmonitorRequest, CreateHealthmonitorResponse> createHealthmonitorInvoker(
        CreateHealthmonitorRequest request) {
        return new SyncInvoker<CreateHealthmonitorRequest, CreateHealthmonitorResponse>(request,
            ElbMeta.createHealthmonitor, hcClient);
    }

    /**
     * 创建转发策略
     *
     * 创建listener关联的转发策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateL7policyRequest 请求对象
     * @return CreateL7policyResponse
     */
    public CreateL7policyResponse createL7policy(CreateL7policyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createL7policy);
    }

    /**
     * 创建转发策略
     *
     * 创建listener关联的转发策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateL7policyRequest 请求对象
     * @return SyncInvoker<CreateL7policyRequest, CreateL7policyResponse>
     */
    public SyncInvoker<CreateL7policyRequest, CreateL7policyResponse> createL7policyInvoker(
        CreateL7policyRequest request) {
        return new SyncInvoker<CreateL7policyRequest, CreateL7policyResponse>(request, ElbMeta.createL7policy,
            hcClient);
    }

    /**
     * 创建转发规则
     *
     * 创建转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateL7ruleRequest 请求对象
     * @return CreateL7ruleResponse
     */
    public CreateL7ruleResponse createL7rule(CreateL7ruleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createL7rule);
    }

    /**
     * 创建转发规则
     *
     * 创建转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateL7ruleRequest 请求对象
     * @return SyncInvoker<CreateL7ruleRequest, CreateL7ruleResponse>
     */
    public SyncInvoker<CreateL7ruleRequest, CreateL7ruleResponse> createL7ruleInvoker(CreateL7ruleRequest request) {
        return new SyncInvoker<CreateL7ruleRequest, CreateL7ruleResponse>(request, ElbMeta.createL7rule, hcClient);
    }

    /**
     * 创建监听器
     *
     * 创建与负载均衡器绑定的监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateListenerRequest 请求对象
     * @return CreateListenerResponse
     */
    public CreateListenerResponse createListener(CreateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createListener);
    }

    /**
     * 创建监听器
     *
     * 创建与负载均衡器绑定的监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateListenerRequest 请求对象
     * @return SyncInvoker<CreateListenerRequest, CreateListenerResponse>
     */
    public SyncInvoker<CreateListenerRequest, CreateListenerResponse> createListenerInvoker(
        CreateListenerRequest request) {
        return new SyncInvoker<CreateListenerRequest, CreateListenerResponse>(request, ElbMeta.createListener,
            hcClient);
    }

    /**
     * 添加监听器标签
     *
     * 给指定监听器添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateListenerTagsRequest 请求对象
     * @return CreateListenerTagsResponse
     */
    public CreateListenerTagsResponse createListenerTags(CreateListenerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createListenerTags);
    }

    /**
     * 添加监听器标签
     *
     * 给指定监听器添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateListenerTagsRequest 请求对象
     * @return SyncInvoker<CreateListenerTagsRequest, CreateListenerTagsResponse>
     */
    public SyncInvoker<CreateListenerTagsRequest, CreateListenerTagsResponse> createListenerTagsInvoker(
        CreateListenerTagsRequest request) {
        return new SyncInvoker<CreateListenerTagsRequest, CreateListenerTagsResponse>(request,
            ElbMeta.createListenerTags, hcClient);
    }

    /**
     * 创建负载均衡器
     *
     * 创建私网类型的增强型负载均衡器。创建成功后，该接口会返回创建的增强型负载均衡器的ID、所属子网ID、负载均衡器IP等详细信息。若要创建公网类型的增强型负载均衡器，还需调用创建浮动IP的接口，将浮动IP与私网负载均衡器的vip_port_id绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLoadbalancerRequest 请求对象
     * @return CreateLoadbalancerResponse
     */
    public CreateLoadbalancerResponse createLoadbalancer(CreateLoadbalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createLoadbalancer);
    }

    /**
     * 创建负载均衡器
     *
     * 创建私网类型的增强型负载均衡器。创建成功后，该接口会返回创建的增强型负载均衡器的ID、所属子网ID、负载均衡器IP等详细信息。若要创建公网类型的增强型负载均衡器，还需调用创建浮动IP的接口，将浮动IP与私网负载均衡器的vip_port_id绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLoadbalancerRequest 请求对象
     * @return SyncInvoker<CreateLoadbalancerRequest, CreateLoadbalancerResponse>
     */
    public SyncInvoker<CreateLoadbalancerRequest, CreateLoadbalancerResponse> createLoadbalancerInvoker(
        CreateLoadbalancerRequest request) {
        return new SyncInvoker<CreateLoadbalancerRequest, CreateLoadbalancerResponse>(request,
            ElbMeta.createLoadbalancer, hcClient);
    }

    /**
     * 添加负载均衡器标签
     *
     * 给指定负载均衡器添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLoadbalancerTagsRequest 请求对象
     * @return CreateLoadbalancerTagsResponse
     */
    public CreateLoadbalancerTagsResponse createLoadbalancerTags(CreateLoadbalancerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createLoadbalancerTags);
    }

    /**
     * 添加负载均衡器标签
     *
     * 给指定负载均衡器添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLoadbalancerTagsRequest 请求对象
     * @return SyncInvoker<CreateLoadbalancerTagsRequest, CreateLoadbalancerTagsResponse>
     */
    public SyncInvoker<CreateLoadbalancerTagsRequest, CreateLoadbalancerTagsResponse> createLoadbalancerTagsInvoker(
        CreateLoadbalancerTagsRequest request) {
        return new SyncInvoker<CreateLoadbalancerTagsRequest, CreateLoadbalancerTagsResponse>(request,
            ElbMeta.createLoadbalancerTags, hcClient);
    }

    /**
     * 创建后端云服务器
     *
     * 添加属于某个后端云服务器组的后端云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMemberRequest 请求对象
     * @return CreateMemberResponse
     */
    public CreateMemberResponse createMember(CreateMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createMember);
    }

    /**
     * 创建后端云服务器
     *
     * 添加属于某个后端云服务器组的后端云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMemberRequest 请求对象
     * @return SyncInvoker<CreateMemberRequest, CreateMemberResponse>
     */
    public SyncInvoker<CreateMemberRequest, CreateMemberResponse> createMemberInvoker(CreateMemberRequest request) {
        return new SyncInvoker<CreateMemberRequest, CreateMemberResponse>(request, ElbMeta.createMember, hcClient);
    }

    /**
     * 创建后端云服务器组
     *
     * 创建后端云服务器组。将多个后端云服务器添加到后端云服务器组中后，请求会在后端云服务器间按后端云服务器组的负载均衡算法和后端云服务器的权重来做请求分发。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePoolRequest 请求对象
     * @return CreatePoolResponse
     */
    public CreatePoolResponse createPool(CreatePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createPool);
    }

    /**
     * 创建后端云服务器组
     *
     * 创建后端云服务器组。将多个后端云服务器添加到后端云服务器组中后，请求会在后端云服务器间按后端云服务器组的负载均衡算法和后端云服务器的权重来做请求分发。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePoolRequest 请求对象
     * @return SyncInvoker<CreatePoolRequest, CreatePoolResponse>
     */
    public SyncInvoker<CreatePoolRequest, CreatePoolResponse> createPoolInvoker(CreatePoolRequest request) {
        return new SyncInvoker<CreatePoolRequest, CreatePoolResponse>(request, ElbMeta.createPool, hcClient);
    }

    /**
     * 创建白名单
     *
     * 创建白名单，控制监听器的访问权限。若开启了白名单功能，只有白名单中放通的IP可以访问该监听器的后端服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWhitelistRequest 请求对象
     * @return CreateWhitelistResponse
     */
    public CreateWhitelistResponse createWhitelist(CreateWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createWhitelist);
    }

    /**
     * 创建白名单
     *
     * 创建白名单，控制监听器的访问权限。若开启了白名单功能，只有白名单中放通的IP可以访问该监听器的后端服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWhitelistRequest 请求对象
     * @return SyncInvoker<CreateWhitelistRequest, CreateWhitelistResponse>
     */
    public SyncInvoker<CreateWhitelistRequest, CreateWhitelistResponse> createWhitelistInvoker(
        CreateWhitelistRequest request) {
        return new SyncInvoker<CreateWhitelistRequest, CreateWhitelistResponse>(request, ElbMeta.createWhitelist,
            hcClient);
    }

    /**
     * 删除健康检查
     *
     * 删除健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHealthmonitorRequest 请求对象
     * @return DeleteHealthmonitorResponse
     */
    public DeleteHealthmonitorResponse deleteHealthmonitor(DeleteHealthmonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteHealthmonitor);
    }

    /**
     * 删除健康检查
     *
     * 删除健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHealthmonitorRequest 请求对象
     * @return SyncInvoker<DeleteHealthmonitorRequest, DeleteHealthmonitorResponse>
     */
    public SyncInvoker<DeleteHealthmonitorRequest, DeleteHealthmonitorResponse> deleteHealthmonitorInvoker(
        DeleteHealthmonitorRequest request) {
        return new SyncInvoker<DeleteHealthmonitorRequest, DeleteHealthmonitorResponse>(request,
            ElbMeta.deleteHealthmonitor, hcClient);
    }

    /**
     * 删除转发策略
     *
     * 删除转发策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteL7policyRequest 请求对象
     * @return DeleteL7policyResponse
     */
    public DeleteL7policyResponse deleteL7policy(DeleteL7policyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteL7policy);
    }

    /**
     * 删除转发策略
     *
     * 删除转发策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteL7policyRequest 请求对象
     * @return SyncInvoker<DeleteL7policyRequest, DeleteL7policyResponse>
     */
    public SyncInvoker<DeleteL7policyRequest, DeleteL7policyResponse> deleteL7policyInvoker(
        DeleteL7policyRequest request) {
        return new SyncInvoker<DeleteL7policyRequest, DeleteL7policyResponse>(request, ElbMeta.deleteL7policy,
            hcClient);
    }

    /**
     * 删除转发规则
     *
     * 删除转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteL7ruleRequest 请求对象
     * @return DeleteL7ruleResponse
     */
    public DeleteL7ruleResponse deleteL7rule(DeleteL7ruleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteL7rule);
    }

    /**
     * 删除转发规则
     *
     * 删除转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteL7ruleRequest 请求对象
     * @return SyncInvoker<DeleteL7ruleRequest, DeleteL7ruleResponse>
     */
    public SyncInvoker<DeleteL7ruleRequest, DeleteL7ruleResponse> deleteL7ruleInvoker(DeleteL7ruleRequest request) {
        return new SyncInvoker<DeleteL7ruleRequest, DeleteL7ruleResponse>(request, ElbMeta.deleteL7rule, hcClient);
    }

    /**
     * 删除监听器
     *
     * 根据指定ID删除监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteListenerRequest 请求对象
     * @return DeleteListenerResponse
     */
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteListener);
    }

    /**
     * 删除监听器
     *
     * 根据指定ID删除监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteListenerRequest 请求对象
     * @return SyncInvoker<DeleteListenerRequest, DeleteListenerResponse>
     */
    public SyncInvoker<DeleteListenerRequest, DeleteListenerResponse> deleteListenerInvoker(
        DeleteListenerRequest request) {
        return new SyncInvoker<DeleteListenerRequest, DeleteListenerResponse>(request, ElbMeta.deleteListener,
            hcClient);
    }

    /**
     * 删除监听器标签
     *
     * 删除监听器的某个key对应的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteListenerTagsRequest 请求对象
     * @return DeleteListenerTagsResponse
     */
    public DeleteListenerTagsResponse deleteListenerTags(DeleteListenerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteListenerTags);
    }

    /**
     * 删除监听器标签
     *
     * 删除监听器的某个key对应的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteListenerTagsRequest 请求对象
     * @return SyncInvoker<DeleteListenerTagsRequest, DeleteListenerTagsResponse>
     */
    public SyncInvoker<DeleteListenerTagsRequest, DeleteListenerTagsResponse> deleteListenerTagsInvoker(
        DeleteListenerTagsRequest request) {
        return new SyncInvoker<DeleteListenerTagsRequest, DeleteListenerTagsResponse>(request,
            ElbMeta.deleteListenerTags, hcClient);
    }

    /**
     * 删除负载均衡
     *
     * 根据指定ID删除负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLoadbalancerRequest 请求对象
     * @return DeleteLoadbalancerResponse
     */
    public DeleteLoadbalancerResponse deleteLoadbalancer(DeleteLoadbalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteLoadbalancer);
    }

    /**
     * 删除负载均衡
     *
     * 根据指定ID删除负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLoadbalancerRequest 请求对象
     * @return SyncInvoker<DeleteLoadbalancerRequest, DeleteLoadbalancerResponse>
     */
    public SyncInvoker<DeleteLoadbalancerRequest, DeleteLoadbalancerResponse> deleteLoadbalancerInvoker(
        DeleteLoadbalancerRequest request) {
        return new SyncInvoker<DeleteLoadbalancerRequest, DeleteLoadbalancerResponse>(request,
            ElbMeta.deleteLoadbalancer, hcClient);
    }

    /**
     * 删除负载均衡标签
     *
     * 删除负载均衡器的某个key对应的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLoadbalancerTagsRequest 请求对象
     * @return DeleteLoadbalancerTagsResponse
     */
    public DeleteLoadbalancerTagsResponse deleteLoadbalancerTags(DeleteLoadbalancerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteLoadbalancerTags);
    }

    /**
     * 删除负载均衡标签
     *
     * 删除负载均衡器的某个key对应的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLoadbalancerTagsRequest 请求对象
     * @return SyncInvoker<DeleteLoadbalancerTagsRequest, DeleteLoadbalancerTagsResponse>
     */
    public SyncInvoker<DeleteLoadbalancerTagsRequest, DeleteLoadbalancerTagsResponse> deleteLoadbalancerTagsInvoker(
        DeleteLoadbalancerTagsRequest request) {
        return new SyncInvoker<DeleteLoadbalancerTagsRequest, DeleteLoadbalancerTagsResponse>(request,
            ElbMeta.deleteLoadbalancerTags, hcClient);
    }

    /**
     * 删除后端云服务器
     *
     * 删除后端云服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMemberRequest 请求对象
     * @return DeleteMemberResponse
     */
    public DeleteMemberResponse deleteMember(DeleteMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteMember);
    }

    /**
     * 删除后端云服务器
     *
     * 删除后端云服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMemberRequest 请求对象
     * @return SyncInvoker<DeleteMemberRequest, DeleteMemberResponse>
     */
    public SyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberInvoker(DeleteMemberRequest request) {
        return new SyncInvoker<DeleteMemberRequest, DeleteMemberResponse>(request, ElbMeta.deleteMember, hcClient);
    }

    /**
     * 删除后端云服务器组
     *
     * 删除后端云服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePoolRequest 请求对象
     * @return DeletePoolResponse
     */
    public DeletePoolResponse deletePool(DeletePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deletePool);
    }

    /**
     * 删除后端云服务器组
     *
     * 删除后端云服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePoolRequest 请求对象
     * @return SyncInvoker<DeletePoolRequest, DeletePoolResponse>
     */
    public SyncInvoker<DeletePoolRequest, DeletePoolResponse> deletePoolInvoker(DeletePoolRequest request) {
        return new SyncInvoker<DeletePoolRequest, DeletePoolResponse>(request, ElbMeta.deletePool, hcClient);
    }

    /**
     * 删除白名单
     *
     * 删除白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWhitelistRequest 请求对象
     * @return DeleteWhitelistResponse
     */
    public DeleteWhitelistResponse deleteWhitelist(DeleteWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteWhitelist);
    }

    /**
     * 删除白名单
     *
     * 删除白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWhitelistRequest 请求对象
     * @return SyncInvoker<DeleteWhitelistRequest, DeleteWhitelistResponse>
     */
    public SyncInvoker<DeleteWhitelistRequest, DeleteWhitelistResponse> deleteWhitelistInvoker(
        DeleteWhitelistRequest request) {
        return new SyncInvoker<DeleteWhitelistRequest, DeleteWhitelistResponse>(request, ElbMeta.deleteWhitelist,
            hcClient);
    }

    /**
     * 查询健康检查列表
     *
     * 查询健康检查列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHealthmonitorsRequest 请求对象
     * @return ListHealthmonitorsResponse
     */
    public ListHealthmonitorsResponse listHealthmonitors(ListHealthmonitorsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listHealthmonitors);
    }

    /**
     * 查询健康检查列表
     *
     * 查询健康检查列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHealthmonitorsRequest 请求对象
     * @return SyncInvoker<ListHealthmonitorsRequest, ListHealthmonitorsResponse>
     */
    public SyncInvoker<ListHealthmonitorsRequest, ListHealthmonitorsResponse> listHealthmonitorsInvoker(
        ListHealthmonitorsRequest request) {
        return new SyncInvoker<ListHealthmonitorsRequest, ListHealthmonitorsResponse>(request,
            ElbMeta.listHealthmonitors, hcClient);
    }

    /**
     * 查询转发策略列表
     *
     * 查询转发策略。支持过滤查询和分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListL7policiesRequest 请求对象
     * @return ListL7policiesResponse
     */
    public ListL7policiesResponse listL7policies(ListL7policiesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listL7policies);
    }

    /**
     * 查询转发策略列表
     *
     * 查询转发策略。支持过滤查询和分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListL7policiesRequest 请求对象
     * @return SyncInvoker<ListL7policiesRequest, ListL7policiesResponse>
     */
    public SyncInvoker<ListL7policiesRequest, ListL7policiesResponse> listL7policiesInvoker(
        ListL7policiesRequest request) {
        return new SyncInvoker<ListL7policiesRequest, ListL7policiesResponse>(request, ElbMeta.listL7policies,
            hcClient);
    }

    /**
     * 查询转发规则列表
     *
     * 查询指定转发策略下关联的转发规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListL7rulesRequest 请求对象
     * @return ListL7rulesResponse
     */
    public ListL7rulesResponse listL7rules(ListL7rulesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listL7rules);
    }

    /**
     * 查询转发规则列表
     *
     * 查询指定转发策略下关联的转发规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListL7rulesRequest 请求对象
     * @return SyncInvoker<ListL7rulesRequest, ListL7rulesResponse>
     */
    public SyncInvoker<ListL7rulesRequest, ListL7rulesResponse> listL7rulesInvoker(ListL7rulesRequest request) {
        return new SyncInvoker<ListL7rulesRequest, ListL7rulesResponse>(request, ElbMeta.listL7rules, hcClient);
    }

    /**
     * 查询所有监听器的标签列表
     *
     * 查询指定项目下所有监听器的标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListListenerTagsRequest 请求对象
     * @return ListListenerTagsResponse
     */
    public ListListenerTagsResponse listListenerTags(ListListenerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listListenerTags);
    }

    /**
     * 查询所有监听器的标签列表
     *
     * 查询指定项目下所有监听器的标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListListenerTagsRequest 请求对象
     * @return SyncInvoker<ListListenerTagsRequest, ListListenerTagsResponse>
     */
    public SyncInvoker<ListListenerTagsRequest, ListListenerTagsResponse> listListenerTagsInvoker(
        ListListenerTagsRequest request) {
        return new SyncInvoker<ListListenerTagsRequest, ListListenerTagsResponse>(request, ElbMeta.listListenerTags,
            hcClient);
    }

    /**
     * 查询监听器列表
     *
     * 查询监听器列表。支持过滤查询和分页查询。可以通过监听器ID、协议类型、监听端口号、关联的后端云服务器的IP等查询监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListListenersRequest 请求对象
     * @return ListListenersResponse
     */
    public ListListenersResponse listListeners(ListListenersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listListeners);
    }

    /**
     * 查询监听器列表
     *
     * 查询监听器列表。支持过滤查询和分页查询。可以通过监听器ID、协议类型、监听端口号、关联的后端云服务器的IP等查询监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListListenersRequest 请求对象
     * @return SyncInvoker<ListListenersRequest, ListListenersResponse>
     */
    public SyncInvoker<ListListenersRequest, ListListenersResponse> listListenersInvoker(ListListenersRequest request) {
        return new SyncInvoker<ListListenersRequest, ListListenersResponse>(request, ElbMeta.listListeners, hcClient);
    }

    /**
     * 根据标签查询监听器
     *
     * 根据标签过滤查询监听器实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListListenersByTagsRequest 请求对象
     * @return ListListenersByTagsResponse
     */
    public ListListenersByTagsResponse listListenersByTags(ListListenersByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listListenersByTags);
    }

    /**
     * 根据标签查询监听器
     *
     * 根据标签过滤查询监听器实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListListenersByTagsRequest 请求对象
     * @return SyncInvoker<ListListenersByTagsRequest, ListListenersByTagsResponse>
     */
    public SyncInvoker<ListListenersByTagsRequest, ListListenersByTagsResponse> listListenersByTagsInvoker(
        ListListenersByTagsRequest request) {
        return new SyncInvoker<ListListenersByTagsRequest, ListListenersByTagsResponse>(request,
            ElbMeta.listListenersByTags, hcClient);
    }

    /**
     * 查询所有负载均衡器的标签列表
     *
     * 查询指定项目下所有负载均衡器的标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoadbalancerTagsRequest 请求对象
     * @return ListLoadbalancerTagsResponse
     */
    public ListLoadbalancerTagsResponse listLoadbalancerTags(ListLoadbalancerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listLoadbalancerTags);
    }

    /**
     * 查询所有负载均衡器的标签列表
     *
     * 查询指定项目下所有负载均衡器的标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoadbalancerTagsRequest 请求对象
     * @return SyncInvoker<ListLoadbalancerTagsRequest, ListLoadbalancerTagsResponse>
     */
    public SyncInvoker<ListLoadbalancerTagsRequest, ListLoadbalancerTagsResponse> listLoadbalancerTagsInvoker(
        ListLoadbalancerTagsRequest request) {
        return new SyncInvoker<ListLoadbalancerTagsRequest, ListLoadbalancerTagsResponse>(request,
            ElbMeta.listLoadbalancerTags, hcClient);
    }

    /**
     * 查询负载均衡列表
     *
     * 查询负载均衡器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoadbalancersRequest 请求对象
     * @return ListLoadbalancersResponse
     */
    public ListLoadbalancersResponse listLoadbalancers(ListLoadbalancersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listLoadbalancers);
    }

    /**
     * 查询负载均衡列表
     *
     * 查询负载均衡器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoadbalancersRequest 请求对象
     * @return SyncInvoker<ListLoadbalancersRequest, ListLoadbalancersResponse>
     */
    public SyncInvoker<ListLoadbalancersRequest, ListLoadbalancersResponse> listLoadbalancersInvoker(
        ListLoadbalancersRequest request) {
        return new SyncInvoker<ListLoadbalancersRequest, ListLoadbalancersResponse>(request, ElbMeta.listLoadbalancers,
            hcClient);
    }

    /**
     * 根据标签查询负载均衡器
     *
     * 根据标签过滤查询负载均衡实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoadbalancersByTagsRequest 请求对象
     * @return ListLoadbalancersByTagsResponse
     */
    public ListLoadbalancersByTagsResponse listLoadbalancersByTags(ListLoadbalancersByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listLoadbalancersByTags);
    }

    /**
     * 根据标签查询负载均衡器
     *
     * 根据标签过滤查询负载均衡实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoadbalancersByTagsRequest 请求对象
     * @return SyncInvoker<ListLoadbalancersByTagsRequest, ListLoadbalancersByTagsResponse>
     */
    public SyncInvoker<ListLoadbalancersByTagsRequest, ListLoadbalancersByTagsResponse> listLoadbalancersByTagsInvoker(
        ListLoadbalancersByTagsRequest request) {
        return new SyncInvoker<ListLoadbalancersByTagsRequest, ListLoadbalancersByTagsResponse>(request,
            ElbMeta.listLoadbalancersByTags, hcClient);
    }

    /**
     * 查询后端云服务器列表
     *
     * 查询属于某个后端云服务器组的后端云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMembersRequest 请求对象
     * @return ListMembersResponse
     */
    public ListMembersResponse listMembers(ListMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listMembers);
    }

    /**
     * 查询后端云服务器列表
     *
     * 查询属于某个后端云服务器组的后端云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMembersRequest 请求对象
     * @return SyncInvoker<ListMembersRequest, ListMembersResponse>
     */
    public SyncInvoker<ListMembersRequest, ListMembersResponse> listMembersInvoker(ListMembersRequest request) {
        return new SyncInvoker<ListMembersRequest, ListMembersResponse>(request, ElbMeta.listMembers, hcClient);
    }

    /**
     * 查询后端云服务器组列表
     *
     * 查询后端云服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPoolsRequest 请求对象
     * @return ListPoolsResponse
     */
    public ListPoolsResponse listPools(ListPoolsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listPools);
    }

    /**
     * 查询后端云服务器组列表
     *
     * 查询后端云服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPoolsRequest 请求对象
     * @return SyncInvoker<ListPoolsRequest, ListPoolsResponse>
     */
    public SyncInvoker<ListPoolsRequest, ListPoolsResponse> listPoolsInvoker(ListPoolsRequest request) {
        return new SyncInvoker<ListPoolsRequest, ListPoolsResponse>(request, ElbMeta.listPools, hcClient);
    }

    /**
     * 查询白名单列表
     *
     * 查询白名单，支持过滤查询和分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWhitelistsRequest 请求对象
     * @return ListWhitelistsResponse
     */
    public ListWhitelistsResponse listWhitelists(ListWhitelistsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listWhitelists);
    }

    /**
     * 查询白名单列表
     *
     * 查询白名单，支持过滤查询和分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWhitelistsRequest 请求对象
     * @return SyncInvoker<ListWhitelistsRequest, ListWhitelistsResponse>
     */
    public SyncInvoker<ListWhitelistsRequest, ListWhitelistsResponse> listWhitelistsInvoker(
        ListWhitelistsRequest request) {
        return new SyncInvoker<ListWhitelistsRequest, ListWhitelistsResponse>(request, ElbMeta.listWhitelists,
            hcClient);
    }

    /**
     * 查询健康检查详情
     *
     * 根据指定ID查询健康检查详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHealthmonitorsRequest 请求对象
     * @return ShowHealthmonitorsResponse
     */
    public ShowHealthmonitorsResponse showHealthmonitors(ShowHealthmonitorsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showHealthmonitors);
    }

    /**
     * 查询健康检查详情
     *
     * 根据指定ID查询健康检查详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHealthmonitorsRequest 请求对象
     * @return SyncInvoker<ShowHealthmonitorsRequest, ShowHealthmonitorsResponse>
     */
    public SyncInvoker<ShowHealthmonitorsRequest, ShowHealthmonitorsResponse> showHealthmonitorsInvoker(
        ShowHealthmonitorsRequest request) {
        return new SyncInvoker<ShowHealthmonitorsRequest, ShowHealthmonitorsResponse>(request,
            ElbMeta.showHealthmonitors, hcClient);
    }

    /**
     * 查询转发策略详情
     *
     * 根据指定ID查询转发策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowL7policyRequest 请求对象
     * @return ShowL7policyResponse
     */
    public ShowL7policyResponse showL7policy(ShowL7policyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showL7policy);
    }

    /**
     * 查询转发策略详情
     *
     * 根据指定ID查询转发策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowL7policyRequest 请求对象
     * @return SyncInvoker<ShowL7policyRequest, ShowL7policyResponse>
     */
    public SyncInvoker<ShowL7policyRequest, ShowL7policyResponse> showL7policyInvoker(ShowL7policyRequest request) {
        return new SyncInvoker<ShowL7policyRequest, ShowL7policyResponse>(request, ElbMeta.showL7policy, hcClient);
    }

    /**
     * 查询转发规则详情
     *
     * 根据指定ID查询某转发策略下关联的转发规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowL7ruleRequest 请求对象
     * @return ShowL7ruleResponse
     */
    public ShowL7ruleResponse showL7rule(ShowL7ruleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showL7rule);
    }

    /**
     * 查询转发规则详情
     *
     * 根据指定ID查询某转发策略下关联的转发规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowL7ruleRequest 请求对象
     * @return SyncInvoker<ShowL7ruleRequest, ShowL7ruleResponse>
     */
    public SyncInvoker<ShowL7ruleRequest, ShowL7ruleResponse> showL7ruleInvoker(ShowL7ruleRequest request) {
        return new SyncInvoker<ShowL7ruleRequest, ShowL7ruleResponse>(request, ElbMeta.showL7rule, hcClient);
    }

    /**
     * 查询监听器详情
     *
     * 根据指定ID查询监听器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowListenerRequest 请求对象
     * @return ShowListenerResponse
     */
    public ShowListenerResponse showListener(ShowListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showListener);
    }

    /**
     * 查询监听器详情
     *
     * 根据指定ID查询监听器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowListenerRequest 请求对象
     * @return SyncInvoker<ShowListenerRequest, ShowListenerResponse>
     */
    public SyncInvoker<ShowListenerRequest, ShowListenerResponse> showListenerInvoker(ShowListenerRequest request) {
        return new SyncInvoker<ShowListenerRequest, ShowListenerResponse>(request, ElbMeta.showListener, hcClient);
    }

    /**
     * 查询监听器的标签详情
     *
     * 查询指定监听器的所有标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowListenerTagsRequest 请求对象
     * @return ShowListenerTagsResponse
     */
    public ShowListenerTagsResponse showListenerTags(ShowListenerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showListenerTags);
    }

    /**
     * 查询监听器的标签详情
     *
     * 查询指定监听器的所有标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowListenerTagsRequest 请求对象
     * @return SyncInvoker<ShowListenerTagsRequest, ShowListenerTagsResponse>
     */
    public SyncInvoker<ShowListenerTagsRequest, ShowListenerTagsResponse> showListenerTagsInvoker(
        ShowListenerTagsRequest request) {
        return new SyncInvoker<ShowListenerTagsRequest, ShowListenerTagsResponse>(request, ElbMeta.showListenerTags,
            hcClient);
    }

    /**
     * 查询负载均衡详情
     *
     * 根据指定负载均衡器ID查询负载均衡器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLoadbalancerRequest 请求对象
     * @return ShowLoadbalancerResponse
     */
    public ShowLoadbalancerResponse showLoadbalancer(ShowLoadbalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showLoadbalancer);
    }

    /**
     * 查询负载均衡详情
     *
     * 根据指定负载均衡器ID查询负载均衡器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLoadbalancerRequest 请求对象
     * @return SyncInvoker<ShowLoadbalancerRequest, ShowLoadbalancerResponse>
     */
    public SyncInvoker<ShowLoadbalancerRequest, ShowLoadbalancerResponse> showLoadbalancerInvoker(
        ShowLoadbalancerRequest request) {
        return new SyncInvoker<ShowLoadbalancerRequest, ShowLoadbalancerResponse>(request, ElbMeta.showLoadbalancer,
            hcClient);
    }

    /**
     * 查询负载均衡器的标签详情
     *
     * 查询指定负载均衡器的所有标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLoadbalancerTagsRequest 请求对象
     * @return ShowLoadbalancerTagsResponse
     */
    public ShowLoadbalancerTagsResponse showLoadbalancerTags(ShowLoadbalancerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showLoadbalancerTags);
    }

    /**
     * 查询负载均衡器的标签详情
     *
     * 查询指定负载均衡器的所有标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLoadbalancerTagsRequest 请求对象
     * @return SyncInvoker<ShowLoadbalancerTagsRequest, ShowLoadbalancerTagsResponse>
     */
    public SyncInvoker<ShowLoadbalancerTagsRequest, ShowLoadbalancerTagsResponse> showLoadbalancerTagsInvoker(
        ShowLoadbalancerTagsRequest request) {
        return new SyncInvoker<ShowLoadbalancerTagsRequest, ShowLoadbalancerTagsResponse>(request,
            ElbMeta.showLoadbalancerTags, hcClient);
    }

    /**
     * 查询负载均衡状态树
     *
     * 查询负载均衡器状态树。可通过该接口查询负载均衡器关联的监听器、后端云服务器组、后端云服务器、健康检查、转发策略、转发规则的主要信息，了解负载均衡器下资源的拓扑情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLoadbalancersStatusRequest 请求对象
     * @return ShowLoadbalancersStatusResponse
     */
    public ShowLoadbalancersStatusResponse showLoadbalancersStatus(ShowLoadbalancersStatusRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showLoadbalancersStatus);
    }

    /**
     * 查询负载均衡状态树
     *
     * 查询负载均衡器状态树。可通过该接口查询负载均衡器关联的监听器、后端云服务器组、后端云服务器、健康检查、转发策略、转发规则的主要信息，了解负载均衡器下资源的拓扑情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLoadbalancersStatusRequest 请求对象
     * @return SyncInvoker<ShowLoadbalancersStatusRequest, ShowLoadbalancersStatusResponse>
     */
    public SyncInvoker<ShowLoadbalancersStatusRequest, ShowLoadbalancersStatusResponse> showLoadbalancersStatusInvoker(
        ShowLoadbalancersStatusRequest request) {
        return new SyncInvoker<ShowLoadbalancersStatusRequest, ShowLoadbalancersStatusResponse>(request,
            ElbMeta.showLoadbalancersStatus, hcClient);
    }

    /**
     * 查询后端云服务器详情
     *
     * 根据指定ID查询后端云服务器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMemberRequest 请求对象
     * @return ShowMemberResponse
     */
    public ShowMemberResponse showMember(ShowMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showMember);
    }

    /**
     * 查询后端云服务器详情
     *
     * 根据指定ID查询后端云服务器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMemberRequest 请求对象
     * @return SyncInvoker<ShowMemberRequest, ShowMemberResponse>
     */
    public SyncInvoker<ShowMemberRequest, ShowMemberResponse> showMemberInvoker(ShowMemberRequest request) {
        return new SyncInvoker<ShowMemberRequest, ShowMemberResponse>(request, ElbMeta.showMember, hcClient);
    }

    /**
     * 查询后端云服务器组详情
     *
     * 根据指定ID查询后端云服务器组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPoolRequest 请求对象
     * @return ShowPoolResponse
     */
    public ShowPoolResponse showPool(ShowPoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showPool);
    }

    /**
     * 查询后端云服务器组详情
     *
     * 根据指定ID查询后端云服务器组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPoolRequest 请求对象
     * @return SyncInvoker<ShowPoolRequest, ShowPoolResponse>
     */
    public SyncInvoker<ShowPoolRequest, ShowPoolResponse> showPoolInvoker(ShowPoolRequest request) {
        return new SyncInvoker<ShowPoolRequest, ShowPoolResponse>(request, ElbMeta.showPool, hcClient);
    }

    /**
     * 查询白名单详情
     *
     * 根据指定ID查询白名单详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWhitelistRequest 请求对象
     * @return ShowWhitelistResponse
     */
    public ShowWhitelistResponse showWhitelist(ShowWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showWhitelist);
    }

    /**
     * 查询白名单详情
     *
     * 根据指定ID查询白名单详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWhitelistRequest 请求对象
     * @return SyncInvoker<ShowWhitelistRequest, ShowWhitelistResponse>
     */
    public SyncInvoker<ShowWhitelistRequest, ShowWhitelistResponse> showWhitelistInvoker(ShowWhitelistRequest request) {
        return new SyncInvoker<ShowWhitelistRequest, ShowWhitelistResponse>(request, ElbMeta.showWhitelist, hcClient);
    }

    /**
     * 更新健康检查
     *
     * 更新健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHealthmonitorRequest 请求对象
     * @return UpdateHealthmonitorResponse
     */
    public UpdateHealthmonitorResponse updateHealthmonitor(UpdateHealthmonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateHealthmonitor);
    }

    /**
     * 更新健康检查
     *
     * 更新健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHealthmonitorRequest 请求对象
     * @return SyncInvoker<UpdateHealthmonitorRequest, UpdateHealthmonitorResponse>
     */
    public SyncInvoker<UpdateHealthmonitorRequest, UpdateHealthmonitorResponse> updateHealthmonitorInvoker(
        UpdateHealthmonitorRequest request) {
        return new SyncInvoker<UpdateHealthmonitorRequest, UpdateHealthmonitorResponse>(request,
            ElbMeta.updateHealthmonitor, hcClient);
    }

    /**
     * 更新转发策略
     *
     * 更新转发策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateL7policiesRequest 请求对象
     * @return UpdateL7policiesResponse
     */
    public UpdateL7policiesResponse updateL7policies(UpdateL7policiesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateL7policies);
    }

    /**
     * 更新转发策略
     *
     * 更新转发策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateL7policiesRequest 请求对象
     * @return SyncInvoker<UpdateL7policiesRequest, UpdateL7policiesResponse>
     */
    public SyncInvoker<UpdateL7policiesRequest, UpdateL7policiesResponse> updateL7policiesInvoker(
        UpdateL7policiesRequest request) {
        return new SyncInvoker<UpdateL7policiesRequest, UpdateL7policiesResponse>(request, ElbMeta.updateL7policies,
            hcClient);
    }

    /**
     * 更新转发规则
     *
     * 更新指定的转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateL7ruleRequest 请求对象
     * @return UpdateL7ruleResponse
     */
    public UpdateL7ruleResponse updateL7rule(UpdateL7ruleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateL7rule);
    }

    /**
     * 更新转发规则
     *
     * 更新指定的转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateL7ruleRequest 请求对象
     * @return SyncInvoker<UpdateL7ruleRequest, UpdateL7ruleResponse>
     */
    public SyncInvoker<UpdateL7ruleRequest, UpdateL7ruleResponse> updateL7ruleInvoker(UpdateL7ruleRequest request) {
        return new SyncInvoker<UpdateL7ruleRequest, UpdateL7ruleResponse>(request, ElbMeta.updateL7rule, hcClient);
    }

    /**
     * 更新监听器
     *
     * 更新监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateListenerRequest 请求对象
     * @return UpdateListenerResponse
     */
    public UpdateListenerResponse updateListener(UpdateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateListener);
    }

    /**
     * 更新监听器
     *
     * 更新监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateListenerRequest 请求对象
     * @return SyncInvoker<UpdateListenerRequest, UpdateListenerResponse>
     */
    public SyncInvoker<UpdateListenerRequest, UpdateListenerResponse> updateListenerInvoker(
        UpdateListenerRequest request) {
        return new SyncInvoker<UpdateListenerRequest, UpdateListenerResponse>(request, ElbMeta.updateListener,
            hcClient);
    }

    /**
     * 更新负载均衡器
     *
     * 更新负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLoadbalancerRequest 请求对象
     * @return UpdateLoadbalancerResponse
     */
    public UpdateLoadbalancerResponse updateLoadbalancer(UpdateLoadbalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateLoadbalancer);
    }

    /**
     * 更新负载均衡器
     *
     * 更新负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLoadbalancerRequest 请求对象
     * @return SyncInvoker<UpdateLoadbalancerRequest, UpdateLoadbalancerResponse>
     */
    public SyncInvoker<UpdateLoadbalancerRequest, UpdateLoadbalancerResponse> updateLoadbalancerInvoker(
        UpdateLoadbalancerRequest request) {
        return new SyncInvoker<UpdateLoadbalancerRequest, UpdateLoadbalancerResponse>(request,
            ElbMeta.updateLoadbalancer, hcClient);
    }

    /**
     * 更新后端云服务器
     *
     * 更新后端云服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMemberRequest 请求对象
     * @return UpdateMemberResponse
     */
    public UpdateMemberResponse updateMember(UpdateMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateMember);
    }

    /**
     * 更新后端云服务器
     *
     * 更新后端云服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMemberRequest 请求对象
     * @return SyncInvoker<UpdateMemberRequest, UpdateMemberResponse>
     */
    public SyncInvoker<UpdateMemberRequest, UpdateMemberResponse> updateMemberInvoker(UpdateMemberRequest request) {
        return new SyncInvoker<UpdateMemberRequest, UpdateMemberResponse>(request, ElbMeta.updateMember, hcClient);
    }

    /**
     * 更新后端云服务器组
     *
     * 更新后端云服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePoolRequest 请求对象
     * @return UpdatePoolResponse
     */
    public UpdatePoolResponse updatePool(UpdatePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updatePool);
    }

    /**
     * 更新后端云服务器组
     *
     * 更新后端云服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePoolRequest 请求对象
     * @return SyncInvoker<UpdatePoolRequest, UpdatePoolResponse>
     */
    public SyncInvoker<UpdatePoolRequest, UpdatePoolResponse> updatePoolInvoker(UpdatePoolRequest request) {
        return new SyncInvoker<UpdatePoolRequest, UpdatePoolResponse>(request, ElbMeta.updatePool, hcClient);
    }

    /**
     * 更新白名单
     *
     * 更新白名单。可以打开或关闭白名单，或更新访问控制的IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWhitelistRequest 请求对象
     * @return UpdateWhitelistResponse
     */
    public UpdateWhitelistResponse updateWhitelist(UpdateWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateWhitelist);
    }

    /**
     * 更新白名单
     *
     * 更新白名单。可以打开或关闭白名单，或更新访问控制的IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWhitelistRequest 请求对象
     * @return SyncInvoker<UpdateWhitelistRequest, UpdateWhitelistResponse>
     */
    public SyncInvoker<UpdateWhitelistRequest, UpdateWhitelistResponse> updateWhitelistInvoker(
        UpdateWhitelistRequest request) {
        return new SyncInvoker<UpdateWhitelistRequest, UpdateWhitelistResponse>(request, ElbMeta.updateWhitelist,
            hcClient);
    }

    /**
     * 创建SSL证书
     *
     * 创建SSL证书。将监听器和SSL证书绑定后，可以通过负载均衡器实现服务端认证，后端服务器只要提供HTTP服务就能实现安全可靠的连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return CreateCertificateResponse
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createCertificate);
    }

    /**
     * 创建SSL证书
     *
     * 创建SSL证书。将监听器和SSL证书绑定后，可以通过负载均衡器实现服务端认证，后端服务器只要提供HTTP服务就能实现安全可靠的连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public SyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateInvoker(
        CreateCertificateRequest request) {
        return new SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, ElbMeta.createCertificate,
            hcClient);
    }

    /**
     * 删除SSL证书
     *
     * 删除指定的SSL证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteCertificate);
    }

    /**
     * 删除SSL证书
     *
     * 删除指定的SSL证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(
        DeleteCertificateRequest request) {
        return new SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, ElbMeta.deleteCertificate,
            hcClient);
    }

    /**
     * 查询SSL证书列表
     *
     * 查询SSL证书。支持过滤查询和分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listCertificates);
    }

    /**
     * 查询SSL证书列表
     *
     * 查询SSL证书。支持过滤查询和分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public SyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesInvoker(
        ListCertificatesRequest request) {
        return new SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, ElbMeta.listCertificates,
            hcClient);
    }

    /**
     * 查询SSL证书详情
     *
     * 查询指定SSL证书的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
     * @return ShowCertificateResponse
     */
    public ShowCertificateResponse showCertificate(ShowCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showCertificate);
    }

    /**
     * 查询SSL证书详情
     *
     * 查询指定SSL证书的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
     * @return SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public SyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateInvoker(
        ShowCertificateRequest request) {
        return new SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, ElbMeta.showCertificate,
            hcClient);
    }

    /**
     * 更新SSL证书
     *
     * 更新指定的SSL证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCertificateRequest 请求对象
     * @return UpdateCertificateResponse
     */
    public UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateCertificate);
    }

    /**
     * 更新SSL证书
     *
     * 更新指定的SSL证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCertificateRequest 请求对象
     * @return SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateInvoker(
        UpdateCertificateRequest request) {
        return new SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>(request, ElbMeta.updateCertificate,
            hcClient);
    }

}
