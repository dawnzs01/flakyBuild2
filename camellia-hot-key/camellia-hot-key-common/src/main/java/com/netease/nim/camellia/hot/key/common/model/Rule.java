package com.netease.nim.camellia.hot.key.common.model;

import java.util.Objects;

/**
 * Created by caojiajun on 2023/5/8
 */
public class Rule {
    private String name;
    private RuleType type;
    private String keyConfig;
    private Long checkMillis;
    private Long checkThreshold;
    private Long expireMillis;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RuleType getType() {
        return type;
    }

    public void setType(RuleType type) {
        this.type = type;
    }

    public String getKeyConfig() {
        return keyConfig;
    }

    public void setKeyConfig(String keyConfig) {
        this.keyConfig = keyConfig;
    }

    public Long getCheckMillis() {
        return checkMillis;
    }

    public void setCheckMillis(Long checkMillis) {
        this.checkMillis = checkMillis;
    }

    public Long getCheckThreshold() {
        return checkThreshold;
    }

    public void setCheckThreshold(Long checkThreshold) {
        this.checkThreshold = checkThreshold;
    }

    public Long getExpireMillis() {
        return expireMillis;
    }

    public void setExpireMillis(Long expireMillis) {
        this.expireMillis = expireMillis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rule rule = (Rule) o;
        return Objects.equals(name, rule.name) && type == rule.type && Objects.equals(keyConfig, rule.keyConfig)
                && Objects.equals(checkMillis, rule.checkMillis) && Objects.equals(checkThreshold, rule.checkThreshold)
                && Objects.equals(expireMillis, rule.expireMillis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, keyConfig, checkMillis, checkThreshold, expireMillis);
    }
}
