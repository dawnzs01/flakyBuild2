package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteResourceTagRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    public DeleteResourceTagRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，目前有:  smn_topic，主题。  smn_sms，短信。  smn_application，移动推送。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public DeleteResourceTagRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID。  获取resource_id的方法：  当resource_type为“smn_topic”时， 手动添加请求消息头“X-SMN-RESOURCEID-TYPE=name”，资源ID即为topic名称。 不添加请求消息头，通过“查询资源实例”，获取资源ID。 当resource_type为“smn_sms”时，resource_id为签名ID。您可在控制台获取。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public DeleteResourceTagRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 待删除标签的key值。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteResourceTagRequest deleteResourceTagRequest = (DeleteResourceTagRequest) o;
        return Objects.equals(this.resourceType, deleteResourceTagRequest.resourceType)
            && Objects.equals(this.resourceId, deleteResourceTagRequest.resourceId)
            && Objects.equals(this.key, deleteResourceTagRequest.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceId, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteResourceTagRequest {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
