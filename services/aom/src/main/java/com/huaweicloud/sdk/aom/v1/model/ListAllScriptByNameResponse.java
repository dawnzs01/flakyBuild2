package com.huaweicloud.sdk.aom.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v1.model.Script;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAllScriptByNameResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="elements")
    
    private List<Script> elements = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_elements")
    

    private Integer totalElements;

    public ListAllScriptByNameResponse withElements(List<Script> elements) {
        this.elements = elements;
        return this;
    }

    
    public ListAllScriptByNameResponse addElementsItem(Script elementsItem) {
        if(this.elements == null) {
            this.elements = new ArrayList<>();
        }
        this.elements.add(elementsItem);
        return this;
    }

    public ListAllScriptByNameResponse withElements(Consumer<List<Script>> elementsSetter) {
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
    public List<Script> getElements() {
        return elements;
    }

    public void setElements(List<Script> elements) {
        this.elements = elements;
    }

    

    public ListAllScriptByNameResponse withTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    


    /**
     * 查询到的结果数量。
     * minimum: 0
     * maximum: 99999999
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
        ListAllScriptByNameResponse listAllScriptByNameResponse = (ListAllScriptByNameResponse) o;
        return Objects.equals(this.elements, listAllScriptByNameResponse.elements) &&
            Objects.equals(this.totalElements, listAllScriptByNameResponse.totalElements);
    }
    @Override
    public int hashCode() {
        return Objects.hash(elements, totalElements);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllScriptByNameResponse {\n");
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

