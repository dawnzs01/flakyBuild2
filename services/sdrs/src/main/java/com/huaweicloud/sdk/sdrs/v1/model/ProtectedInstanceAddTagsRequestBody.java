package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 添加保护实例标签请求体
 */
public class ProtectedInstanceAddTagsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private ResourceTag tag;

    public ProtectedInstanceAddTagsRequestBody withTag(ResourceTag tag) {
        this.tag = tag;
        return this;
    }

    public ProtectedInstanceAddTagsRequestBody withTag(Consumer<ResourceTag> tagSetter) {
        if (this.tag == null) {
            this.tag = new ResourceTag();
            tagSetter.accept(this.tag);
        }

        return this;
    }

    /**
     * Get tag
     * @return tag
     */
    public ResourceTag getTag() {
        return tag;
    }

    public void setTag(ResourceTag tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtectedInstanceAddTagsRequestBody protectedInstanceAddTagsRequestBody =
            (ProtectedInstanceAddTagsRequestBody) o;
        return Objects.equals(this.tag, protectedInstanceAddTagsRequestBody.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedInstanceAddTagsRequestBody {\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
