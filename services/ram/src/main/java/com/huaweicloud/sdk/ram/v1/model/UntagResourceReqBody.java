package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * The request body of the UntagResource operation.
 */
public class UntagResourceReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Untag> tags = null;

    public UntagResourceReqBody withTags(List<Untag> tags) {
        this.tags = tags;
        return this;
    }

    public UntagResourceReqBody addTagsItem(Untag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UntagResourceReqBody withTags(Consumer<List<Untag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 一个或多个标签键值对的列表。标签键必须存在，而不是空字符串。标签值必须存在，但可以是空字符串。
     * @return tags
     */
    public List<Untag> getTags() {
        return tags;
    }

    public void setTags(List<Untag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UntagResourceReqBody untagResourceReqBody = (UntagResourceReqBody) o;
        return Objects.equals(this.tags, untagResourceReqBody.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UntagResourceReqBody {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
