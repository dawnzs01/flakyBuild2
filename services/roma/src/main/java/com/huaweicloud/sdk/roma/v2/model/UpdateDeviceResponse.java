package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateDeviceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permissions")

    private List<String> permissions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private Integer deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_device_id")

    private Integer parentDeviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_device_name")

    private String parentDeviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product")

    private ProductReferer product;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_name")

    private String deviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    /**
     * 设备状态 0-启用 1-禁用
     */
    public static final class StatusEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    /**
     * 是否在线 0-未连接 1-在线 2-离线
     */
    public static final class OnlineStatusEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final OnlineStatusEnum NUMBER_0 = new OnlineStatusEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final OnlineStatusEnum NUMBER_1 = new OnlineStatusEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final OnlineStatusEnum NUMBER_2 = new OnlineStatusEnum(2);

        private static final Map<Integer, OnlineStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, OnlineStatusEnum> createStaticFields() {
            Map<Integer, OnlineStatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        OnlineStatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OnlineStatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            OnlineStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OnlineStatusEnum(value);
            }
            return result;
        }

        public static OnlineStatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            OnlineStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OnlineStatusEnum) {
                return this.value.equals(((OnlineStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online_status")

    private OnlineStatusEnum onlineStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication")

    private Authentication authentication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_user")

    private CreatedUser createdUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_updated_user")

    private LastUpdatedUser lastUpdatedUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_datetime")

    private Long createdDatetime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_updated_datetime")

    private Long lastUpdatedDatetime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_address")

    private String connectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_connect_address")

    private String sslConnectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_connect_address")

    private String ipv6ConnectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_ssl_connect_address")

    private String ipv6SslConnectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_login_datetime")

    private Long lastLoginDatetime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private Integer nodeType;

    /**
     * 设备类型<br>0-普通设备（无子设备也无父设备）<br>1-网关设备(可挂载子设备)<br>2-子设备(归属于某个网关设备)
     */
    public static final class DeviceTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final DeviceTypeEnum NUMBER_0 = new DeviceTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final DeviceTypeEnum NUMBER_1 = new DeviceTypeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final DeviceTypeEnum NUMBER_2 = new DeviceTypeEnum(2);

        private static final Map<Integer, DeviceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, DeviceTypeEnum> createStaticFields() {
            Map<Integer, DeviceTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        DeviceTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DeviceTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            DeviceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeviceTypeEnum(value);
            }
            return result;
        }

        public static DeviceTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            DeviceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeviceTypeEnum) {
                return this.value.equals(((DeviceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_type")

    private DeviceTypeEnum deviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_alive")

    private String keepAlive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_active_time")

    private Long lastActiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    public UpdateDeviceResponse withPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    public UpdateDeviceResponse addPermissionsItem(String permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public UpdateDeviceResponse withPermissions(Consumer<List<String>> permissionsSetter) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        permissionsSetter.accept(this.permissions);
        return this;
    }

    /**
     * 权限
     * @return permissions
     */
    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public UpdateDeviceResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 设备ID
     * minimum: 1
     * maximum: 999999999999999999
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UpdateDeviceResponse withDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 设备ID（兼容20.0）
     * minimum: 1
     * maximum: 99999999999999999
     * @return deviceId
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public UpdateDeviceResponse withParentDeviceId(Integer parentDeviceId) {
        this.parentDeviceId = parentDeviceId;
        return this;
    }

    /**
     * 父设备ID
     * minimum: 1
     * maximum: 999999999999999999
     * @return parentDeviceId
     */
    public Integer getParentDeviceId() {
        return parentDeviceId;
    }

    public void setParentDeviceId(Integer parentDeviceId) {
        this.parentDeviceId = parentDeviceId;
    }

    public UpdateDeviceResponse withParentDeviceName(String parentDeviceName) {
        this.parentDeviceName = parentDeviceName;
        return this;
    }

    /**
     * 父设备名称
     * @return parentDeviceName
     */
    public String getParentDeviceName() {
        return parentDeviceName;
    }

    public void setParentDeviceName(String parentDeviceName) {
        this.parentDeviceName = parentDeviceName;
    }

    public UpdateDeviceResponse withProduct(ProductReferer product) {
        this.product = product;
        return this;
    }

    public UpdateDeviceResponse withProduct(Consumer<ProductReferer> productSetter) {
        if (this.product == null) {
            this.product = new ProductReferer();
            productSetter.accept(this.product);
        }

        return this;
    }

    /**
     * Get product
     * @return product
     */
    public ProductReferer getProduct() {
        return product;
    }

    public void setProduct(ProductReferer product) {
        this.product = product;
    }

    public UpdateDeviceResponse withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * 设备名称，支持中文、中文标点符号（）。；，：“”、？《》及英文大小写、数字及英文符号()_,#.?'-@%&!, 长度2-64
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public UpdateDeviceResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateDeviceResponse withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * 设备客户端ID，平台生成的设备唯一标识
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public UpdateDeviceResponse withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 设备物理编号，通常使用MAC或者IMEI号，支持英文大小写，数字，下划线和中划线，长度2-64
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public UpdateDeviceResponse withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public UpdateDeviceResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 设备状态 0-启用 1-禁用
     * minimum: 0
     * maximum: 10
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UpdateDeviceResponse withOnlineStatus(OnlineStatusEnum onlineStatus) {
        this.onlineStatus = onlineStatus;
        return this;
    }

    /**
     * 是否在线 0-未连接 1-在线 2-离线
     * minimum: 0
     * maximum: 10
     * @return onlineStatus
     */
    public OnlineStatusEnum getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(OnlineStatusEnum onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public UpdateDeviceResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 备注
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateDeviceResponse withAuthentication(Authentication authentication) {
        this.authentication = authentication;
        return this;
    }

    public UpdateDeviceResponse withAuthentication(Consumer<Authentication> authenticationSetter) {
        if (this.authentication == null) {
            this.authentication = new Authentication();
            authenticationSetter.accept(this.authentication);
        }

        return this;
    }

    /**
     * Get authentication
     * @return authentication
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public UpdateDeviceResponse withCreatedUser(CreatedUser createdUser) {
        this.createdUser = createdUser;
        return this;
    }

    public UpdateDeviceResponse withCreatedUser(Consumer<CreatedUser> createdUserSetter) {
        if (this.createdUser == null) {
            this.createdUser = new CreatedUser();
            createdUserSetter.accept(this.createdUser);
        }

        return this;
    }

    /**
     * Get createdUser
     * @return createdUser
     */
    public CreatedUser getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(CreatedUser createdUser) {
        this.createdUser = createdUser;
    }

    public UpdateDeviceResponse withLastUpdatedUser(LastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
        return this;
    }

    public UpdateDeviceResponse withLastUpdatedUser(Consumer<LastUpdatedUser> lastUpdatedUserSetter) {
        if (this.lastUpdatedUser == null) {
            this.lastUpdatedUser = new LastUpdatedUser();
            lastUpdatedUserSetter.accept(this.lastUpdatedUser);
        }

        return this;
    }

    /**
     * Get lastUpdatedUser
     * @return lastUpdatedUser
     */
    public LastUpdatedUser getLastUpdatedUser() {
        return lastUpdatedUser;
    }

    public void setLastUpdatedUser(LastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
    }

    public UpdateDeviceResponse withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateDeviceResponse addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateDeviceResponse withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public UpdateDeviceResponse withCreatedDatetime(Long createdDatetime) {
        this.createdDatetime = createdDatetime;
        return this;
    }

    /**
     * 创建时间，timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 999999999999999999
     * @return createdDatetime
     */
    public Long getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Long createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public UpdateDeviceResponse withLastUpdatedDatetime(Long lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
        return this;
    }

    /**
     * 最后修改时间，timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 999999999999999999
     * @return lastUpdatedDatetime
     */
    public Long getLastUpdatedDatetime() {
        return lastUpdatedDatetime;
    }

    public void setLastUpdatedDatetime(Long lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
    }

    public UpdateDeviceResponse withConnectAddress(String connectAddress) {
        this.connectAddress = connectAddress;
        return this;
    }

    /**
     * 设备接入地址
     * @return connectAddress
     */
    public String getConnectAddress() {
        return connectAddress;
    }

    public void setConnectAddress(String connectAddress) {
        this.connectAddress = connectAddress;
    }

    public UpdateDeviceResponse withSslConnectAddress(String sslConnectAddress) {
        this.sslConnectAddress = sslConnectAddress;
        return this;
    }

    /**
     * 设备接入SSL地址
     * @return sslConnectAddress
     */
    public String getSslConnectAddress() {
        return sslConnectAddress;
    }

    public void setSslConnectAddress(String sslConnectAddress) {
        this.sslConnectAddress = sslConnectAddress;
    }

    public UpdateDeviceResponse withIpv6ConnectAddress(String ipv6ConnectAddress) {
        this.ipv6ConnectAddress = ipv6ConnectAddress;
        return this;
    }

    /**
     * 设备接入IPV6地址
     * @return ipv6ConnectAddress
     */
    public String getIpv6ConnectAddress() {
        return ipv6ConnectAddress;
    }

    public void setIpv6ConnectAddress(String ipv6ConnectAddress) {
        this.ipv6ConnectAddress = ipv6ConnectAddress;
    }

    public UpdateDeviceResponse withIpv6SslConnectAddress(String ipv6SslConnectAddress) {
        this.ipv6SslConnectAddress = ipv6SslConnectAddress;
        return this;
    }

    /**
     * 设备接入IPV6 SSL地址
     * @return ipv6SslConnectAddress
     */
    public String getIpv6SslConnectAddress() {
        return ipv6SslConnectAddress;
    }

    public void setIpv6SslConnectAddress(String ipv6SslConnectAddress) {
        this.ipv6SslConnectAddress = ipv6SslConnectAddress;
    }

    public UpdateDeviceResponse withLastLoginDatetime(Long lastLoginDatetime) {
        this.lastLoginDatetime = lastLoginDatetime;
        return this;
    }

    /**
     * 最后登录时间
     * minimum: 1
     * maximum: 99999999999999999
     * @return lastLoginDatetime
     */
    public Long getLastLoginDatetime() {
        return lastLoginDatetime;
    }

    public void setLastLoginDatetime(Long lastLoginDatetime) {
        this.lastLoginDatetime = lastLoginDatetime;
    }

    public UpdateDeviceResponse withNodeType(Integer nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 节点类型 0-直连 1-网关 2-子设备
     * minimum: 1
     * maximum: 999999999999999999
     * @return nodeType
     */
    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public UpdateDeviceResponse withDeviceType(DeviceTypeEnum deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * 设备类型<br>0-普通设备（无子设备也无父设备）<br>1-网关设备(可挂载子设备)<br>2-子设备(归属于某个网关设备)
     * minimum: 0
     * maximum: 10
     * @return deviceType
     */
    public DeviceTypeEnum getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceTypeEnum deviceType) {
        this.deviceType = deviceType;
    }

    public UpdateDeviceResponse withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * 客户端ip
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public UpdateDeviceResponse withKeepAlive(String keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }

    /**
     * 心跳时间
     * @return keepAlive
     */
    public String getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(String keepAlive) {
        this.keepAlive = keepAlive;
    }

    public UpdateDeviceResponse withLastActiveTime(Long lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
        return this;
    }

    /**
     * 最后登录时间
     * minimum: 1
     * maximum: 99999999999999999
     * @return lastActiveTime
     */
    public Long getLastActiveTime() {
        return lastActiveTime;
    }

    public void setLastActiveTime(Long lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    public UpdateDeviceResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 设备版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public UpdateDeviceResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDeviceResponse updateDeviceResponse = (UpdateDeviceResponse) o;
        return Objects.equals(this.permissions, updateDeviceResponse.permissions)
            && Objects.equals(this.id, updateDeviceResponse.id)
            && Objects.equals(this.deviceId, updateDeviceResponse.deviceId)
            && Objects.equals(this.parentDeviceId, updateDeviceResponse.parentDeviceId)
            && Objects.equals(this.parentDeviceName, updateDeviceResponse.parentDeviceName)
            && Objects.equals(this.product, updateDeviceResponse.product)
            && Objects.equals(this.deviceName, updateDeviceResponse.deviceName)
            && Objects.equals(this.instanceId, updateDeviceResponse.instanceId)
            && Objects.equals(this.clientId, updateDeviceResponse.clientId)
            && Objects.equals(this.nodeId, updateDeviceResponse.nodeId)
            && Objects.equals(this.appName, updateDeviceResponse.appName)
            && Objects.equals(this.status, updateDeviceResponse.status)
            && Objects.equals(this.onlineStatus, updateDeviceResponse.onlineStatus)
            && Objects.equals(this.description, updateDeviceResponse.description)
            && Objects.equals(this.authentication, updateDeviceResponse.authentication)
            && Objects.equals(this.createdUser, updateDeviceResponse.createdUser)
            && Objects.equals(this.lastUpdatedUser, updateDeviceResponse.lastUpdatedUser)
            && Objects.equals(this.tags, updateDeviceResponse.tags)
            && Objects.equals(this.createdDatetime, updateDeviceResponse.createdDatetime)
            && Objects.equals(this.lastUpdatedDatetime, updateDeviceResponse.lastUpdatedDatetime)
            && Objects.equals(this.connectAddress, updateDeviceResponse.connectAddress)
            && Objects.equals(this.sslConnectAddress, updateDeviceResponse.sslConnectAddress)
            && Objects.equals(this.ipv6ConnectAddress, updateDeviceResponse.ipv6ConnectAddress)
            && Objects.equals(this.ipv6SslConnectAddress, updateDeviceResponse.ipv6SslConnectAddress)
            && Objects.equals(this.lastLoginDatetime, updateDeviceResponse.lastLoginDatetime)
            && Objects.equals(this.nodeType, updateDeviceResponse.nodeType)
            && Objects.equals(this.deviceType, updateDeviceResponse.deviceType)
            && Objects.equals(this.clientIp, updateDeviceResponse.clientIp)
            && Objects.equals(this.keepAlive, updateDeviceResponse.keepAlive)
            && Objects.equals(this.lastActiveTime, updateDeviceResponse.lastActiveTime)
            && Objects.equals(this.version, updateDeviceResponse.version)
            && Objects.equals(this.appId, updateDeviceResponse.appId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissions,
            id,
            deviceId,
            parentDeviceId,
            parentDeviceName,
            product,
            deviceName,
            instanceId,
            clientId,
            nodeId,
            appName,
            status,
            onlineStatus,
            description,
            authentication,
            createdUser,
            lastUpdatedUser,
            tags,
            createdDatetime,
            lastUpdatedDatetime,
            connectAddress,
            sslConnectAddress,
            ipv6ConnectAddress,
            ipv6SslConnectAddress,
            lastLoginDatetime,
            nodeType,
            deviceType,
            clientIp,
            keepAlive,
            lastActiveTime,
            version,
            appId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDeviceResponse {\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    parentDeviceId: ").append(toIndentedString(parentDeviceId)).append("\n");
        sb.append("    parentDeviceName: ").append(toIndentedString(parentDeviceName)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    onlineStatus: ").append(toIndentedString(onlineStatus)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
        sb.append("    createdUser: ").append(toIndentedString(createdUser)).append("\n");
        sb.append("    lastUpdatedUser: ").append(toIndentedString(lastUpdatedUser)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    createdDatetime: ").append(toIndentedString(createdDatetime)).append("\n");
        sb.append("    lastUpdatedDatetime: ").append(toIndentedString(lastUpdatedDatetime)).append("\n");
        sb.append("    connectAddress: ").append(toIndentedString(connectAddress)).append("\n");
        sb.append("    sslConnectAddress: ").append(toIndentedString(sslConnectAddress)).append("\n");
        sb.append("    ipv6ConnectAddress: ").append(toIndentedString(ipv6ConnectAddress)).append("\n");
        sb.append("    ipv6SslConnectAddress: ").append(toIndentedString(ipv6SslConnectAddress)).append("\n");
        sb.append("    lastLoginDatetime: ").append(toIndentedString(lastLoginDatetime)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    keepAlive: ").append(toIndentedString(keepAlive)).append("\n");
        sb.append("    lastActiveTime: ").append(toIndentedString(lastActiveTime)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
