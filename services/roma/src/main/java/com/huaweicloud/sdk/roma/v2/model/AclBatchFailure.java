package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AclBatchFailure
 */
public class AclBatchFailure {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_id")

    private String aclId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_name")

    private String aclName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public AclBatchFailure withAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }

    /**
     * 删除失败的ACL策略ID
     * @return aclId
     */
    public String getAclId() {
        return aclId;
    }

    public void setAclId(String aclId) {
        this.aclId = aclId;
    }

    public AclBatchFailure withAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }

    /**
     * 删除失败的ACL策略名称
     * @return aclName
     */
    public String getAclName() {
        return aclName;
    }

    public void setAclName(String aclName) {
        this.aclName = aclName;
    }

    public AclBatchFailure withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 删除失败的错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public AclBatchFailure withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 删除失败的错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AclBatchFailure aclBatchFailure = (AclBatchFailure) o;
        return Objects.equals(this.aclId, aclBatchFailure.aclId)
            && Objects.equals(this.aclName, aclBatchFailure.aclName)
            && Objects.equals(this.errorCode, aclBatchFailure.errorCode)
            && Objects.equals(this.errorMsg, aclBatchFailure.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aclId, aclName, errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AclBatchFailure {\n");
        sb.append("    aclId: ").append(toIndentedString(aclId)).append("\n");
        sb.append("    aclName: ").append(toIndentedString(aclName)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
