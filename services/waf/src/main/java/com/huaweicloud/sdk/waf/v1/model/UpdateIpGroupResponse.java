package com.huaweicloud.sdk.waf.v1.model;

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
public class UpdateIpGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips")

    private String ips;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<RuleInfo> rules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpdateIpGroupResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 地址组id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateIpGroupResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 地址组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateIpGroupResponse withIps(String ips) {
        this.ips = ips;
        return this;
    }

    /**
     * 地址组ip（以逗号分隔的ip或ip段）
     * @return ips
     */
    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public UpdateIpGroupResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 地址组长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public UpdateIpGroupResponse withRules(List<RuleInfo> rules) {
        this.rules = rules;
        return this;
    }

    public UpdateIpGroupResponse addRulesItem(RuleInfo rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public UpdateIpGroupResponse withRules(Consumer<List<RuleInfo>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * ip地址组绑定的规则列表
     * @return rules
     */
    public List<RuleInfo> getRules() {
        return rules;
    }

    public void setRules(List<RuleInfo> rules) {
        this.rules = rules;
    }

    public UpdateIpGroupResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 地址组描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateIpGroupResponse updateIpGroupResponse = (UpdateIpGroupResponse) o;
        return Objects.equals(this.id, updateIpGroupResponse.id)
            && Objects.equals(this.name, updateIpGroupResponse.name)
            && Objects.equals(this.ips, updateIpGroupResponse.ips)
            && Objects.equals(this.size, updateIpGroupResponse.size)
            && Objects.equals(this.rules, updateIpGroupResponse.rules)
            && Objects.equals(this.description, updateIpGroupResponse.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ips, size, rules, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIpGroupResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
