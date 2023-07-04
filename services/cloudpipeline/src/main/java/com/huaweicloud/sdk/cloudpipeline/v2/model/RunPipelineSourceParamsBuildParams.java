package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 构建参数
 */
public class RunPipelineSourceParamsBuildParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_type")

    private String buildType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_id")

    private String commitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_id")

    private String mergeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_branch")

    private String sourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_branch")

    private String targetBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codehub_id")

    private String codehubId;

    public RunPipelineSourceParamsBuildParams withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 合并请求事件类型
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public RunPipelineSourceParamsBuildParams withBuildType(String buildType) {
        this.buildType = buildType;
        return this;
    }

    /**
     * 基于分支还是tag运行
     * @return buildType
     */
    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    public RunPipelineSourceParamsBuildParams withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * 代码仓提交ID
     * @return commitId
     */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public RunPipelineSourceParamsBuildParams withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 运行事件类型
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public RunPipelineSourceParamsBuildParams withMergeId(String mergeId) {
        this.mergeId = mergeId;
        return this;
    }

    /**
     * 合并请求ID
     * @return mergeId
     */
    public String getMergeId() {
        return mergeId;
    }

    public void setMergeId(String mergeId) {
        this.mergeId = mergeId;
    }

    public RunPipelineSourceParamsBuildParams withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 代码仓提交信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RunPipelineSourceParamsBuildParams withSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }

    /**
     * 源分支
     * @return sourceBranch
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    public RunPipelineSourceParamsBuildParams withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 标签
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public RunPipelineSourceParamsBuildParams withTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    /**
     * 目标分支
     * @return targetBranch
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public RunPipelineSourceParamsBuildParams withCodehubId(String codehubId) {
        this.codehubId = codehubId;
        return this;
    }

    /**
     * codehub代码仓ID
     * @return codehubId
     */
    public String getCodehubId() {
        return codehubId;
    }

    public void setCodehubId(String codehubId) {
        this.codehubId = codehubId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunPipelineSourceParamsBuildParams runPipelineSourceParamsBuildParams = (RunPipelineSourceParamsBuildParams) o;
        return Objects.equals(this.action, runPipelineSourceParamsBuildParams.action)
            && Objects.equals(this.buildType, runPipelineSourceParamsBuildParams.buildType)
            && Objects.equals(this.commitId, runPipelineSourceParamsBuildParams.commitId)
            && Objects.equals(this.eventType, runPipelineSourceParamsBuildParams.eventType)
            && Objects.equals(this.mergeId, runPipelineSourceParamsBuildParams.mergeId)
            && Objects.equals(this.message, runPipelineSourceParamsBuildParams.message)
            && Objects.equals(this.sourceBranch, runPipelineSourceParamsBuildParams.sourceBranch)
            && Objects.equals(this.tag, runPipelineSourceParamsBuildParams.tag)
            && Objects.equals(this.targetBranch, runPipelineSourceParamsBuildParams.targetBranch)
            && Objects.equals(this.codehubId, runPipelineSourceParamsBuildParams.codehubId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(action, buildType, commitId, eventType, mergeId, message, sourceBranch, tag, targetBranch, codehubId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunPipelineSourceParamsBuildParams {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    buildType: ").append(toIndentedString(buildType)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    mergeId: ").append(toIndentedString(mergeId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
        sb.append("    codehubId: ").append(toIndentedString(codehubId)).append("\n");
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
