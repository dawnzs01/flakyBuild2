package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GroupTreeResponse
 */
public class GroupTreeResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private Integer parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<GroupTreeResponse> children = null;

    public GroupTreeResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 分组id
     * minimum: 1
     * maximum: 99999999
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GroupTreeResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupTreeResponse withParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父分组id
     * minimum: 1
     * maximum: 99999999
     * @return parentId
     */
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public GroupTreeResponse withChildren(List<GroupTreeResponse> children) {
        this.children = children;
        return this;
    }

    public GroupTreeResponse addChildrenItem(GroupTreeResponse childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public GroupTreeResponse withChildren(Consumer<List<GroupTreeResponse>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 子分组
     * @return children
     */
    public List<GroupTreeResponse> getChildren() {
        return children;
    }

    public void setChildren(List<GroupTreeResponse> children) {
        this.children = children;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GroupTreeResponse groupTreeResponse = (GroupTreeResponse) o;
        return Objects.equals(this.id, groupTreeResponse.id) && Objects.equals(this.name, groupTreeResponse.name)
            && Objects.equals(this.parentId, groupTreeResponse.parentId)
            && Objects.equals(this.children, groupTreeResponse.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, parentId, children);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupTreeResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
