package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowQaPairDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qapair")

    private QaPair qapair;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public ShowQaPairDetailResponse withQapair(QaPair qapair) {
        this.qapair = qapair;
        return this;
    }

    public ShowQaPairDetailResponse withQapair(Consumer<QaPair> qapairSetter) {
        if (this.qapair == null) {
            this.qapair = new QaPair();
            qapairSetter.accept(this.qapair);
        }

        return this;
    }

    /**
     * Get qapair
     * @return qapair
     */
    public QaPair getQapair() {
        return qapair;
    }

    public void setQapair(QaPair qapair) {
        this.qapair = qapair;
    }

    public ShowQaPairDetailResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ShowQaPairDetailResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowQaPairDetailResponse showQaPairDetailResponse = (ShowQaPairDetailResponse) o;
        return Objects.equals(this.qapair, showQaPairDetailResponse.qapair)
            && Objects.equals(this.errorCode, showQaPairDetailResponse.errorCode)
            && Objects.equals(this.errorMsg, showQaPairDetailResponse.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qapair, errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQaPairDetailResponse {\n");
        sb.append("    qapair: ").append(toIndentedString(qapair)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
