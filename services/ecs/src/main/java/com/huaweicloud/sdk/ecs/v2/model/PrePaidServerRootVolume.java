package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PrePaidServerRootVolume {

    /**
     * 云服务器系统盘对应的磁盘类型，需要与系统所提供的磁盘类型相匹配。  - SATA：普通IO磁盘类型。 - SAS：高IO磁盘类型。 - SSD：超高IO磁盘类型。 - co-p1：高IO (性能优化Ⅰ型) - uh-l1：超高IO (时延优化)  > 说明： >  > 对于HANA云服务器、HL1型云服务器、HL2型云服务器，需使用co-p1和uh-l1两种磁盘类型。对于其他类型的云服务器，不能使用co-p1和uh-l1两种磁盘类型。
     */
    public static final class VolumetypeEnum {

        /**
         * Enum SATA for value: "SATA"
         */
        public static final VolumetypeEnum SATA = new VolumetypeEnum("SATA");

        /**
         * Enum SAS for value: "SAS"
         */
        public static final VolumetypeEnum SAS = new VolumetypeEnum("SAS");

        /**
         * Enum SSD for value: "SSD"
         */
        public static final VolumetypeEnum SSD = new VolumetypeEnum("SSD");

        /**
         * Enum GPSSD for value: "GPSSD"
         */
        public static final VolumetypeEnum GPSSD = new VolumetypeEnum("GPSSD");

        /**
         * Enum CO_P1 for value: "co-p1"
         */
        public static final VolumetypeEnum CO_P1 = new VolumetypeEnum("co-p1");

        /**
         * Enum UH_L1 for value: "uh-l1"
         */
        public static final VolumetypeEnum UH_L1 = new VolumetypeEnum("uh-l1");

        /**
         * Enum ESSD for value: "ESSD"
         */
        public static final VolumetypeEnum ESSD = new VolumetypeEnum("ESSD");

        private static final Map<String, VolumetypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VolumetypeEnum> createStaticFields() {
            Map<String, VolumetypeEnum> map = new HashMap<>();
            map.put("SATA", SATA);
            map.put("SAS", SAS);
            map.put("SSD", SSD);
            map.put("GPSSD", GPSSD);
            map.put("co-p1", CO_P1);
            map.put("uh-l1", UH_L1);
            map.put("ESSD", ESSD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VolumetypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VolumetypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            VolumetypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VolumetypeEnum(value);
            }
            return result;
        }

        public static VolumetypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VolumetypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VolumetypeEnum) {
                return this.value.equals(((VolumetypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumetype")

    private VolumetypeEnum volumetype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendparam")

    private PrePaidServerRootVolumeExtendParam extendparam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private PrePaidServerRootVolumeMetadata metadata;

    /**
     * 云服务器系统盘对应的磁盘存储类型。 磁盘存储类型枚举值： DSS：专属存储类型
     */
    public static final class ClusterTypeEnum {

        /**
         * Enum DSS for value: "DSS"
         */
        public static final ClusterTypeEnum DSS = new ClusterTypeEnum("DSS");

        private static final Map<String, ClusterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClusterTypeEnum> createStaticFields() {
            Map<String, ClusterTypeEnum> map = new HashMap<>();
            map.put("DSS", DSS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClusterTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ClusterTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ClusterTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ClusterTypeEnum(value);
            }
            return result;
        }

        public static ClusterTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ClusterTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClusterTypeEnum) {
                return this.value.equals(((ClusterTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private ClusterTypeEnum clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hw:passthrough")

    private Boolean hwPassthrough;

    public PrePaidServerRootVolume withVolumetype(VolumetypeEnum volumetype) {
        this.volumetype = volumetype;
        return this;
    }

    /**
     * 云服务器系统盘对应的磁盘类型，需要与系统所提供的磁盘类型相匹配。  - SATA：普通IO磁盘类型。 - SAS：高IO磁盘类型。 - SSD：超高IO磁盘类型。 - co-p1：高IO (性能优化Ⅰ型) - uh-l1：超高IO (时延优化)  > 说明： >  > 对于HANA云服务器、HL1型云服务器、HL2型云服务器，需使用co-p1和uh-l1两种磁盘类型。对于其他类型的云服务器，不能使用co-p1和uh-l1两种磁盘类型。
     * @return volumetype
     */
    public VolumetypeEnum getVolumetype() {
        return volumetype;
    }

    public void setVolumetype(VolumetypeEnum volumetype) {
        this.volumetype = volumetype;
    }

    public PrePaidServerRootVolume withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 系统盘大小，容量单位为GB， 输入大小范围为[1,1024]。  约束：  - 系统盘大小取值应不小于镜像支持的系统盘的最小值(镜像的min_disk属性)。 - 若该参数没有指定或者指定为0时，系统盘大小默认取值为镜像中系统盘的最小值(镜像的min_disk属性)。  > 说明：  > 镜像系统盘的最小值(镜像的min_disk属性)可在控制台中点击镜像详情查看。或通过调用“查询镜像详情（OpenStack原生）”API获取，详细操作请参考[《镜像服务API参考》](https://support.huaweicloud.com/api-ims/ims_03_0702.html)中“查询镜像详情（OpenStack原生）”章节。
     * minimum: 1
     * maximum: 1024
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public PrePaidServerRootVolume withExtendparam(PrePaidServerRootVolumeExtendParam extendparam) {
        this.extendparam = extendparam;
        return this;
    }

    public PrePaidServerRootVolume withExtendparam(Consumer<PrePaidServerRootVolumeExtendParam> extendparamSetter) {
        if (this.extendparam == null) {
            this.extendparam = new PrePaidServerRootVolumeExtendParam();
            extendparamSetter.accept(this.extendparam);
        }

        return this;
    }

    /**
     * Get extendparam
     * @return extendparam
     */
    public PrePaidServerRootVolumeExtendParam getExtendparam() {
        return extendparam;
    }

    public void setExtendparam(PrePaidServerRootVolumeExtendParam extendparam) {
        this.extendparam = extendparam;
    }

    public PrePaidServerRootVolume withMetadata(PrePaidServerRootVolumeMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public PrePaidServerRootVolume withMetadata(Consumer<PrePaidServerRootVolumeMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new PrePaidServerRootVolumeMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public PrePaidServerRootVolumeMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(PrePaidServerRootVolumeMetadata metadata) {
        this.metadata = metadata;
    }

    public PrePaidServerRootVolume withClusterType(ClusterTypeEnum clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 云服务器系统盘对应的磁盘存储类型。 磁盘存储类型枚举值： DSS：专属存储类型
     * @return clusterType
     */
    public ClusterTypeEnum getClusterType() {
        return clusterType;
    }

    public void setClusterType(ClusterTypeEnum clusterType) {
        this.clusterType = clusterType;
    }

    public PrePaidServerRootVolume withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 云服务器数据盘对应的存储池的ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public PrePaidServerRootVolume withHwPassthrough(Boolean hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
        return this;
    }

    /**
     * 使用SDI规格创建虚拟机时请关注该参数，如果该参数值为true，说明创建的为scsi类型的卷  > 说明： >  > 此参数为boolean类型，若传入非boolean类型字符，程序将按照false方式处理。
     * @return hwPassthrough
     */
    public Boolean getHwPassthrough() {
        return hwPassthrough;
    }

    public void setHwPassthrough(Boolean hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrePaidServerRootVolume prePaidServerRootVolume = (PrePaidServerRootVolume) o;
        return Objects.equals(this.volumetype, prePaidServerRootVolume.volumetype)
            && Objects.equals(this.size, prePaidServerRootVolume.size)
            && Objects.equals(this.extendparam, prePaidServerRootVolume.extendparam)
            && Objects.equals(this.metadata, prePaidServerRootVolume.metadata)
            && Objects.equals(this.clusterType, prePaidServerRootVolume.clusterType)
            && Objects.equals(this.clusterId, prePaidServerRootVolume.clusterId)
            && Objects.equals(this.hwPassthrough, prePaidServerRootVolume.hwPassthrough);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumetype, size, extendparam, metadata, clusterType, clusterId, hwPassthrough);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrePaidServerRootVolume {\n");
        sb.append("    volumetype: ").append(toIndentedString(volumetype)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    extendparam: ").append(toIndentedString(extendparam)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    hwPassthrough: ").append(toIndentedString(hwPassthrough)).append("\n");
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
