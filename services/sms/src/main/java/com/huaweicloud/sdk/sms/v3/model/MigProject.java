package com.huaweicloud.sdk.sms.v3.model;

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
 * SMS迁移项目信息
 */
public class MigProject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isdefault")

    private Boolean isdefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private TemplateResponseBody template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_target_server")

    private Boolean startTargetServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_limit")

    private Integer speedLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_public_ip")

    private Boolean usePublicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exist_server")

    private Boolean existServer;

    /**
     * 迁移项目类型 MIGRATE_BLOCK:块级迁移 MIGRATE_FILE:文件级迁移
     */
    public static final class TypeEnum {

        /**
         * Enum MIGRATE_BLOCK for value: "MIGRATE_BLOCK"
         */
        public static final TypeEnum MIGRATE_BLOCK = new TypeEnum("MIGRATE_BLOCK");

        /**
         * Enum MIGRATE_FILE for value: "MIGRATE_FILE"
         */
        public static final TypeEnum MIGRATE_FILE = new TypeEnum("MIGRATE_FILE");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("MIGRATE_BLOCK", MIGRATE_BLOCK);
            map.put("MIGRATE_FILE", MIGRATE_FILE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project")

    private String enterpriseProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "syncing")

    private Boolean syncing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_network_check")

    private Boolean startNetworkCheck;

    public MigProject withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 迁移项目ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MigProject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 迁移项目名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MigProject withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 迁移项目描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MigProject withIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
        return this;
    }

    /**
     * 是否为默认模板
     * @return isdefault
     */
    public Boolean getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }

    public MigProject withTemplate(TemplateResponseBody template) {
        this.template = template;
        return this;
    }

    public MigProject withTemplate(Consumer<TemplateResponseBody> templateSetter) {
        if (this.template == null) {
            this.template = new TemplateResponseBody();
            templateSetter.accept(this.template);
        }

        return this;
    }

    /**
     * Get template
     * @return template
     */
    public TemplateResponseBody getTemplate() {
        return template;
    }

    public void setTemplate(TemplateResponseBody template) {
        this.template = template;
    }

    public MigProject withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域名称
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public MigProject withStartTargetServer(Boolean startTargetServer) {
        this.startTargetServer = startTargetServer;
        return this;
    }

    /**
     * 迁移后是否启动目的端虚拟机
     * @return startTargetServer
     */
    public Boolean getStartTargetServer() {
        return startTargetServer;
    }

    public void setStartTargetServer(Boolean startTargetServer) {
        this.startTargetServer = startTargetServer;
    }

    public MigProject withSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }

    /**
     * 限制迁移速率，单位：Mbps
     * minimum: 0
     * maximum: 10000
     * @return speedLimit
     */
    public Integer getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
    }

    public MigProject withUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
        return this;
    }

    /**
     * 是否使用公网IP迁移
     * @return usePublicIp
     */
    public Boolean getUsePublicIp() {
        return usePublicIp;
    }

    public void setUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
    }

    public MigProject withExistServer(Boolean existServer) {
        this.existServer = existServer;
        return this;
    }

    /**
     * 是否是已经存在的服务器
     * @return existServer
     */
    public Boolean getExistServer() {
        return existServer;
    }

    public void setExistServer(Boolean existServer) {
        this.existServer = existServer;
    }

    public MigProject withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 迁移项目类型 MIGRATE_BLOCK:块级迁移 MIGRATE_FILE:文件级迁移
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public MigProject withEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
        return this;
    }

    /**
     * 企业项目名称
     * @return enterpriseProject
     */
    public String getEnterpriseProject() {
        return enterpriseProject;
    }

    public void setEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
    }

    public MigProject withSyncing(Boolean syncing) {
        this.syncing = syncing;
        return this;
    }

    /**
     * 首次复制或者同步后 是否继续持续同步
     * @return syncing
     */
    public Boolean getSyncing() {
        return syncing;
    }

    public void setSyncing(Boolean syncing) {
        this.syncing = syncing;
    }

    public MigProject withStartNetworkCheck(Boolean startNetworkCheck) {
        this.startNetworkCheck = startNetworkCheck;
        return this;
    }

    /**
     * 是否启动网络质量检测
     * @return startNetworkCheck
     */
    public Boolean getStartNetworkCheck() {
        return startNetworkCheck;
    }

    public void setStartNetworkCheck(Boolean startNetworkCheck) {
        this.startNetworkCheck = startNetworkCheck;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigProject migProject = (MigProject) o;
        return Objects.equals(this.id, migProject.id) && Objects.equals(this.name, migProject.name)
            && Objects.equals(this.description, migProject.description)
            && Objects.equals(this.isdefault, migProject.isdefault)
            && Objects.equals(this.template, migProject.template) && Objects.equals(this.region, migProject.region)
            && Objects.equals(this.startTargetServer, migProject.startTargetServer)
            && Objects.equals(this.speedLimit, migProject.speedLimit)
            && Objects.equals(this.usePublicIp, migProject.usePublicIp)
            && Objects.equals(this.existServer, migProject.existServer) && Objects.equals(this.type, migProject.type)
            && Objects.equals(this.enterpriseProject, migProject.enterpriseProject)
            && Objects.equals(this.syncing, migProject.syncing)
            && Objects.equals(this.startNetworkCheck, migProject.startNetworkCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            isdefault,
            template,
            region,
            startTargetServer,
            speedLimit,
            usePublicIp,
            existServer,
            type,
            enterpriseProject,
            syncing,
            startNetworkCheck);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigProject {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isdefault: ").append(toIndentedString(isdefault)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    startTargetServer: ").append(toIndentedString(startTargetServer)).append("\n");
        sb.append("    speedLimit: ").append(toIndentedString(speedLimit)).append("\n");
        sb.append("    usePublicIp: ").append(toIndentedString(usePublicIp)).append("\n");
        sb.append("    existServer: ").append(toIndentedString(existServer)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enterpriseProject: ").append(toIndentedString(enterpriseProject)).append("\n");
        sb.append("    syncing: ").append(toIndentedString(syncing)).append("\n");
        sb.append("    startNetworkCheck: ").append(toIndentedString(startNetworkCheck)).append("\n");
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
