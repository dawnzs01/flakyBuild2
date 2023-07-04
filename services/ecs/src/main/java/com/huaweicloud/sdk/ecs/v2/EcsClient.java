package com.huaweicloud.sdk.ecs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ecs.v2.model.*;

public class EcsClient {

    protected HcClient hcClient;

    public EcsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EcsClient> newBuilder() {
        return new ClientBuilder<>(EcsClient::new);
    }

    /**
     * 添加云服务器组成员
     *
     * 将云服务器加入云服务器组。添加成功后，如果该云服务器组是反亲和性策略的，则该云服务器与云服务器组中的其他成员尽量分散地创建在不同主机上。如果该云服务器时故障域类型的，则该云服务器会拥有故障域属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddServerGroupMemberRequest 请求对象
     * @return AddServerGroupMemberResponse
     */
    public AddServerGroupMemberResponse addServerGroupMember(AddServerGroupMemberRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.addServerGroupMember);
    }

    /**
     * 添加云服务器组成员
     *
     * 将云服务器加入云服务器组。添加成功后，如果该云服务器组是反亲和性策略的，则该云服务器与云服务器组中的其他成员尽量分散地创建在不同主机上。如果该云服务器时故障域类型的，则该云服务器会拥有故障域属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddServerGroupMemberRequest 请求对象
     * @return SyncInvoker<AddServerGroupMemberRequest, AddServerGroupMemberResponse>
     */
    public SyncInvoker<AddServerGroupMemberRequest, AddServerGroupMemberResponse> addServerGroupMemberInvoker(
        AddServerGroupMemberRequest request) {
        return new SyncInvoker<AddServerGroupMemberRequest, AddServerGroupMemberResponse>(request,
            EcsMeta.addServerGroupMember, hcClient);
    }

    /**
     * 云服务器网卡配置虚拟IP地址
     *
     * 虚拟IP地址用于为网卡提供第二个IP地址，同时支持与多个弹性云服务器的网卡绑定，从而实现多个弹性云服务器之间的高可用性。
     * 
     * 该接口用于给云服务器网卡配置虚拟IP地址：
     * 
     * - 当指定的IP地址是一个不存在的虚拟IP地址时，系统会创建该虚拟IP，并绑定至对应网卡。
     * 
     * - 当指定的IP地址是一个已经创建好的私有IP时，系统会将指定的网卡和虚拟IP绑定。如果该IP的device_owner为空，则仅支持VPC内二三层通信；如果该IP的device_owner为neutron:VIP_PORT，则支持VPC内二三层通信、VPC之间对等连接访问，以及弹性公网IP、VPN、云专线等Internet接入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateServerVirtualIpRequest 请求对象
     * @return AssociateServerVirtualIpResponse
     */
    public AssociateServerVirtualIpResponse associateServerVirtualIp(AssociateServerVirtualIpRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.associateServerVirtualIp);
    }

    /**
     * 云服务器网卡配置虚拟IP地址
     *
     * 虚拟IP地址用于为网卡提供第二个IP地址，同时支持与多个弹性云服务器的网卡绑定，从而实现多个弹性云服务器之间的高可用性。
     * 
     * 该接口用于给云服务器网卡配置虚拟IP地址：
     * 
     * - 当指定的IP地址是一个不存在的虚拟IP地址时，系统会创建该虚拟IP，并绑定至对应网卡。
     * 
     * - 当指定的IP地址是一个已经创建好的私有IP时，系统会将指定的网卡和虚拟IP绑定。如果该IP的device_owner为空，则仅支持VPC内二三层通信；如果该IP的device_owner为neutron:VIP_PORT，则支持VPC内二三层通信、VPC之间对等连接访问，以及弹性公网IP、VPN、云专线等Internet接入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateServerVirtualIpRequest 请求对象
     * @return SyncInvoker<AssociateServerVirtualIpRequest, AssociateServerVirtualIpResponse>
     */
    public SyncInvoker<AssociateServerVirtualIpRequest, AssociateServerVirtualIpResponse> associateServerVirtualIpInvoker(
        AssociateServerVirtualIpRequest request) {
        return new SyncInvoker<AssociateServerVirtualIpRequest, AssociateServerVirtualIpResponse>(request,
            EcsMeta.associateServerVirtualIp, hcClient);
    }

    /**
     * 弹性云服务器挂载磁盘
     *
     * 把磁盘挂载到弹性云服务器上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachServerVolumeRequest 请求对象
     * @return AttachServerVolumeResponse
     */
    public AttachServerVolumeResponse attachServerVolume(AttachServerVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.attachServerVolume);
    }

    /**
     * 弹性云服务器挂载磁盘
     *
     * 把磁盘挂载到弹性云服务器上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachServerVolumeRequest 请求对象
     * @return SyncInvoker<AttachServerVolumeRequest, AttachServerVolumeResponse>
     */
    public SyncInvoker<AttachServerVolumeRequest, AttachServerVolumeResponse> attachServerVolumeInvoker(
        AttachServerVolumeRequest request) {
        return new SyncInvoker<AttachServerVolumeRequest, AttachServerVolumeResponse>(request,
            EcsMeta.attachServerVolume, hcClient);
    }

    /**
     * 批量添加云服务器网卡
     *
     * 给云服务器添加一张或多张网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddServerNicsRequest 请求对象
     * @return BatchAddServerNicsResponse
     */
    public BatchAddServerNicsResponse batchAddServerNics(BatchAddServerNicsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchAddServerNics);
    }

    /**
     * 批量添加云服务器网卡
     *
     * 给云服务器添加一张或多张网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddServerNicsRequest 请求对象
     * @return SyncInvoker<BatchAddServerNicsRequest, BatchAddServerNicsResponse>
     */
    public SyncInvoker<BatchAddServerNicsRequest, BatchAddServerNicsResponse> batchAddServerNicsInvoker(
        BatchAddServerNicsRequest request) {
        return new SyncInvoker<BatchAddServerNicsRequest, BatchAddServerNicsResponse>(request,
            EcsMeta.batchAddServerNics, hcClient);
    }

    /**
     * 批量挂载指定共享盘
     *
     * 将指定的共享磁盘一次性挂载到多个弹性云服务器，实现批量挂载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAttachSharableVolumesRequest 请求对象
     * @return BatchAttachSharableVolumesResponse
     */
    public BatchAttachSharableVolumesResponse batchAttachSharableVolumes(BatchAttachSharableVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchAttachSharableVolumes);
    }

    /**
     * 批量挂载指定共享盘
     *
     * 将指定的共享磁盘一次性挂载到多个弹性云服务器，实现批量挂载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAttachSharableVolumesRequest 请求对象
     * @return SyncInvoker<BatchAttachSharableVolumesRequest, BatchAttachSharableVolumesResponse>
     */
    public SyncInvoker<BatchAttachSharableVolumesRequest, BatchAttachSharableVolumesResponse> batchAttachSharableVolumesInvoker(
        BatchAttachSharableVolumesRequest request) {
        return new SyncInvoker<BatchAttachSharableVolumesRequest, BatchAttachSharableVolumesResponse>(request,
            EcsMeta.batchAttachSharableVolumes, hcClient);
    }

    /**
     * 批量添加云服务器标签
     *
     * - 为指定云服务器批量添加标签。
     * 
     * - 标签管理服务TMS使用该接口批量管理云服务器的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateServerTagsRequest 请求对象
     * @return BatchCreateServerTagsResponse
     */
    public BatchCreateServerTagsResponse batchCreateServerTags(BatchCreateServerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchCreateServerTags);
    }

    /**
     * 批量添加云服务器标签
     *
     * - 为指定云服务器批量添加标签。
     * 
     * - 标签管理服务TMS使用该接口批量管理云服务器的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateServerTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse>
     */
    public SyncInvoker<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse> batchCreateServerTagsInvoker(
        BatchCreateServerTagsRequest request) {
        return new SyncInvoker<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse>(request,
            EcsMeta.batchCreateServerTags, hcClient);
    }

    /**
     * 批量删除云服务器网卡
     *
     * 卸载并删除云服务器中的一张或多张网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteServerNicsRequest 请求对象
     * @return BatchDeleteServerNicsResponse
     */
    public BatchDeleteServerNicsResponse batchDeleteServerNics(BatchDeleteServerNicsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchDeleteServerNics);
    }

    /**
     * 批量删除云服务器网卡
     *
     * 卸载并删除云服务器中的一张或多张网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteServerNicsRequest 请求对象
     * @return SyncInvoker<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse>
     */
    public SyncInvoker<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse> batchDeleteServerNicsInvoker(
        BatchDeleteServerNicsRequest request) {
        return new SyncInvoker<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse>(request,
            EcsMeta.batchDeleteServerNics, hcClient);
    }

    /**
     * 批量删除云服务器标签
     *
     * - 为指定云服务器批量删除标签。
     * 
     * - 标签管理服务TMS使用该接口批量管理云服务器的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteServerTagsRequest 请求对象
     * @return BatchDeleteServerTagsResponse
     */
    public BatchDeleteServerTagsResponse batchDeleteServerTags(BatchDeleteServerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchDeleteServerTags);
    }

    /**
     * 批量删除云服务器标签
     *
     * - 为指定云服务器批量删除标签。
     * 
     * - 标签管理服务TMS使用该接口批量管理云服务器的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteServerTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse>
     */
    public SyncInvoker<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse> batchDeleteServerTagsInvoker(
        BatchDeleteServerTagsRequest request) {
        return new SyncInvoker<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse>(request,
            EcsMeta.batchDeleteServerTags, hcClient);
    }

    /**
     * 批量重启云服务器
     *
     * 根据给定的云服务器ID列表，批量重启云服务器，一次最多可以重启1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRebootServersRequest 请求对象
     * @return BatchRebootServersResponse
     */
    public BatchRebootServersResponse batchRebootServers(BatchRebootServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchRebootServers);
    }

    /**
     * 批量重启云服务器
     *
     * 根据给定的云服务器ID列表，批量重启云服务器，一次最多可以重启1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRebootServersRequest 请求对象
     * @return SyncInvoker<BatchRebootServersRequest, BatchRebootServersResponse>
     */
    public SyncInvoker<BatchRebootServersRequest, BatchRebootServersResponse> batchRebootServersInvoker(
        BatchRebootServersRequest request) {
        return new SyncInvoker<BatchRebootServersRequest, BatchRebootServersResponse>(request,
            EcsMeta.batchRebootServers, hcClient);
    }

    /**
     * 批量重置弹性云服务器密码
     *
     * 批量重置弹性云服务器管理帐号（root用户或Administrator用户）的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchResetServersPasswordRequest 请求对象
     * @return BatchResetServersPasswordResponse
     */
    public BatchResetServersPasswordResponse batchResetServersPassword(BatchResetServersPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchResetServersPassword);
    }

    /**
     * 批量重置弹性云服务器密码
     *
     * 批量重置弹性云服务器管理帐号（root用户或Administrator用户）的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchResetServersPasswordRequest 请求对象
     * @return SyncInvoker<BatchResetServersPasswordRequest, BatchResetServersPasswordResponse>
     */
    public SyncInvoker<BatchResetServersPasswordRequest, BatchResetServersPasswordResponse> batchResetServersPasswordInvoker(
        BatchResetServersPasswordRequest request) {
        return new SyncInvoker<BatchResetServersPasswordRequest, BatchResetServersPasswordResponse>(request,
            EcsMeta.batchResetServersPassword, hcClient);
    }

    /**
     * 批量启动云服务器
     *
     * 根据给定的云服务器ID列表，批量启动云服务器，一次最多可以启动1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStartServersRequest 请求对象
     * @return BatchStartServersResponse
     */
    public BatchStartServersResponse batchStartServers(BatchStartServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchStartServers);
    }

    /**
     * 批量启动云服务器
     *
     * 根据给定的云服务器ID列表，批量启动云服务器，一次最多可以启动1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStartServersRequest 请求对象
     * @return SyncInvoker<BatchStartServersRequest, BatchStartServersResponse>
     */
    public SyncInvoker<BatchStartServersRequest, BatchStartServersResponse> batchStartServersInvoker(
        BatchStartServersRequest request) {
        return new SyncInvoker<BatchStartServersRequest, BatchStartServersResponse>(request, EcsMeta.batchStartServers,
            hcClient);
    }

    /**
     * 批量关闭云服务器
     *
     * 根据给定的云服务器ID列表，批量关闭云服务器，一次最多可以关闭1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStopServersRequest 请求对象
     * @return BatchStopServersResponse
     */
    public BatchStopServersResponse batchStopServers(BatchStopServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchStopServers);
    }

    /**
     * 批量关闭云服务器
     *
     * 根据给定的云服务器ID列表，批量关闭云服务器，一次最多可以关闭1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStopServersRequest 请求对象
     * @return SyncInvoker<BatchStopServersRequest, BatchStopServersResponse>
     */
    public SyncInvoker<BatchStopServersRequest, BatchStopServersResponse> batchStopServersInvoker(
        BatchStopServersRequest request) {
        return new SyncInvoker<BatchStopServersRequest, BatchStopServersResponse>(request, EcsMeta.batchStopServers,
            hcClient);
    }

    /**
     * 批量修改弹性云服务器
     *
     * 批量修改弹性云服务器信息。
     * 当前仅支持批量修改云服务器名称，一次最多可以修改1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateServersNameRequest 请求对象
     * @return BatchUpdateServersNameResponse
     */
    public BatchUpdateServersNameResponse batchUpdateServersName(BatchUpdateServersNameRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchUpdateServersName);
    }

    /**
     * 批量修改弹性云服务器
     *
     * 批量修改弹性云服务器信息。
     * 当前仅支持批量修改云服务器名称，一次最多可以修改1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateServersNameRequest 请求对象
     * @return SyncInvoker<BatchUpdateServersNameRequest, BatchUpdateServersNameResponse>
     */
    public SyncInvoker<BatchUpdateServersNameRequest, BatchUpdateServersNameResponse> batchUpdateServersNameInvoker(
        BatchUpdateServersNameRequest request) {
        return new SyncInvoker<BatchUpdateServersNameRequest, BatchUpdateServersNameResponse>(request,
            EcsMeta.batchUpdateServersName, hcClient);
    }

    /**
     * 更换云服务器计费模式
     *
     * 更换云服务器的计费模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeServerChargeModeRequest 请求对象
     * @return ChangeServerChargeModeResponse
     */
    public ChangeServerChargeModeResponse changeServerChargeMode(ChangeServerChargeModeRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.changeServerChargeMode);
    }

    /**
     * 更换云服务器计费模式
     *
     * 更换云服务器的计费模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeServerChargeModeRequest 请求对象
     * @return SyncInvoker<ChangeServerChargeModeRequest, ChangeServerChargeModeResponse>
     */
    public SyncInvoker<ChangeServerChargeModeRequest, ChangeServerChargeModeResponse> changeServerChargeModeInvoker(
        ChangeServerChargeModeRequest request) {
        return new SyncInvoker<ChangeServerChargeModeRequest, ChangeServerChargeModeResponse>(request,
            EcsMeta.changeServerChargeMode, hcClient);
    }

    /**
     * 切换弹性云服务器操作系统(安装Cloud init)
     *
     * 切换弹性云服务器操作系统。支持弹性云服务器数据盘不变的情况下，使用新镜像重装系统盘。
     * 
     * 调用该接口后，系统将卸载系统盘，然后使用新镜像重新创建系统盘，并挂载至弹性云服务器，实现切换操作系统功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeServerOsWithCloudInitRequest 请求对象
     * @return ChangeServerOsWithCloudInitResponse
     */
    public ChangeServerOsWithCloudInitResponse changeServerOsWithCloudInit(ChangeServerOsWithCloudInitRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.changeServerOsWithCloudInit);
    }

    /**
     * 切换弹性云服务器操作系统(安装Cloud init)
     *
     * 切换弹性云服务器操作系统。支持弹性云服务器数据盘不变的情况下，使用新镜像重装系统盘。
     * 
     * 调用该接口后，系统将卸载系统盘，然后使用新镜像重新创建系统盘，并挂载至弹性云服务器，实现切换操作系统功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeServerOsWithCloudInitRequest 请求对象
     * @return SyncInvoker<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse>
     */
    public SyncInvoker<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse> changeServerOsWithCloudInitInvoker(
        ChangeServerOsWithCloudInitRequest request) {
        return new SyncInvoker<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse>(request,
            EcsMeta.changeServerOsWithCloudInit, hcClient);
    }

    /**
     * 切换弹性云服务器操作系统(未安装Cloud init)
     *
     * 切换弹性云服务器操作系统。
     * 
     * 该接口支持未安装Cloud-init或Cloudbase-init的镜像使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeServerOsWithoutCloudInitRequest 请求对象
     * @return ChangeServerOsWithoutCloudInitResponse
     */
    public ChangeServerOsWithoutCloudInitResponse changeServerOsWithoutCloudInit(
        ChangeServerOsWithoutCloudInitRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.changeServerOsWithoutCloudInit);
    }

    /**
     * 切换弹性云服务器操作系统(未安装Cloud init)
     *
     * 切换弹性云服务器操作系统。
     * 
     * 该接口支持未安装Cloud-init或Cloudbase-init的镜像使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeServerOsWithoutCloudInitRequest 请求对象
     * @return SyncInvoker<ChangeServerOsWithoutCloudInitRequest, ChangeServerOsWithoutCloudInitResponse>
     */
    public SyncInvoker<ChangeServerOsWithoutCloudInitRequest, ChangeServerOsWithoutCloudInitResponse> changeServerOsWithoutCloudInitInvoker(
        ChangeServerOsWithoutCloudInitRequest request) {
        return new SyncInvoker<ChangeServerOsWithoutCloudInitRequest, ChangeServerOsWithoutCloudInitResponse>(request,
            EcsMeta.changeServerOsWithoutCloudInit, hcClient);
    }

    /**
     * 创建云服务器(按需)
     *
     * 创建一台或多台[按需付费](https://support.huaweicloud.com/productdesc-ecs/ecs_01_0065.html)方式的云服务器。
     * 
     * 弹性云服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式。
     * 
     * - 密钥对
     * 密钥对指使用密钥对作为弹性云服务器的鉴权方式。
     * 接口调用方法：使用key_name字段，指定弹性云服务器登录时使用的密钥文件。
     * 
     * - 密码
     * 密码指使用设置初始密码方式作为弹性云服务器的鉴权方式，此时，您可以通过用户名密码方式登录弹性云服务器，Linux操作系统时为root用户的初始密码，Windows操作系统时为Administrator用户的初始密码。
     * 
     * 接口调用方法：使用adminPass字段，指定管理员帐号的初始登录密码。对于镜像已安装Cloud-init的Linux云服务器，如果需要使用密文密码，可以使用user_data字段进行密码注入。
     * 
     * &gt; 对于安装Cloud-init镜像的Linux云服务器云主机，若指定user_data字段，则adminPass字段无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostPaidServersRequest 请求对象
     * @return CreatePostPaidServersResponse
     */
    public CreatePostPaidServersResponse createPostPaidServers(CreatePostPaidServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.createPostPaidServers);
    }

    /**
     * 创建云服务器(按需)
     *
     * 创建一台或多台[按需付费](https://support.huaweicloud.com/productdesc-ecs/ecs_01_0065.html)方式的云服务器。
     * 
     * 弹性云服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式。
     * 
     * - 密钥对
     * 密钥对指使用密钥对作为弹性云服务器的鉴权方式。
     * 接口调用方法：使用key_name字段，指定弹性云服务器登录时使用的密钥文件。
     * 
     * - 密码
     * 密码指使用设置初始密码方式作为弹性云服务器的鉴权方式，此时，您可以通过用户名密码方式登录弹性云服务器，Linux操作系统时为root用户的初始密码，Windows操作系统时为Administrator用户的初始密码。
     * 
     * 接口调用方法：使用adminPass字段，指定管理员帐号的初始登录密码。对于镜像已安装Cloud-init的Linux云服务器，如果需要使用密文密码，可以使用user_data字段进行密码注入。
     * 
     * &gt; 对于安装Cloud-init镜像的Linux云服务器云主机，若指定user_data字段，则adminPass字段无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostPaidServersRequest 请求对象
     * @return SyncInvoker<CreatePostPaidServersRequest, CreatePostPaidServersResponse>
     */
    public SyncInvoker<CreatePostPaidServersRequest, CreatePostPaidServersResponse> createPostPaidServersInvoker(
        CreatePostPaidServersRequest request) {
        return new SyncInvoker<CreatePostPaidServersRequest, CreatePostPaidServersResponse>(request,
            EcsMeta.createPostPaidServers, hcClient);
    }

    /**
     * 创建云服务器组
     *
     * 创建弹性云服务器组。
     * 
     * 与原生的创建云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateServerGroupRequest 请求对象
     * @return CreateServerGroupResponse
     */
    public CreateServerGroupResponse createServerGroup(CreateServerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.createServerGroup);
    }

    /**
     * 创建云服务器组
     *
     * 创建弹性云服务器组。
     * 
     * 与原生的创建云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateServerGroupRequest 请求对象
     * @return SyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse>
     */
    public SyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse> createServerGroupInvoker(
        CreateServerGroupRequest request) {
        return new SyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse>(request, EcsMeta.createServerGroup,
            hcClient);
    }

    /**
     * 创建云服务器
     *
     * 创建一台或多台云服务器。
     * 
     * 指该接口兼容《弹性云服务器接口参考》创建云服务器v1的功能，同时合入新功能，支持创建[包年/包月](https://support.huaweicloud.com/productdesc-ecs/ecs_01_0065.html)的弹性云服务器。
     * 
     * 弹性云服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式。
     * 
     * - 密钥对
     * 
     * 指使用密钥对作为弹性云服务器的鉴权方式。
     * 
     * 接口调用方法：使用key_name字段，指定弹性云服务器登录时使用的密钥文件。
     * 
     * - 密码
     * 
     * 指使用设置初始密码方式作为弹性云服务器的鉴权方式，此时，您可以通过用户名密码方式登录弹性云服务器，Linux操作系统时为root用户的初始密码，Windows操作系统时为Administrator用户的初始密码。
     * 
     * 接口调用方法：使用adminPass字段，指定管理员帐号的初始登录密码。对于镜像已安装Cloud-init的Linux云服务器，如果需要使用密文密码，可以使用user_data字段进行密码注入。
     * 
     * &gt; 对于安装Cloud-init镜像的Linux云服务器云主机，若指定user_data字段，则adminPass字段无效。
     * 
     * 购买操作示例：
     * - [使用API购买ECS过程中常见问题及处理方法](https://support.huaweicloud.com/api-ecs/ecs_04_0007.html)
     * - [获取Token并检验Token的有效期 ](https://support.huaweicloud.com/api-ecs/ecs_04_0008.html)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateServersRequest 请求对象
     * @return CreateServersResponse
     */
    public CreateServersResponse createServers(CreateServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.createServers);
    }

    /**
     * 创建云服务器
     *
     * 创建一台或多台云服务器。
     * 
     * 指该接口兼容《弹性云服务器接口参考》创建云服务器v1的功能，同时合入新功能，支持创建[包年/包月](https://support.huaweicloud.com/productdesc-ecs/ecs_01_0065.html)的弹性云服务器。
     * 
     * 弹性云服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式。
     * 
     * - 密钥对
     * 
     * 指使用密钥对作为弹性云服务器的鉴权方式。
     * 
     * 接口调用方法：使用key_name字段，指定弹性云服务器登录时使用的密钥文件。
     * 
     * - 密码
     * 
     * 指使用设置初始密码方式作为弹性云服务器的鉴权方式，此时，您可以通过用户名密码方式登录弹性云服务器，Linux操作系统时为root用户的初始密码，Windows操作系统时为Administrator用户的初始密码。
     * 
     * 接口调用方法：使用adminPass字段，指定管理员帐号的初始登录密码。对于镜像已安装Cloud-init的Linux云服务器，如果需要使用密文密码，可以使用user_data字段进行密码注入。
     * 
     * &gt; 对于安装Cloud-init镜像的Linux云服务器云主机，若指定user_data字段，则adminPass字段无效。
     * 
     * 购买操作示例：
     * - [使用API购买ECS过程中常见问题及处理方法](https://support.huaweicloud.com/api-ecs/ecs_04_0007.html)
     * - [获取Token并检验Token的有效期 ](https://support.huaweicloud.com/api-ecs/ecs_04_0008.html)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateServersRequest 请求对象
     * @return SyncInvoker<CreateServersRequest, CreateServersResponse>
     */
    public SyncInvoker<CreateServersRequest, CreateServersResponse> createServersInvoker(CreateServersRequest request) {
        return new SyncInvoker<CreateServersRequest, CreateServersResponse>(request, EcsMeta.createServers, hcClient);
    }

    /**
     * 删除云服务器组
     *
     * 删除云服务器组。
     * 
     * 与原生的删除云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServerGroupRequest 请求对象
     * @return DeleteServerGroupResponse
     */
    public DeleteServerGroupResponse deleteServerGroup(DeleteServerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.deleteServerGroup);
    }

    /**
     * 删除云服务器组
     *
     * 删除云服务器组。
     * 
     * 与原生的删除云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServerGroupRequest 请求对象
     * @return SyncInvoker<DeleteServerGroupRequest, DeleteServerGroupResponse>
     */
    public SyncInvoker<DeleteServerGroupRequest, DeleteServerGroupResponse> deleteServerGroupInvoker(
        DeleteServerGroupRequest request) {
        return new SyncInvoker<DeleteServerGroupRequest, DeleteServerGroupResponse>(request, EcsMeta.deleteServerGroup,
            hcClient);
    }

    /**
     * 删除云服务器组成员
     *
     * 将弹性云服务器移出云服务器组。移出后，该云服务器与云服务器组中的成员不再遵从反亲和策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServerGroupMemberRequest 请求对象
     * @return DeleteServerGroupMemberResponse
     */
    public DeleteServerGroupMemberResponse deleteServerGroupMember(DeleteServerGroupMemberRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.deleteServerGroupMember);
    }

    /**
     * 删除云服务器组成员
     *
     * 将弹性云服务器移出云服务器组。移出后，该云服务器与云服务器组中的成员不再遵从反亲和策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServerGroupMemberRequest 请求对象
     * @return SyncInvoker<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse>
     */
    public SyncInvoker<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse> deleteServerGroupMemberInvoker(
        DeleteServerGroupMemberRequest request) {
        return new SyncInvoker<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse>(request,
            EcsMeta.deleteServerGroupMember, hcClient);
    }

    /**
     * 删除云服务器指定元数据
     *
     * 删除云服务器指定元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServerMetadataRequest 请求对象
     * @return DeleteServerMetadataResponse
     */
    public DeleteServerMetadataResponse deleteServerMetadata(DeleteServerMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.deleteServerMetadata);
    }

    /**
     * 删除云服务器指定元数据
     *
     * 删除云服务器指定元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServerMetadataRequest 请求对象
     * @return SyncInvoker<DeleteServerMetadataRequest, DeleteServerMetadataResponse>
     */
    public SyncInvoker<DeleteServerMetadataRequest, DeleteServerMetadataResponse> deleteServerMetadataInvoker(
        DeleteServerMetadataRequest request) {
        return new SyncInvoker<DeleteServerMetadataRequest, DeleteServerMetadataResponse>(request,
            EcsMeta.deleteServerMetadata, hcClient);
    }

    /**
     * 云服务器清除密码(企业项目)
     *
     * 清除Windows云服务器初始安装时系统生成的密码记录。清除密码后，不影响云服务器密码登录功能，但不能再使用获取密码功能来查询该云服务器密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServerPasswordRequest 请求对象
     * @return DeleteServerPasswordResponse
     */
    public DeleteServerPasswordResponse deleteServerPassword(DeleteServerPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.deleteServerPassword);
    }

    /**
     * 云服务器清除密码(企业项目)
     *
     * 清除Windows云服务器初始安装时系统生成的密码记录。清除密码后，不影响云服务器密码登录功能，但不能再使用获取密码功能来查询该云服务器密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServerPasswordRequest 请求对象
     * @return SyncInvoker<DeleteServerPasswordRequest, DeleteServerPasswordResponse>
     */
    public SyncInvoker<DeleteServerPasswordRequest, DeleteServerPasswordResponse> deleteServerPasswordInvoker(
        DeleteServerPasswordRequest request) {
        return new SyncInvoker<DeleteServerPasswordRequest, DeleteServerPasswordResponse>(request,
            EcsMeta.deleteServerPassword, hcClient);
    }

    /**
     * 删除云服务器
     *
     * 根据指定的云服务器ID列表，删除云服务器。
     * 
     * 系统支持删除单台云服务器和批量删除多台云服务器操作，批量删除云服务器时，一次最多可以删除1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServersRequest 请求对象
     * @return DeleteServersResponse
     */
    public DeleteServersResponse deleteServers(DeleteServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.deleteServers);
    }

    /**
     * 删除云服务器
     *
     * 根据指定的云服务器ID列表，删除云服务器。
     * 
     * 系统支持删除单台云服务器和批量删除多台云服务器操作，批量删除云服务器时，一次最多可以删除1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServersRequest 请求对象
     * @return SyncInvoker<DeleteServersRequest, DeleteServersResponse>
     */
    public SyncInvoker<DeleteServersRequest, DeleteServersResponse> deleteServersInvoker(DeleteServersRequest request) {
        return new SyncInvoker<DeleteServersRequest, DeleteServersResponse>(request, EcsMeta.deleteServers, hcClient);
    }

    /**
     * 弹性云服务器卸载磁盘
     *
     * 从弹性云服务器中卸载磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetachServerVolumeRequest 请求对象
     * @return DetachServerVolumeResponse
     */
    public DetachServerVolumeResponse detachServerVolume(DetachServerVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.detachServerVolume);
    }

    /**
     * 弹性云服务器卸载磁盘
     *
     * 从弹性云服务器中卸载磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetachServerVolumeRequest 请求对象
     * @return SyncInvoker<DetachServerVolumeRequest, DetachServerVolumeResponse>
     */
    public SyncInvoker<DetachServerVolumeRequest, DetachServerVolumeResponse> detachServerVolumeInvoker(
        DetachServerVolumeRequest request) {
        return new SyncInvoker<DetachServerVolumeRequest, DetachServerVolumeResponse>(request,
            EcsMeta.detachServerVolume, hcClient);
    }

    /**
     * 云服务器网卡解绑虚拟IP地址
     *
     * 虚拟IP地址用于为网卡提供第二个IP地址，同时支持与多个弹性云服务器的网卡绑定，从而实现多个弹性云服务器之间的高可用性。
     * 
     * 该接口用于解绑定弹性云服务器网卡的虚拟IP地址。解绑后，网卡不会被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateServerVirtualIpRequest 请求对象
     * @return DisassociateServerVirtualIpResponse
     */
    public DisassociateServerVirtualIpResponse disassociateServerVirtualIp(DisassociateServerVirtualIpRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.disassociateServerVirtualIp);
    }

    /**
     * 云服务器网卡解绑虚拟IP地址
     *
     * 虚拟IP地址用于为网卡提供第二个IP地址，同时支持与多个弹性云服务器的网卡绑定，从而实现多个弹性云服务器之间的高可用性。
     * 
     * 该接口用于解绑定弹性云服务器网卡的虚拟IP地址。解绑后，网卡不会被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateServerVirtualIpRequest 请求对象
     * @return SyncInvoker<DisassociateServerVirtualIpRequest, DisassociateServerVirtualIpResponse>
     */
    public SyncInvoker<DisassociateServerVirtualIpRequest, DisassociateServerVirtualIpResponse> disassociateServerVirtualIpInvoker(
        DisassociateServerVirtualIpRequest request) {
        return new SyncInvoker<DisassociateServerVirtualIpRequest, DisassociateServerVirtualIpResponse>(request,
            EcsMeta.disassociateServerVirtualIp, hcClient);
    }

    /**
     * 查询规格销售策略
     *
     * 查询规格销售策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorSellPoliciesRequest 请求对象
     * @return ListFlavorSellPoliciesResponse
     */
    public ListFlavorSellPoliciesResponse listFlavorSellPolicies(ListFlavorSellPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listFlavorSellPolicies);
    }

    /**
     * 查询规格销售策略
     *
     * 查询规格销售策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorSellPoliciesRequest 请求对象
     * @return SyncInvoker<ListFlavorSellPoliciesRequest, ListFlavorSellPoliciesResponse>
     */
    public SyncInvoker<ListFlavorSellPoliciesRequest, ListFlavorSellPoliciesResponse> listFlavorSellPoliciesInvoker(
        ListFlavorSellPoliciesRequest request) {
        return new SyncInvoker<ListFlavorSellPoliciesRequest, ListFlavorSellPoliciesResponse>(request,
            EcsMeta.listFlavorSellPolicies, hcClient);
    }

    /**
     * 查询规格详情和规格扩展信息列表
     *
     * 查询云服务器规格详情信息和规格扩展信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listFlavors);
    }

    /**
     * 查询规格详情和规格扩展信息列表
     *
     * 查询云服务器规格详情信息和规格扩展信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, EcsMeta.listFlavors, hcClient);
    }

    /**
     * 查询云服务器规格变更支持列表
     *
     * 变更规格时，部分规格的云服务器之间不能互相变更。您可以通过本接口，通过指定弹性云服务器规格，查询该规格可以变更的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResizeFlavorsRequest 请求对象
     * @return ListResizeFlavorsResponse
     */
    public ListResizeFlavorsResponse listResizeFlavors(ListResizeFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listResizeFlavors);
    }

    /**
     * 查询云服务器规格变更支持列表
     *
     * 变更规格时，部分规格的云服务器之间不能互相变更。您可以通过本接口，通过指定弹性云服务器规格，查询该规格可以变更的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResizeFlavorsRequest 请求对象
     * @return SyncInvoker<ListResizeFlavorsRequest, ListResizeFlavorsResponse>
     */
    public SyncInvoker<ListResizeFlavorsRequest, ListResizeFlavorsResponse> listResizeFlavorsInvoker(
        ListResizeFlavorsRequest request) {
        return new SyncInvoker<ListResizeFlavorsRequest, ListResizeFlavorsResponse>(request, EcsMeta.listResizeFlavors,
            hcClient);
    }

    /**
     * 查询弹性云服务器磁盘信息
     *
     * 查询弹性云服务器挂载的磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServerBlockDevicesRequest 请求对象
     * @return ListServerBlockDevicesResponse
     */
    public ListServerBlockDevicesResponse listServerBlockDevices(ListServerBlockDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listServerBlockDevices);
    }

    /**
     * 查询弹性云服务器磁盘信息
     *
     * 查询弹性云服务器挂载的磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServerBlockDevicesRequest 请求对象
     * @return SyncInvoker<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse>
     */
    public SyncInvoker<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse> listServerBlockDevicesInvoker(
        ListServerBlockDevicesRequest request) {
        return new SyncInvoker<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse>(request,
            EcsMeta.listServerBlockDevices, hcClient);
    }

    /**
     * 查询云服务器组列表
     *
     * 查询弹性云服务器组。
     * 
     * 与原生的创建云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServerGroupsRequest 请求对象
     * @return ListServerGroupsResponse
     */
    public ListServerGroupsResponse listServerGroups(ListServerGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listServerGroups);
    }

    /**
     * 查询云服务器组列表
     *
     * 查询弹性云服务器组。
     * 
     * 与原生的创建云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServerGroupsRequest 请求对象
     * @return SyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse>
     */
    public SyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse> listServerGroupsInvoker(
        ListServerGroupsRequest request) {
        return new SyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse>(request, EcsMeta.listServerGroups,
            hcClient);
    }

    /**
     * 查询云服务器网卡信息
     *
     * 查询云服务器网卡信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServerInterfacesRequest 请求对象
     * @return ListServerInterfacesResponse
     */
    public ListServerInterfacesResponse listServerInterfaces(ListServerInterfacesRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listServerInterfaces);
    }

    /**
     * 查询云服务器网卡信息
     *
     * 查询云服务器网卡信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServerInterfacesRequest 请求对象
     * @return SyncInvoker<ListServerInterfacesRequest, ListServerInterfacesResponse>
     */
    public SyncInvoker<ListServerInterfacesRequest, ListServerInterfacesResponse> listServerInterfacesInvoker(
        ListServerInterfacesRequest request) {
        return new SyncInvoker<ListServerInterfacesRequest, ListServerInterfacesResponse>(request,
            EcsMeta.listServerInterfaces, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 项目（Project）用于将OpenStack的资源（计算资源、存储资源和网络资源）进行分组和隔离。项目可以是一个部门或者一个项目组。一个帐户中可以创建多个项目。
     * 
     * 该接口用于查询用户在指定项目所使用的全部标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServerTagsRequest 请求对象
     * @return ListServerTagsResponse
     */
    public ListServerTagsResponse listServerTags(ListServerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listServerTags);
    }

    /**
     * 查询项目标签
     *
     * 项目（Project）用于将OpenStack的资源（计算资源、存储资源和网络资源）进行分组和隔离。项目可以是一个部门或者一个项目组。一个帐户中可以创建多个项目。
     * 
     * 该接口用于查询用户在指定项目所使用的全部标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServerTagsRequest 请求对象
     * @return SyncInvoker<ListServerTagsRequest, ListServerTagsResponse>
     */
    public SyncInvoker<ListServerTagsRequest, ListServerTagsResponse> listServerTagsInvoker(
        ListServerTagsRequest request) {
        return new SyncInvoker<ListServerTagsRequest, ListServerTagsResponse>(request, EcsMeta.listServerTags,
            hcClient);
    }

    /**
     * 按标签查询云服务器列表
     *
     * 使用标签过滤弹性云服务器，并返回云服务器使用的所有标签和资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServersByTagRequest 请求对象
     * @return ListServersByTagResponse
     */
    public ListServersByTagResponse listServersByTag(ListServersByTagRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listServersByTag);
    }

    /**
     * 按标签查询云服务器列表
     *
     * 使用标签过滤弹性云服务器，并返回云服务器使用的所有标签和资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServersByTagRequest 请求对象
     * @return SyncInvoker<ListServersByTagRequest, ListServersByTagResponse>
     */
    public SyncInvoker<ListServersByTagRequest, ListServersByTagResponse> listServersByTagInvoker(
        ListServersByTagRequest request) {
        return new SyncInvoker<ListServersByTagRequest, ListServersByTagResponse>(request, EcsMeta.listServersByTag,
            hcClient);
    }

    /**
     * 查询云服务器详情列表
     *
     * 根据用户请求条件从数据库筛选、查询所有的弹性云服务器，并关联相关表获取到弹性云服务器的详细信息。
     * 
     * 该接口支持查询弹性云服务器计费方式，以及是否被冻结。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServersDetailsRequest 请求对象
     * @return ListServersDetailsResponse
     */
    public ListServersDetailsResponse listServersDetails(ListServersDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listServersDetails);
    }

    /**
     * 查询云服务器详情列表
     *
     * 根据用户请求条件从数据库筛选、查询所有的弹性云服务器，并关联相关表获取到弹性云服务器的详细信息。
     * 
     * 该接口支持查询弹性云服务器计费方式，以及是否被冻结。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServersDetailsRequest 请求对象
     * @return SyncInvoker<ListServersDetailsRequest, ListServersDetailsResponse>
     */
    public SyncInvoker<ListServersDetailsRequest, ListServersDetailsResponse> listServersDetailsInvoker(
        ListServersDetailsRequest request) {
        return new SyncInvoker<ListServersDetailsRequest, ListServersDetailsResponse>(request,
            EcsMeta.listServersDetails, hcClient);
    }

    /**
     * 冷迁移云服务器
     *
     * - 将部署在专属主机上的弹性云服务器迁移至其他专属主机。
     * - 将部署在专属主机上的弹性云服务器迁移至公共资源池，即不再部署在专属主机上。
     * - 将公共资源池的弹性云服务器迁移至专属主机上，成为专属主机上部署的弹性云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateServerRequest 请求对象
     * @return MigrateServerResponse
     */
    public MigrateServerResponse migrateServer(MigrateServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.migrateServer);
    }

    /**
     * 冷迁移云服务器
     *
     * - 将部署在专属主机上的弹性云服务器迁移至其他专属主机。
     * - 将部署在专属主机上的弹性云服务器迁移至公共资源池，即不再部署在专属主机上。
     * - 将公共资源池的弹性云服务器迁移至专属主机上，成为专属主机上部署的弹性云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateServerRequest 请求对象
     * @return SyncInvoker<MigrateServerRequest, MigrateServerResponse>
     */
    public SyncInvoker<MigrateServerRequest, MigrateServerResponse> migrateServerInvoker(MigrateServerRequest request) {
        return new SyncInvoker<MigrateServerRequest, MigrateServerResponse>(request, EcsMeta.migrateServer, hcClient);
    }

    /**
     * 添加安全组
     *
     * 为弹性云服务器添加一个安全组。
     * 
     * 添加多个安全组时，建议最多为弹性云服务器添加5个安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaAssociateSecurityGroupRequest 请求对象
     * @return NovaAssociateSecurityGroupResponse
     */
    public NovaAssociateSecurityGroupResponse novaAssociateSecurityGroup(NovaAssociateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaAssociateSecurityGroup);
    }

    /**
     * 添加安全组
     *
     * 为弹性云服务器添加一个安全组。
     * 
     * 添加多个安全组时，建议最多为弹性云服务器添加5个安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaAssociateSecurityGroupRequest 请求对象
     * @return SyncInvoker<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse>
     */
    public SyncInvoker<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse> novaAssociateSecurityGroupInvoker(
        NovaAssociateSecurityGroupRequest request) {
        return new SyncInvoker<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse>(request,
            EcsMeta.novaAssociateSecurityGroup, hcClient);
    }

    /**
     * 添加云服务器网卡
     *
     * 给云服务器添加一张网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaAttachInterfaceRequest 请求对象
     * @return NovaAttachInterfaceResponse
     */
    public NovaAttachInterfaceResponse novaAttachInterface(NovaAttachInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaAttachInterface);
    }

    /**
     * 添加云服务器网卡
     *
     * 给云服务器添加一张网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaAttachInterfaceRequest 请求对象
     * @return SyncInvoker<NovaAttachInterfaceRequest, NovaAttachInterfaceResponse>
     */
    public SyncInvoker<NovaAttachInterfaceRequest, NovaAttachInterfaceResponse> novaAttachInterfaceInvoker(
        NovaAttachInterfaceRequest request) {
        return new SyncInvoker<NovaAttachInterfaceRequest, NovaAttachInterfaceResponse>(request,
            EcsMeta.novaAttachInterface, hcClient);
    }

    /**
     * 创建和导入SSH密钥
     *
     * 创建SSH密钥，或把公钥导入系统，生成密钥对。
     * 
     * 创建SSH密钥成功后，请把响应数据中的私钥内容保存到本地文件，用户使用该私钥登录云服务器云主机。为保证云服务器云主机器安全，私钥数据只能读取一次，请妥善保管。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaCreateKeypairRequest 请求对象
     * @return NovaCreateKeypairResponse
     */
    public NovaCreateKeypairResponse novaCreateKeypair(NovaCreateKeypairRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaCreateKeypair);
    }

    /**
     * 创建和导入SSH密钥
     *
     * 创建SSH密钥，或把公钥导入系统，生成密钥对。
     * 
     * 创建SSH密钥成功后，请把响应数据中的私钥内容保存到本地文件，用户使用该私钥登录云服务器云主机。为保证云服务器云主机器安全，私钥数据只能读取一次，请妥善保管。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaCreateKeypairRequest 请求对象
     * @return SyncInvoker<NovaCreateKeypairRequest, NovaCreateKeypairResponse>
     */
    public SyncInvoker<NovaCreateKeypairRequest, NovaCreateKeypairResponse> novaCreateKeypairInvoker(
        NovaCreateKeypairRequest request) {
        return new SyncInvoker<NovaCreateKeypairRequest, NovaCreateKeypairResponse>(request, EcsMeta.novaCreateKeypair,
            hcClient);
    }

    /**
     * 创建云服务器
     *
     * 创建一台弹性云服务器。
     * 
     * 弹性云服务器创建完成后，如需开启自动恢复功能，可以调用配置云服务器自动恢复的接口，具体使用请参见管理云服务器自动恢复动作。
     * 
     * 该接口在云服务器创建失败后不支持自动回滚。若需要自动回滚能力，可以调用POST /v1/{project_id}/cloudservers接口，具体使用请参见创建云服务器（按需）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaCreateServersRequest 请求对象
     * @return NovaCreateServersResponse
     */
    public NovaCreateServersResponse novaCreateServers(NovaCreateServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaCreateServers);
    }

    /**
     * 创建云服务器
     *
     * 创建一台弹性云服务器。
     * 
     * 弹性云服务器创建完成后，如需开启自动恢复功能，可以调用配置云服务器自动恢复的接口，具体使用请参见管理云服务器自动恢复动作。
     * 
     * 该接口在云服务器创建失败后不支持自动回滚。若需要自动回滚能力，可以调用POST /v1/{project_id}/cloudservers接口，具体使用请参见创建云服务器（按需）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaCreateServersRequest 请求对象
     * @return SyncInvoker<NovaCreateServersRequest, NovaCreateServersResponse>
     */
    public SyncInvoker<NovaCreateServersRequest, NovaCreateServersResponse> novaCreateServersInvoker(
        NovaCreateServersRequest request) {
        return new SyncInvoker<NovaCreateServersRequest, NovaCreateServersResponse>(request, EcsMeta.novaCreateServers,
            hcClient);
    }

    /**
     * 删除SSH密钥
     *
     * 根据SSH密钥的名称，删除指定SSH密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaDeleteKeypairRequest 请求对象
     * @return NovaDeleteKeypairResponse
     */
    public NovaDeleteKeypairResponse novaDeleteKeypair(NovaDeleteKeypairRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaDeleteKeypair);
    }

    /**
     * 删除SSH密钥
     *
     * 根据SSH密钥的名称，删除指定SSH密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaDeleteKeypairRequest 请求对象
     * @return SyncInvoker<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse>
     */
    public SyncInvoker<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse> novaDeleteKeypairInvoker(
        NovaDeleteKeypairRequest request) {
        return new SyncInvoker<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse>(request, EcsMeta.novaDeleteKeypair,
            hcClient);
    }

    /**
     * 删除云服务器
     *
     * 删除一台云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaDeleteServerRequest 请求对象
     * @return NovaDeleteServerResponse
     */
    public NovaDeleteServerResponse novaDeleteServer(NovaDeleteServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaDeleteServer);
    }

    /**
     * 删除云服务器
     *
     * 删除一台云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaDeleteServerRequest 请求对象
     * @return SyncInvoker<NovaDeleteServerRequest, NovaDeleteServerResponse>
     */
    public SyncInvoker<NovaDeleteServerRequest, NovaDeleteServerResponse> novaDeleteServerInvoker(
        NovaDeleteServerRequest request) {
        return new SyncInvoker<NovaDeleteServerRequest, NovaDeleteServerResponse>(request, EcsMeta.novaDeleteServer,
            hcClient);
    }

    /**
     * 移除安全组
     *
     * 移除弹性云服务器中的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaDisassociateSecurityGroupRequest 请求对象
     * @return NovaDisassociateSecurityGroupResponse
     */
    public NovaDisassociateSecurityGroupResponse novaDisassociateSecurityGroup(
        NovaDisassociateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaDisassociateSecurityGroup);
    }

    /**
     * 移除安全组
     *
     * 移除弹性云服务器中的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaDisassociateSecurityGroupRequest 请求对象
     * @return SyncInvoker<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse>
     */
    public SyncInvoker<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse> novaDisassociateSecurityGroupInvoker(
        NovaDisassociateSecurityGroupRequest request) {
        return new SyncInvoker<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse>(request,
            EcsMeta.novaDisassociateSecurityGroup, hcClient);
    }

    /**
     * 查询可用区列表
     *
     * 查询可用域列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaListAvailabilityZonesRequest 请求对象
     * @return NovaListAvailabilityZonesResponse
     */
    public NovaListAvailabilityZonesResponse novaListAvailabilityZones(NovaListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaListAvailabilityZones);
    }

    /**
     * 查询可用区列表
     *
     * 查询可用域列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaListAvailabilityZonesRequest 请求对象
     * @return SyncInvoker<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse>
     */
    public SyncInvoker<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse> novaListAvailabilityZonesInvoker(
        NovaListAvailabilityZonesRequest request) {
        return new SyncInvoker<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse>(request,
            EcsMeta.novaListAvailabilityZones, hcClient);
    }

    /**
     * 查询SSH密钥列表
     *
     * 查询SSH密钥信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaListKeypairsRequest 请求对象
     * @return NovaListKeypairsResponse
     */
    public NovaListKeypairsResponse novaListKeypairs(NovaListKeypairsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaListKeypairs);
    }

    /**
     * 查询SSH密钥列表
     *
     * 查询SSH密钥信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaListKeypairsRequest 请求对象
     * @return SyncInvoker<NovaListKeypairsRequest, NovaListKeypairsResponse>
     */
    public SyncInvoker<NovaListKeypairsRequest, NovaListKeypairsResponse> novaListKeypairsInvoker(
        NovaListKeypairsRequest request) {
        return new SyncInvoker<NovaListKeypairsRequest, NovaListKeypairsResponse>(request, EcsMeta.novaListKeypairs,
            hcClient);
    }

    /**
     * 查询指定云服务器安全组列表
     *
     * 查询指定弹性云服务器的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaListServerSecurityGroupsRequest 请求对象
     * @return NovaListServerSecurityGroupsResponse
     */
    public NovaListServerSecurityGroupsResponse novaListServerSecurityGroups(
        NovaListServerSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaListServerSecurityGroups);
    }

    /**
     * 查询指定云服务器安全组列表
     *
     * 查询指定弹性云服务器的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaListServerSecurityGroupsRequest 请求对象
     * @return SyncInvoker<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse>
     */
    public SyncInvoker<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse> novaListServerSecurityGroupsInvoker(
        NovaListServerSecurityGroupsRequest request) {
        return new SyncInvoker<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse>(request,
            EcsMeta.novaListServerSecurityGroups, hcClient);
    }

    /**
     * 查询云服务器详情列表
     *
     * 查询云服务器详情信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaListServersDetailsRequest 请求对象
     * @return NovaListServersDetailsResponse
     */
    public NovaListServersDetailsResponse novaListServersDetails(NovaListServersDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaListServersDetails);
    }

    /**
     * 查询云服务器详情列表
     *
     * 查询云服务器详情信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaListServersDetailsRequest 请求对象
     * @return SyncInvoker<NovaListServersDetailsRequest, NovaListServersDetailsResponse>
     */
    public SyncInvoker<NovaListServersDetailsRequest, NovaListServersDetailsResponse> novaListServersDetailsInvoker(
        NovaListServersDetailsRequest request) {
        return new SyncInvoker<NovaListServersDetailsRequest, NovaListServersDetailsResponse>(request,
            EcsMeta.novaListServersDetails, hcClient);
    }

    /**
     * 查询SSH密钥详情
     *
     * 根据SSH密钥名称查询指定SSH密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaShowKeypairRequest 请求对象
     * @return NovaShowKeypairResponse
     */
    public NovaShowKeypairResponse novaShowKeypair(NovaShowKeypairRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaShowKeypair);
    }

    /**
     * 查询SSH密钥详情
     *
     * 根据SSH密钥名称查询指定SSH密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaShowKeypairRequest 请求对象
     * @return SyncInvoker<NovaShowKeypairRequest, NovaShowKeypairResponse>
     */
    public SyncInvoker<NovaShowKeypairRequest, NovaShowKeypairResponse> novaShowKeypairInvoker(
        NovaShowKeypairRequest request) {
        return new SyncInvoker<NovaShowKeypairRequest, NovaShowKeypairResponse>(request, EcsMeta.novaShowKeypair,
            hcClient);
    }

    /**
     * 查询云服务器详情
     *
     * 根据云服务器ID，查询云服务器的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaShowServerRequest 请求对象
     * @return NovaShowServerResponse
     */
    public NovaShowServerResponse novaShowServer(NovaShowServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaShowServer);
    }

    /**
     * 查询云服务器详情
     *
     * 根据云服务器ID，查询云服务器的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaShowServerRequest 请求对象
     * @return SyncInvoker<NovaShowServerRequest, NovaShowServerResponse>
     */
    public SyncInvoker<NovaShowServerRequest, NovaShowServerResponse> novaShowServerInvoker(
        NovaShowServerRequest request) {
        return new SyncInvoker<NovaShowServerRequest, NovaShowServerResponse>(request, EcsMeta.novaShowServer,
            hcClient);
    }

    /**
     * 管理云服务器自动恢复动作
     *
     * 配置、删除云服务器自动恢复动作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterServerAutoRecoveryRequest 请求对象
     * @return RegisterServerAutoRecoveryResponse
     */
    public RegisterServerAutoRecoveryResponse registerServerAutoRecovery(RegisterServerAutoRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.registerServerAutoRecovery);
    }

    /**
     * 管理云服务器自动恢复动作
     *
     * 配置、删除云服务器自动恢复动作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterServerAutoRecoveryRequest 请求对象
     * @return SyncInvoker<RegisterServerAutoRecoveryRequest, RegisterServerAutoRecoveryResponse>
     */
    public SyncInvoker<RegisterServerAutoRecoveryRequest, RegisterServerAutoRecoveryResponse> registerServerAutoRecoveryInvoker(
        RegisterServerAutoRecoveryRequest request) {
        return new SyncInvoker<RegisterServerAutoRecoveryRequest, RegisterServerAutoRecoveryResponse>(request,
            EcsMeta.registerServerAutoRecovery, hcClient);
    }

    /**
     * 注册云服务器监控
     *
     * 将云服务器添加到监控表中。
     * 
     * 注册到监控表中的云服务会被ceilometer周期性采集监控数据，包括平台的版本、cpu信息、内存、网卡、磁盘、硬件平台等信息，这些数据上报给云监控。例如SAP云服务器内部的插件会周期性从云监控中查询监控数据，以报表形式呈现给SAP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterServerMonitorRequest 请求对象
     * @return RegisterServerMonitorResponse
     */
    public RegisterServerMonitorResponse registerServerMonitor(RegisterServerMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.registerServerMonitor);
    }

    /**
     * 注册云服务器监控
     *
     * 将云服务器添加到监控表中。
     * 
     * 注册到监控表中的云服务会被ceilometer周期性采集监控数据，包括平台的版本、cpu信息、内存、网卡、磁盘、硬件平台等信息，这些数据上报给云监控。例如SAP云服务器内部的插件会周期性从云监控中查询监控数据，以报表形式呈现给SAP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterServerMonitorRequest 请求对象
     * @return SyncInvoker<RegisterServerMonitorRequest, RegisterServerMonitorResponse>
     */
    public SyncInvoker<RegisterServerMonitorRequest, RegisterServerMonitorResponse> registerServerMonitorInvoker(
        RegisterServerMonitorRequest request) {
        return new SyncInvoker<RegisterServerMonitorRequest, RegisterServerMonitorResponse>(request,
            EcsMeta.registerServerMonitor, hcClient);
    }

    /**
     * 重装弹性云服务器操作系统(安装Cloud-init)
     *
     * 重装弹性云服务器的操作系统。支持弹性云服务器数据盘不变的情况下，使用原镜像重装系统盘。
     * 
     * 调用该接口后，系统将卸载系统盘，然后使用原镜像重新创建系统盘，并挂载至弹性云服务器，实现重装操作系统功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReinstallServerWithCloudInitRequest 请求对象
     * @return ReinstallServerWithCloudInitResponse
     */
    public ReinstallServerWithCloudInitResponse reinstallServerWithCloudInit(
        ReinstallServerWithCloudInitRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.reinstallServerWithCloudInit);
    }

    /**
     * 重装弹性云服务器操作系统(安装Cloud-init)
     *
     * 重装弹性云服务器的操作系统。支持弹性云服务器数据盘不变的情况下，使用原镜像重装系统盘。
     * 
     * 调用该接口后，系统将卸载系统盘，然后使用原镜像重新创建系统盘，并挂载至弹性云服务器，实现重装操作系统功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReinstallServerWithCloudInitRequest 请求对象
     * @return SyncInvoker<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse>
     */
    public SyncInvoker<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse> reinstallServerWithCloudInitInvoker(
        ReinstallServerWithCloudInitRequest request) {
        return new SyncInvoker<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse>(request,
            EcsMeta.reinstallServerWithCloudInit, hcClient);
    }

    /**
     * 重装弹性云服务器操作系统(未安装Cloud init)
     *
     * 重装弹性云服务器的操作系统。
     * 
     * 该接口支持未安装Cloud-init或Cloudbase-init的镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReinstallServerWithoutCloudInitRequest 请求对象
     * @return ReinstallServerWithoutCloudInitResponse
     */
    public ReinstallServerWithoutCloudInitResponse reinstallServerWithoutCloudInit(
        ReinstallServerWithoutCloudInitRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.reinstallServerWithoutCloudInit);
    }

    /**
     * 重装弹性云服务器操作系统(未安装Cloud init)
     *
     * 重装弹性云服务器的操作系统。
     * 
     * 该接口支持未安装Cloud-init或Cloudbase-init的镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReinstallServerWithoutCloudInitRequest 请求对象
     * @return SyncInvoker<ReinstallServerWithoutCloudInitRequest, ReinstallServerWithoutCloudInitResponse>
     */
    public SyncInvoker<ReinstallServerWithoutCloudInitRequest, ReinstallServerWithoutCloudInitResponse> reinstallServerWithoutCloudInitInvoker(
        ReinstallServerWithoutCloudInitRequest request) {
        return new SyncInvoker<ReinstallServerWithoutCloudInitRequest, ReinstallServerWithoutCloudInitResponse>(request,
            EcsMeta.reinstallServerWithoutCloudInit, hcClient);
    }

    /**
     * 一键重置弹性云服务器密码(企业项目)
     *
     * 重置弹性云服务器管理帐号（root用户或Administrator用户）的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetServerPasswordRequest 请求对象
     * @return ResetServerPasswordResponse
     */
    public ResetServerPasswordResponse resetServerPassword(ResetServerPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.resetServerPassword);
    }

    /**
     * 一键重置弹性云服务器密码(企业项目)
     *
     * 重置弹性云服务器管理帐号（root用户或Administrator用户）的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetServerPasswordRequest 请求对象
     * @return SyncInvoker<ResetServerPasswordRequest, ResetServerPasswordResponse>
     */
    public SyncInvoker<ResetServerPasswordRequest, ResetServerPasswordResponse> resetServerPasswordInvoker(
        ResetServerPasswordRequest request) {
        return new SyncInvoker<ResetServerPasswordRequest, ResetServerPasswordResponse>(request,
            EcsMeta.resetServerPassword, hcClient);
    }

    /**
     * 变更云服务器规格(按需)
     *
     * 当您创建的弹性云服务器规格无法满足业务需要时，可以变更云服务器规格，升级vCPU、内存。具体接口的使用，请参见本节内容。
     * 
     * 变更规格时，部分规格的云服务器之间不能互相变更。
     * 
     * 您可以通过接口“/v1/{project_id}/cloudservers/resize_flavors?{instance_uuid,source_flavor_id,source_flavor_name}”查询支持列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizePostPaidServerRequest 请求对象
     * @return ResizePostPaidServerResponse
     */
    public ResizePostPaidServerResponse resizePostPaidServer(ResizePostPaidServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.resizePostPaidServer);
    }

    /**
     * 变更云服务器规格(按需)
     *
     * 当您创建的弹性云服务器规格无法满足业务需要时，可以变更云服务器规格，升级vCPU、内存。具体接口的使用，请参见本节内容。
     * 
     * 变更规格时，部分规格的云服务器之间不能互相变更。
     * 
     * 您可以通过接口“/v1/{project_id}/cloudservers/resize_flavors?{instance_uuid,source_flavor_id,source_flavor_name}”查询支持列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizePostPaidServerRequest 请求对象
     * @return SyncInvoker<ResizePostPaidServerRequest, ResizePostPaidServerResponse>
     */
    public SyncInvoker<ResizePostPaidServerRequest, ResizePostPaidServerResponse> resizePostPaidServerInvoker(
        ResizePostPaidServerRequest request) {
        return new SyncInvoker<ResizePostPaidServerRequest, ResizePostPaidServerResponse>(request,
            EcsMeta.resizePostPaidServer, hcClient);
    }

    /**
     * 变更云服务器规格
     *
     * 变更云服务器规格。
     * 
     * v1.1版本：指该接口兼容v1接口的功能，同时合入新功能，支持变更包年/包月弹性云服务器的规格。
     * 
     * 注意事项：
     * 
     * - 该接口可以使用合作伙伴自身的AK/SK或者token调用，也可以用合作伙伴子客户的AK/SK或者token来调用。
     * - 如果使用AK/SK认证方式，示例代码中region请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)中“弹性云服务 ECS”下“区域”的内容，，serviceName（英文服务名称缩写）请指定为ECS。
     * - Endpoint请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)中“弹性云服务 ECS”下“终端节点（Endpoint）”的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeServerRequest 请求对象
     * @return ResizeServerResponse
     */
    public ResizeServerResponse resizeServer(ResizeServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.resizeServer);
    }

    /**
     * 变更云服务器规格
     *
     * 变更云服务器规格。
     * 
     * v1.1版本：指该接口兼容v1接口的功能，同时合入新功能，支持变更包年/包月弹性云服务器的规格。
     * 
     * 注意事项：
     * 
     * - 该接口可以使用合作伙伴自身的AK/SK或者token调用，也可以用合作伙伴子客户的AK/SK或者token来调用。
     * - 如果使用AK/SK认证方式，示例代码中region请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)中“弹性云服务 ECS”下“区域”的内容，，serviceName（英文服务名称缩写）请指定为ECS。
     * - Endpoint请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)中“弹性云服务 ECS”下“终端节点（Endpoint）”的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeServerRequest 请求对象
     * @return SyncInvoker<ResizeServerRequest, ResizeServerResponse>
     */
    public SyncInvoker<ResizeServerRequest, ResizeServerResponse> resizeServerInvoker(ResizeServerRequest request) {
        return new SyncInvoker<ResizeServerRequest, ResizeServerResponse>(request, EcsMeta.resizeServer, hcClient);
    }

    /**
     * 查询是否支持一键重置密码
     *
     * 查询弹性云服务器是否支持一键重置密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResetPasswordFlagRequest 请求对象
     * @return ShowResetPasswordFlagResponse
     */
    public ShowResetPasswordFlagResponse showResetPasswordFlag(ShowResetPasswordFlagRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showResetPasswordFlag);
    }

    /**
     * 查询是否支持一键重置密码
     *
     * 查询弹性云服务器是否支持一键重置密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResetPasswordFlagRequest 请求对象
     * @return SyncInvoker<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse>
     */
    public SyncInvoker<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse> showResetPasswordFlagInvoker(
        ShowResetPasswordFlagRequest request) {
        return new SyncInvoker<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse>(request,
            EcsMeta.showResetPasswordFlag, hcClient);
    }

    /**
     * 查询云服务器详情
     *
     * 查询弹性云服务器的详细信息。
     * 
     * 该接口支持查询弹性云服务器的计费方式，以及是否被冻结。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerRequest 请求对象
     * @return ShowServerResponse
     */
    public ShowServerResponse showServer(ShowServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServer);
    }

    /**
     * 查询云服务器详情
     *
     * 查询弹性云服务器的详细信息。
     * 
     * 该接口支持查询弹性云服务器的计费方式，以及是否被冻结。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerRequest 请求对象
     * @return SyncInvoker<ShowServerRequest, ShowServerResponse>
     */
    public SyncInvoker<ShowServerRequest, ShowServerResponse> showServerInvoker(ShowServerRequest request) {
        return new SyncInvoker<ShowServerRequest, ShowServerResponse>(request, EcsMeta.showServer, hcClient);
    }

    /**
     * 查询云服务器是否配置了自动恢复动作
     *
     * 查询云服务器是否配置了自动恢复动作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerAutoRecoveryRequest 请求对象
     * @return ShowServerAutoRecoveryResponse
     */
    public ShowServerAutoRecoveryResponse showServerAutoRecovery(ShowServerAutoRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServerAutoRecovery);
    }

    /**
     * 查询云服务器是否配置了自动恢复动作
     *
     * 查询云服务器是否配置了自动恢复动作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerAutoRecoveryRequest 请求对象
     * @return SyncInvoker<ShowServerAutoRecoveryRequest, ShowServerAutoRecoveryResponse>
     */
    public SyncInvoker<ShowServerAutoRecoveryRequest, ShowServerAutoRecoveryResponse> showServerAutoRecoveryInvoker(
        ShowServerAutoRecoveryRequest request) {
        return new SyncInvoker<ShowServerAutoRecoveryRequest, ShowServerAutoRecoveryResponse>(request,
            EcsMeta.showServerAutoRecovery, hcClient);
    }

    /**
     * 查询弹性云服务器单个磁盘信息
     *
     * 查询弹性云服务器挂载的单个磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerBlockDeviceRequest 请求对象
     * @return ShowServerBlockDeviceResponse
     */
    public ShowServerBlockDeviceResponse showServerBlockDevice(ShowServerBlockDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServerBlockDevice);
    }

    /**
     * 查询弹性云服务器单个磁盘信息
     *
     * 查询弹性云服务器挂载的单个磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerBlockDeviceRequest 请求对象
     * @return SyncInvoker<ShowServerBlockDeviceRequest, ShowServerBlockDeviceResponse>
     */
    public SyncInvoker<ShowServerBlockDeviceRequest, ShowServerBlockDeviceResponse> showServerBlockDeviceInvoker(
        ShowServerBlockDeviceRequest request) {
        return new SyncInvoker<ShowServerBlockDeviceRequest, ShowServerBlockDeviceResponse>(request,
            EcsMeta.showServerBlockDevice, hcClient);
    }

    /**
     * 查询云服务器组详情
     *
     * 查询弹性云服务器组详情。
     * 
     * 与原生的创建云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerGroupRequest 请求对象
     * @return ShowServerGroupResponse
     */
    public ShowServerGroupResponse showServerGroup(ShowServerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServerGroup);
    }

    /**
     * 查询云服务器组详情
     *
     * 查询弹性云服务器组详情。
     * 
     * 与原生的创建云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerGroupRequest 请求对象
     * @return SyncInvoker<ShowServerGroupRequest, ShowServerGroupResponse>
     */
    public SyncInvoker<ShowServerGroupRequest, ShowServerGroupResponse> showServerGroupInvoker(
        ShowServerGroupRequest request) {
        return new SyncInvoker<ShowServerGroupRequest, ShowServerGroupResponse>(request, EcsMeta.showServerGroup,
            hcClient);
    }

    /**
     * 查询租户配额
     *
     * 查询租户配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerLimitsRequest 请求对象
     * @return ShowServerLimitsResponse
     */
    public ShowServerLimitsResponse showServerLimits(ShowServerLimitsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServerLimits);
    }

    /**
     * 查询租户配额
     *
     * 查询租户配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerLimitsRequest 请求对象
     * @return SyncInvoker<ShowServerLimitsRequest, ShowServerLimitsResponse>
     */
    public SyncInvoker<ShowServerLimitsRequest, ShowServerLimitsResponse> showServerLimitsInvoker(
        ShowServerLimitsRequest request) {
        return new SyncInvoker<ShowServerLimitsRequest, ShowServerLimitsResponse>(request, EcsMeta.showServerLimits,
            hcClient);
    }

    /**
     * 云服务器获取密码(企业项目)
     *
     * 当通过支持Cloudbase-init功能的镜像创建Windows云服务器时，获取云服务器初始安装时系统生成的管理员帐户（Administrator帐户或Cloudbase-init设置的帐户）随机密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerPasswordRequest 请求对象
     * @return ShowServerPasswordResponse
     */
    public ShowServerPasswordResponse showServerPassword(ShowServerPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServerPassword);
    }

    /**
     * 云服务器获取密码(企业项目)
     *
     * 当通过支持Cloudbase-init功能的镜像创建Windows云服务器时，获取云服务器初始安装时系统生成的管理员帐户（Administrator帐户或Cloudbase-init设置的帐户）随机密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerPasswordRequest 请求对象
     * @return SyncInvoker<ShowServerPasswordRequest, ShowServerPasswordResponse>
     */
    public SyncInvoker<ShowServerPasswordRequest, ShowServerPasswordResponse> showServerPasswordInvoker(
        ShowServerPasswordRequest request) {
        return new SyncInvoker<ShowServerPasswordRequest, ShowServerPasswordResponse>(request,
            EcsMeta.showServerPassword, hcClient);
    }

    /**
     * 获取VNC远程登录地址
     *
     * 获取弹性云服务器VNC远程登录地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerRemoteConsoleRequest 请求对象
     * @return ShowServerRemoteConsoleResponse
     */
    public ShowServerRemoteConsoleResponse showServerRemoteConsole(ShowServerRemoteConsoleRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServerRemoteConsole);
    }

    /**
     * 获取VNC远程登录地址
     *
     * 获取弹性云服务器VNC远程登录地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerRemoteConsoleRequest 请求对象
     * @return SyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse>
     */
    public SyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse> showServerRemoteConsoleInvoker(
        ShowServerRemoteConsoleRequest request) {
        return new SyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse>(request,
            EcsMeta.showServerRemoteConsole, hcClient);
    }

    /**
     * 查询云服务器标签
     *
     * - 查询指定云服务器的标签信息。
     * 
     * - 标签管理服务TMS使用该接口查询指定云服务器的全部标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerTagsRequest 请求对象
     * @return ShowServerTagsResponse
     */
    public ShowServerTagsResponse showServerTags(ShowServerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServerTags);
    }

    /**
     * 查询云服务器标签
     *
     * - 查询指定云服务器的标签信息。
     * 
     * - 标签管理服务TMS使用该接口查询指定云服务器的全部标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerTagsRequest 请求对象
     * @return SyncInvoker<ShowServerTagsRequest, ShowServerTagsResponse>
     */
    public SyncInvoker<ShowServerTagsRequest, ShowServerTagsResponse> showServerTagsInvoker(
        ShowServerTagsRequest request) {
        return new SyncInvoker<ShowServerTagsRequest, ShowServerTagsResponse>(request, EcsMeta.showServerTags,
            hcClient);
    }

    /**
     * 修改云服务器
     *
     * 修改云服务器信息，目前支持修改云服务器名称及描述和hostname。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerRequest 请求对象
     * @return UpdateServerResponse
     */
    public UpdateServerResponse updateServer(UpdateServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.updateServer);
    }

    /**
     * 修改云服务器
     *
     * 修改云服务器信息，目前支持修改云服务器名称及描述和hostname。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerRequest 请求对象
     * @return SyncInvoker<UpdateServerRequest, UpdateServerResponse>
     */
    public SyncInvoker<UpdateServerRequest, UpdateServerResponse> updateServerInvoker(UpdateServerRequest request) {
        return new SyncInvoker<UpdateServerRequest, UpdateServerResponse>(request, EcsMeta.updateServer, hcClient);
    }

    /**
     * 修改云服务器销毁时间
     *
     * 修改按需服务器，设置定时销毁时间。如果设置的销毁时间为空，表示取消销毁时间。
     * 
     * 该接口支持企业项目细粒度权限的校验，具体细粒度请参见 ecs:cloudServers:put。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerAutoTerminateTimeRequest 请求对象
     * @return UpdateServerAutoTerminateTimeResponse
     */
    public UpdateServerAutoTerminateTimeResponse updateServerAutoTerminateTime(
        UpdateServerAutoTerminateTimeRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.updateServerAutoTerminateTime);
    }

    /**
     * 修改云服务器销毁时间
     *
     * 修改按需服务器，设置定时销毁时间。如果设置的销毁时间为空，表示取消销毁时间。
     * 
     * 该接口支持企业项目细粒度权限的校验，具体细粒度请参见 ecs:cloudServers:put。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerAutoTerminateTimeRequest 请求对象
     * @return SyncInvoker<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse>
     */
    public SyncInvoker<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse> updateServerAutoTerminateTimeInvoker(
        UpdateServerAutoTerminateTimeRequest request) {
        return new SyncInvoker<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse>(request,
            EcsMeta.updateServerAutoTerminateTime, hcClient);
    }

    /**
     * 修改云服务器挂载的单个磁盘信息
     *
     * 修改云服务器云主机挂载的单个磁盘信息。&#39;当前仅支持修改delete_on_termination字段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerBlockDeviceRequest 请求对象
     * @return UpdateServerBlockDeviceResponse
     */
    public UpdateServerBlockDeviceResponse updateServerBlockDevice(UpdateServerBlockDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.updateServerBlockDevice);
    }

    /**
     * 修改云服务器挂载的单个磁盘信息
     *
     * 修改云服务器云主机挂载的单个磁盘信息。&#39;当前仅支持修改delete_on_termination字段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerBlockDeviceRequest 请求对象
     * @return SyncInvoker<UpdateServerBlockDeviceRequest, UpdateServerBlockDeviceResponse>
     */
    public SyncInvoker<UpdateServerBlockDeviceRequest, UpdateServerBlockDeviceResponse> updateServerBlockDeviceInvoker(
        UpdateServerBlockDeviceRequest request) {
        return new SyncInvoker<UpdateServerBlockDeviceRequest, UpdateServerBlockDeviceResponse>(request,
            EcsMeta.updateServerBlockDevice, hcClient);
    }

    /**
     * 更新云服务器元数据
     *
     * 更新云服务器元数据。
     * 
     * - 如果元数据中没有待更新字段，则自动添加该字段。
     * 
     * - 如果元数据中已存在待更新字段，则直接更新字段值。
     * 
     * - 如果元数据中的字段不再请求参数中，则保持不变
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerMetadataRequest 请求对象
     * @return UpdateServerMetadataResponse
     */
    public UpdateServerMetadataResponse updateServerMetadata(UpdateServerMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.updateServerMetadata);
    }

    /**
     * 更新云服务器元数据
     *
     * 更新云服务器元数据。
     * 
     * - 如果元数据中没有待更新字段，则自动添加该字段。
     * 
     * - 如果元数据中已存在待更新字段，则直接更新字段值。
     * 
     * - 如果元数据中的字段不再请求参数中，则保持不变
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerMetadataRequest 请求对象
     * @return SyncInvoker<UpdateServerMetadataRequest, UpdateServerMetadataResponse>
     */
    public SyncInvoker<UpdateServerMetadataRequest, UpdateServerMetadataResponse> updateServerMetadataInvoker(
        UpdateServerMetadataRequest request) {
        return new SyncInvoker<UpdateServerMetadataRequest, UpdateServerMetadataResponse>(request,
            EcsMeta.updateServerMetadata, hcClient);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询Job的执行状态。
     * 
     * 对于创建云服务器、删除云服务器、云服务器批量操作和网卡操作等异步API，命令下发后，会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showJob);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询Job的执行状态。
     * 
     * 对于创建云服务器、删除云服务器、云服务器批量操作和网卡操作等异步API，命令下发后，会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<ShowJobRequest, ShowJobResponse>(request, EcsMeta.showJob, hcClient);
    }

}
