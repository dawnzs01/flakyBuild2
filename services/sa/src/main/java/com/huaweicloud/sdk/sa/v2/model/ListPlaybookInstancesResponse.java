package com.huaweicloud.sdk.sa.v2.model;

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
public class ListPlaybookInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<PlaybookInstanceInfo> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListPlaybookInstancesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * tatal count
     * minimum: 0
     * maximum: 99999
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListPlaybookInstancesResponse withInstances(List<PlaybookInstanceInfo> instances) {
        this.instances = instances;
        return this;
    }

    public ListPlaybookInstancesResponse addInstancesItem(PlaybookInstanceInfo instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListPlaybookInstancesResponse withInstances(Consumer<List<PlaybookInstanceInfo>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * list of informations of PlaybookInstanceInfo
     * @return instances
     */
    public List<PlaybookInstanceInfo> getInstances() {
        return instances;
    }

    public void setInstances(List<PlaybookInstanceInfo> instances) {
        this.instances = instances;
    }

    public ListPlaybookInstancesResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPlaybookInstancesResponse listPlaybookInstancesResponse = (ListPlaybookInstancesResponse) o;
        return Objects.equals(this.count, listPlaybookInstancesResponse.count)
            && Objects.equals(this.instances, listPlaybookInstancesResponse.instances)
            && Objects.equals(this.xRequestId, listPlaybookInstancesResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, instances, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPlaybookInstancesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
