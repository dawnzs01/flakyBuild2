package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPlaybookStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private PlaybookStatisticDetail data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowPlaybookStatisticsResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Error code
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ShowPlaybookStatisticsResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Error message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowPlaybookStatisticsResponse withData(PlaybookStatisticDetail data) {
        this.data = data;
        return this;
    }

    public ShowPlaybookStatisticsResponse withData(Consumer<PlaybookStatisticDetail> dataSetter) {
        if (this.data == null) {
            this.data = new PlaybookStatisticDetail();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public PlaybookStatisticDetail getData() {
        return data;
    }

    public void setData(PlaybookStatisticDetail data) {
        this.data = data;
    }

    public ShowPlaybookStatisticsResponse withXRequestId(String xRequestId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPlaybookStatisticsResponse showPlaybookStatisticsResponse = (ShowPlaybookStatisticsResponse) o;
        return Objects.equals(this.code, showPlaybookStatisticsResponse.code)
            && Objects.equals(this.message, showPlaybookStatisticsResponse.message)
            && Objects.equals(this.data, showPlaybookStatisticsResponse.data)
            && Objects.equals(this.xRequestId, showPlaybookStatisticsResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, data, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPlaybookStatisticsResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
