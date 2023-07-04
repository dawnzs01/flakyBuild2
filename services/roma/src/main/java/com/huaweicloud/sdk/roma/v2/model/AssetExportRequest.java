package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AssetExportRequest
 */
public class AssetExportRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apps")

    private List<AssetExportRequestApps> apps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<AssetExportRequestTasks> tasks = null;

    public AssetExportRequest withApps(List<AssetExportRequestApps> apps) {
        this.apps = apps;
        return this;
    }

    public AssetExportRequest addAppsItem(AssetExportRequestApps appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    public AssetExportRequest withApps(Consumer<List<AssetExportRequestApps>> appsSetter) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        appsSetter.accept(this.apps);
        return this;
    }

    /**
     * 应用列表
     * @return apps
     */
    public List<AssetExportRequestApps> getApps() {
        return apps;
    }

    public void setApps(List<AssetExportRequestApps> apps) {
        this.apps = apps;
    }

    public AssetExportRequest withTasks(List<AssetExportRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }

    public AssetExportRequest addTasksItem(AssetExportRequestTasks tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public AssetExportRequest withTasks(Consumer<List<AssetExportRequestTasks>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 任务列表
     * @return tasks
     */
    public List<AssetExportRequestTasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<AssetExportRequestTasks> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssetExportRequest assetExportRequest = (AssetExportRequest) o;
        return Objects.equals(this.apps, assetExportRequest.apps)
            && Objects.equals(this.tasks, assetExportRequest.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apps, tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetExportRequest {\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
