package com.huaweicloud.sdk.iotda.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.iotda.v5.model.*;

public class IoTDAClient {

    protected HcClient hcClient;

    public IoTDAClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IoTDAClient> newBuilder() {
        return new ClientBuilder<>(IoTDAClient::new, "BasicCredentials,IoTDACredentials")
            .withDerivedAuthServiceName("iotdm");
    }

    /**
     * 生成接入凭证
     *
     * 接入凭证是用于客户端使用AMQP等协议与平台建链的一个认证凭据。只保留一条记录，如果重复调用只会重置接入凭证，使得之前的失效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAccessCodeRequest 请求对象
     * @return CreateAccessCodeResponse
     */
    public CreateAccessCodeResponse createAccessCode(CreateAccessCodeRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createAccessCode);
    }

    /**
     * 生成接入凭证
     *
     * 接入凭证是用于客户端使用AMQP等协议与平台建链的一个认证凭据。只保留一条记录，如果重复调用只会重置接入凭证，使得之前的失效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAccessCodeRequest 请求对象
     * @return SyncInvoker<CreateAccessCodeRequest, CreateAccessCodeResponse>
     */
    public SyncInvoker<CreateAccessCodeRequest, CreateAccessCodeResponse> createAccessCodeInvoker(
        CreateAccessCodeRequest request) {
        return new SyncInvoker<CreateAccessCodeRequest, CreateAccessCodeResponse>(request, IoTDAMeta.createAccessCode,
            hcClient);
    }

    /**
     * 创建AMQP队列
     *
     * 应用服务器可调用此接口在物联网平台创建一个AMQP队列。每个租户只能创建100个队列，若超过规格，则创建失败，若队列名称与已有的队列名称相同，则创建失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddQueueRequest 请求对象
     * @return AddQueueResponse
     */
    public AddQueueResponse addQueue(AddQueueRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.addQueue);
    }

    /**
     * 创建AMQP队列
     *
     * 应用服务器可调用此接口在物联网平台创建一个AMQP队列。每个租户只能创建100个队列，若超过规格，则创建失败，若队列名称与已有的队列名称相同，则创建失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddQueueRequest 请求对象
     * @return SyncInvoker<AddQueueRequest, AddQueueResponse>
     */
    public SyncInvoker<AddQueueRequest, AddQueueResponse> addQueueInvoker(AddQueueRequest request) {
        return new SyncInvoker<AddQueueRequest, AddQueueResponse>(request, IoTDAMeta.addQueue, hcClient);
    }

    /**
     * 查询AMQP列表
     *
     * 应用服务器可调用此接口查询物联网平台中的AMQP队列信息列表。可通过队列名称作模糊查询，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowQueueRequest 请求对象
     * @return BatchShowQueueResponse
     */
    public BatchShowQueueResponse batchShowQueue(BatchShowQueueRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.batchShowQueue);
    }

    /**
     * 查询AMQP列表
     *
     * 应用服务器可调用此接口查询物联网平台中的AMQP队列信息列表。可通过队列名称作模糊查询，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowQueueRequest 请求对象
     * @return SyncInvoker<BatchShowQueueRequest, BatchShowQueueResponse>
     */
    public SyncInvoker<BatchShowQueueRequest, BatchShowQueueResponse> batchShowQueueInvoker(
        BatchShowQueueRequest request) {
        return new SyncInvoker<BatchShowQueueRequest, BatchShowQueueResponse>(request, IoTDAMeta.batchShowQueue,
            hcClient);
    }

    /**
     * 删除AMQP队列
     *
     * 应用服务器可调用此接口在物联网平台上删除指定AMQP队列。若当前队列正在使用，则会删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteQueueRequest 请求对象
     * @return DeleteQueueResponse
     */
    public DeleteQueueResponse deleteQueue(DeleteQueueRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteQueue);
    }

    /**
     * 删除AMQP队列
     *
     * 应用服务器可调用此接口在物联网平台上删除指定AMQP队列。若当前队列正在使用，则会删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteQueueRequest 请求对象
     * @return SyncInvoker<DeleteQueueRequest, DeleteQueueResponse>
     */
    public SyncInvoker<DeleteQueueRequest, DeleteQueueResponse> deleteQueueInvoker(DeleteQueueRequest request) {
        return new SyncInvoker<DeleteQueueRequest, DeleteQueueResponse>(request, IoTDAMeta.deleteQueue, hcClient);
    }

    /**
     * 查询单个AMQP队列
     *
     * 应用服务器可调用此接口查询物联网平台中指定队列的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQueueRequest 请求对象
     * @return ShowQueueResponse
     */
    public ShowQueueResponse showQueue(ShowQueueRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showQueue);
    }

    /**
     * 查询单个AMQP队列
     *
     * 应用服务器可调用此接口查询物联网平台中指定队列的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQueueRequest 请求对象
     * @return SyncInvoker<ShowQueueRequest, ShowQueueResponse>
     */
    public SyncInvoker<ShowQueueRequest, ShowQueueResponse> showQueueInvoker(ShowQueueRequest request) {
        return new SyncInvoker<ShowQueueRequest, ShowQueueResponse>(request, IoTDAMeta.showQueue, hcClient);
    }

    /**
     * 创建资源空间
     *
     * 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口创建资源空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddApplicationRequest 请求对象
     * @return AddApplicationResponse
     */
    public AddApplicationResponse addApplication(AddApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.addApplication);
    }

    /**
     * 创建资源空间
     *
     * 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口创建资源空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddApplicationRequest 请求对象
     * @return SyncInvoker<AddApplicationRequest, AddApplicationResponse>
     */
    public SyncInvoker<AddApplicationRequest, AddApplicationResponse> addApplicationInvoker(
        AddApplicationRequest request) {
        return new SyncInvoker<AddApplicationRequest, AddApplicationResponse>(request, IoTDAMeta.addApplication,
            hcClient);
    }

    /**
     * 删除资源空间
     *
     * 删除指定资源空间。删除资源空间属于高危操作，删除资源空间后，该空间下的产品、设备等资源将不可用，请谨慎操作！
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApplicationRequest 请求对象
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteApplication);
    }

    /**
     * 删除资源空间
     *
     * 删除指定资源空间。删除资源空间属于高危操作，删除资源空间后，该空间下的产品、设备等资源将不可用，请谨慎操作！
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApplicationRequest 请求对象
     * @return SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationInvoker(
        DeleteApplicationRequest request) {
        return new SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>(request,
            IoTDAMeta.deleteApplication, hcClient);
    }

    /**
     * 查询资源空间
     *
     * 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口查询指定资源空间详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicationRequest 请求对象
     * @return ShowApplicationResponse
     */
    public ShowApplicationResponse showApplication(ShowApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showApplication);
    }

    /**
     * 查询资源空间
     *
     * 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口查询指定资源空间详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicationRequest 请求对象
     * @return SyncInvoker<ShowApplicationRequest, ShowApplicationResponse>
     */
    public SyncInvoker<ShowApplicationRequest, ShowApplicationResponse> showApplicationInvoker(
        ShowApplicationRequest request) {
        return new SyncInvoker<ShowApplicationRequest, ShowApplicationResponse>(request, IoTDAMeta.showApplication,
            hcClient);
    }

    /**
     * 查询资源空间列表
     *
     * 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口查询资源空间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicationsRequest 请求对象
     * @return ShowApplicationsResponse
     */
    public ShowApplicationsResponse showApplications(ShowApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showApplications);
    }

    /**
     * 查询资源空间列表
     *
     * 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口查询资源空间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicationsRequest 请求对象
     * @return SyncInvoker<ShowApplicationsRequest, ShowApplicationsResponse>
     */
    public SyncInvoker<ShowApplicationsRequest, ShowApplicationsResponse> showApplicationsInvoker(
        ShowApplicationsRequest request) {
        return new SyncInvoker<ShowApplicationsRequest, ShowApplicationsResponse>(request, IoTDAMeta.showApplications,
            hcClient);
    }

    /**
     * 下发异步设备命令
     *
     * 设备的产品模型中定义了物联网平台可向设备下发的命令，应用服务器可调用此接口向指定设备下发异步命令，以实现对设备的控制。平台负责将命令发送给设备，并将设备执行命令结果异步通知应用服务器。 命令执行结果支持灵活的数据流转，应用服务器通过调用物联网平台的创建规则触发条件（Resource:device.command.status，Event:update）、创建规则动作并激活规则后，当命令状态变更时，物联网平台会根据规则将结果发送到规则指定的服务器，如用户自定义的HTTP服务器，AMQP服务器，以及华为云的其他储存服务器等, 详情参考[[设备命令状态变更通知](https://support.huaweicloud.com/api-iothub/iot_06_v5_01212.html)](tag:hws)[[设备命令状态变更通知](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_01212.html)](tag:hws_hk)。
     * 注意：
     * - 此接口适用于NB设备异步命令下发，暂不支持其他协议类型设备命令下发。
     * - 此接口仅支持单个设备异步命令下发，如需多个设备异步命令下发，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAsyncCommandRequest 请求对象
     * @return CreateAsyncCommandResponse
     */
    public CreateAsyncCommandResponse createAsyncCommand(CreateAsyncCommandRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createAsyncCommand);
    }

    /**
     * 下发异步设备命令
     *
     * 设备的产品模型中定义了物联网平台可向设备下发的命令，应用服务器可调用此接口向指定设备下发异步命令，以实现对设备的控制。平台负责将命令发送给设备，并将设备执行命令结果异步通知应用服务器。 命令执行结果支持灵活的数据流转，应用服务器通过调用物联网平台的创建规则触发条件（Resource:device.command.status，Event:update）、创建规则动作并激活规则后，当命令状态变更时，物联网平台会根据规则将结果发送到规则指定的服务器，如用户自定义的HTTP服务器，AMQP服务器，以及华为云的其他储存服务器等, 详情参考[[设备命令状态变更通知](https://support.huaweicloud.com/api-iothub/iot_06_v5_01212.html)](tag:hws)[[设备命令状态变更通知](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_01212.html)](tag:hws_hk)。
     * 注意：
     * - 此接口适用于NB设备异步命令下发，暂不支持其他协议类型设备命令下发。
     * - 此接口仅支持单个设备异步命令下发，如需多个设备异步命令下发，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAsyncCommandRequest 请求对象
     * @return SyncInvoker<CreateAsyncCommandRequest, CreateAsyncCommandResponse>
     */
    public SyncInvoker<CreateAsyncCommandRequest, CreateAsyncCommandResponse> createAsyncCommandInvoker(
        CreateAsyncCommandRequest request) {
        return new SyncInvoker<CreateAsyncCommandRequest, CreateAsyncCommandResponse>(request,
            IoTDAMeta.createAsyncCommand, hcClient);
    }

    /**
     * 查询指定id的命令
     *
     * 物联网平台可查询指定id的命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAsyncDeviceCommandRequest 请求对象
     * @return ShowAsyncDeviceCommandResponse
     */
    public ShowAsyncDeviceCommandResponse showAsyncDeviceCommand(ShowAsyncDeviceCommandRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showAsyncDeviceCommand);
    }

    /**
     * 查询指定id的命令
     *
     * 物联网平台可查询指定id的命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAsyncDeviceCommandRequest 请求对象
     * @return SyncInvoker<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse>
     */
    public SyncInvoker<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse> showAsyncDeviceCommandInvoker(
        ShowAsyncDeviceCommandRequest request) {
        return new SyncInvoker<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse>(request,
            IoTDAMeta.showAsyncDeviceCommand, hcClient);
    }

    /**
     * 创建批量任务
     *
     * 应用服务器可调用此接口为创建批量处理任务，对多个设备进行批量操作。当前支持批量软固件升级、批量创建设备、批量删除设备、批量冻结设备、批量解冻设备、批量创建命令、批量创建消息任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBatchTaskRequest 请求对象
     * @return CreateBatchTaskResponse
     */
    public CreateBatchTaskResponse createBatchTask(CreateBatchTaskRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createBatchTask);
    }

    /**
     * 创建批量任务
     *
     * 应用服务器可调用此接口为创建批量处理任务，对多个设备进行批量操作。当前支持批量软固件升级、批量创建设备、批量删除设备、批量冻结设备、批量解冻设备、批量创建命令、批量创建消息任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBatchTaskRequest 请求对象
     * @return SyncInvoker<CreateBatchTaskRequest, CreateBatchTaskResponse>
     */
    public SyncInvoker<CreateBatchTaskRequest, CreateBatchTaskResponse> createBatchTaskInvoker(
        CreateBatchTaskRequest request) {
        return new SyncInvoker<CreateBatchTaskRequest, CreateBatchTaskResponse>(request, IoTDAMeta.createBatchTask,
            hcClient);
    }

    /**
     * 查询批量任务列表
     *
     * 应用服务器可调用此接口查询物联网平台中批量任务列表，每一个任务又包括具体的任务内容、任务状态、任务完成情况统计等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBatchTasksRequest 请求对象
     * @return ListBatchTasksResponse
     */
    public ListBatchTasksResponse listBatchTasks(ListBatchTasksRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listBatchTasks);
    }

    /**
     * 查询批量任务列表
     *
     * 应用服务器可调用此接口查询物联网平台中批量任务列表，每一个任务又包括具体的任务内容、任务状态、任务完成情况统计等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBatchTasksRequest 请求对象
     * @return SyncInvoker<ListBatchTasksRequest, ListBatchTasksResponse>
     */
    public SyncInvoker<ListBatchTasksRequest, ListBatchTasksResponse> listBatchTasksInvoker(
        ListBatchTasksRequest request) {
        return new SyncInvoker<ListBatchTasksRequest, ListBatchTasksResponse>(request, IoTDAMeta.listBatchTasks,
            hcClient);
    }

    /**
     * 重试批量任务
     *
     * 应用服务器可调用此接口重试批量任务，目前只支持task_type为firmwareUpgrade，softwareUpgrade。如果task_id对应任务已经成功、停止、正在停止、等待中或初始化中，则不可以调用该接口。如果请求Body为{}，则调用该接口后会重新执行所有状态为失败、失败待重试和已停止的子任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryBatchTaskRequest 请求对象
     * @return RetryBatchTaskResponse
     */
    public RetryBatchTaskResponse retryBatchTask(RetryBatchTaskRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.retryBatchTask);
    }

    /**
     * 重试批量任务
     *
     * 应用服务器可调用此接口重试批量任务，目前只支持task_type为firmwareUpgrade，softwareUpgrade。如果task_id对应任务已经成功、停止、正在停止、等待中或初始化中，则不可以调用该接口。如果请求Body为{}，则调用该接口后会重新执行所有状态为失败、失败待重试和已停止的子任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryBatchTaskRequest 请求对象
     * @return SyncInvoker<RetryBatchTaskRequest, RetryBatchTaskResponse>
     */
    public SyncInvoker<RetryBatchTaskRequest, RetryBatchTaskResponse> retryBatchTaskInvoker(
        RetryBatchTaskRequest request) {
        return new SyncInvoker<RetryBatchTaskRequest, RetryBatchTaskResponse>(request, IoTDAMeta.retryBatchTask,
            hcClient);
    }

    /**
     * 查询批量任务
     *
     * 应用服务器可调用此接口查询物联网平台中指定批量任务的信息，包括任务内容、任务状态、任务完成情况统计以及子任务列表等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBatchTaskRequest 请求对象
     * @return ShowBatchTaskResponse
     */
    public ShowBatchTaskResponse showBatchTask(ShowBatchTaskRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showBatchTask);
    }

    /**
     * 查询批量任务
     *
     * 应用服务器可调用此接口查询物联网平台中指定批量任务的信息，包括任务内容、任务状态、任务完成情况统计以及子任务列表等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBatchTaskRequest 请求对象
     * @return SyncInvoker<ShowBatchTaskRequest, ShowBatchTaskResponse>
     */
    public SyncInvoker<ShowBatchTaskRequest, ShowBatchTaskResponse> showBatchTaskInvoker(ShowBatchTaskRequest request) {
        return new SyncInvoker<ShowBatchTaskRequest, ShowBatchTaskResponse>(request, IoTDAMeta.showBatchTask, hcClient);
    }

    /**
     * 停止批量任务
     *
     * 应用服务器可调用此接口停止批量任务，目前只支持task_type为firmwareUpgrade，softwareUpgrade。如果task_id对应任务已经完成（成功、失败、部分成功，已经停止）或正在停止中，则不可以调用该接口。如果请求Body为{}，则调用该接口后会停止所有正在执行中、等待中和失败待重试状态的子任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopBatchTaskRequest 请求对象
     * @return StopBatchTaskResponse
     */
    public StopBatchTaskResponse stopBatchTask(StopBatchTaskRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.stopBatchTask);
    }

    /**
     * 停止批量任务
     *
     * 应用服务器可调用此接口停止批量任务，目前只支持task_type为firmwareUpgrade，softwareUpgrade。如果task_id对应任务已经完成（成功、失败、部分成功，已经停止）或正在停止中，则不可以调用该接口。如果请求Body为{}，则调用该接口后会停止所有正在执行中、等待中和失败待重试状态的子任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopBatchTaskRequest 请求对象
     * @return SyncInvoker<StopBatchTaskRequest, StopBatchTaskResponse>
     */
    public SyncInvoker<StopBatchTaskRequest, StopBatchTaskResponse> stopBatchTaskInvoker(StopBatchTaskRequest request) {
        return new SyncInvoker<StopBatchTaskRequest, StopBatchTaskResponse>(request, IoTDAMeta.stopBatchTask, hcClient);
    }

    /**
     * 删除批量任务文件
     *
     * 应用服务器可调用此接口删除批量任务文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBatchTaskFileRequest 请求对象
     * @return DeleteBatchTaskFileResponse
     */
    public DeleteBatchTaskFileResponse deleteBatchTaskFile(DeleteBatchTaskFileRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteBatchTaskFile);
    }

    /**
     * 删除批量任务文件
     *
     * 应用服务器可调用此接口删除批量任务文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBatchTaskFileRequest 请求对象
     * @return SyncInvoker<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse>
     */
    public SyncInvoker<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse> deleteBatchTaskFileInvoker(
        DeleteBatchTaskFileRequest request) {
        return new SyncInvoker<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse>(request,
            IoTDAMeta.deleteBatchTaskFile, hcClient);
    }

    /**
     * 查询批量任务文件列表
     *
     * 应用服务器可调用此接口查询批量任务文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBatchTaskFilesRequest 请求对象
     * @return ListBatchTaskFilesResponse
     */
    public ListBatchTaskFilesResponse listBatchTaskFiles(ListBatchTaskFilesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listBatchTaskFiles);
    }

    /**
     * 查询批量任务文件列表
     *
     * 应用服务器可调用此接口查询批量任务文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBatchTaskFilesRequest 请求对象
     * @return SyncInvoker<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse>
     */
    public SyncInvoker<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse> listBatchTaskFilesInvoker(
        ListBatchTaskFilesRequest request) {
        return new SyncInvoker<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse>(request,
            IoTDAMeta.listBatchTaskFiles, hcClient);
    }

    /**
     * 上传批量任务文件
     *
     * 应用服务器可调用此接口上传批量任务文件，用于创建批量任务。当前支持批量创建设备任务、批量删除设备任务、批量冻结设备任务、批量解冻设备任务的文件上传。
     * - [批量注册设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchCreateDevices_Template.xlsx)
     * 
     * 
     * - [批量删除设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchDeleteDevices_Template.xlsx)
     * 
     * 
     * - [批量冻结设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchFreezeDevices_Template.xlsx)
     * 
     * 
     * - [批量解冻设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchUnfreezeDevices_Template.xlsx)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadBatchTaskFileRequest 请求对象
     * @return UploadBatchTaskFileResponse
     */
    public UploadBatchTaskFileResponse uploadBatchTaskFile(UploadBatchTaskFileRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.uploadBatchTaskFile);
    }

    /**
     * 上传批量任务文件
     *
     * 应用服务器可调用此接口上传批量任务文件，用于创建批量任务。当前支持批量创建设备任务、批量删除设备任务、批量冻结设备任务、批量解冻设备任务的文件上传。
     * - [批量注册设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchCreateDevices_Template.xlsx)
     * 
     * 
     * - [批量删除设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchDeleteDevices_Template.xlsx)
     * 
     * 
     * - [批量冻结设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchFreezeDevices_Template.xlsx)
     * 
     * 
     * - [批量解冻设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchUnfreezeDevices_Template.xlsx)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadBatchTaskFileRequest 请求对象
     * @return SyncInvoker<UploadBatchTaskFileRequest, UploadBatchTaskFileResponse>
     */
    public SyncInvoker<UploadBatchTaskFileRequest, UploadBatchTaskFileResponse> uploadBatchTaskFileInvoker(
        UploadBatchTaskFileRequest request) {
        return new SyncInvoker<UploadBatchTaskFileRequest, UploadBatchTaskFileResponse>(request,
            IoTDAMeta.uploadBatchTaskFile, hcClient);
    }

    /**
     * 下发广播消息
     *
     * 应用服务器可调用此接口向订阅了指定Topic的所有在线设备发布广播消息。应用将广播消息下发给平台后，平台会先返回应用响应结果，再将消息广播给设备。
     * 注意：
     * - 此接口只适用于使用MQTT协议接入的设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BroadcastMessageRequest 请求对象
     * @return BroadcastMessageResponse
     */
    public BroadcastMessageResponse broadcastMessage(BroadcastMessageRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.broadcastMessage);
    }

    /**
     * 下发广播消息
     *
     * 应用服务器可调用此接口向订阅了指定Topic的所有在线设备发布广播消息。应用将广播消息下发给平台后，平台会先返回应用响应结果，再将消息广播给设备。
     * 注意：
     * - 此接口只适用于使用MQTT协议接入的设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BroadcastMessageRequest 请求对象
     * @return SyncInvoker<BroadcastMessageRequest, BroadcastMessageResponse>
     */
    public SyncInvoker<BroadcastMessageRequest, BroadcastMessageResponse> broadcastMessageInvoker(
        BroadcastMessageRequest request) {
        return new SyncInvoker<BroadcastMessageRequest, BroadcastMessageResponse>(request, IoTDAMeta.broadcastMessage,
            hcClient);
    }

    /**
     * 上传设备CA证书
     *
     * 应用服务器可调用此接口在物联网平台上传设备CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddCertificateRequest 请求对象
     * @return AddCertificateResponse
     */
    public AddCertificateResponse addCertificate(AddCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.addCertificate);
    }

    /**
     * 上传设备CA证书
     *
     * 应用服务器可调用此接口在物联网平台上传设备CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddCertificateRequest 请求对象
     * @return SyncInvoker<AddCertificateRequest, AddCertificateResponse>
     */
    public SyncInvoker<AddCertificateRequest, AddCertificateResponse> addCertificateInvoker(
        AddCertificateRequest request) {
        return new SyncInvoker<AddCertificateRequest, AddCertificateResponse>(request, IoTDAMeta.addCertificate,
            hcClient);
    }

    /**
     * 验证设备CA证书
     *
     * 应用服务器可调用此接口在物联网平台验证设备的CA证书，目的是为了验证用户持有设备CA证书的私钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckCertificateRequest 请求对象
     * @return CheckCertificateResponse
     */
    public CheckCertificateResponse checkCertificate(CheckCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.checkCertificate);
    }

    /**
     * 验证设备CA证书
     *
     * 应用服务器可调用此接口在物联网平台验证设备的CA证书，目的是为了验证用户持有设备CA证书的私钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckCertificateRequest 请求对象
     * @return SyncInvoker<CheckCertificateRequest, CheckCertificateResponse>
     */
    public SyncInvoker<CheckCertificateRequest, CheckCertificateResponse> checkCertificateInvoker(
        CheckCertificateRequest request) {
        return new SyncInvoker<CheckCertificateRequest, CheckCertificateResponse>(request, IoTDAMeta.checkCertificate,
            hcClient);
    }

    /**
     * 删除设备CA证书
     *
     * 应用服务器可调用此接口在物联网平台删除设备CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteCertificate);
    }

    /**
     * 删除设备CA证书
     *
     * 应用服务器可调用此接口在物联网平台删除设备CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(
        DeleteCertificateRequest request) {
        return new SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request,
            IoTDAMeta.deleteCertificate, hcClient);
    }

    /**
     * 获取设备CA证书列表
     *
     * 应用服务器可调用此接口在物联网平台获取设备CA证书列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listCertificates);
    }

    /**
     * 获取设备CA证书列表
     *
     * 应用服务器可调用此接口在物联网平台获取设备CA证书列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public SyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesInvoker(
        ListCertificatesRequest request) {
        return new SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, IoTDAMeta.listCertificates,
            hcClient);
    }

    /**
     * 下发设备命令
     *
     * 设备的产品模型中定义了物联网平台可向设备下发的命令，应用服务器可调用此接口向指定设备下发命令，以实现对设备的同步控制。平台负责将命令以同步方式发送给设备，并将设备执行命令结果同步返回, 如果设备没有响应，平台会返回给应用服务器超时，平台超时时间是20秒。如果命令下发需要超过20秒，建议采用[[消息下发](https://support.huaweicloud.com/api-iothub/iot_06_v5_0059.html)](tag:hws)[[消息下发](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0059.html)](tag:hws_hk)。
     * 注意：
     * - 此接口适用于MQTT设备同步命令下发，暂不支持NB-IoT设备命令下发。
     * - 此接口仅支持单个设备同步命令下发，如需多个设备同步命令下发，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCommandRequest 请求对象
     * @return CreateCommandResponse
     */
    public CreateCommandResponse createCommand(CreateCommandRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createCommand);
    }

    /**
     * 下发设备命令
     *
     * 设备的产品模型中定义了物联网平台可向设备下发的命令，应用服务器可调用此接口向指定设备下发命令，以实现对设备的同步控制。平台负责将命令以同步方式发送给设备，并将设备执行命令结果同步返回, 如果设备没有响应，平台会返回给应用服务器超时，平台超时时间是20秒。如果命令下发需要超过20秒，建议采用[[消息下发](https://support.huaweicloud.com/api-iothub/iot_06_v5_0059.html)](tag:hws)[[消息下发](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0059.html)](tag:hws_hk)。
     * 注意：
     * - 此接口适用于MQTT设备同步命令下发，暂不支持NB-IoT设备命令下发。
     * - 此接口仅支持单个设备同步命令下发，如需多个设备同步命令下发，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCommandRequest 请求对象
     * @return SyncInvoker<CreateCommandRequest, CreateCommandResponse>
     */
    public SyncInvoker<CreateCommandRequest, CreateCommandResponse> createCommandInvoker(CreateCommandRequest request) {
        return new SyncInvoker<CreateCommandRequest, CreateCommandResponse>(request, IoTDAMeta.createCommand, hcClient);
    }

    /**
     * 添加设备组
     *
     * 应用服务器可调用此接口新建设备组，一个华为云账号下最多可有1,000个设备组，包括父设备组和子设备组。设备组的最大层级关系不超过5层，即群组形成的关系树最大深度不超过5。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDeviceGroupRequest 请求对象
     * @return AddDeviceGroupResponse
     */
    public AddDeviceGroupResponse addDeviceGroup(AddDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.addDeviceGroup);
    }

    /**
     * 添加设备组
     *
     * 应用服务器可调用此接口新建设备组，一个华为云账号下最多可有1,000个设备组，包括父设备组和子设备组。设备组的最大层级关系不超过5层，即群组形成的关系树最大深度不超过5。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDeviceGroupRequest 请求对象
     * @return SyncInvoker<AddDeviceGroupRequest, AddDeviceGroupResponse>
     */
    public SyncInvoker<AddDeviceGroupRequest, AddDeviceGroupResponse> addDeviceGroupInvoker(
        AddDeviceGroupRequest request) {
        return new SyncInvoker<AddDeviceGroupRequest, AddDeviceGroupResponse>(request, IoTDAMeta.addDeviceGroup,
            hcClient);
    }

    /**
     * 管理设备组中的设备
     *
     * 应用服务器可调用此接口管理设备组中的设备。单个设备组内最多添加20,000个设备，一个设备最多可以被添加到10个设备组中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOrDeleteDeviceInGroupRequest 请求对象
     * @return CreateOrDeleteDeviceInGroupResponse
     */
    public CreateOrDeleteDeviceInGroupResponse createOrDeleteDeviceInGroup(CreateOrDeleteDeviceInGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createOrDeleteDeviceInGroup);
    }

    /**
     * 管理设备组中的设备
     *
     * 应用服务器可调用此接口管理设备组中的设备。单个设备组内最多添加20,000个设备，一个设备最多可以被添加到10个设备组中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOrDeleteDeviceInGroupRequest 请求对象
     * @return SyncInvoker<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse>
     */
    public SyncInvoker<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse> createOrDeleteDeviceInGroupInvoker(
        CreateOrDeleteDeviceInGroupRequest request) {
        return new SyncInvoker<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse>(request,
            IoTDAMeta.createOrDeleteDeviceInGroup, hcClient);
    }

    /**
     * 删除设备组
     *
     * 应用服务器可调用此接口删除指定设备组，如果该设备组存在子设备组或者该设备组中存在设备，必须先删除子设备组并将设备从该设备组移除，才能删除该设备组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeviceGroupRequest 请求对象
     * @return DeleteDeviceGroupResponse
     */
    public DeleteDeviceGroupResponse deleteDeviceGroup(DeleteDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteDeviceGroup);
    }

    /**
     * 删除设备组
     *
     * 应用服务器可调用此接口删除指定设备组，如果该设备组存在子设备组或者该设备组中存在设备，必须先删除子设备组并将设备从该设备组移除，才能删除该设备组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeviceGroupRequest 请求对象
     * @return SyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse>
     */
    public SyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> deleteDeviceGroupInvoker(
        DeleteDeviceGroupRequest request) {
        return new SyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse>(request,
            IoTDAMeta.deleteDeviceGroup, hcClient);
    }

    /**
     * 查询设备组列表
     *
     * 应用服务器可调用此接口查询物联网平台中的设备组信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeviceGroupsRequest 请求对象
     * @return ListDeviceGroupsResponse
     */
    public ListDeviceGroupsResponse listDeviceGroups(ListDeviceGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listDeviceGroups);
    }

    /**
     * 查询设备组列表
     *
     * 应用服务器可调用此接口查询物联网平台中的设备组信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeviceGroupsRequest 请求对象
     * @return SyncInvoker<ListDeviceGroupsRequest, ListDeviceGroupsResponse>
     */
    public SyncInvoker<ListDeviceGroupsRequest, ListDeviceGroupsResponse> listDeviceGroupsInvoker(
        ListDeviceGroupsRequest request) {
        return new SyncInvoker<ListDeviceGroupsRequest, ListDeviceGroupsResponse>(request, IoTDAMeta.listDeviceGroups,
            hcClient);
    }

    /**
     * 查询设备组
     *
     * 应用服务器可调用此接口查询指定设备组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceGroupRequest 请求对象
     * @return ShowDeviceGroupResponse
     */
    public ShowDeviceGroupResponse showDeviceGroup(ShowDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showDeviceGroup);
    }

    /**
     * 查询设备组
     *
     * 应用服务器可调用此接口查询指定设备组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceGroupRequest 请求对象
     * @return SyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse>
     */
    public SyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse> showDeviceGroupInvoker(
        ShowDeviceGroupRequest request) {
        return new SyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse>(request, IoTDAMeta.showDeviceGroup,
            hcClient);
    }

    /**
     * 查询设备组设备列表
     *
     * 应用服务器可调用此接口查询指定设备组下的设备列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDevicesInGroupRequest 请求对象
     * @return ShowDevicesInGroupResponse
     */
    public ShowDevicesInGroupResponse showDevicesInGroup(ShowDevicesInGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showDevicesInGroup);
    }

    /**
     * 查询设备组设备列表
     *
     * 应用服务器可调用此接口查询指定设备组下的设备列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDevicesInGroupRequest 请求对象
     * @return SyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse>
     */
    public SyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> showDevicesInGroupInvoker(
        ShowDevicesInGroupRequest request) {
        return new SyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse>(request,
            IoTDAMeta.showDevicesInGroup, hcClient);
    }

    /**
     * 修改设备组
     *
     * 应用服务器可调用此接口修改物联网平台中指定设备组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceGroupRequest 请求对象
     * @return UpdateDeviceGroupResponse
     */
    public UpdateDeviceGroupResponse updateDeviceGroup(UpdateDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateDeviceGroup);
    }

    /**
     * 修改设备组
     *
     * 应用服务器可调用此接口修改物联网平台中指定设备组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceGroupRequest 请求对象
     * @return SyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse>
     */
    public SyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> updateDeviceGroupInvoker(
        UpdateDeviceGroupRequest request) {
        return new SyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse>(request,
            IoTDAMeta.updateDeviceGroup, hcClient);
    }

    /**
     * 创建设备
     *
     * 应用服务器可调用此接口在物联网平台创建一个设备，仅在创建后设备才可以接入物联网平台。
     * 
     * - 该接口支持使用gateway_id参数指定在父设备下创建一个子设备，并且支持多级子设备，当前最大支持二级子设备。
     * - 该接口同时还支持对设备进行初始配置，接口会读取创建设备请求参数product_id对应的产品详情，如果产品的属性有定义默认值，则会将该属性默认值写入该设备的设备影子中。
     * - 用户还可以使用创建设备请求参数shadow字段为设备指定初始配置，指定后将会根据service_id和desired设置的属性值与产品中对应属性的默认值比对，如果不同，则将以shadow字段中设置的属性值为准写入到设备影子中。
     * - 该接口仅支持创建单个设备，如需批量注册设备，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDeviceRequest 请求对象
     * @return AddDeviceResponse
     */
    public AddDeviceResponse addDevice(AddDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.addDevice);
    }

    /**
     * 创建设备
     *
     * 应用服务器可调用此接口在物联网平台创建一个设备，仅在创建后设备才可以接入物联网平台。
     * 
     * - 该接口支持使用gateway_id参数指定在父设备下创建一个子设备，并且支持多级子设备，当前最大支持二级子设备。
     * - 该接口同时还支持对设备进行初始配置，接口会读取创建设备请求参数product_id对应的产品详情，如果产品的属性有定义默认值，则会将该属性默认值写入该设备的设备影子中。
     * - 用户还可以使用创建设备请求参数shadow字段为设备指定初始配置，指定后将会根据service_id和desired设置的属性值与产品中对应属性的默认值比对，如果不同，则将以shadow字段中设置的属性值为准写入到设备影子中。
     * - 该接口仅支持创建单个设备，如需批量注册设备，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDeviceRequest 请求对象
     * @return SyncInvoker<AddDeviceRequest, AddDeviceResponse>
     */
    public SyncInvoker<AddDeviceRequest, AddDeviceResponse> addDeviceInvoker(AddDeviceRequest request) {
        return new SyncInvoker<AddDeviceRequest, AddDeviceResponse>(request, IoTDAMeta.addDevice, hcClient);
    }

    /**
     * 删除设备
     *
     * 应用服务器可调用此接口在物联网平台上删除指定设备。若设备下连接了非直连设备，则必须把设备下的非直连设备都删除后，才能删除该设备。该接口仅支持删除单个设备，如需批量删除设备，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeviceRequest 请求对象
     * @return DeleteDeviceResponse
     */
    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteDevice);
    }

    /**
     * 删除设备
     *
     * 应用服务器可调用此接口在物联网平台上删除指定设备。若设备下连接了非直连设备，则必须把设备下的非直连设备都删除后，才能删除该设备。该接口仅支持删除单个设备，如需批量删除设备，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeviceRequest 请求对象
     * @return SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>
     */
    public SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse> deleteDeviceInvoker(DeleteDeviceRequest request) {
        return new SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>(request, IoTDAMeta.deleteDevice, hcClient);
    }

    /**
     * 冻结设备
     *
     * 应用服务器可调用此接口冻结设备，设备冻结后不能再连接上线，可以通过解冻设备接口解除设备冻结。注意，当前仅支持冻结与平台直连的设备。该接口仅支持冻结单个设备，如需批量冻结设备，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param FreezeDeviceRequest 请求对象
     * @return FreezeDeviceResponse
     */
    public FreezeDeviceResponse freezeDevice(FreezeDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.freezeDevice);
    }

    /**
     * 冻结设备
     *
     * 应用服务器可调用此接口冻结设备，设备冻结后不能再连接上线，可以通过解冻设备接口解除设备冻结。注意，当前仅支持冻结与平台直连的设备。该接口仅支持冻结单个设备，如需批量冻结设备，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param FreezeDeviceRequest 请求对象
     * @return SyncInvoker<FreezeDeviceRequest, FreezeDeviceResponse>
     */
    public SyncInvoker<FreezeDeviceRequest, FreezeDeviceResponse> freezeDeviceInvoker(FreezeDeviceRequest request) {
        return new SyncInvoker<FreezeDeviceRequest, FreezeDeviceResponse>(request, IoTDAMeta.freezeDevice, hcClient);
    }

    /**
     * 查询设备列表
     *
     * 应用服务器可调用此接口查询物联网平台中的设备信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDevicesRequest 请求对象
     * @return ListDevicesResponse
     */
    public ListDevicesResponse listDevices(ListDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listDevices);
    }

    /**
     * 查询设备列表
     *
     * 应用服务器可调用此接口查询物联网平台中的设备信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDevicesRequest 请求对象
     * @return SyncInvoker<ListDevicesRequest, ListDevicesResponse>
     */
    public SyncInvoker<ListDevicesRequest, ListDevicesResponse> listDevicesInvoker(ListDevicesRequest request) {
        return new SyncInvoker<ListDevicesRequest, ListDevicesResponse>(request, IoTDAMeta.listDevices, hcClient);
    }

    /**
     * 重置设备密钥
     *
     * 应用服务器可调用此接口重置设备密钥，携带指定密钥时平台将设备密钥重置为指定的密钥，不携带密钥时平台将自动生成一个新的随机密钥返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetDeviceSecretRequest 请求对象
     * @return ResetDeviceSecretResponse
     */
    public ResetDeviceSecretResponse resetDeviceSecret(ResetDeviceSecretRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.resetDeviceSecret);
    }

    /**
     * 重置设备密钥
     *
     * 应用服务器可调用此接口重置设备密钥，携带指定密钥时平台将设备密钥重置为指定的密钥，不携带密钥时平台将自动生成一个新的随机密钥返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetDeviceSecretRequest 请求对象
     * @return SyncInvoker<ResetDeviceSecretRequest, ResetDeviceSecretResponse>
     */
    public SyncInvoker<ResetDeviceSecretRequest, ResetDeviceSecretResponse> resetDeviceSecretInvoker(
        ResetDeviceSecretRequest request) {
        return new SyncInvoker<ResetDeviceSecretRequest, ResetDeviceSecretResponse>(request,
            IoTDAMeta.resetDeviceSecret, hcClient);
    }

    /**
     * 重置设备指纹
     *
     * 应用服务器可调用此接口重置设备指纹。携带指定设备指纹时将之重置为指定值；不携带时将之置空，后续设备第一次接入时，该设备指纹的值将设置为第一次接入时的证书指纹。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetFingerprintRequest 请求对象
     * @return ResetFingerprintResponse
     */
    public ResetFingerprintResponse resetFingerprint(ResetFingerprintRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.resetFingerprint);
    }

    /**
     * 重置设备指纹
     *
     * 应用服务器可调用此接口重置设备指纹。携带指定设备指纹时将之重置为指定值；不携带时将之置空，后续设备第一次接入时，该设备指纹的值将设置为第一次接入时的证书指纹。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetFingerprintRequest 请求对象
     * @return SyncInvoker<ResetFingerprintRequest, ResetFingerprintResponse>
     */
    public SyncInvoker<ResetFingerprintRequest, ResetFingerprintResponse> resetFingerprintInvoker(
        ResetFingerprintRequest request) {
        return new SyncInvoker<ResetFingerprintRequest, ResetFingerprintResponse>(request, IoTDAMeta.resetFingerprint,
            hcClient);
    }

    /**
     * 灵活搜索设备列表
     *
     * #### 接口说明
     * 
     * 应用服务器使用SQL语句调用该接口，灵活的搜索所需要的设备资源列表
     * 
     * #### 限制
     * 
     * - 仅**标准版实例、企业版实例**支持该接口调用，基础版不支持。
     * - 单账号调用该接口的 TPS 限制最大为1/S(每秒1次请求数)
     * 
     * #### 类SQL语法使用说明
     * 
     * 类SQL语句有select、from、where(可选)、order by(可选)、limit子句(可选)组成，长度限制为400个字符。子句里的内容大小写敏感，SQL语句的关键字大小写不敏感。
     * 
     * 示例：
     * 
     * &#x60;&#x60;&#x60;
     * select * from device where device_id &#x3D; &#39;as********&#39; limit 0,5
     * &#x60;&#x60;&#x60;
     * 
     * ##### SELECT子句
     * 
     * &#x60;&#x60;&#x60;
     * select [field]/[count(*)/count(1)] from device
     * &#x60;&#x60;&#x60;
     * 
     * 其中field为需要获取的字段，请参考响应参数字段名称，也可填*，获取所有字段。
     * 
     * 如果需要统计搜索的设备个数，请填count(*)或者count(1).
     * 
     * ##### FROM子句
     * 
     * &#x60;&#x60;&#x60;
     * from device
     * &#x60;&#x60;&#x60;
     * 
     * from后为要查询的资源名，当前支持\&quot;device\&quot;
     * 
     * ##### WHERE子句(可选)
     * 
     * &#x60;&#x60;&#x60;
     * WHERE [condition1] AND [condition2]
     * &#x60;&#x60;&#x60;
     * 
     * 最多支持5个condition，不支持嵌套；支持的检索字段请参见下面的**搜索条件字段说明**和**支持的运算符**章节
     * 
     * 连接词支持AND、OR，优先级参考标准SQL语法，默认AND优先级高于OR。
     * 
     * ##### LIMIT子句(可选)
     * 
     * &#x60;&#x60;&#x60;
     * limit [offset,] rows
     * &#x60;&#x60;&#x60;
     * 
     * offset标识搜索的偏移量，rows标识返回搜索结果的最大行数，例如：
     * 
     * - limit n ;示例(select * from device limit 10)
     * 
     *   最大返回n条结果数据
     *   
     * - limit m,n; 示例(select * from device limit 20,10) 
     *   搜索偏移量为m，最大返回n条结果数据
     * 
     * ###### 限制
     * 
     *  offset 最大 500， rows最大50，如果不填写limit子句，默认为limit 10
     * 
     * ##### ORDER BY子句(可选)
     * 
     * 用于实现自定义排序，当前支持自定义排序的字段为：\&quot;marker\&quot;。
     * 
     * &#x60;&#x60;&#x60;
     * order by marker [asc]/[desc]
     * &#x60;&#x60;&#x60;
     * 
     * 子句不填写时默认逻辑为随机排序
     * 
     * #### 搜索条件字段说明
     * 
     * | 字段名      | 类型   | 说明             | 取值范围                                                     |
     * | :---------- | :----- | :--------------- | :----------------------------------------------------------- |
     * | app_id      | string | 资源空间ID       | 长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。 |
     * | device_id   | string | 设备ID           | 长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。 |
     * | gateway_id  | string | 网关ID           | 长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。 |
     * | product_id  | string | 设备关联的产品ID | 长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。 |
     * | device_name | string | 设备名称         | 长度不超过256，只允许中文、字母、数字、以及_?&#39;#().,&amp;%@!-等字符的组合符。 |
     * | node_id     | string | 设备标识码       | 长度不超过64，只允许字母、数字、下划线（_）、连接符（-）的组合 |
     * | status      | string | 设备的状态       | ONLINE(在线)、OFFLINE(离线)、ABNORMAL(异常)、INACTIVE(未激活)、FROZEN(冻结) |
     * | node_type   | string | 设备节点类型     | GATEWAY(直连设备或网关)、ENDPOINT(非直连设备)                |
     * | tag_key     | string | 标签键           | 长度不超过64，只允许中文、字母、数字、以及_.-等字符的组合。  |
     * | tag_value   | string | 标签值           | 长度不超过128，只允许中文、字母、数字、以及_.-等字符的组合。 |
     * | sw_version  | string | 软件版本         | 长度不超过64，只允许字母、数字、下划线（_）、连接符（-）、英文点(.)的组合。 |
     * | fw_version  | string | 固件版本         | 长度不超过64，只允许字母、数字、下划线（_）、连接符（-）、英文点(.)的组合。 |
     * | group_id    | string | 群组Id           | 长度不超过36，十六进制字符串和连接符（-）的组合              |
     * | create_time | string | 设备注册时间     | 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;，如：2015-06-06T12:10:10.000Z |
     * | marker      | string | 结果记录ID       | 长度为24的十六进制字符串，如ffffffffffffffffffffffff         |
     * 
     * #### 支持的运算符
     * 
     * | 运算符  | 支持的字段                               |
     * | ------- | ---------------------------------------- |
     * | &#x3D;       | 所有                                     |
     * | !&#x3D;      | 所有                                     |
     * | &gt;       | create_time、marker                      |
     * | &lt;       | create_time、marker                      |
     * | like    | device_name、node_id、tag_key、tag_value |
     * | in      | 除tag_key、tag_value以外字段             |
     * | not  in | 除tag_key、tag_value以外字段             |
     * 
     * #### SQL 限制
     * 
     * - like: 只支持前缀匹配，不支持后缀匹配或者通配符匹配。前缀匹配不得少于4个字符，且不能包含任何特殊字符(只允许中文、字母、数字、下划线（_）、连接符（-）). 前缀后必须跟上\&quot;%\&quot;结尾。
     * - 不支持除了count(*)/count(1)以外的其他任何函数。
     * - 不支持其他SQL用法，如嵌套SQL、union、join、别名(Alias)等用法
     * - SQL长度限制为400个字符，单个请求条件最大支持5个。
     * - 不支持\&quot;null\&quot;和空字符串等条件值匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchDevicesRequest 请求对象
     * @return SearchDevicesResponse
     */
    public SearchDevicesResponse searchDevices(SearchDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.searchDevices);
    }

    /**
     * 灵活搜索设备列表
     *
     * #### 接口说明
     * 
     * 应用服务器使用SQL语句调用该接口，灵活的搜索所需要的设备资源列表
     * 
     * #### 限制
     * 
     * - 仅**标准版实例、企业版实例**支持该接口调用，基础版不支持。
     * - 单账号调用该接口的 TPS 限制最大为1/S(每秒1次请求数)
     * 
     * #### 类SQL语法使用说明
     * 
     * 类SQL语句有select、from、where(可选)、order by(可选)、limit子句(可选)组成，长度限制为400个字符。子句里的内容大小写敏感，SQL语句的关键字大小写不敏感。
     * 
     * 示例：
     * 
     * &#x60;&#x60;&#x60;
     * select * from device where device_id &#x3D; &#39;as********&#39; limit 0,5
     * &#x60;&#x60;&#x60;
     * 
     * ##### SELECT子句
     * 
     * &#x60;&#x60;&#x60;
     * select [field]/[count(*)/count(1)] from device
     * &#x60;&#x60;&#x60;
     * 
     * 其中field为需要获取的字段，请参考响应参数字段名称，也可填*，获取所有字段。
     * 
     * 如果需要统计搜索的设备个数，请填count(*)或者count(1).
     * 
     * ##### FROM子句
     * 
     * &#x60;&#x60;&#x60;
     * from device
     * &#x60;&#x60;&#x60;
     * 
     * from后为要查询的资源名，当前支持\&quot;device\&quot;
     * 
     * ##### WHERE子句(可选)
     * 
     * &#x60;&#x60;&#x60;
     * WHERE [condition1] AND [condition2]
     * &#x60;&#x60;&#x60;
     * 
     * 最多支持5个condition，不支持嵌套；支持的检索字段请参见下面的**搜索条件字段说明**和**支持的运算符**章节
     * 
     * 连接词支持AND、OR，优先级参考标准SQL语法，默认AND优先级高于OR。
     * 
     * ##### LIMIT子句(可选)
     * 
     * &#x60;&#x60;&#x60;
     * limit [offset,] rows
     * &#x60;&#x60;&#x60;
     * 
     * offset标识搜索的偏移量，rows标识返回搜索结果的最大行数，例如：
     * 
     * - limit n ;示例(select * from device limit 10)
     * 
     *   最大返回n条结果数据
     *   
     * - limit m,n; 示例(select * from device limit 20,10) 
     *   搜索偏移量为m，最大返回n条结果数据
     * 
     * ###### 限制
     * 
     *  offset 最大 500， rows最大50，如果不填写limit子句，默认为limit 10
     * 
     * ##### ORDER BY子句(可选)
     * 
     * 用于实现自定义排序，当前支持自定义排序的字段为：\&quot;marker\&quot;。
     * 
     * &#x60;&#x60;&#x60;
     * order by marker [asc]/[desc]
     * &#x60;&#x60;&#x60;
     * 
     * 子句不填写时默认逻辑为随机排序
     * 
     * #### 搜索条件字段说明
     * 
     * | 字段名      | 类型   | 说明             | 取值范围                                                     |
     * | :---------- | :----- | :--------------- | :----------------------------------------------------------- |
     * | app_id      | string | 资源空间ID       | 长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。 |
     * | device_id   | string | 设备ID           | 长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。 |
     * | gateway_id  | string | 网关ID           | 长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。 |
     * | product_id  | string | 设备关联的产品ID | 长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。 |
     * | device_name | string | 设备名称         | 长度不超过256，只允许中文、字母、数字、以及_?&#39;#().,&amp;%@!-等字符的组合符。 |
     * | node_id     | string | 设备标识码       | 长度不超过64，只允许字母、数字、下划线（_）、连接符（-）的组合 |
     * | status      | string | 设备的状态       | ONLINE(在线)、OFFLINE(离线)、ABNORMAL(异常)、INACTIVE(未激活)、FROZEN(冻结) |
     * | node_type   | string | 设备节点类型     | GATEWAY(直连设备或网关)、ENDPOINT(非直连设备)                |
     * | tag_key     | string | 标签键           | 长度不超过64，只允许中文、字母、数字、以及_.-等字符的组合。  |
     * | tag_value   | string | 标签值           | 长度不超过128，只允许中文、字母、数字、以及_.-等字符的组合。 |
     * | sw_version  | string | 软件版本         | 长度不超过64，只允许字母、数字、下划线（_）、连接符（-）、英文点(.)的组合。 |
     * | fw_version  | string | 固件版本         | 长度不超过64，只允许字母、数字、下划线（_）、连接符（-）、英文点(.)的组合。 |
     * | group_id    | string | 群组Id           | 长度不超过36，十六进制字符串和连接符（-）的组合              |
     * | create_time | string | 设备注册时间     | 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;，如：2015-06-06T12:10:10.000Z |
     * | marker      | string | 结果记录ID       | 长度为24的十六进制字符串，如ffffffffffffffffffffffff         |
     * 
     * #### 支持的运算符
     * 
     * | 运算符  | 支持的字段                               |
     * | ------- | ---------------------------------------- |
     * | &#x3D;       | 所有                                     |
     * | !&#x3D;      | 所有                                     |
     * | &gt;       | create_time、marker                      |
     * | &lt;       | create_time、marker                      |
     * | like    | device_name、node_id、tag_key、tag_value |
     * | in      | 除tag_key、tag_value以外字段             |
     * | not  in | 除tag_key、tag_value以外字段             |
     * 
     * #### SQL 限制
     * 
     * - like: 只支持前缀匹配，不支持后缀匹配或者通配符匹配。前缀匹配不得少于4个字符，且不能包含任何特殊字符(只允许中文、字母、数字、下划线（_）、连接符（-）). 前缀后必须跟上\&quot;%\&quot;结尾。
     * - 不支持除了count(*)/count(1)以外的其他任何函数。
     * - 不支持其他SQL用法，如嵌套SQL、union、join、别名(Alias)等用法
     * - SQL长度限制为400个字符，单个请求条件最大支持5个。
     * - 不支持\&quot;null\&quot;和空字符串等条件值匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchDevicesRequest 请求对象
     * @return SyncInvoker<SearchDevicesRequest, SearchDevicesResponse>
     */
    public SyncInvoker<SearchDevicesRequest, SearchDevicesResponse> searchDevicesInvoker(SearchDevicesRequest request) {
        return new SyncInvoker<SearchDevicesRequest, SearchDevicesResponse>(request, IoTDAMeta.searchDevices, hcClient);
    }

    /**
     * 查询设备
     *
     * 应用服务器可调用此接口查询物联网平台中指定设备的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceRequest 请求对象
     * @return ShowDeviceResponse
     */
    public ShowDeviceResponse showDevice(ShowDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showDevice);
    }

    /**
     * 查询设备
     *
     * 应用服务器可调用此接口查询物联网平台中指定设备的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceRequest 请求对象
     * @return SyncInvoker<ShowDeviceRequest, ShowDeviceResponse>
     */
    public SyncInvoker<ShowDeviceRequest, ShowDeviceResponse> showDeviceInvoker(ShowDeviceRequest request) {
        return new SyncInvoker<ShowDeviceRequest, ShowDeviceResponse>(request, IoTDAMeta.showDevice, hcClient);
    }

    /**
     * 解冻设备
     *
     * 应用服务器可调用此接口解冻设备，解除冻结后，设备可以连接上线。该接口仅支持解冻单个设备，如需批量解冻设备，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnfreezeDeviceRequest 请求对象
     * @return UnfreezeDeviceResponse
     */
    public UnfreezeDeviceResponse unfreezeDevice(UnfreezeDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.unfreezeDevice);
    }

    /**
     * 解冻设备
     *
     * 应用服务器可调用此接口解冻设备，解除冻结后，设备可以连接上线。该接口仅支持解冻单个设备，如需批量解冻设备，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnfreezeDeviceRequest 请求对象
     * @return SyncInvoker<UnfreezeDeviceRequest, UnfreezeDeviceResponse>
     */
    public SyncInvoker<UnfreezeDeviceRequest, UnfreezeDeviceResponse> unfreezeDeviceInvoker(
        UnfreezeDeviceRequest request) {
        return new SyncInvoker<UnfreezeDeviceRequest, UnfreezeDeviceResponse>(request, IoTDAMeta.unfreezeDevice,
            hcClient);
    }

    /**
     * 修改设备
     *
     * 应用服务器可调用此接口修改物联网平台中指定设备的基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceRequest 请求对象
     * @return UpdateDeviceResponse
     */
    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateDevice);
    }

    /**
     * 修改设备
     *
     * 应用服务器可调用此接口修改物联网平台中指定设备的基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceRequest 请求对象
     * @return SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>
     */
    public SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> updateDeviceInvoker(UpdateDeviceRequest request) {
        return new SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>(request, IoTDAMeta.updateDevice, hcClient);
    }

    /**
     * 查询设备影子数据
     *
     * 应用服务器可调用此接口查询指定设备的设备影子信息，包括对设备的期望属性信息（desired区）和设备最新上报的属性信息（reported区）。
     * 
     * 设备影子介绍：
     * 设备影子是一个用于存储和检索设备当前状态信息的JSON文档。
     * - 每个设备有且只有一个设备影子，由设备ID唯一标识
     * - 设备影子用于存储设备上报的(状态)属性和应用程序期望的设备(状态)属性
     * - 无论该设备是否在线，都可以通过该影子获取和设置设备的属性
     * - 设备上线或者设备上报属性时，如果desired区和reported区存在差异，则将差异部分下发给设备，配置的预期属性需在产品模型中定义且method具有可写属性“W”才可下发
     * 
     * 限制：
     * 设备影子JSON文档中的key不允许特殊字符：点(.)、dollar符号($)、空char(十六进制的ASCII码为00)。如果包含了以上特殊字符则无法正常刷新影子文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceShadowRequest 请求对象
     * @return ShowDeviceShadowResponse
     */
    public ShowDeviceShadowResponse showDeviceShadow(ShowDeviceShadowRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showDeviceShadow);
    }

    /**
     * 查询设备影子数据
     *
     * 应用服务器可调用此接口查询指定设备的设备影子信息，包括对设备的期望属性信息（desired区）和设备最新上报的属性信息（reported区）。
     * 
     * 设备影子介绍：
     * 设备影子是一个用于存储和检索设备当前状态信息的JSON文档。
     * - 每个设备有且只有一个设备影子，由设备ID唯一标识
     * - 设备影子用于存储设备上报的(状态)属性和应用程序期望的设备(状态)属性
     * - 无论该设备是否在线，都可以通过该影子获取和设置设备的属性
     * - 设备上线或者设备上报属性时，如果desired区和reported区存在差异，则将差异部分下发给设备，配置的预期属性需在产品模型中定义且method具有可写属性“W”才可下发
     * 
     * 限制：
     * 设备影子JSON文档中的key不允许特殊字符：点(.)、dollar符号($)、空char(十六进制的ASCII码为00)。如果包含了以上特殊字符则无法正常刷新影子文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceShadowRequest 请求对象
     * @return SyncInvoker<ShowDeviceShadowRequest, ShowDeviceShadowResponse>
     */
    public SyncInvoker<ShowDeviceShadowRequest, ShowDeviceShadowResponse> showDeviceShadowInvoker(
        ShowDeviceShadowRequest request) {
        return new SyncInvoker<ShowDeviceShadowRequest, ShowDeviceShadowResponse>(request, IoTDAMeta.showDeviceShadow,
            hcClient);
    }

    /**
     * 配置设备影子预期数据
     *
     * 应用服务器可调用此接口配置设备影子的预期属性（desired区），当设备上线或者设备上报属性时把属性下发给设备。
     * 
     * 设备影子介绍：
     * 设备影子是一个用于存储和检索设备当前状态信息的JSON文档。
     * - 每个设备有且只有一个设备影子，由设备ID唯一标识
     * - 设备影子用于存储设备上报的(状态)属性和应用程序期望的设备(状态)属性
     * - 无论该设备是否在线，都可以通过该影子获取和设置设备的属性
     * - 设备上线或者设备上报属性时，如果desired区和reported区存在差异，则将差异部分下发给设备，配置的预期属性需在产品模型中定义且method具有可写属性“W”才可下发
     * - 该接口仅支持配置单个设备的设备影子的预期数据，如需多个设备的设备影子配置，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * 限制：
     * 设备影子JSON文档中的key不允许特殊字符：点(.)、dollar符号($)、空char(十六进制的ASCII码为00)。如果包含了以上特殊字符则无法正常刷新影子文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceShadowDesiredDataRequest 请求对象
     * @return UpdateDeviceShadowDesiredDataResponse
     */
    public UpdateDeviceShadowDesiredDataResponse updateDeviceShadowDesiredData(
        UpdateDeviceShadowDesiredDataRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateDeviceShadowDesiredData);
    }

    /**
     * 配置设备影子预期数据
     *
     * 应用服务器可调用此接口配置设备影子的预期属性（desired区），当设备上线或者设备上报属性时把属性下发给设备。
     * 
     * 设备影子介绍：
     * 设备影子是一个用于存储和检索设备当前状态信息的JSON文档。
     * - 每个设备有且只有一个设备影子，由设备ID唯一标识
     * - 设备影子用于存储设备上报的(状态)属性和应用程序期望的设备(状态)属性
     * - 无论该设备是否在线，都可以通过该影子获取和设置设备的属性
     * - 设备上线或者设备上报属性时，如果desired区和reported区存在差异，则将差异部分下发给设备，配置的预期属性需在产品模型中定义且method具有可写属性“W”才可下发
     * - 该接口仅支持配置单个设备的设备影子的预期数据，如需多个设备的设备影子配置，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * 限制：
     * 设备影子JSON文档中的key不允许特殊字符：点(.)、dollar符号($)、空char(十六进制的ASCII码为00)。如果包含了以上特殊字符则无法正常刷新影子文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceShadowDesiredDataRequest 请求对象
     * @return SyncInvoker<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse>
     */
    public SyncInvoker<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse> updateDeviceShadowDesiredDataInvoker(
        UpdateDeviceShadowDesiredDataRequest request) {
        return new SyncInvoker<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse>(request,
            IoTDAMeta.updateDeviceShadowDesiredData, hcClient);
    }

    /**
     * 下发设备消息
     *
     * 物联网平台可向设备下发消息，应用服务器可调用此接口向指定设备下发消息，以实现对设备的控制。应用将消息下发给平台后，平台返回应用响应结果，平台再将消息发送给设备。平台返回应用响应结果不一定是设备接收结果，建议用户应用通过订阅[[设备消息状态变更通知](https://support.huaweicloud.com/api-iothub/iot_06_v5_01203.html)](tag:hws)[[设备消息状态变更通知](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_01203.html)](tag:hws_hk)，订阅后平台会将设备接收结果推送给订阅的应用。
     * 注意：
     * - 此接口适用于MQTT设备消息下发，暂不支持其他协议接入的设备消息下发。
     * - 此接口仅支持单个设备消息下发，如需多个设备消息下发，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMessageRequest 请求对象
     * @return CreateMessageResponse
     */
    public CreateMessageResponse createMessage(CreateMessageRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createMessage);
    }

    /**
     * 下发设备消息
     *
     * 物联网平台可向设备下发消息，应用服务器可调用此接口向指定设备下发消息，以实现对设备的控制。应用将消息下发给平台后，平台返回应用响应结果，平台再将消息发送给设备。平台返回应用响应结果不一定是设备接收结果，建议用户应用通过订阅[[设备消息状态变更通知](https://support.huaweicloud.com/api-iothub/iot_06_v5_01203.html)](tag:hws)[[设备消息状态变更通知](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_01203.html)](tag:hws_hk)，订阅后平台会将设备接收结果推送给订阅的应用。
     * 注意：
     * - 此接口适用于MQTT设备消息下发，暂不支持其他协议接入的设备消息下发。
     * - 此接口仅支持单个设备消息下发，如需多个设备消息下发，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMessageRequest 请求对象
     * @return SyncInvoker<CreateMessageRequest, CreateMessageResponse>
     */
    public SyncInvoker<CreateMessageRequest, CreateMessageResponse> createMessageInvoker(CreateMessageRequest request) {
        return new SyncInvoker<CreateMessageRequest, CreateMessageResponse>(request, IoTDAMeta.createMessage, hcClient);
    }

    /**
     * 查询设备消息
     *
     * 应用服务器可调用此接口查询平台下发给设备的消息，平台为每个设备默认最多保存20条消息，超过20条后， 后续的消息会替换下发最早的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeviceMessagesRequest 请求对象
     * @return ListDeviceMessagesResponse
     */
    public ListDeviceMessagesResponse listDeviceMessages(ListDeviceMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listDeviceMessages);
    }

    /**
     * 查询设备消息
     *
     * 应用服务器可调用此接口查询平台下发给设备的消息，平台为每个设备默认最多保存20条消息，超过20条后， 后续的消息会替换下发最早的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeviceMessagesRequest 请求对象
     * @return SyncInvoker<ListDeviceMessagesRequest, ListDeviceMessagesResponse>
     */
    public SyncInvoker<ListDeviceMessagesRequest, ListDeviceMessagesResponse> listDeviceMessagesInvoker(
        ListDeviceMessagesRequest request) {
        return new SyncInvoker<ListDeviceMessagesRequest, ListDeviceMessagesResponse>(request,
            IoTDAMeta.listDeviceMessages, hcClient);
    }

    /**
     * 查询指定消息id的消息
     *
     * 应用服务器可调用此接口查询平台下发给设备的指定消息id的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceMessageRequest 请求对象
     * @return ShowDeviceMessageResponse
     */
    public ShowDeviceMessageResponse showDeviceMessage(ShowDeviceMessageRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showDeviceMessage);
    }

    /**
     * 查询指定消息id的消息
     *
     * 应用服务器可调用此接口查询平台下发给设备的指定消息id的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceMessageRequest 请求对象
     * @return SyncInvoker<ShowDeviceMessageRequest, ShowDeviceMessageResponse>
     */
    public SyncInvoker<ShowDeviceMessageRequest, ShowDeviceMessageResponse> showDeviceMessageInvoker(
        ShowDeviceMessageRequest request) {
        return new SyncInvoker<ShowDeviceMessageRequest, ShowDeviceMessageResponse>(request,
            IoTDAMeta.showDeviceMessage, hcClient);
    }

    /**
     * 创建OTA升级包
     *
     * 用户可调用此接口创建升级包关联OBS对象
     * 使用前提：使用该API需要您授权设备接入服务(IoTDA)的实例访问对象存储服务(OBS)以及 密钥管理服务(KMS Administrator)的权限。在“[[统一身份认证服务（IAM）](https://console.huaweicloud.com/iam)](tag:hws)[[统一身份认证服务（IAM）](https://console-intl.huaweicloud.com/iam)](tag:hws_hk) - 委托”中将委托名称为iotda_admin_trust的委托授权KMS Administrator和OBS OperateAccess
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOtaPackageRequest 请求对象
     * @return CreateOtaPackageResponse
     */
    public CreateOtaPackageResponse createOtaPackage(CreateOtaPackageRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createOtaPackage);
    }

    /**
     * 创建OTA升级包
     *
     * 用户可调用此接口创建升级包关联OBS对象
     * 使用前提：使用该API需要您授权设备接入服务(IoTDA)的实例访问对象存储服务(OBS)以及 密钥管理服务(KMS Administrator)的权限。在“[[统一身份认证服务（IAM）](https://console.huaweicloud.com/iam)](tag:hws)[[统一身份认证服务（IAM）](https://console-intl.huaweicloud.com/iam)](tag:hws_hk) - 委托”中将委托名称为iotda_admin_trust的委托授权KMS Administrator和OBS OperateAccess
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOtaPackageRequest 请求对象
     * @return SyncInvoker<CreateOtaPackageRequest, CreateOtaPackageResponse>
     */
    public SyncInvoker<CreateOtaPackageRequest, CreateOtaPackageResponse> createOtaPackageInvoker(
        CreateOtaPackageRequest request) {
        return new SyncInvoker<CreateOtaPackageRequest, CreateOtaPackageResponse>(request, IoTDAMeta.createOtaPackage,
            hcClient);
    }

    /**
     * 删除OTA升级包
     *
     * 用户可调用此接口删除关联OBS对象的升级包信息，不会删除OBS上对象
     * 使用前提：使用该API需要您授权设备接入服务(IoTDA)的实例访问对象存储服务(OBS)以及 密钥管理服务(KMS Administrator)的权限。在“[[统一身份认证服务（IAM）](https://console.huaweicloud.com/iam)](tag:hws)[[统一身份认证服务（IAM）](https://console-intl.huaweicloud.com/iam)](tag:hws_hk) - 委托”中将委托名称为iotda_admin_trust的委托授权KMS Administrator和OBS OperateAccess
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteOtaPackageRequest 请求对象
     * @return DeleteOtaPackageResponse
     */
    public DeleteOtaPackageResponse deleteOtaPackage(DeleteOtaPackageRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteOtaPackage);
    }

    /**
     * 删除OTA升级包
     *
     * 用户可调用此接口删除关联OBS对象的升级包信息，不会删除OBS上对象
     * 使用前提：使用该API需要您授权设备接入服务(IoTDA)的实例访问对象存储服务(OBS)以及 密钥管理服务(KMS Administrator)的权限。在“[[统一身份认证服务（IAM）](https://console.huaweicloud.com/iam)](tag:hws)[[统一身份认证服务（IAM）](https://console-intl.huaweicloud.com/iam)](tag:hws_hk) - 委托”中将委托名称为iotda_admin_trust的委托授权KMS Administrator和OBS OperateAccess
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteOtaPackageRequest 请求对象
     * @return SyncInvoker<DeleteOtaPackageRequest, DeleteOtaPackageResponse>
     */
    public SyncInvoker<DeleteOtaPackageRequest, DeleteOtaPackageResponse> deleteOtaPackageInvoker(
        DeleteOtaPackageRequest request) {
        return new SyncInvoker<DeleteOtaPackageRequest, DeleteOtaPackageResponse>(request, IoTDAMeta.deleteOtaPackage,
            hcClient);
    }

    /**
     * 查询OTA升级包列表
     *
     * 用户可调用此接口查询关联OBS对象的升级包列表
     * 使用前提：使用该API需要您授权设备接入服务(IoTDA)的实例访问对象存储服务(OBS)以及 密钥管理服务(KMS Administrator)的权限。在“[[统一身份认证服务（IAM）](https://console.huaweicloud.com/iam)](tag:hws)[[统一身份认证服务（IAM）](https://console-intl.huaweicloud.com/iam)](tag:hws_hk) - 委托”中将委托名称为iotda_admin_trust的委托授权KMS Administrator和OBS OperateAccess
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOtaPackageInfoRequest 请求对象
     * @return ListOtaPackageInfoResponse
     */
    public ListOtaPackageInfoResponse listOtaPackageInfo(ListOtaPackageInfoRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listOtaPackageInfo);
    }

    /**
     * 查询OTA升级包列表
     *
     * 用户可调用此接口查询关联OBS对象的升级包列表
     * 使用前提：使用该API需要您授权设备接入服务(IoTDA)的实例访问对象存储服务(OBS)以及 密钥管理服务(KMS Administrator)的权限。在“[[统一身份认证服务（IAM）](https://console.huaweicloud.com/iam)](tag:hws)[[统一身份认证服务（IAM）](https://console-intl.huaweicloud.com/iam)](tag:hws_hk) - 委托”中将委托名称为iotda_admin_trust的委托授权KMS Administrator和OBS OperateAccess
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOtaPackageInfoRequest 请求对象
     * @return SyncInvoker<ListOtaPackageInfoRequest, ListOtaPackageInfoResponse>
     */
    public SyncInvoker<ListOtaPackageInfoRequest, ListOtaPackageInfoResponse> listOtaPackageInfoInvoker(
        ListOtaPackageInfoRequest request) {
        return new SyncInvoker<ListOtaPackageInfoRequest, ListOtaPackageInfoResponse>(request,
            IoTDAMeta.listOtaPackageInfo, hcClient);
    }

    /**
     * 获取OTA升级包详情
     *
     * 用户可调用此接口查询关联OBS对象的升级包详情
     * 使用前提：使用该API需要您授权设备接入服务(IoTDA)的实例访问对象存储服务(OBS)以及 密钥管理服务(KMS Administrator)的权限。在“[[统一身份认证服务（IAM）](https://console.huaweicloud.com/iam)](tag:hws)[[统一身份认证服务（IAM）](https://console-intl.huaweicloud.com/iam)](tag:hws_hk) - 委托”中将委托名称为iotda_admin_trust的委托授权KMS Administrator和OBS OperateAccess
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOtaPackageRequest 请求对象
     * @return ShowOtaPackageResponse
     */
    public ShowOtaPackageResponse showOtaPackage(ShowOtaPackageRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showOtaPackage);
    }

    /**
     * 获取OTA升级包详情
     *
     * 用户可调用此接口查询关联OBS对象的升级包详情
     * 使用前提：使用该API需要您授权设备接入服务(IoTDA)的实例访问对象存储服务(OBS)以及 密钥管理服务(KMS Administrator)的权限。在“[[统一身份认证服务（IAM）](https://console.huaweicloud.com/iam)](tag:hws)[[统一身份认证服务（IAM）](https://console-intl.huaweicloud.com/iam)](tag:hws_hk) - 委托”中将委托名称为iotda_admin_trust的委托授权KMS Administrator和OBS OperateAccess
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOtaPackageRequest 请求对象
     * @return SyncInvoker<ShowOtaPackageRequest, ShowOtaPackageResponse>
     */
    public SyncInvoker<ShowOtaPackageRequest, ShowOtaPackageResponse> showOtaPackageInvoker(
        ShowOtaPackageRequest request) {
        return new SyncInvoker<ShowOtaPackageRequest, ShowOtaPackageResponse>(request, IoTDAMeta.showOtaPackage,
            hcClient);
    }

    /**
     * 创建产品
     *
     * 应用服务器可调用此接口创建产品。此接口仅创建了产品，没有创建和安装插件，如果需要对数据进行编解码，还需要在平台开发和安装插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProductRequest 请求对象
     * @return CreateProductResponse
     */
    public CreateProductResponse createProduct(CreateProductRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createProduct);
    }

    /**
     * 创建产品
     *
     * 应用服务器可调用此接口创建产品。此接口仅创建了产品，没有创建和安装插件，如果需要对数据进行编解码，还需要在平台开发和安装插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProductRequest 请求对象
     * @return SyncInvoker<CreateProductRequest, CreateProductResponse>
     */
    public SyncInvoker<CreateProductRequest, CreateProductResponse> createProductInvoker(CreateProductRequest request) {
        return new SyncInvoker<CreateProductRequest, CreateProductResponse>(request, IoTDAMeta.createProduct, hcClient);
    }

    /**
     * 删除产品
     *
     * 应用服务器可调用此接口删除已导入物联网平台的指定产品模型。此接口仅删除了产品，未删除关联的插件，在产品下存在设备时，该产品不允许删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProductRequest 请求对象
     * @return DeleteProductResponse
     */
    public DeleteProductResponse deleteProduct(DeleteProductRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteProduct);
    }

    /**
     * 删除产品
     *
     * 应用服务器可调用此接口删除已导入物联网平台的指定产品模型。此接口仅删除了产品，未删除关联的插件，在产品下存在设备时，该产品不允许删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProductRequest 请求对象
     * @return SyncInvoker<DeleteProductRequest, DeleteProductResponse>
     */
    public SyncInvoker<DeleteProductRequest, DeleteProductResponse> deleteProductInvoker(DeleteProductRequest request) {
        return new SyncInvoker<DeleteProductRequest, DeleteProductResponse>(request, IoTDAMeta.deleteProduct, hcClient);
    }

    /**
     * 查询产品列表
     *
     * 应用服务器可调用此接口查询已导入物联网平台的产品模型信息列表，了解产品模型的概要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductsRequest 请求对象
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listProducts);
    }

    /**
     * 查询产品列表
     *
     * 应用服务器可调用此接口查询已导入物联网平台的产品模型信息列表，了解产品模型的概要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductsRequest 请求对象
     * @return SyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public SyncInvoker<ListProductsRequest, ListProductsResponse> listProductsInvoker(ListProductsRequest request) {
        return new SyncInvoker<ListProductsRequest, ListProductsResponse>(request, IoTDAMeta.listProducts, hcClient);
    }

    /**
     * 查询产品
     *
     * 应用服务器可调用此接口查询已导入物联网平台的指定产品模型详细信息，包括产品模型的服务、属性、命令等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProductRequest 请求对象
     * @return ShowProductResponse
     */
    public ShowProductResponse showProduct(ShowProductRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showProduct);
    }

    /**
     * 查询产品
     *
     * 应用服务器可调用此接口查询已导入物联网平台的指定产品模型详细信息，包括产品模型的服务、属性、命令等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProductRequest 请求对象
     * @return SyncInvoker<ShowProductRequest, ShowProductResponse>
     */
    public SyncInvoker<ShowProductRequest, ShowProductResponse> showProductInvoker(ShowProductRequest request) {
        return new SyncInvoker<ShowProductRequest, ShowProductResponse>(request, IoTDAMeta.showProduct, hcClient);
    }

    /**
     * 修改产品
     *
     * 应用服务器可调用此接口修改已导入物联网平台的指定产品模型，包括产品模型的服务、属性、命令等。此接口仅修改了产品，未修改和安装插件，如果修改了产品中的service定义，且在平台中有对应的插件，请修改并重新安装插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProductRequest 请求对象
     * @return UpdateProductResponse
     */
    public UpdateProductResponse updateProduct(UpdateProductRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateProduct);
    }

    /**
     * 修改产品
     *
     * 应用服务器可调用此接口修改已导入物联网平台的指定产品模型，包括产品模型的服务、属性、命令等。此接口仅修改了产品，未修改和安装插件，如果修改了产品中的service定义，且在平台中有对应的插件，请修改并重新安装插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProductRequest 请求对象
     * @return SyncInvoker<UpdateProductRequest, UpdateProductResponse>
     */
    public SyncInvoker<UpdateProductRequest, UpdateProductResponse> updateProductInvoker(UpdateProductRequest request) {
        return new SyncInvoker<UpdateProductRequest, UpdateProductResponse>(request, IoTDAMeta.updateProduct, hcClient);
    }

    /**
     * 查询设备属性
     *
     * 设备的产品模型中定义了物联网平台可向设备下发的属性，应用服务器可调用此接口向设备发送指令用以查询设备的实时属性, 并由设备将属性查询的结果同步返回给应用服务器。
     * 注意：此接口适用于MQTT设备，暂不支持NB-IoT设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPropertiesRequest 请求对象
     * @return ListPropertiesResponse
     */
    public ListPropertiesResponse listProperties(ListPropertiesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listProperties);
    }

    /**
     * 查询设备属性
     *
     * 设备的产品模型中定义了物联网平台可向设备下发的属性，应用服务器可调用此接口向设备发送指令用以查询设备的实时属性, 并由设备将属性查询的结果同步返回给应用服务器。
     * 注意：此接口适用于MQTT设备，暂不支持NB-IoT设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPropertiesRequest 请求对象
     * @return SyncInvoker<ListPropertiesRequest, ListPropertiesResponse>
     */
    public SyncInvoker<ListPropertiesRequest, ListPropertiesResponse> listPropertiesInvoker(
        ListPropertiesRequest request) {
        return new SyncInvoker<ListPropertiesRequest, ListPropertiesResponse>(request, IoTDAMeta.listProperties,
            hcClient);
    }

    /**
     * 修改设备属性
     *
     * 设备的产品模型中定义了物联网平台可向设备下发的属性，应用服务器可调用此接口向指定设备下发属性。平台负责将属性以同步方式发送给设备，并将设备执行属性结果同步返回。
     * 注意：此接口适用于MQTT设备，暂不支持NB-IoT设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePropertiesRequest 请求对象
     * @return UpdatePropertiesResponse
     */
    public UpdatePropertiesResponse updateProperties(UpdatePropertiesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateProperties);
    }

    /**
     * 修改设备属性
     *
     * 设备的产品模型中定义了物联网平台可向设备下发的属性，应用服务器可调用此接口向指定设备下发属性。平台负责将属性以同步方式发送给设备，并将设备执行属性结果同步返回。
     * 注意：此接口适用于MQTT设备，暂不支持NB-IoT设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePropertiesRequest 请求对象
     * @return SyncInvoker<UpdatePropertiesRequest, UpdatePropertiesResponse>
     */
    public SyncInvoker<UpdatePropertiesRequest, UpdatePropertiesResponse> updatePropertiesInvoker(
        UpdatePropertiesRequest request) {
        return new SyncInvoker<UpdatePropertiesRequest, UpdatePropertiesResponse>(request, IoTDAMeta.updateProperties,
            hcClient);
    }

    /**
     * 创建规则触发条件
     *
     * 应用服务器可调用此接口在物联网平台创建一条规则触发条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoutingRuleRequest 请求对象
     * @return CreateRoutingRuleResponse
     */
    public CreateRoutingRuleResponse createRoutingRule(CreateRoutingRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createRoutingRule);
    }

    /**
     * 创建规则触发条件
     *
     * 应用服务器可调用此接口在物联网平台创建一条规则触发条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoutingRuleRequest 请求对象
     * @return SyncInvoker<CreateRoutingRuleRequest, CreateRoutingRuleResponse>
     */
    public SyncInvoker<CreateRoutingRuleRequest, CreateRoutingRuleResponse> createRoutingRuleInvoker(
        CreateRoutingRuleRequest request) {
        return new SyncInvoker<CreateRoutingRuleRequest, CreateRoutingRuleResponse>(request,
            IoTDAMeta.createRoutingRule, hcClient);
    }

    /**
     * 创建规则动作
     *
     * 应用服务器可调用此接口在物联网平台创建一条规则动作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRuleActionRequest 请求对象
     * @return CreateRuleActionResponse
     */
    public CreateRuleActionResponse createRuleAction(CreateRuleActionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createRuleAction);
    }

    /**
     * 创建规则动作
     *
     * 应用服务器可调用此接口在物联网平台创建一条规则动作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRuleActionRequest 请求对象
     * @return SyncInvoker<CreateRuleActionRequest, CreateRuleActionResponse>
     */
    public SyncInvoker<CreateRuleActionRequest, CreateRuleActionResponse> createRuleActionInvoker(
        CreateRuleActionRequest request) {
        return new SyncInvoker<CreateRuleActionRequest, CreateRuleActionResponse>(request, IoTDAMeta.createRuleAction,
            hcClient);
    }

    /**
     * 删除规则触发条件
     *
     * 应用服务器可调用此接口删除物联网平台中的指定规则条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoutingRuleRequest 请求对象
     * @return DeleteRoutingRuleResponse
     */
    public DeleteRoutingRuleResponse deleteRoutingRule(DeleteRoutingRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteRoutingRule);
    }

    /**
     * 删除规则触发条件
     *
     * 应用服务器可调用此接口删除物联网平台中的指定规则条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoutingRuleRequest 请求对象
     * @return SyncInvoker<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse>
     */
    public SyncInvoker<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse> deleteRoutingRuleInvoker(
        DeleteRoutingRuleRequest request) {
        return new SyncInvoker<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse>(request,
            IoTDAMeta.deleteRoutingRule, hcClient);
    }

    /**
     * 删除规则动作
     *
     * 应用服务器可调用此接口删除物联网平台中的指定规则动作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleActionRequest 请求对象
     * @return DeleteRuleActionResponse
     */
    public DeleteRuleActionResponse deleteRuleAction(DeleteRuleActionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteRuleAction);
    }

    /**
     * 删除规则动作
     *
     * 应用服务器可调用此接口删除物联网平台中的指定规则动作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleActionRequest 请求对象
     * @return SyncInvoker<DeleteRuleActionRequest, DeleteRuleActionResponse>
     */
    public SyncInvoker<DeleteRuleActionRequest, DeleteRuleActionResponse> deleteRuleActionInvoker(
        DeleteRuleActionRequest request) {
        return new SyncInvoker<DeleteRuleActionRequest, DeleteRuleActionResponse>(request, IoTDAMeta.deleteRuleAction,
            hcClient);
    }

    /**
     * 查询规则条件列表
     *
     * 应用服务器可调用此接口查询物联网平台中设置的规则条件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoutingRulesRequest 请求对象
     * @return ListRoutingRulesResponse
     */
    public ListRoutingRulesResponse listRoutingRules(ListRoutingRulesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listRoutingRules);
    }

    /**
     * 查询规则条件列表
     *
     * 应用服务器可调用此接口查询物联网平台中设置的规则条件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoutingRulesRequest 请求对象
     * @return SyncInvoker<ListRoutingRulesRequest, ListRoutingRulesResponse>
     */
    public SyncInvoker<ListRoutingRulesRequest, ListRoutingRulesResponse> listRoutingRulesInvoker(
        ListRoutingRulesRequest request) {
        return new SyncInvoker<ListRoutingRulesRequest, ListRoutingRulesResponse>(request, IoTDAMeta.listRoutingRules,
            hcClient);
    }

    /**
     * 查询规则动作列表
     *
     * 应用服务器可调用此接口查询物联网平台中设置的规则动作列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleActionsRequest 请求对象
     * @return ListRuleActionsResponse
     */
    public ListRuleActionsResponse listRuleActions(ListRuleActionsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listRuleActions);
    }

    /**
     * 查询规则动作列表
     *
     * 应用服务器可调用此接口查询物联网平台中设置的规则动作列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleActionsRequest 请求对象
     * @return SyncInvoker<ListRuleActionsRequest, ListRuleActionsResponse>
     */
    public SyncInvoker<ListRuleActionsRequest, ListRuleActionsResponse> listRuleActionsInvoker(
        ListRuleActionsRequest request) {
        return new SyncInvoker<ListRuleActionsRequest, ListRuleActionsResponse>(request, IoTDAMeta.listRuleActions,
            hcClient);
    }

    /**
     * 查询规则条件
     *
     * 应用服务器可调用此接口查询物联网平台中指定规则条件的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRoutingRuleRequest 请求对象
     * @return ShowRoutingRuleResponse
     */
    public ShowRoutingRuleResponse showRoutingRule(ShowRoutingRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showRoutingRule);
    }

    /**
     * 查询规则条件
     *
     * 应用服务器可调用此接口查询物联网平台中指定规则条件的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRoutingRuleRequest 请求对象
     * @return SyncInvoker<ShowRoutingRuleRequest, ShowRoutingRuleResponse>
     */
    public SyncInvoker<ShowRoutingRuleRequest, ShowRoutingRuleResponse> showRoutingRuleInvoker(
        ShowRoutingRuleRequest request) {
        return new SyncInvoker<ShowRoutingRuleRequest, ShowRoutingRuleResponse>(request, IoTDAMeta.showRoutingRule,
            hcClient);
    }

    /**
     * 查询规则动作
     *
     * 应用服务器可调用此接口查询物联网平台中指定规则动作的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRuleActionRequest 请求对象
     * @return ShowRuleActionResponse
     */
    public ShowRuleActionResponse showRuleAction(ShowRuleActionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showRuleAction);
    }

    /**
     * 查询规则动作
     *
     * 应用服务器可调用此接口查询物联网平台中指定规则动作的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRuleActionRequest 请求对象
     * @return SyncInvoker<ShowRuleActionRequest, ShowRuleActionResponse>
     */
    public SyncInvoker<ShowRuleActionRequest, ShowRuleActionResponse> showRuleActionInvoker(
        ShowRuleActionRequest request) {
        return new SyncInvoker<ShowRuleActionRequest, ShowRuleActionResponse>(request, IoTDAMeta.showRuleAction,
            hcClient);
    }

    /**
     * 修改规则触发条件
     *
     * 应用服务器可调用此接口修改物联网平台中指定规则条件的配置参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoutingRuleRequest 请求对象
     * @return UpdateRoutingRuleResponse
     */
    public UpdateRoutingRuleResponse updateRoutingRule(UpdateRoutingRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateRoutingRule);
    }

    /**
     * 修改规则触发条件
     *
     * 应用服务器可调用此接口修改物联网平台中指定规则条件的配置参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoutingRuleRequest 请求对象
     * @return SyncInvoker<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse>
     */
    public SyncInvoker<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse> updateRoutingRuleInvoker(
        UpdateRoutingRuleRequest request) {
        return new SyncInvoker<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse>(request,
            IoTDAMeta.updateRoutingRule, hcClient);
    }

    /**
     * 修改规则动作
     *
     * 应用服务器可调用此接口修改物联网平台中指定规则动作的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRuleActionRequest 请求对象
     * @return UpdateRuleActionResponse
     */
    public UpdateRuleActionResponse updateRuleAction(UpdateRuleActionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateRuleAction);
    }

    /**
     * 修改规则动作
     *
     * 应用服务器可调用此接口修改物联网平台中指定规则动作的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRuleActionRequest 请求对象
     * @return SyncInvoker<UpdateRuleActionRequest, UpdateRuleActionResponse>
     */
    public SyncInvoker<UpdateRuleActionRequest, UpdateRuleActionResponse> updateRuleActionInvoker(
        UpdateRuleActionRequest request) {
        return new SyncInvoker<UpdateRuleActionRequest, UpdateRuleActionResponse>(request, IoTDAMeta.updateRuleAction,
            hcClient);
    }

    /**
     * 修改规则状态
     *
     * 应用服务器可调用此接口修改物联网平台中指定规则的状态，激活或者去激活规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeRuleStatusRequest 请求对象
     * @return ChangeRuleStatusResponse
     */
    public ChangeRuleStatusResponse changeRuleStatus(ChangeRuleStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.changeRuleStatus);
    }

    /**
     * 修改规则状态
     *
     * 应用服务器可调用此接口修改物联网平台中指定规则的状态，激活或者去激活规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeRuleStatusRequest 请求对象
     * @return SyncInvoker<ChangeRuleStatusRequest, ChangeRuleStatusResponse>
     */
    public SyncInvoker<ChangeRuleStatusRequest, ChangeRuleStatusResponse> changeRuleStatusInvoker(
        ChangeRuleStatusRequest request) {
        return new SyncInvoker<ChangeRuleStatusRequest, ChangeRuleStatusResponse>(request, IoTDAMeta.changeRuleStatus,
            hcClient);
    }

    /**
     * 创建规则
     *
     * 应用服务器可调用此接口在物联网平台创建一条规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRuleRequest 请求对象
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRule(CreateRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createRule);
    }

    /**
     * 创建规则
     *
     * 应用服务器可调用此接口在物联网平台创建一条规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRuleRequest 请求对象
     * @return SyncInvoker<CreateRuleRequest, CreateRuleResponse>
     */
    public SyncInvoker<CreateRuleRequest, CreateRuleResponse> createRuleInvoker(CreateRuleRequest request) {
        return new SyncInvoker<CreateRuleRequest, CreateRuleResponse>(request, IoTDAMeta.createRule, hcClient);
    }

    /**
     * 删除规则
     *
     * 应用服务器可调用此接口删除物联网平台中的指定规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleRequest 请求对象
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteRule);
    }

    /**
     * 删除规则
     *
     * 应用服务器可调用此接口删除物联网平台中的指定规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleRequest 请求对象
     * @return SyncInvoker<DeleteRuleRequest, DeleteRuleResponse>
     */
    public SyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleInvoker(DeleteRuleRequest request) {
        return new SyncInvoker<DeleteRuleRequest, DeleteRuleResponse>(request, IoTDAMeta.deleteRule, hcClient);
    }

    /**
     * 查询规则列表
     *
     * 应用服务器可调用此接口查询物联网平台中设置的规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRulesRequest 请求对象
     * @return ListRulesResponse
     */
    public ListRulesResponse listRules(ListRulesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listRules);
    }

    /**
     * 查询规则列表
     *
     * 应用服务器可调用此接口查询物联网平台中设置的规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRulesRequest 请求对象
     * @return SyncInvoker<ListRulesRequest, ListRulesResponse>
     */
    public SyncInvoker<ListRulesRequest, ListRulesResponse> listRulesInvoker(ListRulesRequest request) {
        return new SyncInvoker<ListRulesRequest, ListRulesResponse>(request, IoTDAMeta.listRules, hcClient);
    }

    /**
     * 查询规则
     *
     * 应用服务器可调用此接口查询物联网平台中指定规则的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRuleRequest 请求对象
     * @return ShowRuleResponse
     */
    public ShowRuleResponse showRule(ShowRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showRule);
    }

    /**
     * 查询规则
     *
     * 应用服务器可调用此接口查询物联网平台中指定规则的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRuleRequest 请求对象
     * @return SyncInvoker<ShowRuleRequest, ShowRuleResponse>
     */
    public SyncInvoker<ShowRuleRequest, ShowRuleResponse> showRuleInvoker(ShowRuleRequest request) {
        return new SyncInvoker<ShowRuleRequest, ShowRuleResponse>(request, IoTDAMeta.showRule, hcClient);
    }

    /**
     * 修改规则
     *
     * 应用服务器可调用此接口修改物联网平台中指定规则的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRuleRequest 请求对象
     * @return UpdateRuleResponse
     */
    public UpdateRuleResponse updateRule(UpdateRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateRule);
    }

    /**
     * 修改规则
     *
     * 应用服务器可调用此接口修改物联网平台中指定规则的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRuleRequest 请求对象
     * @return SyncInvoker<UpdateRuleRequest, UpdateRuleResponse>
     */
    public SyncInvoker<UpdateRuleRequest, UpdateRuleResponse> updateRuleInvoker(UpdateRuleRequest request) {
        return new SyncInvoker<UpdateRuleRequest, UpdateRuleResponse>(request, IoTDAMeta.updateRule, hcClient);
    }

    /**
     * 按标签查询资源
     *
     * 应用服务器可调用此接口查询绑定了指定标签的资源。当前支持标签的资源有Device(设备)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourcesByTagsRequest 请求对象
     * @return ListResourcesByTagsResponse
     */
    public ListResourcesByTagsResponse listResourcesByTags(ListResourcesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listResourcesByTags);
    }

    /**
     * 按标签查询资源
     *
     * 应用服务器可调用此接口查询绑定了指定标签的资源。当前支持标签的资源有Device(设备)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourcesByTagsRequest 请求对象
     * @return SyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse>
     */
    public SyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse> listResourcesByTagsInvoker(
        ListResourcesByTagsRequest request) {
        return new SyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse>(request,
            IoTDAMeta.listResourcesByTags, hcClient);
    }

    /**
     * 绑定标签
     *
     * 应用服务器可调用此接口为指定资源绑定标签。当前支持标签的资源有Device(设备)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param TagDeviceRequest 请求对象
     * @return TagDeviceResponse
     */
    public TagDeviceResponse tagDevice(TagDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.tagDevice);
    }

    /**
     * 绑定标签
     *
     * 应用服务器可调用此接口为指定资源绑定标签。当前支持标签的资源有Device(设备)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param TagDeviceRequest 请求对象
     * @return SyncInvoker<TagDeviceRequest, TagDeviceResponse>
     */
    public SyncInvoker<TagDeviceRequest, TagDeviceResponse> tagDeviceInvoker(TagDeviceRequest request) {
        return new SyncInvoker<TagDeviceRequest, TagDeviceResponse>(request, IoTDAMeta.tagDevice, hcClient);
    }

    /**
     * 解绑标签
     *
     * 应用服务器可调用此接口为指定资源解绑标签。当前支持标签的资源有Device(设备)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UntagDeviceRequest 请求对象
     * @return UntagDeviceResponse
     */
    public UntagDeviceResponse untagDevice(UntagDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.untagDevice);
    }

    /**
     * 解绑标签
     *
     * 应用服务器可调用此接口为指定资源解绑标签。当前支持标签的资源有Device(设备)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UntagDeviceRequest 请求对象
     * @return SyncInvoker<UntagDeviceRequest, UntagDeviceResponse>
     */
    public SyncInvoker<UntagDeviceRequest, UntagDeviceResponse> untagDeviceInvoker(UntagDeviceRequest request) {
        return new SyncInvoker<UntagDeviceRequest, UntagDeviceResponse>(request, IoTDAMeta.untagDevice, hcClient);
    }

}
