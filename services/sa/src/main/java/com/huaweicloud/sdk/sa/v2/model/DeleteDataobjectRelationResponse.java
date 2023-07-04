package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DeleteDataobjectRelationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private DataResponse data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public DeleteDataobjectRelationResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Id value
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DeleteDataobjectRelationResponse withMessage(String message) {
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

    public DeleteDataobjectRelationResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Error message
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public DeleteDataobjectRelationResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * Error message
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public DeleteDataobjectRelationResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * tatal count
     * minimum: 0
     * maximum: 99999
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public DeleteDataobjectRelationResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * current page count
     * minimum: 0
     * maximum: 9999
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public DeleteDataobjectRelationResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * current page size
     * minimum: 0
     * maximum: 100
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public DeleteDataobjectRelationResponse withData(DataResponse data) {
        this.data = data;
        return this;
    }

    public DeleteDataobjectRelationResponse withData(Consumer<DataResponse> dataSetter) {
        if (this.data == null) {
            this.data = new DataResponse();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public DataResponse getData() {
        return data;
    }

    public void setData(DataResponse data) {
        this.data = data;
    }

    public DeleteDataobjectRelationResponse withXRequestId(String xRequestId) {
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
        DeleteDataobjectRelationResponse deleteDataobjectRelationResponse = (DeleteDataobjectRelationResponse) o;
        return Objects.equals(this.code, deleteDataobjectRelationResponse.code)
            && Objects.equals(this.message, deleteDataobjectRelationResponse.message)
            && Objects.equals(this.requestId, deleteDataobjectRelationResponse.requestId)
            && Objects.equals(this.success, deleteDataobjectRelationResponse.success)
            && Objects.equals(this.total, deleteDataobjectRelationResponse.total)
            && Objects.equals(this.limit, deleteDataobjectRelationResponse.limit)
            && Objects.equals(this.offset, deleteDataobjectRelationResponse.offset)
            && Objects.equals(this.data, deleteDataobjectRelationResponse.data)
            && Objects.equals(this.xRequestId, deleteDataobjectRelationResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, requestId, success, total, limit, offset, data, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDataobjectRelationResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
