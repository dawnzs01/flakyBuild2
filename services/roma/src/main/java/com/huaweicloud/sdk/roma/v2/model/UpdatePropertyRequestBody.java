package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdatePropertyRequestBody
 */
public class UpdatePropertyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_name")

    private String propertyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 属性数据类型，枚举值大小写敏感；number格式为数字，范围±1.0 x 10^-28 to ±7.9228 x 10^28；sting为字符串；integer为整数；datetime为时间，格式为yyyyMMddTHHmmss；json为自定义json格式
     */
    public static final class DataTypeEnum {

        /**
         * Enum INTEGER for value: "integer"
         */
        public static final DataTypeEnum INTEGER = new DataTypeEnum("integer");

        /**
         * Enum NUMBER for value: "number"
         */
        public static final DataTypeEnum NUMBER = new DataTypeEnum("number");

        /**
         * Enum STRING for value: "string"
         */
        public static final DataTypeEnum STRING = new DataTypeEnum("string");

        /**
         * Enum DATETIME for value: "datetime"
         */
        public static final DataTypeEnum DATETIME = new DataTypeEnum("datetime");

        /**
         * Enum JSON for value: "json"
         */
        public static final DataTypeEnum JSON = new DataTypeEnum("json");

        private static final Map<String, DataTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DataTypeEnum> createStaticFields() {
            Map<String, DataTypeEnum> map = new HashMap<>();
            map.put("integer", INTEGER);
            map.put("number", NUMBER);
            map.put("string", STRING);
            map.put("datetime", DATETIME);
            map.put("json", JSON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DataTypeEnum(String value) {
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
        public static DataTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DataTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DataTypeEnum(value);
            }
            return result;
        }

        public static DataTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DataTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DataTypeEnum) {
                return this.value.equals(((DataTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private DataTypeEnum dataType;

    /**
     * 是否必填 0-非必填 1-必填
     */
    public static final class RequiredEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final RequiredEnum NUMBER_0 = new RequiredEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final RequiredEnum NUMBER_1 = new RequiredEnum(1);

        private static final Map<Integer, RequiredEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, RequiredEnum> createStaticFields() {
            Map<Integer, RequiredEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        RequiredEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RequiredEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            RequiredEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RequiredEnum(value);
            }
            return result;
        }

        public static RequiredEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            RequiredEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RequiredEnum) {
                return this.value.equals(((RequiredEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    private RequiredEnum required;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private String min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private String max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private String step;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_length")

    private Integer maxLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enum_list")

    private String enumList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enum_dict")

    private Object enumDict;

    public UpdatePropertyRequestBody withPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    /**
     * 属性名称，首位必须为字母，支持大小写字母，数字，中划线及下划线，长度2-50
     * @return propertyName
     */
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public UpdatePropertyRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 属性描述，长度0-200
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdatePropertyRequestBody withDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 属性数据类型，枚举值大小写敏感；number格式为数字，范围±1.0 x 10^-28 to ±7.9228 x 10^28；sting为字符串；integer为整数；datetime为时间，格式为yyyyMMddTHHmmss；json为自定义json格式
     * @return dataType
     */
    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    public UpdatePropertyRequestBody withRequired(RequiredEnum required) {
        this.required = required;
        return this;
    }

    /**
     * 是否必填 0-非必填 1-必填
     * minimum: 0
     * maximum: 10
     * @return required
     */
    public RequiredEnum getRequired() {
        return required;
    }

    public void setRequired(RequiredEnum required) {
        this.required = required;
    }

    public UpdatePropertyRequestBody withMin(String min) {
        this.min = min;
        return this;
    }

    /**
     * 最小值，当data_type为integer或number时必填
     * @return min
     */
    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public UpdatePropertyRequestBody withMax(String max) {
        this.max = max;
        return this;
    }

    /**
     * 最大值，当data_type为integer或number时必填
     * @return max
     */
    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public UpdatePropertyRequestBody withStep(String step) {
        this.step = step;
        return this;
    }

    /**
     * 步长，当data_type为integer或number时必填
     * @return step
     */
    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public UpdatePropertyRequestBody withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * 字符串最大长度，当data_type为string, datetime, json时必填,自动向下取整
     * minimum: 0
     * maximum: 9999999
     * @return maxLength
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public UpdatePropertyRequestBody withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 属性单位
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public UpdatePropertyRequestBody withEnumList(String enumList) {
        this.enumList = enumList;
        return this;
    }

    /**
     * string的枚举值数组，使用逗号分隔
     * @return enumList
     */
    public String getEnumList() {
        return enumList;
    }

    public void setEnumList(String enumList) {
        this.enumList = enumList;
    }

    public UpdatePropertyRequestBody withEnumDict(Object enumDict) {
        this.enumDict = enumDict;
        return this;
    }

    /**
     * 当数据类型为boolean枚举值时填写json格式数据，形如\"enum_dict\":{\"0\":\"xxx\",\"1\":\"xxx\"}
     * @return enumDict
     */
    public Object getEnumDict() {
        return enumDict;
    }

    public void setEnumDict(Object enumDict) {
        this.enumDict = enumDict;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePropertyRequestBody updatePropertyRequestBody = (UpdatePropertyRequestBody) o;
        return Objects.equals(this.propertyName, updatePropertyRequestBody.propertyName)
            && Objects.equals(this.description, updatePropertyRequestBody.description)
            && Objects.equals(this.dataType, updatePropertyRequestBody.dataType)
            && Objects.equals(this.required, updatePropertyRequestBody.required)
            && Objects.equals(this.min, updatePropertyRequestBody.min)
            && Objects.equals(this.max, updatePropertyRequestBody.max)
            && Objects.equals(this.step, updatePropertyRequestBody.step)
            && Objects.equals(this.maxLength, updatePropertyRequestBody.maxLength)
            && Objects.equals(this.unit, updatePropertyRequestBody.unit)
            && Objects.equals(this.enumList, updatePropertyRequestBody.enumList)
            && Objects.equals(this.enumDict, updatePropertyRequestBody.enumDict);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(propertyName, description, dataType, required, min, max, step, maxLength, unit, enumList, enumDict);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePropertyRequestBody {\n");
        sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    enumList: ").append(toIndentedString(enumList)).append("\n");
        sb.append("    enumDict: ").append(toIndentedString(enumDict)).append("\n");
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
