package com.huaweicloud.sdk.aom.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v1.model.ScriptVersion;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAllVersionByVersionIdResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="elements")
    
    private List<ScriptVersion> elements = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_elements")
    

    private Integer totalElements;

    public ListAllVersionByVersionIdResponse withElements(List<ScriptVersion> elements) {
        this.elements = elements;
        return this;
    }

    
    public ListAllVersionByVersionIdResponse addElementsItem(ScriptVersion elementsItem) {
        if(this.elements == null) {
            this.elements = new ArrayList<>();
        }
        this.elements.add(elementsItem);
        return this;
    }

    public ListAllVersionByVersionIdResponse withElements(Consumer<List<ScriptVersion>> elementsSetter) {
        if(this.elements == null) {
            this.elements = new ArrayList<>();
        }
        elementsSetter.accept(this.elements);
        return this;
    }

    /**
     * 查询结果集合。
     * @return elements
     */
    public List<ScriptVersion> getElements() {
        return elements;
    }

    public void setElements(List<ScriptVersion> elements) {
        this.elements = elements;
    }

    

    public ListAllVersionByVersionIdResponse withTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    


    /**
     * 查询到的结果数量。
     * minimum: 0
     * maximum: 9999999
     * @return totalElements
     */
    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAllVersionByVersionIdResponse listAllVersionByVersionIdResponse = (ListAllVersionByVersionIdResponse) o;
        return Objects.equals(this.elements, listAllVersionByVersionIdResponse.elements) &&
            Objects.equals(this.totalElements, listAllVersionByVersionIdResponse.totalElements);
    }
    @Override
    public int hashCode() {
        return Objects.hash(elements, totalElements);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllVersionByVersionIdResponse {\n");
        sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
        sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
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

