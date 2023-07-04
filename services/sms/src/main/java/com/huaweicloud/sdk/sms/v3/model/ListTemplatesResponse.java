package com.huaweicloud.sdk.sms.v3.model;

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
public class ListTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    private List<TemplateResponseBody> templates = null;

    public ListTemplatesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 模板个数
     * minimum: 0
     * maximum: 65535
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListTemplatesResponse withTemplates(List<TemplateResponseBody> templates) {
        this.templates = templates;
        return this;
    }

    public ListTemplatesResponse addTemplatesItem(TemplateResponseBody templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ListTemplatesResponse withTemplates(Consumer<List<TemplateResponseBody>> templatesSetter) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * 模板信息
     * @return templates
     */
    public List<TemplateResponseBody> getTemplates() {
        return templates;
    }

    public void setTemplates(List<TemplateResponseBody> templates) {
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
        ListTemplatesResponse listTemplatesResponse = (ListTemplatesResponse) o;
        return Objects.equals(this.count, listTemplatesResponse.count)
            && Objects.equals(this.templates, listTemplatesResponse.templates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, templates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplatesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
