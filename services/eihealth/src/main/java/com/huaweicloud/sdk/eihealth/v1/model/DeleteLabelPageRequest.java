package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteLabelPageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_page_id")

    private String labelPageId;

    public DeleteLabelPageRequest withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 医疗智能体平台项目ID，您可以在EIHealth平台单击所需的项目名称，进入项目设置页面查看。
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public DeleteLabelPageRequest withLabelPageId(String labelPageId) {
        this.labelPageId = labelPageId;
        return this;
    }

    /**
     * 标签页面id
     * @return labelPageId
     */
    public String getLabelPageId() {
        return labelPageId;
    }

    public void setLabelPageId(String labelPageId) {
        this.labelPageId = labelPageId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteLabelPageRequest deleteLabelPageRequest = (DeleteLabelPageRequest) o;
        return Objects.equals(this.eihealthProjectId, deleteLabelPageRequest.eihealthProjectId)
            && Objects.equals(this.labelPageId, deleteLabelPageRequest.labelPageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eihealthProjectId, labelPageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteLabelPageRequest {\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    labelPageId: ").append(toIndentedString(labelPageId)).append("\n");
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
