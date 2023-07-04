package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 解关联带宽包实例的请求体。
 */
public class DisassociateBandwidthPackageRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_package")

    private DisassociateBandwidthPackage bandwidthPackage;

    public DisassociateBandwidthPackageRequestBody withBandwidthPackage(DisassociateBandwidthPackage bandwidthPackage) {
        this.bandwidthPackage = bandwidthPackage;
        return this;
    }

    public DisassociateBandwidthPackageRequestBody withBandwidthPackage(
        Consumer<DisassociateBandwidthPackage> bandwidthPackageSetter) {
        if (this.bandwidthPackage == null) {
            this.bandwidthPackage = new DisassociateBandwidthPackage();
            bandwidthPackageSetter.accept(this.bandwidthPackage);
        }

        return this;
    }

    /**
     * Get bandwidthPackage
     * @return bandwidthPackage
     */
    public DisassociateBandwidthPackage getBandwidthPackage() {
        return bandwidthPackage;
    }

    public void setBandwidthPackage(DisassociateBandwidthPackage bandwidthPackage) {
        this.bandwidthPackage = bandwidthPackage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisassociateBandwidthPackageRequestBody disassociateBandwidthPackageRequestBody =
            (DisassociateBandwidthPackageRequestBody) o;
        return Objects.equals(this.bandwidthPackage, disassociateBandwidthPackageRequestBody.bandwidthPackage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthPackage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateBandwidthPackageRequestBody {\n");
        sb.append("    bandwidthPackage: ").append(toIndentedString(bandwidthPackage)).append("\n");
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
