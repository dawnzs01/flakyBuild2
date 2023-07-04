package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RecognizeMvsInvoiceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private MvsInvoiceResult result;

    public RecognizeMvsInvoiceResponse withResult(MvsInvoiceResult result) {
        this.result = result;
        return this;
    }

    public RecognizeMvsInvoiceResponse withResult(Consumer<MvsInvoiceResult> resultSetter) {
        if (this.result == null) {
            this.result = new MvsInvoiceResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public MvsInvoiceResult getResult() {
        return result;
    }

    public void setResult(MvsInvoiceResult result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecognizeMvsInvoiceResponse recognizeMvsInvoiceResponse = (RecognizeMvsInvoiceResponse) o;
        return Objects.equals(this.result, recognizeMvsInvoiceResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeMvsInvoiceResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
