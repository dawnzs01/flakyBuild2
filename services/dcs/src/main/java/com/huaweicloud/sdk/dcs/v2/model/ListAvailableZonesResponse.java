package com.huaweicloud.sdk.dcs.v2.model;

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
public class ListAvailableZonesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<AvailableZones> availableZones = null;

    public ListAvailableZonesResponse withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ListAvailableZonesResponse withAvailableZones(List<AvailableZones> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public ListAvailableZonesResponse addAvailableZonesItem(AvailableZones availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ListAvailableZonesResponse withAvailableZones(Consumer<List<AvailableZones>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 可用分区数组。
     * @return availableZones
     */
    public List<AvailableZones> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<AvailableZones> availableZones) {
        this.availableZones = availableZones;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAvailableZonesResponse listAvailableZonesResponse = (ListAvailableZonesResponse) o;
        return Objects.equals(this.regionId, listAvailableZonesResponse.regionId)
            && Objects.equals(this.availableZones, listAvailableZonesResponse.availableZones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, availableZones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailableZonesResponse {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
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
