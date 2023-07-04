package com.huaweicloud.sdk.live.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.live.v1.model.*;

import java.time.OffsetDateTime;
import java.util.List;

@SuppressWarnings("unchecked")
public class LiveMeta {

    public static final HttpRequestDef<BatchShowIpBelongsRequest, BatchShowIpBelongsResponse> batchShowIpBelongs =
        genForbatchShowIpBelongs();

    private static HttpRequestDef<BatchShowIpBelongsRequest, BatchShowIpBelongsResponse> genForbatchShowIpBelongs() {
        // basic
        HttpRequestDef.Builder<BatchShowIpBelongsRequest, BatchShowIpBelongsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchShowIpBelongsRequest.class, BatchShowIpBelongsResponse.class)
                .withName("BatchShowIpBelongs")
                .withUri("/v1/{project_id}/cdn/ip-info")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchShowIpBelongsRequest::getIp, (req, v) -> {
                req.setIp(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDomainRequest, CreateDomainResponse> createDomain = genForcreateDomain();

    private static HttpRequestDef<CreateDomainRequest, CreateDomainResponse> genForcreateDomain() {
        // basic
        HttpRequestDef.Builder<CreateDomainRequest, CreateDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDomainRequest.class, CreateDomainResponse.class)
                .withName("CreateDomain")
                .withUri("/v1/{project_id}/domain")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<LiveDomainCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LiveDomainCreateReq.class),
            f -> f.withMarshaller(CreateDomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDomainMappingRequest, CreateDomainMappingResponse> createDomainMapping =
        genForcreateDomainMapping();

    private static HttpRequestDef<CreateDomainMappingRequest, CreateDomainMappingResponse> genForcreateDomainMapping() {
        // basic
        HttpRequestDef.Builder<CreateDomainMappingRequest, CreateDomainMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateDomainMappingRequest.class, CreateDomainMappingResponse.class)
                .withName("CreateDomainMapping")
                .withUri("/v1/{project_id}/domains_mapping")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<DomainMapping>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DomainMapping.class),
            f -> f.withMarshaller(CreateDomainMappingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse> createRecordCallbackConfig =
        genForcreateRecordCallbackConfig();

    private static HttpRequestDef<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse> genForcreateRecordCallbackConfig() {
        // basic
        HttpRequestDef.Builder<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateRecordCallbackConfigRequest.class,
                    CreateRecordCallbackConfigResponse.class)
                .withName("CreateRecordCallbackConfig")
                .withUri("/v1/{project_id}/record/callbacks")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<RecordCallbackConfigRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordCallbackConfigRequest.class),
            f -> f.withMarshaller(CreateRecordCallbackConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordIndexRequest, CreateRecordIndexResponse> createRecordIndex =
        genForcreateRecordIndex();

    private static HttpRequestDef<CreateRecordIndexRequest, CreateRecordIndexResponse> genForcreateRecordIndex() {
        // basic
        HttpRequestDef.Builder<CreateRecordIndexRequest, CreateRecordIndexResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRecordIndexRequest.class, CreateRecordIndexResponse.class)
                .withName("CreateRecordIndex")
                .withUri("/v1/{project_id}/record/indexes")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<RecordIndexRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordIndexRequestBody.class),
            f -> f.withMarshaller(CreateRecordIndexRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRecordIndexResponse::getXRequestId, CreateRecordIndexResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordRuleRequest, CreateRecordRuleResponse> createRecordRule =
        genForcreateRecordRule();

    private static HttpRequestDef<CreateRecordRuleRequest, CreateRecordRuleResponse> genForcreateRecordRule() {
        // basic
        HttpRequestDef.Builder<CreateRecordRuleRequest, CreateRecordRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRecordRuleRequest.class, CreateRecordRuleResponse.class)
                .withName("CreateRecordRule")
                .withUri("/v1/{project_id}/record/rules")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<RecordRuleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordRuleRequest.class),
            f -> f.withMarshaller(CreateRecordRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSnapshotConfigRequest, CreateSnapshotConfigResponse> createSnapshotConfig =
        genForcreateSnapshotConfig();

    private static HttpRequestDef<CreateSnapshotConfigRequest, CreateSnapshotConfigResponse> genForcreateSnapshotConfig() {
        // basic
        HttpRequestDef.Builder<CreateSnapshotConfigRequest, CreateSnapshotConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSnapshotConfigRequest.class, CreateSnapshotConfigResponse.class)
            .withName("CreateSnapshotConfig")
            .withUri("/v1/{project_id}/stream/snapshot")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<LiveSnapshotConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LiveSnapshotConfig.class),
            f -> f.withMarshaller(CreateSnapshotConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse> createStreamForbidden =
        genForcreateStreamForbidden();

    private static HttpRequestDef<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse> genForcreateStreamForbidden() {
        // basic
        HttpRequestDef.Builder<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateStreamForbiddenRequest.class, CreateStreamForbiddenResponse.class)
            .withName("CreateStreamForbidden")
            .withUri("/v1/{project_id}/stream/blocks")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<StreamForbiddenSetting>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StreamForbiddenSetting.class),
            f -> f.withMarshaller(CreateStreamForbiddenRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse> createTranscodingsTemplate =
        genForcreateTranscodingsTemplate();

    private static HttpRequestDef<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse> genForcreateTranscodingsTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateTranscodingsTemplateRequest.class,
                    CreateTranscodingsTemplateResponse.class)
                .withName("CreateTranscodingsTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<StreamTranscodingTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StreamTranscodingTemplate.class),
            f -> f.withMarshaller(CreateTranscodingsTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> deleteDomain = genFordeleteDomain();

    private static HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> genFordeleteDomain() {
        // basic
        HttpRequestDef.Builder<DeleteDomainRequest, DeleteDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainRequest.class, DeleteDomainResponse.class)
                .withName("DeleteDomain")
                .withUri("/v1/{project_id}/domain")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainKeyChainRequest, DeleteDomainKeyChainResponse> deleteDomainKeyChain =
        genFordeleteDomainKeyChain();

    private static HttpRequestDef<DeleteDomainKeyChainRequest, DeleteDomainKeyChainResponse> genFordeleteDomainKeyChain() {
        // basic
        HttpRequestDef.Builder<DeleteDomainKeyChainRequest, DeleteDomainKeyChainResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDomainKeyChainRequest.class, DeleteDomainKeyChainResponse.class)
            .withName("DeleteDomainKeyChain")
            .withUri("/v1/{project_id}/guard/key-chain")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainKeyChainRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainMappingRequest, DeleteDomainMappingResponse> deleteDomainMapping =
        genFordeleteDomainMapping();

    private static HttpRequestDef<DeleteDomainMappingRequest, DeleteDomainMappingResponse> genFordeleteDomainMapping() {
        // basic
        HttpRequestDef.Builder<DeleteDomainMappingRequest, DeleteDomainMappingResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDomainMappingRequest.class, DeleteDomainMappingResponse.class)
            .withName("DeleteDomainMapping")
            .withUri("/v1/{project_id}/domains_mapping")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pull_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainMappingRequest::getPullDomain, (req, v) -> {
                req.setPullDomain(v);
            }));
        builder.<String>withRequestField("push_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainMappingRequest::getPushDomain, (req, v) -> {
                req.setPushDomain(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse> deleteRecordCallbackConfig =
        genFordeleteRecordCallbackConfig();

    private static HttpRequestDef<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse> genFordeleteRecordCallbackConfig() {
        // basic
        HttpRequestDef.Builder<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteRecordCallbackConfigRequest.class,
                    DeleteRecordCallbackConfigResponse.class)
                .withName("DeleteRecordCallbackConfig")
                .withUri("/v1/{project_id}/record/callbacks/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordCallbackConfigRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordRuleRequest, DeleteRecordRuleResponse> deleteRecordRule =
        genFordeleteRecordRule();

    private static HttpRequestDef<DeleteRecordRuleRequest, DeleteRecordRuleResponse> genFordeleteRecordRule() {
        // basic
        HttpRequestDef.Builder<DeleteRecordRuleRequest, DeleteRecordRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRecordRuleRequest.class, DeleteRecordRuleResponse.class)
                .withName("DeleteRecordRule")
                .withUri("/v1/{project_id}/record/rules/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordRuleRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSnapshotConfigRequest, DeleteSnapshotConfigResponse> deleteSnapshotConfig =
        genFordeleteSnapshotConfig();

    private static HttpRequestDef<DeleteSnapshotConfigRequest, DeleteSnapshotConfigResponse> genFordeleteSnapshotConfig() {
        // basic
        HttpRequestDef.Builder<DeleteSnapshotConfigRequest, DeleteSnapshotConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSnapshotConfigRequest.class, DeleteSnapshotConfigResponse.class)
            .withName("DeleteSnapshotConfig")
            .withUri("/v1/{project_id}/stream/snapshot")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotConfigRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotConfigRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse> deleteStreamForbidden =
        genFordeleteStreamForbidden();

    private static HttpRequestDef<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse> genFordeleteStreamForbidden() {
        // basic
        HttpRequestDef.Builder<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteStreamForbiddenRequest.class, DeleteStreamForbiddenResponse.class)
            .withName("DeleteStreamForbidden")
            .withUri("/v1/{project_id}/stream/blocks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStreamForbiddenRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStreamForbiddenRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<String>withRequestField("stream_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStreamForbiddenRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse> deleteTranscodingsTemplate =
        genFordeleteTranscodingsTemplate();

    private static HttpRequestDef<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse> genFordeleteTranscodingsTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteTranscodingsTemplateRequest.class,
                    DeleteTranscodingsTemplateResponse.class)
                .withName("DeleteTranscodingsTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTranscodingsTemplateRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTranscodingsTemplateRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse> listLiveSampleLogs =
        genForlistLiveSampleLogs();

    private static HttpRequestDef<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse> genForlistLiveSampleLogs() {
        // basic
        HttpRequestDef.Builder<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLiveSampleLogsRequest.class, ListLiveSampleLogsResponse.class)
                .withName("ListLiveSampleLogs")
                .withUri("/v1/{project_id}/logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("play_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveSampleLogsRequest::getPlayDomain, (req, v) -> {
                req.setPlayDomain(v);
            }));
        builder.<OffsetDateTime>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListLiveSampleLogsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<OffsetDateTime>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListLiveSampleLogsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse> listLiveStreamsOnline =
        genForlistLiveStreamsOnline();

    private static HttpRequestDef<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse> genForlistLiveStreamsOnline() {
        // basic
        HttpRequestDef.Builder<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListLiveStreamsOnlineRequest.class, ListLiveStreamsOnlineResponse.class)
            .withName("ListLiveStreamsOnline")
            .withUri("/v1/{project_id}/realtime/streams")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getPublishDomain, (req, v) -> {
                req.setPublishDomain(v);
            }));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveStreamsOnlineRequest::getStream, (req, v) -> {
                req.setStream(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse> listRecordCallbackConfigs =
        genForlistRecordCallbackConfigs();

    private static HttpRequestDef<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse> genForlistRecordCallbackConfigs() {
        // basic
        HttpRequestDef.Builder<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRecordCallbackConfigsRequest.class,
                    ListRecordCallbackConfigsResponse.class)
                .withName("ListRecordCallbackConfigs")
                .withUri("/v1/{project_id}/record/callbacks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordCallbackConfigsRequest::getPublishDomain, (req, v) -> {
                req.setPublishDomain(v);
            }));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordCallbackConfigsRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordCallbackConfigsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordCallbackConfigsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecordContentsRequest, ListRecordContentsResponse> listRecordContents =
        genForlistRecordContents();

    private static HttpRequestDef<ListRecordContentsRequest, ListRecordContentsResponse> genForlistRecordContents() {
        // basic
        HttpRequestDef.Builder<ListRecordContentsRequest, ListRecordContentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecordContentsRequest.class, ListRecordContentsResponse.class)
                .withName("ListRecordContents")
                .withUri("/v1/{project_id}/record/contents")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordContentsRequest::getPublishDomain, (req, v) -> {
                req.setPublishDomain(v);
            }));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordContentsRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordContentsRequest::getStream, (req, v) -> {
                req.setStream(v);
            }));
        builder.<ListRecordContentsRequest.RecordTypeEnum>withRequestField("record_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRecordContentsRequest.RecordTypeEnum.class),
            f -> f.withMarshaller(ListRecordContentsRequest::getRecordType, (req, v) -> {
                req.setRecordType(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordContentsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordContentsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordContentsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordContentsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRecordContentsResponse::getXRequestId,
                ListRecordContentsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRecordRulesRequest, ListRecordRulesResponse> listRecordRules =
        genForlistRecordRules();

    private static HttpRequestDef<ListRecordRulesRequest, ListRecordRulesResponse> genForlistRecordRules() {
        // basic
        HttpRequestDef.Builder<ListRecordRulesRequest, ListRecordRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecordRulesRequest.class, ListRecordRulesResponse.class)
                .withName("ListRecordRules")
                .withUri("/v1/{project_id}/record/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getPublishDomain, (req, v) -> {
                req.setPublishDomain(v);
            }));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getStream, (req, v) -> {
                req.setStream(v);
            }));
        builder.<ListRecordRulesRequest.RecordTypeEnum>withRequestField("record_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRecordRulesRequest.RecordTypeEnum.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getRecordType, (req, v) -> {
                req.setRecordType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotConfigsRequest, ListSnapshotConfigsResponse> listSnapshotConfigs =
        genForlistSnapshotConfigs();

    private static HttpRequestDef<ListSnapshotConfigsRequest, ListSnapshotConfigsResponse> genForlistSnapshotConfigs() {
        // basic
        HttpRequestDef.Builder<ListSnapshotConfigsRequest, ListSnapshotConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotConfigsRequest.class, ListSnapshotConfigsResponse.class)
                .withName("ListSnapshotConfigs")
                .withUri("/v1/{project_id}/stream/snapshot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotConfigsRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotConfigsRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotConfigsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotConfigsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStreamForbiddenRequest, ListStreamForbiddenResponse> listStreamForbidden =
        genForlistStreamForbidden();

    private static HttpRequestDef<ListStreamForbiddenRequest, ListStreamForbiddenResponse> genForlistStreamForbidden() {
        // basic
        HttpRequestDef.Builder<ListStreamForbiddenRequest, ListStreamForbiddenResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStreamForbiddenRequest.class, ListStreamForbiddenResponse.class)
                .withName("ListStreamForbidden")
                .withUri("/v1/{project_id}/stream/blocks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStreamForbiddenRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStreamForbiddenRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<String>withRequestField("stream_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStreamForbiddenRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStreamForbiddenRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStreamForbiddenRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunRecordRequest, RunRecordResponse> runRecord = genForrunRecord();

    private static HttpRequestDef<RunRecordRequest, RunRecordResponse> genForrunRecord() {
        // basic
        HttpRequestDef.Builder<RunRecordRequest, RunRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunRecordRequest.class, RunRecordResponse.class)
                .withName("RunRecord")
                .withUri("/v1/{project_id}/record/control")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<RunRecordRequest.ActionEnum>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunRecordRequest.ActionEnum.class),
            f -> f.withMarshaller(RunRecordRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<RecordControlInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordControlInfo.class),
            f -> f.withMarshaller(RunRecordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RunRecordResponse::getXRequestId, RunRecordResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainRequest, ShowDomainResponse> showDomain = genForshowDomain();

    private static HttpRequestDef<ShowDomainRequest, ShowDomainResponse> genForshowDomain() {
        // basic
        HttpRequestDef.Builder<ShowDomainRequest, ShowDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainRequest.class, ShowDomainResponse.class)
                .withName("ShowDomain")
                .withUri("/v1/{project_id}/domain")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainKeyChainRequest, ShowDomainKeyChainResponse> showDomainKeyChain =
        genForshowDomainKeyChain();

    private static HttpRequestDef<ShowDomainKeyChainRequest, ShowDomainKeyChainResponse> genForshowDomainKeyChain() {
        // basic
        HttpRequestDef.Builder<ShowDomainKeyChainRequest, ShowDomainKeyChainResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainKeyChainRequest.class, ShowDomainKeyChainResponse.class)
                .withName("ShowDomainKeyChain")
                .withUri("/v1/{project_id}/guard/key-chain")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainKeyChainRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse> showRecordCallbackConfig =
        genForshowRecordCallbackConfig();

    private static HttpRequestDef<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse> genForshowRecordCallbackConfig() {
        // basic
        HttpRequestDef.Builder<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowRecordCallbackConfigRequest.class, ShowRecordCallbackConfigResponse.class)
                .withName("ShowRecordCallbackConfig")
                .withUri("/v1/{project_id}/record/callbacks/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordCallbackConfigRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordRuleRequest, ShowRecordRuleResponse> showRecordRule =
        genForshowRecordRule();

    private static HttpRequestDef<ShowRecordRuleRequest, ShowRecordRuleResponse> genForshowRecordRule() {
        // basic
        HttpRequestDef.Builder<ShowRecordRuleRequest, ShowRecordRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecordRuleRequest.class, ShowRecordRuleResponse.class)
                .withName("ShowRecordRule")
                .withUri("/v1/{project_id}/record/rules/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordRuleRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse> showTranscodingsTemplate =
        genForshowTranscodingsTemplate();

    private static HttpRequestDef<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse> genForshowTranscodingsTemplate() {
        // basic
        HttpRequestDef.Builder<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowTranscodingsTemplateRequest.class, ShowTranscodingsTemplateResponse.class)
                .withName("ShowTranscodingsTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTranscodingsTemplateRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTranscodingsTemplateRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTranscodingsTemplateRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTranscodingsTemplateRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainRequest, UpdateDomainResponse> updateDomain = genForupdateDomain();

    private static HttpRequestDef<UpdateDomainRequest, UpdateDomainResponse> genForupdateDomain() {
        // basic
        HttpRequestDef.Builder<UpdateDomainRequest, UpdateDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainRequest.class, UpdateDomainResponse.class)
                .withName("UpdateDomain")
                .withUri("/v1/{project_id}/domain")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<LiveDomainModifyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LiveDomainModifyReq.class),
            f -> f.withMarshaller(UpdateDomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainIp6SwitchRequest, UpdateDomainIp6SwitchResponse> updateDomainIp6Switch =
        genForupdateDomainIp6Switch();

    private static HttpRequestDef<UpdateDomainIp6SwitchRequest, UpdateDomainIp6SwitchResponse> genForupdateDomainIp6Switch() {
        // basic
        HttpRequestDef.Builder<UpdateDomainIp6SwitchRequest, UpdateDomainIp6SwitchResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDomainIp6SwitchRequest.class, UpdateDomainIp6SwitchResponse.class)
            .withName("UpdateDomainIp6Switch")
            .withUri("/v1/{project_id}/domain/ipv6-switch")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<DomainIpv6SwitchReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DomainIpv6SwitchReq.class),
            f -> f.withMarshaller(UpdateDomainIp6SwitchRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainKeyChainRequest, UpdateDomainKeyChainResponse> updateDomainKeyChain =
        genForupdateDomainKeyChain();

    private static HttpRequestDef<UpdateDomainKeyChainRequest, UpdateDomainKeyChainResponse> genForupdateDomainKeyChain() {
        // basic
        HttpRequestDef.Builder<UpdateDomainKeyChainRequest, UpdateDomainKeyChainResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDomainKeyChainRequest.class, UpdateDomainKeyChainResponse.class)
            .withName("UpdateDomainKeyChain")
            .withUri("/v1/{project_id}/guard/key-chain")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainKeyChainRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));
        builder.<KeyChainInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(KeyChainInfo.class),
            f -> f.withMarshaller(UpdateDomainKeyChainRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse> updateRecordCallbackConfig =
        genForupdateRecordCallbackConfig();

    private static HttpRequestDef<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse> genForupdateRecordCallbackConfig() {
        // basic
        HttpRequestDef.Builder<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateRecordCallbackConfigRequest.class,
                    UpdateRecordCallbackConfigResponse.class)
                .withName("UpdateRecordCallbackConfig")
                .withUri("/v1/{project_id}/record/callbacks/{id}")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordCallbackConfigRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<RecordCallbackConfigRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordCallbackConfigRequest.class),
            f -> f.withMarshaller(UpdateRecordCallbackConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecordRuleRequest, UpdateRecordRuleResponse> updateRecordRule =
        genForupdateRecordRule();

    private static HttpRequestDef<UpdateRecordRuleRequest, UpdateRecordRuleResponse> genForupdateRecordRule() {
        // basic
        HttpRequestDef.Builder<UpdateRecordRuleRequest, UpdateRecordRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRecordRuleRequest.class, UpdateRecordRuleResponse.class)
                .withName("UpdateRecordRule")
                .withUri("/v1/{project_id}/record/rules/{id}")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordRuleRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<RecordRuleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordRuleRequest.class),
            f -> f.withMarshaller(UpdateRecordRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSnapshotConfigRequest, UpdateSnapshotConfigResponse> updateSnapshotConfig =
        genForupdateSnapshotConfig();

    private static HttpRequestDef<UpdateSnapshotConfigRequest, UpdateSnapshotConfigResponse> genForupdateSnapshotConfig() {
        // basic
        HttpRequestDef.Builder<UpdateSnapshotConfigRequest, UpdateSnapshotConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateSnapshotConfigRequest.class, UpdateSnapshotConfigResponse.class)
            .withName("UpdateSnapshotConfig")
            .withUri("/v1/{project_id}/stream/snapshot")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<LiveSnapshotConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LiveSnapshotConfig.class),
            f -> f.withMarshaller(UpdateSnapshotConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse> updateStreamForbidden =
        genForupdateStreamForbidden();

    private static HttpRequestDef<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse> genForupdateStreamForbidden() {
        // basic
        HttpRequestDef.Builder<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateStreamForbiddenRequest.class, UpdateStreamForbiddenResponse.class)
            .withName("UpdateStreamForbidden")
            .withUri("/v1/{project_id}/stream/blocks")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<StreamForbiddenSetting>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StreamForbiddenSetting.class),
            f -> f.withMarshaller(UpdateStreamForbiddenRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse> updateTranscodingsTemplate =
        genForupdateTranscodingsTemplate();

    private static HttpRequestDef<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse> genForupdateTranscodingsTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateTranscodingsTemplateRequest.class,
                    UpdateTranscodingsTemplateResponse.class)
                .withName("UpdateTranscodingsTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<StreamTranscodingTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StreamTranscodingTemplate.class),
            f -> f.withMarshaller(UpdateTranscodingsTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainHttpsCertRequest, DeleteDomainHttpsCertResponse> deleteDomainHttpsCert =
        genFordeleteDomainHttpsCert();

    private static HttpRequestDef<DeleteDomainHttpsCertRequest, DeleteDomainHttpsCertResponse> genFordeleteDomainHttpsCert() {
        // basic
        HttpRequestDef.Builder<DeleteDomainHttpsCertRequest, DeleteDomainHttpsCertResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDomainHttpsCertRequest.class, DeleteDomainHttpsCertResponse.class)
            .withName("DeleteDomainHttpsCert")
            .withUri("/v1/{project_id}/guard/https-cert")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainHttpsCertRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainHttpsCertRequest, ShowDomainHttpsCertResponse> showDomainHttpsCert =
        genForshowDomainHttpsCert();

    private static HttpRequestDef<ShowDomainHttpsCertRequest, ShowDomainHttpsCertResponse> genForshowDomainHttpsCert() {
        // basic
        HttpRequestDef.Builder<ShowDomainHttpsCertRequest, ShowDomainHttpsCertResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainHttpsCertRequest.class, ShowDomainHttpsCertResponse.class)
                .withName("ShowDomainHttpsCert")
                .withUri("/v1/{project_id}/guard/https-cert")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainHttpsCertRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainHttpsCertRequest, UpdateDomainHttpsCertResponse> updateDomainHttpsCert =
        genForupdateDomainHttpsCert();

    private static HttpRequestDef<UpdateDomainHttpsCertRequest, UpdateDomainHttpsCertResponse> genForupdateDomainHttpsCert() {
        // basic
        HttpRequestDef.Builder<UpdateDomainHttpsCertRequest, UpdateDomainHttpsCertResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDomainHttpsCertRequest.class, UpdateDomainHttpsCertResponse.class)
            .withName("UpdateDomainHttpsCert")
            .withUri("/v1/{project_id}/guard/https-cert")
            .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainHttpsCertRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));
        builder.<DomainHttpsCertInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DomainHttpsCertInfo.class),
            f -> f.withMarshaller(UpdateDomainHttpsCertRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateObsBucketAuthorityPublicRequest, UpdateObsBucketAuthorityPublicResponse> updateObsBucketAuthorityPublic =
        genForupdateObsBucketAuthorityPublic();

    private static HttpRequestDef<UpdateObsBucketAuthorityPublicRequest, UpdateObsBucketAuthorityPublicResponse> genForupdateObsBucketAuthorityPublic() {
        // basic
        HttpRequestDef.Builder<UpdateObsBucketAuthorityPublicRequest, UpdateObsBucketAuthorityPublicResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateObsBucketAuthorityPublicRequest.class,
                    UpdateObsBucketAuthorityPublicResponse.class)
                .withName("UpdateObsBucketAuthorityPublic")
                .withUri("/v1/{project_id}/obs/authority")
                .withContentType("application/json; charset=UTF-8");

        // requests
        builder.<ObsAuthorityConfigV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ObsAuthorityConfigV2.class),
            f -> f.withMarshaller(UpdateObsBucketAuthorityPublicRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
