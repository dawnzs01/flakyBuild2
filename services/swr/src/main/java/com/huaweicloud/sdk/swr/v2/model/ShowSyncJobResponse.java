package com.huaweicloud.sdk.swr.v2.model;

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
public class ShowSyncJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private List<SyncJob> body = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Range")

    private String contentRange;

    public ShowSyncJobResponse withBody(List<SyncJob> body) {
        this.body = body;
        return this;
    }

    public ShowSyncJobResponse addBodyItem(SyncJob bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public ShowSyncJobResponse withBody(Consumer<List<SyncJob>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public List<SyncJob> getBody() {
        return body;
    }

    public void setBody(List<SyncJob> body) {
        this.body = body;
    }

    public ShowSyncJobResponse withContentRange(String contentRange) {
        this.contentRange = contentRange;
        return this;
    }

    /**
     * Get contentRange
     * @return contentRange
     */
    public String getContentRange() {
        return contentRange;
    }

    public void setContentRange(String contentRange) {
        this.contentRange = contentRange;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSyncJobResponse showSyncJobResponse = (ShowSyncJobResponse) o;
        return Objects.equals(this.body, showSyncJobResponse.body)
            && Objects.equals(this.contentRange, showSyncJobResponse.contentRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, contentRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSyncJobResponse {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    contentRange: ").append(toIndentedString(contentRange)).append("\n");
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
