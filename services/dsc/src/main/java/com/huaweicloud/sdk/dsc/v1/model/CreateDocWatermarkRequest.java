package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.progress.ProgressListener;
import com.huaweicloud.sdk.core.progress.ProgressRequest;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateDocWatermarkRequest implements ProgressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateDocWatermarkRequestBody body;

    private ProgressListener progressListener;

    private long progressInterval;

    @Override
    public void setProgressListener(ProgressListener progressListener) {
        this.progressListener = progressListener;
    }

    @Override
    public ProgressListener getProgressListener() {
        return progressListener;
    }

    @Override
    public void setProgressInterval(long progressInterval) {
        this.progressInterval = progressInterval;
    }

    @Override
    public long getProgressInterval() {
        return progressInterval;
    }

    public CreateDocWatermarkRequest withBody(CreateDocWatermarkRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateDocWatermarkRequest withBody(Consumer<CreateDocWatermarkRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateDocWatermarkRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateDocWatermarkRequestBody getBody() {
        return body;
    }

    public void setBody(CreateDocWatermarkRequestBody body) {
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
        CreateDocWatermarkRequest createDocWatermarkRequest = (CreateDocWatermarkRequest) o;
        return Objects.equals(this.body, createDocWatermarkRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDocWatermarkRequest {\n");
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
