package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 自动创建虚拟机模板
 */
public class TemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_template")

    private Boolean isTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectid")

    private String projectid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_server_name")

    private String targetServerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    /**
     * 磁盘类型 SAS:串行连接SCSI SSD:固态硬盘 SATA:串口硬盘 
     */
    public static final class VolumetypeEnum {

        /**
         * Enum SAS for value: "SAS"
         */
        public static final VolumetypeEnum SAS = new VolumetypeEnum("SAS");

        /**
         * Enum SSD for value: "SSD"
         */
        public static final VolumetypeEnum SSD = new VolumetypeEnum("SSD");

        /**
         * Enum SATA for value: "SATA"
         */
        public static final VolumetypeEnum SATA = new VolumetypeEnum("SATA");

        private static final Map<String, VolumetypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VolumetypeEnum> createStaticFields() {
            Map<String, VolumetypeEnum> map = new HashMap<>();
            map.put("SAS", SAS);
            map.put("SSD", SSD);
            map.put("SATA", SATA);
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
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private VpcObject vpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<Nics> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SgObject> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private PublicIp publicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk")

    private List<TemplateDisk> disk = null;

    /**
    * 数据盘磁盘类型 SAS:串行连接SCSI SSD:固态硬盘 SATA:串口硬盘 
    */
    public static final class DataVolumeTypeEnum {

        /**
         * Enum SAS for value: "SAS"
         */
        public static final DataVolumeTypeEnum SAS = new DataVolumeTypeEnum("SAS");

        /**
         * Enum SSD for value: "SSD"
         */
        public static final DataVolumeTypeEnum SSD = new DataVolumeTypeEnum("SSD");

        /**
         * Enum SATA for value: "SATA"
         */
        public static final DataVolumeTypeEnum SATA = new DataVolumeTypeEnum("SATA");

        private static final Map<String, DataVolumeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DataVolumeTypeEnum> createStaticFields() {
            Map<String, DataVolumeTypeEnum> map = new HashMap<>();
            map.put("SAS", SAS);
            map.put("SSD", SSD);
            map.put("SATA", SATA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DataVolumeTypeEnum(String value) {
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
        public static DataVolumeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DataVolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DataVolumeTypeEnum(value);
            }
            return result;
        }

        public static DataVolumeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DataVolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DataVolumeTypeEnum) {
                return this.value.equals(((DataVolumeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volume_type")

    private DataVolumeTypeEnum dataVolumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_password")

    private String targetPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    public TemplateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TemplateRequest withIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
        return this;
    }

    /**
     * 是否是通用模板，如果模板关联一个任务，则不算通用模板
     * @return isTemplate
     */
    public Boolean getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    public TemplateRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Region信息
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public TemplateRequest withProjectid(String projectid) {
        this.projectid = projectid;
        return this;
    }

    /**
     * 项目ID
     * @return projectid
     */
    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public TemplateRequest withTargetServerName(String targetServerName) {
        this.targetServerName = targetServerName;
        return this;
    }

    /**
     * 目标端服务器名称
     * @return targetServerName
     */
    public String getTargetServerName() {
        return targetServerName;
    }

    public void setTargetServerName(String targetServerName) {
        this.targetServerName = targetServerName;
    }

    public TemplateRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public TemplateRequest withVolumetype(VolumetypeEnum volumetype) {
        this.volumetype = volumetype;
        return this;
    }

    /**
     * 磁盘类型 SAS:串行连接SCSI SSD:固态硬盘 SATA:串口硬盘 
     * @return volumetype
     */
    public VolumetypeEnum getVolumetype() {
        return volumetype;
    }

    public void setVolumetype(VolumetypeEnum volumetype) {
        this.volumetype = volumetype;
    }

    public TemplateRequest withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 虚拟机规格
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public TemplateRequest withVpc(VpcObject vpc) {
        this.vpc = vpc;
        return this;
    }

    public TemplateRequest withVpc(Consumer<VpcObject> vpcSetter) {
        if (this.vpc == null) {
            this.vpc = new VpcObject();
            vpcSetter.accept(this.vpc);
        }

        return this;
    }

    /**
     * Get vpc
     * @return vpc
     */
    public VpcObject getVpc() {
        return vpc;
    }

    public void setVpc(VpcObject vpc) {
        this.vpc = vpc;
    }

    public TemplateRequest withNics(List<Nics> nics) {
        this.nics = nics;
        return this;
    }

    public TemplateRequest addNicsItem(Nics nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public TemplateRequest withNics(Consumer<List<Nics>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 网卡信息，支持多个网卡，如果是自动创建，只填一个，ID使用“autoCreate”
     * @return nics
     */
    public List<Nics> getNics() {
        return nics;
    }

    public void setNics(List<Nics> nics) {
        this.nics = nics;
    }

    public TemplateRequest withSecurityGroups(List<SgObject> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public TemplateRequest addSecurityGroupsItem(SgObject securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public TemplateRequest withSecurityGroups(Consumer<List<SgObject>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 安全组，支持多个安全组，如果是自动创建，只填一个，ID使用“autoCreate”
     * @return securityGroups
     */
    public List<SgObject> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SgObject> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public TemplateRequest withPublicip(PublicIp publicip) {
        this.publicip = publicip;
        return this;
    }

    public TemplateRequest withPublicip(Consumer<PublicIp> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new PublicIp();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    /**
     * Get publicip
     * @return publicip
     */
    public PublicIp getPublicip() {
        return publicip;
    }

    public void setPublicip(PublicIp publicip) {
        this.publicip = publicip;
    }

    public TemplateRequest withDisk(List<TemplateDisk> disk) {
        this.disk = disk;
        return this;
    }

    public TemplateRequest addDiskItem(TemplateDisk diskItem) {
        if (this.disk == null) {
            this.disk = new ArrayList<>();
        }
        this.disk.add(diskItem);
        return this;
    }

    public TemplateRequest withDisk(Consumer<List<TemplateDisk>> diskSetter) {
        if (this.disk == null) {
            this.disk = new ArrayList<>();
        }
        diskSetter.accept(this.disk);
        return this;
    }

    /**
     * 磁盘信息
     * @return disk
     */
    public List<TemplateDisk> getDisk() {
        return disk;
    }

    public void setDisk(List<TemplateDisk> disk) {
        this.disk = disk;
    }

    public TemplateRequest withDataVolumeType(DataVolumeTypeEnum dataVolumeType) {
        this.dataVolumeType = dataVolumeType;
        return this;
    }

    /**
     * 数据盘磁盘类型 SAS:串行连接SCSI SSD:固态硬盘 SATA:串口硬盘 
     * @return dataVolumeType
     */
    public DataVolumeTypeEnum getDataVolumeType() {
        return dataVolumeType;
    }

    public void setDataVolumeType(DataVolumeTypeEnum dataVolumeType) {
        this.dataVolumeType = dataVolumeType;
    }

    public TemplateRequest withTargetPassword(String targetPassword) {
        this.targetPassword = targetPassword;
        return this;
    }

    /**
     * 目的端密码
     * @return targetPassword
     */
    public String getTargetPassword() {
        return targetPassword;
    }

    public void setTargetPassword(String targetPassword) {
        this.targetPassword = targetPassword;
    }

    public TemplateRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 新建目的虚拟机用户选择的镜像版本Id值
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateRequest templateRequest = (TemplateRequest) o;
        return Objects.equals(this.name, templateRequest.name)
            && Objects.equals(this.isTemplate, templateRequest.isTemplate)
            && Objects.equals(this.region, templateRequest.region)
            && Objects.equals(this.projectid, templateRequest.projectid)
            && Objects.equals(this.targetServerName, templateRequest.targetServerName)
            && Objects.equals(this.availabilityZone, templateRequest.availabilityZone)
            && Objects.equals(this.volumetype, templateRequest.volumetype)
            && Objects.equals(this.flavor, templateRequest.flavor) && Objects.equals(this.vpc, templateRequest.vpc)
            && Objects.equals(this.nics, templateRequest.nics)
            && Objects.equals(this.securityGroups, templateRequest.securityGroups)
            && Objects.equals(this.publicip, templateRequest.publicip)
            && Objects.equals(this.disk, templateRequest.disk)
            && Objects.equals(this.dataVolumeType, templateRequest.dataVolumeType)
            && Objects.equals(this.targetPassword, templateRequest.targetPassword)
            && Objects.equals(this.imageId, templateRequest.imageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            isTemplate,
            region,
            projectid,
            targetServerName,
            availabilityZone,
            volumetype,
            flavor,
            vpc,
            nics,
            securityGroups,
            publicip,
            disk,
            dataVolumeType,
            targetPassword,
            imageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    projectid: ").append(toIndentedString(projectid)).append("\n");
        sb.append("    targetServerName: ").append(toIndentedString(targetServerName)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    volumetype: ").append(toIndentedString(volumetype)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
        sb.append("    dataVolumeType: ").append(toIndentedString(dataVolumeType)).append("\n");
        sb.append("    targetPassword: ").append(toIndentedString(targetPassword)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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
