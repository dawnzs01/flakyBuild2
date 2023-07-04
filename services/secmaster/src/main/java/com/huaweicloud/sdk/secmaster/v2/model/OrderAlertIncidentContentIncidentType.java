package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 事件类型
 */
public class OrderAlertIncidentContentIncidentType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layoutId")

    private String layoutId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_type")

    private String incidentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    public OrderAlertIncidentContentIncidentType withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Id value
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrderAlertIncidentContentIncidentType withLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }

    /**
     * Id value
     * @return layoutId
     */
    public String getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    public OrderAlertIncidentContentIncidentType withIncidentType(String incidentType) {
        this.incidentType = incidentType;
        return this;
    }

    /**
     * Id value
     * @return incidentType
     */
    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public OrderAlertIncidentContentIncidentType withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Id value
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderAlertIncidentContentIncidentType orderAlertIncidentContentIncidentType =
            (OrderAlertIncidentContentIncidentType) o;
        return Objects.equals(this.id, orderAlertIncidentContentIncidentType.id)
            && Objects.equals(this.layoutId, orderAlertIncidentContentIncidentType.layoutId)
            && Objects.equals(this.incidentType, orderAlertIncidentContentIncidentType.incidentType)
            && Objects.equals(this.category, orderAlertIncidentContentIncidentType.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, layoutId, incidentType, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderAlertIncidentContentIncidentType {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    layoutId: ").append(toIndentedString(layoutId)).append("\n");
        sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
