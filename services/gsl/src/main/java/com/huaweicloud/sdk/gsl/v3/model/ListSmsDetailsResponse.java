package com.huaweicloud.sdk.gsl.v3.model;

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
public class ListSmsDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_details")

    private List<SmsSendDetailQueryVo> smsDetails = null;

    public ListSmsDetailsResponse withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页的记录数
     * minimum: 10
     * maximum: 500
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListSmsDetailsResponse withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 页码，最小值是1，最大值为1000000。默认值是1.
     * minimum: 1
     * maximum: 1000000
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListSmsDetailsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 记录总数
     * minimum: 0
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListSmsDetailsResponse withSmsDetails(List<SmsSendDetailQueryVo> smsDetails) {
        this.smsDetails = smsDetails;
        return this;
    }

    public ListSmsDetailsResponse addSmsDetailsItem(SmsSendDetailQueryVo smsDetailsItem) {
        if (this.smsDetails == null) {
            this.smsDetails = new ArrayList<>();
        }
        this.smsDetails.add(smsDetailsItem);
        return this;
    }

    public ListSmsDetailsResponse withSmsDetails(Consumer<List<SmsSendDetailQueryVo>> smsDetailsSetter) {
        if (this.smsDetails == null) {
            this.smsDetails = new ArrayList<>();
        }
        smsDetailsSetter.accept(this.smsDetails);
        return this;
    }

    /**
     * 短信发送详情列表
     * @return smsDetails
     */
    public List<SmsSendDetailQueryVo> getSmsDetails() {
        return smsDetails;
    }

    public void setSmsDetails(List<SmsSendDetailQueryVo> smsDetails) {
        this.smsDetails = smsDetails;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSmsDetailsResponse listSmsDetailsResponse = (ListSmsDetailsResponse) o;
        return Objects.equals(this.limit, listSmsDetailsResponse.limit)
            && Objects.equals(this.offset, listSmsDetailsResponse.offset)
            && Objects.equals(this.count, listSmsDetailsResponse.count)
            && Objects.equals(this.smsDetails, listSmsDetailsResponse.smsDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, count, smsDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSmsDetailsResponse {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    smsDetails: ").append(toIndentedString(smsDetails)).append("\n");
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
