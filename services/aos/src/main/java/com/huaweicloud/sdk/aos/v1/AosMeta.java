package com.huaweicloud.sdk.aos.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.aos.v1.model.*;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class AosMeta {

    public static final HttpRequestDef<ApplyExecutionPlanRequest, ApplyExecutionPlanResponse> applyExecutionPlan = genForapplyExecutionPlan();

    private static HttpRequestDef<ApplyExecutionPlanRequest, ApplyExecutionPlanResponse> genForapplyExecutionPlan() {
        // basic
        HttpRequestDef.Builder<ApplyExecutionPlanRequest, ApplyExecutionPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ApplyExecutionPlanRequest.class, ApplyExecutionPlanResponse.class)
                .withName("ApplyExecutionPlan")
                .withUri("/v1/{project_id}/stacks/{stack_name}/execution-plans/{execution_plan_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyExecutionPlanRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("execution_plan_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyExecutionPlanRequest::getExecutionPlanName, (req, v) -> {
                req.setExecutionPlanName(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyExecutionPlanRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );
        builder.<ApplyExecutionPlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApplyExecutionPlanRequestBody.class),
            f -> f.withMarshaller(ApplyExecutionPlanRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<CreateExecutionPlanRequest, CreateExecutionPlanResponse> createExecutionPlan = genForcreateExecutionPlan();

    private static HttpRequestDef<CreateExecutionPlanRequest, CreateExecutionPlanResponse> genForcreateExecutionPlan() {
        // basic
        HttpRequestDef.Builder<CreateExecutionPlanRequest, CreateExecutionPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateExecutionPlanRequest.class, CreateExecutionPlanResponse.class)
                .withName("CreateExecutionPlan")
                .withUri("/v1/{project_id}/stacks/{stack_name}/execution-plans")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateExecutionPlanRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateExecutionPlanRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );
        builder.<CreateExecutionPlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateExecutionPlanRequestBody.class),
            f -> f.withMarshaller(CreateExecutionPlanRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<DeleteExecutionPlanRequest, DeleteExecutionPlanResponse> deleteExecutionPlan = genFordeleteExecutionPlan();

    private static HttpRequestDef<DeleteExecutionPlanRequest, DeleteExecutionPlanResponse> genFordeleteExecutionPlan() {
        // basic
        HttpRequestDef.Builder<DeleteExecutionPlanRequest, DeleteExecutionPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteExecutionPlanRequest.class, DeleteExecutionPlanResponse.class)
                .withName("DeleteExecutionPlan")
                .withUri("/v1/{project_id}/stacks/{stack_name}/execution-plans/{execution_plan_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExecutionPlanRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("execution_plan_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExecutionPlanRequest::getExecutionPlanName, (req, v) -> {
                req.setExecutionPlanName(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExecutionPlanRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("execution_plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExecutionPlanRequest::getExecutionPlanId, (req, v) -> {
                req.setExecutionPlanId(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExecutionPlanRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse> estimateExecutionPlanPrice = genForestimateExecutionPlanPrice();

    private static HttpRequestDef<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse> genForestimateExecutionPlanPrice() {
        // basic
        HttpRequestDef.Builder<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, EstimateExecutionPlanPriceRequest.class, EstimateExecutionPlanPriceResponse.class)
                .withName("EstimateExecutionPlanPrice")
                .withUri("/v1/{project_id}/stacks/{stack_name}/execution-plans/{execution_plan_name}/prices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("execution_plan_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getExecutionPlanName, (req, v) -> {
                req.setExecutionPlanName(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("execution_plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getExecutionPlanId, (req, v) -> {
                req.setExecutionPlanId(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<GetExecutionPlanRequest, GetExecutionPlanResponse> getExecutionPlan = genForgetExecutionPlan();

    private static HttpRequestDef<GetExecutionPlanRequest, GetExecutionPlanResponse> genForgetExecutionPlan() {
        // basic
        HttpRequestDef.Builder<GetExecutionPlanRequest, GetExecutionPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetExecutionPlanRequest.class, GetExecutionPlanResponse.class)
                .withName("GetExecutionPlan")
                .withUri("/v1/{project_id}/stacks/{stack_name}/execution-plans/{execution_plan_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("execution_plan_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanRequest::getExecutionPlanName, (req, v) -> {
                req.setExecutionPlanName(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("execution_plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanRequest::getExecutionPlanId, (req, v) -> {
                req.setExecutionPlanId(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<GetExecutionPlanMetadataRequest, GetExecutionPlanMetadataResponse> getExecutionPlanMetadata = genForgetExecutionPlanMetadata();

    private static HttpRequestDef<GetExecutionPlanMetadataRequest, GetExecutionPlanMetadataResponse> genForgetExecutionPlanMetadata() {
        // basic
        HttpRequestDef.Builder<GetExecutionPlanMetadataRequest, GetExecutionPlanMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetExecutionPlanMetadataRequest.class, GetExecutionPlanMetadataResponse.class)
                .withName("GetExecutionPlanMetadata")
                .withUri("/v1/{project_id}/stacks/{stack_name}/execution-plans/{execution_plan_name}/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanMetadataRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("execution_plan_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanMetadataRequest::getExecutionPlanName, (req, v) -> {
                req.setExecutionPlanName(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanMetadataRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("execution_plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanMetadataRequest::getExecutionPlanId, (req, v) -> {
                req.setExecutionPlanId(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanMetadataRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListExecutionPlansRequest, ListExecutionPlansResponse> listExecutionPlans = genForlistExecutionPlans();

    private static HttpRequestDef<ListExecutionPlansRequest, ListExecutionPlansResponse> genForlistExecutionPlans() {
        // basic
        HttpRequestDef.Builder<ListExecutionPlansRequest, ListExecutionPlansResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListExecutionPlansRequest.class, ListExecutionPlansResponse.class)
                .withName("ListExecutionPlans")
                .withUri("/v1/{project_id}/stacks/{stack_name}/execution-plans")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionPlansRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionPlansRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionPlansRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ContinueDeployStackRequest, ContinueDeployStackResponse> continueDeployStack = genForcontinueDeployStack();

    private static HttpRequestDef<ContinueDeployStackRequest, ContinueDeployStackResponse> genForcontinueDeployStack() {
        // basic
        HttpRequestDef.Builder<ContinueDeployStackRequest, ContinueDeployStackResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ContinueDeployStackRequest.class, ContinueDeployStackResponse.class)
                .withName("ContinueDeployStack")
                .withUri("/v1/{project_id}/stacks/{stack_name}/continuations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ContinueDeployStackRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ContinueDeployStackRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );
        builder.<ContinueDeployStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ContinueDeployStackRequestBody.class),
            f -> f.withMarshaller(ContinueDeployStackRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ContinueRollbackStackRequest, ContinueRollbackStackResponse> continueRollbackStack = genForcontinueRollbackStack();

    private static HttpRequestDef<ContinueRollbackStackRequest, ContinueRollbackStackResponse> genForcontinueRollbackStack() {
        // basic
        HttpRequestDef.Builder<ContinueRollbackStackRequest, ContinueRollbackStackResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ContinueRollbackStackRequest.class, ContinueRollbackStackResponse.class)
                .withName("ContinueRollbackStack")
                .withUri("/v1/{project_id}/stacks/{stack_name}/rollbacks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ContinueRollbackStackRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ContinueRollbackStackRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );
        builder.<ContinueRollbackStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ContinueRollbackStackRequestBody.class),
            f -> f.withMarshaller(ContinueRollbackStackRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<CreateStackRequest, CreateStackResponse> createStack = genForcreateStack();

    private static HttpRequestDef<CreateStackRequest, CreateStackResponse> genForcreateStack() {
        // basic
        HttpRequestDef.Builder<CreateStackRequest, CreateStackResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStackRequest.class, CreateStackResponse.class)
                .withName("CreateStack")
                .withUri("/v1/{project_id}/stacks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStackRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );
        builder.<CreateStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStackRequestBody.class),
            f -> f.withMarshaller(CreateStackRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<DeleteStackRequest, DeleteStackResponse> deleteStack = genFordeleteStack();

    private static HttpRequestDef<DeleteStackRequest, DeleteStackResponse> genFordeleteStack() {
        // basic
        HttpRequestDef.Builder<DeleteStackRequest, DeleteStackResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteStackRequest.class, DeleteStackResponse.class)
                .withName("DeleteStack")
                .withUri("/v1/{project_id}/stacks/{stack_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<DeployStackRequest, DeployStackResponse> deployStack = genFordeployStack();

    private static HttpRequestDef<DeployStackRequest, DeployStackResponse> genFordeployStack() {
        // basic
        HttpRequestDef.Builder<DeployStackRequest, DeployStackResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeployStackRequest.class, DeployStackResponse.class)
                .withName("DeployStack")
                .withUri("/v1/{project_id}/stacks/{stack_name}/deployments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeployStackRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeployStackRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );
        builder.<DeployStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeployStackRequestBody.class),
            f -> f.withMarshaller(DeployStackRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<GetStackMetadataRequest, GetStackMetadataResponse> getStackMetadata = genForgetStackMetadata();

    private static HttpRequestDef<GetStackMetadataRequest, GetStackMetadataResponse> genForgetStackMetadata() {
        // basic
        HttpRequestDef.Builder<GetStackMetadataRequest, GetStackMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetStackMetadataRequest.class, GetStackMetadataResponse.class)
                .withName("GetStackMetadata")
                .withUri("/v1/{project_id}/stacks/{stack_name}/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackMetadataRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackMetadataRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackMetadataRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<GetStackTemplateRequest, GetStackTemplateResponse> getStackTemplate = genForgetStackTemplate();

    private static HttpRequestDef<GetStackTemplateRequest, GetStackTemplateResponse> genForgetStackTemplate() {
        // basic
        HttpRequestDef.Builder<GetStackTemplateRequest, GetStackTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetStackTemplateRequest.class, GetStackTemplateResponse.class)
                .withName("GetStackTemplate")
                .withUri("/v1/{project_id}/stacks/{stack_name}/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackTemplateRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackTemplateRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackTemplateRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        builder.<String>withResponseField(
            "Location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                GetStackTemplateResponse::getLocation,
                GetStackTemplateResponse::setLocation)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListStackEventsRequest, ListStackEventsResponse> listStackEvents = genForlistStackEvents();

    private static HttpRequestDef<ListStackEventsRequest, ListStackEventsResponse> genForlistStackEvents() {
        // basic
        HttpRequestDef.Builder<ListStackEventsRequest, ListStackEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStackEventsRequest.class, ListStackEventsResponse.class)
                .withName("ListStackEvents")
                .withUri("/v1/{project_id}/stacks/{stack_name}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("deployment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            })
        );
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            })
        );
        builder.<String>withRequestField("field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getField, (req, v) -> {
                req.setField(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListStackOutputsRequest, ListStackOutputsResponse> listStackOutputs = genForlistStackOutputs();

    private static HttpRequestDef<ListStackOutputsRequest, ListStackOutputsResponse> genForlistStackOutputs() {
        // basic
        HttpRequestDef.Builder<ListStackOutputsRequest, ListStackOutputsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStackOutputsRequest.class, ListStackOutputsResponse.class)
                .withName("ListStackOutputs")
                .withUri("/v1/{project_id}/stacks/{stack_name}/outputs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackOutputsRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackOutputsRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackOutputsRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListStackResourcesRequest, ListStackResourcesResponse> listStackResources = genForlistStackResources();

    private static HttpRequestDef<ListStackResourcesRequest, ListStackResourcesResponse> genForlistStackResources() {
        // basic
        HttpRequestDef.Builder<ListStackResourcesRequest, ListStackResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStackResourcesRequest.class, ListStackResourcesResponse.class)
                .withName("ListStackResources")
                .withUri("/v1/{project_id}/stacks/{stack_name}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackResourcesRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackResourcesRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackResourcesRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListStacksRequest, ListStacksResponse> listStacks = genForlistStacks();

    private static HttpRequestDef<ListStacksRequest, ListStacksResponse> genForlistStacks() {
        // basic
        HttpRequestDef.Builder<ListStacksRequest, ListStacksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStacksRequest.class, ListStacksResponse.class)
                .withName("ListStacks")
                .withUri("/v1/{project_id}/stacks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStacksRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<UpdateStackRequest, UpdateStackResponse> updateStack = genForupdateStack();

    private static HttpRequestDef<UpdateStackRequest, UpdateStackResponse> genForupdateStack() {
        // basic
        HttpRequestDef.Builder<UpdateStackRequest, UpdateStackResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateStackRequest.class, UpdateStackResponse.class)
                .withName("UpdateStack")
                .withUri("/v1/{project_id}/stacks/{stack_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStackRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStackRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );
        builder.<UpdateStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateStackRequestBody.class),
            f -> f.withMarshaller(UpdateStackRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse> parseTemplateVariables = genForparseTemplateVariables();

    private static HttpRequestDef<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse> genForparseTemplateVariables() {
        // basic
        HttpRequestDef.Builder<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ParseTemplateVariablesRequest.class, ParseTemplateVariablesResponse.class)
                .withName("ParseTemplateVariables")
                .withUri("/v1/{project_id}/template-analyses/variables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ParseTemplateVariablesRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );
        builder.<ParseTemplateVariablesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ParseTemplateVariablesRequestBody.class),
            f -> f.withMarshaller(ParseTemplateVariablesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate = genFordeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genFordeleteTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateRequest, DeleteTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateRequest.class, DeleteTemplateResponse.class)
                .withName("DeleteTemplate")
                .withUri("/v1/{project_id}/templates/{template_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            })
        );
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateVersionRequest, DeleteTemplateVersionResponse> deleteTemplateVersion = genFordeleteTemplateVersion();

    private static HttpRequestDef<DeleteTemplateVersionRequest, DeleteTemplateVersionResponse> genFordeleteTemplateVersion() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateVersionRequest, DeleteTemplateVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateVersionRequest.class, DeleteTemplateVersionResponse.class)
                .withName("DeleteTemplateVersion")
                .withUri("/v1/{project_id}/templates/{template_name}/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateVersionRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            })
        );
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateVersionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateVersionRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateVersionRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates = genForlistTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForlistTemplates() {
        // basic
        HttpRequestDef.Builder<ListTemplatesRequest, ListTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplatesRequest.class, ListTemplatesResponse.class)
                .withName("ListTemplates")
                .withUri("/v1/{project_id}/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateMetadataRequest, ShowTemplateMetadataResponse> showTemplateMetadata = genForshowTemplateMetadata();

    private static HttpRequestDef<ShowTemplateMetadataRequest, ShowTemplateMetadataResponse> genForshowTemplateMetadata() {
        // basic
        HttpRequestDef.Builder<ShowTemplateMetadataRequest, ShowTemplateMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateMetadataRequest.class, ShowTemplateMetadataResponse.class)
                .withName("ShowTemplateMetadata")
                .withUri("/v1/{project_id}/templates/{template_name}/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateMetadataRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            })
        );
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateMetadataRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateMetadataRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateVersionContentRequest, ShowTemplateVersionContentResponse> showTemplateVersionContent = genForshowTemplateVersionContent();

    private static HttpRequestDef<ShowTemplateVersionContentRequest, ShowTemplateVersionContentResponse> genForshowTemplateVersionContent() {
        // basic
        HttpRequestDef.Builder<ShowTemplateVersionContentRequest, ShowTemplateVersionContentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateVersionContentRequest.class, ShowTemplateVersionContentResponse.class)
                .withName("ShowTemplateVersionContent")
                .withUri("/v1/{project_id}/templates/{template_name}/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionContentRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            })
        );
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionContentRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionContentRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionContentRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        builder.<String>withResponseField(
            "Location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ShowTemplateVersionContentResponse::getLocation,
                ShowTemplateVersionContentResponse::setLocation)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateVersionMetadataRequest, ShowTemplateVersionMetadataResponse> showTemplateVersionMetadata = genForshowTemplateVersionMetadata();

    private static HttpRequestDef<ShowTemplateVersionMetadataRequest, ShowTemplateVersionMetadataResponse> genForshowTemplateVersionMetadata() {
        // basic
        HttpRequestDef.Builder<ShowTemplateVersionMetadataRequest, ShowTemplateVersionMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateVersionMetadataRequest.class, ShowTemplateVersionMetadataResponse.class)
                .withName("ShowTemplateVersionMetadata")
                .withUri("/v1/{project_id}/templates/{template_name}/versions/{version_id}/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionMetadataRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            })
        );
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionMetadataRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionMetadataRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionMetadataRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateMetadataRequest, UpdateTemplateMetadataResponse> updateTemplateMetadata = genForupdateTemplateMetadata();

    private static HttpRequestDef<UpdateTemplateMetadataRequest, UpdateTemplateMetadataResponse> genForupdateTemplateMetadata() {
        // basic
        HttpRequestDef.Builder<UpdateTemplateMetadataRequest, UpdateTemplateMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateTemplateMetadataRequest.class, UpdateTemplateMetadataResponse.class)
                .withName("UpdateTemplateMetadata")
                .withUri("/v1/{project_id}/templates/{template_name}/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTemplateMetadataRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTemplateMetadataRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );
        builder.<UpdateTemplateMetadataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTemplateMetadataRequestBody.class),
            f -> f.withMarshaller(UpdateTemplateMetadataRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

}
