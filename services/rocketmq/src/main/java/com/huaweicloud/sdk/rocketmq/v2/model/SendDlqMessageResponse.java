package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class SendDlqMessageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resend_results")

    private List<DeadletterResendRespResendResults> resendResults = null;

    public SendDlqMessageResponse withResendResults(List<DeadletterResendRespResendResults> resendResults) {
        this.resendResults = resendResults;
        return this;
    }

    public SendDlqMessageResponse addResendResultsItem(DeadletterResendRespResendResults resendResultsItem) {
        if (this.resendResults == null) {
            this.resendResults = new ArrayList<>();
        }
        this.resendResults.add(resendResultsItem);
        return this;
    }

    public SendDlqMessageResponse withResendResults(
        Consumer<List<DeadletterResendRespResendResults>> resendResultsSetter) {
        if (this.resendResults == null) {
            this.resendResults = new ArrayList<>();
        }
        resendResultsSetter.accept(this.resendResults);
        return this;
    }

    /**
     * 重发死信消息结果。
     * @return resendResults
     */
    public List<DeadletterResendRespResendResults> getResendResults() {
        return resendResults;
    }

    public void setResendResults(List<DeadletterResendRespResendResults> resendResults) {
        this.resendResults = resendResults;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendDlqMessageResponse sendDlqMessageResponse = (SendDlqMessageResponse) o;
        return Objects.equals(this.resendResults, sendDlqMessageResponse.resendResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resendResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendDlqMessageResponse {\n");
        sb.append("    resendResults: ").append(toIndentedString(resendResults)).append("\n");
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
