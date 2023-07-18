package com.netease.nim.camellia.hot.key.common.model;

import java.util.List;
import java.util.Objects;

/**
 * Created by caojiajun on 2023/5/8
 */
public class HotKeyConfig {

    private String namespace;
    private List<Rule> rules;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotKeyConfig that = (HotKeyConfig) o;
        return Objects.equals(namespace, that.namespace) && Objects.equals(rules, that.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, rules);
    }
}
