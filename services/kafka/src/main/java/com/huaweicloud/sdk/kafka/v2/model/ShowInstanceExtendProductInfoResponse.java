package com.huaweicloud.sdk.kafka.v2.model;

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
public class ShowInstanceExtendProductInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hourly")

    private List<ShowInstanceExtendProductInfoRespHourly> hourly = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monthly")

    private List<ShowInstanceExtendProductInfoRespHourly> monthly = null;

    public ShowInstanceExtendProductInfoResponse withHourly(List<ShowInstanceExtendProductInfoRespHourly> hourly) {
        this.hourly = hourly;
        return this;
    }

    public ShowInstanceExtendProductInfoResponse addHourlyItem(ShowInstanceExtendProductInfoRespHourly hourlyItem) {
        if (this.hourly == null) {
            this.hourly = new ArrayList<>();
        }
        this.hourly.add(hourlyItem);
        return this;
    }

    public ShowInstanceExtendProductInfoResponse withHourly(
        Consumer<List<ShowInstanceExtendProductInfoRespHourly>> hourlySetter) {
        if (this.hourly == null) {
            this.hourly = new ArrayList<>();
        }
        hourlySetter.accept(this.hourly);
        return this;
    }

    /**
     * 表示[按需付费的](tag:hws,hws_hk,hws_ocb,ctc,sbc,hk_sbc,cmcc,g42,tm,hk_g42,hk_tm)产品列表。
     * @return hourly
     */
    public List<ShowInstanceExtendProductInfoRespHourly> getHourly() {
        return hourly;
    }

    public void setHourly(List<ShowInstanceExtendProductInfoRespHourly> hourly) {
        this.hourly = hourly;
    }

    public ShowInstanceExtendProductInfoResponse withMonthly(List<ShowInstanceExtendProductInfoRespHourly> monthly) {
        this.monthly = monthly;
        return this;
    }

    public ShowInstanceExtendProductInfoResponse addMonthlyItem(ShowInstanceExtendProductInfoRespHourly monthlyItem) {
        if (this.monthly == null) {
            this.monthly = new ArrayList<>();
        }
        this.monthly.add(monthlyItem);
        return this;
    }

    public ShowInstanceExtendProductInfoResponse withMonthly(
        Consumer<List<ShowInstanceExtendProductInfoRespHourly>> monthlySetter) {
        if (this.monthly == null) {
            this.monthly = new ArrayList<>();
        }
        monthlySetter.accept(this.monthly);
        return this;
    }

    /**
     * 表示包年包月的产品列表。当前暂不支持通过API创建包年包月的Kafka实例。
     * @return monthly
     */
    public List<ShowInstanceExtendProductInfoRespHourly> getMonthly() {
        return monthly;
    }

    public void setMonthly(List<ShowInstanceExtendProductInfoRespHourly> monthly) {
        this.monthly = monthly;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowInstanceExtendProductInfoResponse showInstanceExtendProductInfoResponse =
            (ShowInstanceExtendProductInfoResponse) o;
        return Objects.equals(this.hourly, showInstanceExtendProductInfoResponse.hourly)
            && Objects.equals(this.monthly, showInstanceExtendProductInfoResponse.monthly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hourly, monthly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceExtendProductInfoResponse {\n");
        sb.append("    hourly: ").append(toIndentedString(hourly)).append("\n");
        sb.append("    monthly: ").append(toIndentedString(monthly)).append("\n");
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
