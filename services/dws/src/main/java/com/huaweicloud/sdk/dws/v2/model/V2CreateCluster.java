package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * v2创建集群请求
 */
public class V2CreateCluster {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_cn")

    private Integer numCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_node")

    private Integer numNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_password")

    private String dbPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_port")

    private Integer dbPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dss_pool_id")

    private String dssPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zones")

    private List<String> availabilityZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Tags tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private PublicIp publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_version")

    private String datastoreVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_key_id")

    private String masterKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_key_name")

    private String masterKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crypt_algorithm")

    private String cryptAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private Volume volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public V2CreateCluster withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 集群名称，要求唯一性，必须以字母开头并只包含字母、数字、中划线或下划线，长度为4~64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public V2CreateCluster withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 集群规格名称。节点类型详情请参见数据仓库类型数据仓库类型。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public V2CreateCluster withNumCn(Integer numCn) {
        this.numCn = numCn;
        return this;
    }

    /**
     * 集群CN数量，取值范围为2~集群节点数，最大值为20，默认值为3。
     * @return numCn
     */
    public Integer getNumCn() {
        return numCn;
    }

    public void setNumCn(Integer numCn) {
        this.numCn = numCn;
    }

    public V2CreateCluster withNumNode(Integer numNode) {
        this.numNode = numNode;
        return this;
    }

    /**
     * 集群节点数量，集群模式取值范围为3~256，实时数仓（单机模式）取值为1。
     * @return numNode
     */
    public Integer getNumNode() {
        return numNode;
    }

    public void setNumNode(Integer numNode) {
        this.numNode = numNode;
    }

