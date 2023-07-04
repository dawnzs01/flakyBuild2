package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 镜像老化规则
 */
public class Retention {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm")

    private String algorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<Rule> rules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    public Retention withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * 回收规则匹配策略，or
     * @return algorithm
     */
    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public Retention withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Retention withRules(List<Rule> rules) {
        this.rules = rules;
        return this;
    }

    public Retention addRulesItem(Rule rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public Retention withRules(Consumer<List<Rule>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 镜像老化规则
     * @return rules
     */
    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    public Retention withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 保留字段
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Retention retention = (Retention) o;
        return Objects.equals(this.algorithm, retention.algorithm) && Objects.equals(this.id, retention.id)
            && Objects.equals(this.rules, retention.rules) && Objects.equals(this.scope, retention.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(algorithm, id, rules, scope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Retention {\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
