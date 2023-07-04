package com.huaweicloud.sdk.lts.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.lts.v2.model.*;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class LtsMeta {

    public static final HttpRequestDef<CreateAccessConfigRequest, CreateAccessConfigResponse> createAccessConfig =
        genForcreateAccessConfig();

    private static HttpRequestDef<CreateAccessConfigRequest, CreateAccessConfigResponse> genForcreateAccessConfig() {
        // basic
        HttpRequestDef.Builder<CreateAccessConfigRequest, CreateAccessConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccessConfigRequest.class, CreateAccessConfigResponse.class)
                .withName("CreateAccessConfig")
                .withUri("/v3/{project_id}/lts/access-config")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateAccessConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAccessConfigRequestBody.class),
            f -> f.withMarshaller(CreateAccessConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDashBoardRequest, CreateDashBoardResponse> createDashBoard =
        genForcreateDashBoard();

    private static HttpRequestDef<CreateDashBoardRequest, CreateDashBoardResponse> genForcreateDashBoard() {
        // basic
        HttpRequestDef.Builder<CreateDashBoardRequest, CreateDashBoardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDashBoardRequest.class, CreateDashBoardResponse.class)
                .withName("CreateDashBoard")
                .withUri("/v2/{project_id}/dashboard")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateDashBoardReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDashBoardReqBody.class),
            f -> f.withMarshaller(CreateDashBoardRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDashboardGroupRequest, CreateDashboardGroupResponse> createDashboardGroup =
        genForcreateDashboardGroup();

    private static HttpRequestDef<CreateDashboardGroupRequest, CreateDashboardGroupResponse> genForcreateDashboardGroup() {
        // basic
        HttpRequestDef.Builder<CreateDashboardGroupRequest, CreateDashboardGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDashboardGroupRequest.class, CreateDashboardGroupResponse.class)
            .withName("CreateDashboardGroup")
            .withUri("/v2/{project_id}/lts/dashboard-group")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateDashboardGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDashboardGroupReq.class),
            f -> f.withMarshaller(CreateDashboardGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHostGroupRequest, CreateHostGroupResponse> createHostGroup =
        genForcreateHostGroup();

    private static HttpRequestDef<CreateHostGroupRequest, CreateHostGroupResponse> genForcreateHostGroup() {
        // basic
        HttpRequestDef.Builder<CreateHostGroupRequest, CreateHostGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHostGroupRequest.class, CreateHostGroupResponse.class)
                .withName("CreateHostGroup")
                .withUri("/v3/{project_id}/lts/host-group")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateHostGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHostGroupRequestBody.class),
            f -> f.withMarshaller(CreateHostGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse> createKeywordsAlarmRule =
        genForcreateKeywordsAlarmRule();

    private static HttpRequestDef<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse> genForcreateKeywordsAlarmRule() {
        // basic
        HttpRequestDef.Builder<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateKeywordsAlarmRuleRequest.class, CreateKeywordsAlarmRuleResponse.class)
            .withName("CreateKeywordsAlarmRule")
            .withUri("/v2/{project_id}/lts/alarms/keywords-alarm-rule")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateKeywordsAlarmRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateKeywordsAlarmRuleRequestBody.class),
            f -> f.withMarshaller(CreateKeywordsAlarmRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogDumpObsRequest, CreateLogDumpObsResponse> createLogDumpObs =
        genForcreateLogDumpObs();

    private static HttpRequestDef<CreateLogDumpObsRequest, CreateLogDumpObsResponse> genForcreateLogDumpObs() {
        // basic
        HttpRequestDef.Builder<CreateLogDumpObsRequest, CreateLogDumpObsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLogDumpObsRequest.class, CreateLogDumpObsResponse.class)
                .withName("CreateLogDumpObs")
                .withUri("/v2/{project_id}/log-dump/obs")
                .withContentType("application/json");

        // requests
        builder.<CreateLogDumpObsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLogDumpObsRequestBody.class),
            f -> f.withMarshaller(CreateLogDumpObsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogGroupRequest, CreateLogGroupResponse> createLogGroup =
        genForcreateLogGroup();

    private static HttpRequestDef<CreateLogGroupRequest, CreateLogGroupResponse> genForcreateLogGroup() {
        // basic
        HttpRequestDef.Builder<CreateLogGroupRequest, CreateLogGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLogGroupRequest.class, CreateLogGroupResponse.class)
                .withName("CreateLogGroup")
                .withUri("/v2/{project_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<CreateLogGroupParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLogGroupParams.class),
            f -> f.withMarshaller(CreateLogGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogStreamRequest, CreateLogStreamResponse> createLogStream =
        genForcreateLogStream();

    private static HttpRequestDef<CreateLogStreamRequest, CreateLogStreamResponse> genForcreateLogStream() {
        // basic
        HttpRequestDef.Builder<CreateLogStreamRequest, CreateLogStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLogStreamRequest.class, CreateLogStreamResponse.class)
                .withName("CreateLogStream")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLogStreamRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<CreateLogStreamParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLogStreamParams.class),
            f -> f.withMarshaller(CreateLogStreamRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNotificationTemplateRequest, CreateNotificationTemplateResponse> createNotificationTemplate =
        genForcreateNotificationTemplate();

    private static HttpRequestDef<CreateNotificationTemplateRequest, CreateNotificationTemplateResponse> genForcreateNotificationTemplate() {
        // basic
        HttpRequestDef.Builder<CreateNotificationTemplateRequest, CreateNotificationTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateNotificationTemplateRequest.class,
                    CreateNotificationTemplateResponse.class)
                .withName("CreateNotificationTemplate")
                .withUri("/v2/{project_id}/{domain_id}/lts/events/notification/templates")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNotificationTemplateRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<CreateNotificationTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNotificationTemplateRequestBody.class),
            f -> f.withMarshaller(CreateNotificationTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSearchCriteriasRequest, CreateSearchCriteriasResponse> createSearchCriterias =
        genForcreateSearchCriterias();

    private static HttpRequestDef<CreateSearchCriteriasRequest, CreateSearchCriteriasResponse> genForcreateSearchCriterias() {
        // basic
        HttpRequestDef.Builder<CreateSearchCriteriasRequest, CreateSearchCriteriasResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSearchCriteriasRequest.class, CreateSearchCriteriasResponse.class)
            .withName("CreateSearchCriterias")
            .withUri("/v1.0/{project_id}/groups/{group_id}/topics/{topic_id}/search-criterias")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSearchCriteriasRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("topic_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSearchCriteriasRequest::getTopicId, (req, v) -> {
                req.setTopicId(v);
            }));
        builder.<CreateSearchCriteriasBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateSearchCriteriasBody.class),
            f -> f.withMarshaller(CreateSearchCriteriasRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStructConfigRequest, CreateStructConfigResponse> createStructConfig =
        genForcreateStructConfig();

    private static HttpRequestDef<CreateStructConfigRequest, CreateStructConfigResponse> genForcreateStructConfig() {
        // basic
        HttpRequestDef.Builder<CreateStructConfigRequest, CreateStructConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStructConfigRequest.class, CreateStructConfigResponse.class)
                .withName("CreateStructConfig")
                .withUri("/v3/{project_id}/lts/struct/template")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<StructConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StructConfig.class),
            f -> f.withMarshaller(CreateStructConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateStructConfigResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreateStructTemplateRequest, CreateStructTemplateResponse> createStructTemplate =
        genForcreateStructTemplate();

    private static HttpRequestDef<CreateStructTemplateRequest, CreateStructTemplateResponse> genForcreateStructTemplate() {
        // basic
        HttpRequestDef.Builder<CreateStructTemplateRequest, CreateStructTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateStructTemplateRequest.class, CreateStructTemplateResponse.class)
            .withName("CreateStructTemplate")
            .withUri("/v2/{project_id}/lts/struct/template")
            .withContentType("application/json");

        // requests
        builder.<LtsStructTemplateInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LtsStructTemplateInfo.class),
            f -> f.withMarshaller(CreateStructTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateStructTemplateResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagsRequest, CreateTagsResponse> createTags = genForcreateTags();

    private static HttpRequestDef<CreateTagsRequest, CreateTagsResponse> genForcreateTags() {
        // basic
        HttpRequestDef.Builder<CreateTagsRequest, CreateTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagsRequest.class, CreateTagsResponse.class)
                .withName("CreateTags")
                .withUri("/v1/{project_id}/{resource_type}/{resource_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<CreateTagsReqbody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateTagsReqbody.class),
            f -> f.withMarshaller(CreateTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTransferRequest, CreateTransferResponse> createTransfer =
        genForcreateTransfer();

    private static HttpRequestDef<CreateTransferRequest, CreateTransferResponse> genForcreateTransfer() {
        // basic
        HttpRequestDef.Builder<CreateTransferRequest, CreateTransferResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTransferRequest.class, CreateTransferResponse.class)
                .withName("CreateTransfer")
                .withUri("/v2/{project_id}/transfers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateTransferRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTransferRequestBody.class),
            f -> f.withMarshaller(CreateTransferRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatefavoriteRequest, CreatefavoriteResponse> createfavorite =
        genForcreatefavorite();

    private static HttpRequestDef<CreatefavoriteRequest, CreatefavoriteResponse> genForcreatefavorite() {
        // basic
        HttpRequestDef.Builder<CreatefavoriteRequest, CreatefavoriteResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatefavoriteRequest.class, CreatefavoriteResponse.class)
                .withName("Createfavorite")
                .withUri("/v1.0/{project_id}/lts/favorite")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreatefavoriteReqbody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatefavoriteReqbody.class),
            f -> f.withMarshaller(CreatefavoriteRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAccessConfigRequest, DeleteAccessConfigResponse> deleteAccessConfig =
        genFordeleteAccessConfig();

    private static HttpRequestDef<DeleteAccessConfigRequest, DeleteAccessConfigResponse> genFordeleteAccessConfig() {
        // basic
        HttpRequestDef.Builder<DeleteAccessConfigRequest, DeleteAccessConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAccessConfigRequest.class, DeleteAccessConfigResponse.class)
                .withName("DeleteAccessConfig")
                .withUri("/v3/{project_id}/lts/access-config")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteAccessConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAccessConfigRequestBody.class),
            f -> f.withMarshaller(DeleteAccessConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse> deleteActiveAlarms =
        genFordeleteActiveAlarms();

    private static HttpRequestDef<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse> genFordeleteActiveAlarms() {
        // basic
        HttpRequestDef.Builder<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteActiveAlarmsRequest.class, DeleteActiveAlarmsResponse.class)
                .withName("DeleteActiveAlarms")
                .withUri("/v2/{project_id}/{domain_id}/lts/alarms/sql-alarm/clear")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteActiveAlarmsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<DeleteActiveAlarmsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteActiveAlarmsRequestBody.class),
            f -> f.withMarshaller(DeleteActiveAlarmsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHostGroupRequest, DeleteHostGroupResponse> deleteHostGroup =
        genFordeleteHostGroup();

    private static HttpRequestDef<DeleteHostGroupRequest, DeleteHostGroupResponse> genFordeleteHostGroup() {
        // basic
        HttpRequestDef.Builder<DeleteHostGroupRequest, DeleteHostGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHostGroupRequest.class, DeleteHostGroupResponse.class)
                .withName("DeleteHostGroup")
                .withUri("/v3/{project_id}/lts/host-group")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteHostGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteHostGroupRequestBody.class),
            f -> f.withMarshaller(DeleteHostGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse> deleteKeywordsAlarmRule =
        genFordeleteKeywordsAlarmRule();

    private static HttpRequestDef<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse> genFordeleteKeywordsAlarmRule() {
        // basic
        HttpRequestDef.Builder<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteKeywordsAlarmRuleRequest.class, DeleteKeywordsAlarmRuleResponse.class)
            .withName("DeleteKeywordsAlarmRule")
            .withUri("/v2/{project_id}/lts/alarms/keywords-alarm-rule/{keywords_alarm_rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keywords_alarm_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKeywordsAlarmRuleRequest::getKeywordsAlarmRuleId, (req, v) -> {
                req.setKeywordsAlarmRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogGroupRequest, DeleteLogGroupResponse> deleteLogGroup =
        genFordeleteLogGroup();

    private static HttpRequestDef<DeleteLogGroupRequest, DeleteLogGroupResponse> genFordeleteLogGroup() {
        // basic
        HttpRequestDef.Builder<DeleteLogGroupRequest, DeleteLogGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLogGroupRequest.class, DeleteLogGroupResponse.class)
                .withName("DeleteLogGroup")
                .withUri("/v2/{project_id}/groups/{log_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogGroupRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteLogGroupResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogStreamRequest, DeleteLogStreamResponse> deleteLogStream =
        genFordeleteLogStream();

    private static HttpRequestDef<DeleteLogStreamRequest, DeleteLogStreamResponse> genFordeleteLogStream() {
        // basic
        HttpRequestDef.Builder<DeleteLogStreamRequest, DeleteLogStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLogStreamRequest.class, DeleteLogStreamResponse.class)
                .withName("DeleteLogStream")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams/{log_stream_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogStreamRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<String>withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogStreamRequest::getLogStreamId, (req, v) -> {
                req.setLogStreamId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteLogStreamResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNotificationTemplateRequest, DeleteNotificationTemplateResponse> deleteNotificationTemplate =
        genFordeleteNotificationTemplate();

    private static HttpRequestDef<DeleteNotificationTemplateRequest, DeleteNotificationTemplateResponse> genFordeleteNotificationTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteNotificationTemplateRequest, DeleteNotificationTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteNotificationTemplateRequest.class,
                    DeleteNotificationTemplateResponse.class)
                .withName("DeleteNotificationTemplate")
                .withUri("/v2/{project_id}/{domain_id}/lts/events/notification/templates")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNotificationTemplateRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<DeleteNotificationTemplateBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteNotificationTemplateBody.class),
            f -> f.withMarshaller(DeleteNotificationTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSearchCriteriasRequest, DeleteSearchCriteriasResponse> deleteSearchCriterias =
        genFordeleteSearchCriterias();

    private static HttpRequestDef<DeleteSearchCriteriasRequest, DeleteSearchCriteriasResponse> genFordeleteSearchCriterias() {
        // basic
        HttpRequestDef.Builder<DeleteSearchCriteriasRequest, DeleteSearchCriteriasResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSearchCriteriasRequest.class, DeleteSearchCriteriasResponse.class)
            .withName("DeleteSearchCriterias")
            .withUri("/v1.0/{project_id}/groups/{group_id}/topics/{topic_id}/search-criterias")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSearchCriteriasRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("topic_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSearchCriteriasRequest::getTopicId, (req, v) -> {
                req.setTopicId(v);
            }));
        builder.<DeleteSearchCriterias>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteSearchCriterias.class),
            f -> f.withMarshaller(DeleteSearchCriteriasRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStructTemplateRequest, DeleteStructTemplateResponse> deleteStructTemplate =
        genFordeleteStructTemplate();

    private static HttpRequestDef<DeleteStructTemplateRequest, DeleteStructTemplateResponse> genFordeleteStructTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteStructTemplateRequest, DeleteStructTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteStructTemplateRequest.class, DeleteStructTemplateResponse.class)
            .withName("DeleteStructTemplate")
            .withUri("/v2/{project_id}/lts/struct/template")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteStructTemplateReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteStructTemplateReqBody.class),
            f -> f.withMarshaller(DeleteStructTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteStructTemplateResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTransferRequest, DeleteTransferResponse> deleteTransfer =
        genFordeleteTransfer();

    private static HttpRequestDef<DeleteTransferRequest, DeleteTransferResponse> genFordeleteTransfer() {
        // basic
        HttpRequestDef.Builder<DeleteTransferRequest, DeleteTransferResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTransferRequest.class, DeleteTransferResponse.class)
                .withName("DeleteTransfer")
                .withUri("/v2/{project_id}/transfers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_transfer_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTransferRequest::getLogTransferId, (req, v) -> {
                req.setLogTransferId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletefavoriteRequest, DeletefavoriteResponse> deletefavorite =
        genFordeletefavorite();

    private static HttpRequestDef<DeletefavoriteRequest, DeletefavoriteResponse> genFordeletefavorite() {
        // basic
        HttpRequestDef.Builder<DeletefavoriteRequest, DeletefavoriteResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletefavoriteRequest.class, DeletefavoriteResponse.class)
                .withName("Deletefavorite")
                .withUri("/v1.0/{project_id}/lts/favorite/{fav_res_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fav_res_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletefavoriteRequest::getFavResId, (req, v) -> {
                req.setFavResId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableLogCollectionRequest, DisableLogCollectionResponse> disableLogCollection =
        genFordisableLogCollection();

    private static HttpRequestDef<DisableLogCollectionRequest, DisableLogCollectionResponse> genFordisableLogCollection() {
        // basic
        HttpRequestDef.Builder<DisableLogCollectionRequest, DisableLogCollectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DisableLogCollectionRequest.class, DisableLogCollectionResponse.class)
            .withName("DisableLogCollection")
            .withUri("/v2/{project_id}/collection/disable")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableLogCollectionRequest, EnableLogCollectionResponse> enableLogCollection =
        genForenableLogCollection();

    private static HttpRequestDef<EnableLogCollectionRequest, EnableLogCollectionResponse> genForenableLogCollection() {
        // basic
        HttpRequestDef.Builder<EnableLogCollectionRequest, EnableLogCollectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableLogCollectionRequest.class, EnableLogCollectionResponse.class)
                .withName("EnableLogCollection")
                .withUri("/v2/{project_id}/collection/enable")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessConfigRequest, ListAccessConfigResponse> listAccessConfig =
        genForlistAccessConfig();

    private static HttpRequestDef<ListAccessConfigRequest, ListAccessConfigResponse> genForlistAccessConfig() {
        // basic
        HttpRequestDef.Builder<ListAccessConfigRequest, ListAccessConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAccessConfigRequest.class, ListAccessConfigResponse.class)
                .withName("ListAccessConfig")
                .withUri("/v3/{project_id}/lts/access-config-list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<GetAccessConfigListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetAccessConfigListRequestBody.class),
            f -> f.withMarshaller(ListAccessConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse> listActiveOrHistoryAlarms =
        genForlistActiveOrHistoryAlarms();

    private static HttpRequestDef<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse> genForlistActiveOrHistoryAlarms() {
        // basic
        HttpRequestDef.Builder<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListActiveOrHistoryAlarmsRequest.class,
                    ListActiveOrHistoryAlarmsResponse.class)
                .withName("ListActiveOrHistoryAlarms")
                .withUri("/v2/{project_id}/{domain_id}/lts/alarms/sql-alarm/query")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActiveOrHistoryAlarmsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<ListActiveOrHistoryAlarmsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListActiveOrHistoryAlarmsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListActiveOrHistoryAlarmsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActiveOrHistoryAlarmsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListActiveOrHistoryAlarmsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListActiveOrHistoryAlarmsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListActiveOrHistoryAlarmsRequestBody.class),
            f -> f.withMarshaller(ListActiveOrHistoryAlarmsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBreifStructTemplateRequest, ListBreifStructTemplateResponse> listBreifStructTemplate =
        genForlistBreifStructTemplate();

    private static HttpRequestDef<ListBreifStructTemplateRequest, ListBreifStructTemplateResponse> genForlistBreifStructTemplate() {
        // basic
        HttpRequestDef.Builder<ListBreifStructTemplateRequest, ListBreifStructTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListBreifStructTemplateRequest.class, ListBreifStructTemplateResponse.class)
            .withName("ListBreifStructTemplate")
            .withUri("/v3/{project_id}/lts/struct/customtemplate/list")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListChartsRequest, ListChartsResponse> listCharts = genForlistCharts();

    private static HttpRequestDef<ListChartsRequest, ListChartsResponse> genForlistCharts() {
        // basic
        HttpRequestDef.Builder<ListChartsRequest, ListChartsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListChartsRequest.class, ListChartsResponse.class)
                .withName("ListCharts")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams/{log_stream_id}/charts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChartsRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<String>withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChartsRequest::getLogStreamId, (req, v) -> {
                req.setLogStreamId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListChartsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListChartsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCriteriasRequest, ListCriteriasResponse> listCriterias =
        genForlistCriterias();

    private static HttpRequestDef<ListCriteriasRequest, ListCriteriasResponse> genForlistCriterias() {
        // basic
        HttpRequestDef.Builder<ListCriteriasRequest, ListCriteriasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCriteriasRequest.class, ListCriteriasResponse.class)
                .withName("ListCriterias")
                .withUri("/v1.0/{project_id}/groups/{group_id}/topics/{topic_id}/search-criterias")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCriteriasRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("topic_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCriteriasRequest::getTopicId, (req, v) -> {
                req.setTopicId(v);
            }));
        builder.<String>withRequestField("search_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCriteriasRequest::getSearchType, (req, v) -> {
                req.setSearchType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistorySqlRequest, ListHistorySqlResponse> listHistorySql =
        genForlistHistorySql();

    private static HttpRequestDef<ListHistorySqlRequest, ListHistorySqlResponse> genForlistHistorySql() {
        // basic
        HttpRequestDef.Builder<ListHistorySqlRequest, ListHistorySqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHistorySqlRequest.class, ListHistorySqlResponse.class)
                .withName("ListHistorySql")
                .withUri("/v2/{project_id}/lts/history-sql")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistorySqlRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<String>withRequestField("log_stream_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistorySqlRequest::getLogStreamId, (req, v) -> {
                req.setLogStreamId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostRequest, ListHostResponse> listHost = genForlistHost();

    private static HttpRequestDef<ListHostRequest, ListHostResponse> genForlistHost() {
        // basic
        HttpRequestDef.Builder<ListHostRequest, ListHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListHostRequest.class, ListHostResponse.class)
                .withName("ListHost")
                .withUri("/v3/{project_id}/lts/host-list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<GetHostListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetHostListRequestBody.class),
            f -> f.withMarshaller(ListHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostGroupRequest, ListHostGroupResponse> listHostGroup =
        genForlistHostGroup();

    private static HttpRequestDef<ListHostGroupRequest, ListHostGroupResponse> genForlistHostGroup() {
        // basic
        HttpRequestDef.Builder<ListHostGroupRequest, ListHostGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListHostGroupRequest.class, ListHostGroupResponse.class)
                .withName("ListHostGroup")
                .withUri("/v3/{project_id}/lts/host-group-list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<GetHostGroupListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetHostGroupListRequestBody.class),
            f -> f.withMarshaller(ListHostGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse> listKeywordsAlarmRules =
        genForlistKeywordsAlarmRules();

    private static HttpRequestDef<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse> genForlistKeywordsAlarmRules() {
        // basic
        HttpRequestDef.Builder<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListKeywordsAlarmRulesRequest.class, ListKeywordsAlarmRulesResponse.class)
            .withName("ListKeywordsAlarmRules")
            .withUri("/v2/{project_id}/lts/alarms/keywords-alarm-rule")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogGroupsRequest, ListLogGroupsResponse> listLogGroups =
        genForlistLogGroups();

    private static HttpRequestDef<ListLogGroupsRequest, ListLogGroupsResponse> genForlistLogGroups() {
        // basic
        HttpRequestDef.Builder<ListLogGroupsRequest, ListLogGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogGroupsRequest.class, ListLogGroupsResponse.class)
                .withName("ListLogGroups")
                .withUri("/v2/{project_id}/groups")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogHistogramRequest, ListLogHistogramResponse> listLogHistogram =
        genForlistLogHistogram();

    private static HttpRequestDef<ListLogHistogramRequest, ListLogHistogramResponse> genForlistLogHistogram() {
        // basic
        HttpRequestDef.Builder<ListLogHistogramRequest, ListLogHistogramResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListLogHistogramRequest.class, ListLogHistogramResponse.class)
                .withName("ListLogHistogram")
                .withUri("/v2/{project_id}/lts/keyword-count")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<QueryLogKeyWordCountRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryLogKeyWordCountRequestBody.class),
            f -> f.withMarshaller(ListLogHistogramRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogStreamRequest, ListLogStreamResponse> listLogStream =
        genForlistLogStream();

    private static HttpRequestDef<ListLogStreamRequest, ListLogStreamResponse> genForlistLogStream() {
        // basic
        HttpRequestDef.Builder<ListLogStreamRequest, ListLogStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogStreamRequest.class, ListLogStreamResponse.class)
                .withName("ListLogStream")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogStreamRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogStreamRequest::getTag, (req, v) -> {
                req.setTag(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogStreamsRequest, ListLogStreamsResponse> listLogStreams =
        genForlistLogStreams();

    private static HttpRequestDef<ListLogStreamsRequest, ListLogStreamsResponse> genForlistLogStreams() {
        // basic
        HttpRequestDef.Builder<ListLogStreamsRequest, ListLogStreamsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogStreamsRequest.class, ListLogStreamsResponse.class)
                .withName("ListLogStreams")
                .withUri("/v2/{project_id}/log-streams")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogStreamsRequest::getLogGroupName, (req, v) -> {
                req.setLogGroupName(v);
            }));
        builder.<String>withRequestField("log_stream_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogStreamsRequest::getLogStreamName, (req, v) -> {
                req.setLogStreamName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogStreamsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogStreamsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogsRequest, ListLogsResponse> listLogs = genForlistLogs();

    private static HttpRequestDef<ListLogsRequest, ListLogsResponse> genForlistLogs() {
        // basic
        HttpRequestDef.Builder<ListLogsRequest, ListLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListLogsRequest.class, ListLogsResponse.class)
                .withName("ListLogs")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams/{log_stream_id}/content/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogsRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<String>withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogsRequest::getLogStreamId, (req, v) -> {
                req.setLogStreamId(v);
            }));
        builder.<QueryLtsLogParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryLtsLogParams.class),
            f -> f.withMarshaller(ListLogsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotificationTemplateRequest, ListNotificationTemplateResponse> listNotificationTemplate =
        genForlistNotificationTemplate();

    private static HttpRequestDef<ListNotificationTemplateRequest, ListNotificationTemplateResponse> genForlistNotificationTemplate() {
        // basic
        HttpRequestDef.Builder<ListNotificationTemplateRequest, ListNotificationTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ListNotificationTemplateRequest.class, ListNotificationTemplateResponse.class)
                .withName("ListNotificationTemplate")
                .withUri("/v2/{project_id}/{domain_id}/lts/events/notification/templates/view")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotificationTemplateRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<PreviewTemplateBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PreviewTemplateBody.class),
            f -> f.withMarshaller(ListNotificationTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotificationTemplatesRequest, ListNotificationTemplatesResponse> listNotificationTemplates =
        genForlistNotificationTemplates();

    private static HttpRequestDef<ListNotificationTemplatesRequest, ListNotificationTemplatesResponse> genForlistNotificationTemplates() {
        // basic
        HttpRequestDef.Builder<ListNotificationTemplatesRequest, ListNotificationTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListNotificationTemplatesRequest.class,
                    ListNotificationTemplatesResponse.class)
                .withName("ListNotificationTemplates")
                .withUri("/v2/{project_id}/{domain_id}/lts/events/notification/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotificationTemplatesRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotificationTopicsRequest, ListNotificationTopicsResponse> listNotificationTopics =
        genForlistNotificationTopics();

    private static HttpRequestDef<ListNotificationTopicsRequest, ListNotificationTopicsResponse> genForlistNotificationTopics() {
        // basic
        HttpRequestDef.Builder<ListNotificationTopicsRequest, ListNotificationTopicsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListNotificationTopicsRequest.class, ListNotificationTopicsResponse.class)
            .withName("ListNotificationTopics")
            .withUri("/v2/{project_id}/lts/notifications/topics")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationTopicsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationTopicsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryAllSearchCriteriasRequest, ListQueryAllSearchCriteriasResponse> listQueryAllSearchCriterias =
        genForlistQueryAllSearchCriterias();

    private static HttpRequestDef<ListQueryAllSearchCriteriasRequest, ListQueryAllSearchCriteriasResponse> genForlistQueryAllSearchCriterias() {
        // basic
        HttpRequestDef.Builder<ListQueryAllSearchCriteriasRequest, ListQueryAllSearchCriteriasResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListQueryAllSearchCriteriasRequest.class,
                    ListQueryAllSearchCriteriasResponse.class)
                .withName("ListQueryAllSearchCriterias")
                .withUri("/v1.0/{project_id}/lts/groups/{group_id}/search-criterias")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryAllSearchCriteriasRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> listQueryStructuredLogs =
        genForlistQueryStructuredLogs();

    private static HttpRequestDef<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> genForlistQueryStructuredLogs() {
        // basic
        HttpRequestDef.Builder<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListQueryStructuredLogsRequest.class, ListQueryStructuredLogsResponse.class)
            .withName("ListQueryStructuredLogs")
            .withUri("/v2/{project_id}/groups/{log_group_id}/streams/{log_stream_id}/struct-content/query")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryStructuredLogsRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<String>withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryStructuredLogsRequest::getLogStreamId, (req, v) -> {
                req.setLogStreamId(v);
            }));
        builder.<QueryLtsStructLogParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryLtsStructLogParams.class),
            f -> f.withMarshaller(ListQueryStructuredLogsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStructTemplateRequest, ListStructTemplateResponse> listStructTemplate =
        genForlistStructTemplate();

    private static HttpRequestDef<ListStructTemplateRequest, ListStructTemplateResponse> genForlistStructTemplate() {
        // basic
        HttpRequestDef.Builder<ListStructTemplateRequest, ListStructTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStructTemplateRequest.class, ListStructTemplateResponse.class)
                .withName("ListStructTemplate")
                .withUri("/v3/{project_id}/lts/struct/customtemplate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStructTemplateRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> listStructuredLogsWithTimeRange =
        genForlistStructuredLogsWithTimeRange();

    private static HttpRequestDef<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> genForlistStructuredLogsWithTimeRange() {
        // basic
        HttpRequestDef.Builder<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListStructuredLogsWithTimeRangeRequest.class,
                    ListStructuredLogsWithTimeRangeResponse.class)
                .withName("ListStructuredLogsWithTimeRange")
                .withUri("/v2/{project_id}/streams/{log_stream_id}/struct-content/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStructuredLogsWithTimeRangeRequest::getLogStreamId, (req, v) -> {
                req.setLogStreamId(v);
            }));
        builder.<QueryLtsStructLogParamsNew>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryLtsStructLogParamsNew.class),
            f -> f.withMarshaller(ListStructuredLogsWithTimeRangeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<Map<String, List<Object>>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(ListStructuredLogsWithTimeRangeResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(List.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTimeLineTrafficStatisticsRequest, ListTimeLineTrafficStatisticsResponse> listTimeLineTrafficStatistics =
        genForlistTimeLineTrafficStatistics();

    private static HttpRequestDef<ListTimeLineTrafficStatisticsRequest, ListTimeLineTrafficStatisticsResponse> genForlistTimeLineTrafficStatistics() {
        // basic
        HttpRequestDef.Builder<ListTimeLineTrafficStatisticsRequest, ListTimeLineTrafficStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListTimeLineTrafficStatisticsRequest.class,
                    ListTimeLineTrafficStatisticsResponse.class)
                .withName("ListTimeLineTrafficStatistics")
                .withUri("/v2/{project_id}/lts/timeline-traffic-statistics")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("timezone",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTimeLineTrafficStatisticsRequest::getTimezone, (req, v) -> {
                req.setTimezone(v);
            }));
        builder.<TimelineTrafficStatisticsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TimelineTrafficStatisticsRequestBody.class),
            f -> f.withMarshaller(ListTimeLineTrafficStatisticsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopnTrafficStatisticsRequest, ListTopnTrafficStatisticsResponse> listTopnTrafficStatistics =
        genForlistTopnTrafficStatistics();

    private static HttpRequestDef<ListTopnTrafficStatisticsRequest, ListTopnTrafficStatisticsResponse> genForlistTopnTrafficStatistics() {
        // basic
        HttpRequestDef.Builder<ListTopnTrafficStatisticsRequest, ListTopnTrafficStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListTopnTrafficStatisticsRequest.class,
                    ListTopnTrafficStatisticsResponse.class)
                .withName("ListTopnTrafficStatistics")
                .withUri("/v2/{project_id}/lts/topn-traffic-statistics")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<TopnRequstBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TopnRequstBody.class),
            f -> f.withMarshaller(ListTopnTrafficStatisticsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTransfersRequest, ListTransfersResponse> listTransfers =
        genForlistTransfers();

    private static HttpRequestDef<ListTransfersRequest, ListTransfersResponse> genForlistTransfers() {
        // basic
        HttpRequestDef.Builder<ListTransfersRequest, ListTransfersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTransfersRequest.class, ListTransfersResponse.class)
                .withName("ListTransfers")
                .withUri("/v2/{project_id}/transfers")
                .withContentType("application/json");

        // requests
        builder.<ListTransfersRequest.LogTransferTypeEnum>withRequestField("log_transfer_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTransfersRequest.LogTransferTypeEnum.class),
            f -> f.withMarshaller(ListTransfersRequest::getLogTransferType, (req, v) -> {
                req.setLogTransferType(v);
            }));
        builder.<String>withRequestField("log_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTransfersRequest::getLogGroupName, (req, v) -> {
                req.setLogGroupName(v);
            }));
        builder.<String>withRequestField("log_stream_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTransfersRequest::getLogStreamName, (req, v) -> {
                req.setLogStreamName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTransfersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTransfersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterDmsKafkaInstanceRequest, RegisterDmsKafkaInstanceResponse> registerDmsKafkaInstance =
        genForregisterDmsKafkaInstance();

    private static HttpRequestDef<RegisterDmsKafkaInstanceRequest, RegisterDmsKafkaInstanceResponse> genForregisterDmsKafkaInstance() {
        // basic
        HttpRequestDef.Builder<RegisterDmsKafkaInstanceRequest, RegisterDmsKafkaInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, RegisterDmsKafkaInstanceRequest.class, RegisterDmsKafkaInstanceResponse.class)
                .withName("RegisterDmsKafkaInstance")
                .withUri("/v2/{project_id}/lts/dms/kafka-instance")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<RegisterDmsKafkaInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterDmsKafkaInstanceRequestBody.class),
            f -> f.withMarshaller(RegisterDmsKafkaInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNotificationTemplateRequest, ShowNotificationTemplateResponse> showNotificationTemplate =
        genForshowNotificationTemplate();

    private static HttpRequestDef<ShowNotificationTemplateRequest, ShowNotificationTemplateResponse> genForshowNotificationTemplate() {
        // basic
        HttpRequestDef.Builder<ShowNotificationTemplateRequest, ShowNotificationTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowNotificationTemplateRequest.class, ShowNotificationTemplateResponse.class)
                .withName("ShowNotificationTemplate")
                .withUri("/v2/{project_id}/{domain_id}/lts/events/notification/template/{template_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotificationTemplateRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotificationTemplateRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStructTemplateRequest, ShowStructTemplateResponse> showStructTemplate =
        genForshowStructTemplate();

    private static HttpRequestDef<ShowStructTemplateRequest, ShowStructTemplateResponse> genForshowStructTemplate() {
        // basic
        HttpRequestDef.Builder<ShowStructTemplateRequest, ShowStructTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStructTemplateRequest.class, ShowStructTemplateResponse.class)
                .withName("ShowStructTemplate")
                .withUri("/v2/{project_id}/lts/struct/template")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("logGroupId",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStructTemplateRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<String>withRequestField("logStreamId",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStructTemplateRequest::getLogStreamId, (req, v) -> {
                req.setLogStreamId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAccessConfigRequest, UpdateAccessConfigResponse> updateAccessConfig =
        genForupdateAccessConfig();

    private static HttpRequestDef<UpdateAccessConfigRequest, UpdateAccessConfigResponse> genForupdateAccessConfig() {
        // basic
        HttpRequestDef.Builder<UpdateAccessConfigRequest, UpdateAccessConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAccessConfigRequest.class, UpdateAccessConfigResponse.class)
                .withName("UpdateAccessConfig")
                .withUri("/v3/{project_id}/lts/access-config")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateAccessConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAccessConfigRequestBody.class),
            f -> f.withMarshaller(UpdateAccessConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostGroupRequest, UpdateHostGroupResponse> updateHostGroup =
        genForupdateHostGroup();

    private static HttpRequestDef<UpdateHostGroupRequest, UpdateHostGroupResponse> genForupdateHostGroup() {
        // basic
        HttpRequestDef.Builder<UpdateHostGroupRequest, UpdateHostGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHostGroupRequest.class, UpdateHostGroupResponse.class)
                .withName("UpdateHostGroup")
                .withUri("/v3/{project_id}/lts/host-group")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateHostGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHostGroupRequestBody.class),
            f -> f.withMarshaller(UpdateHostGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse> updateKeywordsAlarmRule =
        genForupdateKeywordsAlarmRule();

    private static HttpRequestDef<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse> genForupdateKeywordsAlarmRule() {
        // basic
        HttpRequestDef.Builder<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateKeywordsAlarmRuleRequest.class, UpdateKeywordsAlarmRuleResponse.class)
            .withName("UpdateKeywordsAlarmRule")
            .withUri("/v2/{project_id}/lts/alarms/keywords-alarm-rule")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateKeywordsAlarmRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKeywordsAlarmRuleRequestBody.class),
            f -> f.withMarshaller(UpdateKeywordsAlarmRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogGroupRequest, UpdateLogGroupResponse> updateLogGroup =
        genForupdateLogGroup();

    private static HttpRequestDef<UpdateLogGroupRequest, UpdateLogGroupResponse> genForupdateLogGroup() {
        // basic
        HttpRequestDef.Builder<UpdateLogGroupRequest, UpdateLogGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateLogGroupRequest.class, UpdateLogGroupResponse.class)
                .withName("UpdateLogGroup")
                .withUri("/v2/{project_id}/groups/{log_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogGroupRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<UpdateLogGroupParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLogGroupParams.class),
            f -> f.withMarshaller(UpdateLogGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNotificationTemplateRequest, UpdateNotificationTemplateResponse> updateNotificationTemplate =
        genForupdateNotificationTemplate();

    private static HttpRequestDef<UpdateNotificationTemplateRequest, UpdateNotificationTemplateResponse> genForupdateNotificationTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateNotificationTemplateRequest, UpdateNotificationTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateNotificationTemplateRequest.class,
                    UpdateNotificationTemplateResponse.class)
                .withName("UpdateNotificationTemplate")
                .withUri("/v2/{project_id}/{domain_id}/lts/events/notification/templates")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNotificationTemplateRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<CreateNotificationTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNotificationTemplateRequestBody.class),
            f -> f.withMarshaller(UpdateNotificationTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStructConfigRequest, UpdateStructConfigResponse> updateStructConfig =
        genForupdateStructConfig();

    private static HttpRequestDef<UpdateStructConfigRequest, UpdateStructConfigResponse> genForupdateStructConfig() {
        // basic
        HttpRequestDef.Builder<UpdateStructConfigRequest, UpdateStructConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateStructConfigRequest.class, UpdateStructConfigResponse.class)
                .withName("UpdateStructConfig")
                .withUri("/v3/{project_id}/lts/struct/template")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<StructConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StructConfig.class),
            f -> f.withMarshaller(UpdateStructConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateStructConfigResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStructTemplateRequest, UpdateStructTemplateResponse> updateStructTemplate =
        genForupdateStructTemplate();

    private static HttpRequestDef<UpdateStructTemplateRequest, UpdateStructTemplateResponse> genForupdateStructTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateStructTemplateRequest, UpdateStructTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateStructTemplateRequest.class, UpdateStructTemplateResponse.class)
            .withName("UpdateStructTemplate")
            .withUri("/v2/{project_id}/lts/struct/template")
            .withContentType("application/json");

        // requests
        builder.<LtsStructTemplateInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LtsStructTemplateInfo.class),
            f -> f.withMarshaller(UpdateStructTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateStructTemplateResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTransferRequest, UpdateTransferResponse> updateTransfer =
        genForupdateTransfer();

    private static HttpRequestDef<UpdateTransferRequest, UpdateTransferResponse> genForupdateTransfer() {
        // basic
        HttpRequestDef.Builder<UpdateTransferRequest, UpdateTransferResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTransferRequest.class, UpdateTransferResponse.class)
                .withName("UpdateTransfer")
                .withUri("/v2/{project_id}/transfers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateTransferRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTransferRequestBody.class),
            f -> f.withMarshaller(UpdateTransferRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse> createAomMappingRules =
        genForcreateAomMappingRules();

    private static HttpRequestDef<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse> genForcreateAomMappingRules() {
        // basic
        HttpRequestDef.Builder<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAomMappingRulesRequest.class, CreateAomMappingRulesResponse.class)
            .withName("CreateAomMappingRules")
            .withUri("/v2/{project_id}/lts/aom-mapping")
            .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("isBatch",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CreateAomMappingRulesRequest::getIsBatch, (req, v) -> {
                req.setIsBatch(v);
            }));
        builder.<AomMappingRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AomMappingRequestInfo.class),
            f -> f.withMarshaller(CreateAomMappingRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<AomMappingRuleResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateAomMappingRulesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(AomMappingRuleResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse> deleteAomMappingRules =
        genFordeleteAomMappingRules();

    private static HttpRequestDef<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse> genFordeleteAomMappingRules() {
        // basic
        HttpRequestDef.Builder<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAomMappingRulesRequest.class, DeleteAomMappingRulesResponse.class)
            .withName("DeleteAomMappingRules")
            .withUri("/v2/{project_id}/lts/aom-mapping")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAomMappingRulesRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteAomMappingRulesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> showAomMappingRule =
        genForshowAomMappingRule();

    private static HttpRequestDef<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> genForshowAomMappingRule() {
        // basic
        HttpRequestDef.Builder<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAomMappingRuleRequest.class, ShowAomMappingRuleResponse.class)
                .withName("ShowAomMappingRule")
                .withUri("/v2/{project_id}/lts/aom-mapping/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAomMappingRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));

        // response
        builder.<List<AomMappingRuleResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAomMappingRuleResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(AomMappingRuleResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse> showAomMappingRules =
        genForshowAomMappingRules();

    private static HttpRequestDef<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse> genForshowAomMappingRules() {
        // basic
        HttpRequestDef.Builder<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAomMappingRulesRequest.class, ShowAomMappingRulesResponse.class)
                .withName("ShowAomMappingRules")
                .withUri("/v2/{project_id}/lts/aom-mapping")
                .withContentType("application/json");

        // requests

        // response
        builder.<List<AomMappingRuleResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAomMappingRulesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(AomMappingRuleResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse> updateAomMappingRules =
        genForupdateAomMappingRules();

    private static HttpRequestDef<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse> genForupdateAomMappingRules() {
        // basic
        HttpRequestDef.Builder<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAomMappingRulesRequest.class, UpdateAomMappingRulesResponse.class)
            .withName("UpdateAomMappingRules")
            .withUri("/v2/{project_id}/lts/aom-mapping")
            .withContentType("application/json");

        // requests
        builder.<UpdateAomMappingRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAomMappingRequest.class),
            f -> f.withMarshaller(UpdateAomMappingRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse> createSqlAlarmRule =
        genForcreateSqlAlarmRule();

    private static HttpRequestDef<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse> genForcreateSqlAlarmRule() {
        // basic
        HttpRequestDef.Builder<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSqlAlarmRuleRequest.class, CreateSqlAlarmRuleResponse.class)
                .withName("CreateSqlAlarmRule")
                .withUri("/v2/{project_id}/lts/alarms/sql-alarm-rule")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSqlAlarmRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSqlAlarmRuleRequestBody.class),
            f -> f.withMarshaller(CreateSqlAlarmRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse> deleteSqlAlarmRule =
        genFordeleteSqlAlarmRule();

    private static HttpRequestDef<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse> genFordeleteSqlAlarmRule() {
        // basic
        HttpRequestDef.Builder<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSqlAlarmRuleRequest.class, DeleteSqlAlarmRuleResponse.class)
                .withName("DeleteSqlAlarmRule")
                .withUri("/v2/{project_id}/lts/alarms/sql-alarm-rule/{sql_alarm_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sql_alarm_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlAlarmRuleRequest::getSqlAlarmRuleId, (req, v) -> {
                req.setSqlAlarmRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse> listSqlAlarmRules =
        genForlistSqlAlarmRules();

    private static HttpRequestDef<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse> genForlistSqlAlarmRules() {
        // basic
        HttpRequestDef.Builder<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSqlAlarmRulesRequest.class, ListSqlAlarmRulesResponse.class)
                .withName("ListSqlAlarmRules")
                .withUri("/v2/{project_id}/lts/alarms/sql-alarm-rule")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmRuleStatusRequest, UpdateAlarmRuleStatusResponse> updateAlarmRuleStatus =
        genForupdateAlarmRuleStatus();

    private static HttpRequestDef<UpdateAlarmRuleStatusRequest, UpdateAlarmRuleStatusResponse> genForupdateAlarmRuleStatus() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmRuleStatusRequest, UpdateAlarmRuleStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAlarmRuleStatusRequest.class, UpdateAlarmRuleStatusResponse.class)
            .withName("UpdateAlarmRuleStatus")
            .withUri("/v2/{project_id}/lts/alarms/status")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ChangeAlarmRuleStatus>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeAlarmRuleStatus.class),
            f -> f.withMarshaller(UpdateAlarmRuleStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateAlarmRuleStatusResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse> updateSqlAlarmRule =
        genForupdateSqlAlarmRule();

    private static HttpRequestDef<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse> genForupdateSqlAlarmRule() {
        // basic
        HttpRequestDef.Builder<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSqlAlarmRuleRequest.class, UpdateSqlAlarmRuleResponse.class)
                .withName("UpdateSqlAlarmRule")
                .withUri("/v2/{project_id}/lts/alarms/sql-alarm-rule")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateSqlAlarmRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSqlAlarmRuleRequestBody.class),
            f -> f.withMarshaller(UpdateSqlAlarmRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
