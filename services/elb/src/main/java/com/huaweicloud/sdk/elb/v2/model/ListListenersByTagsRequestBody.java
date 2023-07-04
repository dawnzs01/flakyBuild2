package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class ListListenersByTagsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<ActionMatch> matches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ActionTag> tags = null;

    public ListListenersByTagsRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页起始。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListListenersByTagsRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页大小。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListListenersByTagsRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 操作标识（仅限于filter，count）： filter（过滤），如果是filter就是分页查询 count(查询总条数)，按照条件将总条数返回。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ListListenersByTagsRequestBody withMatches(List<ActionMatch> matches) {
        this.matches = matches;
        return this;
    }

    public ListListenersByTagsRequestBody addMatchesItem(ActionMatch matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ListListenersByTagsRequestBody withMatches(Consumer<List<ActionMatch>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 搜索字段，key为要匹配的字段，如resource_name等。value为匹配的值。key为固定字典值。根据不同的字段确认是否需要模糊匹配，如resource_name默认为模糊搜索，如果value为空字符串精确匹配。key如果是resource_id则精确匹配。
     * @return matches
     */
    public List<ActionMatch> getMatches() {
        return matches;
    }

    public void setMatches(List<ActionMatch> matches) {
        this.matches = matches;
    }

    public ListListenersByTagsRequestBody withTags(List<ActionTag> tags) {
        this.tags = tags;
        return this;
    }

    public ListListenersByTagsRequestBody addTagsItem(ActionTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListListenersByTagsRequestBody withTags(Consumer<List<ActionTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 要搜索的标签值
     * @return tags
     */
    public List<ActionTag> getTags() {
        return tags;
    }

    public void setTags(List<ActionTag> tags) {
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
        ListListenersByTagsRequestBody listListenersByTagsRequestBody = (ListListenersByTagsRequestBody) o;
        return Objects.equals(this.offset, listListenersByTagsRequestBody.offset)
            && Objects.equals(this.limit, listListenersByTagsRequestBody.limit)
            && Objects.equals(this.action, listListenersByTagsRequestBody.action)
            && Objects.equals(this.matches, listListenersByTagsRequestBody.matches)
            && Objects.equals(this.tags, listListenersByTagsRequestBody.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, action, matches, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListListenersByTagsRequestBody {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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
