package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDisasterRecoveryDrillResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_drill")

    private ShowDisasterRecoveryDrillParams disasterRecoveryDrill;

    public ShowDisasterRecoveryDrillResponse withDisasterRecoveryDrill(
        ShowDisasterRecoveryDrillParams disasterRecoveryDrill) {
        this.disasterRecoveryDrill = disasterRecoveryDrill;
        return this;
    }

    public ShowDisasterRecoveryDrillResponse withDisasterRecoveryDrill(
        Consumer<ShowDisasterRecoveryDrillParams> disasterRecoveryDrillSetter) {
        if (this.disasterRecoveryDrill == null) {
            this.disasterRecoveryDrill = new ShowDisasterRecoveryDrillParams();
            disasterRecoveryDrillSetter.accept(this.disasterRecoveryDrill);
        }

        return this;
    }

    /**
     * Get disasterRecoveryDrill
     * @return disasterRecoveryDrill
     */
    public ShowDisasterRecoveryDrillParams getDisasterRecoveryDrill() {
        return disasterRecoveryDrill;
    }

    public void setDisasterRecoveryDrill(ShowDisasterRecoveryDrillParams disasterRecoveryDrill) {
        this.disasterRecoveryDrill = disasterRecoveryDrill;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDisasterRecoveryDrillResponse showDisasterRecoveryDrillResponse = (ShowDisasterRecoveryDrillResponse) o;
        return Objects.equals(this.disasterRecoveryDrill, showDisasterRecoveryDrillResponse.disasterRecoveryDrill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterRecoveryDrill);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDisasterRecoveryDrillResponse {\n");
        sb.append("    disasterRecoveryDrill: ").append(toIndentedString(disasterRecoveryDrill)).append("\n");
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
