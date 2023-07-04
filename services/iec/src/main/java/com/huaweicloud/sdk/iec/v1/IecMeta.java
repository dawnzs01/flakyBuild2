package com.huaweicloud.sdk.iec.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.iec.v1.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class IecMeta {

    public static final HttpRequestDef<AddNicsRequest, AddNicsResponse> addNics = genForaddNics();

    private static HttpRequestDef<AddNicsRequest, AddNicsResponse> genForaddNics() {
        // basic
        HttpRequestDef.Builder<AddNicsRequest, AddNicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddNicsRequest.class, AddNicsResponse.class)
                .withName("AddNics")
                .withUri("/v1/cloudservers/{instance_id}/nics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddNicsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddNicsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddNicsRequestBody.class),
            f -> f.withMarshaller(AddNicsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateSubnetRequest, AssociateSubnetResponse> associateSubnet =
        genForassociateSubnet();

    private static HttpRequestDef<AssociateSubnetRequest, AssociateSubnetResponse> genForassociateSubnet() {
        // basic
        HttpRequestDef.Builder<AssociateSubnetRequest, AssociateSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateSubnetRequest.class, AssociateSubnetResponse.class)
                .withName("AssociateSubnet")
                .withUri("/v1/routetables/{routetable_id}/associate-subnets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateSubnetRequest::getRoutetableId, (req, v) -> {
                req.setRoutetableId(v);
            }));
        builder.<AssociateSubnetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateSubnetRequestBody.class),
            f -> f.withMarshaller(AssociateSubnetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRebootInstanceRequest, BatchRebootInstanceResponse> batchRebootInstance =
        genForbatchRebootInstance();

    private static HttpRequestDef<BatchRebootInstanceRequest, BatchRebootInstanceResponse> genForbatchRebootInstance() {
        // basic
        HttpRequestDef.Builder<BatchRebootInstanceRequest, BatchRebootInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchRebootInstanceRequest.class, BatchRebootInstanceResponse.class)
                .withName("BatchRebootInstance")
                .withUri("/v1/cloudservers/action")
                .withContentType("application/json");

        // requests
        builder.<BatchRebootInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRebootInstanceRequestBody.class),
            f -> f.withMarshaller(BatchRebootInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStartInstanceRequest, BatchStartInstanceResponse> batchStartInstance =
        genForbatchStartInstance();

    private static HttpRequestDef<BatchStartInstanceRequest, BatchStartInstanceResponse> genForbatchStartInstance() {
        // basic
        HttpRequestDef.Builder<BatchStartInstanceRequest, BatchStartInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStartInstanceRequest.class, BatchStartInstanceResponse.class)
                .withName("BatchStartInstance")
                .withUri("/v1/cloudservers/action")
                .withContentType("application/json");

        // requests
        builder.<BatchStartInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStartInstanceRequestBody.class),
            f -> f.withMarshaller(BatchStartInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopInstanceRequest, BatchStopInstanceResponse> batchStopInstance =
        genForbatchStopInstance();

    private static HttpRequestDef<BatchStopInstanceRequest, BatchStopInstanceResponse> genForbatchStopInstance() {
        // basic
        HttpRequestDef.Builder<BatchStopInstanceRequest, BatchStopInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStopInstanceRequest.class, BatchStopInstanceResponse.class)
                .withName("BatchStopInstance")
                .withUri("/v1/cloudservers/action")
                .withContentType("application/json");

        // requests
        builder.<BatchStopInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStopInstanceRequestBody.class),
            f -> f.withMarshaller(BatchStopInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeOsRequest, ChangeOsResponse> changeOs = genForchangeOs();

    private static HttpRequestDef<ChangeOsRequest, ChangeOsResponse> genForchangeOs() {
        // basic
        HttpRequestDef.Builder<ChangeOsRequest, ChangeOsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeOsRequest.class, ChangeOsResponse.class)
                .withName("ChangeOs")
                .withUri("/v1/cloudservers/{instance_id}/change-os")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeOsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ChangeOsOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeOsOption.class),
            f -> f.withMarshaller(ChangeOsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeploymentRequest, CreateDeploymentResponse> createDeployment =
        genForcreateDeployment();

    private static HttpRequestDef<CreateDeploymentRequest, CreateDeploymentResponse> genForcreateDeployment() {
        // basic
        HttpRequestDef.Builder<CreateDeploymentRequest, CreateDeploymentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDeploymentRequest.class, CreateDeploymentResponse.class)
                .withName("CreateDeployment")
                .withUri("/v1/deployments")
                .withContentType("application/json");

        // requests
        builder.<CreateDeploymentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDeploymentRequestBody.class),
            f -> f.withMarshaller(CreateDeploymentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateImageRequest, CreateImageResponse> createImage = genForcreateImage();

    private static HttpRequestDef<CreateImageRequest, CreateImageResponse> genForcreateImage() {
        // basic
        HttpRequestDef.Builder<CreateImageRequest, CreateImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateImageRequest.class, CreateImageResponse.class)
                .withName("CreateImage")
                .withUri("/v1/images/create")
                .withContentType("application/json");

        // requests
        builder.<CreateImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateImageRequestBody.class),
            f -> f.withMarshaller(CreateImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKeypairRequest, CreateKeypairResponse> createKeypair =
        genForcreateKeypair();

    private static HttpRequestDef<CreateKeypairRequest, CreateKeypairResponse> genForcreateKeypair() {
        // basic
        HttpRequestDef.Builder<CreateKeypairRequest, CreateKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateKeypairRequest.class, CreateKeypairResponse.class)
                .withName("CreateKeypair")
                .withUri("/v1/os-keypairs")
                .withContentType("application/json");

        // requests
        builder.<CreateKeypairRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateKeypairRequestBody.class),
            f -> f.withMarshaller(CreateKeypairRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePortRequest, CreatePortResponse> createPort = genForcreatePort();

    private static HttpRequestDef<CreatePortRequest, CreatePortResponse> genForcreatePort() {
        // basic
        HttpRequestDef.Builder<CreatePortRequest, CreatePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePortRequest.class, CreatePortResponse.class)
                .withName("CreatePort")
                .withUri("/v1/ports")
                .withContentType("application/json");

        // requests
        builder.<CreatePortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePortRequestBody.class),
            f -> f.withMarshaller(CreatePortRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRoutesRequest, CreateRoutesResponse> createRoutes = genForcreateRoutes();

    private static HttpRequestDef<CreateRoutesRequest, CreateRoutesResponse> genForcreateRoutes() {
        // basic
        HttpRequestDef.Builder<CreateRoutesRequest, CreateRoutesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRoutesRequest.class, CreateRoutesResponse.class)
                .withName("CreateRoutes")
                .withUri("/v1/routetables/{routetable_id}/add-routes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRoutesRequest::getRoutetableId, (req, v) -> {
                req.setRoutetableId(v);
            }));
        builder.<CreateRoutesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRoutesRequestBody.class),
            f -> f.withMarshaller(CreateRoutesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRoutetableRequest, CreateRoutetableResponse> createRoutetable =
        genForcreateRoutetable();

    private static HttpRequestDef<CreateRoutetableRequest, CreateRoutetableResponse> genForcreateRoutetable() {
        // basic
        HttpRequestDef.Builder<CreateRoutetableRequest, CreateRoutetableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRoutetableRequest.class, CreateRoutetableResponse.class)
                .withName("CreateRoutetable")
                .withUri("/v1/routetables")
                .withContentType("application/json");

        // requests
        builder.<CreateRoutetableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRoutetableRequestBody.class),
            f -> f.withMarshaller(CreateRoutetableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroup =
        genForcreateSecurityGroup();

    private static HttpRequestDef<CreateSecurityGroupRequest, CreateSecurityGroupResponse> genForcreateSecurityGroup() {
        // basic
        HttpRequestDef.Builder<CreateSecurityGroupRequest, CreateSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSecurityGroupRequest.class, CreateSecurityGroupResponse.class)
                .withName("CreateSecurityGroup")
                .withUri("/v1/security-groups")
                .withContentType("application/json");

        // requests
        builder.<CreateSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecurityGroupRequestBody.class),
            f -> f.withMarshaller(CreateSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRule =
        genForcreateSecurityGroupRule();

    private static HttpRequestDef<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> genForcreateSecurityGroupRule() {
        // basic
        HttpRequestDef.Builder<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSecurityGroupRuleRequest.class, CreateSecurityGroupRuleResponse.class)
            .withName("CreateSecurityGroupRule")
            .withUri("/v1/security-group-rules")
            .withContentType("application/json");

        // requests
        builder.<CreateSecurityGroupRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecurityGroupRuleRequestBody.class),
            f -> f.withMarshaller(CreateSecurityGroupRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcRequest, CreateVpcResponse> createVpc = genForcreateVpc();

    private static HttpRequestDef<CreateVpcRequest, CreateVpcResponse> genForcreateVpc() {
        // basic
        HttpRequestDef.Builder<CreateVpcRequest, CreateVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpcRequest.class, CreateVpcResponse.class)
                .withName("CreateVpc")
                .withUri("/v1/vpcs")
                .withContentType("application/json");

        // requests
        builder.<CreateVpcRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVpcRequestBody.class),
            f -> f.withMarshaller(CreateVpcRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBandwidthRequest, DeleteBandwidthResponse> deleteBandwidth =
        genFordeleteBandwidth();

    private static HttpRequestDef<DeleteBandwidthRequest, DeleteBandwidthResponse> genFordeleteBandwidth() {
        // basic
        HttpRequestDef.Builder<DeleteBandwidthRequest, DeleteBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBandwidthRequest.class, DeleteBandwidthResponse.class)
                .withName("DeleteBandwidth")
                .withUri("/v1/bandwidths/{bandwidth_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBandwidthRequest::getBandwidthId, (req, v) -> {
                req.setBandwidthId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeploymentRequest, DeleteDeploymentResponse> deleteDeployment =
        genFordeleteDeployment();

    private static HttpRequestDef<DeleteDeploymentRequest, DeleteDeploymentResponse> genFordeleteDeployment() {
        // basic
        HttpRequestDef.Builder<DeleteDeploymentRequest, DeleteDeploymentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeploymentRequest.class, DeleteDeploymentResponse.class)
                .withName("DeleteDeployment")
                .withUri("/v1/deployments/{deployment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeploymentRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeCloudRequest, DeleteEdgeCloudResponse> deleteEdgeCloud =
        genFordeleteEdgeCloud();

    private static HttpRequestDef<DeleteEdgeCloudRequest, DeleteEdgeCloudResponse> genFordeleteEdgeCloud() {
        // basic
        HttpRequestDef.Builder<DeleteEdgeCloudRequest, DeleteEdgeCloudResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEdgeCloudRequest.class, DeleteEdgeCloudResponse.class)
                .withName("DeleteEdgeCloud")
                .withUri("/v1/edgeclouds/{edgecloud_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edgecloud_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeCloudRequest::getEdgecloudId, (req, v) -> {
                req.setEdgecloudId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteImageRequest, DeleteImageResponse> deleteImage = genFordeleteImage();

    private static HttpRequestDef<DeleteImageRequest, DeleteImageResponse> genFordeleteImage() {
        // basic
        HttpRequestDef.Builder<DeleteImageRequest, DeleteImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteImageRequest.class, DeleteImageResponse.class)
                .withName("DeleteImage")
                .withUri("/v1/images/{image_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstancesRequest, DeleteInstancesResponse> deleteInstances =
        genFordeleteInstances();

    private static HttpRequestDef<DeleteInstancesRequest, DeleteInstancesResponse> genFordeleteInstances() {
        // basic
        HttpRequestDef.Builder<DeleteInstancesRequest, DeleteInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteInstancesRequest.class, DeleteInstancesResponse.class)
                .withName("DeleteInstances")
                .withUri("/v1/cloudservers/delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteInstancesRequestBody.class),
            f -> f.withMarshaller(DeleteInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteKeypairRequest, DeleteKeypairResponse> deleteKeypair =
        genFordeleteKeypair();

    private static HttpRequestDef<DeleteKeypairRequest, DeleteKeypairResponse> genFordeleteKeypair() {
        // basic
        HttpRequestDef.Builder<DeleteKeypairRequest, DeleteKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteKeypairRequest.class, DeleteKeypairResponse.class)
                .withName("DeleteKeypair")
                .withUri("/v1/os-keypairs/{keypair_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keypair_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKeypairRequest::getKeypairName, (req, v) -> {
                req.setKeypairName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNicsRequest, DeleteNicsResponse> deleteNics = genFordeleteNics();

    private static HttpRequestDef<DeleteNicsRequest, DeleteNicsResponse> genFordeleteNics() {
        // basic
        HttpRequestDef.Builder<DeleteNicsRequest, DeleteNicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteNicsRequest.class, DeleteNicsResponse.class)
                .withName("DeleteNics")
                .withUri("/v1/cloudservers/{instance_id}/nics/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNicsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<DeleteNicsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteNicsRequestBody.class),
            f -> f.withMarshaller(DeleteNicsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePortRequest, DeletePortResponse> deletePort = genFordeletePort();

    private static HttpRequestDef<DeletePortRequest, DeletePortResponse> genFordeletePort() {
        // basic
        HttpRequestDef.Builder<DeletePortRequest, DeletePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePortRequest.class, DeletePortResponse.class)
                .withName("DeletePort")
                .withUri("/v1/ports/{port_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePortRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRoutesRequest, DeleteRoutesResponse> deleteRoutes = genFordeleteRoutes();

    private static HttpRequestDef<DeleteRoutesRequest, DeleteRoutesResponse> genFordeleteRoutes() {
        // basic
        HttpRequestDef.Builder<DeleteRoutesRequest, DeleteRoutesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteRoutesRequest.class, DeleteRoutesResponse.class)
                .withName("DeleteRoutes")
                .withUri("/v1/routetables/{routetable_id}/delete-routes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRoutesRequest::getRoutetableId, (req, v) -> {
                req.setRoutetableId(v);
            }));
        builder.<DeleteRoutesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteRoutesRequestBody.class),
            f -> f.withMarshaller(DeleteRoutesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRoutetableRequest, DeleteRoutetableResponse> deleteRoutetable =
        genFordeleteRoutetable();

    private static HttpRequestDef<DeleteRoutetableRequest, DeleteRoutetableResponse> genFordeleteRoutetable() {
        // basic
        HttpRequestDef.Builder<DeleteRoutetableRequest, DeleteRoutetableResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRoutetableRequest.class, DeleteRoutetableResponse.class)
                .withName("DeleteRoutetable")
                .withUri("/v1/routetables/{routetable_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRoutetableRequest::getRoutetableId, (req, v) -> {
                req.setRoutetableId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroup =
        genFordeleteSecurityGroup();

    private static HttpRequestDef<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> genFordeleteSecurityGroup() {
        // basic
        HttpRequestDef.Builder<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSecurityGroupRequest.class, DeleteSecurityGroupResponse.class)
            .withName("DeleteSecurityGroup")
            .withUri("/v1/security-groups/{security_group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityGroupRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRule =
        genFordeleteSecurityGroupRule();

    private static HttpRequestDef<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> genFordeleteSecurityGroupRule() {
        // basic
        HttpRequestDef.Builder<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSecurityGroupRuleRequest.class, DeleteSecurityGroupRuleResponse.class)
            .withName("DeleteSecurityGroupRule")
            .withUri("/v1/security-group-rules/{security_group_rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityGroupRuleRequest::getSecurityGroupRuleId, (req, v) -> {
                req.setSecurityGroupRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubnetRequest, DeleteSubnetResponse> deleteSubnet = genFordeleteSubnet();

    private static HttpRequestDef<DeleteSubnetRequest, DeleteSubnetResponse> genFordeleteSubnet() {
        // basic
        HttpRequestDef.Builder<DeleteSubnetRequest, DeleteSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSubnetRequest.class, DeleteSubnetResponse.class)
                .withName("DeleteSubnet")
                .withUri("/v1/subnets/{subnet_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubnetRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcRequest, DeleteVpcResponse> deleteVpc = genFordeleteVpc();

    private static HttpRequestDef<DeleteVpcRequest, DeleteVpcResponse> genFordeleteVpc() {
        // basic
        HttpRequestDef.Builder<DeleteVpcRequest, DeleteVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpcRequest.class, DeleteVpcResponse.class)
                .withName("DeleteVpc")
                .withUri("/v1/vpcs/{vpc_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateSubnetRequest, DisassociateSubnetResponse> disassociateSubnet =
        genFordisassociateSubnet();

    private static HttpRequestDef<DisassociateSubnetRequest, DisassociateSubnetResponse> genFordisassociateSubnet() {
        // basic
        HttpRequestDef.Builder<DisassociateSubnetRequest, DisassociateSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisassociateSubnetRequest.class, DisassociateSubnetResponse.class)
                .withName("DisassociateSubnet")
                .withUri("/v1/routetables/{routetable_id}/disassociate-subnets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateSubnetRequest::getRoutetableId, (req, v) -> {
                req.setRoutetableId(v);
            }));
        builder.<DisassociateSubnetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociateSubnetRequestBody.class),
            f -> f.withMarshaller(DisassociateSubnetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteDeploymentRequest, ExecuteDeploymentResponse> executeDeployment =
        genForexecuteDeployment();

    private static HttpRequestDef<ExecuteDeploymentRequest, ExecuteDeploymentResponse> genForexecuteDeployment() {
        // basic
        HttpRequestDef.Builder<ExecuteDeploymentRequest, ExecuteDeploymentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteDeploymentRequest.class, ExecuteDeploymentResponse.class)
                .withName("ExecuteDeployment")
                .withUri("/v1/deployments/{deployment_id}/deploy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteDeploymentRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandEdgecloudRequest, ExpandEdgecloudResponse> expandEdgecloud =
        genForexpandEdgecloud();

    private static HttpRequestDef<ExpandEdgecloudRequest, ExpandEdgecloudResponse> genForexpandEdgecloud() {
        // basic
        HttpRequestDef.Builder<ExpandEdgecloudRequest, ExpandEdgecloudResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandEdgecloudRequest.class, ExpandEdgecloudResponse.class)
                .withName("ExpandEdgecloud")
                .withUri("/v1/deployments/{deployment_id}/expand")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandEdgecloudRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthsRequest, ListBandwidthsResponse> listBandwidths =
        genForlistBandwidths();

    private static HttpRequestDef<ListBandwidthsRequest, ListBandwidthsResponse> genForlistBandwidths() {
        // basic
        HttpRequestDef.Builder<ListBandwidthsRequest, ListBandwidthsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBandwidthsRequest.class, ListBandwidthsResponse.class)
                .withName("ListBandwidths")
                .withUri("/v1/bandwidths")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthsRequest::getSiteId, (req, v) -> {
                req.setSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudImagesRequest, ListCloudImagesResponse> listCloudImages =
        genForlistCloudImages();

    private static HttpRequestDef<ListCloudImagesRequest, ListCloudImagesResponse> genForlistCloudImages() {
        // basic
        HttpRequestDef.Builder<ListCloudImagesRequest, ListCloudImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCloudImagesRequest.class, ListCloudImagesResponse.class)
                .withName("ListCloudImages")
                .withUri("/v1/cloudimages/{region_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));
        builder.<String>withRequestField("__imagetype",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getImagetype, (req, v) -> {
                req.setImagetype(v);
            }));
        builder.<ListCloudImagesRequest.IsregisteredEnum>withRequestField("__isregistered",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCloudImagesRequest.IsregisteredEnum.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getIsregistered, (req, v) -> {
                req.setIsregistered(v);
            }));
        builder.<String>withRequestField("__os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getOsType, (req, v) -> {
                req.setOsType(v);
            }));
        builder.<String>withRequestField("__support_diskintensive",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportDiskintensive, (req, v) -> {
                req.setSupportDiskintensive(v);
            }));
        builder.<String>withRequestField("__support_highperformance",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportHighperformance, (req, v) -> {
                req.setSupportHighperformance(v);
            }));
        builder.<String>withRequestField("__support_kvm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportKvm, (req, v) -> {
                req.setSupportKvm(v);
            }));
        builder.<String>withRequestField("__support_kvm_gpu_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportKvmGpuType, (req, v) -> {
                req.setSupportKvmGpuType(v);
            }));
        builder.<String>withRequestField("__support_kvm_infiniband",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportKvmInfiniband, (req, v) -> {
                req.setSupportKvmInfiniband(v);
            }));
        builder.<String>withRequestField("__support_largememory",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportLargememory, (req, v) -> {
                req.setSupportLargememory(v);
            }));
        builder.<String>withRequestField("__support_xen",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportXen, (req, v) -> {
                req.setSupportXen(v);
            }));
        builder.<String>withRequestField("__support_xen_gpu_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportXenGpuType, (req, v) -> {
                req.setSupportXenGpuType(v);
            }));
        builder.<String>withRequestField("__support_xen_hana",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSupportXenHana, (req, v) -> {
                req.setSupportXenHana(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getOwner, (req, v) -> {
                req.setOwner(v);
            }));
        builder.<ListCloudImagesRequest.ProtectedEnum>withRequestField("protected",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCloudImagesRequest.ProtectedEnum.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getProtected, (req, v) -> {
                req.setProtected(v);
            }));
        builder.<ListCloudImagesRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCloudImagesRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<ListCloudImagesRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCloudImagesRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListCloudImagesRequest.VirtualEnvTypeEnum>withRequestField("virtual_env_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCloudImagesRequest.VirtualEnvTypeEnum.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getVirtualEnvType, (req, v) -> {
                req.setVirtualEnvType(v);
            }));
        builder.<String>withRequestField("visibility",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudImagesRequest::getVisibility, (req, v) -> {
                req.setVisibility(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDeploymentsRequest, ListDeploymentsResponse> listDeployments =
        genForlistDeployments();

    private static HttpRequestDef<ListDeploymentsRequest, ListDeploymentsResponse> genForlistDeployments() {
        // basic
        HttpRequestDef.Builder<ListDeploymentsRequest, ListDeploymentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDeploymentsRequest.class, ListDeploymentsResponse.class)
                .withName("ListDeployments")
                .withUri("/v1/deployments")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("edgecloud_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getEdgecloudId, (req, v) -> {
                req.setEdgecloudId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeCloudRequest, ListEdgeCloudResponse> listEdgeCloud =
        genForlistEdgeCloud();

    private static HttpRequestDef<ListEdgeCloudRequest, ListEdgeCloudResponse> genForlistEdgeCloud() {
        // basic
        HttpRequestDef.Builder<ListEdgeCloudRequest, ListEdgeCloudResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEdgeCloudRequest.class, ListEdgeCloudResponse.class)
                .withName("ListEdgeCloud")
                .withUri("/v1/edgeclouds")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeCloudRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeCloudRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeCloudRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeCloudRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForlistFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForlistFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v1/cloudservers/flavors")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getArea, (req, v) -> {
                req.setArea(v);
            }));
        builder.<String>withRequestField("province",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getProvince, (req, v) -> {
                req.setProvince(v);
            }));
        builder.<String>withRequestField("city",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getCity, (req, v) -> {
                req.setCity(v);
            }));
        builder.<String>withRequestField("operator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getOperator, (req, v) -> {
                req.setOperator(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("site_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getSiteIds, (req, v) -> {
                req.setSiteIds(v);
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
                .withUri("/v1/images")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("__imagetype",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getImagetype, (req, v) -> {
                req.setImagetype(v);
            }));
        builder.<ListImagesRequest.ProtectedEnum>withRequestField("protected",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.ProtectedEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getProtected, (req, v) -> {
                req.setProtected(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("visibility",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getVisibility, (req, v) -> {
                req.setVisibility(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("__os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getOsType, (req, v) -> {
                req.setOsType(v);
            }));
        builder.<ListImagesRequest.VirtualEnvTypeEnum>withRequestField("virtual_env_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.VirtualEnvTypeEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getVirtualEnvType, (req, v) -> {
                req.setVirtualEnvType(v);
            }));
        builder.<ListImagesRequest.IsregisteredEnum>withRequestField("__isregistered",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.IsregisteredEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getIsregistered, (req, v) -> {
                req.setIsregistered(v);
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
        builder.<ListImagesRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<ListImagesRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("__support_kvm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportKvm, (req, v) -> {
                req.setSupportKvm(v);
            }));
        builder.<String>withRequestField("__support_kvm_gpu_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportKvmGpuType, (req, v) -> {
                req.setSupportKvmGpuType(v);
            }));
        builder.<String>withRequestField("__support_kvm_ascend_310",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportKvmAscend310, (req, v) -> {
                req.setSupportKvmAscend310(v);
            }));
        builder.<String>withRequestField("__support_kvm_hi1822_hiovs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportKvmHi1822Hiovs, (req, v) -> {
                req.setSupportKvmHi1822Hiovs(v);
            }));
        builder.<String>withRequestField("__support_arm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportArm, (req, v) -> {
                req.setSupportArm(v);
            }));
        builder.<String>withRequestField("__support_gpu_t4",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportGpuT4, (req, v) -> {
                req.setSupportGpuT4(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForlistInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForlistInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v1/cloudservers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getArea, (req, v) -> {
                req.setArea(v);
            }));
        builder.<String>withRequestField("province",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getProvince, (req, v) -> {
                req.setProvince(v);
            }));
        builder.<String>withRequestField("city",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getCity, (req, v) -> {
                req.setCity(v);
            }));
        builder.<String>withRequestField("edgecloud_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getEdgecloudId, (req, v) -> {
                req.setEdgecloudId(v);
            }));
        builder.<String>withRequestField("site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSiteId, (req, v) -> {
                req.setSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeypairsRequest, ListKeypairsResponse> listKeypairs = genForlistKeypairs();

    private static HttpRequestDef<ListKeypairsRequest, ListKeypairsResponse> genForlistKeypairs() {
        // basic
        HttpRequestDef.Builder<ListKeypairsRequest, ListKeypairsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListKeypairsRequest.class, ListKeypairsResponse.class)
                .withName("ListKeypairs")
                .withUri("/v1/os-keypairs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKeypairsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKeypairsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKeypairsRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response
        builder.<List<SimpleKeypair>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListKeypairsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(SimpleKeypair.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListPortsRequest, ListPortsResponse> listPorts = genForlistPorts();

    private static HttpRequestDef<ListPortsRequest, ListPortsResponse> genForlistPorts() {
        // basic
        HttpRequestDef.Builder<ListPortsRequest, ListPortsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortsRequest.class, ListPortsResponse.class)
                .withName("ListPorts")
                .withUri("/v1/ports")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getNetworkId, (req, v) -> {
                req.setNetworkId(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPortsRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<List<String>>withRequestField("fixed_ips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPortsRequest::getFixedIps, (req, v) -> {
                req.setFixedIps(v);
            }));
        builder.<String>withRequestField("mac_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getMacAddress, (req, v) -> {
                req.setMacAddress(v);
            }));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("device_owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getDeviceOwner, (req, v) -> {
                req.setDeviceOwner(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("security_groups",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getSecurityGroups, (req, v) -> {
                req.setSecurityGroups(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotaRequest, ListQuotaResponse> listQuota = genForlistQuota();

    private static HttpRequestDef<ListQuotaRequest, ListQuotaResponse> genForlistQuota() {
        // basic
        HttpRequestDef.Builder<ListQuotaRequest, ListQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotaRequest.class, ListQuotaResponse.class)
                .withName("ListQuota")
                .withUri("/v1/edgeclouds/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRelatedRoutetablesRequest, ListRelatedRoutetablesResponse> listRelatedRoutetables =
        genForlistRelatedRoutetables();

    private static HttpRequestDef<ListRelatedRoutetablesRequest, ListRelatedRoutetablesResponse> genForlistRelatedRoutetables() {
        // basic
        HttpRequestDef.Builder<ListRelatedRoutetablesRequest, ListRelatedRoutetablesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRelatedRoutetablesRequest.class, ListRelatedRoutetablesResponse.class)
            .withName("ListRelatedRoutetables")
            .withUri("/v1/subnets/{subnet_id}/routetables")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelatedRoutetablesRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRoutesRequest, ListRoutesResponse> listRoutes = genForlistRoutes();

    private static HttpRequestDef<ListRoutesRequest, ListRoutesResponse> genForlistRoutes() {
        // basic
        HttpRequestDef.Builder<ListRoutesRequest, ListRoutesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRoutesRequest.class, ListRoutesResponse.class)
                .withName("ListRoutes")
                .withUri("/v1/routetables/{routetable_id}/routes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutesRequest::getRoutetableId, (req, v) -> {
                req.setRoutetableId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRoutetablesRequest, ListRoutetablesResponse> listRoutetables =
        genForlistRoutetables();

    private static HttpRequestDef<ListRoutetablesRequest, ListRoutetablesResponse> genForlistRoutetables() {
        // basic
        HttpRequestDef.Builder<ListRoutetablesRequest, ListRoutetablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRoutetablesRequest.class, ListRoutetablesResponse.class)
                .withName("ListRoutetables")
                .withUri("/v1/routetables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutetablesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRoutetablesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutetablesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRoutetablesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutetablesRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRules =
        genForlistSecurityGroupRules();

    private static HttpRequestDef<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> genForlistSecurityGroupRules() {
        // basic
        HttpRequestDef.Builder<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSecurityGroupRulesRequest.class, ListSecurityGroupRulesResponse.class)
            .withName("ListSecurityGroupRules")
            .withUri("/v1/security-group-rules")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("security_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroups =
        genForlistSecurityGroups();

    private static HttpRequestDef<ListSecurityGroupsRequest, ListSecurityGroupsResponse> genForlistSecurityGroups() {
        // basic
        HttpRequestDef.Builder<ListSecurityGroupsRequest, ListSecurityGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecurityGroupsRequest.class, ListSecurityGroupsResponse.class)
                .withName("ListSecurityGroups")
                .withUri("/v1/security-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSitesRequest, ListSitesResponse> listSites = genForlistSites();

    private static HttpRequestDef<ListSitesRequest, ListSitesResponse> genForlistSites() {
        // basic
        HttpRequestDef.Builder<ListSitesRequest, ListSitesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSitesRequest.class, ListSitesResponse.class)
                .withName("ListSites")
                .withUri("/v1/sites")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSitesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSitesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSitesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSitesRequest::getArea, (req, v) -> {
                req.setArea(v);
            }));
        builder.<String>withRequestField("province",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSitesRequest::getProvince, (req, v) -> {
                req.setProvince(v);
            }));
        builder.<String>withRequestField("city",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSitesRequest::getCity, (req, v) -> {
                req.setCity(v);
            }));
        builder.<String>withRequestField("flavor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSitesRequest::getFlavor, (req, v) -> {
                req.setFlavor(v);
            }));
        builder.<ListSitesRequest.VolumeTypeEnum>withRequestField("volume_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSitesRequest.VolumeTypeEnum.class),
            f -> f.withMarshaller(ListSitesRequest::getVolumeType, (req, v) -> {
                req.setVolumeType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubnetsRequest, ListSubnetsResponse> listSubnets = genForlistSubnets();

    private static HttpRequestDef<ListSubnetsRequest, ListSubnetsResponse> genForlistSubnets() {
        // basic
        HttpRequestDef.Builder<ListSubnetsRequest, ListSubnetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubnetsRequest.class, ListSubnetsResponse.class)
                .withName("ListSubnets")
                .withUri("/v1/subnets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubnetsRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubnetsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubnetsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubnetsRequest::getSiteId, (req, v) -> {
                req.setSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcsRequest, ListVpcsResponse> listVpcs = genForlistVpcs();

    private static HttpRequestDef<ListVpcsRequest, ListVpcsResponse> genForlistVpcs() {
        // basic
        HttpRequestDef.Builder<ListVpcsRequest, ListVpcsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcsRequest.class, ListVpcsResponse.class)
                .withName("ListVpcs")
                .withUri("/v1/vpcs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpcsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpcsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcsRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RebuildImageRequest, RebuildImageResponse> rebuildImage = genForrebuildImage();

    private static HttpRequestDef<RebuildImageRequest, RebuildImageResponse> genForrebuildImage() {
        // basic
        HttpRequestDef.Builder<RebuildImageRequest, RebuildImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RebuildImageRequest.class, RebuildImageResponse.class)
                .withName("RebuildImage")
                .withUri("/v1/{domain_id}/jobs/{job_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RebuildImageRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<RebuildImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RebuildImageRequestBody.class),
            f -> f.withMarshaller(RebuildImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterImageRequest, RegisterImageResponse> registerImage =
        genForregisterImage();

    private static HttpRequestDef<RegisterImageRequest, RegisterImageResponse> genForregisterImage() {
        // basic
        HttpRequestDef.Builder<RegisterImageRequest, RegisterImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterImageRequest.class, RegisterImageResponse.class)
                .withName("RegisterImage")
                .withUri("/v1/images/register")
                .withContentType("application/json");

        // requests
        builder.<RegisterImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterImageRequestBody.class),
            f -> f.withMarshaller(RegisterImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBandwidthRequest, ShowBandwidthResponse> showBandwidth =
        genForshowBandwidth();

    private static HttpRequestDef<ShowBandwidthRequest, ShowBandwidthResponse> genForshowBandwidth() {
        // basic
        HttpRequestDef.Builder<ShowBandwidthRequest, ShowBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBandwidthRequest.class, ShowBandwidthResponse.class)
                .withName("ShowBandwidth")
                .withUri("/v1/bandwidths/{bandwidth_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBandwidthRequest::getBandwidthId, (req, v) -> {
                req.setBandwidthId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeCloudRequest, ShowEdgeCloudResponse> showEdgeCloud =
        genForshowEdgeCloud();

    private static HttpRequestDef<ShowEdgeCloudRequest, ShowEdgeCloudResponse> genForshowEdgeCloud() {
        // basic
        HttpRequestDef.Builder<ShowEdgeCloudRequest, ShowEdgeCloudResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEdgeCloudRequest.class, ShowEdgeCloudResponse.class)
                .withName("ShowEdgeCloud")
                .withUri("/v1/edgeclouds/{edgecloud_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edgecloud_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeCloudRequest::getEdgecloudId, (req, v) -> {
                req.setEdgecloudId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageRequest, ShowImageResponse> showImage = genForshowImage();

    private static HttpRequestDef<ShowImageRequest, ShowImageResponse> genForshowImage() {
        // basic
        HttpRequestDef.Builder<ShowImageRequest, ShowImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowImageRequest.class, ShowImageResponse.class)
                .withName("ShowImage")
                .withUri("/v1/images/{image_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForshowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForshowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v1/cloudservers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKeypairRequest, ShowKeypairResponse> showKeypair = genForshowKeypair();

    private static HttpRequestDef<ShowKeypairRequest, ShowKeypairResponse> genForshowKeypair() {
        // basic
        HttpRequestDef.Builder<ShowKeypairRequest, ShowKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowKeypairRequest.class, ShowKeypairResponse.class)
                .withName("ShowKeypair")
                .withUri("/v1/os-keypairs/{keypair_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keypair_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKeypairRequest::getKeypairName, (req, v) -> {
                req.setKeypairName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPortRequest, ShowPortResponse> showPort = genForshowPort();

    private static HttpRequestDef<ShowPortRequest, ShowPortResponse> genForshowPort() {
        // basic
        HttpRequestDef.Builder<ShowPortRequest, ShowPortResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPortRequest.class, ShowPortResponse.class)
                .withName("ShowPort")
                .withUri("/v1/ports/{port_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPortRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRoutetableRequest, ShowRoutetableResponse> showRoutetable =
        genForshowRoutetable();

    private static HttpRequestDef<ShowRoutetableRequest, ShowRoutetableResponse> genForshowRoutetable() {
        // basic
        HttpRequestDef.Builder<ShowRoutetableRequest, ShowRoutetableResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRoutetableRequest.class, ShowRoutetableResponse.class)
                .withName("ShowRoutetable")
                .withUri("/v1/routetables/{routetable_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoutetableRequest::getRoutetableId, (req, v) -> {
                req.setRoutetableId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroup =
        genForshowSecurityGroup();

    private static HttpRequestDef<ShowSecurityGroupRequest, ShowSecurityGroupResponse> genForshowSecurityGroup() {
        // basic
        HttpRequestDef.Builder<ShowSecurityGroupRequest, ShowSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSecurityGroupRequest.class, ShowSecurityGroupResponse.class)
                .withName("ShowSecurityGroup")
                .withUri("/v1/security-groups/{security_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecurityGroupRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRule =
        genForshowSecurityGroupRule();

    private static HttpRequestDef<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> genForshowSecurityGroupRule() {
        // basic
        HttpRequestDef.Builder<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSecurityGroupRuleRequest.class, ShowSecurityGroupRuleResponse.class)
            .withName("ShowSecurityGroupRule")
            .withUri("/v1/security-group-rules/{security_group_rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecurityGroupRuleRequest::getSecurityGroupRuleId, (req, v) -> {
                req.setSecurityGroupRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubnetRequest, ShowSubnetResponse> showSubnet = genForshowSubnet();

    private static HttpRequestDef<ShowSubnetRequest, ShowSubnetResponse> genForshowSubnet() {
        // basic
        HttpRequestDef.Builder<ShowSubnetRequest, ShowSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSubnetRequest.class, ShowSubnetResponse.class)
                .withName("ShowSubnet")
                .withUri("/v1/subnets/{subnet_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubnetRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVolumeRequest, ShowVolumeResponse> showVolume = genForshowVolume();

    private static HttpRequestDef<ShowVolumeRequest, ShowVolumeResponse> genForshowVolume() {
        // basic
        HttpRequestDef.Builder<ShowVolumeRequest, ShowVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVolumeRequest.class, ShowVolumeResponse.class)
                .withName("ShowVolume")
                .withUri("/v1/cloudvolumes/{volume_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVolumeRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVolumeTypesRequest, ShowVolumeTypesResponse> showVolumeTypes =
        genForshowVolumeTypes();

    private static HttpRequestDef<ShowVolumeTypesRequest, ShowVolumeTypesResponse> genForshowVolumeTypes() {
        // basic
        HttpRequestDef.Builder<ShowVolumeTypesRequest, ShowVolumeTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVolumeTypesRequest.class, ShowVolumeTypesResponse.class)
                .withName("ShowVolumeTypes")
                .withUri("/v1/cloudvolumes/volume-types")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcRequest, ShowVpcResponse> showVpc = genForshowVpc();

    private static HttpRequestDef<ShowVpcRequest, ShowVpcResponse> genForshowVpc() {
        // basic
        HttpRequestDef.Builder<ShowVpcRequest, ShowVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVpcRequest.class, ShowVpcResponse.class)
                .withName("ShowVpc")
                .withUri("/v1/vpcs/{vpc_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpcRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBandwidthRequest, UpdateBandwidthResponse> updateBandwidth =
        genForupdateBandwidth();

    private static HttpRequestDef<UpdateBandwidthRequest, UpdateBandwidthResponse> genForupdateBandwidth() {
        // basic
        HttpRequestDef.Builder<UpdateBandwidthRequest, UpdateBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateBandwidthRequest.class, UpdateBandwidthResponse.class)
                .withName("UpdateBandwidth")
                .withUri("/v1/bandwidths/{bandwidth_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBandwidthRequest::getBandwidthId, (req, v) -> {
                req.setBandwidthId(v);
            }));
        builder.<UpdateBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBandwidthRequestBody.class),
            f -> f.withMarshaller(UpdateBandwidthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance =
        genForupdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForupdateInstance() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRequest, UpdateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceRequest.class, UpdateInstanceResponse.class)
                .withName("UpdateInstance")
                .withUri("/v1/cloudservers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<UpdateInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePortRequest, UpdatePortResponse> updatePort = genForupdatePort();

    private static HttpRequestDef<UpdatePortRequest, UpdatePortResponse> genForupdatePort() {
        // basic
        HttpRequestDef.Builder<UpdatePortRequest, UpdatePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePortRequest.class, UpdatePortResponse.class)
                .withName("UpdatePort")
                .withUri("/v1/ports/{port_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePortRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            }));
        builder.<UpdatePortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePortRequestBody.class),
            f -> f.withMarshaller(UpdatePortRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRoutesRequest, UpdateRoutesResponse> updateRoutes = genForupdateRoutes();

    private static HttpRequestDef<UpdateRoutesRequest, UpdateRoutesResponse> genForupdateRoutes() {
        // basic
        HttpRequestDef.Builder<UpdateRoutesRequest, UpdateRoutesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateRoutesRequest.class, UpdateRoutesResponse.class)
                .withName("UpdateRoutes")
                .withUri("/v1/routetables/{routetable_id}/update-routes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoutesRequest::getRoutetableId, (req, v) -> {
                req.setRoutetableId(v);
            }));
        builder.<UpdateRoutesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRoutesRequestBody.class),
            f -> f.withMarshaller(UpdateRoutesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRoutetableRequest, UpdateRoutetableResponse> updateRoutetable =
        genForupdateRoutetable();

    private static HttpRequestDef<UpdateRoutetableRequest, UpdateRoutetableResponse> genForupdateRoutetable() {
        // basic
        HttpRequestDef.Builder<UpdateRoutetableRequest, UpdateRoutetableResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRoutetableRequest.class, UpdateRoutetableResponse.class)
                .withName("UpdateRoutetable")
                .withUri("/v1/routetables/{routetable_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoutetableRequest::getRoutetableId, (req, v) -> {
                req.setRoutetableId(v);
            }));
        builder.<UpdateRoutetableRequesBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRoutetableRequesBody.class),
            f -> f.withMarshaller(UpdateRoutetableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubnetRequest, UpdateSubnetResponse> updateSubnet = genForupdateSubnet();

    private static HttpRequestDef<UpdateSubnetRequest, UpdateSubnetResponse> genForupdateSubnet() {
        // basic
        HttpRequestDef.Builder<UpdateSubnetRequest, UpdateSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSubnetRequest.class, UpdateSubnetResponse.class)
                .withName("UpdateSubnet")
                .withUri("/v1/subnets/{subnet_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubnetRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));
        builder.<UpdateSubnetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSubnetRequestBody.class),
            f -> f.withMarshaller(UpdateSubnetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcRequest, UpdateVpcResponse> updateVpc = genForupdateVpc();

    private static HttpRequestDef<UpdateVpcRequest, UpdateVpcResponse> genForupdateVpc() {
        // basic
        HttpRequestDef.Builder<UpdateVpcRequest, UpdateVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVpcRequest.class, UpdateVpcResponse.class)
                .withName("UpdateVpc")
                .withUri("/v1/vpcs/{vpc_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<UpdateVpcRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpcRequestBody.class),
            f -> f.withMarshaller(UpdateVpcRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFirewallRequest, CreateFirewallResponse> createFirewall =
        genForcreateFirewall();

    private static HttpRequestDef<CreateFirewallRequest, CreateFirewallResponse> genForcreateFirewall() {
        // basic
        HttpRequestDef.Builder<CreateFirewallRequest, CreateFirewallResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFirewallRequest.class, CreateFirewallResponse.class)
                .withName("CreateFirewall")
                .withUri("/v1/firewalls")
                .withContentType("application/json");

        // requests
        builder.<CreateFirewallRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFirewallRequestBody.class),
            f -> f.withMarshaller(CreateFirewallRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFirewallRequest, DeleteFirewallResponse> deleteFirewall =
        genFordeleteFirewall();

    private static HttpRequestDef<DeleteFirewallRequest, DeleteFirewallResponse> genFordeleteFirewall() {
        // basic
        HttpRequestDef.Builder<DeleteFirewallRequest, DeleteFirewallResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFirewallRequest.class, DeleteFirewallResponse.class)
                .withName("DeleteFirewall")
                .withUri("/v1/firewalls/{firewall_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFirewallRequest::getFirewallId, (req, v) -> {
                req.setFirewallId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFirewallsRequest, ListFirewallsResponse> listFirewalls =
        genForlistFirewalls();

    private static HttpRequestDef<ListFirewallsRequest, ListFirewallsResponse> genForlistFirewalls() {
        // basic
        HttpRequestDef.Builder<ListFirewallsRequest, ListFirewallsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFirewallsRequest.class, ListFirewallsResponse.class)
                .withName("ListFirewalls")
                .withUri("/v1/firewalls")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirewallsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirewallsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirewallsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirewallsRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFirewallRequest, ShowFirewallResponse> showFirewall = genForshowFirewall();

    private static HttpRequestDef<ShowFirewallRequest, ShowFirewallResponse> genForshowFirewall() {
        // basic
        HttpRequestDef.Builder<ShowFirewallRequest, ShowFirewallResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFirewallRequest.class, ShowFirewallResponse.class)
                .withName("ShowFirewall")
                .withUri("/v1/firewalls/{firewall_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFirewallRequest::getFirewallId, (req, v) -> {
                req.setFirewallId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFirewallRequest, UpdateFirewallResponse> updateFirewall =
        genForupdateFirewall();

    private static HttpRequestDef<UpdateFirewallRequest, UpdateFirewallResponse> genForupdateFirewall() {
        // basic
        HttpRequestDef.Builder<UpdateFirewallRequest, UpdateFirewallResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFirewallRequest.class, UpdateFirewallResponse.class)
                .withName("UpdateFirewall")
                .withUri("/v1/firewalls/{firewall_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFirewallRequest::getFirewallId, (req, v) -> {
                req.setFirewallId(v);
            }));
        builder.<UpdateFirewallRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFirewallRequestBody.class),
            f -> f.withMarshaller(UpdateFirewallRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFirewallRuleRequest, UpdateFirewallRuleResponse> updateFirewallRule =
        genForupdateFirewallRule();

    private static HttpRequestDef<UpdateFirewallRuleRequest, UpdateFirewallRuleResponse> genForupdateFirewallRule() {
        // basic
        HttpRequestDef.Builder<UpdateFirewallRuleRequest, UpdateFirewallRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFirewallRuleRequest.class, UpdateFirewallRuleResponse.class)
                .withName("UpdateFirewallRule")
                .withUri("/v1/firewalls/{firewall_id}/firewall-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFirewallRuleRequest::getFirewallId, (req, v) -> {
                req.setFirewallId(v);
            }));
        builder.<UpdateFirewallRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFirewallRuleRequestBody.class),
            f -> f.withMarshaller(UpdateFirewallRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePublicIpRequest, CreatePublicIpResponse> createPublicIp =
        genForcreatePublicIp();

    private static HttpRequestDef<CreatePublicIpRequest, CreatePublicIpResponse> genForcreatePublicIp() {
        // basic
        HttpRequestDef.Builder<CreatePublicIpRequest, CreatePublicIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePublicIpRequest.class, CreatePublicIpResponse.class)
                .withName("CreatePublicIp")
                .withUri("/v1/publicips")
                .withContentType("application/json");

        // requests
        builder.<CreatePublicIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePublicIpRequestBody.class),
            f -> f.withMarshaller(CreatePublicIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePublicIpRequest, DeletePublicIpResponse> deletePublicIp =
        genFordeletePublicIp();

    private static HttpRequestDef<DeletePublicIpRequest, DeletePublicIpResponse> genFordeletePublicIp() {
        // basic
        HttpRequestDef.Builder<DeletePublicIpRequest, DeletePublicIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePublicIpRequest.class, DeletePublicIpResponse.class)
                .withName("DeletePublicIp")
                .withUri("/v1/publicips/{publicip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePublicIpRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicIpsRequest, ListPublicIpsResponse> listPublicIps =
        genForlistPublicIps();

    private static HttpRequestDef<ListPublicIpsRequest, ListPublicIpsResponse> genForlistPublicIps() {
        // basic
        HttpRequestDef.Builder<ListPublicIpsRequest, ListPublicIpsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublicIpsRequest.class, ListPublicIpsResponse.class)
                .withName("ListPublicIps")
                .withUri("/v1/publicips")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicIpsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicIpsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicIpsRequest::getSiteId, (req, v) -> {
                req.setSiteId(v);
            }));
        builder.<String>withRequestField("port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicIpsRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicIpRequest, ShowPublicIpResponse> showPublicIp = genForshowPublicIp();

    private static HttpRequestDef<ShowPublicIpRequest, ShowPublicIpResponse> genForshowPublicIp() {
        // basic
        HttpRequestDef.Builder<ShowPublicIpRequest, ShowPublicIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPublicIpRequest.class, ShowPublicIpResponse.class)
                .withName("ShowPublicIp")
                .withUri("/v1/publicips/{publicip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicIpRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicIpRequest, UpdatePublicIpResponse> updatePublicIp =
        genForupdatePublicIp();

    private static HttpRequestDef<UpdatePublicIpRequest, UpdatePublicIpResponse> genForupdatePublicIp() {
        // basic
        HttpRequestDef.Builder<UpdatePublicIpRequest, UpdatePublicIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePublicIpRequest.class, UpdatePublicIpResponse.class)
                .withName("UpdatePublicIp")
                .withUri("/v1/publicips/{publicip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublicIpRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            }));
        builder.<UpdatePublicIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePublicIpRequestBody.class),
            f -> f.withMarshaller(UpdatePublicIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
