package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 弹性IP信息。
 */
public class UnBindPublicReqEipReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandWidth")

    private BindPublicReqEipBandWidth bandWidth;

    public UnBindPublicReqEipReq withBandWidth(BindPublicReqEipBandWidth bandWidth) {
        this.bandWidth = bandWidth;
        return this;
    }

    public UnBindPublicReqEipReq withBandWidth(Consumer<BindPublicReqEipBandWidth> bandWidthSetter) {
        if (this.bandWidth == null) {
            this.bandWidth = new BindPublicReqEipBandWidth();
            bandWidthSetter.accept(this.bandWidth);
        }

        return this;
    }

    /**
     * Get bandWidth
     * @return bandWidth
     */
    public BindPublicReqEipBandWidth getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(BindPublicReqEipBandWidth bandWidth) {
        this.bandWidth = bandWidth;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnBindPublicReqEipReq unBindPublicReqEipReq = (UnBindPublicReqEipReq) o;
        return Objects.equals(this.bandWidth, unBindPublicReqEipReq.bandWidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandWidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnBindPublicReqEipReq {\n");
        sb.append("    bandWidth: ").append(toIndentedString(bandWidth)).append("\n");
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
