package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class KeystoneUpdateProjectResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private KeystoneUpdateProjectResult project;

    public KeystoneUpdateProjectResponse withProject(KeystoneUpdateProjectResult project) {
        this.project = project;
        return this;
    }

    public KeystoneUpdateProjectResponse withProject(Consumer<KeystoneUpdateProjectResult> projectSetter) {
        if (this.project == null) {
            this.project = new KeystoneUpdateProjectResult();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public KeystoneUpdateProjectResult getProject() {
        return project;
    }

    public void setProject(KeystoneUpdateProjectResult project) {
        this.project = project;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneUpdateProjectResponse keystoneUpdateProjectResponse = (KeystoneUpdateProjectResponse) o;
        return Objects.equals(this.project, keystoneUpdateProjectResponse.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdateProjectResponse {\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
