package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 源参数
 */
public class RunPipelineDTOParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_type")

    private String gitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codehub_id")

    private String codehubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_branch")

    private String defaultBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_url")

    private String gitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_params")

    private RunPipelineDTOParamsBuildParams buildParams;

    public RunPipelineDTOParams withGitType(String gitType) {
        this.gitType = gitType;
        return this;
    }

    /**
     * 代码仓类型
     * @return gitType
     */
    public String getGitType() {
        return gitType;
    }

    public void setGitType(String gitType) {
        this.gitType = gitType;
    }

    public RunPipelineDTOParams withCodehubId(String codehubId) {
        this.codehubId = codehubId;
        return this;
    }

    /**
     * codehub代码库ID
     * @return codehubId
     */
    public String getCodehubId() {
        return codehubId;
    }

    public void setCodehubId(String codehubId) {
        this.codehubId = codehubId;
    }

    public RunPipelineDTOParams withDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    /**
     * 默认分支
     * @return defaultBranch
     */
    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public RunPipelineDTOParams withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * git仓库https地址
     * @return gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public RunPipelineDTOParams withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * 扩展点ID
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public RunPipelineDTOParams withBuildParams(RunPipelineDTOParamsBuildParams buildParams) {
        this.buildParams = buildParams;
        return this;
    }

    public RunPipelineDTOParams withBuildParams(Consumer<RunPipelineDTOParamsBuildParams> buildParamsSetter) {
        if (this.buildParams == null) {
            this.buildParams = new RunPipelineDTOParamsBuildParams();
            buildParamsSetter.accept(this.buildParams);
        }

        return this;
    }

    /**
     * Get buildParams
     * @return buildParams
     */
    public RunPipelineDTOParamsBuildParams getBuildParams() {
        return buildParams;
    }

    public void setBuildParams(RunPipelineDTOParamsBuildParams buildParams) {
        this.buildParams = buildParams;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunPipelineDTOParams runPipelineDTOParams = (RunPipelineDTOParams) o;
        return Objects.equals(this.gitType, runPipelineDTOParams.gitType)
            && Objects.equals(this.codehubId, runPipelineDTOParams.codehubId)
            && Objects.equals(this.defaultBranch, runPipelineDTOParams.defaultBranch)
            && Objects.equals(this.gitUrl, runPipelineDTOParams.gitUrl)
            && Objects.equals(this.endpointId, runPipelineDTOParams.endpointId)
            && Objects.equals(this.buildParams, runPipelineDTOParams.buildParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gitType, codehubId, defaultBranch, gitUrl, endpointId, buildParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunPipelineDTOParams {\n");
        sb.append("    gitType: ").append(toIndentedString(gitType)).append("\n");
        sb.append("    codehubId: ").append(toIndentedString(codehubId)).append("\n");
        sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    buildParams: ").append(toIndentedString(buildParams)).append("\n");
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
