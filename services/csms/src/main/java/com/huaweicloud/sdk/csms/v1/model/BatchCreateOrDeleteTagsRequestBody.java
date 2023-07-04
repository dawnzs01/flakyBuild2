package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchCreateOrDeleteTagsRequestBody
 */
public class BatchCreateOrDeleteTagsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagItem> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    public BatchCreateOrDeleteTagsRequestBody withTags(List<TagItem> tags) {
        this.tags = tags;
        return this;
    }

    public BatchCreateOrDeleteTagsRequestBody addTagsItem(TagItem tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchCreateOrDeleteTagsRequestBody withTags(Consumer<List<TagItem>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表，key和value键值对的集合。
     * @return tags
     */
    public List<TagItem> getTags() {
        return tags;
    }

    public void setTags(List<TagItem> tags) {
        this.tags = tags;
    }

    public BatchCreateOrDeleteTagsRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 操作标识： 仅限于“create”和“delete”。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public BatchCreateOrDeleteTagsRequestBody withSequence(String sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * 请求消息序列号，36字节序列号。 例如：919c82d4-8046-4722-9094-35c3c6524cff
     * @return sequence
     */
    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCreateOrDeleteTagsRequestBody batchCreateOrDeleteTagsRequestBody = (BatchCreateOrDeleteTagsRequestBody) o;
        return Objects.equals(this.tags, batchCreateOrDeleteTagsRequestBody.tags)
            && Objects.equals(this.action, batchCreateOrDeleteTagsRequestBody.action)
            && Objects.equals(this.sequence, batchCreateOrDeleteTagsRequestBody.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, action, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateOrDeleteTagsRequestBody {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
