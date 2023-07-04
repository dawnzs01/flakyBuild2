package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDirectoryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_id")

    private Integer directoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_suite_id")

    private Integer testSuiteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateDirectoryRequestBody body;

    public UpdateDirectoryRequest withDirectoryId(Integer directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * 目录id
     * minimum: 0
     * maximum: 2147483647
     * @return directoryId
     */
    public Integer getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(Integer directoryId) {
        this.directoryId = directoryId;
    }

    public UpdateDirectoryRequest withTestSuiteId(Integer testSuiteId) {
        this.testSuiteId = testSuiteId;
        return this;
    }

    /**
     * 测试工程id
     * minimum: 0
     * maximum: 2147483647
     * @return testSuiteId
     */
    public Integer getTestSuiteId() {
        return testSuiteId;
    }

    public void setTestSuiteId(Integer testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    public UpdateDirectoryRequest withBody(UpdateDirectoryRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateDirectoryRequest withBody(Consumer<UpdateDirectoryRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateDirectoryRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateDirectoryRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateDirectoryRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDirectoryRequest updateDirectoryRequest = (UpdateDirectoryRequest) o;
        return Objects.equals(this.directoryId, updateDirectoryRequest.directoryId)
            && Objects.equals(this.testSuiteId, updateDirectoryRequest.testSuiteId)
            && Objects.equals(this.body, updateDirectoryRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directoryId, testSuiteId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDirectoryRequest {\n");
        sb.append("    directoryId: ").append(toIndentedString(directoryId)).append("\n");
        sb.append("    testSuiteId: ").append(toIndentedString(testSuiteId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
