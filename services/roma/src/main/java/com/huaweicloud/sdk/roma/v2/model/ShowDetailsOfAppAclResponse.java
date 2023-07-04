package com.huaweicloud.sdk.roma.v2.model;

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
public class ShowDetailsOfAppAclResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_acl_type")

    private String appAclType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_acl_values")

    private List<String> appAclValues = null;

    public ShowDetailsOfAppAclResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * APP编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowDetailsOfAppAclResponse withAppAclType(String appAclType) {
        this.appAclType = appAclType;
        return this;
    }

    /**
     * 类型 -  PERMIT (白名单类型) -  DENY (黑名单类型)
     * @return appAclType
     */
    public String getAppAclType() {
        return appAclType;
    }

    public void setAppAclType(String appAclType) {
        this.appAclType = appAclType;
    }

    public ShowDetailsOfAppAclResponse withAppAclValues(List<String> appAclValues) {
        this.appAclValues = appAclValues;
        return this;
    }

    public ShowDetailsOfAppAclResponse addAppAclValuesItem(String appAclValuesItem) {
        if (this.appAclValues == null) {
            this.appAclValues = new ArrayList<>();
        }
        this.appAclValues.add(appAclValuesItem);
        return this;
    }

    public ShowDetailsOfAppAclResponse withAppAclValues(Consumer<List<String>> appAclValuesSetter) {
        if (this.appAclValues == null) {
            this.appAclValues = new ArrayList<>();
        }
        appAclValuesSetter.accept(this.appAclValues);
        return this;
    }

    /**
     * ACL策略值，支持IP、IP范围和CIDR方式。IP范围以英文中划线分隔。
     * @return appAclValues
     */
    public List<String> getAppAclValues() {
        return appAclValues;
    }

    public void setAppAclValues(List<String> appAclValues) {
        this.appAclValues = appAclValues;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDetailsOfAppAclResponse showDetailsOfAppAclResponse = (ShowDetailsOfAppAclResponse) o;
        return Objects.equals(this.appId, showDetailsOfAppAclResponse.appId)
            && Objects.equals(this.appAclType, showDetailsOfAppAclResponse.appAclType)
            && Objects.equals(this.appAclValues, showDetailsOfAppAclResponse.appAclValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, appAclType, appAclValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailsOfAppAclResponse {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appAclType: ").append(toIndentedString(appAclType)).append("\n");
        sb.append("    appAclValues: ").append(toIndentedString(appAclValues)).append("\n");
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
