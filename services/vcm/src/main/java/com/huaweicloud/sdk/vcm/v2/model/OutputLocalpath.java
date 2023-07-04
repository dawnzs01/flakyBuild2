package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LOCALPATH输出类型。
 */
public class OutputLocalpath {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_source_path")

    private String mountSourcePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_category")

    private String dataCategory;

    public OutputLocalpath withMountSourcePath(String mountSourcePath) {
        this.mountSourcePath = mountSourcePath;
        return this;
    }

    /**
     * 挂载源路径，存放作业运行结果的路径，必须为linux路径，且最大长度为255，例如“/home”。
     * @return mountSourcePath
     */
    public String getMountSourcePath() {
        return mountSourcePath;
    }

    public void setMountSourcePath(String mountSourcePath) {
        this.mountSourcePath = mountSourcePath;
    }

    public OutputLocalpath withDataCategory(String dataCategory) {
        this.dataCategory = dataCategory;
        return this;
    }

    /**
     * 作业输出数据类别的列表，默认值为[]。有这个列表时，表示希望这个输出结果中存放dataCategory列表内的数据。 取值范围为[FaceImage,OriginImage]。 - FaceImage：表示发送人脸图。 - OriginImage：表示发送原始图。
     * @return dataCategory
     */
    public String getDataCategory() {
        return dataCategory;
    }

    public void setDataCategory(String dataCategory) {
        this.dataCategory = dataCategory;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OutputLocalpath outputLocalpath = (OutputLocalpath) o;
        return Objects.equals(this.mountSourcePath, outputLocalpath.mountSourcePath)
            && Objects.equals(this.dataCategory, outputLocalpath.dataCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mountSourcePath, dataCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputLocalpath {\n");
        sb.append("    mountSourcePath: ").append(toIndentedString(mountSourcePath)).append("\n");
        sb.append("    dataCategory: ").append(toIndentedString(dataCategory)).append("\n");
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
