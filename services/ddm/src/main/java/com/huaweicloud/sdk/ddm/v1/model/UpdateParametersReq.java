package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateParametersReq
 */
public class UpdateParametersReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private UpdateParametersReqValues values;

    public UpdateParametersReq withValues(UpdateParametersReqValues values) {
        this.values = values;
        return this;
    }

    public UpdateParametersReq withValues(Consumer<UpdateParametersReqValues> valuesSetter) {
        if (this.values == null) {
            this.values = new UpdateParametersReqValues();
            valuesSetter.accept(this.values);
        }

        return this;
    }

    /**
     * Get values
     * @return values
     */
    public UpdateParametersReqValues getValues() {
        return values;
    }

    public void setValues(UpdateParametersReqValues values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateParametersReq updateParametersReq = (UpdateParametersReq) o;
        return Objects.equals(this.values, updateParametersReq.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateParametersReq {\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
