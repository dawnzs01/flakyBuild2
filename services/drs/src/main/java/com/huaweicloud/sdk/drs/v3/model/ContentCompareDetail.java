package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 内容对比结果详情。
 */
public class ContentCompareDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_name")

    private String sourceDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_name")

    private String targetDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_table_name")

    private String sourceTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_table_name")

    private String targetTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_row_num")

    private Integer sourceRowNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_row_num")

    private Integer targetRowNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff_row_num")

    private Integer diffRowNum;

    /**
     * 行对比结果。 - CONSISTENT-一致 - INCONSISTENT-不一致 - COMPARING-正在对比 - WAITING_FOR_COMPARISON-等待对比 - FAILED_TO_COMPARE-对比失败 - TARGET_DB_NOT_EXIT-目标库不存在 - CAN_NOT_COMPARE-无法对比
     */
    public static final class LineCompareResultEnum {

        /**
         * Enum CONSISTENT for value: "CONSISTENT"
         */
        public static final LineCompareResultEnum CONSISTENT = new LineCompareResultEnum("CONSISTENT");

        /**
         * Enum INCONSISTENT for value: "INCONSISTENT"
         */
        public static final LineCompareResultEnum INCONSISTENT = new LineCompareResultEnum("INCONSISTENT");

        /**
         * Enum COMPARING for value: "COMPARING"
         */
        public static final LineCompareResultEnum COMPARING = new LineCompareResultEnum("COMPARING");

        /**
         * Enum WAITING_FOR_COMPARISON for value: "WAITING_FOR_COMPARISON"
         */
        public static final LineCompareResultEnum WAITING_FOR_COMPARISON =
            new LineCompareResultEnum("WAITING_FOR_COMPARISON");

        /**
         * Enum FAILED_TO_COMPARE for value: "FAILED_TO_COMPARE"
         */
        public static final LineCompareResultEnum FAILED_TO_COMPARE = new LineCompareResultEnum("FAILED_TO_COMPARE");

        /**
         * Enum TARGET_DB_NOT_EXIT for value: "TARGET_DB_NOT_EXIT"
         */
        public static final LineCompareResultEnum TARGET_DB_NOT_EXIT = new LineCompareResultEnum("TARGET_DB_NOT_EXIT");

        /**
         * Enum CAN_NOT_COMPARE for value: "CAN_NOT_COMPARE"
         */
        public static final LineCompareResultEnum CAN_NOT_COMPARE = new LineCompareResultEnum("CAN_NOT_COMPARE");

        private static final Map<String, LineCompareResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LineCompareResultEnum> createStaticFields() {
            Map<String, LineCompareResultEnum> map = new HashMap<>();
            map.put("CONSISTENT", CONSISTENT);
            map.put("INCONSISTENT", INCONSISTENT);
            map.put("COMPARING", COMPARING);
            map.put("WAITING_FOR_COMPARISON", WAITING_FOR_COMPARISON);
            map.put("FAILED_TO_COMPARE", FAILED_TO_COMPARE);
            map.put("TARGET_DB_NOT_EXIT", TARGET_DB_NOT_EXIT);
            map.put("CAN_NOT_COMPARE", CAN_NOT_COMPARE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LineCompareResultEnum(String value) {
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
        public static LineCompareResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LineCompareResultEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LineCompareResultEnum(value);
            }
            return result;
        }

        public static LineCompareResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LineCompareResultEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LineCompareResultEnum) {
                return this.value.equals(((LineCompareResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_compare_result")

    private LineCompareResultEnum lineCompareResult;

    /**
     * 内容对比结果。 - CONSISTENT-一致 - INCONSISTENT-不一致 - COMPARING-正在对比 - WAITING_FOR_COMPARISON-等待对比 - FAILED_TO_COMPARE-对比失败 - TARGET_DB_NOT_EXIT-目标库不存在 - CAN_NOT_COMPARE-无法对比
     */
    public static final class ContentCompareResultEnum {

        /**
         * Enum CONSISTENT for value: "CONSISTENT"
         */
        public static final ContentCompareResultEnum CONSISTENT = new ContentCompareResultEnum("CONSISTENT");

        /**
         * Enum INCONSISTENT for value: "INCONSISTENT"
         */
        public static final ContentCompareResultEnum INCONSISTENT = new ContentCompareResultEnum("INCONSISTENT");

        /**
         * Enum COMPARING for value: "COMPARING"
         */
        public static final ContentCompareResultEnum COMPARING = new ContentCompareResultEnum("COMPARING");

        /**
         * Enum WAITING_FOR_COMPARISON for value: "WAITING_FOR_COMPARISON"
         */
        public static final ContentCompareResultEnum WAITING_FOR_COMPARISON =
            new ContentCompareResultEnum("WAITING_FOR_COMPARISON");

        /**
         * Enum FAILED_TO_COMPARE for value: "FAILED_TO_COMPARE"
         */
        public static final ContentCompareResultEnum FAILED_TO_COMPARE =
            new ContentCompareResultEnum("FAILED_TO_COMPARE");

        /**
         * Enum TARGET_DB_NOT_EXIT for value: "TARGET_DB_NOT_EXIT"
         */
        public static final ContentCompareResultEnum TARGET_DB_NOT_EXIT =
            new ContentCompareResultEnum("TARGET_DB_NOT_EXIT");

        /**
         * Enum CAN_NOT_COMPARE for value: "CAN_NOT_COMPARE"
         */
        public static final ContentCompareResultEnum CAN_NOT_COMPARE = new ContentCompareResultEnum("CAN_NOT_COMPARE");

        private static final Map<String, ContentCompareResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ContentCompareResultEnum> createStaticFields() {
            Map<String, ContentCompareResultEnum> map = new HashMap<>();
            map.put("CONSISTENT", CONSISTENT);
            map.put("INCONSISTENT", INCONSISTENT);
            map.put("COMPARING", COMPARING);
            map.put("WAITING_FOR_COMPARISON", WAITING_FOR_COMPARISON);
            map.put("FAILED_TO_COMPARE", FAILED_TO_COMPARE);
            map.put("TARGET_DB_NOT_EXIT", TARGET_DB_NOT_EXIT);
            map.put("CAN_NOT_COMPARE", CAN_NOT_COMPARE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ContentCompareResultEnum(String value) {
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
        public static ContentCompareResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ContentCompareResultEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ContentCompareResultEnum(value);
            }
            return result;
        }

        public static ContentCompareResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ContentCompareResultEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ContentCompareResultEnum) {
                return this.value.equals(((ContentCompareResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_compare_result")

    private ContentCompareResultEnum contentCompareResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public ContentCompareDetail withSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
        return this;
    }

    /**
     * 源库名称。
     * @return sourceDbName
     */
    public String getSourceDbName() {
        return sourceDbName;
    }

    public void setSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
    }

    public ContentCompareDetail withTargetDbName(String targetDbName) {
        this.targetDbName = targetDbName;
        return this;
    }

    /**
     * 目标库名称。
     * @return targetDbName
     */
    public String getTargetDbName() {
        return targetDbName;
    }

    public void setTargetDbName(String targetDbName) {
        this.targetDbName = targetDbName;
    }

    public ContentCompareDetail withSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }

    /**
     * 源库的表名称。
     * @return sourceTableName
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    public ContentCompareDetail withTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }

    /**
     * 目标库的表名称。
     * @return targetTableName
     */
    public String getTargetTableName() {
        return targetTableName;
    }

    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    public ContentCompareDetail withSourceRowNum(Integer sourceRowNum) {
        this.sourceRowNum = sourceRowNum;
        return this;
    }

    /**
     * 源库的表的行数。
     * @return sourceRowNum
     */
    public Integer getSourceRowNum() {
        return sourceRowNum;
    }

    public void setSourceRowNum(Integer sourceRowNum) {
        this.sourceRowNum = sourceRowNum;
    }

    public ContentCompareDetail withTargetRowNum(Integer targetRowNum) {
        this.targetRowNum = targetRowNum;
        return this;
    }

    /**
     * 目标库的表的行数。
     * @return targetRowNum
     */
    public Integer getTargetRowNum() {
        return targetRowNum;
    }

    public void setTargetRowNum(Integer targetRowNum) {
        this.targetRowNum = targetRowNum;
    }

    public ContentCompareDetail withDiffRowNum(Integer diffRowNum) {
        this.diffRowNum = diffRowNum;
        return this;
    }

    /**
     * 源库的表和目标库的表的差异值。
     * @return diffRowNum
     */
    public Integer getDiffRowNum() {
        return diffRowNum;
    }

    public void setDiffRowNum(Integer diffRowNum) {
        this.diffRowNum = diffRowNum;
    }

    public ContentCompareDetail withLineCompareResult(LineCompareResultEnum lineCompareResult) {
        this.lineCompareResult = lineCompareResult;
        return this;
    }

    /**
     * 行对比结果。 - CONSISTENT-一致 - INCONSISTENT-不一致 - COMPARING-正在对比 - WAITING_FOR_COMPARISON-等待对比 - FAILED_TO_COMPARE-对比失败 - TARGET_DB_NOT_EXIT-目标库不存在 - CAN_NOT_COMPARE-无法对比
     * @return lineCompareResult
     */
    public LineCompareResultEnum getLineCompareResult() {
        return lineCompareResult;
    }

    public void setLineCompareResult(LineCompareResultEnum lineCompareResult) {
        this.lineCompareResult = lineCompareResult;
    }

    public ContentCompareDetail withContentCompareResult(ContentCompareResultEnum contentCompareResult) {
        this.contentCompareResult = contentCompareResult;
        return this;
    }

    /**
     * 内容对比结果。 - CONSISTENT-一致 - INCONSISTENT-不一致 - COMPARING-正在对比 - WAITING_FOR_COMPARISON-等待对比 - FAILED_TO_COMPARE-对比失败 - TARGET_DB_NOT_EXIT-目标库不存在 - CAN_NOT_COMPARE-无法对比
     * @return contentCompareResult
     */
    public ContentCompareResultEnum getContentCompareResult() {
        return contentCompareResult;
    }

    public void setContentCompareResult(ContentCompareResultEnum contentCompareResult) {
        this.contentCompareResult = contentCompareResult;
    }

    public ContentCompareDetail withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 附加信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentCompareDetail contentCompareDetail = (ContentCompareDetail) o;
        return Objects.equals(this.sourceDbName, contentCompareDetail.sourceDbName)
            && Objects.equals(this.targetDbName, contentCompareDetail.targetDbName)
            && Objects.equals(this.sourceTableName, contentCompareDetail.sourceTableName)
            && Objects.equals(this.targetTableName, contentCompareDetail.targetTableName)
            && Objects.equals(this.sourceRowNum, contentCompareDetail.sourceRowNum)
            && Objects.equals(this.targetRowNum, contentCompareDetail.targetRowNum)
            && Objects.equals(this.diffRowNum, contentCompareDetail.diffRowNum)
            && Objects.equals(this.lineCompareResult, contentCompareDetail.lineCompareResult)
            && Objects.equals(this.contentCompareResult, contentCompareDetail.contentCompareResult)
            && Objects.equals(this.message, contentCompareDetail.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceDbName,
            targetDbName,
            sourceTableName,
            targetTableName,
            sourceRowNum,
            targetRowNum,
            diffRowNum,
            lineCompareResult,
            contentCompareResult,
            message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentCompareDetail {\n");
        sb.append("    sourceDbName: ").append(toIndentedString(sourceDbName)).append("\n");
        sb.append("    targetDbName: ").append(toIndentedString(targetDbName)).append("\n");
        sb.append("    sourceTableName: ").append(toIndentedString(sourceTableName)).append("\n");
        sb.append("    targetTableName: ").append(toIndentedString(targetTableName)).append("\n");
        sb.append("    sourceRowNum: ").append(toIndentedString(sourceRowNum)).append("\n");
        sb.append("    targetRowNum: ").append(toIndentedString(targetRowNum)).append("\n");
        sb.append("    diffRowNum: ").append(toIndentedString(diffRowNum)).append("\n");
        sb.append("    lineCompareResult: ").append(toIndentedString(lineCompareResult)).append("\n");
        sb.append("    contentCompareResult: ").append(toIndentedString(contentCompareResult)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
