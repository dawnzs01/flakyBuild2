package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateLtsInfoConfigRequestBody
 */
public class UpdateLtsInfoConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ltsIdInfo")

    private LtsIdInfo ltsIdInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabale")

    private Boolean enabale;

    public UpdateLtsInfoConfigRequestBody withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否开启全量日志   - false: 不开启   - true: 开启
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public UpdateLtsInfoConfigRequestBody withLtsIdInfo(LtsIdInfo ltsIdInfo) {
        this.ltsIdInfo = ltsIdInfo;
        return this;
    }

    public UpdateLtsInfoConfigRequestBody withLtsIdInfo(Consumer<LtsIdInfo> ltsIdInfoSetter) {
        if (this.ltsIdInfo == null) {
            this.ltsIdInfo = new LtsIdInfo();
            ltsIdInfoSetter.accept(this.ltsIdInfo);
        }

        return this;
    }

    /**
     * Get ltsIdInfo
     * @return ltsIdInfo
     */
    public LtsIdInfo getLtsIdInfo() {
        return ltsIdInfo;
    }

    public void setLtsIdInfo(LtsIdInfo ltsIdInfo) {
        this.ltsIdInfo = ltsIdInfo;
    }

    public UpdateLtsInfoConfigRequestBody withEnabale(Boolean enabale) {
        this.enabale = enabale;
        return this;
    }

    /**
     * 该参数废弃，请忽略
     * @return enabale
     */
    public Boolean getEnabale() {
        return enabale;
    }

    public void setEnabale(Boolean enabale) {
        this.enabale = enabale;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateLtsInfoConfigRequestBody updateLtsInfoConfigRequestBody = (UpdateLtsInfoConfigRequestBody) o;
        return Objects.equals(this.enabled, updateLtsInfoConfigRequestBody.enabled)
            && Objects.equals(this.ltsIdInfo, updateLtsInfoConfigRequestBody.ltsIdInfo)
            && Objects.equals(this.enabale, updateLtsInfoConfigRequestBody.enabale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, ltsIdInfo, enabale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLtsInfoConfigRequestBody {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    ltsIdInfo: ").append(toIndentedString(ltsIdInfo)).append("\n");
        sb.append("    enabale: ").append(toIndentedString(enabale)).append("\n");
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
