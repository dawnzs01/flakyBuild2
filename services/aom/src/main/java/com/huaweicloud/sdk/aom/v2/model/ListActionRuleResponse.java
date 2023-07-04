package com.huaweicloud.sdk.aom.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.ActionRule;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListActionRuleResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action_rules")
    
    private List<ActionRule> actionRules = null;
    
    public ListActionRuleResponse withActionRules(List<ActionRule> actionRules) {
        this.actionRules = actionRules;
        return this;
    }

    
    public ListActionRuleResponse addActionRulesItem(ActionRule actionRulesItem) {
        if(this.actionRules == null) {
            this.actionRules = new ArrayList<>();
        }
        this.actionRules.add(actionRulesItem);
        return this;
    }

    public ListActionRuleResponse withActionRules(Consumer<List<ActionRule>> actionRulesSetter) {
        if(this.actionRules == null) {
            this.actionRules = new ArrayList<>();
        }
        actionRulesSetter.accept(this.actionRules);
        return this;
    }

    /**
     * 告警行动规则列表
     * @return actionRules
     */
    public List<ActionRule> getActionRules() {
        return actionRules;
    }

    public void setActionRules(List<ActionRule> actionRules) {
        this.actionRules = actionRules;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListActionRuleResponse listActionRuleResponse = (ListActionRuleResponse) o;
        return Objects.equals(this.actionRules, listActionRuleResponse.actionRules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(actionRules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListActionRuleResponse {\n");
        sb.append("    actionRules: ").append(toIndentedString(actionRules)).append("\n");
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

