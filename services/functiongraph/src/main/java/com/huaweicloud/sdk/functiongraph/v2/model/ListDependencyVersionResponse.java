package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDependencyVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependencies")

    private List<ListDependenciesResult> dependencies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private Long nextMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ListDependencyVersionResponse withDependencies(List<ListDependenciesResult> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    public ListDependencyVersionResponse addDependenciesItem(ListDependenciesResult dependenciesItem) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        this.dependencies.add(dependenciesItem);
        return this;
    }

    public ListDependencyVersionResponse withDependencies(Consumer<List<ListDependenciesResult>> dependenciesSetter) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        dependenciesSetter.accept(this.dependencies);
        return this;
    }

    /**
     * 依赖包列表
     * @return dependencies
     */
    public List<ListDependenciesResult> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<ListDependenciesResult> dependencies) {
        this.dependencies = dependencies;
    }

    public ListDependencyVersionResponse withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 下次读取位置
     * @return nextMarker
     */
    public Long getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
    }

    public ListDependencyVersionResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 依赖包总数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDependencyVersionResponse listDependencyVersionResponse = (ListDependencyVersionResponse) o;
        return Objects.equals(this.dependencies, listDependencyVersionResponse.dependencies)
            && Objects.equals(this.nextMarker, listDependencyVersionResponse.nextMarker)
            && Objects.equals(this.count, listDependencyVersionResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dependencies, nextMarker, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDependencyVersionResponse {\n");
        sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
