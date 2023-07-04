package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateAppCodeV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AppCodeCreate body;

    public CreateAppCodeV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，在API网关控制台的“实例信息”中获取。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateAppCodeV2Request withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public CreateAppCodeV2Request withBody(AppCodeCreate body) {
        this.body = body;
        return this;
    }

    public CreateAppCodeV2Request withBody(Consumer<AppCodeCreate> bodySetter) {
        if (this.body == null) {
            this.body = new AppCodeCreate();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AppCodeCreate getBody() {
        return body;
    }

    public void setBody(AppCodeCreate body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAppCodeV2Request createAppCodeV2Request = (CreateAppCodeV2Request) o;
        return Objects.equals(this.instanceId, createAppCodeV2Request.instanceId)
            && Objects.equals(this.appId, createAppCodeV2Request.appId)
            && Objects.equals(this.body, createAppCodeV2Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, appId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAppCodeV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
