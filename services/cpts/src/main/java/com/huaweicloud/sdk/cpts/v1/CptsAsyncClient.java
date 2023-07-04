package com.huaweicloud.sdk.cpts.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.cpts.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class CptsAsyncClient {

    protected HcClient hcClient;

    public CptsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CptsAsyncClient> newBuilder() {
        return new ClientBuilder<>(CptsAsyncClient::new);
    }

    /**
     * 批量启停任务（新版启停任务接口）
     *
     * 批量启停任务（新版启停任务接口）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateTaskStatusRequest 请求对象
     * @return CompletableFuture<BatchUpdateTaskStatusResponse>
     */
    public CompletableFuture<BatchUpdateTaskStatusResponse> batchUpdateTaskStatusAsync(
        BatchUpdateTaskStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.batchUpdateTaskStatus);
    }

    /**
     * 批量启停任务（新版启停任务接口）
     *
     * 批量启停任务（新版启停任务接口）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateTaskStatusRequest 请求对象
     * @return AsyncInvoker<BatchUpdateTaskStatusRequest, BatchUpdateTaskStatusResponse>
     */
    public AsyncInvoker<BatchUpdateTaskStatusRequest, BatchUpdateTaskStatusResponse> batchUpdateTaskStatusAsyncInvoker(
        BatchUpdateTaskStatusRequest request) {
        return new AsyncInvoker<BatchUpdateTaskStatusRequest, BatchUpdateTaskStatusResponse>(request,
            CptsMeta.batchUpdateTaskStatus, hcClient);
    }

    /**
     * 创建用例
     *
     * 创建用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCaseRequest 请求对象
     * @return CompletableFuture<CreateCaseResponse>
     */
    public CompletableFuture<CreateCaseResponse> createCaseAsync(CreateCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createCase);
    }

    /**
     * 创建用例
     *
     * 创建用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCaseRequest 请求对象
     * @return AsyncInvoker<CreateCaseRequest, CreateCaseResponse>
     */
    public AsyncInvoker<CreateCaseRequest, CreateCaseResponse> createCaseAsyncInvoker(CreateCaseRequest request) {
        return new AsyncInvoker<CreateCaseRequest, CreateCaseResponse>(request, CptsMeta.createCase, hcClient);
    }

    /**
     * 创建目录
     *
     * 创建目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDirectoryRequest 请求对象
     * @return CompletableFuture<CreateDirectoryResponse>
     */
    public CompletableFuture<CreateDirectoryResponse> createDirectoryAsync(CreateDirectoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createDirectory);
    }

    /**
     * 创建目录
     *
     * 创建目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDirectoryRequest 请求对象
     * @return AsyncInvoker<CreateDirectoryRequest, CreateDirectoryResponse>
     */
    public AsyncInvoker<CreateDirectoryRequest, CreateDirectoryResponse> createDirectoryAsyncInvoker(
        CreateDirectoryRequest request) {
        return new AsyncInvoker<CreateDirectoryRequest, CreateDirectoryResponse>(request, CptsMeta.createDirectory,
            hcClient);
    }

    /**
     * 创建用例
     *
     * 创建用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNewCaseRequest 请求对象
     * @return CompletableFuture<CreateNewCaseResponse>
     */
    public CompletableFuture<CreateNewCaseResponse> createNewCaseAsync(CreateNewCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createNewCase);
    }

    /**
     * 创建用例
     *
     * 创建用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNewCaseRequest 请求对象
     * @return AsyncInvoker<CreateNewCaseRequest, CreateNewCaseResponse>
     */
    public AsyncInvoker<CreateNewCaseRequest, CreateNewCaseResponse> createNewCaseAsyncInvoker(
        CreateNewCaseRequest request) {
        return new AsyncInvoker<CreateNewCaseRequest, CreateNewCaseResponse>(request, CptsMeta.createNewCase, hcClient);
    }

    /**
     * 创建任务
     *
     * 创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNewTaskRequest 请求对象
     * @return CompletableFuture<CreateNewTaskResponse>
     */
    public CompletableFuture<CreateNewTaskResponse> createNewTaskAsync(CreateNewTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createNewTask);
    }

    /**
     * 创建任务
     *
     * 创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNewTaskRequest 请求对象
     * @return AsyncInvoker<CreateNewTaskRequest, CreateNewTaskResponse>
     */
    public AsyncInvoker<CreateNewTaskRequest, CreateNewTaskResponse> createNewTaskAsyncInvoker(
        CreateNewTaskRequest request) {
        return new AsyncInvoker<CreateNewTaskRequest, CreateNewTaskResponse>(request, CptsMeta.createNewTask, hcClient);
    }

    /**
     * 创建任务
     *
     * 创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return CompletableFuture<CreateTaskResponse>
     */
    public CompletableFuture<CreateTaskResponse> createTaskAsync(CreateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createTask);
    }

    /**
     * 创建任务
     *
     * 创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return AsyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public AsyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskAsyncInvoker(CreateTaskRequest request) {
        return new AsyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, CptsMeta.createTask, hcClient);
    }

    /**
     * 创建事务
     *
     * 创建事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTempRequest 请求对象
     * @return CompletableFuture<CreateTempResponse>
     */
    public CompletableFuture<CreateTempResponse> createTempAsync(CreateTempRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createTemp);
    }

    /**
     * 创建事务
     *
     * 创建事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTempRequest 请求对象
     * @return AsyncInvoker<CreateTempRequest, CreateTempResponse>
     */
    public AsyncInvoker<CreateTempRequest, CreateTempResponse> createTempAsyncInvoker(CreateTempRequest request) {
        return new AsyncInvoker<CreateTempRequest, CreateTempResponse>(request, CptsMeta.createTemp, hcClient);
    }

    /**
     * 创建变量
     *
     * 创建变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVariableRequest 请求对象
     * @return CompletableFuture<CreateVariableResponse>
     */
    public CompletableFuture<CreateVariableResponse> createVariableAsync(CreateVariableRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createVariable);
    }

    /**
     * 创建变量
     *
     * 创建变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVariableRequest 请求对象
     * @return AsyncInvoker<CreateVariableRequest, CreateVariableResponse>
     */
    public AsyncInvoker<CreateVariableRequest, CreateVariableResponse> createVariableAsyncInvoker(
        CreateVariableRequest request) {
        return new AsyncInvoker<CreateVariableRequest, CreateVariableResponse>(request, CptsMeta.createVariable,
            hcClient);
    }

    /**
     * 调试用例
     *
     * 调试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DebugCaseRequest 请求对象
     * @return CompletableFuture<DebugCaseResponse>
     */
    public CompletableFuture<DebugCaseResponse> debugCaseAsync(DebugCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.debugCase);
    }

    /**
     * 调试用例
     *
     * 调试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DebugCaseRequest 请求对象
     * @return AsyncInvoker<DebugCaseRequest, DebugCaseResponse>
     */
    public AsyncInvoker<DebugCaseRequest, DebugCaseResponse> debugCaseAsyncInvoker(DebugCaseRequest request) {
        return new AsyncInvoker<DebugCaseRequest, DebugCaseResponse>(request, CptsMeta.debugCase, hcClient);
    }

    /**
     * 删除用例
     *
     * 删除用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCaseRequest 请求对象
     * @return CompletableFuture<DeleteCaseResponse>
     */
    public CompletableFuture<DeleteCaseResponse> deleteCaseAsync(DeleteCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteCase);
    }

    /**
     * 删除用例
     *
     * 删除用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCaseRequest 请求对象
     * @return AsyncInvoker<DeleteCaseRequest, DeleteCaseResponse>
     */
    public AsyncInvoker<DeleteCaseRequest, DeleteCaseResponse> deleteCaseAsyncInvoker(DeleteCaseRequest request) {
        return new AsyncInvoker<DeleteCaseRequest, DeleteCaseResponse>(request, CptsMeta.deleteCase, hcClient);
    }

    /**
     * 删除目录
     *
     * 删除目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDirectoryRequest 请求对象
     * @return CompletableFuture<DeleteDirectoryResponse>
     */
    public CompletableFuture<DeleteDirectoryResponse> deleteDirectoryAsync(DeleteDirectoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteDirectory);
    }

    /**
     * 删除目录
     *
     * 删除目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDirectoryRequest 请求对象
     * @return AsyncInvoker<DeleteDirectoryRequest, DeleteDirectoryResponse>
     */
    public AsyncInvoker<DeleteDirectoryRequest, DeleteDirectoryResponse> deleteDirectoryAsyncInvoker(
        DeleteDirectoryRequest request) {
        return new AsyncInvoker<DeleteDirectoryRequest, DeleteDirectoryResponse>(request, CptsMeta.deleteDirectory,
            hcClient);
    }

    /**
     * 删除用例
     *
     * 删除用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNewCaseRequest 请求对象
     * @return CompletableFuture<DeleteNewCaseResponse>
     */
    public CompletableFuture<DeleteNewCaseResponse> deleteNewCaseAsync(DeleteNewCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteNewCase);
    }

    /**
     * 删除用例
     *
     * 删除用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNewCaseRequest 请求对象
     * @return AsyncInvoker<DeleteNewCaseRequest, DeleteNewCaseResponse>
     */
    public AsyncInvoker<DeleteNewCaseRequest, DeleteNewCaseResponse> deleteNewCaseAsyncInvoker(
        DeleteNewCaseRequest request) {
        return new AsyncInvoker<DeleteNewCaseRequest, DeleteNewCaseResponse>(request, CptsMeta.deleteNewCase, hcClient);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNewTaskRequest 请求对象
     * @return CompletableFuture<DeleteNewTaskResponse>
     */
    public CompletableFuture<DeleteNewTaskResponse> deleteNewTaskAsync(DeleteNewTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteNewTask);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNewTaskRequest 请求对象
     * @return AsyncInvoker<DeleteNewTaskRequest, DeleteNewTaskResponse>
     */
    public AsyncInvoker<DeleteNewTaskRequest, DeleteNewTaskResponse> deleteNewTaskAsyncInvoker(
        DeleteNewTaskRequest request) {
        return new AsyncInvoker<DeleteNewTaskRequest, DeleteNewTaskResponse>(request, CptsMeta.deleteNewTask, hcClient);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return CompletableFuture<DeleteTaskResponse>
     */
    public CompletableFuture<DeleteTaskResponse> deleteTaskAsync(DeleteTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteTask);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskAsyncInvoker(DeleteTaskRequest request) {
        return new AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, CptsMeta.deleteTask, hcClient);
    }

    /**
     * 删除事务
     *
     * 删除事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTempRequest 请求对象
     * @return CompletableFuture<DeleteTempResponse>
     */
    public CompletableFuture<DeleteTempResponse> deleteTempAsync(DeleteTempRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteTemp);
    }

    /**
     * 删除事务
     *
     * 删除事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTempRequest 请求对象
     * @return AsyncInvoker<DeleteTempRequest, DeleteTempResponse>
     */
    public AsyncInvoker<DeleteTempRequest, DeleteTempResponse> deleteTempAsyncInvoker(DeleteTempRequest request) {
        return new AsyncInvoker<DeleteTempRequest, DeleteTempResponse>(request, CptsMeta.deleteTemp, hcClient);
    }

    /**
     * 删除全局变量
     *
     * 删除全局变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVariableRequest 请求对象
     * @return CompletableFuture<DeleteVariableResponse>
     */
    public CompletableFuture<DeleteVariableResponse> deleteVariableAsync(DeleteVariableRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteVariable);
    }

    /**
     * 删除全局变量
     *
     * 删除全局变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVariableRequest 请求对象
     * @return AsyncInvoker<DeleteVariableRequest, DeleteVariableResponse>
     */
    public AsyncInvoker<DeleteVariableRequest, DeleteVariableResponse> deleteVariableAsyncInvoker(
        DeleteVariableRequest request) {
        return new AsyncInvoker<DeleteVariableRequest, DeleteVariableResponse>(request, CptsMeta.deleteVariable,
            hcClient);
    }

    /**
     * 查询用例树
     *
     * 查询用例树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTestCaseRequest 请求对象
     * @return CompletableFuture<ListProjectTestCaseResponse>
     */
    public CompletableFuture<ListProjectTestCaseResponse> listProjectTestCaseAsync(ListProjectTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.listProjectTestCase);
    }

    /**
     * 查询用例树
     *
     * 查询用例树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTestCaseRequest 请求对象
     * @return AsyncInvoker<ListProjectTestCaseRequest, ListProjectTestCaseResponse>
     */
    public AsyncInvoker<ListProjectTestCaseRequest, ListProjectTestCaseResponse> listProjectTestCaseAsyncInvoker(
        ListProjectTestCaseRequest request) {
        return new AsyncInvoker<ListProjectTestCaseRequest, ListProjectTestCaseResponse>(request,
            CptsMeta.listProjectTestCase, hcClient);
    }

    /**
     * 获取任务关联的用例列表
     *
     * 获取任务关联的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskCasesRequest 请求对象
     * @return CompletableFuture<ListTaskCasesResponse>
     */
    public CompletableFuture<ListTaskCasesResponse> listTaskCasesAsync(ListTaskCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.listTaskCases);
    }

    /**
     * 获取任务关联的用例列表
     *
     * 获取任务关联的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskCasesRequest 请求对象
     * @return AsyncInvoker<ListTaskCasesRequest, ListTaskCasesResponse>
     */
    public AsyncInvoker<ListTaskCasesRequest, ListTaskCasesResponse> listTaskCasesAsyncInvoker(
        ListTaskCasesRequest request) {
        return new AsyncInvoker<ListTaskCasesRequest, ListTaskCasesResponse>(request, CptsMeta.listTaskCases, hcClient);
    }

    /**
     * 查询全局变量
     *
     * 查询全局变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVariablesRequest 请求对象
     * @return CompletableFuture<ListVariablesResponse>
     */
    public CompletableFuture<ListVariablesResponse> listVariablesAsync(ListVariablesRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.listVariables);
    }

    /**
     * 查询全局变量
     *
     * 查询全局变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVariablesRequest 请求对象
     * @return AsyncInvoker<ListVariablesRequest, ListVariablesResponse>
     */
    public AsyncInvoker<ListVariablesRequest, ListVariablesResponse> listVariablesAsyncInvoker(
        ListVariablesRequest request) {
        return new AsyncInvoker<ListVariablesRequest, ListVariablesResponse>(request, CptsMeta.listVariables, hcClient);
    }

    /**
     * 全链路压测探针获取配置信息
     *
     * 全链路压测探针获取配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgentConfigRequest 请求对象
     * @return CompletableFuture<ShowAgentConfigResponse>
     */
    public CompletableFuture<ShowAgentConfigResponse> showAgentConfigAsync(ShowAgentConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showAgentConfig);
    }

    /**
     * 全链路压测探针获取配置信息
     *
     * 全链路压测探针获取配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgentConfigRequest 请求对象
     * @return AsyncInvoker<ShowAgentConfigRequest, ShowAgentConfigResponse>
     */
    public AsyncInvoker<ShowAgentConfigRequest, ShowAgentConfigResponse> showAgentConfigAsyncInvoker(
        ShowAgentConfigRequest request) {
        return new AsyncInvoker<ShowAgentConfigRequest, ShowAgentConfigResponse>(request, CptsMeta.showAgentConfig,
            hcClient);
    }

    /**
     * 查询用例
     *
     * 查询用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCaseRequest 请求对象
     * @return CompletableFuture<ShowCaseResponse>
     */
    public CompletableFuture<ShowCaseResponse> showCaseAsync(ShowCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showCase);
    }

    /**
     * 查询用例
     *
     * 查询用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCaseRequest 请求对象
     * @return AsyncInvoker<ShowCaseRequest, ShowCaseResponse>
     */
    public AsyncInvoker<ShowCaseRequest, ShowCaseResponse> showCaseAsyncInvoker(ShowCaseRequest request) {
        return new AsyncInvoker<ShowCaseRequest, ShowCaseResponse>(request, CptsMeta.showCase, hcClient);
    }

    /**
     * 查询PerfTest任务离线报告列表
     *
     * 查询PerfTest任务离线报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHistoryRunInfoRequest 请求对象
     * @return CompletableFuture<ShowHistoryRunInfoResponse>
     */
    public CompletableFuture<ShowHistoryRunInfoResponse> showHistoryRunInfoAsync(ShowHistoryRunInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showHistoryRunInfo);
    }

    /**
     * 查询PerfTest任务离线报告列表
     *
     * 查询PerfTest任务离线报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHistoryRunInfoRequest 请求对象
     * @return AsyncInvoker<ShowHistoryRunInfoRequest, ShowHistoryRunInfoResponse>
     */
    public AsyncInvoker<ShowHistoryRunInfoRequest, ShowHistoryRunInfoResponse> showHistoryRunInfoAsyncInvoker(
        ShowHistoryRunInfoRequest request) {
        return new AsyncInvoker<ShowHistoryRunInfoRequest, ShowHistoryRunInfoResponse>(request,
            CptsMeta.showHistoryRunInfo, hcClient);
    }

    /**
     * 内外融合单个用例的详情数据
     *
     * 内外融合单个用例的详情数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMergeCaseDetailRequest 请求对象
     * @return CompletableFuture<ShowMergeCaseDetailResponse>
     */
    public CompletableFuture<ShowMergeCaseDetailResponse> showMergeCaseDetailAsync(ShowMergeCaseDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showMergeCaseDetail);
    }

    /**
     * 内外融合单个用例的详情数据
     *
     * 内外融合单个用例的详情数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMergeCaseDetailRequest 请求对象
     * @return AsyncInvoker<ShowMergeCaseDetailRequest, ShowMergeCaseDetailResponse>
     */
    public AsyncInvoker<ShowMergeCaseDetailRequest, ShowMergeCaseDetailResponse> showMergeCaseDetailAsyncInvoker(
        ShowMergeCaseDetailRequest request) {
        return new AsyncInvoker<ShowMergeCaseDetailRequest, ShowMergeCaseDetailResponse>(request,
            CptsMeta.showMergeCaseDetail, hcClient);
    }

    /**
     * 查询报告汇总数据接口
     *
     * 查询报告汇总数据接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMergeReportLogsOutlineRequest 请求对象
     * @return CompletableFuture<ShowMergeReportLogsOutlineResponse>
     */
    public CompletableFuture<ShowMergeReportLogsOutlineResponse> showMergeReportLogsOutlineAsync(
        ShowMergeReportLogsOutlineRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showMergeReportLogsOutline);
    }

    /**
     * 查询报告汇总数据接口
     *
     * 查询报告汇总数据接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMergeReportLogsOutlineRequest 请求对象
     * @return AsyncInvoker<ShowMergeReportLogsOutlineRequest, ShowMergeReportLogsOutlineResponse>
     */
    public AsyncInvoker<ShowMergeReportLogsOutlineRequest, ShowMergeReportLogsOutlineResponse> showMergeReportLogsOutlineAsyncInvoker(
        ShowMergeReportLogsOutlineRequest request) {
        return new AsyncInvoker<ShowMergeReportLogsOutlineRequest, ShowMergeReportLogsOutlineResponse>(request,
            CptsMeta.showMergeReportLogsOutline, hcClient);
    }

    /**
     * 内外融合当前任务用例列表接口
     *
     * 内外融合当前任务用例列表接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMergeTaskCaseRequest 请求对象
     * @return CompletableFuture<ShowMergeTaskCaseResponse>
     */
    public CompletableFuture<ShowMergeTaskCaseResponse> showMergeTaskCaseAsync(ShowMergeTaskCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showMergeTaskCase);
    }

    /**
     * 内外融合当前任务用例列表接口
     *
     * 内外融合当前任务用例列表接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMergeTaskCaseRequest 请求对象
     * @return AsyncInvoker<ShowMergeTaskCaseRequest, ShowMergeTaskCaseResponse>
     */
    public AsyncInvoker<ShowMergeTaskCaseRequest, ShowMergeTaskCaseResponse> showMergeTaskCaseAsyncInvoker(
        ShowMergeTaskCaseRequest request) {
        return new AsyncInvoker<ShowMergeTaskCaseRequest, ShowMergeTaskCaseResponse>(request,
            CptsMeta.showMergeTaskCase, hcClient);
    }

    /**
     * 查询报告
     *
     * 查询报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReportRequest 请求对象
     * @return CompletableFuture<ShowReportResponse>
     */
    public CompletableFuture<ShowReportResponse> showReportAsync(ShowReportRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showReport);
    }

    /**
     * 查询报告
     *
     * 查询报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReportRequest 请求对象
     * @return AsyncInvoker<ShowReportRequest, ShowReportResponse>
     */
    public AsyncInvoker<ShowReportRequest, ShowReportResponse> showReportAsyncInvoker(ShowReportRequest request) {
        return new AsyncInvoker<ShowReportRequest, ShowReportResponse>(request, CptsMeta.showReport, hcClient);
    }

    /**
     * 查询任务
     *
     * 查询任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
     * @return CompletableFuture<ShowTaskResponse>
     */
    public CompletableFuture<ShowTaskResponse> showTaskAsync(ShowTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showTask);
    }

    /**
     * 查询任务
     *
     * 查询任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
     * @return AsyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public AsyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskAsyncInvoker(ShowTaskRequest request) {
        return new AsyncInvoker<ShowTaskRequest, ShowTaskResponse>(request, CptsMeta.showTask, hcClient);
    }

    /**
     * 内外融合获取用例的AW曲线图获取接口
     *
     * 内外融合获取用例的AW曲线图获取接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskCaseAwChartRequest 请求对象
     * @return CompletableFuture<ShowTaskCaseAwChartResponse>
     */
    public CompletableFuture<ShowTaskCaseAwChartResponse> showTaskCaseAwChartAsync(ShowTaskCaseAwChartRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showTaskCaseAwChart);
    }

    /**
     * 内外融合获取用例的AW曲线图获取接口
     *
     * 内外融合获取用例的AW曲线图获取接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskCaseAwChartRequest 请求对象
     * @return AsyncInvoker<ShowTaskCaseAwChartRequest, ShowTaskCaseAwChartResponse>
     */
    public AsyncInvoker<ShowTaskCaseAwChartRequest, ShowTaskCaseAwChartResponse> showTaskCaseAwChartAsyncInvoker(
        ShowTaskCaseAwChartRequest request) {
        return new AsyncInvoker<ShowTaskCaseAwChartRequest, ShowTaskCaseAwChartResponse>(request,
            CptsMeta.showTaskCaseAwChart, hcClient);
    }

    /**
     * 查询任务集
     *
     * 查询任务集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskSetRequest 请求对象
     * @return CompletableFuture<ShowTaskSetResponse>
     */
    public CompletableFuture<ShowTaskSetResponse> showTaskSetAsync(ShowTaskSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showTaskSet);
    }

    /**
     * 查询任务集
     *
     * 查询任务集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskSetRequest 请求对象
     * @return AsyncInvoker<ShowTaskSetRequest, ShowTaskSetResponse>
     */
    public AsyncInvoker<ShowTaskSetRequest, ShowTaskSetResponse> showTaskSetAsyncInvoker(ShowTaskSetRequest request) {
        return new AsyncInvoker<ShowTaskSetRequest, ShowTaskSetResponse>(request, CptsMeta.showTaskSet, hcClient);
    }

    /**
     * 查询事务
     *
     * 查询事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTempRequest 请求对象
     * @return CompletableFuture<ShowTempResponse>
     */
    public CompletableFuture<ShowTempResponse> showTempAsync(ShowTempRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showTemp);
    }

    /**
     * 查询事务
     *
     * 查询事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTempRequest 请求对象
     * @return AsyncInvoker<ShowTempRequest, ShowTempResponse>
     */
    public AsyncInvoker<ShowTempRequest, ShowTempResponse> showTempAsyncInvoker(ShowTempRequest request) {
        return new AsyncInvoker<ShowTempRequest, ShowTempResponse>(request, CptsMeta.showTemp, hcClient);
    }

    /**
     * 查询事务集
     *
     * 查询事务集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTempSetRequest 请求对象
     * @return CompletableFuture<ShowTempSetResponse>
     */
    public CompletableFuture<ShowTempSetResponse> showTempSetAsync(ShowTempSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showTempSet);
    }

    /**
     * 查询事务集
     *
     * 查询事务集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTempSetRequest 请求对象
     * @return AsyncInvoker<ShowTempSetRequest, ShowTempSetResponse>
     */
    public AsyncInvoker<ShowTempSetRequest, ShowTempSetResponse> showTempSetAsyncInvoker(ShowTempSetRequest request) {
        return new AsyncInvoker<ShowTempSetRequest, ShowTempSetResponse>(request, CptsMeta.showTempSet, hcClient);
    }

    /**
     * 全链路压测探针上报健康状态
     *
     * 全链路压测探针上报健康状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAgentHealthStatusRequest 请求对象
     * @return CompletableFuture<UpdateAgentHealthStatusResponse>
     */
    public CompletableFuture<UpdateAgentHealthStatusResponse> updateAgentHealthStatusAsync(
        UpdateAgentHealthStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateAgentHealthStatus);
    }

    /**
     * 全链路压测探针上报健康状态
     *
     * 全链路压测探针上报健康状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAgentHealthStatusRequest 请求对象
     * @return AsyncInvoker<UpdateAgentHealthStatusRequest, UpdateAgentHealthStatusResponse>
     */
    public AsyncInvoker<UpdateAgentHealthStatusRequest, UpdateAgentHealthStatusResponse> updateAgentHealthStatusAsyncInvoker(
        UpdateAgentHealthStatusRequest request) {
        return new AsyncInvoker<UpdateAgentHealthStatusRequest, UpdateAgentHealthStatusResponse>(request,
            CptsMeta.updateAgentHealthStatus, hcClient);
    }

    /**
     * 修改用例
     *
     * 修改用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCaseRequest 请求对象
     * @return CompletableFuture<UpdateCaseResponse>
     */
    public CompletableFuture<UpdateCaseResponse> updateCaseAsync(UpdateCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateCase);
    }

    /**
     * 修改用例
     *
     * 修改用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCaseRequest 请求对象
     * @return AsyncInvoker<UpdateCaseRequest, UpdateCaseResponse>
     */
    public AsyncInvoker<UpdateCaseRequest, UpdateCaseResponse> updateCaseAsyncInvoker(UpdateCaseRequest request) {
        return new AsyncInvoker<UpdateCaseRequest, UpdateCaseResponse>(request, CptsMeta.updateCase, hcClient);
    }

    /**
     * 修改目录
     *
     * 修改目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDirectoryRequest 请求对象
     * @return CompletableFuture<UpdateDirectoryResponse>
     */
    public CompletableFuture<UpdateDirectoryResponse> updateDirectoryAsync(UpdateDirectoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateDirectory);
    }

    /**
     * 修改目录
     *
     * 修改目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDirectoryRequest 请求对象
     * @return AsyncInvoker<UpdateDirectoryRequest, UpdateDirectoryResponse>
     */
    public AsyncInvoker<UpdateDirectoryRequest, UpdateDirectoryResponse> updateDirectoryAsyncInvoker(
        UpdateDirectoryRequest request) {
        return new AsyncInvoker<UpdateDirectoryRequest, UpdateDirectoryResponse>(request, CptsMeta.updateDirectory,
            hcClient);
    }

    /**
     * 修改用例
     *
     * 修改用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNewCaseRequest 请求对象
     * @return CompletableFuture<UpdateNewCaseResponse>
     */
    public CompletableFuture<UpdateNewCaseResponse> updateNewCaseAsync(UpdateNewCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateNewCase);
    }

    /**
     * 修改用例
     *
     * 修改用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNewCaseRequest 请求对象
     * @return AsyncInvoker<UpdateNewCaseRequest, UpdateNewCaseResponse>
     */
    public AsyncInvoker<UpdateNewCaseRequest, UpdateNewCaseResponse> updateNewCaseAsyncInvoker(
        UpdateNewCaseRequest request) {
        return new AsyncInvoker<UpdateNewCaseRequest, UpdateNewCaseResponse>(request, CptsMeta.updateNewCase, hcClient);
    }

    /**
     * 修改任务
     *
     * 修改任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRequest 请求对象
     * @return CompletableFuture<UpdateTaskResponse>
     */
    public CompletableFuture<UpdateTaskResponse> updateTaskAsync(UpdateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateTask);
    }

    /**
     * 修改任务
     *
     * 修改任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRequest 请求对象
     * @return AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse>
     */
    public AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskAsyncInvoker(UpdateTaskRequest request) {
        return new AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse>(request, CptsMeta.updateTask, hcClient);
    }

    /**
     * 修改任务关联用例
     *
     * 修改任务关联用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRelatedTestCaseRequest 请求对象
     * @return CompletableFuture<UpdateTaskRelatedTestCaseResponse>
     */
    public CompletableFuture<UpdateTaskRelatedTestCaseResponse> updateTaskRelatedTestCaseAsync(
        UpdateTaskRelatedTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateTaskRelatedTestCase);
    }

    /**
     * 修改任务关联用例
     *
     * 修改任务关联用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRelatedTestCaseRequest 请求对象
     * @return AsyncInvoker<UpdateTaskRelatedTestCaseRequest, UpdateTaskRelatedTestCaseResponse>
     */
    public AsyncInvoker<UpdateTaskRelatedTestCaseRequest, UpdateTaskRelatedTestCaseResponse> updateTaskRelatedTestCaseAsyncInvoker(
        UpdateTaskRelatedTestCaseRequest request) {
        return new AsyncInvoker<UpdateTaskRelatedTestCaseRequest, UpdateTaskRelatedTestCaseResponse>(request,
            CptsMeta.updateTaskRelatedTestCase, hcClient);
    }

    /**
     * 更新任务状态
     *
     * 更新任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskStatusRequest 请求对象
     * @return CompletableFuture<UpdateTaskStatusResponse>
     */
    public CompletableFuture<UpdateTaskStatusResponse> updateTaskStatusAsync(UpdateTaskStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateTaskStatus);
    }

    /**
     * 更新任务状态
     *
     * 更新任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskStatusRequest 请求对象
     * @return AsyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse>
     */
    public AsyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse> updateTaskStatusAsyncInvoker(
        UpdateTaskStatusRequest request) {
        return new AsyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse>(request, CptsMeta.updateTaskStatus,
            hcClient);
    }

    /**
     * 修改事务
     *
     * 修改事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTempRequest 请求对象
     * @return CompletableFuture<UpdateTempResponse>
     */
    public CompletableFuture<UpdateTempResponse> updateTempAsync(UpdateTempRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateTemp);
    }

    /**
     * 修改事务
     *
     * 修改事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTempRequest 请求对象
     * @return AsyncInvoker<UpdateTempRequest, UpdateTempResponse>
     */
    public AsyncInvoker<UpdateTempRequest, UpdateTempResponse> updateTempAsyncInvoker(UpdateTempRequest request) {
        return new AsyncInvoker<UpdateTempRequest, UpdateTempResponse>(request, CptsMeta.updateTemp, hcClient);
    }

    /**
     * 修改变量
     *
     * 修改变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVariableRequest 请求对象
     * @return CompletableFuture<UpdateVariableResponse>
     */
    public CompletableFuture<UpdateVariableResponse> updateVariableAsync(UpdateVariableRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateVariable);
    }

    /**
     * 修改变量
     *
     * 修改变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVariableRequest 请求对象
     * @return AsyncInvoker<UpdateVariableRequest, UpdateVariableResponse>
     */
    public AsyncInvoker<UpdateVariableRequest, UpdateVariableResponse> updateVariableAsyncInvoker(
        UpdateVariableRequest request) {
        return new AsyncInvoker<UpdateVariableRequest, UpdateVariableResponse>(request, CptsMeta.updateVariable,
            hcClient);
    }

    /**
     * 创建工程
     *
     * 创建工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectRequest 请求对象
     * @return CompletableFuture<CreateProjectResponse>
     */
    public CompletableFuture<CreateProjectResponse> createProjectAsync(CreateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createProject);
    }

    /**
     * 创建工程
     *
     * 创建工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectRequest 请求对象
     * @return AsyncInvoker<CreateProjectRequest, CreateProjectResponse>
     */
    public AsyncInvoker<CreateProjectRequest, CreateProjectResponse> createProjectAsyncInvoker(
        CreateProjectRequest request) {
        return new AsyncInvoker<CreateProjectRequest, CreateProjectResponse>(request, CptsMeta.createProject, hcClient);
    }

    /**
     * 删除工程
     *
     * 删除工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProjectRequest 请求对象
     * @return CompletableFuture<DeleteProjectResponse>
     */
    public CompletableFuture<DeleteProjectResponse> deleteProjectAsync(DeleteProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteProject);
    }

    /**
     * 删除工程
     *
     * 删除工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProjectRequest 请求对象
     * @return AsyncInvoker<DeleteProjectRequest, DeleteProjectResponse>
     */
    public AsyncInvoker<DeleteProjectRequest, DeleteProjectResponse> deleteProjectAsyncInvoker(
        DeleteProjectRequest request) {
        return new AsyncInvoker<DeleteProjectRequest, DeleteProjectResponse>(request, CptsMeta.deleteProject, hcClient);
    }

    /**
     * 查询工程集
     *
     * 查询工程集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectSetsRequest 请求对象
     * @return CompletableFuture<ListProjectSetsResponse>
     */
    public CompletableFuture<ListProjectSetsResponse> listProjectSetsAsync(ListProjectSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.listProjectSets);
    }

    /**
     * 查询工程集
     *
     * 查询工程集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectSetsRequest 请求对象
     * @return AsyncInvoker<ListProjectSetsRequest, ListProjectSetsResponse>
     */
    public AsyncInvoker<ListProjectSetsRequest, ListProjectSetsResponse> listProjectSetsAsyncInvoker(
        ListProjectSetsRequest request) {
        return new AsyncInvoker<ListProjectSetsRequest, ListProjectSetsResponse>(request, CptsMeta.listProjectSets,
            hcClient);
    }

    /**
     * 查询导入进度
     *
     * 查询导入进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProcessRequest 请求对象
     * @return CompletableFuture<ShowProcessResponse>
     */
    public CompletableFuture<ShowProcessResponse> showProcessAsync(ShowProcessRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showProcess);
    }

    /**
     * 查询导入进度
     *
     * 查询导入进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProcessRequest 请求对象
     * @return AsyncInvoker<ShowProcessRequest, ShowProcessResponse>
     */
    public AsyncInvoker<ShowProcessRequest, ShowProcessResponse> showProcessAsyncInvoker(ShowProcessRequest request) {
        return new AsyncInvoker<ShowProcessRequest, ShowProcessResponse>(request, CptsMeta.showProcess, hcClient);
    }

    /**
     * 查询工程
     *
     * 查询工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectRequest 请求对象
     * @return CompletableFuture<ShowProjectResponse>
     */
    public CompletableFuture<ShowProjectResponse> showProjectAsync(ShowProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showProject);
    }

    /**
     * 查询工程
     *
     * 查询工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectRequest 请求对象
     * @return AsyncInvoker<ShowProjectRequest, ShowProjectResponse>
     */
    public AsyncInvoker<ShowProjectRequest, ShowProjectResponse> showProjectAsyncInvoker(ShowProjectRequest request) {
        return new AsyncInvoker<ShowProjectRequest, ShowProjectResponse>(request, CptsMeta.showProject, hcClient);
    }

    /**
     * 修改工程
     *
     * 修改工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProjectRequest 请求对象
     * @return CompletableFuture<UpdateProjectResponse>
     */
    public CompletableFuture<UpdateProjectResponse> updateProjectAsync(UpdateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateProject);
    }

    /**
     * 修改工程
     *
     * 修改工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProjectRequest 请求对象
     * @return AsyncInvoker<UpdateProjectRequest, UpdateProjectResponse>
     */
    public AsyncInvoker<UpdateProjectRequest, UpdateProjectResponse> updateProjectAsyncInvoker(
        UpdateProjectRequest request) {
        return new AsyncInvoker<UpdateProjectRequest, UpdateProjectResponse>(request, CptsMeta.updateProject, hcClient);
    }

}
