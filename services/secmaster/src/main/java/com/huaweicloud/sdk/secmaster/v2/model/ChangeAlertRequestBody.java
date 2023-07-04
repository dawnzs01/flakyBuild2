package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChangeAlertRequestBody
 */
public class ChangeAlertRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object")

    private Alert dataObject;

    public ChangeAlertRequestBody withDataObject(Alert dataObject) {
        this.dataObject = dataObject;
        return this;
    }

    public ChangeAlertRequestBody withDataObject(Consumer<Alert> dataObjectSetter) {
        if (this.dataObject == null) {
            this.dataObject = new Alert();
            dataObjectSetter.accept(this.dataObject);
        }

        return this;
    }

    /**
     * Get dataObject
     * @return dataObject
     */
    public Alert getDataObject() {
        return dataObject;
    }

    public void setDataObject(Alert dataObject) {
        this.dataObject = dataObject;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeAlertRequestBody changeAlertRequestBody = (ChangeAlertRequestBody) o;
        return Objects.equals(this.dataObject, changeAlertRequestBody.dataObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeAlertRequestBody {\n");
        sb.append("    dataObject: ").append(toIndentedString(dataObject)).append("\n");
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
