package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowAlertRspProcess
 */
public class ShowAlertRspProcess {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_name")

    private String processName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_path")

    private String processPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_pid")

    private String processPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_uid")

    private String processUid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_cmdline")

    private String processCmdline;

    public ShowAlertRspProcess withProcessName(String processName) {
        this.processName = processName;
        return this;
    }

    /**
     * The name, display only
     * @return processName
     */
    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public ShowAlertRspProcess withProcessPath(String processPath) {
        this.processPath = processPath;
        return this;
    }

    /**
     * The name, display only
     * @return processPath
     */
    public String getProcessPath() {
        return processPath;
    }

    public void setProcessPath(String processPath) {
        this.processPath = processPath;
    }

    public ShowAlertRspProcess withProcessPid(String processPid) {
        this.processPid = processPid;
        return this;
    }

    /**
     * Id value
     * @return processPid
     */
    public String getProcessPid() {
        return processPid;
    }

    public void setProcessPid(String processPid) {
        this.processPid = processPid;
    }

    public ShowAlertRspProcess withProcessUid(String processUid) {
        this.processUid = processUid;
        return this;
    }

    /**
     * Id value
     * @return processUid
     */
    public String getProcessUid() {
        return processUid;
    }

    public void setProcessUid(String processUid) {
        this.processUid = processUid;
    }

    public ShowAlertRspProcess withProcessCmdline(String processCmdline) {
        this.processCmdline = processCmdline;
        return this;
    }

    /**
     * The name, display only
     * @return processCmdline
     */
    public String getProcessCmdline() {
        return processCmdline;
    }

    public void setProcessCmdline(String processCmdline) {
        this.processCmdline = processCmdline;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAlertRspProcess showAlertRspProcess = (ShowAlertRspProcess) o;
        return Objects.equals(this.processName, showAlertRspProcess.processName)
            && Objects.equals(this.processPath, showAlertRspProcess.processPath)
            && Objects.equals(this.processPid, showAlertRspProcess.processPid)
            && Objects.equals(this.processUid, showAlertRspProcess.processUid)
            && Objects.equals(this.processCmdline, showAlertRspProcess.processCmdline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processName, processPath, processPid, processUid, processCmdline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAlertRspProcess {\n");
        sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
        sb.append("    processPath: ").append(toIndentedString(processPath)).append("\n");
        sb.append("    processPid: ").append(toIndentedString(processPid)).append("\n");
        sb.append("    processUid: ").append(toIndentedString(processUid)).append("\n");
        sb.append("    processCmdline: ").append(toIndentedString(processCmdline)).append("\n");
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
