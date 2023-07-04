package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RecyclePolicy
 */
public class RecyclePolicy  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="retention_period_in_days")
    

    private Integer retentionPeriodInDays;

    public RecyclePolicy withRetentionPeriodInDays(Integer retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
        return this;
    }

    


    /**
     * 已删除实例保留天数，可设置范围为1~7天。 - 取值1~7，设置已删除实例的保留天数为该值。
     * @return retentionPeriodInDays
     */
    public Integer getRetentionPeriodInDays() {
        return retentionPeriodInDays;
    }

    public void setRetentionPeriodInDays(Integer retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecyclePolicy recyclePolicy = (RecyclePolicy) o;
        return Objects.equals(this.retentionPeriodInDays, recyclePolicy.retentionPeriodInDays);
    }
    @Override
    public int hashCode() {
        return Objects.hash(retentionPeriodInDays);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecyclePolicy {\n");
        sb.append("    retentionPeriodInDays: ").append(toIndentedString(retentionPeriodInDays)).append("\n");
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

