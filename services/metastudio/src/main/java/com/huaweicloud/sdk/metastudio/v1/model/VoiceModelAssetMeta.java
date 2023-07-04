package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 音色模型元数据。
 */
public class VoiceModelAssetMeta {

    /**
     * 音色资产类型。 * COMMON：通用情感模型 * CLONE：语音克隆模型
     */
    public static final class ModelTypeEnum {

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final ModelTypeEnum COMMON = new ModelTypeEnum("COMMON");

        /**
         * Enum CLONE for value: "CLONE"
         */
        public static final ModelTypeEnum CLONE = new ModelTypeEnum("CLONE");

        private static final Map<String, ModelTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModelTypeEnum> createStaticFields() {
            Map<String, ModelTypeEnum> map = new HashMap<>();
            map.put("COMMON", COMMON);
            map.put("CLONE", CLONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModelTypeEnum(String value) {
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
        public static ModelTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ModelTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ModelTypeEnum(value);
            }
            return result;
        }

        public static ModelTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ModelTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModelTypeEnum) {
                return this.value.equals(((ModelTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_type")

    private ModelTypeEnum modelType;

    /**
     * 音色性别。默认UNKNOW。 * UNKNOW： 中性音色 * MALE： 男性音色 * FEMALE： 女性音色
     */
    public static final class SexEnum {

        /**
         * Enum UNKNOW for value: "UNKNOW"
         */
        public static final SexEnum UNKNOW = new SexEnum("UNKNOW");

        /**
         * Enum MALE for value: "MALE"
         */
        public static final SexEnum MALE = new SexEnum("MALE");

        /**
         * Enum FEMALE for value: "FEMALE"
         */
        public static final SexEnum FEMALE = new SexEnum("FEMALE");

        private static final Map<String, SexEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SexEnum> createStaticFields() {
            Map<String, SexEnum> map = new HashMap<>();
            map.put("UNKNOW", UNKNOW);
            map.put("MALE", MALE);
            map.put("FEMALE", FEMALE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SexEnum(String value) {
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
        public static SexEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SexEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SexEnum(value);
            }
            return result;
        }

        public static SexEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SexEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SexEnum) {
                return this.value.equals(((SexEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private SexEnum sex;

    /**
     * 音色语言。默认UNKNOW。 * UNKNOW： 未知 * CN： 中文 * EN： 英文
     */
    public static final class LanguageEnum {

        /**
         * Enum UNKNOW for value: "UNKNOW"
         */
        public static final LanguageEnum UNKNOW = new LanguageEnum("UNKNOW");

        /**
         * Enum CN for value: "CN"
         */
        public static final LanguageEnum CN = new LanguageEnum("CN");

        /**
         * Enum EN for value: "EN"
         */
        public static final LanguageEnum EN = new LanguageEnum("EN");

        private static final Map<String, LanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LanguageEnum> createStaticFields() {
            Map<String, LanguageEnum> map = new HashMap<>();
            map.put("UNKNOW", UNKNOW);
            map.put("CN", CN);
            map.put("EN", EN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LanguageEnum(String value) {
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
        public static LanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LanguageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LanguageEnum(value);
            }
            return result;
        }

        public static LanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LanguageEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LanguageEnum) {
                return this.value.equals(((LanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    public VoiceModelAssetMeta withModelType(ModelTypeEnum modelType) {
        this.modelType = modelType;
        return this;
    }

    /**
     * 音色资产类型。 * COMMON：通用情感模型 * CLONE：语音克隆模型
     * @return modelType
     */
    public ModelTypeEnum getModelType() {
        return modelType;
    }

    public void setModelType(ModelTypeEnum modelType) {
        this.modelType = modelType;
    }

    public VoiceModelAssetMeta withSex(SexEnum sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 音色性别。默认UNKNOW。 * UNKNOW： 中性音色 * MALE： 男性音色 * FEMALE： 女性音色
     * @return sex
     */
    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public VoiceModelAssetMeta withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * 音色语言。默认UNKNOW。 * UNKNOW： 未知 * CN： 中文 * EN： 英文
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VoiceModelAssetMeta voiceModelAssetMeta = (VoiceModelAssetMeta) o;
        return Objects.equals(this.modelType, voiceModelAssetMeta.modelType)
            && Objects.equals(this.sex, voiceModelAssetMeta.sex)
            && Objects.equals(this.language, voiceModelAssetMeta.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelType, sex, language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VoiceModelAssetMeta {\n");
        sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
