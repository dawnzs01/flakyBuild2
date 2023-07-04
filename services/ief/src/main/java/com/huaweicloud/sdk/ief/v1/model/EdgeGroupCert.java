package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 边缘节点组证书
 */
public class EdgeGroupCert {

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
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_deleted")

    private Boolean isDeleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_num")

    private String serialNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca")

    private String ca;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package")

    private String _package;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_remaining_valid_time")

    private Integer certRemainingValidTime;

    public EdgeGroupCert withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 证书ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EdgeGroupCert withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 证书名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EdgeGroupCert withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 证书描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EdgeGroupCert withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public EdgeGroupCert withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public EdgeGroupCert withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 证书绑定的边缘节点组ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public EdgeGroupCert withIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * 证书是否处于删除中
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public EdgeGroupCert withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 证书所属账号的项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public EdgeGroupCert withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 证书类型，包含： - system：创建节点时会默认创建一套系统证书 - application：应用证书 - device：设备证书
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EdgeGroupCert withSerialNum(String serialNum) {
        this.serialNum = serialNum;
        return this;
    }

    /**
     * 证书序列号
     * @return serialNum
     */
    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public EdgeGroupCert withCa(String ca) {
        this.ca = ca;
        return this;
    }

    /**
     * 根证书
     * @return ca
     */
    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public EdgeGroupCert withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * 证书
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public EdgeGroupCert withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * 私钥
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public EdgeGroupCert withPackage(String _package) {
        this._package = _package;
        return this;
    }

    /**
     * 将证书文件certificate/ca/private_key打成.tar.gz包后用base64编码的字符串。 使用时请使用base64解码成.tar.gz包。
     * @return _package
     */
    public String getPackage() {
        return _package;
    }

    public void setPackage(String _package) {
        this._package = _package;
    }

    public EdgeGroupCert withCertRemainingValidTime(Integer certRemainingValidTime) {
        this.certRemainingValidTime = certRemainingValidTime;
        return this;
    }

    /**
     * 证书有效期持续时间
     * @return certRemainingValidTime
     */
    public Integer getCertRemainingValidTime() {
        return certRemainingValidTime;
    }

    public void setCertRemainingValidTime(Integer certRemainingValidTime) {
        this.certRemainingValidTime = certRemainingValidTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgeGroupCert edgeGroupCert = (EdgeGroupCert) o;
        return Objects.equals(this.id, edgeGroupCert.id) && Objects.equals(this.name, edgeGroupCert.name)
            && Objects.equals(this.description, edgeGroupCert.description)
            && Objects.equals(this.createdAt, edgeGroupCert.createdAt)
            && Objects.equals(this.updatedAt, edgeGroupCert.updatedAt)
            && Objects.equals(this.groupId, edgeGroupCert.groupId)
            && Objects.equals(this.isDeleted, edgeGroupCert.isDeleted)
            && Objects.equals(this.projectId, edgeGroupCert.projectId) && Objects.equals(this.type, edgeGroupCert.type)
            && Objects.equals(this.serialNum, edgeGroupCert.serialNum) && Objects.equals(this.ca, edgeGroupCert.ca)
            && Objects.equals(this.certificate, edgeGroupCert.certificate)
            && Objects.equals(this.privateKey, edgeGroupCert.privateKey)
            && Objects.equals(this._package, edgeGroupCert._package)
            && Objects.equals(this.certRemainingValidTime, edgeGroupCert.certRemainingValidTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            createdAt,
            updatedAt,
            groupId,
            isDeleted,
            projectId,
            type,
            serialNum,
            ca,
            certificate,
            privateKey,
            _package,
            certRemainingValidTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeGroupCert {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    serialNum: ").append(toIndentedString(serialNum)).append("\n");
        sb.append("    ca: ").append(toIndentedString(ca)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
        sb.append("    certRemainingValidTime: ").append(toIndentedString(certRemainingValidTime)).append("\n");
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
