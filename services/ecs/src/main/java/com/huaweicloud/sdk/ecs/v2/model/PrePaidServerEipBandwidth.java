package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 
 */
public class PrePaidServerEipBandwidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    /**
     * 带宽的共享类型。  共享类型枚举：PER，表示独享。WHOLE，表示共享。
     */
    public static final class SharetypeEnum {

        /**
         * Enum PER for value: "PER"
         */
        public static final SharetypeEnum PER = new SharetypeEnum("PER");

        /**
         * Enum WHOLE for value: "WHOLE"
         */
        public static final SharetypeEnum WHOLE = new SharetypeEnum("WHOLE");

        private static final Map<String, SharetypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SharetypeEnum> createStaticFields() {
            Map<String, SharetypeEnum> map = new HashMap<>();
            map.put("PER", PER);
            map.put("WHOLE", WHOLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SharetypeEnum(String value) {
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
        public static SharetypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SharetypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SharetypeEnum(value);
            }
            return result;
        }

        public static SharetypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SharetypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SharetypeEnum) {
                return this.value.equals(((SharetypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sharetype")

    private SharetypeEnum sharetype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargemode")

    private String chargemode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public PrePaidServerEipBandwidth withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 功能说明：带宽大小  带宽（Mbit/s），取值范围为[1,2000]。  调整带宽时的最小单位会根据带宽范围不同存在差异。  - 小于等于300Mbit/s：默认最小单位为1Mbit/s。 - 300Mbit/s~1000Mbit/s：默认最小单位为50Mbit/s。 - 大于1000Mbit/s：默认最小单位为500Mbit/s。  > 说明： >  > 如果share_type是PER，该参数必选项；如果share_type是WHOLE并且id有值，该参数会忽略。
     * minimum: 1
     * maximum: 2000
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public PrePaidServerEipBandwidth withSharetype(SharetypeEnum sharetype) {
        this.sharetype = sharetype;
        return this;
    }

    /**
     * 带宽的共享类型。  共享类型枚举：PER，表示独享。WHOLE，表示共享。
     * @return sharetype
     */
    public SharetypeEnum getSharetype() {
        return sharetype;
    }

    public void setSharetype(SharetypeEnum sharetype) {
        this.sharetype = sharetype;
    }

    public PrePaidServerEipBandwidth withChargemode(String chargemode) {
        this.chargemode = chargemode;
        return this;
    }

    /**
     * 带宽的计费类型。  - 未传该字段，表示按带宽计费。 - 字段值为空，表示按带宽计费。 - 字段值为“traffic”，表示按流量计费。 - 字段为其它值，会导致创建云服务器失败。  > 说明： >  > 如果share_type是WHOLE并且id有值，该参数会忽略。
     * @return chargemode
     */
    public String getChargemode() {
        return chargemode;
    }

    public void setChargemode(String chargemode) {
        this.chargemode = chargemode;
    }

    public PrePaidServerEipBandwidth withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 带宽ID，创建WHOLE类型带宽的弹性IP时可以指定之前的共享带宽创建。  取值范围：WHOLE类型的带宽ID。  > 说明： >  > 当创建WHOLE类型的带宽时，该字段必选。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrePaidServerEipBandwidth prePaidServerEipBandwidth = (PrePaidServerEipBandwidth) o;
        return Objects.equals(this.size, prePaidServerEipBandwidth.size)
            && Objects.equals(this.sharetype, prePaidServerEipBandwidth.sharetype)
            && Objects.equals(this.chargemode, prePaidServerEipBandwidth.chargemode)
            && Objects.equals(this.id, prePaidServerEipBandwidth.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, sharetype, chargemode, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrePaidServerEipBandwidth {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sharetype: ").append(toIndentedString(sharetype)).append("\n");
        sb.append("    chargemode: ").append(toIndentedString(chargemode)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
