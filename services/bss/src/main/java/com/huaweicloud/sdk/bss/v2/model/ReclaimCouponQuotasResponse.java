package com.huaweicloud.sdk.bss.v2.model;

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
public class ReclaimCouponQuotasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_details")

    private List<ErrorDetail> errorDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "simple_quota_infos")

    private List<QuotaReclaim> simpleQuotaInfos = null;

    public ReclaimCouponQuotasResponse withErrorDetails(List<ErrorDetail> errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    public ReclaimCouponQuotasResponse addErrorDetailsItem(ErrorDetail errorDetailsItem) {
        if (this.errorDetails == null) {
            this.errorDetails = new ArrayList<>();
        }
        this.errorDetails.add(errorDetailsItem);
        return this;
    }

    public ReclaimCouponQuotasResponse withErrorDetails(Consumer<List<ErrorDetail>> errorDetailsSetter) {
        if (this.errorDetails == null) {
            this.errorDetails = new ArrayList<>();
        }
        errorDetailsSetter.accept(this.errorDetails);
        return this;
    }

    /**
     * 回收失败的云经销商额度信息，具体参见表1，只有HTTP STATUS 200的时候才有这个结构体。
     * @return errorDetails
     */
    public List<ErrorDetail> getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(List<ErrorDetail> errorDetails) {
        this.errorDetails = errorDetails;
    }

    public ReclaimCouponQuotasResponse withSimpleQuotaInfos(List<QuotaReclaim> simpleQuotaInfos) {
        this.simpleQuotaInfos = simpleQuotaInfos;
        return this;
    }

    public ReclaimCouponQuotasResponse addSimpleQuotaInfosItem(QuotaReclaim simpleQuotaInfosItem) {
        if (this.simpleQuotaInfos == null) {
            this.simpleQuotaInfos = new ArrayList<>();
        }
        this.simpleQuotaInfos.add(simpleQuotaInfosItem);
        return this;
    }

    public ReclaimCouponQuotasResponse withSimpleQuotaInfos(Consumer<List<QuotaReclaim>> simpleQuotaInfosSetter) {
        if (this.simpleQuotaInfos == null) {
            this.simpleQuotaInfos = new ArrayList<>();
        }
        simpleQuotaInfosSetter.accept(this.simpleQuotaInfos);
        return this;
    }

    /**
     * 回收成功的云经销商额度信息，具体参见表2，只有HTTP STATUS 200的时候才有这个结构体。
     * @return simpleQuotaInfos
     */
    public List<QuotaReclaim> getSimpleQuotaInfos() {
        return simpleQuotaInfos;
    }

    public void setSimpleQuotaInfos(List<QuotaReclaim> simpleQuotaInfos) {
        this.simpleQuotaInfos = simpleQuotaInfos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReclaimCouponQuotasResponse reclaimCouponQuotasResponse = (ReclaimCouponQuotasResponse) o;
        return Objects.equals(this.errorDetails, reclaimCouponQuotasResponse.errorDetails)
            && Objects.equals(this.simpleQuotaInfos, reclaimCouponQuotasResponse.simpleQuotaInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorDetails, simpleQuotaInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReclaimCouponQuotasResponse {\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    simpleQuotaInfos: ").append(toIndentedString(simpleQuotaInfos)).append("\n");
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
