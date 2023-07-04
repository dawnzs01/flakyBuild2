package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 桌面详情。
 */
public class DesktopDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computer_name")

    private String computerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addresses")

    private Map<String, List<AddressInfo>> addresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_addresses")

    private List<String> ipAddresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_type")

    private String desktopType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private FlavorInfo flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroupInfo> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_status")

    private String loginStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume")

    private VolumeDetail rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volumes")

    private List<VolumeDetail> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group")

    private String userGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_type")

    private String siteType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_name")

    private String siteName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product")

    private ProductDetailInfo product;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_name")

    private String ouName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sid")

    private String sid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public DesktopDetailInfo withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面ID。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public DesktopDetailInfo withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * 桌面名。
     * @return computerName
     */
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public DesktopDetailInfo withAddresses(Map<String, List<AddressInfo>> addresses) {
        this.addresses = addresses;
        return this;
    }

    public DesktopDetailInfo putAddressesItem(String key, List<AddressInfo> addressesItem) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        this.addresses.put(key, addressesItem);
        return this;
    }

    public DesktopDetailInfo withAddresses(Consumer<Map<String, List<AddressInfo>>> addressesSetter) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    /**
     * 桌面IP地址列表。
     * @return addresses
     */
    public Map<String, List<AddressInfo>> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, List<AddressInfo>> addresses) {
        this.addresses = addresses;
    }

    public DesktopDetailInfo withIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }

    public DesktopDetailInfo addIpAddressesItem(String ipAddressesItem) {
        if (this.ipAddresses == null) {
            this.ipAddresses = new ArrayList<>();
        }
        this.ipAddresses.add(ipAddressesItem);
        return this;
    }

    public DesktopDetailInfo withIpAddresses(Consumer<List<String>> ipAddressesSetter) {
        if (this.ipAddresses == null) {
            this.ipAddresses = new ArrayList<>();
        }
        ipAddressesSetter.accept(this.ipAddresses);
        return this;
    }

    /**
     * IP地址列表。
     * @return ipAddresses
     */
    public List<String> getIpAddresses() {
        return ipAddresses;
    }

    public void setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    public DesktopDetailInfo withDesktopType(String desktopType) {
        this.desktopType = desktopType;
        return this;
    }

    /**
     * 桌面类型。  - DEDICATED：专属桌面。
     * @return desktopType
     */
    public String getDesktopType() {
        return desktopType;
    }

    public void setDesktopType(String desktopType) {
        this.desktopType = desktopType;
    }

    public DesktopDetailInfo withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public DesktopDetailInfo putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public DesktopDetailInfo withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    /**
     * 桌面元数据。  - charging_mode 周期套餐标识，1表示包周期，0表示按需。 - image_name 创建桌面的镜像名称。 - metering.image_id 镜像ID。 - metering.resourcespeccode 桌面资源编码。 - metering.resourcetype 桌面资源类型。 - os_bit 操作系统位数：32或64。 - os_type 操作系统类型：Linux、Windows或Others。 - desktop_os_version 操作系统版本。
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public DesktopDetailInfo withFlavor(FlavorInfo flavor) {
        this.flavor = flavor;
        return this;
    }

    public DesktopDetailInfo withFlavor(Consumer<FlavorInfo> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new FlavorInfo();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public FlavorInfo getFlavor() {
        return flavor;
    }

    public void setFlavor(FlavorInfo flavor) {
        this.flavor = flavor;
    }

    public DesktopDetailInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 桌面状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DesktopDetailInfo withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态。  - scheduling：创建中，正在进行调度。 - block_device_mapping：创建中，正在准备磁盘。 - networking：创建中，正在准备网络。 - spawning：创建中，正在内部创建。 - rebooting：重启中。 - reboot_pending：重启中，正在下发重启。 - reboot_started：重启中，开始内部重启。 - rebooting_hard：强制重启中。 - reboot_pending_hard：强制重启中，正在下发重启。 - reboot_started_hard：强制重启中，开始内部重启。 - rebuilding：重建中。 - rebuild_block_device_mapping：重建中，正在准备磁盘。 - rebuild_spawning：重建中，正在内部重建。 - migrating：热迁移中。 - resize_prep：调整规格中，正在准备阶段。 - resize_migrating：调整规格中，正在迁移阶段。 - resize_migrated：调整规格中，已经完成迁移。 - resize_finish：调整规格中，正在完成调整。 - resize_reverting：调整规格中，正在回退调整。 - powering-off：停止中。 - powering-on：启动中。 - deleting：删除中。 - deleteFailed：删除失败。
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public DesktopDetailInfo withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 桌面创建时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public DesktopDetailInfo withSecurityGroups(List<SecurityGroupInfo> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public DesktopDetailInfo addSecurityGroupsItem(SecurityGroupInfo securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public DesktopDetailInfo withSecurityGroups(Consumer<List<SecurityGroupInfo>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 桌面安全组。
     * @return securityGroups
     */
    public List<SecurityGroupInfo> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroupInfo> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public DesktopDetailInfo withLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
        return this;
    }

    /**
     * 桌面的登录状态。  - UNREGISTER：表示桌面未注册时的状态（桌面启动后，会自动注册）。关机后也会出现未注册的状态。 - REGISTERED：表示桌面注册以后，等待用户连接的状态。 - CONNECTED：表示用户已经成功登录，正在使用桌面。 - DISCONNECTED：表示桌面与客户端断开会话后显示的状态，可能为关闭客户端窗口，或客户端与桌面网络断开引起。
     * @return loginStatus
     */
    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    public DesktopDetailInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 桌面所属用户。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public DesktopDetailInfo withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public DesktopDetailInfo withRootVolume(VolumeDetail rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public DesktopDetailInfo withRootVolume(Consumer<VolumeDetail> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new VolumeDetail();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    /**
     * Get rootVolume
     * @return rootVolume
     */
    public VolumeDetail getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(VolumeDetail rootVolume) {
        this.rootVolume = rootVolume;
    }

    public DesktopDetailInfo withDataVolumes(List<VolumeDetail> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public DesktopDetailInfo addDataVolumesItem(VolumeDetail dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public DesktopDetailInfo withDataVolumes(Consumer<List<VolumeDetail>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * 数据盘列表。
     * @return dataVolumes
     */
    public List<VolumeDetail> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<VolumeDetail> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public DesktopDetailInfo withUserGroup(String userGroup) {
        this.userGroup = userGroup;
        return this;
    }

    /**
     * 桌面用户所属的用户组。  - sudo：Linux管理员组。 - default：Linux默认用户组。 - administrators：Windows管理员组。管理员拥有对该桌面的完全访问权，可以做任何需要的更改（禁用操作除外）。 - users：Windows标准用户组。标准用户可以使用大多数软件，并可以更改不影响其他用户的系统设置。
     * @return userGroup
     */
    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    public DesktopDetailInfo withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用分区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public DesktopDetailInfo withSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }

    /**
     * 站点类型
     * @return siteType
     */
    public String getSiteType() {
        return siteType;
    }

    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }

    public DesktopDetailInfo withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * 站点名字
     * @return siteName
     */
    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public DesktopDetailInfo withProduct(ProductDetailInfo product) {
        this.product = product;
        return this;
    }

    public DesktopDetailInfo withProduct(Consumer<ProductDetailInfo> productSetter) {
        if (this.product == null) {
            this.product = new ProductDetailInfo();
            productSetter.accept(this.product);
        }

        return this;
    }

    /**
     * Get product
     * @return product
     */
    public ProductDetailInfo getProduct() {
        return product;
    }

    public void setProduct(ProductDetailInfo product) {
        this.product = product;
    }

    public DesktopDetailInfo withOuName(String ouName) {
        this.ouName = ouName;
        return this;
    }

    /**
     * 创建桌面时加入的OU名称。
     * @return ouName
     */
    public String getOuName() {
        return ouName;
    }

    public void setOuName(String ouName) {
        this.ouName = ouName;
    }

    public DesktopDetailInfo withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * 操作系统版本号。
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public DesktopDetailInfo withSid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * SID
     * @return sid
     */
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public DesktopDetailInfo withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 包周期产品的订单ID。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public DesktopDetailInfo withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public DesktopDetailInfo addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public DesktopDetailInfo withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 桌面标签列表。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DesktopDetailInfo desktopDetailInfo = (DesktopDetailInfo) o;
        return Objects.equals(this.desktopId, desktopDetailInfo.desktopId)
            && Objects.equals(this.computerName, desktopDetailInfo.computerName)
            && Objects.equals(this.addresses, desktopDetailInfo.addresses)
            && Objects.equals(this.ipAddresses, desktopDetailInfo.ipAddresses)
            && Objects.equals(this.desktopType, desktopDetailInfo.desktopType)
            && Objects.equals(this.metadata, desktopDetailInfo.metadata)
            && Objects.equals(this.flavor, desktopDetailInfo.flavor)
            && Objects.equals(this.status, desktopDetailInfo.status)
            && Objects.equals(this.taskStatus, desktopDetailInfo.taskStatus)
            && Objects.equals(this.created, desktopDetailInfo.created)
            && Objects.equals(this.securityGroups, desktopDetailInfo.securityGroups)
            && Objects.equals(this.loginStatus, desktopDetailInfo.loginStatus)
            && Objects.equals(this.userName, desktopDetailInfo.userName)
            && Objects.equals(this.productId, desktopDetailInfo.productId)
            && Objects.equals(this.rootVolume, desktopDetailInfo.rootVolume)
            && Objects.equals(this.dataVolumes, desktopDetailInfo.dataVolumes)
            && Objects.equals(this.userGroup, desktopDetailInfo.userGroup)
            && Objects.equals(this.availabilityZone, desktopDetailInfo.availabilityZone)
            && Objects.equals(this.siteType, desktopDetailInfo.siteType)
            && Objects.equals(this.siteName, desktopDetailInfo.siteName)
            && Objects.equals(this.product, desktopDetailInfo.product)
            && Objects.equals(this.ouName, desktopDetailInfo.ouName)
            && Objects.equals(this.osVersion, desktopDetailInfo.osVersion)
            && Objects.equals(this.sid, desktopDetailInfo.sid)
            && Objects.equals(this.orderId, desktopDetailInfo.orderId)
            && Objects.equals(this.tags, desktopDetailInfo.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId,
            computerName,
            addresses,
            ipAddresses,
            desktopType,
            metadata,
            flavor,
            status,
            taskStatus,
            created,
            securityGroups,
            loginStatus,
            userName,
            productId,
            rootVolume,
            dataVolumes,
            userGroup,
            availabilityZone,
            siteType,
            siteName,
            product,
            ouName,
            osVersion,
            sid,
            orderId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesktopDetailInfo {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
        sb.append("    desktopType: ").append(toIndentedString(desktopType)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    loginStatus: ").append(toIndentedString(loginStatus)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    userGroup: ").append(toIndentedString(userGroup)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
        sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    ouName: ").append(toIndentedString(ouName)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
