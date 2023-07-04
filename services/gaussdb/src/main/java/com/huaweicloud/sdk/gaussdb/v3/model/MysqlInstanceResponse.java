package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlBackupStrategy;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlChargeInfo;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlDatastore;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MysqlInstanceResponse
 */
public class MysqlInstanceResponse  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore")
    

    private MysqlDatastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mode")
    

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration_id")
    

    private String configurationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_strategy")
    

    private MysqlBackupStrategy backupStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone_mode")
    

    private String availabilityZoneMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="master_availability_zone")
    

    private String masterAvailabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor_ref")
    

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_info")
    

    private MysqlChargeInfo chargeInfo;

    public MysqlInstanceResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public MysqlInstanceResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 实例名称。用于表示实例的名称，同一租户下，同类型的实例名称可相同。  取值范围：4~64个字符之间，必须以字母开头，不区分大小写，可以包含字母、数字、中划线或者下划线, 不能包含其它的特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public MysqlInstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 实例状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public MysqlInstanceResponse withDatastore(MysqlDatastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public MysqlInstanceResponse withDatastore(Consumer<MysqlDatastore> datastoreSetter) {
        if(this.datastore == null ){
            this.datastore = new MysqlDatastore();
            datastoreSetter.accept(this.datastore);
        }
        
        return this;
    }


    /**
     * Get datastore
     * @return datastore
     */
    public MysqlDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(MysqlDatastore datastore) {
        this.datastore = datastore;
    }

    

    public MysqlInstanceResponse withMode(String mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * 实例类型，仅支持Cluster。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    

    public MysqlInstanceResponse withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    


    /**
     * 参数组ID。
     * @return configurationId
     */
    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    

    public MysqlInstanceResponse withPort(String port) {
        this.port = port;
        return this;
    }

    


    /**
     * 数据库端口信息。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    

    public MysqlInstanceResponse withBackupStrategy(MysqlBackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public MysqlInstanceResponse withBackupStrategy(Consumer<MysqlBackupStrategy> backupStrategySetter) {
        if(this.backupStrategy == null ){
            this.backupStrategy = new MysqlBackupStrategy();
            backupStrategySetter.accept(this.backupStrategy);
        }
        
        return this;
    }


    /**
     * Get backupStrategy
     * @return backupStrategy
     */
    public MysqlBackupStrategy getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(MysqlBackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    

    public MysqlInstanceResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public MysqlInstanceResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 区域ID，与请求参数相同。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    

    public MysqlInstanceResponse withAvailabilityZoneMode(String availabilityZoneMode) {
        this.availabilityZoneMode = availabilityZoneMode;
        return this;
    }

    


    /**
     * 可用区模式，与请求参数相同。
     * @return availabilityZoneMode
     */
    public String getAvailabilityZoneMode() {
        return availabilityZoneMode;
    }

    public void setAvailabilityZoneMode(String availabilityZoneMode) {
        this.availabilityZoneMode = availabilityZoneMode;
    }

    

    public MysqlInstanceResponse withMasterAvailabilityZone(String masterAvailabilityZone) {
        this.masterAvailabilityZone = masterAvailabilityZone;
        return this;
    }

    


    /**
     * 主可用区ID。
     * @return masterAvailabilityZone
     */
    public String getMasterAvailabilityZone() {
        return masterAvailabilityZone;
    }

    public void setMasterAvailabilityZone(String masterAvailabilityZone) {
        this.masterAvailabilityZone = masterAvailabilityZone;
    }

    

    public MysqlInstanceResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 虚拟私有云ID，与请求参数相同。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    

    public MysqlInstanceResponse withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 安全组ID，与请求参数相同。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    

    public MysqlInstanceResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 子网ID，与请求参数相同。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    

    public MysqlInstanceResponse withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    


    /**
     * 规格码，与请求参数相同。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    

    public MysqlInstanceResponse withChargeInfo(MysqlChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public MysqlInstanceResponse withChargeInfo(Consumer<MysqlChargeInfo> chargeInfoSetter) {
        if(this.chargeInfo == null ){
            this.chargeInfo = new MysqlChargeInfo();
            chargeInfoSetter.accept(this.chargeInfo);
        }
        
        return this;
    }


    /**
     * Get chargeInfo
     * @return chargeInfo
     */
    public MysqlChargeInfo getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(MysqlChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MysqlInstanceResponse mysqlInstanceResponse = (MysqlInstanceResponse) o;
        return Objects.equals(this.id, mysqlInstanceResponse.id) &&
            Objects.equals(this.name, mysqlInstanceResponse.name) &&
            Objects.equals(this.status, mysqlInstanceResponse.status) &&
            Objects.equals(this.datastore, mysqlInstanceResponse.datastore) &&
            Objects.equals(this.mode, mysqlInstanceResponse.mode) &&
            Objects.equals(this.configurationId, mysqlInstanceResponse.configurationId) &&
            Objects.equals(this.port, mysqlInstanceResponse.port) &&
            Objects.equals(this.backupStrategy, mysqlInstanceResponse.backupStrategy) &&
            Objects.equals(this.enterpriseProjectId, mysqlInstanceResponse.enterpriseProjectId) &&
            Objects.equals(this.region, mysqlInstanceResponse.region) &&
            Objects.equals(this.availabilityZoneMode, mysqlInstanceResponse.availabilityZoneMode) &&
            Objects.equals(this.masterAvailabilityZone, mysqlInstanceResponse.masterAvailabilityZone) &&
            Objects.equals(this.vpcId, mysqlInstanceResponse.vpcId) &&
            Objects.equals(this.securityGroupId, mysqlInstanceResponse.securityGroupId) &&
            Objects.equals(this.subnetId, mysqlInstanceResponse.subnetId) &&
            Objects.equals(this.flavorRef, mysqlInstanceResponse.flavorRef) &&
            Objects.equals(this.chargeInfo, mysqlInstanceResponse.chargeInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, datastore, mode, configurationId, port, backupStrategy, enterpriseProjectId, region, availabilityZoneMode, masterAvailabilityZone, vpcId, securityGroupId, subnetId, flavorRef, chargeInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlInstanceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    availabilityZoneMode: ").append(toIndentedString(availabilityZoneMode)).append("\n");
        sb.append("    masterAvailabilityZone: ").append(toIndentedString(masterAvailabilityZone)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
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

