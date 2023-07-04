package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeviceInfoSimple
 */
public class DeviceInfoSimple {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_name")

    private String deviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private Long deviceId;

    public DeviceInfoSimple withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 设备ID
     * minimum: 1
     * maximum: 999999999999999999
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DeviceInfoSimple withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * 设备名称
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public DeviceInfoSimple withDeviceId(Long deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 设备ID（兼容20.0）
     * minimum: 1
     * maximum: 99999999999999999
     * @return deviceId
     */
    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceInfoSimple deviceInfoSimple = (DeviceInfoSimple) o;
        return Objects.equals(this.id, deviceInfoSimple.id)
            && Objects.equals(this.deviceName, deviceInfoSimple.deviceName)
            && Objects.equals(this.deviceId, deviceInfoSimple.deviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deviceName, deviceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceInfoSimple {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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
