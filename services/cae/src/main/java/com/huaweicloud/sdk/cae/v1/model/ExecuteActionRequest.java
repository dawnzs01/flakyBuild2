package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ExecuteActionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Environment-ID")

    private String xEnvironmentID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Enterprise-Project-ID")

    private String xEnterpriseProjectID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ExecuteActionRequestBody body;

    public ExecuteActionRequest withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * 组件id。
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ExecuteActionRequest withXEnvironmentID(String xEnvironmentID) {
        this.xEnvironmentID = xEnvironmentID;
        return this;
    }

    /**
     * 环境id。
     * @return xEnvironmentID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Environment-ID")
    public String getXEnvironmentID() {
        return xEnvironmentID;
    }

    public void setXEnvironmentID(String xEnvironmentID) {
        this.xEnvironmentID = xEnvironmentID;
    }

    public ExecuteActionRequest withXEnterpriseProjectID(String xEnterpriseProjectID) {
        this.xEnterpriseProjectID = xEnterpriseProjectID;
        return this;
    }

    /**
     * 租户的企业项目id。
     * @return xEnterpriseProjectID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Enterprise-Project-ID")
    public String getXEnterpriseProjectID() {
        return xEnterpriseProjectID;
    }

    public void setXEnterpriseProjectID(String xEnterpriseProjectID) {
        this.xEnterpriseProjectID = xEnterpriseProjectID;
    }

    public ExecuteActionRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * 应用id。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ExecuteActionRequest withBody(ExecuteActionRequestBody body) {
        this.body = body;
        return this;
    }

    public ExecuteActionRequest withBody(Consumer<ExecuteActionRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ExecuteActionRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ExecuteActionRequestBody getBody() {
        return body;
    }

    public void setBody(ExecuteActionRequestBody body) {
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
        ExecuteActionRequest executeActionRequest = (ExecuteActionRequest) o;
        return Objects.equals(this.componentId, executeActionRequest.componentId)
            && Objects.equals(this.xEnvironmentID, executeActionRequest.xEnvironmentID)
            && Objects.equals(this.xEnterpriseProjectID, executeActionRequest.xEnterpriseProjectID)
            && Objects.equals(this.applicationId, executeActionRequest.applicationId)
            && Objects.equals(this.body, executeActionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId, xEnvironmentID, xEnterpriseProjectID, applicationId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteActionRequest {\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    xEnvironmentID: ").append(toIndentedString(xEnvironmentID)).append("\n");
        sb.append("    xEnterpriseProjectID: ").append(toIndentedString(xEnterpriseProjectID)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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
