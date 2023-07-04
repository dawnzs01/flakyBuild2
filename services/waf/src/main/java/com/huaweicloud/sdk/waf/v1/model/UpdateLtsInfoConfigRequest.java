package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateLtsInfoConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ltsconfig_id")

    private String ltsconfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateLtsInfoConfigRequestBody body;

    public UpdateLtsInfoConfigRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public UpdateLtsInfoConfigRequest withLtsconfigId(String ltsconfigId) {
        this.ltsconfigId = ltsconfigId;
        return this;
    }

    /**
     * lts配置信息id，通过ShowLtsInfoConfig获取
     * @return ltsconfigId
     */
    public String getLtsconfigId() {
        return ltsconfigId;
    }

    public void setLtsconfigId(String ltsconfigId) {
        this.ltsconfigId = ltsconfigId;
    }

    public UpdateLtsInfoConfigRequest withBody(UpdateLtsInfoConfigRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateLtsInfoConfigRequest withBody(Consumer<UpdateLtsInfoConfigRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateLtsInfoConfigRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateLtsInfoConfigRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateLtsInfoConfigRequestBody body) {
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
        UpdateLtsInfoConfigRequest updateLtsInfoConfigRequest = (UpdateLtsInfoConfigRequest) o;
        return Objects.equals(this.enterpriseProjectId, updateLtsInfoConfigRequest.enterpriseProjectId)
            && Objects.equals(this.ltsconfigId, updateLtsInfoConfigRequest.ltsconfigId)
            && Objects.equals(this.body, updateLtsInfoConfigRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, ltsconfigId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLtsInfoConfigRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    ltsconfigId: ").append(toIndentedString(ltsconfigId)).append("\n");
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
