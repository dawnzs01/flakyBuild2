package com.huaweicloud.sdk.cloudtest.v1;

import com.huaweicloud.sdk.cloudtest.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CloudtestClient {

    protected HcClient hcClient;

    public CloudtestClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudtestClient> newBuilder() {
        return new ClientBuilder<>(CloudtestClient::new);
    }

    /**
     * 批量删除自定义测试服务类型用例
     *
     * 批量删除自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTestCaseRequest 请求对象
     * @return BatchDeleteTestCaseResponse
     */
    public BatchDeleteTestCaseResponse batchDeleteTestCase(BatchDeleteTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.batchDeleteTestCase);
    }

    /**
     * 批量删除自定义测试服务类型用例
     *
     * 批量删除自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTestCaseRequest 请求对象
     * @return SyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse>
     */
    public SyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse> batchDeleteTestCaseInvoker(
        BatchDeleteTestCaseRequest request) {
        return new SyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse>(request,
            CloudtestMeta.batchDeleteTestCase, hcClient);
    }

    /**
     * 项目下创建计划
     *
     * 项目下创建计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlanRequest 请求对象
     * @return CreatePlanResponse
     */
    public CreatePlanResponse createPlan(CreatePlanRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createPlan);
    }

    /**
     * 项目下创建计划
     *
     * 项目下创建计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlanRequest 请求对象
     * @return SyncInvoker<CreatePlanRequest, CreatePlanResponse>
     */
    public SyncInvoker<CreatePlanRequest, CreatePlanResponse> createPlanInvoker(CreatePlanRequest request) {
        return new SyncInvoker<CreatePlanRequest, CreatePlanResponse>(request, CloudtestMeta.createPlan, hcClient);
    }

    /**
     * 新测试类型服务注册
     *
     * 通过接口CreateService注册成为自定义服务。 注册完成后界面将会出现此自定义测试类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateServiceRequest 请求对象
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createService(CreateServiceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createService);
    }

    /**
     * 新测试类型服务注册
     *
     * 通过接口CreateService注册成为自定义服务。 注册完成后界面将会出现此自定义测试类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateServiceRequest 请求对象
     * @return SyncInvoker<CreateServiceRequest, CreateServiceResponse>
     */
    public SyncInvoker<CreateServiceRequest, CreateServiceResponse> createServiceInvoker(CreateServiceRequest request) {
        return new SyncInvoker<CreateServiceRequest, CreateServiceResponse>(request, CloudtestMeta.createService,
            hcClient);
    }

    /**
     * 创建自定义测试服务类型用例
     *
     * 创建自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTestCaseRequest 请求对象
     * @return CreateTestCaseResponse
     */
    public CreateTestCaseResponse createTestCase(CreateTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createTestCase);
    }

    /**
     * 创建自定义测试服务类型用例
     *
     * 创建自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTestCaseRequest 请求对象
     * @return SyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse>
     */
    public SyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse> createTestCaseInvoker(
        CreateTestCaseRequest request) {
        return new SyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse>(request, CloudtestMeta.createTestCase,
            hcClient);
    }

    /**
     * 计划中批量添加测试用例
     *
     * 计划中批量添加测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTestCaseInPlanRequest 请求对象
     * @return CreateTestCaseInPlanResponse
     */
    public CreateTestCaseInPlanResponse createTestCaseInPlan(CreateTestCaseInPlanRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createTestCaseInPlan);
    }

    /**
     * 计划中批量添加测试用例
     *
     * 计划中批量添加测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTestCaseInPlanRequest 请求对象
     * @return SyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse>
     */
    public SyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse> createTestCaseInPlanInvoker(
        CreateTestCaseInPlanRequest request) {
        return new SyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse>(request,
            CloudtestMeta.createTestCaseInPlan, hcClient);
    }

    /**
     * 删除已注册服务
     *
     * 删除已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceRequest 请求对象
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteService(DeleteServiceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.deleteService);
    }

    /**
     * 删除已注册服务
     *
     * 删除已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceRequest 请求对象
     * @return SyncInvoker<DeleteServiceRequest, DeleteServiceResponse>
     */
    public SyncInvoker<DeleteServiceRequest, DeleteServiceResponse> deleteServiceInvoker(DeleteServiceRequest request) {
        return new SyncInvoker<DeleteServiceRequest, DeleteServiceResponse>(request, CloudtestMeta.deleteService,
            hcClient);
    }

    /**
     * 批量执行测试用例
     *
     * 批量执行测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunTestCaseRequest 请求对象
     * @return RunTestCaseResponse
     */
    public RunTestCaseResponse runTestCase(RunTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.runTestCase);
    }

    /**
     * 批量执行测试用例
     *
     * 批量执行测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunTestCaseRequest 请求对象
     * @return SyncInvoker<RunTestCaseRequest, RunTestCaseResponse>
     */
    public SyncInvoker<RunTestCaseRequest, RunTestCaseResponse> runTestCaseInvoker(RunTestCaseRequest request) {
        return new SyncInvoker<RunTestCaseRequest, RunTestCaseResponse>(request, CloudtestMeta.runTestCase, hcClient);
    }

    /**
     * 查询某个测试计划下的需求树
     *
     * 查询某个测试计划下的需求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIssuesByPlanIdRequest 请求对象
     * @return ShowIssuesByPlanIdResponse
     */
    public ShowIssuesByPlanIdResponse showIssuesByPlanId(ShowIssuesByPlanIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showIssuesByPlanId);
    }

    /**
     * 查询某个测试计划下的需求树
     *
     * 查询某个测试计划下的需求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIssuesByPlanIdRequest 请求对象
     * @return SyncInvoker<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse>
     */
    public SyncInvoker<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse> showIssuesByPlanIdInvoker(
        ShowIssuesByPlanIdRequest request) {
        return new SyncInvoker<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse>(request,
            CloudtestMeta.showIssuesByPlanId, hcClient);
    }

    /**
     * 查询某测试计划下的操作历史
     *
     * 查询某测试计划下的操作历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlanJournalsRequest 请求对象
     * @return ShowPlanJournalsResponse
     */
    public ShowPlanJournalsResponse showPlanJournals(ShowPlanJournalsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showPlanJournals);
    }

    /**
     * 查询某测试计划下的操作历史
     *
     * 查询某测试计划下的操作历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlanJournalsRequest 请求对象
     * @return SyncInvoker<ShowPlanJournalsRequest, ShowPlanJournalsResponse>
     */
    public SyncInvoker<ShowPlanJournalsRequest, ShowPlanJournalsResponse> showPlanJournalsInvoker(
        ShowPlanJournalsRequest request) {
        return new SyncInvoker<ShowPlanJournalsRequest, ShowPlanJournalsResponse>(request,
            CloudtestMeta.showPlanJournals, hcClient);
    }

    /**
     * 项目下查询测试计划列表v2
     *
     * 项目下查询测试计划列表v2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlanListRequest 请求对象
     * @return ShowPlanListResponse
     */
    public ShowPlanListResponse showPlanList(ShowPlanListRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showPlanList);
    }

    /**
     * 项目下查询测试计划列表v2
     *
     * 项目下查询测试计划列表v2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlanListRequest 请求对象
     * @return SyncInvoker<ShowPlanListRequest, ShowPlanListResponse>
     */
    public SyncInvoker<ShowPlanListRequest, ShowPlanListResponse> showPlanListInvoker(ShowPlanListRequest request) {
        return new SyncInvoker<ShowPlanListRequest, ShowPlanListResponse>(request, CloudtestMeta.showPlanList,
            hcClient);
    }

    /**
     * 项目下查询测试计划列表
     *
     * 项目下查询测试计划列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlansRequest 请求对象
     * @return ShowPlansResponse
     */
    public ShowPlansResponse showPlans(ShowPlansRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showPlans);
    }

    /**
     * 项目下查询测试计划列表
     *
     * 项目下查询测试计划列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlansRequest 请求对象
     * @return SyncInvoker<ShowPlansRequest, ShowPlansResponse>
     */
    public SyncInvoker<ShowPlansRequest, ShowPlansResponse> showPlansInvoker(ShowPlansRequest request) {
        return new SyncInvoker<ShowPlansRequest, ShowPlansResponse>(request, CloudtestMeta.showPlans, hcClient);
    }

    /**
     * 用户获取自己当前已经注册的服务
     *
     * 用户获取自己当前已经注册的服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRegisterServiceRequest 请求对象
     * @return ShowRegisterServiceResponse
     */
    public ShowRegisterServiceResponse showRegisterService(ShowRegisterServiceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showRegisterService);
    }

    /**
     * 用户获取自己当前已经注册的服务
     *
     * 用户获取自己当前已经注册的服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRegisterServiceRequest 请求对象
     * @return SyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse>
     */
    public SyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse> showRegisterServiceInvoker(
        ShowRegisterServiceRequest request) {
        return new SyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse>(request,
            CloudtestMeta.showRegisterService, hcClient);
    }

    /**
     * 实时计算单个自定义报表
     *
     * 实时计算单个自定义报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReportRequest 请求对象
     * @return ShowReportResponse
     */
    public ShowReportResponse showReport(ShowReportRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showReport);
    }

    /**
     * 实时计算单个自定义报表
     *
     * 实时计算单个自定义报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReportRequest 请求对象
     * @return SyncInvoker<ShowReportRequest, ShowReportResponse>
     */
    public SyncInvoker<ShowReportRequest, ShowReportResponse> showReportInvoker(ShowReportRequest request) {
        return new SyncInvoker<ShowReportRequest, ShowReportResponse>(request, CloudtestMeta.showReport, hcClient);
    }

    /**
     * 获取测试用例详情
     *
     * 获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTestCaseDetailRequest 请求对象
     * @return ShowTestCaseDetailResponse
     */
    public ShowTestCaseDetailResponse showTestCaseDetail(ShowTestCaseDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTestCaseDetail);
    }

    /**
     * 获取测试用例详情
     *
     * 获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTestCaseDetailRequest 请求对象
     * @return SyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse>
     */
    public SyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse> showTestCaseDetailInvoker(
        ShowTestCaseDetailRequest request) {
        return new SyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse>(request,
            CloudtestMeta.showTestCaseDetail, hcClient);
    }

    /**
     * 通过用例编号获取测试用例详情
     *
     * 通过用例编号获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTestCaseDetailV2Request 请求对象
     * @return ShowTestCaseDetailV2Response
     */
    public ShowTestCaseDetailV2Response showTestCaseDetailV2(ShowTestCaseDetailV2Request request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTestCaseDetailV2);
    }

    /**
     * 通过用例编号获取测试用例详情
     *
     * 通过用例编号获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTestCaseDetailV2Request 请求对象
     * @return SyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response>
     */
    public SyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response> showTestCaseDetailV2Invoker(
        ShowTestCaseDetailV2Request request) {
        return new SyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response>(request,
            CloudtestMeta.showTestCaseDetailV2, hcClient);
    }

    /**
     * 更新已注册服务
     *
     * 更新已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServiceRequest 请求对象
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateService(UpdateServiceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateService);
    }

    /**
     * 更新已注册服务
     *
     * 更新已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServiceRequest 请求对象
     * @return SyncInvoker<UpdateServiceRequest, UpdateServiceResponse>
     */
    public SyncInvoker<UpdateServiceRequest, UpdateServiceResponse> updateServiceInvoker(UpdateServiceRequest request) {
        return new SyncInvoker<UpdateServiceRequest, UpdateServiceResponse>(request, CloudtestMeta.updateService,
            hcClient);
    }

    /**
     * 更新自定义测试服务类型用例
     *
     * 更新自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTestCaseRequest 请求对象
     * @return UpdateTestCaseResponse
     */
    public UpdateTestCaseResponse updateTestCase(UpdateTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateTestCase);
    }

    /**
     * 更新自定义测试服务类型用例
     *
     * 更新自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTestCaseRequest 请求对象
     * @return SyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse>
     */
    public SyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse> updateTestCaseInvoker(
        UpdateTestCaseRequest request) {
        return new SyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse>(request, CloudtestMeta.updateTestCase,
            hcClient);
    }

    /**
     * 批量更新测试用例结果
     *
     * 批量更新测试用例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTestCaseResultRequest 请求对象
     * @return UpdateTestCaseResultResponse
     */
    public UpdateTestCaseResultResponse updateTestCaseResult(UpdateTestCaseResultRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateTestCaseResult);
    }

    /**
     * 批量更新测试用例结果
     *
     * 批量更新测试用例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTestCaseResultRequest 请求对象
     * @return SyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse>
     */
    public SyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse> updateTestCaseResultInvoker(
        UpdateTestCaseResultRequest request) {
        return new SyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse>(request,
            CloudtestMeta.updateTestCaseResult, hcClient);
    }

    /**
     * 通过导入仓库中的文件生成接口测试套
     *
     * 通过导入仓库中的文件生成接口测试套
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApiTestSuiteByRepoFileRequest 请求对象
     * @return CreateApiTestSuiteByRepoFileResponse
     */
    public CreateApiTestSuiteByRepoFileResponse createApiTestSuiteByRepoFile(
        CreateApiTestSuiteByRepoFileRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createApiTestSuiteByRepoFile);
    }

    /**
     * 通过导入仓库中的文件生成接口测试套
     *
     * 通过导入仓库中的文件生成接口测试套
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApiTestSuiteByRepoFileRequest 请求对象
     * @return SyncInvoker<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse>
     */
    public SyncInvoker<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse> createApiTestSuiteByRepoFileInvoker(
        CreateApiTestSuiteByRepoFileRequest request) {
        return new SyncInvoker<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse>(request,
            CloudtestMeta.createApiTestSuiteByRepoFile, hcClient);
    }

    /**
     * 获取环境参数分组列表
     *
     * 获取环境参数分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return ListEnvironmentsResponse
     */
    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listEnvironments);
    }

    /**
     * 获取环境参数分组列表
     *
     * 获取环境参数分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>
     */
    public SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsInvoker(
        ListEnvironmentsRequest request) {
        return new SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>(request,
            CloudtestMeta.listEnvironments, hcClient);
    }

}
