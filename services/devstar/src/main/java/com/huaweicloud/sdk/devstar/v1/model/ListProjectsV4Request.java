package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListProjectsV4Request {

    /**
     * 语言类型 中文:zh-cn 英文:en-us
     */
    public static final class XLanguageEnum {

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final XLanguageEnum ZH_CN = new XLanguageEnum("zh-cn");

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final XLanguageEnum EN_US = new XLanguageEnum("en-us");

        private static final Map<String, XLanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XLanguageEnum> createStaticFields() {
            Map<String, XLanguageEnum> map = new HashMap<>();
            map.put("zh-cn", ZH_CN);
            map.put("en-us", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XLanguageEnum(String value) {
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
        public static XLanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            XLanguageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new XLanguageEnum(value);
            }
            return result;
        }

        public static XLanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            XLanguageEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XLanguageEnum) {
                return this.value.equals(((XLanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private XLanguageEnum xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListProjectsV4Request withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言类型 中文:zh-cn 英文:en-us
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public XLanguageEnum getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListProjectsV4Request withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 搜索关键字,支持按名称和描述搜索，默认null
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public ListProjectsV4Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量,默认100
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListProjectsV4Request withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询,默认0
     * minimum: 0
     * maximum: 1000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectsV4Request listProjectsV4Request = (ListProjectsV4Request) o;
        return Objects.equals(this.xLanguage, listProjectsV4Request.xLanguage)
            && Objects.equals(this.keyword, listProjectsV4Request.keyword)
            && Objects.equals(this.limit, listProjectsV4Request.limit)
            && Objects.equals(this.offset, listProjectsV4Request.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, keyword, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectsV4Request {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
