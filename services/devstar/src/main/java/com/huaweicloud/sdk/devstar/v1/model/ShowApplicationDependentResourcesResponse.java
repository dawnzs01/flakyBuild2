package com.huaweicloud.sdk.devstar.v1.model;

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
public class ShowApplicationDependentResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependent_services")

    private List<ResouceInfo> dependentServices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ShowApplicationDependentResourcesResponse withDependentServices(List<ResouceInfo> dependentServices) {
        this.dependentServices = dependentServices;
        return this;
    }

    public ShowApplicationDependentResourcesResponse addDependentServicesItem(ResouceInfo dependentServicesItem) {
        if (this.dependentServices == null) {
            this.dependentServices = new ArrayList<>();
        }
        this.dependentServices.add(dependentServicesItem);
        return this;
    }

    public ShowApplicationDependentResourcesResponse withDependentServices(
        Consumer<List<ResouceInfo>> dependentServicesSetter) {
        if (this.dependentServices == null) {
            this.dependentServices = new ArrayList<>();
        }
        dependentServicesSetter.accept(this.dependentServices);
        return this;
    }

    /**
     * 依赖云资源信息
     * @return dependentServices
     */
    public List<ResouceInfo> getDependentServices() {
        return dependentServices;
    }

    public void setDependentServices(List<ResouceInfo> dependentServices) {
        this.dependentServices = dependentServices;
    }

    public ShowApplicationDependentResourcesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 资源总个数
     * minimum: 0
     * maximum: 1000100
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
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
        ShowApplicationDependentResourcesResponse showApplicationDependentResourcesResponse =
            (ShowApplicationDependentResourcesResponse) o;
        return Objects.equals(this.dependentServices, showApplicationDependentResourcesResponse.dependentServices)
            && Objects.equals(this.count, showApplicationDependentResourcesResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dependentServices, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowApplicationDependentResourcesResponse {\n");
        sb.append("    dependentServices: ").append(toIndentedString(dependentServices)).append("\n");
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
