package com.huaweicloud.sdk.workspace.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.workspace.v2.model.*;

@SuppressWarnings("unchecked")
public class WorkspaceMeta {

    public static final HttpRequestDef<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse> batchDeleteAccessPolicies =
        genForbatchDeleteAccessPolicies();

    private static HttpRequestDef<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse> genForbatchDeleteAccessPolicies() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    BatchDeleteAccessPoliciesRequest.class,
                    BatchDeleteAccessPoliciesResponse.class)
                .withName("BatchDeleteAccessPolicies")
                .withUri("/v2/{project_id}/access-policy")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteAccessPoliciesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteAccessPoliciesReq.class),
            f -> f.withMarshaller(BatchDeleteAccessPoliciesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAccessPolicyRequest, CreateAccessPolicyResponse> createAccessPolicy =
        genForcreateAccessPolicy();

    private static HttpRequestDef<CreateAccessPolicyRequest, CreateAccessPolicyResponse> genForcreateAccessPolicy() {
        // basic
        HttpRequestDef.Builder<CreateAccessPolicyRequest, CreateAccessPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccessPolicyRequest.class, CreateAccessPolicyResponse.class)
                .withName("CreateAccessPolicy")
                .withUri("/v2/{project_id}/access-policy")
                .withContentType("application/json");

        // requests
        builder.<CreateAccessPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateAccessPolicyReq.class),
            f -> f.withMarshaller(CreateAccessPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessPoliciesRequest, ListAccessPoliciesResponse> listAccessPolicies =
        genForlistAccessPolicies();

    private static HttpRequestDef<ListAccessPoliciesRequest, ListAccessPoliciesResponse> genForlistAccessPolicies() {
        // basic
        HttpRequestDef.Builder<ListAccessPoliciesRequest, ListAccessPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAccessPoliciesRequest.class, ListAccessPoliciesResponse.class)
                .withName("ListAccessPolicies")
                .withUri("/v2/{project_id}/access-policy")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessPoliciesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessPoliciesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse> listAccessPolicyObjects =
        genForlistAccessPolicyObjects();

    private static HttpRequestDef<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse> genForlistAccessPolicyObjects() {
        // basic
        HttpRequestDef.Builder<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAccessPolicyObjectsRequest.class, ListAccessPolicyObjectsResponse.class)
            .withName("ListAccessPolicyObjects")
            .withUri("/v2/{project_id}/access-policy/{access_policy_id}/objects")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("access_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessPolicyObjectsRequest::getAccessPolicyId, (req, v) -> {
                req.setAccessPolicyId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessPolicyObjectsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessPolicyObjectsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse> updateAccessPolicyObjects =
        genForupdateAccessPolicyObjects();

    private static HttpRequestDef<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse> genForupdateAccessPolicyObjects() {
        // basic
        HttpRequestDef.Builder<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateAccessPolicyObjectsRequest.class,
                    UpdateAccessPolicyObjectsResponse.class)
                .withName("UpdateAccessPolicyObjects")
                .withUri("/v2/{project_id}/access-policy/{access_policy_id}/objects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("access_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAccessPolicyObjectsRequest::getAccessPolicyId, (req, v) -> {
                req.setAccessPolicyId(v);
            }));
        builder.<UpdateAccessPolicyObjectsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateAccessPolicyObjectsReq.class),
            f -> f.withMarshaller(UpdateAccessPolicyObjectsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse> showAssistAuthConfig =
        genForshowAssistAuthConfig();

    private static HttpRequestDef<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse> genForshowAssistAuthConfig() {
        // basic
        HttpRequestDef.Builder<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAssistAuthConfigRequest.class, ShowAssistAuthConfigResponse.class)
            .withName("ShowAssistAuthConfig")
            .withUri("/v2/{project_id}/assist-auth-config/method-config")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse> updateAssistAuthMethodConfig =
        genForupdateAssistAuthMethodConfig();

    private static HttpRequestDef<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse> genForupdateAssistAuthMethodConfig() {
        // basic
        HttpRequestDef.Builder<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateAssistAuthMethodConfigRequest.class,
                    UpdateAssistAuthMethodConfigResponse.class)
                .withName("UpdateAssistAuthMethodConfig")
                .withUri("/v2/{project_id}/assist-auth-config/method-config")
                .withContentType("application/json");

        // requests
        builder.<AssistAuthMethodConfigRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssistAuthMethodConfigRequest.class),
            f -> f.withMarshaller(UpdateAssistAuthMethodConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZones =
        genForlistAvailabilityZones();

    private static HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> genForlistAvailabilityZones() {
        // basic
        HttpRequestDef.Builder<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAvailabilityZonesRequest.class, ListAvailabilityZonesResponse.class)
            .withName("ListAvailabilityZones")
            .withUri("/v2/{project_id}/availability-zones")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse> exportUserLoginInfoNew =
        genForexportUserLoginInfoNew();

    private static HttpRequestDef<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse> genForexportUserLoginInfoNew() {
        // basic
        HttpRequestDef.Builder<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ExportUserLoginInfoNewRequest.class, ExportUserLoginInfoNewResponse.class)
            .withName("ExportUserLoginInfoNew")
            .withUri("/v2/{project_id}/connections/desktops/export")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getComputerName, (req, v) -> {
                req.setComputerName(v);
            }));
        builder.<String>withRequestField("terminal_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getTerminalType, (req, v) -> {
                req.setTerminalType(v);
            }));
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getLanguage, (req, v) -> {
                req.setLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> listHistoryOnlineInfoNew =
        genForlistHistoryOnlineInfoNew();

    private static HttpRequestDef<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> genForlistHistoryOnlineInfoNew() {
        // basic
        HttpRequestDef.Builder<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListHistoryOnlineInfoNewRequest.class, ListHistoryOnlineInfoNewResponse.class)
                .withName("ListHistoryOnlineInfoNew")
                .withUri("/v2/{project_id}/connections/online-users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOnlineInfoNewRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOnlineInfoNewRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOnlineInfoNewRequest::getQueryType, (req, v) -> {
                req.setQueryType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> listLoginRecordsNew =
        genForlistLoginRecordsNew();

    private static HttpRequestDef<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> genForlistLoginRecordsNew() {
        // basic
        HttpRequestDef.Builder<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLoginRecordsNewRequest.class, ListLoginRecordsNewResponse.class)
                .withName("ListLoginRecordsNew")
                .withUri("/v2/{project_id}/connections/desktops")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getComputerName, (req, v) -> {
                req.setComputerName(v);
            }));
        builder.<String>withRequestField("terminal_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getTerminalType, (req, v) -> {
                req.setTerminalType(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> batchDeleteDesktops =
        genForbatchDeleteDesktops();

    private static HttpRequestDef<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> genForbatchDeleteDesktops() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteDesktopsRequest.class, BatchDeleteDesktopsResponse.class)
                .withName("BatchDeleteDesktops")
                .withUri("/v2/{project_id}/desktops/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteDesktopsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDesktopsReq.class),
            f -> f.withMarshaller(BatchDeleteDesktopsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRunDesktopsRequest, BatchRunDesktopsResponse> batchRunDesktops =
        genForbatchRunDesktops();

    private static HttpRequestDef<BatchRunDesktopsRequest, BatchRunDesktopsResponse> genForbatchRunDesktops() {
        // basic
        HttpRequestDef.Builder<BatchRunDesktopsRequest, BatchRunDesktopsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchRunDesktopsRequest.class, BatchRunDesktopsResponse.class)
                .withName("BatchRunDesktops")
                .withUri("/v2/{project_id}/desktops/action")
                .withContentType("application/json");

        // requests
        builder.<BatchActionDesktopsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchActionDesktopsReq.class),
            f -> f.withMarshaller(BatchRunDesktopsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDesktopRequest, CreateDesktopResponse> createDesktop =
        genForcreateDesktop();

    private static HttpRequestDef<CreateDesktopRequest, CreateDesktopResponse> genForcreateDesktop() {
        // basic
        HttpRequestDef.Builder<CreateDesktopRequest, CreateDesktopResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDesktopRequest.class, CreateDesktopResponse.class)
                .withName("CreateDesktop")
                .withUri("/v2/{project_id}/desktops")
                .withContentType("application/json");

        // requests
        builder.<CreateDesktopReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDesktopReq.class),
            f -> f.withMarshaller(CreateDesktopRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDesktopRequest, DeleteDesktopResponse> deleteDesktop =
        genFordeleteDesktop();

    private static HttpRequestDef<DeleteDesktopRequest, DeleteDesktopResponse> genFordeleteDesktop() {
        // basic
        HttpRequestDef.Builder<DeleteDesktopRequest, DeleteDesktopResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDesktopRequest.class, DeleteDesktopResponse.class)
                .withName("DeleteDesktop")
                .withUri("/v2/{project_id}/desktops/{desktop_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDesktopRequest::getDesktopId, (req, v) -> {
                req.setDesktopId(v);
            }));
        builder.<Boolean>withRequestField("delete_users",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDesktopRequest::getDeleteUsers, (req, v) -> {
                req.setDeleteUsers(v);
            }));
        builder.<Boolean>withRequestField("email_notification",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDesktopRequest::getEmailNotification, (req, v) -> {
                req.setEmailNotification(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopsRequest, ListDesktopsResponse> listDesktops = genForlistDesktops();

    private static HttpRequestDef<ListDesktopsRequest, ListDesktopsResponse> genForlistDesktops() {
        // basic
        HttpRequestDef.Builder<ListDesktopsRequest, ListDesktopsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDesktopsRequest.class, ListDesktopsResponse.class)
                .withName("ListDesktops")
                .withUri("/v2/{project_id}/desktops")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getComputerName, (req, v) -> {
                req.setComputerName(v);
            }));
        builder.<String>withRequestField("desktop_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getDesktopIp, (req, v) -> {
                req.setDesktopIp(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopsDetailRequest, ListDesktopsDetailResponse> listDesktopsDetail =
        genForlistDesktopsDetail();

    private static HttpRequestDef<ListDesktopsDetailRequest, ListDesktopsDetailResponse> genForlistDesktopsDetail() {
        // basic
        HttpRequestDef.Builder<ListDesktopsDetailRequest, ListDesktopsDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDesktopsDetailRequest.class, ListDesktopsDetailResponse.class)
                .withName("ListDesktopsDetail")
                .withUri("/v2/{project_id}/desktops/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getComputerName, (req, v) -> {
                req.setComputerName(v);
            }));
        builder.<String>withRequestField("desktop_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getDesktopIp, (req, v) -> {
                req.setDesktopIp(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("desktop_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getDesktopId, (req, v) -> {
                req.setDesktopId(v);
            }));
        builder.<String>withRequestField("desktop_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getDesktopType, (req, v) -> {
                req.setDesktopType(v);
            }));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getTag, (req, v) -> {
                req.setTag(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeDesktopRequest, ResizeDesktopResponse> resizeDesktop =
        genForresizeDesktop();

    private static HttpRequestDef<ResizeDesktopRequest, ResizeDesktopResponse> genForresizeDesktop() {
        // basic
        HttpRequestDef.Builder<ResizeDesktopRequest, ResizeDesktopResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeDesktopRequest.class, ResizeDesktopResponse.class)
                .withName("ResizeDesktop")
                .withUri("/v2/{project_id}/desktops/resize")
                .withContentType("application/json");

        // requests
        builder.<ResizeDesktopReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeDesktopReq.class),
            f -> f.withMarshaller(ResizeDesktopRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDesktopDetailRequest, ShowDesktopDetailResponse> showDesktopDetail =
        genForshowDesktopDetail();

    private static HttpRequestDef<ShowDesktopDetailRequest, ShowDesktopDetailResponse> genForshowDesktopDetail() {
        // basic
        HttpRequestDef.Builder<ShowDesktopDetailRequest, ShowDesktopDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDesktopDetailRequest.class, ShowDesktopDetailResponse.class)
                .withName("ShowDesktopDetail")
                .withUri("/v2/{project_id}/desktops/{desktop_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopDetailRequest::getDesktopId, (req, v) -> {
                req.setDesktopId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImagesRequest, ListImagesResponse> listImages = genForlistImages();

    private static HttpRequestDef<ListImagesRequest, ListImagesResponse> genForlistImages() {
        // basic
        HttpRequestDef.Builder<ListImagesRequest, ListImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImagesRequest.class, ListImagesResponse.class)
                .withName("ListImages")
                .withUri("/v2/{project_id}/images")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getOsType, (req, v) -> {
                req.setOsType(v);
            }));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getImageType, (req, v) -> {
                req.setImageType(v);
            }));
        builder.<String>withRequestField("platform",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getPlatform, (req, v) -> {
                req.setPlatform(v);
            }));
        builder.<String>withRequestField("architecture",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getArchitecture, (req, v) -> {
                req.setArchitecture(v);
            }));
        builder.<String>withRequestField("package_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getPackageType, (req, v) -> {
                req.setPackageType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImagesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImagesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListItaSubJobsRequest, ListItaSubJobsResponse> listItaSubJobs =
        genForlistItaSubJobs();

    private static HttpRequestDef<ListItaSubJobsRequest, ListItaSubJobsResponse> genForlistItaSubJobs() {
        // basic
        HttpRequestDef.Builder<ListItaSubJobsRequest, ListItaSubJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListItaSubJobsRequest.class, ListItaSubJobsResponse.class)
                .withName("ListItaSubJobs")
                .withUri("/v2/{project_id}/workspace-sub-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getJobType, (req, v) -> {
                req.setJobType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductsRequest, ListProductsResponse> listProducts = genForlistProducts();

    private static HttpRequestDef<ListProductsRequest, ListProductsResponse> genForlistProducts() {
        // basic
        HttpRequestDef.Builder<ListProductsRequest, ListProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductsRequest.class, ListProductsResponse.class)
                .withName("ListProducts")
                .withUri("/v2/{project_id}/products")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            }));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            }));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getOsType, (req, v) -> {
                req.setOsType(v);
            }));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getChargeMode, (req, v) -> {
                req.setChargeMode(v);
            }));
        builder.<String>withRequestField("architecture",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getArchitecture, (req, v) -> {
                req.setArchitecture(v);
            }));
        builder.<String>withRequestField("package_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getPackageType, (req, v) -> {
                req.setPackageType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForshowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForshowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/v2/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse> createTerminalsBindingDesktops =
        genForcreateTerminalsBindingDesktops();

    private static HttpRequestDef<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse> genForcreateTerminalsBindingDesktops() {
        // basic
        HttpRequestDef.Builder<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateTerminalsBindingDesktopsRequest.class,
                    CreateTerminalsBindingDesktopsResponse.class)
                .withName("CreateTerminalsBindingDesktops")
                .withUri("/v2/{project_id}/terminals/binding-desktops")
                .withContentType("application/json");

        // requests
        builder.<CreateTerminalsBindingDesktopsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTerminalsBindingDesktopsRequestBody.class),
            f -> f.withMarshaller(CreateTerminalsBindingDesktopsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse> deleteTerminalsBindingDesktops =
        genFordeleteTerminalsBindingDesktops();

    private static HttpRequestDef<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse> genFordeleteTerminalsBindingDesktops() {
        // basic
        HttpRequestDef.Builder<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteTerminalsBindingDesktopsRequest.class,
                    DeleteTerminalsBindingDesktopsResponse.class)
                .withName("DeleteTerminalsBindingDesktops")
                .withUri("/v2/{project_id}/terminals/binding-desktops/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteTerminalsBindingDesktopsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTerminalsBindingDesktopsRequestBody.class),
            f -> f.withMarshaller(DeleteTerminalsBindingDesktopsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse> listTerminalsBindingDesktops =
        genForlistTerminalsBindingDesktops();

    private static HttpRequestDef<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse> genForlistTerminalsBindingDesktops() {
        // basic
        HttpRequestDef.Builder<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTerminalsBindingDesktopsRequest.class,
                    ListTerminalsBindingDesktopsResponse.class)
                .withName("ListTerminalsBindingDesktops")
                .withUri("/v2/{project_id}/terminals/binding-desktops")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getComputerName, (req, v) -> {
                req.setComputerName(v);
            }));
        builder.<String>withRequestField("mac",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getMac, (req, v) -> {
                req.setMac(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("count_only",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getCountOnly, (req, v) -> {
                req.setCountOnly(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse> listTerminalsBindingDesktopsConfig =
        genForlistTerminalsBindingDesktopsConfig();

    private static HttpRequestDef<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse> genForlistTerminalsBindingDesktopsConfig() {
        // basic
        HttpRequestDef.Builder<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTerminalsBindingDesktopsConfigRequest.class,
                    ListTerminalsBindingDesktopsConfigResponse.class)
                .withName("ListTerminalsBindingDesktopsConfig")
                .withUri("/v2/{project_id}/terminals/binding-desktops/config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse> updateTerminalsBindingDesktops =
        genForupdateTerminalsBindingDesktops();

    private static HttpRequestDef<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse> genForupdateTerminalsBindingDesktops() {
        // basic
        HttpRequestDef.Builder<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateTerminalsBindingDesktopsRequest.class,
                    UpdateTerminalsBindingDesktopsResponse.class)
                .withName("UpdateTerminalsBindingDesktops")
                .withUri("/v2/{project_id}/terminals/binding-desktops")
                .withContentType("application/json");

        // requests
        builder.<UpdateTerminalsBindingDesktopsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTerminalsBindingDesktopsRequestBody.class),
            f -> f.withMarshaller(UpdateTerminalsBindingDesktopsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse> updateTerminalsBindingDesktopsConfig =
        genForupdateTerminalsBindingDesktopsConfig();

    private static HttpRequestDef<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse> genForupdateTerminalsBindingDesktopsConfig() {
        // basic
        HttpRequestDef.Builder<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateTerminalsBindingDesktopsConfigRequest.class,
                    UpdateTerminalsBindingDesktopsConfigResponse.class)
                .withName("UpdateTerminalsBindingDesktopsConfig")
                .withUri("/v2/{project_id}/terminals/binding-desktops/config")
                .withContentType("application/json");

        // requests
        builder.<TerminalsBindingDesktopsConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TerminalsBindingDesktopsConfig.class),
            f -> f.withMarshaller(UpdateTerminalsBindingDesktopsConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse> batchDeleteOtpDevices =
        genForbatchDeleteOtpDevices();

    private static HttpRequestDef<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse> genForbatchDeleteOtpDevices() {
        // basic
        HttpRequestDef.Builder<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteOtpDevicesRequest.class, BatchDeleteOtpDevicesResponse.class)
            .withName("BatchDeleteOtpDevices")
            .withUri("/v2/{project_id}/users/{user_id}/otp-devices")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteOtpDevicesRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<DelOtpDevicesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DelOtpDevicesReq.class),
            f -> f.withMarshaller(BatchDeleteOtpDevicesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeUserStatusRequest, ChangeUserStatusResponse> changeUserStatus =
        genForchangeUserStatus();

    private static HttpRequestDef<ChangeUserStatusRequest, ChangeUserStatusResponse> genForchangeUserStatus() {
        // basic
        HttpRequestDef.Builder<ChangeUserStatusRequest, ChangeUserStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeUserStatusRequest.class, ChangeUserStatusResponse.class)
                .withName("ChangeUserStatus")
                .withUri("/v2/{project_id}/users/{user_id}/actions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeUserStatusRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<OperateUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateUserReq.class),
            f -> f.withMarshaller(ChangeUserStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDesktopUserRequest, CreateDesktopUserResponse> createDesktopUser =
        genForcreateDesktopUser();

    private static HttpRequestDef<CreateDesktopUserRequest, CreateDesktopUserResponse> genForcreateDesktopUser() {
        // basic
        HttpRequestDef.Builder<CreateDesktopUserRequest, CreateDesktopUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDesktopUserRequest.class, CreateDesktopUserResponse.class)
                .withName("CreateDesktopUser")
                .withUri("/v2/{project_id}/users")
                .withContentType("application/json");

        // requests
        builder.<CreateUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateUserReq.class),
            f -> f.withMarshaller(CreateDesktopUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserRequest, DeleteUserResponse> deleteUser = genFordeleteUser();

    private static HttpRequestDef<DeleteUserRequest, DeleteUserResponse> genFordeleteUser() {
        // basic
        HttpRequestDef.Builder<DeleteUserRequest, DeleteUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteUserRequest.class, DeleteUserResponse.class)
                .withName("DeleteUser")
                .withUri("/v2/{project_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse> listOtpDevicesByUserId =
        genForlistOtpDevicesByUserId();

    private static HttpRequestDef<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse> genForlistOtpDevicesByUserId() {
        // basic
        HttpRequestDef.Builder<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListOtpDevicesByUserIdRequest.class, ListOtpDevicesByUserIdResponse.class)
            .withName("ListOtpDevicesByUserId")
            .withUri("/v2/{project_id}/users/{user_id}/otp-devices")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOtpDevicesByUserIdRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserDetailRequest, ListUserDetailResponse> listUserDetail =
        genForlistUserDetail();

    private static HttpRequestDef<ListUserDetailRequest, ListUserDetailResponse> genForlistUserDetail() {
        // basic
        HttpRequestDef.Builder<ListUserDetailRequest, ListUserDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserDetailRequest.class, ListUserDetailResponse.class)
                .withName("ListUserDetail")
                .withUri("/v2/{project_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserDetailRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersRequest, ListUsersResponse> listUsers = genForlistUsers();

    private static HttpRequestDef<ListUsersRequest, ListUsersResponse> genForlistUsers() {
        // basic
        HttpRequestDef.Builder<ListUsersRequest, ListUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersRequest.class, ListUsersResponse.class)
                .withName("ListUsers")
                .withUri("/v2/{project_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserInfoRequest, UpdateUserInfoResponse> updateUserInfo =
        genForupdateUserInfo();

    private static HttpRequestDef<UpdateUserInfoRequest, UpdateUserInfoResponse> genForupdateUserInfo() {
        // basic
        HttpRequestDef.Builder<UpdateUserInfoRequest, UpdateUserInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserInfoRequest.class, UpdateUserInfoResponse.class)
                .withName("UpdateUserInfo")
                .withUri("/v2/{project_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserInfoRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<EditUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EditUserReq.class),
            f -> f.withMarshaller(UpdateUserInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddVolumesRequest, AddVolumesResponse> addVolumes = genForaddVolumes();

    private static HttpRequestDef<AddVolumesRequest, AddVolumesResponse> genForaddVolumes() {
        // basic
        HttpRequestDef.Builder<AddVolumesRequest, AddVolumesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddVolumesRequest.class, AddVolumesResponse.class)
                .withName("AddVolumes")
                .withUri("/v2/{project_id}/volumes")
                .withContentType("application/json");

        // requests
        builder.<AddDesktopsVolumesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDesktopsVolumesReq.class),
            f -> f.withMarshaller(AddVolumesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse> deleteDesktopVolumes =
        genFordeleteDesktopVolumes();

    private static HttpRequestDef<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse> genFordeleteDesktopVolumes() {
        // basic
        HttpRequestDef.Builder<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteDesktopVolumesRequest.class, DeleteDesktopVolumesResponse.class)
            .withName("DeleteDesktopVolumes")
            .withUri("/v2/{project_id}/desktops/{desktop_id}/volumes/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDesktopVolumesRequest::getDesktopId, (req, v) -> {
                req.setDesktopId(v);
            }));
        builder.<DeleteVolumesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteVolumesReq.class),
            f -> f.withMarshaller(DeleteDesktopVolumesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandVolumesRequest, ExpandVolumesResponse> expandVolumes =
        genForexpandVolumes();

    private static HttpRequestDef<ExpandVolumesRequest, ExpandVolumesResponse> genForexpandVolumes() {
        // basic
        HttpRequestDef.Builder<ExpandVolumesRequest, ExpandVolumesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandVolumesRequest.class, ExpandVolumesResponse.class)
                .withName("ExpandVolumes")
                .withUri("/v2/{project_id}/volumes/expand")
                .withContentType("application/json");

        // requests
        builder.<ExpandDesktopsVolumesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandDesktopsVolumesReq.class),
            f -> f.withMarshaller(ExpandVolumesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyWorkspaceRequest, ApplyWorkspaceResponse> applyWorkspace =
        genForapplyWorkspace();

    private static HttpRequestDef<ApplyWorkspaceRequest, ApplyWorkspaceResponse> genForapplyWorkspace() {
        // basic
        HttpRequestDef.Builder<ApplyWorkspaceRequest, ApplyWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ApplyWorkspaceRequest.class, ApplyWorkspaceResponse.class)
                .withName("ApplyWorkspace")
                .withUri("/v2/{project_id}/workspaces")
                .withContentType("application/json");

        // requests
        builder.<ApplyWorkspaceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyWorkspaceReq.class),
            f -> f.withMarshaller(ApplyWorkspaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelWorkspaceRequest, CancelWorkspaceResponse> cancelWorkspace =
        genForcancelWorkspace();

    private static HttpRequestDef<CancelWorkspaceRequest, CancelWorkspaceResponse> genForcancelWorkspace() {
        // basic
        HttpRequestDef.Builder<CancelWorkspaceRequest, CancelWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelWorkspaceRequest.class, CancelWorkspaceResponse.class)
                .withName("CancelWorkspace")
                .withUri("/v2/{project_id}/workspaces")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspaces =
        genForlistWorkspaces();

    private static HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> genForlistWorkspaces() {
        // basic
        HttpRequestDef.Builder<ListWorkspacesRequest, ListWorkspacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkspacesRequest.class, ListWorkspacesResponse.class)
                .withName("ListWorkspaces")
                .withUri("/v2/{project_id}/workspaces")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse> showWorkspaceLock =
        genForshowWorkspaceLock();

    private static HttpRequestDef<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse> genForshowWorkspaceLock() {
        // basic
        HttpRequestDef.Builder<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkspaceLockRequest.class, ShowWorkspaceLockResponse.class)
                .withName("ShowWorkspaceLock")
                .withUri("/v2/{project_id}/workspaces/lock-status")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnlockWorkspaceRequest, UnlockWorkspaceResponse> unlockWorkspace =
        genForunlockWorkspace();

    private static HttpRequestDef<UnlockWorkspaceRequest, UnlockWorkspaceResponse> genForunlockWorkspace() {
        // basic
        HttpRequestDef.Builder<UnlockWorkspaceRequest, UnlockWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UnlockWorkspaceRequest.class, UnlockWorkspaceResponse.class)
                .withName("UnlockWorkspace")
                .withUri("/v2/{project_id}/workspaces/lock-status")
                .withContentType("application/json");

        // requests
        builder.<UnlockWorkspaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnlockWorkspaceRequestBody.class),
            f -> f.withMarshaller(UnlockWorkspaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspace =
        genForupdateWorkspace();

    private static HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> genForupdateWorkspace() {
        // basic
        HttpRequestDef.Builder<UpdateWorkspaceRequest, UpdateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWorkspaceRequest.class, UpdateWorkspaceResponse.class)
                .withName("UpdateWorkspace")
                .withUri("/v2/{project_id}/workspaces")
                .withContentType("application/json");

        // requests
        builder.<ModifyWorkspaceAttributesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyWorkspaceAttributesReq.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
