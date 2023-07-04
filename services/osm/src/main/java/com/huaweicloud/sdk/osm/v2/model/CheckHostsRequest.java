package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CheckHostsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_detail_id")

    private Long authorizationDetailId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site")

    private Integer xSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Time-Zone")

    private String xTimeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private VerifyHostV2Req body;

    public CheckHostsRequest withAuthorizationDetailId(Long authorizationDetailId) {
        this.authorizationDetailId = authorizationDetailId;
        return this;
    }

    /**
     * 授权详情id
     * minimum: 0
     * maximum: 9223372036854775807
     * @return authorizationDetailId
     */
    public Long getAuthorizationDetailId() {
        return authorizationDetailId;
    }

    public void setAuthorizationDetailId(Long authorizationDetailId) {
        this.authorizationDetailId = authorizationDetailId;
    }

    public CheckHostsRequest withXSite(Integer xSite) {
        this.xSite = xSite;
        return this;
    }

    /**
     * 对接站点信息。  0（中国站） 1（国际站），不填的话默认为0。
     * minimum: 0
     * maximum: 1
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site")
    public Integer getXSite() {
        return xSite;
    }

    public void setXSite(Integer xSite) {
        this.xSite = xSite;
    }

    public CheckHostsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言环境，值为通用的语言描述字符串，比如zh-cn等，默认为zh-cn。  会根据语言环境对应展示一些国际化的信息，比如工单类型名称等。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public CheckHostsRequest withXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
        return this;
    }

    /**
     * 环境时区，值为通用的时区描述字符串，比如GMT+8等，默认为GMT+8。  涉及时间的数据会根据环境时区处理。
     * @return xTimeZone
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Time-Zone")
    public String getXTimeZone() {
        return xTimeZone;
    }

    public void setXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
    }

    public CheckHostsRequest withBody(VerifyHostV2Req body) {
        this.body = body;
        return this;
    }

    public CheckHostsRequest withBody(Consumer<VerifyHostV2Req> bodySetter) {
        if (this.body == null) {
            this.body = new VerifyHostV2Req();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public VerifyHostV2Req getBody() {
        return body;
    }

    public void setBody(VerifyHostV2Req body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckHostsRequest checkHostsRequest = (CheckHostsRequest) o;
        return Objects.equals(this.authorizationDetailId, checkHostsRequest.authorizationDetailId)
            && Objects.equals(this.xSite, checkHostsRequest.xSite)
            && Objects.equals(this.xLanguage, checkHostsRequest.xLanguage)
            && Objects.equals(this.xTimeZone, checkHostsRequest.xTimeZone)
            && Objects.equals(this.body, checkHostsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizationDetailId, xSite, xLanguage, xTimeZone, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckHostsRequest {\n");
        sb.append("    authorizationDetailId: ").append(toIndentedString(authorizationDetailId)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    xTimeZone: ").append(toIndentedString(xTimeZone)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
