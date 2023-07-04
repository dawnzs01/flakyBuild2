package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量停止数据迁移任务结构体
 */
public class BatchStopMigrationTasksBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_tasks")

    private List<String> migrationTasks = null;

    public BatchStopMigrationTasksBody withMigrationTasks(List<String> migrationTasks) {
        this.migrationTasks = migrationTasks;
        return this;
    }

    public BatchStopMigrationTasksBody addMigrationTasksItem(String migrationTasksItem) {
        if (this.migrationTasks == null) {
            this.migrationTasks = new ArrayList<>();
        }
        this.migrationTasks.add(migrationTasksItem);
        return this;
    }

    public BatchStopMigrationTasksBody withMigrationTasks(Consumer<List<String>> migrationTasksSetter) {
        if (this.migrationTasks == null) {
            this.migrationTasks = new ArrayList<>();
        }
        migrationTasksSetter.accept(this.migrationTasks);
        return this;
    }

    /**
     * 数据迁移任务列表。
     * @return migrationTasks
     */
    public List<String> getMigrationTasks() {
        return migrationTasks;
    }

    public void setMigrationTasks(List<String> migrationTasks) {
        this.migrationTasks = migrationTasks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchStopMigrationTasksBody batchStopMigrationTasksBody = (BatchStopMigrationTasksBody) o;
        return Objects.equals(this.migrationTasks, batchStopMigrationTasksBody.migrationTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrationTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStopMigrationTasksBody {\n");
        sb.append("    migrationTasks: ").append(toIndentedString(migrationTasks)).append("\n");
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
