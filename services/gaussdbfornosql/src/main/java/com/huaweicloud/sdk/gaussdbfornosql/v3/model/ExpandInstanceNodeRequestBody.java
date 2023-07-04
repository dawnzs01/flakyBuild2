package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExpandInstanceNodeRequestBody
 */
public class ExpandInstanceNodeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private String isAutoPay;

    public ExpandInstanceNodeRequestBody withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * 新增加的节点数量。
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public ExpandInstanceNodeRequestBody withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 扩容的节点所使用的子网的ID。 - 该参数仅只支持GaussDB(for Cassandra)数据库实例扩容节点时传入。 - 所传入的子网ID必须属于实例当前所在的VPC。 - 不传该参数时，系统会在当前实例所使用的子网中为当前扩容的节点选择一个IP容量较为充足的子网。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ExpandInstanceNodeRequestBody withIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 创建包周期实例时可指定，表示是否自动从账户中支付，此字段不影响自动续订的支付方式。 - true，表示自动从账户中支付。 - false，表示手动从账户中支付，默认为该方式。
     * @return isAutoPay
     */
    public String getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExpandInstanceNodeRequestBody expandInstanceNodeRequestBody = (ExpandInstanceNodeRequestBody) o;
        return Objects.equals(this.num, expandInstanceNodeRequestBody.num)
            && Objects.equals(this.subnetId, expandInstanceNodeRequestBody.subnetId)
            && Objects.equals(this.isAutoPay, expandInstanceNodeRequestBody.isAutoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, subnetId, isAutoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandInstanceNodeRequestBody {\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
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
