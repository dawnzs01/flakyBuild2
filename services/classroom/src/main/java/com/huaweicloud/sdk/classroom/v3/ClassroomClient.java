package com.huaweicloud.sdk.classroom.v3;

import com.huaweicloud.sdk.classroom.v3.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class ClassroomClient {

    protected HcClient hcClient;

    public ClassroomClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ClassroomClient> newBuilder() {
        return new ClientBuilder<>(ClassroomClient::new);
    }

    /**
     * 下发判题任务
     *
     * 下发判题任务，根据回调地址、代码来源、源代码文本、语言类型、超时时长、输出类型，触发后台代码编译运行和判题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyJudgementRequest 请求对象
     * @return ApplyJudgementResponse
     */
    public ApplyJudgementResponse applyJudgement(ApplyJudgementRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.applyJudgement);
    }

    /**
     * 下发判题任务
     *
     * 下发判题任务，根据回调地址、代码来源、源代码文本、语言类型、超时时长、输出类型，触发后台代码编译运行和判题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyJudgementRequest 请求对象
     * @return SyncInvoker<ApplyJudgementRequest, ApplyJudgementResponse>
     */
    public SyncInvoker<ApplyJudgementRequest, ApplyJudgementResponse> applyJudgementInvoker(
        ApplyJudgementRequest request) {
        return new SyncInvoker<ApplyJudgementRequest, ApplyJudgementResponse>(request, ClassroomMeta.applyJudgement,
            hcClient);
    }

    /**
     * 获取判题结果详情
     *
     * 根据判题任务ID获取判题结果详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJudgementDetailRequest 请求对象
     * @return ShowJudgementDetailResponse
     */
    public ShowJudgementDetailResponse showJudgementDetail(ShowJudgementDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showJudgementDetail);
    }

    /**
     * 获取判题结果详情
     *
     * 根据判题任务ID获取判题结果详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJudgementDetailRequest 请求对象
     * @return SyncInvoker<ShowJudgementDetailRequest, ShowJudgementDetailResponse>
     */
    public SyncInvoker<ShowJudgementDetailRequest, ShowJudgementDetailResponse> showJudgementDetailInvoker(
        ShowJudgementDetailRequest request) {
        return new SyncInvoker<ShowJudgementDetailRequest, ShowJudgementDetailResponse>(request,
            ClassroomMeta.showJudgementDetail, hcClient);
    }

    /**
     * 下载判题结果文件
     *
     * 根据文件id或图片id下载输出结果文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJudgementFileRequest 请求对象
     * @return ShowJudgementFileResponse
     */
    public ShowJudgementFileResponse showJudgementFile(ShowJudgementFileRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showJudgementFile);
    }

    /**
     * 下载判题结果文件
     *
     * 根据文件id或图片id下载输出结果文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJudgementFileRequest 请求对象
     * @return SyncInvoker<ShowJudgementFileRequest, ShowJudgementFileResponse>
     */
    public SyncInvoker<ShowJudgementFileRequest, ShowJudgementFileResponse> showJudgementFileInvoker(
        ShowJudgementFileRequest request) {
        return new SyncInvoker<ShowJudgementFileRequest, ShowJudgementFileResponse>(request,
            ClassroomMeta.showJudgementFile, hcClient);
    }

    /**
     * 根据课堂ID获取指定课堂的课堂成员列表
     *
     * 根据课堂ID获取指定课堂的课堂成员列表，支持分页，搜索字段默认同时匹配姓名，学号，用户名，班级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClassroomMembersRequest 请求对象
     * @return ListClassroomMembersResponse
     */
    public ListClassroomMembersResponse listClassroomMembers(ListClassroomMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listClassroomMembers);
    }

    /**
     * 根据课堂ID获取指定课堂的课堂成员列表
     *
     * 根据课堂ID获取指定课堂的课堂成员列表，支持分页，搜索字段默认同时匹配姓名，学号，用户名，班级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClassroomMembersRequest 请求对象
     * @return SyncInvoker<ListClassroomMembersRequest, ListClassroomMembersResponse>
     */
    public SyncInvoker<ListClassroomMembersRequest, ListClassroomMembersResponse> listClassroomMembersInvoker(
        ListClassroomMembersRequest request) {
        return new SyncInvoker<ListClassroomMembersRequest, ListClassroomMembersResponse>(request,
            ClassroomMeta.listClassroomMembers, hcClient);
    }

    /**
     * 获取当前用户的课堂列表
     *
     * 获取当前用户的课堂列表，课堂课表分为我创建的课堂，我加入的课堂以及所有课堂，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClassroomsRequest 请求对象
     * @return ListClassroomsResponse
     */
    public ListClassroomsResponse listClassrooms(ListClassroomsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listClassrooms);
    }

    /**
     * 获取当前用户的课堂列表
     *
     * 获取当前用户的课堂列表，课堂课表分为我创建的课堂，我加入的课堂以及所有课堂，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClassroomsRequest 请求对象
     * @return SyncInvoker<ListClassroomsRequest, ListClassroomsResponse>
     */
    public SyncInvoker<ListClassroomsRequest, ListClassroomsResponse> listClassroomsInvoker(
        ListClassroomsRequest request) {
        return new SyncInvoker<ListClassroomsRequest, ListClassroomsResponse>(request, ClassroomMeta.listClassrooms,
            hcClient);
    }

    /**
     * 根据课堂ID获取指定课堂的详细信息
     *
     * 根据课堂ID获取指定课堂的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClassroomDetailRequest 请求对象
     * @return ShowClassroomDetailResponse
     */
    public ShowClassroomDetailResponse showClassroomDetail(ShowClassroomDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showClassroomDetail);
    }

    /**
     * 根据课堂ID获取指定课堂的详细信息
     *
     * 根据课堂ID获取指定课堂的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClassroomDetailRequest 请求对象
     * @return SyncInvoker<ShowClassroomDetailRequest, ShowClassroomDetailResponse>
     */
    public SyncInvoker<ShowClassroomDetailRequest, ShowClassroomDetailResponse> showClassroomDetailInvoker(
        ShowClassroomDetailRequest request) {
        return new SyncInvoker<ShowClassroomDetailRequest, ShowClassroomDetailResponse>(request,
            ClassroomMeta.showClassroomDetail, hcClient);
    }

    /**
     * 查询课堂下指定成员的作业信息
     *
     * 查询课堂下指定成员的作业信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClassroomMemberJobsRequest 请求对象
     * @return ListClassroomMemberJobsResponse
     */
    public ListClassroomMemberJobsResponse listClassroomMemberJobs(ListClassroomMemberJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listClassroomMemberJobs);
    }

    /**
     * 查询课堂下指定成员的作业信息
     *
     * 查询课堂下指定成员的作业信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClassroomMemberJobsRequest 请求对象
     * @return SyncInvoker<ListClassroomMemberJobsRequest, ListClassroomMemberJobsResponse>
     */
    public SyncInvoker<ListClassroomMemberJobsRequest, ListClassroomMemberJobsResponse> listClassroomMemberJobsInvoker(
        ListClassroomMemberJobsRequest request) {
        return new SyncInvoker<ListClassroomMemberJobsRequest, ListClassroomMemberJobsResponse>(request,
            ClassroomMeta.listClassroomMemberJobs, hcClient);
    }

    /**
     * 查询指定课堂下的作业列表信息
     *
     * 查询指定课堂下的作业列表信息，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listJobs);
    }

    /**
     * 查询指定课堂下的作业列表信息
     *
     * 查询指定课堂下的作业列表信息，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return SyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public SyncInvoker<ListJobsRequest, ListJobsResponse> listJobsInvoker(ListJobsRequest request) {
        return new SyncInvoker<ListJobsRequest, ListJobsResponse>(request, ClassroomMeta.listJobs, hcClient);
    }

    /**
     * 查询学生函数习题提交记录信息
     *
     * 查询学生指定作业的习题提交记录信息(针对函数习题)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMemberJobRecordsRequest 请求对象
     * @return ListMemberJobRecordsResponse
     */
    public ListMemberJobRecordsResponse listMemberJobRecords(ListMemberJobRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listMemberJobRecords);
    }

    /**
     * 查询学生函数习题提交记录信息
     *
     * 查询学生指定作业的习题提交记录信息(针对函数习题)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMemberJobRecordsRequest 请求对象
     * @return SyncInvoker<ListMemberJobRecordsRequest, ListMemberJobRecordsResponse>
     */
    public SyncInvoker<ListMemberJobRecordsRequest, ListMemberJobRecordsResponse> listMemberJobRecordsInvoker(
        ListMemberJobRecordsRequest request) {
        return new SyncInvoker<ListMemberJobRecordsRequest, ListMemberJobRecordsResponse>(request,
            ClassroomMeta.listMemberJobRecords, hcClient);
    }

    /**
     * 根据作业ID，查询指定作业的信息
     *
     * 根据作业ID，查询指定作业的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobDetailRequest 请求对象
     * @return ShowJobDetailResponse
     */
    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showJobDetail);
    }

    /**
     * 根据作业ID，查询指定作业的信息
     *
     * 根据作业ID，查询指定作业的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobDetailRequest 请求对象
     * @return SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailInvoker(ShowJobDetailRequest request) {
        return new SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>(request, ClassroomMeta.showJobDetail,
            hcClient);
    }

    /**
     * 查询指定作业下的习题信息
     *
     * 查询指定作业下的习题信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobExercisesRequest 请求对象
     * @return ShowJobExercisesResponse
     */
    public ShowJobExercisesResponse showJobExercises(ShowJobExercisesRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showJobExercises);
    }

    /**
     * 查询指定作业下的习题信息
     *
     * 查询指定作业下的习题信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobExercisesRequest 请求对象
     * @return SyncInvoker<ShowJobExercisesRequest, ShowJobExercisesResponse>
     */
    public SyncInvoker<ShowJobExercisesRequest, ShowJobExercisesResponse> showJobExercisesInvoker(
        ShowJobExercisesRequest request) {
        return new SyncInvoker<ShowJobExercisesRequest, ShowJobExercisesResponse>(request,
            ClassroomMeta.showJobExercises, hcClient);
    }

}
