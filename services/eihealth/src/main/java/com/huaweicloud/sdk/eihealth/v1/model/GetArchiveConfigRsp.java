package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GetArchiveConfigRsp
 */
public class GetArchiveConfigRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_region")

    private Boolean currentRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    public GetArchiveConfigRsp withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 华为云项目
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public GetArchiveConfigRsp withCurrentRegion(Boolean currentRegion) {
        this.currentRegion = currentRegion;
        return this;
    }

    /**
     * 该区域是否是当前设置的归档区域
     * @return currentRegion
     */
    public Boolean getCurrentRegion() {
        return currentRegion;
    }

    public void setCurrentRegion(Boolean currentRegion) {
        this.currentRegion = currentRegion;
    }

    public GetArchiveConfigRsp withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 归档桶名称
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetArchiveConfigRsp getArchiveConfigRsp = (GetArchiveConfigRsp) o;
        return Objects.equals(this.regionId, getArchiveConfigRsp.regionId)
            && Objects.equals(this.currentRegion, getArchiveConfigRsp.currentRegion)
            && Objects.equals(this.bucketName, getArchiveConfigRsp.bucketName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, currentRegion, bucketName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetArchiveConfigRsp {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    currentRegion: ").append(toIndentedString(currentRegion)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
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
