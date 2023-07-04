package com.huaweicloud.sdk.dsc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dsc.v1.model.*;

public class DscClient {

    protected HcClient hcClient;

    public DscClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DscClient> newBuilder() {
        return new ClientBuilder<>(DscClient::new);
    }

    /**
     * 添加资产授权
     *
     * 添加数据资产扫描授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddBucketsRequest 请求对象
     * @return AddBucketsResponse
     */
    public AddBucketsResponse addBuckets(AddBucketsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.addBuckets);
    }

    /**
     * 添加资产授权
     *
     * 添加数据资产扫描授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddBucketsRequest 请求对象
     * @return SyncInvoker<AddBucketsRequest, AddBucketsResponse>
     */
    public SyncInvoker<AddBucketsRequest, AddBucketsResponse> addBucketsInvoker(AddBucketsRequest request) {
        return new SyncInvoker<AddBucketsRequest, AddBucketsResponse>(request, DscMeta.addBuckets, hcClient);
    }

    /**
     * 创建扫描规则
     *
     * 根据指定的规则名称、规则类型、风险等级、最小匹配次数等参数创建自定义的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddRuleRequest 请求对象
     * @return AddRuleResponse
     */
    public AddRuleResponse addRule(AddRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.addRule);
    }

    /**
     * 创建扫描规则
     *
     * 根据指定的规则名称、规则类型、风险等级、最小匹配次数等参数创建自定义的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddRuleRequest 请求对象
     * @return SyncInvoker<AddRuleRequest, AddRuleResponse>
     */
    public SyncInvoker<AddRuleRequest, AddRuleResponse> addRuleInvoker(AddRuleRequest request) {
        return new SyncInvoker<AddRuleRequest, AddRuleResponse>(request, DscMeta.addRule, hcClient);
    }

    /**
     * 创建扫描规则组
     *
     * 根据指定的规则组名称和扫描规则列表创建敏感数据扫描规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddRuleGroupRequest 请求对象
     * @return AddRuleGroupResponse
     */
    public AddRuleGroupResponse addRuleGroup(AddRuleGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.addRuleGroup);
    }

    /**
     * 创建扫描规则组
     *
     * 根据指定的规则组名称和扫描规则列表创建敏感数据扫描规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddRuleGroupRequest 请求对象
     * @return SyncInvoker<AddRuleGroupRequest, AddRuleGroupResponse>
     */
    public SyncInvoker<AddRuleGroupRequest, AddRuleGroupResponse> addRuleGroupInvoker(AddRuleGroupRequest request) {
        return new SyncInvoker<AddRuleGroupRequest, AddRuleGroupResponse>(request, DscMeta.addRuleGroup, hcClient);
    }

    /**
     * 创建扫描任务
     *
     * 根据指定的任务名称、扫描方式、扫描周期、扫描规则组、扫描时间创建扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddScanJobRequest 请求对象
     * @return AddScanJobResponse
     */
    public AddScanJobResponse addScanJob(AddScanJobRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.addScanJob);
    }

    /**
     * 创建扫描任务
     *
     * 根据指定的任务名称、扫描方式、扫描周期、扫描规则组、扫描时间创建扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddScanJobRequest 请求对象
     * @return SyncInvoker<AddScanJobRequest, AddScanJobResponse>
     */
    public SyncInvoker<AddScanJobRequest, AddScanJobResponse> addScanJobInvoker(AddScanJobRequest request) {
        return new SyncInvoker<AddScanJobRequest, AddScanJobResponse>(request, DscMeta.addScanJob, hcClient);
    }

    /**
     * 对数据进行脱敏
     *
     * 对数据进行脱敏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddDataMaskRequest 请求对象
     * @return BatchAddDataMaskResponse
     */
    public BatchAddDataMaskResponse batchAddDataMask(BatchAddDataMaskRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.batchAddDataMask);
    }

    /**
     * 对数据进行脱敏
     *
     * 对数据进行脱敏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddDataMaskRequest 请求对象
     * @return SyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse>
     */
    public SyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse> batchAddDataMaskInvoker(
        BatchAddDataMaskRequest request) {
        return new SyncInvoker<BatchAddDataMaskRequest, BatchAddDataMaskResponse>(request, DscMeta.batchAddDataMask,
            hcClient);
    }

    /**
     * 开启/停止脱敏任务
     *
     * 开启/停止脱敏任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeDbTemplateOperationRequest 请求对象
     * @return ChangeDbTemplateOperationResponse
     */
    public ChangeDbTemplateOperationResponse changeDbTemplateOperation(ChangeDbTemplateOperationRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.changeDbTemplateOperation);
    }

    /**
     * 开启/停止脱敏任务
     *
     * 开启/停止脱敏任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeDbTemplateOperationRequest 请求对象
     * @return SyncInvoker<ChangeDbTemplateOperationRequest, ChangeDbTemplateOperationResponse>
     */
    public SyncInvoker<ChangeDbTemplateOperationRequest, ChangeDbTemplateOperationResponse> changeDbTemplateOperationInvoker(
        ChangeDbTemplateOperationRequest request) {
        return new SyncInvoker<ChangeDbTemplateOperationRequest, ChangeDbTemplateOperationResponse>(request,
            DscMeta.changeDbTemplateOperation, hcClient);
    }

    /**
     * 修改扫描规则
     *
     * 修改自定义的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeRuleRequest 请求对象
     * @return ChangeRuleResponse
     */
    public ChangeRuleResponse changeRule(ChangeRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.changeRule);
    }

    /**
     * 修改扫描规则
     *
     * 修改自定义的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeRuleRequest 请求对象
     * @return SyncInvoker<ChangeRuleRequest, ChangeRuleResponse>
     */
    public SyncInvoker<ChangeRuleRequest, ChangeRuleResponse> changeRuleInvoker(ChangeRuleRequest request) {
        return new SyncInvoker<ChangeRuleRequest, ChangeRuleResponse>(request, DscMeta.changeRule, hcClient);
    }

    /**
     * 嵌入数据水印
     *
     * 对json体中数据动态添加水印
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseWaterMarkRequest 请求对象
     * @return CreateDatabaseWaterMarkResponse
     */
    public CreateDatabaseWaterMarkResponse createDatabaseWaterMark(CreateDatabaseWaterMarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createDatabaseWaterMark);
    }

    /**
     * 嵌入数据水印
     *
     * 对json体中数据动态添加水印
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseWaterMarkRequest 请求对象
     * @return SyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse>
     */
    public SyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> createDatabaseWaterMarkInvoker(
        CreateDatabaseWaterMarkRequest request) {
        return new SyncInvoker<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse>(request,
            DscMeta.createDatabaseWaterMark, hcClient);
    }

    /**
     * 文档嵌入水印
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf) 类型的文件嵌入文字暗水印、文字明水印或者图片明水印，用户以formData的格式传入待加水印的文件和水印相关信息，DSC服务给文件加完水印后返回给用户已嵌入水印的文件的二进制流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDocWatermarkRequest 请求对象
     * @return CreateDocWatermarkResponse
     */
    public CreateDocWatermarkResponse createDocWatermark(CreateDocWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createDocWatermark);
    }

    /**
     * 文档嵌入水印
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf) 类型的文件嵌入文字暗水印、文字明水印或者图片明水印，用户以formData的格式传入待加水印的文件和水印相关信息，DSC服务给文件加完水印后返回给用户已嵌入水印的文件的二进制流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDocWatermarkRequest 请求对象
     * @return SyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse>
     */
    public SyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse> createDocWatermarkInvoker(
        CreateDocWatermarkRequest request) {
        return new SyncInvoker<CreateDocWatermarkRequest, CreateDocWatermarkResponse>(request,
            DscMeta.createDocWatermark, hcClient);
    }

    /**
     * 文档嵌入水印（文件地址版本）
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)*类型的文档嵌入文字暗水印、文字明水印或者图片明水印，用户传入待加水印的文档地址（目前支持OBS)和水印相关信息，DSC服务对文档加完水印后返回给用户已嵌入水印的文档的存放地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDocWatermarkByAddressRequest 请求对象
     * @return CreateDocWatermarkByAddressResponse
     */
    public CreateDocWatermarkByAddressResponse createDocWatermarkByAddress(CreateDocWatermarkByAddressRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createDocWatermarkByAddress);
    }

    /**
     * 文档嵌入水印（文件地址版本）
     *
     * 对WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)*类型的文档嵌入文字暗水印、文字明水印或者图片明水印，用户传入待加水印的文档地址（目前支持OBS)和水印相关信息，DSC服务对文档加完水印后返回给用户已嵌入水印的文档的存放地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDocWatermarkByAddressRequest 请求对象
     * @return SyncInvoker<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse>
     */
    public SyncInvoker<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse> createDocWatermarkByAddressInvoker(
        CreateDocWatermarkByAddressRequest request) {
        return new SyncInvoker<CreateDocWatermarkByAddressRequest, CreateDocWatermarkByAddressResponse>(request,
            DscMeta.createDocWatermarkByAddress, hcClient);
    }

    /**
     * 图片嵌入暗水印
     *
     * 对图片嵌入文字暗水印或者图片暗水印，用户以formData的格式传入待加水印图片和水印相关信息，DSC服务对图片加完水印后返回给用户已嵌入水印的图片二进制流，目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageWatermarkRequest 请求对象
     * @return CreateImageWatermarkResponse
     */
    public CreateImageWatermarkResponse createImageWatermark(CreateImageWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createImageWatermark);
    }

    /**
     * 图片嵌入暗水印
     *
     * 对图片嵌入文字暗水印或者图片暗水印，用户以formData的格式传入待加水印图片和水印相关信息，DSC服务对图片加完水印后返回给用户已嵌入水印的图片二进制流，目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageWatermarkRequest 请求对象
     * @return SyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse>
     */
    public SyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse> createImageWatermarkInvoker(
        CreateImageWatermarkRequest request) {
        return new SyncInvoker<CreateImageWatermarkRequest, CreateImageWatermarkResponse>(request,
            DscMeta.createImageWatermark, hcClient);
    }

    /**
     * 图片嵌入暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的图片嵌入文字暗水印或者图片暗水印，已嵌入的水印的图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageWatermarkByAddressRequest 请求对象
     * @return CreateImageWatermarkByAddressResponse
     */
    public CreateImageWatermarkByAddressResponse createImageWatermarkByAddress(
        CreateImageWatermarkByAddressRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createImageWatermarkByAddress);
    }

    /**
     * 图片嵌入暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的图片嵌入文字暗水印或者图片暗水印，已嵌入的水印的图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageWatermarkByAddressRequest 请求对象
     * @return SyncInvoker<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse>
     */
    public SyncInvoker<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse> createImageWatermarkByAddressInvoker(
        CreateImageWatermarkByAddressRequest request) {
        return new SyncInvoker<CreateImageWatermarkByAddressRequest, CreateImageWatermarkByAddressResponse>(request,
            DscMeta.createImageWatermarkByAddress, hcClient);
    }

    /**
     * 实例下单
     *
     * 根据计费方式、计费周期等信息进行实例下单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProductOrderRequest 请求对象
     * @return CreateProductOrderResponse
     */
    public CreateProductOrderResponse createProductOrder(CreateProductOrderRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.createProductOrder);
    }

    /**
     * 实例下单
     *
     * 根据计费方式、计费周期等信息进行实例下单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProductOrderRequest 请求对象
     * @return SyncInvoker<CreateProductOrderRequest, CreateProductOrderResponse>
     */
    public SyncInvoker<CreateProductOrderRequest, CreateProductOrderResponse> createProductOrderInvoker(
        CreateProductOrderRequest request) {
        return new SyncInvoker<CreateProductOrderRequest, CreateProductOrderResponse>(request,
            DscMeta.createProductOrder, hcClient);
    }

    /**
     * 删除资产授权
     *
     * 删除数据资产扫描授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBucketRequest 请求对象
     * @return DeleteBucketResponse
     */
    public DeleteBucketResponse deleteBucket(DeleteBucketRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.deleteBucket);
    }

    /**
     * 删除资产授权
     *
     * 删除数据资产扫描授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBucketRequest 请求对象
     * @return SyncInvoker<DeleteBucketRequest, DeleteBucketResponse>
     */
    public SyncInvoker<DeleteBucketRequest, DeleteBucketResponse> deleteBucketInvoker(DeleteBucketRequest request) {
        return new SyncInvoker<DeleteBucketRequest, DeleteBucketResponse>(request, DscMeta.deleteBucket, hcClient);
    }

    /**
     * 删除扫描规则
     *
     * 删除指定的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleRequest 请求对象
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.deleteRule);
    }

    /**
     * 删除扫描规则
     *
     * 删除指定的敏感数据识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleRequest 请求对象
     * @return SyncInvoker<DeleteRuleRequest, DeleteRuleResponse>
     */
    public SyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleInvoker(DeleteRuleRequest request) {
        return new SyncInvoker<DeleteRuleRequest, DeleteRuleResponse>(request, DscMeta.deleteRule, hcClient);
    }

    /**
     * 删除扫描规则组
     *
     * 根据扫描规则组ID删除指定的扫描规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleGroupRequest 请求对象
     * @return DeleteRuleGroupResponse
     */
    public DeleteRuleGroupResponse deleteRuleGroup(DeleteRuleGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.deleteRuleGroup);
    }

    /**
     * 删除扫描规则组
     *
     * 根据扫描规则组ID删除指定的扫描规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleGroupRequest 请求对象
     * @return SyncInvoker<DeleteRuleGroupRequest, DeleteRuleGroupResponse>
     */
    public SyncInvoker<DeleteRuleGroupRequest, DeleteRuleGroupResponse> deleteRuleGroupInvoker(
        DeleteRuleGroupRequest request) {
        return new SyncInvoker<DeleteRuleGroupRequest, DeleteRuleGroupResponse>(request, DscMeta.deleteRuleGroup,
            hcClient);
    }

    /**
     * 查看资产列表
     *
     * 查询数据资产扫描授权列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBucketsRequest 请求对象
     * @return ListBucketsResponse
     */
    public ListBucketsResponse listBuckets(ListBucketsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.listBuckets);
    }

    /**
     * 查看资产列表
     *
     * 查询数据资产扫描授权列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBucketsRequest 请求对象
     * @return SyncInvoker<ListBucketsRequest, ListBucketsResponse>
     */
    public SyncInvoker<ListBucketsRequest, ListBucketsResponse> listBucketsInvoker(ListBucketsRequest request) {
        return new SyncInvoker<ListBucketsRequest, ListBucketsResponse>(request, DscMeta.listBuckets, hcClient);
    }

    /**
     * 查询脱敏任务执行列表
     *
     * 查询脱敏任务执行列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDbMaskTaskRequest 请求对象
     * @return ListDbMaskTaskResponse
     */
    public ListDbMaskTaskResponse listDbMaskTask(ListDbMaskTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.listDbMaskTask);
    }

    /**
     * 查询脱敏任务执行列表
     *
     * 查询脱敏任务执行列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDbMaskTaskRequest 请求对象
     * @return SyncInvoker<ListDbMaskTaskRequest, ListDbMaskTaskResponse>
     */
    public SyncInvoker<ListDbMaskTaskRequest, ListDbMaskTaskResponse> listDbMaskTaskInvoker(
        ListDbMaskTaskRequest request) {
        return new SyncInvoker<ListDbMaskTaskRequest, ListDbMaskTaskResponse>(request, DscMeta.listDbMaskTask,
            hcClient);
    }

    /**
     * OBS血缘图桶级查询
     *
     * OBS血缘图桶级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationBucketsRequest 请求对象
     * @return ListRelationBucketsResponse
     */
    public ListRelationBucketsResponse listRelationBuckets(ListRelationBucketsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.listRelationBuckets);
    }

    /**
     * OBS血缘图桶级查询
     *
     * OBS血缘图桶级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationBucketsRequest 请求对象
     * @return SyncInvoker<ListRelationBucketsRequest, ListRelationBucketsResponse>
     */
    public SyncInvoker<ListRelationBucketsRequest, ListRelationBucketsResponse> listRelationBucketsInvoker(
        ListRelationBucketsRequest request) {
        return new SyncInvoker<ListRelationBucketsRequest, ListRelationBucketsResponse>(request,
            DscMeta.listRelationBuckets, hcClient);
    }

    /**
     * 数据库血缘图表字段级查询
     *
     * 数据库血缘图表字段级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationColumnRequest 请求对象
     * @return ListRelationColumnResponse
     */
    public ListRelationColumnResponse listRelationColumn(ListRelationColumnRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.listRelationColumn);
    }

    /**
     * 数据库血缘图表字段级查询
     *
     * 数据库血缘图表字段级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationColumnRequest 请求对象
     * @return SyncInvoker<ListRelationColumnRequest, ListRelationColumnResponse>
     */
    public SyncInvoker<ListRelationColumnRequest, ListRelationColumnResponse> listRelationColumnInvoker(
        ListRelationColumnRequest request) {
        return new SyncInvoker<ListRelationColumnRequest, ListRelationColumnResponse>(request,
            DscMeta.listRelationColumn, hcClient);
    }

    /**
     * 数据库血缘图数据库级查询
     *
     * 数据库血缘图数据库级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationDbRequest 请求对象
     * @return ListRelationDbResponse
     */
    public ListRelationDbResponse listRelationDb(ListRelationDbRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.listRelationDb);
    }

    /**
     * 数据库血缘图数据库级查询
     *
     * 数据库血缘图数据库级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationDbRequest 请求对象
     * @return SyncInvoker<ListRelationDbRequest, ListRelationDbResponse>
     */
    public SyncInvoker<ListRelationDbRequest, ListRelationDbResponse> listRelationDbInvoker(
        ListRelationDbRequest request) {
        return new SyncInvoker<ListRelationDbRequest, ListRelationDbResponse>(request, DscMeta.listRelationDb,
            hcClient);
    }

    /**
     * OBS血缘图文件分页查询
     *
     * OBS血缘图文件分页查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationFileRequest 请求对象
     * @return ListRelationFileResponse
     */
    public ListRelationFileResponse listRelationFile(ListRelationFileRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.listRelationFile);
    }

    /**
     * OBS血缘图文件分页查询
     *
     * OBS血缘图文件分页查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationFileRequest 请求对象
     * @return SyncInvoker<ListRelationFileRequest, ListRelationFileResponse>
     */
    public SyncInvoker<ListRelationFileRequest, ListRelationFileResponse> listRelationFileInvoker(
        ListRelationFileRequest request) {
        return new SyncInvoker<ListRelationFileRequest, ListRelationFileResponse>(request, DscMeta.listRelationFile,
            hcClient);
    }

    /**
     * 数据库血缘图表分页查询
     *
     * 数据库血缘图表分页查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationTableRequest 请求对象
     * @return ListRelationTableResponse
     */
    public ListRelationTableResponse listRelationTable(ListRelationTableRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.listRelationTable);
    }

    /**
     * 数据库血缘图表分页查询
     *
     * 数据库血缘图表分页查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationTableRequest 请求对象
     * @return SyncInvoker<ListRelationTableRequest, ListRelationTableResponse>
     */
    public SyncInvoker<ListRelationTableRequest, ListRelationTableResponse> listRelationTableInvoker(
        ListRelationTableRequest request) {
        return new SyncInvoker<ListRelationTableRequest, ListRelationTableResponse>(request, DscMeta.listRelationTable,
            hcClient);
    }

    /**
     * 查询扫描规则组列表
     *
     * 根据指定的项目ID查询扫描规则组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleGroupsRequest 请求对象
     * @return ListRuleGroupsResponse
     */
    public ListRuleGroupsResponse listRuleGroups(ListRuleGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.listRuleGroups);
    }

    /**
     * 查询扫描规则组列表
     *
     * 根据指定的项目ID查询扫描规则组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleGroupsRequest 请求对象
     * @return SyncInvoker<ListRuleGroupsRequest, ListRuleGroupsResponse>
     */
    public SyncInvoker<ListRuleGroupsRequest, ListRuleGroupsResponse> listRuleGroupsInvoker(
        ListRuleGroupsRequest request) {
        return new SyncInvoker<ListRuleGroupsRequest, ListRuleGroupsResponse>(request, DscMeta.listRuleGroups,
            hcClient);
    }

    /**
     * 提取数据水印
     *
     * 提取请求数据中水印内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatabaseWaterMarkRequest 请求对象
     * @return ShowDatabaseWaterMarkResponse
     */
    public ShowDatabaseWaterMarkResponse showDatabaseWaterMark(ShowDatabaseWaterMarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showDatabaseWaterMark);
    }

    /**
     * 提取数据水印
     *
     * 提取请求数据中水印内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatabaseWaterMarkRequest 请求对象
     * @return SyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse>
     */
    public SyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> showDatabaseWaterMarkInvoker(
        ShowDatabaseWaterMarkRequest request) {
        return new SyncInvoker<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse>(request,
            DscMeta.showDatabaseWaterMark, hcClient);
    }

    /**
     * 文档提取暗水印
     *
     * 对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行文字暗水印提取，用户以formData的格式传入待提取水印的文件，DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDocWatermarkRequest 请求对象
     * @return ShowDocWatermarkResponse
     */
    public ShowDocWatermarkResponse showDocWatermark(ShowDocWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showDocWatermark);
    }

    /**
     * 文档提取暗水印
     *
     * 对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行文字暗水印提取，用户以formData的格式传入待提取水印的文件，DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDocWatermarkRequest 请求对象
     * @return SyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse>
     */
    public SyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse> showDocWatermarkInvoker(
        ShowDocWatermarkRequest request) {
        return new SyncInvoker<ShowDocWatermarkRequest, ShowDocWatermarkResponse>(request, DscMeta.showDocWatermark,
            hcClient);
    }

    /**
     * 文档提取暗水印（文档地址版本）
     *
     * 支持对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行水印提取，用户传入待提取水印的文档地址（目前支持OBS），DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDocWatermarkByAddressRequest 请求对象
     * @return ShowDocWatermarkByAddressResponse
     */
    public ShowDocWatermarkByAddressResponse showDocWatermarkByAddress(ShowDocWatermarkByAddressRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showDocWatermarkByAddress);
    }

    /**
     * 文档提取暗水印（文档地址版本）
     *
     * 支持对已嵌入文字暗水印的WORD(.docx)，PPT(.pptx)，EXCEL(.xlsx)，PDF(.pdf)类型的文档进行水印提取，用户传入待提取水印的文档地址（目前支持OBS），DSC服务以JSON的格式返回从文档里提取的出的文字暗水印内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDocWatermarkByAddressRequest 请求对象
     * @return SyncInvoker<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse>
     */
    public SyncInvoker<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse> showDocWatermarkByAddressInvoker(
        ShowDocWatermarkByAddressRequest request) {
        return new SyncInvoker<ShowDocWatermarkByAddressRequest, ShowDocWatermarkByAddressResponse>(request,
            DscMeta.showDocWatermarkByAddress, hcClient);
    }

    /**
     * 提取图片中的文字暗水印
     *
     * 对已嵌入文字暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以JSON的格式返回从图片里提取的出的文字暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkRequest 请求对象
     * @return ShowImageWatermarkResponse
     */
    public ShowImageWatermarkResponse showImageWatermark(ShowImageWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showImageWatermark);
    }

    /**
     * 提取图片中的文字暗水印
     *
     * 对已嵌入文字暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以JSON的格式返回从图片里提取的出的文字暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkRequest 请求对象
     * @return SyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse>
     */
    public SyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse> showImageWatermarkInvoker(
        ShowImageWatermarkRequest request) {
        return new SyncInvoker<ShowImageWatermarkRequest, ShowImageWatermarkResponse>(request,
            DscMeta.showImageWatermark, hcClient);
    }

    /**
     * 提取图片中的文字暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入文字暗水印的图片提取文字暗水印，支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkByAddressRequest 请求对象
     * @return ShowImageWatermarkByAddressResponse
     */
    public ShowImageWatermarkByAddressResponse showImageWatermarkByAddress(ShowImageWatermarkByAddressRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showImageWatermarkByAddress);
    }

    /**
     * 提取图片中的文字暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入文字暗水印的图片提取文字暗水印，支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkByAddressRequest 请求对象
     * @return SyncInvoker<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse>
     */
    public SyncInvoker<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse> showImageWatermarkByAddressInvoker(
        ShowImageWatermarkByAddressRequest request) {
        return new SyncInvoker<ShowImageWatermarkByAddressRequest, ShowImageWatermarkByAddressResponse>(request,
            DscMeta.showImageWatermarkByAddress, hcClient);
    }

    /**
     * 提取图片中的图片暗水印
     *
     * 对已嵌入图片暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以图片二进制流的格式返回从图片里提取的出的图片暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkWithImageRequest 请求对象
     * @return ShowImageWatermarkWithImageResponse
     */
    public ShowImageWatermarkWithImageResponse showImageWatermarkWithImage(ShowImageWatermarkWithImageRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showImageWatermarkWithImage);
    }

    /**
     * 提取图片中的图片暗水印
     *
     * 对已嵌入图片暗水印的图片进行水印提取，用户以formData的格式传入待提取水印的图片，DSC服务以图片二进制流的格式返回从图片里提取的出的图片暗水印。目前支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkWithImageRequest 请求对象
     * @return SyncInvoker<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse>
     */
    public SyncInvoker<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse> showImageWatermarkWithImageInvoker(
        ShowImageWatermarkWithImageRequest request) {
        return new SyncInvoker<ShowImageWatermarkWithImageRequest, ShowImageWatermarkWithImageResponse>(request,
            DscMeta.showImageWatermarkWithImage, hcClient);
    }

    /**
     * 提取图片中的图片暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入图片暗水印的图片提取图片暗水印，提取出的水印图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkWithImageByAddressRequest 请求对象
     * @return ShowImageWatermarkWithImageByAddressResponse
     */
    public ShowImageWatermarkWithImageByAddressResponse showImageWatermarkWithImageByAddress(
        ShowImageWatermarkWithImageByAddressRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showImageWatermarkWithImageByAddress);
    }

    /**
     * 提取图片中的图片暗水印（文件地址版本）
     *
     * 对指定存储地址信息（目前支持华为云OBS）的已嵌入图片暗水印的图片提取图片暗水印，提取出的水印图片将存放在用户指定的位置（目前支持华为云OBS），支持的图片格式为：*.jpg, *.jpeg, *.jpe, *.png, *.bmp, *.dib, *.rle, *.tiff, *.tif, *.ppm, *.webp, *.tga, *.tpic, *.gif。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageWatermarkWithImageByAddressRequest 请求对象
     * @return SyncInvoker<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse>
     */
    public SyncInvoker<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse> showImageWatermarkWithImageByAddressInvoker(
        ShowImageWatermarkWithImageByAddressRequest request) {
        return new SyncInvoker<ShowImageWatermarkWithImageByAddressRequest, ShowImageWatermarkWithImageByAddressResponse>(
            request, DscMeta.showImageWatermarkWithImageByAddress, hcClient);
    }

    /**
     * 查看规则列表
     *
     * 查询扫描规则列表，返回扫描规则总数和扫描规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRulesRequest 请求对象
     * @return ShowRulesResponse
     */
    public ShowRulesResponse showRules(ShowRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showRules);
    }

    /**
     * 查看规则列表
     *
     * 查询扫描规则列表，返回扫描规则总数和扫描规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRulesRequest 请求对象
     * @return SyncInvoker<ShowRulesRequest, ShowRulesResponse>
     */
    public SyncInvoker<ShowRulesRequest, ShowRulesResponse> showRulesInvoker(ShowRulesRequest request) {
        return new SyncInvoker<ShowRulesRequest, ShowRulesResponse>(request, DscMeta.showRules, hcClient);
    }

    /**
     * 查询指定任务扫描结果
     *
     * 查询指定任务扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowScanJobResultsRequest 请求对象
     * @return ShowScanJobResultsResponse
     */
    public ShowScanJobResultsResponse showScanJobResults(ShowScanJobResultsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showScanJobResults);
    }

    /**
     * 查询指定任务扫描结果
     *
     * 查询指定任务扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowScanJobResultsRequest 请求对象
     * @return SyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse>
     */
    public SyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse> showScanJobResultsInvoker(
        ShowScanJobResultsRequest request) {
        return new SyncInvoker<ShowScanJobResultsRequest, ShowScanJobResultsResponse>(request,
            DscMeta.showScanJobResults, hcClient);
    }

    /**
     * 查询扫描任务列表
     *
     * 查询扫描任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowScanJobsRequest 请求对象
     * @return ShowScanJobsResponse
     */
    public ShowScanJobsResponse showScanJobs(ShowScanJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showScanJobs);
    }

    /**
     * 查询扫描任务列表
     *
     * 查询扫描任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowScanJobsRequest 请求对象
     * @return SyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse>
     */
    public SyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse> showScanJobsInvoker(ShowScanJobsRequest request) {
        return new SyncInvoker<ShowScanJobsRequest, ShowScanJobsResponse>(request, DscMeta.showScanJobs, hcClient);
    }

    /**
     * 查询资源开通信息
     *
     * 查询资源开通信息，根据项目ID查询订单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSpecificationRequest 请求对象
     * @return ShowSpecificationResponse
     */
    public ShowSpecificationResponse showSpecification(ShowSpecificationRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showSpecification);
    }

    /**
     * 查询资源开通信息
     *
     * 查询资源开通信息，根据项目ID查询订单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSpecificationRequest 请求对象
     * @return SyncInvoker<ShowSpecificationRequest, ShowSpecificationResponse>
     */
    public SyncInvoker<ShowSpecificationRequest, ShowSpecificationResponse> showSpecificationInvoker(
        ShowSpecificationRequest request) {
        return new SyncInvoker<ShowSpecificationRequest, ShowSpecificationResponse>(request, DscMeta.showSpecification,
            hcClient);
    }

    /**
     * 查询告警通知主题
     *
     * 查询告警通知主题，返回默认主题、已确认主题数量及列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTopicsRequest 请求对象
     * @return ShowTopicsResponse
     */
    public ShowTopicsResponse showTopics(ShowTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showTopics);
    }

    /**
     * 查询告警通知主题
     *
     * 查询告警通知主题，返回默认主题、已确认主题数量及列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTopicsRequest 请求对象
     * @return SyncInvoker<ShowTopicsRequest, ShowTopicsResponse>
     */
    public SyncInvoker<ShowTopicsRequest, ShowTopicsResponse> showTopicsInvoker(ShowTopicsRequest request) {
        return new SyncInvoker<ShowTopicsRequest, ShowTopicsResponse>(request, DscMeta.showTopics, hcClient);
    }

    /**
     * 编辑资产名称
     *
     * 编辑数据资产名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssetNameRequest 请求对象
     * @return UpdateAssetNameResponse
     */
    public UpdateAssetNameResponse updateAssetName(UpdateAssetNameRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.updateAssetName);
    }

    /**
     * 编辑资产名称
     *
     * 编辑数据资产名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssetNameRequest 请求对象
     * @return SyncInvoker<UpdateAssetNameRequest, UpdateAssetNameResponse>
     */
    public SyncInvoker<UpdateAssetNameRequest, UpdateAssetNameResponse> updateAssetNameInvoker(
        UpdateAssetNameRequest request) {
        return new SyncInvoker<UpdateAssetNameRequest, UpdateAssetNameResponse>(request, DscMeta.updateAssetName,
            hcClient);
    }

    /**
     * 修改告警通知主题
     *
     * 修改告警通知的关联项目ID、通知主题、通知状态(0为关闭通知，1为开启通知)等通用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDefaultTopicRequest 请求对象
     * @return UpdateDefaultTopicResponse
     */
    public UpdateDefaultTopicResponse updateDefaultTopic(UpdateDefaultTopicRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.updateDefaultTopic);
    }

    /**
     * 修改告警通知主题
     *
     * 修改告警通知的关联项目ID、通知主题、通知状态(0为关闭通知，1为开启通知)等通用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDefaultTopicRequest 请求对象
     * @return SyncInvoker<UpdateDefaultTopicRequest, UpdateDefaultTopicResponse>
     */
    public SyncInvoker<UpdateDefaultTopicRequest, UpdateDefaultTopicResponse> updateDefaultTopicInvoker(
        UpdateDefaultTopicRequest request) {
        return new SyncInvoker<UpdateDefaultTopicRequest, UpdateDefaultTopicResponse>(request,
            DscMeta.updateDefaultTopic, hcClient);
    }

    /**
     * 查询OpenApi调用记录
     *
     * 查询OpenApi调用记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOpenApiCalledRecordsRequest 请求对象
     * @return ShowOpenApiCalledRecordsResponse
     */
    public ShowOpenApiCalledRecordsResponse showOpenApiCalledRecords(ShowOpenApiCalledRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DscMeta.showOpenApiCalledRecords);
    }

    /**
     * 查询OpenApi调用记录
     *
     * 查询OpenApi调用记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOpenApiCalledRecordsRequest 请求对象
     * @return SyncInvoker<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse>
     */
    public SyncInvoker<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse> showOpenApiCalledRecordsInvoker(
        ShowOpenApiCalledRecordsRequest request) {
        return new SyncInvoker<ShowOpenApiCalledRecordsRequest, ShowOpenApiCalledRecordsResponse>(request,
            DscMeta.showOpenApiCalledRecords, hcClient);
    }

}
