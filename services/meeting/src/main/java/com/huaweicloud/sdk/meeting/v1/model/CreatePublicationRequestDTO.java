package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 发布信息。
 */
public class CreatePublicationRequestDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publishName")

    private String publishName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptList")

    private List<String> deptList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deviceList")

    private List<String> deviceList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "programList")

    private List<String> programList = null;

    public CreatePublicationRequestDTO withPublishName(String publishName) {
        this.publishName = publishName;
        return this;
    }

    /**
     * 发布名称。
     * @return publishName
     */
    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    public CreatePublicationRequestDTO withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public CreatePublicationRequestDTO withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public CreatePublicationRequestDTO withDeptList(List<String> deptList) {
        this.deptList = deptList;
        return this;
    }

    public CreatePublicationRequestDTO addDeptListItem(String deptListItem) {
        if (this.deptList == null) {
            this.deptList = new ArrayList<>();
        }
        this.deptList.add(deptListItem);
        return this;
    }

    public CreatePublicationRequestDTO withDeptList(Consumer<List<String>> deptListSetter) {
        if (this.deptList == null) {
            this.deptList = new ArrayList<>();
        }
        deptListSetter.accept(this.deptList);
        return this;
    }

    /**
     * 发布到部门编码列表。
     * @return deptList
     */
    public List<String> getDeptList() {
        return deptList;
    }

    public void setDeptList(List<String> deptList) {
        this.deptList = deptList;
    }

    public CreatePublicationRequestDTO withDeviceList(List<String> deviceList) {
        this.deviceList = deviceList;
        return this;
    }

    public CreatePublicationRequestDTO addDeviceListItem(String deviceListItem) {
        if (this.deviceList == null) {
            this.deviceList = new ArrayList<>();
        }
        this.deviceList.add(deviceListItem);
        return this;
    }

    public CreatePublicationRequestDTO withDeviceList(Consumer<List<String>> deviceListSetter) {
        if (this.deviceList == null) {
            this.deviceList = new ArrayList<>();
        }
        deviceListSetter.accept(this.deviceList);
        return this;
    }

    /**
     * 发布到设备用户ID列表。
     * @return deviceList
     */
    public List<String> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(List<String> deviceList) {
        this.deviceList = deviceList;
    }

    public CreatePublicationRequestDTO withProgramList(List<String> programList) {
        this.programList = programList;
        return this;
    }

    public CreatePublicationRequestDTO addProgramListItem(String programListItem) {
        if (this.programList == null) {
            this.programList = new ArrayList<>();
        }
        this.programList.add(programListItem);
        return this;
    }

    public CreatePublicationRequestDTO withProgramList(Consumer<List<String>> programListSetter) {
        if (this.programList == null) {
            this.programList = new ArrayList<>();
        }
        programListSetter.accept(this.programList);
        return this;
    }

    /**
     * 发布节目ID列表。
     * @return programList
     */
    public List<String> getProgramList() {
        return programList;
    }

    public void setProgramList(List<String> programList) {
        this.programList = programList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePublicationRequestDTO createPublicationRequestDTO = (CreatePublicationRequestDTO) o;
        return Objects.equals(this.publishName, createPublicationRequestDTO.publishName)
            && Objects.equals(this.startTime, createPublicationRequestDTO.startTime)
            && Objects.equals(this.endTime, createPublicationRequestDTO.endTime)
            && Objects.equals(this.deptList, createPublicationRequestDTO.deptList)
            && Objects.equals(this.deviceList, createPublicationRequestDTO.deviceList)
            && Objects.equals(this.programList, createPublicationRequestDTO.programList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishName, startTime, endTime, deptList, deviceList, programList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePublicationRequestDTO {\n");
        sb.append("    publishName: ").append(toIndentedString(publishName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    deptList: ").append(toIndentedString(deptList)).append("\n");
        sb.append("    deviceList: ").append(toIndentedString(deviceList)).append("\n");
        sb.append("    programList: ").append(toIndentedString(programList)).append("\n");
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