    public V2CreateCluster withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 管理员用户名称。用户命名要求如下： 只能由小写字母、数字或下划线组成。 必须由小写字母或下划线开头。 长度为1~63个字符。用户名不能为DWS数据库的关键字。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public V2CreateCluster withDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }

    /**
     * 管理员用户密码。 8~32个字符 至少包含以下字符中的3种：大写字母、小写字母、数字和特殊字符（~!?,.:;-_(){}[]/<>@#%^&*+|\\=）。不能与用户名或倒序的用户名相同。
     * @return dbPassword
     */
    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public V2CreateCluster withDbPort(Integer dbPort) {
        this.dbPort = dbPort;
        return this;
    }

    /**
     * 集群数据库端口，取值范围为8000~30000，默认值：8000。
     * @return dbPort
     */
    public Integer getDbPort() {
        return dbPort;
    }

    public void setDbPort(Integer dbPort) {
        this.dbPort = dbPort;
    }

    public V2CreateCluster withDssPoolId(String dssPoolId) {
        this.dssPoolId = dssPoolId;
        return this;
    }

    /**
     * 专属存储池ID
     * @return dssPoolId
     */
    public String getDssPoolId() {
        return dssPoolId;
    }

    public void setDssPoolId(String dssPoolId) {
        this.dssPoolId = dssPoolId;
    }

    public V2CreateCluster withAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    public V2CreateCluster addAvailabilityZonesItem(String availabilityZonesItem) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        this.availabilityZones.add(availabilityZonesItem);
        return this;
    }

    public V2CreateCluster withAvailabilityZones(Consumer<List<String>> availabilityZonesSetter) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        availabilityZonesSetter.accept(this.availabilityZones);
        return this;
    }

    /**
     * 可用区列表。集群可用区选择详情请参见地区和终端节点地区和终端节点。
     * @return availabilityZones
     */
    public List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    public void setAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    public V2CreateCluster withTags(Tags tags) {
        this.tags = tags;
        return this;
    }

    public V2CreateCluster withTags(Consumer<Tags> tagsSetter) {
        if (this.tags == null) {
            this.tags = new Tags();
            tagsSetter.accept(this.tags);
        }

        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public V2CreateCluster withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 指定虚拟私有云ID，用于集群网络配置。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public V2CreateCluster withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 指定子网ID，用于集群网络配置。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public V2CreateCluster withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 指定安全组ID，用于集群网络配置。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public V2CreateCluster withPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public V2CreateCluster withPublicIp(Consumer<PublicIp> publicIpSetter) {
        if (this.publicIp == null) {
            this.publicIp = new PublicIp();
            publicIpSetter.accept(this.publicIp);
        }

        return this;
    }

    /**
     * Get publicIp
     * @return publicIp
     */
    public PublicIp getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
    }

    public V2CreateCluster withDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
        return this;
    }

    /**
     * 集群版本
     * @return datastoreVersion
     */
    public String getDatastoreVersion() {
        return datastoreVersion;
    }

    public void setDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
    }

    public V2CreateCluster withMasterKeyId(String masterKeyId) {
        this.masterKeyId = masterKeyId;
        return this;
    }

    /**
     * 密钥ID
     * @return masterKeyId
     */
    public String getMasterKeyId() {
        return masterKeyId;
    }

    public void setMasterKeyId(String masterKeyId) {
        this.masterKeyId = masterKeyId;
    }

    public V2CreateCluster withMasterKeyName(String masterKeyName) {
        this.masterKeyName = masterKeyName;
        return this;
    }

    /**
     * 密钥名称
     * @return masterKeyName
     */
    public String getMasterKeyName() {
        return masterKeyName;
    }

    public void setMasterKeyName(String masterKeyName) {
        this.masterKeyName = masterKeyName;
    }

    public V2CreateCluster withCryptAlgorithm(String cryptAlgorithm) {
        this.cryptAlgorithm = cryptAlgorithm;
        return this;
    }

    /**
     * 加密算法
     * @return cryptAlgorithm
     */
    public String getCryptAlgorithm() {
        return cryptAlgorithm;
    }

    public void setCryptAlgorithm(String cryptAlgorithm) {
        this.cryptAlgorithm = cryptAlgorithm;
    }

    public V2CreateCluster withVolume(Volume volume) {
        this.volume = volume;
        return this;
    }

    public V2CreateCluster withVolume(Consumer<Volume> volumeSetter) {
        if (this.volume == null) {
            this.volume = new Volume();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public V2CreateCluster withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，对集群指定企业项目，如果未指定，则使用默认企业项目“default”的ID，即0。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V2CreateCluster v2CreateCluster = (V2CreateCluster) o;
        return Objects.equals(this.name, v2CreateCluster.name) && Objects.equals(this.flavor, v2CreateCluster.flavor)
            && Objects.equals(this.numCn, v2CreateCluster.numCn)
            && Objects.equals(this.numNode, v2CreateCluster.numNode)
            && Objects.equals(this.dbName, v2CreateCluster.dbName)
            && Objects.equals(this.dbPassword, v2CreateCluster.dbPassword)
            && Objects.equals(this.dbPort, v2CreateCluster.dbPort)
            && Objects.equals(this.dssPoolId, v2CreateCluster.dssPoolId)
            && Objects.equals(this.availabilityZones, v2CreateCluster.availabilityZones)
            && Objects.equals(this.tags, v2CreateCluster.tags) && Objects.equals(this.vpcId, v2CreateCluster.vpcId)
            && Objects.equals(this.subnetId, v2CreateCluster.subnetId)
            && Objects.equals(this.securityGroupId, v2CreateCluster.securityGroupId)
            && Objects.equals(this.publicIp, v2CreateCluster.publicIp)
            && Objects.equals(this.datastoreVersion, v2CreateCluster.datastoreVersion)
            && Objects.equals(this.masterKeyId, v2CreateCluster.masterKeyId)
            && Objects.equals(this.masterKeyName, v2CreateCluster.masterKeyName)
            && Objects.equals(this.cryptAlgorithm, v2CreateCluster.cryptAlgorithm)
            && Objects.equals(this.volume, v2CreateCluster.volume)
            && Objects.equals(this.enterpriseProjectId, v2CreateCluster.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            flavor,
            numCn,
            numNode,
            dbName,
            dbPassword,
            dbPort,
            dssPoolId,
            availabilityZones,
            tags,
            vpcId,
            subnetId,
            securityGroupId,
            publicIp,
            datastoreVersion,
            masterKeyId,
            masterKeyName,
            cryptAlgorithm,
            volume,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2CreateCluster {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    numCn: ").append(toIndentedString(numCn)).append("\n");
        sb.append("    numNode: ").append(toIndentedString(numNode)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    dbPassword: ").append(toIndentedString(dbPassword)).append("\n");
        sb.append("    dbPort: ").append(toIndentedString(dbPort)).append("\n");
        sb.append("    dssPoolId: ").append(toIndentedString(dssPoolId)).append("\n");
        sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    datastoreVersion: ").append(toIndentedString(datastoreVersion)).append("\n");
        sb.append("    masterKeyId: ").append(toIndentedString(masterKeyId)).append("\n");
        sb.append("    masterKeyName: ").append(toIndentedString(masterKeyName)).append("\n");
        sb.append("    cryptAlgorithm: ").append(toIndentedString(cryptAlgorithm)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
