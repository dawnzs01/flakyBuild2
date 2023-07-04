package com.huaweicloud.sdk.campusgo.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业的输出配置
 */
public class TaskOutput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private TaskOutputObs obs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dis")

    private TaskOutputDis dis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webhook")

    private TaskOutputWebhook webhook;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "localpath")

    private TaskOutputLocalpath localpath;

    public TaskOutput withObs(TaskOutputObs obs) {
        this.obs = obs;
        return this;
    }

    public TaskOutput withObs(Consumer<TaskOutputObs> obsSetter) {
        if (this.obs == null) {
            this.obs = new TaskOutputObs();
            obsSetter.accept(this.obs);
        }

        return this;
    }

    /**
     * Get obs
     * @return obs
     */
    public TaskOutputObs getObs() {
        return obs;
    }

    public void setObs(TaskOutputObs obs) {
        this.obs = obs;
    }

    public TaskOutput withDis(TaskOutputDis dis) {
        this.dis = dis;
        return this;
    }

    public TaskOutput withDis(Consumer<TaskOutputDis> disSetter) {
        if (this.dis == null) {
            this.dis = new TaskOutputDis();
            disSetter.accept(this.dis);
        }

        return this;
    }

    /**
     * Get dis
     * @return dis
     */
    public TaskOutputDis getDis() {
        return dis;
    }

    public void setDis(TaskOutputDis dis) {
        this.dis = dis;
    }

    public TaskOutput withWebhook(TaskOutputWebhook webhook) {
        this.webhook = webhook;
        return this;
    }

    public TaskOutput withWebhook(Consumer<TaskOutputWebhook> webhookSetter) {
        if (this.webhook == null) {
            this.webhook = new TaskOutputWebhook();
            webhookSetter.accept(this.webhook);
        }

        return this;
    }

    /**
     * Get webhook
     * @return webhook
     */
    public TaskOutputWebhook getWebhook() {
        return webhook;
    }

    public void setWebhook(TaskOutputWebhook webhook) {
        this.webhook = webhook;
    }

    public TaskOutput withLocalpath(TaskOutputLocalpath localpath) {
        this.localpath = localpath;
        return this;
    }

    public TaskOutput withLocalpath(Consumer<TaskOutputLocalpath> localpathSetter) {
        if (this.localpath == null) {
            this.localpath = new TaskOutputLocalpath();
            localpathSetter.accept(this.localpath);
        }

        return this;
    }

    /**
     * Get localpath
     * @return localpath
     */
    public TaskOutputLocalpath getLocalpath() {
        return localpath;
    }

    public void setLocalpath(TaskOutputLocalpath localpath) {
        this.localpath = localpath;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskOutput taskOutput = (TaskOutput) o;
        return Objects.equals(this.obs, taskOutput.obs) && Objects.equals(this.dis, taskOutput.dis)
            && Objects.equals(this.webhook, taskOutput.webhook) && Objects.equals(this.localpath, taskOutput.localpath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obs, dis, webhook, localpath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskOutput {\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
        sb.append("    dis: ").append(toIndentedString(dis)).append("\n");
        sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
        sb.append("    localpath: ").append(toIndentedString(localpath)).append("\n");
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
