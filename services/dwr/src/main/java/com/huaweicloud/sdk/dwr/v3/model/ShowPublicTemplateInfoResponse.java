package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPublicTemplateInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provided_actions")

    private ProvidedAction providedActions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Connection")

    private String connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Length")

    private String contentLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    private String date;

    public ShowPublicTemplateInfoResponse withProvidedActions(ProvidedAction providedActions) {
        this.providedActions = providedActions;
        return this;
    }

    public ShowPublicTemplateInfoResponse withProvidedActions(Consumer<ProvidedAction> providedActionsSetter) {
        if (this.providedActions == null) {
            this.providedActions = new ProvidedAction();
            providedActionsSetter.accept(this.providedActions);
        }

        return this;
    }

    /**
     * Get providedActions
     * @return providedActions
     */
    public ProvidedAction getProvidedActions() {
        return providedActions;
    }

    public void setProvidedActions(ProvidedAction providedActions) {
        this.providedActions = providedActions;
    }

    public ShowPublicTemplateInfoResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public ShowPublicTemplateInfoResponse withConnection(String connection) {
        this.connection = connection;
        return this;
    }

    /**
     * Get connection
     * @return connection
     */
    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public ShowPublicTemplateInfoResponse withContentLength(String contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get contentLength
     * @return contentLength
     */
    public String getContentLength() {
        return contentLength;
    }

    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    public ShowPublicTemplateInfoResponse withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPublicTemplateInfoResponse showPublicTemplateInfoResponse = (ShowPublicTemplateInfoResponse) o;
        return Objects.equals(this.providedActions, showPublicTemplateInfoResponse.providedActions)
            && Objects.equals(this.xRequestId, showPublicTemplateInfoResponse.xRequestId)
            && Objects.equals(this.connection, showPublicTemplateInfoResponse.connection)
            && Objects.equals(this.contentLength, showPublicTemplateInfoResponse.contentLength)
            && Objects.equals(this.date, showPublicTemplateInfoResponse.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providedActions, xRequestId, connection, contentLength, date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPublicTemplateInfoResponse {\n");
        sb.append("    providedActions: ").append(toIndentedString(providedActions)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
