package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateCustomRuleRequestBody
 */
public class UpdateCustomRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Boolean time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Long start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminal")

    private Long terminal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<CustomConditions> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private CustomAction action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    public UpdateCustomRuleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateCustomRuleRequestBody withTime(Boolean time) {
        this.time = time;
        return this;
    }

    /**
     * 精准防护规则生效时间:  - “false”：表示该规则立即生效。   - “true”：表示自定义生效时间。
     * @return time
     */
    public Boolean getTime() {
        return time;
    }

    public void setTime(Boolean time) {
        this.time = time;
    }

    public UpdateCustomRuleRequestBody withStart(Long start) {
        this.start = start;
        return this;
    }

    /**
     * 精准防护规则生效的起始时间戳（毫秒）。当time=true，才需要填写该参数。
     * @return start
     */
    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public UpdateCustomRuleRequestBody withTerminal(Long terminal) {
        this.terminal = terminal;
        return this;
    }

    /**
     * 精准防护规则生效的终止时间戳（毫秒）。当time=true，才需要填写该参数。
     * @return terminal
     */
    public Long getTerminal() {
        return terminal;
    }

    public void setTerminal(Long terminal) {
        this.terminal = terminal;
    }

    public UpdateCustomRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateCustomRuleRequestBody withConditions(List<CustomConditions> conditions) {
        this.conditions = conditions;
        return this;
    }

    public UpdateCustomRuleRequestBody addConditionsItem(CustomConditions conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public UpdateCustomRuleRequestBody withConditions(Consumer<List<CustomConditions>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 匹配条件列表
     * @return conditions
     */
    public List<CustomConditions> getConditions() {
        return conditions;
    }

    public void setConditions(List<CustomConditions> conditions) {
        this.conditions = conditions;
    }

    public UpdateCustomRuleRequestBody withAction(CustomAction action) {
        this.action = action;
        return this;
    }

    public UpdateCustomRuleRequestBody withAction(Consumer<CustomAction> actionSetter) {
        if (this.action == null) {
            this.action = new CustomAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public CustomAction getAction() {
        return action;
    }

    public void setAction(CustomAction action) {
        this.action = action;
    }

    public UpdateCustomRuleRequestBody withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 执行该规则的优先级，值越小，优先级越高，值相同时，规则创建时间早，优先级越高。取值范围：0到1000。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCustomRuleRequestBody updateCustomRuleRequestBody = (UpdateCustomRuleRequestBody) o;
        return Objects.equals(this.name, updateCustomRuleRequestBody.name)
            && Objects.equals(this.time, updateCustomRuleRequestBody.time)
            && Objects.equals(this.start, updateCustomRuleRequestBody.start)
            && Objects.equals(this.terminal, updateCustomRuleRequestBody.terminal)
            && Objects.equals(this.description, updateCustomRuleRequestBody.description)
            && Objects.equals(this.conditions, updateCustomRuleRequestBody.conditions)
            && Objects.equals(this.action, updateCustomRuleRequestBody.action)
            && Objects.equals(this.priority, updateCustomRuleRequestBody.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, time, start, terminal, description, conditions, action, priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCustomRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
