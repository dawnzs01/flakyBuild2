package com.huaweicloud.sdk.koomessage.v1.model;

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
public class ListAimTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    private List<AIMTemplate> templates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private Page pageInfo;

    public ListAimTemplatesResponse withTemplates(List<AIMTemplate> templates) {
        this.templates = templates;
        return this;
    }

    public ListAimTemplatesResponse addTemplatesItem(AIMTemplate templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ListAimTemplatesResponse withTemplates(Consumer<List<AIMTemplate>> templatesSetter) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * 模板列表。
     * @return templates
     */
    public List<AIMTemplate> getTemplates() {
        return templates;
    }

    public void setTemplates(List<AIMTemplate> templates) {
        this.templates = templates;
    }

    public ListAimTemplatesResponse withPageInfo(Page pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAimTemplatesResponse withPageInfo(Consumer<Page> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new Page();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public Page getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(Page pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAimTemplatesResponse listAimTemplatesResponse = (ListAimTemplatesResponse) o;
        return Objects.equals(this.templates, listAimTemplatesResponse.templates)
            && Objects.equals(this.pageInfo, listAimTemplatesResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templates, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAimTemplatesResponse {\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
