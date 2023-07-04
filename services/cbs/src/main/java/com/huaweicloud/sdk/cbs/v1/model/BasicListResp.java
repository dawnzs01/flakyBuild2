package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class BasicListResp  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota")
    

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    

    private Integer count;

    public BasicListResp withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    


    /**
     * 配额
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    

    public BasicListResp withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public BasicListResp withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 偏移
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public BasicListResp withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 返回数量
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
        BasicListResp basicListResp = (BasicListResp) o;
        return Objects.equals(this.quota, basicListResp.quota) &&
            Objects.equals(this.total, basicListResp.total) &&
            Objects.equals(this.offset, basicListResp.offset) &&
            Objects.equals(this.count, basicListResp.count);
    }
    @Override
    public int hashCode() {
        return Objects.hash(quota, total, offset, count);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasicListResp {\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

