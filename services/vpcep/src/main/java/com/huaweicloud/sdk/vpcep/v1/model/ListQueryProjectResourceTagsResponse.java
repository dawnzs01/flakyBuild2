package com.huaweicloud.sdk.vpcep.v1.model;

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
public class ListQueryProjectResourceTagsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagValuesList> tags = null;

    public ListQueryProjectResourceTagsResponse withTags(List<TagValuesList> tags) {
        this.tags = tags;
        return this;
    }

    public ListQueryProjectResourceTagsResponse addTagsItem(TagValuesList tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListQueryProjectResourceTagsResponse withTags(Consumer<List<TagValuesList>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 包含标签，最多包含10个key，每个key下面的value最多10个， 每个key对应的value可以为空数组但结构体不能缺失。 Key不能重复，同一个key中values不能重复。结果返回包含所有标签的资源列表， key之间是与的关系，key-value结构中value是或的关系。无tag过滤条件时返回全量数据。
     * @return tags
     */
    public List<TagValuesList> getTags() {
        return tags;
    }

    public void setTags(List<TagValuesList> tags) {
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
        ListQueryProjectResourceTagsResponse listQueryProjectResourceTagsResponse =
            (ListQueryProjectResourceTagsResponse) o;
        return Objects.equals(this.tags, listQueryProjectResourceTagsResponse.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueryProjectResourceTagsResponse {\n");
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
