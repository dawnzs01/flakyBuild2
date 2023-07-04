package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TriggerEventData
 */
public class TriggerEventData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_serial")

    private Boolean isSerial;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_fetch_bytes")

    private Integer maxFetchBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "polling_interval")

    private Integer pollingInterval;

    /**
     * 拉取周期单位
     */
    public static final class PollingUnitEnum {

        /**
         * Enum MS for value: "ms"
         */
        public static final PollingUnitEnum MS = new PollingUnitEnum("ms");

        /**
         * Enum S for value: "s"
         */
        public static final PollingUnitEnum S = new PollingUnitEnum("s");

        private static final Map<String, PollingUnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PollingUnitEnum> createStaticFields() {
            Map<String, PollingUnitEnum> map = new HashMap<>();
            map.put("ms", MS);
            map.put("s", S);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PollingUnitEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PollingUnitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PollingUnitEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PollingUnitEnum(value);
            }
            return result;
        }

        public static PollingUnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PollingUnitEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PollingUnitEnum) {
                return this.value.equals(((PollingUnitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "polling_unit")

    private PollingUnitEnum pollingUnit;

    public TriggerEventData withIsSerial(Boolean isSerial) {
        this.isSerial = isSerial;
        return this;
    }

    /**
     * 串行处理数据
     * @return isSerial
     */
    public Boolean getIsSerial() {
        return isSerial;
    }

    public void setIsSerial(Boolean isSerial) {
        this.isSerial = isSerial;
    }

    public TriggerEventData withMaxFetchBytes(Integer maxFetchBytes) {
        this.maxFetchBytes = maxFetchBytes;
        return this;
    }

    /**
     * 最大字节数
     * @return maxFetchBytes
     */
    public Integer getMaxFetchBytes() {
        return maxFetchBytes;
    }

    public void setMaxFetchBytes(Integer maxFetchBytes) {
        this.maxFetchBytes = maxFetchBytes;
    }

    public TriggerEventData withPollingInterval(Integer pollingInterval) {
        this.pollingInterval = pollingInterval;
        return this;
    }

    /**
     * 拉取周期
     * @return pollingInterval
     */
    public Integer getPollingInterval() {
        return pollingInterval;
    }

    public void setPollingInterval(Integer pollingInterval) {
        this.pollingInterval = pollingInterval;
    }

    public TriggerEventData withPollingUnit(PollingUnitEnum pollingUnit) {
        this.pollingUnit = pollingUnit;
        return this;
    }

    /**
     * 拉取周期单位
     * @return pollingUnit
     */
    public PollingUnitEnum getPollingUnit() {
        return pollingUnit;
    }

    public void setPollingUnit(PollingUnitEnum pollingUnit) {
        this.pollingUnit = pollingUnit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TriggerEventData triggerEventData = (TriggerEventData) o;
        return Objects.equals(this.isSerial, triggerEventData.isSerial)
            && Objects.equals(this.maxFetchBytes, triggerEventData.maxFetchBytes)
            && Objects.equals(this.pollingInterval, triggerEventData.pollingInterval)
            && Objects.equals(this.pollingUnit, triggerEventData.pollingUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSerial, maxFetchBytes, pollingInterval, pollingUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerEventData {\n");
        sb.append("    isSerial: ").append(toIndentedString(isSerial)).append("\n");
        sb.append("    maxFetchBytes: ").append(toIndentedString(maxFetchBytes)).append("\n");
        sb.append("    pollingInterval: ").append(toIndentedString(pollingInterval)).append("\n");
        sb.append("    pollingUnit: ").append(toIndentedString(pollingUnit)).append("\n");
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
