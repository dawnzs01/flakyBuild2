package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeleteRelationsReq
 */
public class DeleteRelationsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_id")

    private String relatedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    public DeleteRelationsReq withRelatedId(String relatedId) {
        this.relatedId = relatedId;
        return this;
    }

    /**
     * 要解除关联的工单id
     * @return relatedId
     */
    public String getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(String relatedId) {
        this.relatedId = relatedId;
    }

    public DeleteRelationsReq withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteRelationsReq deleteRelationsReq = (DeleteRelationsReq) o;
        return Objects.equals(this.relatedId, deleteRelationsReq.relatedId)
            && Objects.equals(this.groupId, deleteRelationsReq.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relatedId, groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteRelationsReq {\n");
        sb.append("    relatedId: ").append(toIndentedString(relatedId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
