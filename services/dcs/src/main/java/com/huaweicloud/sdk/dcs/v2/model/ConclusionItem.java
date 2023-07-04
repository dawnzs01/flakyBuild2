package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 诊断结论
 */
public class ConclusionItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private Map<String, String> params = null;

    public ConclusionItem withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 结论id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ConclusionItem withParams(Map<String, String> params) {
        this.params = params;
        return this;
    }

    public ConclusionItem putParamsItem(String key, String paramsItem) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        this.params.put(key, paramsItem);
        return this;
    }

    public ConclusionItem withParams(Consumer<Map<String, String>> paramsSetter) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 结论参数
     * @return params
     */
    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConclusionItem conclusionItem = (ConclusionItem) o;
        return Objects.equals(this.id, conclusionItem.id) && Objects.equals(this.params, conclusionItem.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConclusionItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
