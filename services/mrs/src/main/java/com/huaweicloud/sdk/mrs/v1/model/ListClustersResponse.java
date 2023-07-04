package com.huaweicloud.sdk.mrs.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v1.model.Cluster;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListClustersResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clusterTotal")
    

    private Integer clusterTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clusters")
    
    private List<Cluster> clusters = null;
    
    public ListClustersResponse withClusterTotal(Integer clusterTotal) {
        this.clusterTotal = clusterTotal;
        return this;
    }

    


    /**
     * 集群列表总数。
     * @return clusterTotal
     */
    public Integer getClusterTotal() {
        return clusterTotal;
    }

    public void setClusterTotal(Integer clusterTotal) {
        this.clusterTotal = clusterTotal;
    }

    

    public ListClustersResponse withClusters(List<Cluster> clusters) {
        this.clusters = clusters;
        return this;
    }

    
    public ListClustersResponse addClustersItem(Cluster clustersItem) {
        if(this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        this.clusters.add(clustersItem);
        return this;
    }

    public ListClustersResponse withClusters(Consumer<List<Cluster>> clustersSetter) {
        if(this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        clustersSetter.accept(this.clusters);
        return this;
    }

    /**
     * 集群参数。
     * @return clusters
     */
    public List<Cluster> getClusters() {
        return clusters;
    }

    public void setClusters(List<Cluster> clusters) {
        this.clusters = clusters;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListClustersResponse listClustersResponse = (ListClustersResponse) o;
        return Objects.equals(this.clusterTotal, listClustersResponse.clusterTotal) &&
            Objects.equals(this.clusters, listClustersResponse.clusters);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clusterTotal, clusters);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClustersResponse {\n");
        sb.append("    clusterTotal: ").append(toIndentedString(clusterTotal)).append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

