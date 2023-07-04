package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 磁盘模板
 */
public class TemplateDisk {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private Integer index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disktype")

    private String disktype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_use")

    private String deviceUse;

    public TemplateDisk withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 磁盘ID
     * minimum: 0
     * maximum: 9223372036854775807
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TemplateDisk withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 磁盘序号，从0开始
     * minimum: 0
     * maximum: 2147483647
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public TemplateDisk withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 磁盘名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TemplateDisk withDisktype(String disktype) {
        this.disktype = disktype;
        return this;
    }

    /**
     * 磁盘类型，同volumetype字段
     * @return disktype
     */
    public String getDisktype() {
        return disktype;
    }

    public void setDisktype(String disktype) {
        this.disktype = disktype;
    }

    public TemplateDisk withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 磁盘大小，单位：GB
     * minimum: 0
     * maximum: 9223372036854775807
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public TemplateDisk withDeviceUse(String deviceUse) {
        this.deviceUse = deviceUse;
        return this;
    }

    /**
     * 磁盘使用
     * @return deviceUse
     */
    public String getDeviceUse() {
        return deviceUse;
    }

    public void setDeviceUse(String deviceUse) {
        this.deviceUse = deviceUse;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateDisk templateDisk = (TemplateDisk) o;
        return Objects.equals(this.id, templateDisk.id) && Objects.equals(this.index, templateDisk.index)
            && Objects.equals(this.name, templateDisk.name) && Objects.equals(this.disktype, templateDisk.disktype)
            && Objects.equals(this.size, templateDisk.size) && Objects.equals(this.deviceUse, templateDisk.deviceUse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, index, name, disktype, size, deviceUse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateDisk {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    disktype: ").append(toIndentedString(disktype)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    deviceUse: ").append(toIndentedString(deviceUse)).append("\n");
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
