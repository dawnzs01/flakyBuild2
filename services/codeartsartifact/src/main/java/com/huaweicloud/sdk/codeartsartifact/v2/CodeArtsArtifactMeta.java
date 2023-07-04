package com.huaweicloud.sdk.codeartsartifact.v2;

import com.huaweicloud.sdk.codeartsartifact.v2.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CodeArtsArtifactMeta {

    public static final HttpRequestDef<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse> showProjectReleaseFiles =
        genForshowProjectReleaseFiles();

    private static HttpRequestDef<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse> genForshowProjectReleaseFiles() {
        // basic
        HttpRequestDef.Builder<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowProjectReleaseFilesRequest.class, ShowProjectReleaseFilesResponse.class)
            .withName("ShowProjectReleaseFiles")
            .withUri("/v2/{project_id}/release/files")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectReleaseFilesRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectReleaseFilesRequest::getFileName, (req, v) -> {
                req.setFileName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectReleaseFilesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectReleaseFilesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse> showReleaseProjectFiles =
        genForshowReleaseProjectFiles();

    private static HttpRequestDef<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse> genForshowReleaseProjectFiles() {
        // basic
        HttpRequestDef.Builder<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowReleaseProjectFilesRequest.class, ShowReleaseProjectFilesResponse.class)
            .withName("ShowReleaseProjectFiles")
            .withUri("/devreposerver/v2/release/{project_id}/files")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReleaseProjectFilesRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReleaseProjectFilesRequest::getFileName, (req, v) -> {
                req.setFileName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReleaseProjectFilesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReleaseProjectFilesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

}
