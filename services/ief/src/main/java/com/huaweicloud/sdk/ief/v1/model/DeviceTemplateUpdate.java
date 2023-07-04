package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设备模板
 */
public class DeviceTemplateUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_template")

    private DeviceTemplateUpdateDetail deviceTemplate;

    public DeviceTemplateUpdate withDeviceTemplate(DeviceTemplateUpdateDetail deviceTemplate) {
        this.deviceTemplate = deviceTemplate;
        return this;
    }

    public DeviceTemplateUpdate withDeviceTemplate(Consumer<DeviceTemplateUpdateDetail> deviceTemplateSetter) {
        if (this.deviceTemplate == null) {
            this.deviceTemplate = new DeviceTemplateUpdateDetail();
            deviceTemplateSetter.accept(this.deviceTemplate);
        }

        return this;
    }

    /**
     * Get deviceTemplate
     * @return deviceTemplate
     */
    public DeviceTemplateUpdateDetail getDeviceTemplate() {
        return deviceTemplate;
    }

    public void setDeviceTemplate(DeviceTemplateUpdateDetail deviceTemplate) {
        this.deviceTemplate = deviceTemplate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceTemplateUpdate deviceTemplateUpdate = (DeviceTemplateUpdate) o;
        return Objects.equals(this.deviceTemplate, deviceTemplateUpdate.deviceTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceTemplateUpdate {\n");
        sb.append("    deviceTemplate: ").append(toIndentedString(deviceTemplate)).append("\n");
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
