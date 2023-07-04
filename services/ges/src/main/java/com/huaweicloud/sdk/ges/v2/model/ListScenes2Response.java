package com.huaweicloud.sdk.ges.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.ListScenesRespResults;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListScenes2Response extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="results")
    
    private List<ListScenesRespResults> results = null;
    
    public ListScenes2Response withResults(List<ListScenesRespResults> results) {
        this.results = results;
        return this;
    }

    
    public ListScenes2Response addResultsItem(ListScenesRespResults resultsItem) {
        if(this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public ListScenes2Response withResults(Consumer<List<ListScenesRespResults>> resultsSetter) {
        if(this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * scene场景分析插件信息。
     * @return results
     */
    public List<ListScenesRespResults> getResults() {
        return results;
    }

    public void setResults(List<ListScenesRespResults> results) {
        this.results = results;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScenes2Response listScenes2Response = (ListScenes2Response) o;
        return Objects.equals(this.results, listScenes2Response.results);
    }
    @Override
    public int hashCode() {
        return Objects.hash(results);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScenes2Response {\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

