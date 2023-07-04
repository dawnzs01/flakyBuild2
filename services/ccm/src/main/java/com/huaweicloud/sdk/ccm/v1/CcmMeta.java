package com.huaweicloud.sdk.ccm.v1;

import com.huaweicloud.sdk.ccm.v1.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CcmMeta {

    public static final HttpRequestDef<BatchCreateCaTagsRequest, BatchCreateCaTagsResponse> batchCreateCaTags =
        genForbatchCreateCaTags();

    private static HttpRequestDef<BatchCreateCaTagsRequest, BatchCreateCaTagsResponse> genForbatchCreateCaTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateCaTagsRequest, BatchCreateCaTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateCaTagsRequest.class, BatchCreateCaTagsResponse.class)
                .withName("BatchCreateCaTags")
                .withUri("/v1/private-certificate-authorities/{ca_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateCaTagsRequest::getCaId, (req, v) -> {
                req.setCaId(v);
            }));
        builder.<BatchOperateTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateTagRequestBody.class),
            f -> f.withMarshaller(BatchCreateCaTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateCertTagsRequest, BatchCreateCertTagsResponse> batchCreateCertTags =
        genForbatchCreateCertTags();

    private static HttpRequestDef<BatchCreateCertTagsRequest, BatchCreateCertTagsResponse> genForbatchCreateCertTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateCertTagsRequest, BatchCreateCertTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateCertTagsRequest.class, BatchCreateCertTagsResponse.class)
                .withName("BatchCreateCertTags")
                .withUri("/v1/private-certificates/{certificate_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateCertTagsRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<BatchOperateTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateTagRequestBody.class),
            f -> f.withMarshaller(BatchCreateCertTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteCaTagsRequest, BatchDeleteCaTagsResponse> batchDeleteCaTags =
        genForbatchDeleteCaTags();

    private static HttpRequestDef<BatchDeleteCaTagsRequest, BatchDeleteCaTagsResponse> genForbatchDeleteCaTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteCaTagsRequest, BatchDeleteCaTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteCaTagsRequest.class, BatchDeleteCaTagsResponse.class)
                .withName("BatchDeleteCaTags")
                .withUri("/v1/private-certificate-authorities/{ca_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteCaTagsRequest::getCaId, (req, v) -> {
                req.setCaId(v);
            }));
        builder.<BatchOperateTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateTagRequestBody.class),
            f -> f.withMarshaller(BatchDeleteCaTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteCertTagsRequest, BatchDeleteCertTagsResponse> batchDeleteCertTags =
        genForbatchDeleteCertTags();

    private static HttpRequestDef<BatchDeleteCertTagsRequest, BatchDeleteCertTagsResponse> genForbatchDeleteCertTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteCertTagsRequest, BatchDeleteCertTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteCertTagsRequest.class, BatchDeleteCertTagsResponse.class)
            .withName("BatchDeleteCertTags")
            .withUri("/v1/private-certificates/{certificate_id}/tags/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteCertTagsRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<BatchOperateTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateTagRequestBody.class),
            f -> f.withMarshaller(BatchDeleteCertTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountCaResourceInstancesRequest, CountCaResourceInstancesResponse> countCaResourceInstances =
        genForcountCaResourceInstances();

    private static HttpRequestDef<CountCaResourceInstancesRequest, CountCaResourceInstancesResponse> genForcountCaResourceInstances() {
        // basic
        HttpRequestDef.Builder<CountCaResourceInstancesRequest, CountCaResourceInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CountCaResourceInstancesRequest.class, CountCaResourceInstancesResponse.class)
                .withName("CountCaResourceInstances")
                .withUri("/v1/private-certificate-authorities/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<ListResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequestBody.class),
            f -> f.withMarshaller(CountCaResourceInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountCertResourceInstancesRequest, CountCertResourceInstancesResponse> countCertResourceInstances =
        genForcountCertResourceInstances();

    private static HttpRequestDef<CountCertResourceInstancesRequest, CountCertResourceInstancesResponse> genForcountCertResourceInstances() {
        // basic
        HttpRequestDef.Builder<CountCertResourceInstancesRequest, CountCertResourceInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CountCertResourceInstancesRequest.class,
                    CountCertResourceInstancesResponse.class)
                .withName("CountCertResourceInstances")
                .withUri("/v1/private-certificates/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<ListResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequestBody.class),
            f -> f.withMarshaller(CountCertResourceInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCaTagRequest, CreateCaTagResponse> createCaTag = genForcreateCaTag();

    private static HttpRequestDef<CreateCaTagRequest, CreateCaTagResponse> genForcreateCaTag() {
        // basic
        HttpRequestDef.Builder<CreateCaTagRequest, CreateCaTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCaTagRequest.class, CreateCaTagResponse.class)
                .withName("CreateCaTag")
                .withUri("/v1/private-certificate-authorities/{ca_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCaTagRequest::getCaId, (req, v) -> {
                req.setCaId(v);
            }));
        builder.<ResourceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceTagRequestBody.class),
            f -> f.withMarshaller(CreateCaTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertTagRequest, CreateCertTagResponse> createCertTag =
        genForcreateCertTag();

    private static HttpRequestDef<CreateCertTagRequest, CreateCertTagResponse> genForcreateCertTag() {
        // basic
        HttpRequestDef.Builder<CreateCertTagRequest, CreateCertTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCertTagRequest.class, CreateCertTagResponse.class)
                .withName("CreateCertTag")
                .withUri("/v1/private-certificates/{certificate_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCertTagRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<ResourceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceTagRequestBody.class),
            f -> f.withMarshaller(CreateCertTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> createCertificate =
        genForcreateCertificate();

    private static HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> genForcreateCertificate() {
        // basic
        HttpRequestDef.Builder<CreateCertificateRequest, CreateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCertificateRequest.class, CreateCertificateResponse.class)
                .withName("CreateCertificate")
                .withUri("/v1/private-certificates")
                .withContentType("application/json");

        // requests
        builder.<CreateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateRequestBody.class),
            f -> f.withMarshaller(CreateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse> createCertificateAuthorityObsAgency =
        genForcreateCertificateAuthorityObsAgency();

    private static HttpRequestDef<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse> genForcreateCertificateAuthorityObsAgency() {
        // basic
        HttpRequestDef.Builder<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCertificateAuthorityObsAgencyRequest.class,
                    CreateCertificateAuthorityObsAgencyResponse.class)
                .withName("CreateCertificateAuthorityObsAgency")
                .withUri("/v1/private-certificate-authorities/obs/agencies")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse> createCertificateByCsr =
        genForcreateCertificateByCsr();

    private static HttpRequestDef<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse> genForcreateCertificateByCsr() {
        // basic
        HttpRequestDef.Builder<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCertificateByCsrRequest.class, CreateCertificateByCsrResponse.class)
            .withName("CreateCertificateByCsr")
            .withUri("/v1/private-certificates/csr")
            .withContentType("application/json");

        // requests
        builder.<CreateCertificateByCsrRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateByCsrRequestBody.class),
            f -> f.withMarshaller(CreateCertificateByCsrRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate =
        genFordeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genFordeleteCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateRequest, DeleteCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCertificateRequest.class, DeleteCertificateResponse.class)
                .withName("DeleteCertificate")
                .withUri("/v1/private-certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableCertificateAuthorityCrlRequest, DisableCertificateAuthorityCrlResponse> disableCertificateAuthorityCrl =
        genFordisableCertificateAuthorityCrl();

    private static HttpRequestDef<DisableCertificateAuthorityCrlRequest, DisableCertificateAuthorityCrlResponse> genFordisableCertificateAuthorityCrl() {
        // basic
        HttpRequestDef.Builder<DisableCertificateAuthorityCrlRequest, DisableCertificateAuthorityCrlResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisableCertificateAuthorityCrlRequest.class,
                    DisableCertificateAuthorityCrlResponse.class)
                .withName("DisableCertificateAuthorityCrl")
                .withUri("/v1/private-certificate-authorities/{ca_id}/crl/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableCertificateAuthorityCrlRequest::getCaId, (req, v) -> {
                req.setCaId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableCertificateAuthorityCrlRequest, EnableCertificateAuthorityCrlResponse> enableCertificateAuthorityCrl =
        genForenableCertificateAuthorityCrl();

    private static HttpRequestDef<EnableCertificateAuthorityCrlRequest, EnableCertificateAuthorityCrlResponse> genForenableCertificateAuthorityCrl() {
        // basic
        HttpRequestDef.Builder<EnableCertificateAuthorityCrlRequest, EnableCertificateAuthorityCrlResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    EnableCertificateAuthorityCrlRequest.class,
                    EnableCertificateAuthorityCrlResponse.class)
                .withName("EnableCertificateAuthorityCrl")
                .withUri("/v1/private-certificate-authorities/{ca_id}/crl/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableCertificateAuthorityCrlRequest::getCaId, (req, v) -> {
                req.setCaId(v);
            }));
        builder.<EnableCertificateAuthorityCrlRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnableCertificateAuthorityCrlRequestBody.class),
            f -> f.withMarshaller(EnableCertificateAuthorityCrlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportCertificateRequest, ExportCertificateResponse> exportCertificate =
        genForexportCertificate();

    private static HttpRequestDef<ExportCertificateRequest, ExportCertificateResponse> genForexportCertificate() {
        // basic
        HttpRequestDef.Builder<ExportCertificateRequest, ExportCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportCertificateRequest.class, ExportCertificateResponse.class)
                .withName("ExportCertificate")
                .withUri("/v1/private-certificates/{certificate_id}/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<ExportCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportCertificateRequestBody.class),
            f -> f.withMarshaller(ExportCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaResourceInstancesRequest, ListCaResourceInstancesResponse> listCaResourceInstances =
        genForlistCaResourceInstances();

    private static HttpRequestDef<ListCaResourceInstancesRequest, ListCaResourceInstancesResponse> genForlistCaResourceInstances() {
        // basic
        HttpRequestDef.Builder<ListCaResourceInstancesRequest, ListCaResourceInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListCaResourceInstancesRequest.class, ListCaResourceInstancesResponse.class)
            .withName("ListCaResourceInstances")
            .withUri("/v1/private-certificate-authorities/resource-instances/filter")
            .withContentType("application/json");

        // requests
        builder.<ListResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequestBody.class),
            f -> f.withMarshaller(ListCaResourceInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaTagsRequest, ListCaTagsResponse> listCaTags = genForlistCaTags();

    private static HttpRequestDef<ListCaTagsRequest, ListCaTagsResponse> genForlistCaTags() {
        // basic
        HttpRequestDef.Builder<ListCaTagsRequest, ListCaTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaTagsRequest.class, ListCaTagsResponse.class)
                .withName("ListCaTags")
                .withUri("/v1/private-certificate-authorities/{ca_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaTagsRequest::getCaId, (req, v) -> {
                req.setCaId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertResourceInstancesRequest, ListCertResourceInstancesResponse> listCertResourceInstances =
        genForlistCertResourceInstances();

    private static HttpRequestDef<ListCertResourceInstancesRequest, ListCertResourceInstancesResponse> genForlistCertResourceInstances() {
        // basic
        HttpRequestDef.Builder<ListCertResourceInstancesRequest, ListCertResourceInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListCertResourceInstancesRequest.class,
                    ListCertResourceInstancesResponse.class)
                .withName("ListCertResourceInstances")
                .withUri("/v1/private-certificates/resource-instances/filter")
                .withContentType("application/json");

        // requests
        builder.<ListResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequestBody.class),
            f -> f.withMarshaller(ListCertResourceInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertTagsRequest, ListCertTagsResponse> listCertTags = genForlistCertTags();

    private static HttpRequestDef<ListCertTagsRequest, ListCertTagsResponse> genForlistCertTags() {
        // basic
        HttpRequestDef.Builder<ListCertTagsRequest, ListCertTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertTagsRequest.class, ListCertTagsResponse.class)
                .withName("ListCertTags")
                .withUri("/v1/private-certificates/{certificate_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertTagsRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificateRequest, ListCertificateResponse> listCertificate =
        genForlistCertificate();

    private static HttpRequestDef<ListCertificateRequest, ListCertificateResponse> genForlistCertificate() {
        // basic
        HttpRequestDef.Builder<ListCertificateRequest, ListCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificateRequest.class, ListCertificateResponse.class)
                .withName("ListCertificate")
                .withUri("/v1/private-certificates")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificateRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificateRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse> listCertificateAuthorityObsBucket =
        genForlistCertificateAuthorityObsBucket();

    private static HttpRequestDef<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse> genForlistCertificateAuthorityObsBucket() {
        // basic
        HttpRequestDef.Builder<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCertificateAuthorityObsBucketRequest.class,
                    ListCertificateAuthorityObsBucketResponse.class)
                .withName("ListCertificateAuthorityObsBucket")
                .withUri("/v1/private-certificate-authorities/obs/buckets")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainCaTagsRequest, ListDomainCaTagsResponse> listDomainCaTags =
        genForlistDomainCaTags();

    private static HttpRequestDef<ListDomainCaTagsRequest, ListDomainCaTagsResponse> genForlistDomainCaTags() {
        // basic
        HttpRequestDef.Builder<ListDomainCaTagsRequest, ListDomainCaTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainCaTagsRequest.class, ListDomainCaTagsResponse.class)
                .withName("ListDomainCaTags")
                .withUri("/v1/private-certificate-authorities/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainCertTagsRequest, ListDomainCertTagsResponse> listDomainCertTags =
        genForlistDomainCertTags();

    private static HttpRequestDef<ListDomainCertTagsRequest, ListDomainCertTagsResponse> genForlistDomainCertTags() {
        // basic
        HttpRequestDef.Builder<ListDomainCertTagsRequest, ListDomainCertTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainCertTagsRequest.class, ListDomainCertTagsResponse.class)
                .withName("ListDomainCertTags")
                .withUri("/v1/private-certificates/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse> parseCertificateSigningRequest =
        genForparseCertificateSigningRequest();

    private static HttpRequestDef<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse> genForparseCertificateSigningRequest() {
        // basic
        HttpRequestDef.Builder<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ParseCertificateSigningRequestRequest.class,
                    ParseCertificateSigningRequestResponse.class)
                .withName("ParseCertificateSigningRequest")
                .withUri("/v1/private-certificates/csr/parse")
                .withContentType("application/json");

        // requests
        builder.<ParseCertificateSigningRequestRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ParseCertificateSigningRequestRequestBody.class),
            f -> f.withMarshaller(ParseCertificateSigningRequestRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokeCertificateRequest, RevokeCertificateResponse> revokeCertificate =
        genForrevokeCertificate();

    private static HttpRequestDef<RevokeCertificateRequest, RevokeCertificateResponse> genForrevokeCertificate() {
        // basic
        HttpRequestDef.Builder<RevokeCertificateRequest, RevokeCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RevokeCertificateRequest.class, RevokeCertificateResponse.class)
                .withName("RevokeCertificate")
                .withUri("/v1/private-certificates/{certificate_id}/revoke")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<RevokeCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RevokeCertificateRequestBody.class),
            f -> f.withMarshaller(RevokeCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> showCertificate =
        genForshowCertificate();

    private static HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> genForshowCertificate() {
        // basic
        HttpRequestDef.Builder<ShowCertificateRequest, ShowCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCertificateRequest.class, ShowCertificateResponse.class)
                .withName("ShowCertificate")
                .withUri("/v1/private-certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse> showCertificateAuthorityObsAgency =
        genForshowCertificateAuthorityObsAgency();

    private static HttpRequestDef<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse> genForshowCertificateAuthorityObsAgency() {
        // basic
        HttpRequestDef.Builder<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCertificateAuthorityObsAgencyRequest.class,
                    ShowCertificateAuthorityObsAgencyResponse.class)
                .withName("ShowCertificateAuthorityObsAgency")
                .withUri("/v1/private-certificate-authorities/obs/agencies")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse> showCertificateQuota =
        genForshowCertificateQuota();

    private static HttpRequestDef<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse> genForshowCertificateQuota() {
        // basic
        HttpRequestDef.Builder<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowCertificateQuotaRequest.class, ShowCertificateQuotaResponse.class)
            .withName("ShowCertificateQuota")
            .withUri("/v1/private-certificates/quotas")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse> createCertificateAuthority =
        genForcreateCertificateAuthority();

    private static HttpRequestDef<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse> genForcreateCertificateAuthority() {
        // basic
        HttpRequestDef.Builder<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCertificateAuthorityRequest.class,
                    CreateCertificateAuthorityResponse.class)
                .withName("CreateCertificateAuthority")
                .withUri("/v1/private-certificate-authorities")
                .withContentType("application/json");

        // requests
        builder.<CreateCertificateAuthorityRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateAuthorityRequestBody.class),
            f -> f.withMarshaller(CreateCertificateAuthorityRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse> deleteCertificateAuthority =
        genFordeleteCertificateAuthority();

    private static HttpRequestDef<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse> genFordeleteCertificateAuthority() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCertificateAuthorityRequest.class,
                    DeleteCertificateAuthorityResponse.class)
                .withName("DeleteCertificateAuthority")
                .withUri("/v1/private-certificate-authorities/{ca_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateAuthorityRequest::getCaId, (req, v) -> {
                req.setCaId(v);
            }));
        builder.<String>withRequestField("pending_days",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateAuthorityRequest::getPendingDays, (req, v) -> {
                req.setPendingDays(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse> disableCertificateAuthority =
        genFordisableCertificateAuthority();

    private static HttpRequestDef<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse> genFordisableCertificateAuthority() {
        // basic
        HttpRequestDef.Builder<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisableCertificateAuthorityRequest.class,
                    DisableCertificateAuthorityResponse.class)
                .withName("DisableCertificateAuthority")
                .withUri("/v1/private-certificate-authorities/{ca_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableCertificateAuthorityRequest::getCaId, (req, v) -> {
                req.setCaId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse> enableCertificateAuthority =
        genForenableCertificateAuthority();

    private static HttpRequestDef<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse> genForenableCertificateAuthority() {
        // basic
        HttpRequestDef.Builder<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    EnableCertificateAuthorityRequest.class,
                    EnableCertificateAuthorityResponse.class)
                .withName("EnableCertificateAuthority")
                .withUri("/v1/private-certificate-authorities/{ca_id}/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableCertificateAuthorityRequest::getCaId, (req, v) -> {
                req.setCaId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse> exportCertificateAuthorityCertificate =
        genForexportCertificateAuthorityCertificate();

    private static HttpRequestDef<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse> genForexportCertificateAuthorityCertificate() {
        // basic
        HttpRequestDef.Builder<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExportCertificateAuthorityCertificateRequest.class,
                    ExportCertificateAuthorityCertificateResponse.class)
                .withName("ExportCertificateAuthorityCertificate")
                .withUri("/v1/private-certificate-authorities/{ca_id}/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportCertificateAuthorityCertificateRequest::getCaId, (req, v) -> {
                req.setCaId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse> exportCertificateAuthorityCsr =
        genForexportCertificateAuthorityCsr();

    private static HttpRequestDef<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse> genForexportCertificateAuthorityCsr() {
        // basic
        HttpRequestDef.Builder<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ExportCertificateAuthorityCsrRequest.class,
                    ExportCertificateAuthorityCsrResponse.class)
                .withName("ExportCertificateAuthorityCsr")
                .withUri("/v1/private-certificate-authorities/{ca_id}/csr")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportCertificateAuthorityCsrRequest::getCaId, (req, v) -> {
                req.setCaId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse> importCertificateAuthorityCertificate =
        genForimportCertificateAuthorityCertificate();

    private static HttpRequestDef<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse> genForimportCertificateAuthorityCertificate() {
        // basic
        HttpRequestDef.Builder<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ImportCertificateAuthorityCertificateRequest.class,
                    ImportCertificateAuthorityCertificateResponse.class)
                .withName("ImportCertificateAuthorityCertificate")
                .withUri("/v1/private-certificate-authorities/{ca_id}/import")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportCertificateAuthorityCertificateRequest::getCaId, (req, v) -> {
                req.setCaId(v);
            }));
        builder.<ImportCertificateAuthorityCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportCertificateAuthorityCertificateRequestBody.class),
            f -> f.withMarshaller(ImportCertificateAuthorityCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse> issueCertificateAuthorityCertificate =
        genForissueCertificateAuthorityCertificate();

    private static HttpRequestDef<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse> genForissueCertificateAuthorityCertificate() {
        // basic
        HttpRequestDef.Builder<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    IssueCertificateAuthorityCertificateRequest.class,
                    IssueCertificateAuthorityCertificateResponse.class)
                .withName("IssueCertificateAuthorityCertificate")
                .withUri("/v1/private-certificate-authorities/{ca_id}/activate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(IssueCertificateAuthorityCertificateRequest::getCaId, (req, v) -> {
                req.setCaId(v);
            }));
        builder.<IssueCertificateAuthorityCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IssueCertificateAuthorityCertificateRequestBody.class),
            f -> f.withMarshaller(IssueCertificateAuthorityCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse> listCertificateAuthority =
        genForlistCertificateAuthority();

    private static HttpRequestDef<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse> genForlistCertificateAuthority() {
        // basic
        HttpRequestDef.Builder<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListCertificateAuthorityRequest.class, ListCertificateAuthorityResponse.class)
                .withName("ListCertificateAuthority")
                .withUri("/v1/private-certificate-authorities")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificateAuthorityRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateAuthorityRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificateAuthorityRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateAuthorityRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateAuthorityRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateAuthorityRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateAuthorityRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse> restoreCertificateAuthority =
        genForrestoreCertificateAuthority();

    private static HttpRequestDef<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse> genForrestoreCertificateAuthority() {
        // basic
        HttpRequestDef.Builder<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RestoreCertificateAuthorityRequest.class,
                    RestoreCertificateAuthorityResponse.class)
                .withName("RestoreCertificateAuthority")
                .withUri("/v1/private-certificate-authorities/{ca_id}/restore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreCertificateAuthorityRequest::getCaId, (req, v) -> {
                req.setCaId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokeCertificateAuthorityRequest, RevokeCertificateAuthorityResponse> revokeCertificateAuthority =
        genForrevokeCertificateAuthority();

    private static HttpRequestDef<RevokeCertificateAuthorityRequest, RevokeCertificateAuthorityResponse> genForrevokeCertificateAuthority() {
        // basic
        HttpRequestDef.Builder<RevokeCertificateAuthorityRequest, RevokeCertificateAuthorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RevokeCertificateAuthorityRequest.class,
                    RevokeCertificateAuthorityResponse.class)
                .withName("RevokeCertificateAuthority")
                .withUri("/v1/private-certificate-authorities/{ca_id}/revoke")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeCertificateAuthorityRequest::getCaId, (req, v) -> {
                req.setCaId(v);
            }));
        builder.<RevokeCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RevokeCertificateRequestBody.class),
            f -> f.withMarshaller(RevokeCertificateAuthorityRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse> showCertificateAuthority =
        genForshowCertificateAuthority();

    private static HttpRequestDef<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse> genForshowCertificateAuthority() {
        // basic
        HttpRequestDef.Builder<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowCertificateAuthorityRequest.class, ShowCertificateAuthorityResponse.class)
                .withName("ShowCertificateAuthority")
                .withUri("/v1/private-certificate-authorities/{ca_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateAuthorityRequest::getCaId, (req, v) -> {
                req.setCaId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse> showCertificateAuthorityQuota =
        genForshowCertificateAuthorityQuota();

    private static HttpRequestDef<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse> genForshowCertificateAuthorityQuota() {
        // basic
        HttpRequestDef.Builder<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCertificateAuthorityQuotaRequest.class,
                    ShowCertificateAuthorityQuotaResponse.class)
                .withName("ShowCertificateAuthorityQuota")
                .withUri("/v1/private-certificate-authorities/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

}
