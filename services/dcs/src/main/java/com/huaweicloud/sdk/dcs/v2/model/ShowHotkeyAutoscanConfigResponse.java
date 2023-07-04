package com.huaweicloud.sdk.dcs.v2.model;

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
public class ShowHotkeyAutoscanConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_auto_scan")

    private Boolean enableAutoScan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_at")

    private List<String> scheduleAt = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public ShowHotkeyAutoscanConfigResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowHotkeyAutoscanConfigResponse withEnableAutoScan(Boolean enableAutoScan) {
        this.enableAutoScan = enableAutoScan;
        return this;
    }

    /**
     * 是否开启自动分析
     * @return enableAutoScan
     */
    public Boolean getEnableAutoScan() {
        return enableAutoScan;
    }

    public void setEnableAutoScan(Boolean enableAutoScan) {
        this.enableAutoScan = enableAutoScan;
    }

    public ShowHotkeyAutoscanConfigResponse withScheduleAt(List<String> scheduleAt) {
        this.scheduleAt = scheduleAt;
        return this;
    }

    public ShowHotkeyAutoscanConfigResponse addScheduleAtItem(String scheduleAtItem) {
        if (this.scheduleAt == null) {
            this.scheduleAt = new ArrayList<>();
        }
        this.scheduleAt.add(scheduleAtItem);
        return this;
    }

    public ShowHotkeyAutoscanConfigResponse withScheduleAt(Consumer<List<String>> scheduleAtSetter) {
        if (this.scheduleAt == null) {
            this.scheduleAt = new ArrayList<>();
        }
        scheduleAtSetter.accept(this.scheduleAt);
        return this;
    }

    /**
     * 每日分析时间，时间格式为21:00
     * @return scheduleAt
     */
    public List<String> getScheduleAt() {
        return scheduleAt;
    }

    public void setScheduleAt(List<String> scheduleAt) {
        this.scheduleAt = scheduleAt;
    }

    public ShowHotkeyAutoscanConfigResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 配置更新时间，时间格式为2020-06-15T02:21:18.669Z
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowHotkeyAutoscanConfigResponse showHotkeyAutoscanConfigResponse = (ShowHotkeyAutoscanConfigResponse) o;
        return Objects.equals(this.instanceId, showHotkeyAutoscanConfigResponse.instanceId)
            && Objects.equals(this.enableAutoScan, showHotkeyAutoscanConfigResponse.enableAutoScan)
            && Objects.equals(this.scheduleAt, showHotkeyAutoscanConfigResponse.scheduleAt)
            && Objects.equals(this.updatedAt, showHotkeyAutoscanConfigResponse.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, enableAutoScan, scheduleAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHotkeyAutoscanConfigResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    enableAutoScan: ").append(toIndentedString(enableAutoScan)).append("\n");
        sb.append("    scheduleAt: ").append(toIndentedString(scheduleAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
