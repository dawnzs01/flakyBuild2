package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新或者查询结构化模板对象
 */
public class StructTemplateModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    /**
     * 模板类型，regex,json,split,nginx
     */
    public static final class TemplateTypeEnum {

        /**
         * Enum REGEX for value: "regex"
         */
        public static final TemplateTypeEnum REGEX = new TemplateTypeEnum("regex");

        /**
         * Enum JSON for value: "json"
         */
        public static final TemplateTypeEnum JSON = new TemplateTypeEnum("json");

        /**
         * Enum SPLIT for value: "split"
         */
        public static final TemplateTypeEnum SPLIT = new TemplateTypeEnum("split");

        /**
         * Enum NGINX for value: "nginx"
         */
        public static final TemplateTypeEnum NGINX = new TemplateTypeEnum("nginx");

        private static final Map<String, TemplateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TemplateTypeEnum> createStaticFields() {
            Map<String, TemplateTypeEnum> map = new HashMap<>();
            map.put("regex", REGEX);
            map.put("json", JSON);
            map.put("split", SPLIT);
            map.put("nginx", NGINX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TemplateTypeEnum(String value) {
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
        public static TemplateTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TemplateTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TemplateTypeEnum(value);
            }
            return result;
        }

        public static TemplateTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TemplateTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TemplateTypeEnum) {
                return this.value.equals(((TemplateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_type")

    private TemplateTypeEnum templateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demo_log")

    private String demoLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demo_fields")

    private List<DemoField> demoFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_fields")

    private List<TagFieldNew> tagFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private TemplateRule rule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demo_label")

    private String demoLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public StructTemplateModel withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public StructTemplateModel withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 模板名称
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public StructTemplateModel withTemplateType(TemplateTypeEnum templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * 模板类型，regex,json,split,nginx
     * @return templateType
     */
    public TemplateTypeEnum getTemplateType() {
        return templateType;
    }

    public void setTemplateType(TemplateTypeEnum templateType) {
        this.templateType = templateType;
    }

    public StructTemplateModel withDemoLog(String demoLog) {
        this.demoLog = demoLog;
        return this;
    }

    /**
     * 示例日志
     * @return demoLog
     */
    public String getDemoLog() {
        return demoLog;
    }

    public void setDemoLog(String demoLog) {
        this.demoLog = demoLog;
    }

    public StructTemplateModel withDemoFields(List<DemoField> demoFields) {
        this.demoFields = demoFields;
        return this;
    }

    public StructTemplateModel addDemoFieldsItem(DemoField demoFieldsItem) {
        if (this.demoFields == null) {
            this.demoFields = new ArrayList<>();
        }
        this.demoFields.add(demoFieldsItem);
        return this;
    }

    public StructTemplateModel withDemoFields(Consumer<List<DemoField>> demoFieldsSetter) {
        if (this.demoFields == null) {
            this.demoFields = new ArrayList<>();
        }
        demoFieldsSetter.accept(this.demoFields);
        return this;
    }

    /**
     * 示例字段数组
     * @return demoFields
     */
    public List<DemoField> getDemoFields() {
        return demoFields;
    }

    public void setDemoFields(List<DemoField> demoFields) {
        this.demoFields = demoFields;
    }

    public StructTemplateModel withTagFields(List<TagFieldNew> tagFields) {
        this.tagFields = tagFields;
        return this;
    }

    public StructTemplateModel addTagFieldsItem(TagFieldNew tagFieldsItem) {
        if (this.tagFields == null) {
            this.tagFields = new ArrayList<>();
        }
        this.tagFields.add(tagFieldsItem);
        return this;
    }

    public StructTemplateModel withTagFields(Consumer<List<TagFieldNew>> tagFieldsSetter) {
        if (this.tagFields == null) {
            this.tagFields = new ArrayList<>();
        }
        tagFieldsSetter.accept(this.tagFields);
        return this;
    }

    /**
     * Tag字段数组
     * @return tagFields
     */
    public List<TagFieldNew> getTagFields() {
        return tagFields;
    }

    public void setTagFields(List<TagFieldNew> tagFields) {
        this.tagFields = tagFields;
    }

    public StructTemplateModel withRule(TemplateRule rule) {
        this.rule = rule;
        return this;
    }

    public StructTemplateModel withRule(Consumer<TemplateRule> ruleSetter) {
        if (this.rule == null) {
            this.rule = new TemplateRule();
            ruleSetter.accept(this.rule);
        }

        return this;
    }

    /**
     * Get rule
     * @return rule
     */
    public TemplateRule getRule() {
        return rule;
    }

    public void setRule(TemplateRule rule) {
        this.rule = rule;
    }

    public StructTemplateModel withDemoLabel(String demoLabel) {
        this.demoLabel = demoLabel;
        return this;
    }

    /**
     * 示例日志标签
     * @return demoLabel
     */
    public String getDemoLabel() {
        return demoLabel;
    }

    public void setDemoLabel(String demoLabel) {
        this.demoLabel = demoLabel;
    }

    public StructTemplateModel withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 20000000000000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public StructTemplateModel withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 模板id
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
        StructTemplateModel structTemplateModel = (StructTemplateModel) o;
        return Objects.equals(this.projectId, structTemplateModel.projectId)
            && Objects.equals(this.templateName, structTemplateModel.templateName)
            && Objects.equals(this.templateType, structTemplateModel.templateType)
            && Objects.equals(this.demoLog, structTemplateModel.demoLog)
            && Objects.equals(this.demoFields, structTemplateModel.demoFields)
            && Objects.equals(this.tagFields, structTemplateModel.tagFields)
            && Objects.equals(this.rule, structTemplateModel.rule)
            && Objects.equals(this.demoLabel, structTemplateModel.demoLabel)
            && Objects.equals(this.createTime, structTemplateModel.createTime)
            && Objects.equals(this.id, structTemplateModel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            templateName,
            templateType,
            demoLog,
            demoFields,
            tagFields,
            rule,
            demoLabel,
            createTime,
            id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StructTemplateModel {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    demoLog: ").append(toIndentedString(demoLog)).append("\n");
        sb.append("    demoFields: ").append(toIndentedString(demoFields)).append("\n");
        sb.append("    tagFields: ").append(toIndentedString(tagFields)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    demoLabel: ").append(toIndentedString(demoLabel)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
