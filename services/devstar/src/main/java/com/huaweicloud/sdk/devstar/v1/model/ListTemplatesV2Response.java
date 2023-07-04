package com.huaweicloud.sdk.devstar.v1.model;

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
public class ListTemplatesV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invalid_count")

    private Integer invalidCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    private List<TemplateInfo> templates = null;

    public ListTemplatesV2Response withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 返回模板的数量。
     * minimum: 0
     * maximum: 100
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListTemplatesV2Response withInvalidCount(Integer invalidCount) {
        this.invalidCount = invalidCount;
        return this;
    }

    /**
     * 返回关联了失效资源的模板数量。
     * minimum: 0
     * maximum: 100
     * @return invalidCount
     */
    public Integer getInvalidCount() {
        return invalidCount;
    }

    public void setInvalidCount(Integer invalidCount) {
        this.invalidCount = invalidCount;
    }

    public ListTemplatesV2Response withTemplates(List<TemplateInfo> templates) {
        this.templates = templates;
        return this;
    }

    public ListTemplatesV2Response addTemplatesItem(TemplateInfo templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ListTemplatesV2Response withTemplates(Consumer<List<TemplateInfo>> templatesSetter) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * 返回模板的列表。
     * @return templates
     */
    public List<TemplateInfo> getTemplates() {
        return templates;
    }

    public void setTemplates(List<TemplateInfo> templates) {
        this.templates = templates;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTemplatesV2Response listTemplatesV2Response = (ListTemplatesV2Response) o;
        return Objects.equals(this.count, listTemplatesV2Response.count)
            && Objects.equals(this.invalidCount, listTemplatesV2Response.invalidCount)
            && Objects.equals(this.templates, listTemplatesV2Response.templates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, invalidCount, templates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplatesV2Response {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    invalidCount: ").append(toIndentedString(invalidCount)).append("\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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
