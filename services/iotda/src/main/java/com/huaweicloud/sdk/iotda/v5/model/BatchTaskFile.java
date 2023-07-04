package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询上传的批量任务文件结构体。
 */
public class BatchTaskFile {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id")

    private String fileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_time")

    private String uploadTime;

    public BatchTaskFile withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * 上传的批量任务文件ID，由平台自动生成。
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public BatchTaskFile withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 上传的批量任务文件名称。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public BatchTaskFile withUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
        return this;
    }

    /**
     * 在物联网平台上传文件的时间。格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
     * @return uploadTime
     */
    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchTaskFile batchTaskFile = (BatchTaskFile) o;
        return Objects.equals(this.fileId, batchTaskFile.fileId)
            && Objects.equals(this.fileName, batchTaskFile.fileName)
            && Objects.equals(this.uploadTime, batchTaskFile.uploadTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId, fileName, uploadTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchTaskFile {\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    uploadTime: ").append(toIndentedString(uploadTime)).append("\n");
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
