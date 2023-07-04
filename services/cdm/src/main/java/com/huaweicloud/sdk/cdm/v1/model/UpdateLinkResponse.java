package com.huaweicloud.sdk.cdm.v1.model;

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
public class UpdateLinkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validation-result")

    private List<ValidationResult> validationResult = null;

    public UpdateLinkResponse withValidationResult(List<ValidationResult> validationResult) {
        this.validationResult = validationResult;
        return this;
    }

    public UpdateLinkResponse addValidationResultItem(ValidationResult validationResultItem) {
        if (this.validationResult == null) {
            this.validationResult = new ArrayList<>();
        }
        this.validationResult.add(validationResultItem);
        return this;
    }

    public UpdateLinkResponse withValidationResult(Consumer<List<ValidationResult>> validationResultSetter) {
        if (this.validationResult == null) {
            this.validationResult = new ArrayList<>();
        }
        validationResultSetter.accept(this.validationResult);
        return this;
    }

    /**
     * 校验结构：如果创建连接失败，返回失败原因，请参见validation-result参数说明。如果创建成功，返回空列表。
     * @return validationResult
     */
    public List<ValidationResult> getValidationResult() {
        return validationResult;
    }

    public void setValidationResult(List<ValidationResult> validationResult) {
        this.validationResult = validationResult;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateLinkResponse updateLinkResponse = (UpdateLinkResponse) o;
        return Objects.equals(this.validationResult, updateLinkResponse.validationResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validationResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLinkResponse {\n");
        sb.append("    validationResult: ").append(toIndentedString(validationResult)).append("\n");
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
