package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.BindedEipResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListBindedEipsResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ips")
    
    private List<BindedEipResult> publicIps = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    

    private Integer totalCount;

    public ListBindedEipsResponse withPublicIps(List<BindedEipResult> publicIps) {
        this.publicIps = publicIps;
        return this;
    }

    
    public ListBindedEipsResponse addPublicIpsItem(BindedEipResult publicIpsItem) {
        if(this.publicIps == null) {
            this.publicIps = new ArrayList<>();
        }
        this.publicIps.add(publicIpsItem);
        return this;
    }

    public ListBindedEipsResponse withPublicIps(Consumer<List<BindedEipResult>> publicIpsSetter) {
        if(this.publicIps == null) {
            this.publicIps = new ArrayList<>();
        }
        publicIpsSetter.accept(this.publicIps);
        return this;
    }

    /**
     * 查询实例已绑定EIP列表。
     * @return publicIps
     */
    public List<BindedEipResult> getPublicIps() {
        return publicIps;
    }

    public void setPublicIps(List<BindedEipResult> publicIps) {
        this.publicIps = publicIps;
    }

    

    public ListBindedEipsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBindedEipsResponse listBindedEipsResponse = (ListBindedEipsResponse) o;
        return Objects.equals(this.publicIps, listBindedEipsResponse.publicIps) &&
            Objects.equals(this.totalCount, listBindedEipsResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publicIps, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBindedEipsResponse {\n");
        sb.append("    publicIps: ").append(toIndentedString(publicIps)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

