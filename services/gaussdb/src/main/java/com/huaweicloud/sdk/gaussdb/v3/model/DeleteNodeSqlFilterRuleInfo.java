package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteNodeSqlFilterRule;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 节点级别的SQL限流规则。
 */
public class DeleteNodeSqlFilterRuleInfo  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rules")
    
    private List<DeleteNodeSqlFilterRule> rules = null;
    
    public DeleteNodeSqlFilterRuleInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    

    public DeleteNodeSqlFilterRuleInfo withRules(List<DeleteNodeSqlFilterRule> rules) {
        this.rules = rules;
        return this;
    }

    
    public DeleteNodeSqlFilterRuleInfo addRulesItem(DeleteNodeSqlFilterRule rulesItem) {
        if(this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public DeleteNodeSqlFilterRuleInfo withRules(Consumer<List<DeleteNodeSqlFilterRule>> rulesSetter) {
        if(this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * SQL限流规则。
     * @return rules
     */
    public List<DeleteNodeSqlFilterRule> getRules() {
        return rules;
    }

    public void setRules(List<DeleteNodeSqlFilterRule> rules) {
        this.rules = rules;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteNodeSqlFilterRuleInfo deleteNodeSqlFilterRuleInfo = (DeleteNodeSqlFilterRuleInfo) o;
        return Objects.equals(this.nodeId, deleteNodeSqlFilterRuleInfo.nodeId) &&
            Objects.equals(this.rules, deleteNodeSqlFilterRuleInfo.rules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeId, rules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteNodeSqlFilterRuleInfo {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

