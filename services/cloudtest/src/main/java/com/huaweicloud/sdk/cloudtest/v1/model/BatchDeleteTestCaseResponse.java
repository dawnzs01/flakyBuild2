package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchDeleteTestCaseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_detail")

    private ErrorDetailInfo errorDetail;

    public BatchDeleteTestCaseResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 接口调用失败错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public BatchDeleteTestCaseResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 接口调用失败错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public BatchDeleteTestCaseResponse withErrorDetail(ErrorDetailInfo errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }

    public BatchDeleteTestCaseResponse withErrorDetail(Consumer<ErrorDetailInfo> errorDetailSetter) {
        if (this.errorDetail == null) {
            this.errorDetail = new ErrorDetailInfo();
            errorDetailSetter.accept(this.errorDetail);
        }

        return this;
    }

    /**
     * Get errorDetail
     * @return errorDetail
     */
    public ErrorDetailInfo getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(ErrorDetailInfo errorDetail) {
        this.errorDetail = errorDetail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteTestCaseResponse batchDeleteTestCaseResponse = (BatchDeleteTestCaseResponse) o;
        return Objects.equals(this.errorCode, batchDeleteTestCaseResponse.errorCode)
            && Objects.equals(this.errorMsg, batchDeleteTestCaseResponse.errorMsg)
            && Objects.equals(this.errorDetail, batchDeleteTestCaseResponse.errorDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMsg, errorDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteTestCaseResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
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
