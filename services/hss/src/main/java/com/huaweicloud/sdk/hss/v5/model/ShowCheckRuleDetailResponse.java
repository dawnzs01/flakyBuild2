package com.huaweicloud.sdk.hss.v5.model;

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
public class ShowCheckRuleDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference")

    private String reference;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit")

    private String audit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remediation")

    private String remediation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_info_list")

    private List<CheckRuleCheckCaseResponseInfo> checkInfoList = null;

    public ShowCheckRuleDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowCheckRuleDetailResponse withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * 根据
     * @return reference
     */
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public ShowCheckRuleDetailResponse withAudit(String audit) {
        this.audit = audit;
        return this;
    }

    /**
     * 审计描述
     * @return audit
     */
    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    public ShowCheckRuleDetailResponse withRemediation(String remediation) {
        this.remediation = remediation;
        return this;
    }

    /**
     * 修改建议
     * @return remediation
     */
    public String getRemediation() {
        return remediation;
    }

    public void setRemediation(String remediation) {
        this.remediation = remediation;
    }

    public ShowCheckRuleDetailResponse withCheckInfoList(List<CheckRuleCheckCaseResponseInfo> checkInfoList) {
        this.checkInfoList = checkInfoList;
        return this;
    }

    public ShowCheckRuleDetailResponse addCheckInfoListItem(CheckRuleCheckCaseResponseInfo checkInfoListItem) {
        if (this.checkInfoList == null) {
            this.checkInfoList = new ArrayList<>();
        }
        this.checkInfoList.add(checkInfoListItem);
        return this;
    }

    public ShowCheckRuleDetailResponse withCheckInfoList(
        Consumer<List<CheckRuleCheckCaseResponseInfo>> checkInfoListSetter) {
        if (this.checkInfoList == null) {
            this.checkInfoList = new ArrayList<>();
        }
        checkInfoListSetter.accept(this.checkInfoList);
        return this;
    }

    /**
     * 检测用例信息
     * @return checkInfoList
     */
    public List<CheckRuleCheckCaseResponseInfo> getCheckInfoList() {
        return checkInfoList;
    }

    public void setCheckInfoList(List<CheckRuleCheckCaseResponseInfo> checkInfoList) {
        this.checkInfoList = checkInfoList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCheckRuleDetailResponse showCheckRuleDetailResponse = (ShowCheckRuleDetailResponse) o;
        return Objects.equals(this.description, showCheckRuleDetailResponse.description)
            && Objects.equals(this.reference, showCheckRuleDetailResponse.reference)
            && Objects.equals(this.audit, showCheckRuleDetailResponse.audit)
            && Objects.equals(this.remediation, showCheckRuleDetailResponse.remediation)
            && Objects.equals(this.checkInfoList, showCheckRuleDetailResponse.checkInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, reference, audit, remediation, checkInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCheckRuleDetailResponse {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    audit: ").append(toIndentedString(audit)).append("\n");
        sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
        sb.append("    checkInfoList: ").append(toIndentedString(checkInfoList)).append("\n");
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
