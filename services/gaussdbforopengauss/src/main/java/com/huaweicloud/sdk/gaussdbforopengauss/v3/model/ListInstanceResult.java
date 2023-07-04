package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatastore;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFlavorInfo;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListHaResult;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListVolume;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.NodeResult;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussBackupStrategyForListResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussChargeInfoListResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.TagResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 实例信息。
 */
public class ListInstanceResult  {


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
    @JsonProperty(value="private_ips")
    
    private List<String> privateIps = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ips")
    
    private List<String> publicIps = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ha")
    

    private ListHaResult ha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replica_num")
    

    private Integer replicaNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore")
    

    private ListDatastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_user_name")
    

    private String dbUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor_ref")
    

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor_info")
    

    private ListFlavorInfo flavorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume")
    

    private ListVolume volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="switch_strategy")
    

    private String switchStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_strategy")
    

    private OpenGaussBackupStrategyForListResponse backupStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maintenance_window")
    

    private String maintenanceWindow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodes")
    
    private List<NodeResult> nodes = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_mode")
    

    private String instanceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disk_encryption_id")
    

    private String diskEncryptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_info")
    

    private OpenGaussChargeInfoListResponse chargeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_zone")
    

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<TagResult> tags = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disk_usage")
    

    private String diskUsage;

    public ListInstanceResult withId(String id) {
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

    

    public ListInstanceResult withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 创建的实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListInstanceResult withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 实例状态。  取值：  值为“BUILD”，表示实例正在创建。  值为“ACTIVE”，表示实例正常。  值为“FAILED”，表示实例异常。  值为“FROZEN”，表示实例冻结。  值为“EXPANDING”，表示实例正在扩容CN或DN。  值为“REBOOTING”，表示实例正在重启。  值为“UPGRADING”，表示实例正在升级。  值为“RESTORING”，表示实例正在恢复。  值为“BACKING UP”，表示实例正在进行备份。  值为“REDUCING REPLICATION”，表示实例正在降副本。  值为“STORAGE FULL”，表示实例磁盘空间满。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ListInstanceResult withPrivateIps(List<String> privateIps) {
        this.privateIps = privateIps;
        return this;
    }

    
    public ListInstanceResult addPrivateIpsItem(String privateIpsItem) {
        if(this.privateIps == null) {
            this.privateIps = new ArrayList<>();
        }
        this.privateIps.add(privateIpsItem);
        return this;
    }

    public ListInstanceResult withPrivateIps(Consumer<List<String>> privateIpsSetter) {
        if(this.privateIps == null) {
            this.privateIps = new ArrayList<>();
        }
        privateIpsSetter.accept(this.privateIps);
        return this;
    }

    /**
     * 实例内网IP地址列表。分布式CN所在的弹性云服务器创建成功后该值存在，主备版DN所在的弹性云服务器创建成功后该值存在，其他情况下为空字符串。
     * @return privateIps
     */
    public List<String> getPrivateIps() {
        return privateIps;
    }

    public void setPrivateIps(List<String> privateIps) {
        this.privateIps = privateIps;
    }

    

    public ListInstanceResult withPublicIps(List<String> publicIps) {
        this.publicIps = publicIps;
        return this;
    }

    
    public ListInstanceResult addPublicIpsItem(String publicIpsItem) {
        if(this.publicIps == null) {
            this.publicIps = new ArrayList<>();
        }
        this.publicIps.add(publicIpsItem);
        return this;
    }

    public ListInstanceResult withPublicIps(Consumer<List<String>> publicIpsSetter) {
        if(this.publicIps == null) {
            this.publicIps = new ArrayList<>();
        }
        publicIpsSetter.accept(this.publicIps);
        return this;
    }

    /**
     * 实例外网IP地址列表。绑定弹性公网IP后，该值不为空。
     * @return publicIps
     */
    public List<String> getPublicIps() {
        return publicIps;
    }

    public void setPublicIps(List<String> publicIps) {
        this.publicIps = publicIps;
    }

    

    public ListInstanceResult withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * 数据库端口号。GaussDB数据库端口设置范围为1024~39998（其中2378,2379,2380,4999,5000,5999,6000,6001,8097,8098,20049,20050,21731,21732被系统占用不可设置）。  当不传该参数时，默认端口如下：8000。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    

    public ListInstanceResult withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 实例类型，取值为 \"Enterprise\"，对应于分布式实例（企业版）。取值为\"Ha\"，对应于主备版实例。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ListInstanceResult withHa(ListHaResult ha) {
        this.ha = ha;
        return this;
    }

    public ListInstanceResult withHa(Consumer<ListHaResult> haSetter) {
        if(this.ha == null ){
            this.ha = new ListHaResult();
            haSetter.accept(this.ha);
        }
        
        return this;
    }


    /**
     * Get ha
     * @return ha
     */
    public ListHaResult getHa() {
        return ha;
    }

    public void setHa(ListHaResult ha) {
        this.ha = ha;
    }

    

    public ListInstanceResult withReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
        return this;
    }

    


    /**
     * 实例副本数。
     * @return replicaNum
     */
    public Integer getReplicaNum() {
        return replicaNum;
    }

    public void setReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
    }

    

    public ListInstanceResult withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 实例所在区域。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    

    public ListInstanceResult withDatastore(ListDatastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public ListInstanceResult withDatastore(Consumer<ListDatastore> datastoreSetter) {
        if(this.datastore == null ){
            this.datastore = new ListDatastore();
            datastoreSetter.accept(this.datastore);
        }
        
        return this;
    }


    /**
     * Get datastore
     * @return datastore
     */
    public ListDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(ListDatastore datastore) {
        this.datastore = datastore;
    }

    

    public ListInstanceResult withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 创建时间，格式为“yyyy-mm-dd hh:mm:ss timezone”。  其中timezone是指时区。  说明：创建时该值为实例下发创建的时间，创建完成后，该值为创建完成时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    

    public ListInstanceResult withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 更新时间，格式与“created”字段对应格式完全相同。  说明：创建时返回值为空，数据库实例创建成功后该值不为空。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    

    public ListInstanceResult withDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
        return this;
    }

    


    /**
     * 默认用户名。
     * @return dbUserName
     */
    public String getDbUserName() {
        return dbUserName;
    }

    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }

    

    public ListInstanceResult withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 虚拟私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    

    public ListInstanceResult withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 子网的网络ID信息。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    

    public ListInstanceResult withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    

    public ListInstanceResult withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    


    /**
     * 规格码。参考[表1](https://support.huaweicloud.com/api-opengauss/opengauss_api_0037.html#opengauss_api_0037__ted9b9d433c8a4c52884e199e17f94479)中GaussDB的“规格编码”列内容获取。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    

    public ListInstanceResult withFlavorInfo(ListFlavorInfo flavorInfo) {
        this.flavorInfo = flavorInfo;
        return this;
    }

    public ListInstanceResult withFlavorInfo(Consumer<ListFlavorInfo> flavorInfoSetter) {
        if(this.flavorInfo == null ){
            this.flavorInfo = new ListFlavorInfo();
            flavorInfoSetter.accept(this.flavorInfo);
        }
        
        return this;
    }


    /**
     * Get flavorInfo
     * @return flavorInfo
     */
    public ListFlavorInfo getFlavorInfo() {
        return flavorInfo;
    }

    public void setFlavorInfo(ListFlavorInfo flavorInfo) {
        this.flavorInfo = flavorInfo;
    }

    

    public ListInstanceResult withVolume(ListVolume volume) {
        this.volume = volume;
        return this;
    }

    public ListInstanceResult withVolume(Consumer<ListVolume> volumeSetter) {
        if(this.volume == null ){
            this.volume = new ListVolume();
            volumeSetter.accept(this.volume);
        }
        
        return this;
    }


    /**
     * Get volume
     * @return volume
     */
    public ListVolume getVolume() {
        return volume;
    }

    public void setVolume(ListVolume volume) {
        this.volume = volume;
    }

    

    public ListInstanceResult withSwitchStrategy(String switchStrategy) {
        this.switchStrategy = switchStrategy;
        return this;
    }

    


    /**
     * 数据库切换策略。取值为“reliability”或“availability”，分别对应于可靠性优先和可用性优先。 若创建时没有选择切换策略，则不予显示。
     * @return switchStrategy
     */
    public String getSwitchStrategy() {
        return switchStrategy;
    }

    public void setSwitchStrategy(String switchStrategy) {
        this.switchStrategy = switchStrategy;
    }

    

    public ListInstanceResult withBackupStrategy(OpenGaussBackupStrategyForListResponse backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public ListInstanceResult withBackupStrategy(Consumer<OpenGaussBackupStrategyForListResponse> backupStrategySetter) {
        if(this.backupStrategy == null ){
            this.backupStrategy = new OpenGaussBackupStrategyForListResponse();
            backupStrategySetter.accept(this.backupStrategy);
        }
        
        return this;
    }


    /**
     * Get backupStrategy
     * @return backupStrategy
     */
    public OpenGaussBackupStrategyForListResponse getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(OpenGaussBackupStrategyForListResponse backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    

    public ListInstanceResult withMaintenanceWindow(String maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    


    /**
     * 可维护时间窗，为UTC时间。
     * @return maintenanceWindow
     */
    public String getMaintenanceWindow() {
        return maintenanceWindow;
    }

    public void setMaintenanceWindow(String maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
    }

    

    public ListInstanceResult withNodes(List<NodeResult> nodes) {
        this.nodes = nodes;
        return this;
    }

    
    public ListInstanceResult addNodesItem(NodeResult nodesItem) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ListInstanceResult withNodes(Consumer<List<NodeResult>> nodesSetter) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 实例节点信息列表。
     * @return nodes
     */
    public List<NodeResult> getNodes() {
        return nodes;
    }

    public void setNodes(List<NodeResult> nodes) {
        this.nodes = nodes;
    }

    

    public ListInstanceResult withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目标签ID。非企业项目账号的实例，企业项目默认0。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public ListInstanceResult withInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
        return this;
    }

    


    /**
     * basic为基础版 ，enterprise为企业版。
     * @return instanceMode
     */
    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }

    

    public ListInstanceResult withDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
        return this;
    }

    


    /**
     * 磁盘加密密钥ID。只有创建磁盘加密实例才会显示该参数。
     * @return diskEncryptionId
     */
    public String getDiskEncryptionId() {
        return diskEncryptionId;
    }

    public void setDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
    }

    

    public ListInstanceResult withChargeInfo(OpenGaussChargeInfoListResponse chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public ListInstanceResult withChargeInfo(Consumer<OpenGaussChargeInfoListResponse> chargeInfoSetter) {
        if(this.chargeInfo == null ){
            this.chargeInfo = new OpenGaussChargeInfoListResponse();
            chargeInfoSetter.accept(this.chargeInfo);
        }
        
        return this;
    }


    /**
     * Get chargeInfo
     * @return chargeInfo
     */
    public OpenGaussChargeInfoListResponse getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(OpenGaussChargeInfoListResponse chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    

    public ListInstanceResult withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    


    /**
     * 时区。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    

    public ListInstanceResult withTags(List<TagResult> tags) {
        this.tags = tags;
        return this;
    }

    
    public ListInstanceResult addTagsItem(TagResult tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListInstanceResult withTags(Consumer<List<TagResult>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表，没有标签不返回该参数。
     * @return tags
     */
    public List<TagResult> getTags() {
        return tags;
    }

    public void setTags(List<TagResult> tags) {
        this.tags = tags;
    }

    

    public ListInstanceResult withDiskUsage(String diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }

    


    /**
     * 实例磁盘的可使用率，值范围[0-1]，值保留四位小数。
     * @return diskUsage
     */
    public String getDiskUsage() {
        return diskUsage;
    }

    public void setDiskUsage(String diskUsage) {
        this.diskUsage = diskUsage;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstanceResult listInstanceResult = (ListInstanceResult) o;
        return Objects.equals(this.id, listInstanceResult.id) &&
            Objects.equals(this.name, listInstanceResult.name) &&
            Objects.equals(this.status, listInstanceResult.status) &&
            Objects.equals(this.privateIps, listInstanceResult.privateIps) &&
            Objects.equals(this.publicIps, listInstanceResult.publicIps) &&
            Objects.equals(this.port, listInstanceResult.port) &&
            Objects.equals(this.type, listInstanceResult.type) &&
            Objects.equals(this.ha, listInstanceResult.ha) &&
            Objects.equals(this.replicaNum, listInstanceResult.replicaNum) &&
            Objects.equals(this.region, listInstanceResult.region) &&
            Objects.equals(this.datastore, listInstanceResult.datastore) &&
            Objects.equals(this.created, listInstanceResult.created) &&
            Objects.equals(this.updated, listInstanceResult.updated) &&
            Objects.equals(this.dbUserName, listInstanceResult.dbUserName) &&
            Objects.equals(this.vpcId, listInstanceResult.vpcId) &&
            Objects.equals(this.subnetId, listInstanceResult.subnetId) &&
            Objects.equals(this.securityGroupId, listInstanceResult.securityGroupId) &&
            Objects.equals(this.flavorRef, listInstanceResult.flavorRef) &&
            Objects.equals(this.flavorInfo, listInstanceResult.flavorInfo) &&
            Objects.equals(this.volume, listInstanceResult.volume) &&
            Objects.equals(this.switchStrategy, listInstanceResult.switchStrategy) &&
            Objects.equals(this.backupStrategy, listInstanceResult.backupStrategy) &&
            Objects.equals(this.maintenanceWindow, listInstanceResult.maintenanceWindow) &&
            Objects.equals(this.nodes, listInstanceResult.nodes) &&
            Objects.equals(this.enterpriseProjectId, listInstanceResult.enterpriseProjectId) &&
            Objects.equals(this.instanceMode, listInstanceResult.instanceMode) &&
            Objects.equals(this.diskEncryptionId, listInstanceResult.diskEncryptionId) &&
            Objects.equals(this.chargeInfo, listInstanceResult.chargeInfo) &&
            Objects.equals(this.timeZone, listInstanceResult.timeZone) &&
            Objects.equals(this.tags, listInstanceResult.tags) &&
            Objects.equals(this.diskUsage, listInstanceResult.diskUsage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, privateIps, publicIps, port, type, ha, replicaNum, region, datastore, created, updated, dbUserName, vpcId, subnetId, securityGroupId, flavorRef, flavorInfo, volume, switchStrategy, backupStrategy, maintenanceWindow, nodes, enterpriseProjectId, instanceMode, diskEncryptionId, chargeInfo, timeZone, tags, diskUsage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    privateIps: ").append(toIndentedString(privateIps)).append("\n");
        sb.append("    publicIps: ").append(toIndentedString(publicIps)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    dbUserName: ").append(toIndentedString(dbUserName)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    flavorInfo: ").append(toIndentedString(flavorInfo)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    switchStrategy: ").append(toIndentedString(switchStrategy)).append("\n");
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    instanceMode: ").append(toIndentedString(instanceMode)).append("\n");
        sb.append("    diskEncryptionId: ").append(toIndentedString(diskEncryptionId)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    diskUsage: ").append(toIndentedString(diskUsage)).append("\n");
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

