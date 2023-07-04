package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowProcessResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "json")

    private UploadProcessJson json;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    private String extend;

    public ShowProcessResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * code
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ShowProcessResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowProcessResponse withJson(UploadProcessJson json) {
        this.json = json;
        return this;
    }

    public ShowProcessResponse withJson(Consumer<UploadProcessJson> jsonSetter) {
        if (this.json == null) {
            this.json = new UploadProcessJson();
            jsonSetter.accept(this.json);
        }

        return this;
    }

    /**
     * Get json
     * @return json
     */
    public UploadProcessJson getJson() {
        return json;
    }

    public void setJson(UploadProcessJson json) {
        this.json = json;
    }

    public ShowProcessResponse withExtend(String extend) {
        this.extend = extend;
        return this;
    }

    /**
     * extend
     * @return extend
     */
    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProcessResponse showProcessResponse = (ShowProcessResponse) o;
        return Objects.equals(this.code, showProcessResponse.code)
            && Objects.equals(this.message, showProcessResponse.message)
            && Objects.equals(this.json, showProcessResponse.json)
            && Objects.equals(this.extend, showProcessResponse.extend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, json, extend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProcessResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    json: ").append(toIndentedString(json)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
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
