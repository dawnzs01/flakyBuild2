package com.huaweicloud.sdk.servicestage.v3.model;

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
 * EnvironmentListView
 */
public class EnvironmentListView {

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
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    /**
     * Gets or Sets deployMode
     */
    public static final class DeployModeEnum {

        /**
         * Enum CONTAINER for value: "container"
         */
        public static final DeployModeEnum CONTAINER = new DeployModeEnum("container");

        /**
         * Enum VIRTUALMACHINE for value: "virtualmachine"
         */
        public static final DeployModeEnum VIRTUALMACHINE = new DeployModeEnum("virtualmachine");

        /**
         * Enum MIXED for value: "mixed"
         */
        public static final DeployModeEnum MIXED = new DeployModeEnum("mixed");

        private static final Map<String, DeployModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeployModeEnum> createStaticFields() {
            Map<String, DeployModeEnum> map = new HashMap<>();
            map.put("container", CONTAINER);
            map.put("virtualmachine", VIRTUALMACHINE);
            map.put("mixed", MIXED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeployModeEnum(String value) {
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
        public static DeployModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DeployModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeployModeEnum(value);
            }
            return result;
        }

        public static DeployModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DeployModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeployModeEnum) {
                return this.value.equals(((DeployModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_mode")

    private DeployModeEnum deployMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<EnvironmentViewLabels> labels = null;

    public EnvironmentListView withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EnvironmentListView withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnvironmentListView withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EnvironmentListView withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * Get enterpriseProjectId
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public EnvironmentListView withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * Get vpcId
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public EnvironmentListView withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public EnvironmentListView withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public EnvironmentListView withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public EnvironmentListView withDeployMode(DeployModeEnum deployMode) {
        this.deployMode = deployMode;
        return this;
    }

    /**
     * Get deployMode
     * @return deployMode
     */
    public DeployModeEnum getDeployMode() {
        return deployMode;
    }

    public void setDeployMode(DeployModeEnum deployMode) {
        this.deployMode = deployMode;
    }

    public EnvironmentListView withLabels(List<EnvironmentViewLabels> labels) {
        this.labels = labels;
        return this;
    }

    public EnvironmentListView addLabelsItem(EnvironmentViewLabels labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public EnvironmentListView withLabels(Consumer<List<EnvironmentViewLabels>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    public List<EnvironmentViewLabels> getLabels() {
        return labels;
    }

    public void setLabels(List<EnvironmentViewLabels> labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvironmentListView environmentListView = (EnvironmentListView) o;
        return Objects.equals(this.id, environmentListView.id) && Objects.equals(this.name, environmentListView.name)
            && Objects.equals(this.description, environmentListView.description)
            && Objects.equals(this.enterpriseProjectId, environmentListView.enterpriseProjectId)
            && Objects.equals(this.vpcId, environmentListView.vpcId)
            && Objects.equals(this.creator, environmentListView.creator)
            && Objects.equals(this.createTime, environmentListView.createTime)
            && Objects.equals(this.updateTime, environmentListView.updateTime)
            && Objects.equals(this.deployMode, environmentListView.deployMode)
            && Objects.equals(this.labels, environmentListView.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            enterpriseProjectId,
            vpcId,
            creator,
            createTime,
            updateTime,
            deployMode,
            labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvironmentListView {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    deployMode: ").append(toIndentedString(deployMode)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
