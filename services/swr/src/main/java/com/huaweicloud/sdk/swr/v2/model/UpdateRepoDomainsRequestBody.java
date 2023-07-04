package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateRepoDomainsRequestBody
 */
public class UpdateRepoDomainsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permit")

    private String permit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deadline")

    private String deadline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpdateRepoDomainsRequestBody withPermit(String permit) {
        this.permit = permit;
        return this;
    }

    /**
     * 当前只支持read权限
     * @return permit
     */
    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }

    public UpdateRepoDomainsRequestBody withDeadline(String deadline) {
        this.deadline = deadline;
        return this;
    }

    /**
     * 截止时间，UTC时间格式。永久有效为forever
     * @return deadline
     */
    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public UpdateRepoDomainsRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。默认值为空字符串
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRepoDomainsRequestBody updateRepoDomainsRequestBody = (UpdateRepoDomainsRequestBody) o;
        return Objects.equals(this.permit, updateRepoDomainsRequestBody.permit)
            && Objects.equals(this.deadline, updateRepoDomainsRequestBody.deadline)
            && Objects.equals(this.description, updateRepoDomainsRequestBody.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permit, deadline, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRepoDomainsRequestBody {\n");
        sb.append("    permit: ").append(toIndentedString(permit)).append("\n");
        sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
