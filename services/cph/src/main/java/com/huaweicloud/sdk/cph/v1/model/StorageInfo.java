package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 待导出数据的云手机信息。
 */
public class StorageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_id")

    private String phoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_files")

    private List<String> includeFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_files")

    private List<String> excludeFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_path")

    private String objectPath;

    public StorageInfo withPhoneId(String phoneId) {
        this.phoneId = phoneId;
        return this;
    }

    /**
     * 云手机ID
     * @return phoneId
     */
    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public StorageInfo withIncludeFiles(List<String> includeFiles) {
        this.includeFiles = includeFiles;
        return this;
    }

    public StorageInfo addIncludeFilesItem(String includeFilesItem) {
        if (this.includeFiles == null) {
            this.includeFiles = new ArrayList<>();
        }
        this.includeFiles.add(includeFilesItem);
        return this;
    }

    public StorageInfo withIncludeFiles(Consumer<List<String>> includeFilesSetter) {
        if (this.includeFiles == null) {
            this.includeFiles = new ArrayList<>();
        }
        includeFilesSetter.accept(this.includeFiles);
        return this;
    }

    /**
     * 需要导出数据的存储路径 绝对路径，最大长度4096字节；目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、空格这些字符
     * @return includeFiles
     */
    public List<String> getIncludeFiles() {
        return includeFiles;
    }

    public void setIncludeFiles(List<String> includeFiles) {
        this.includeFiles = includeFiles;
    }

    public StorageInfo withExcludeFiles(List<String> excludeFiles) {
        this.excludeFiles = excludeFiles;
        return this;
    }

    public StorageInfo addExcludeFilesItem(String excludeFilesItem) {
        if (this.excludeFiles == null) {
            this.excludeFiles = new ArrayList<>();
        }
        this.excludeFiles.add(excludeFilesItem);
        return this;
    }

    public StorageInfo withExcludeFiles(Consumer<List<String>> excludeFilesSetter) {
        if (this.excludeFiles == null) {
            this.excludeFiles = new ArrayList<>();
        }
        excludeFilesSetter.accept(this.excludeFiles);
        return this;
    }

    /**
     * 不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files
     * @return excludeFiles
     */
    public List<String> getExcludeFiles() {
        return excludeFiles;
    }

    public void setExcludeFiles(List<String> excludeFiles) {
        this.excludeFiles = excludeFiles;
    }

    public StorageInfo withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public StorageInfo withObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }

    /**
     * 导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符
     * @return objectPath
     */
    public String getObjectPath() {
        return objectPath;
    }

    public void setObjectPath(String objectPath) {
        this.objectPath = objectPath;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageInfo storageInfo = (StorageInfo) o;
        return Objects.equals(this.phoneId, storageInfo.phoneId)
            && Objects.equals(this.includeFiles, storageInfo.includeFiles)
            && Objects.equals(this.excludeFiles, storageInfo.excludeFiles)
            && Objects.equals(this.bucketName, storageInfo.bucketName)
            && Objects.equals(this.objectPath, storageInfo.objectPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneId, includeFiles, excludeFiles, bucketName, objectPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageInfo {\n");
        sb.append("    phoneId: ").append(toIndentedString(phoneId)).append("\n");
        sb.append("    includeFiles: ").append(toIndentedString(includeFiles)).append("\n");
        sb.append("    excludeFiles: ").append(toIndentedString(excludeFiles)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    objectPath: ").append(toIndentedString(objectPath)).append("\n");
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
