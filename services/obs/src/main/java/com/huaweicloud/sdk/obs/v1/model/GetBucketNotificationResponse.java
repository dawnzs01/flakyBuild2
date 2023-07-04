package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.huaweicloud.sdk.corexml.SdkXmlResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
@JacksonXmlRootElement(localName = "GetBucketNotificationResponse")
public class GetBucketNotificationResponse extends SdkXmlResponse<GetBucketNotificationResponse> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "NotificationConfiguration")

    @JacksonXmlProperty(localName = "NotificationConfiguration")

    private SetBucketNotificationRequestBody notificationConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-id-2")

    @JacksonXmlProperty(localName = "x-obs-id-2")

    private String xObsId2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-request-id")

    @JacksonXmlProperty(localName = "x-obs-request-id")

    private String xObsRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ETag")

    @JacksonXmlProperty(localName = "ETag")

    private String etag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Connection")

    @JacksonXmlProperty(localName = "Connection")

    private String connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Length")

    @JacksonXmlProperty(localName = "Content-Length")

    private String contentLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    public GetBucketNotificationResponse withNotificationConfiguration(
        SetBucketNotificationRequestBody notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
        return this;
    }

    public GetBucketNotificationResponse withNotificationConfiguration(
        Consumer<SetBucketNotificationRequestBody> notificationConfigurationSetter) {
        if (this.notificationConfiguration == null) {
            this.notificationConfiguration = new SetBucketNotificationRequestBody();
            notificationConfigurationSetter.accept(this.notificationConfiguration);
        }

        return this;
    }

    /**
     * Get notificationConfiguration
     * @return notificationConfiguration
     */
    public SetBucketNotificationRequestBody getNotificationConfiguration() {
        return notificationConfiguration;
    }

    public void setNotificationConfiguration(SetBucketNotificationRequestBody notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    public GetBucketNotificationResponse withXObsId2(String xObsId2) {
        this.xObsId2 = xObsId2;
        return this;
    }

    /**
     * Get xObsId2
     * @return xObsId2
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-id-2")
    public String getXObsId2() {
        return xObsId2;
    }

    public void setXObsId2(String xObsId2) {
        this.xObsId2 = xObsId2;
    }

    public GetBucketNotificationResponse withXObsRequestId(String xObsRequestId) {
        this.xObsRequestId = xObsRequestId;
        return this;
    }

    /**
     * Get xObsRequestId
     * @return xObsRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-request-id")
    public String getXObsRequestId() {
        return xObsRequestId;
    }

    public void setXObsRequestId(String xObsRequestId) {
        this.xObsRequestId = xObsRequestId;
    }

    public GetBucketNotificationResponse withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get etag
     * @return etag
     */
    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public GetBucketNotificationResponse withConnection(String connection) {
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

    public GetBucketNotificationResponse withContentLength(String contentLength) {
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

    public GetBucketNotificationResponse withDate(String date) {
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
        GetBucketNotificationResponse getBucketNotificationResponse = (GetBucketNotificationResponse) o;
        return Objects.equals(this.notificationConfiguration, getBucketNotificationResponse.notificationConfiguration)
            && Objects.equals(this.xObsId2, getBucketNotificationResponse.xObsId2)
            && Objects.equals(this.xObsRequestId, getBucketNotificationResponse.xObsRequestId)
            && Objects.equals(this.etag, getBucketNotificationResponse.etag)
            && Objects.equals(this.connection, getBucketNotificationResponse.connection)
            && Objects.equals(this.contentLength, getBucketNotificationResponse.contentLength)
            && Objects.equals(this.date, getBucketNotificationResponse.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationConfiguration, xObsId2, xObsRequestId, etag, connection, contentLength, date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetBucketNotificationResponse {\n");
        sb.append("    notificationConfiguration: ").append(toIndentedString(notificationConfiguration)).append("\n");
        sb.append("    xObsId2: ").append(toIndentedString(xObsId2)).append("\n");
        sb.append("    xObsRequestId: ").append(toIndentedString(xObsRequestId)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
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
