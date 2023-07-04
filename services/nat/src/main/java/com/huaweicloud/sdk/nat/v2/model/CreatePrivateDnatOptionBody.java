package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建DNAT规则的请求体。
 */
public class CreatePrivateDnatOptionBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnat_rule")

    private CreatePrivateDnatOption dnatRule;

    public CreatePrivateDnatOptionBody withDnatRule(CreatePrivateDnatOption dnatRule) {
        this.dnatRule = dnatRule;
        return this;
    }

    public CreatePrivateDnatOptionBody withDnatRule(Consumer<CreatePrivateDnatOption> dnatRuleSetter) {
        if (this.dnatRule == null) {
            this.dnatRule = new CreatePrivateDnatOption();
            dnatRuleSetter.accept(this.dnatRule);
        }

        return this;
    }

    /**
     * Get dnatRule
     * @return dnatRule
     */
    public CreatePrivateDnatOption getDnatRule() {
        return dnatRule;
    }

    public void setDnatRule(CreatePrivateDnatOption dnatRule) {
        this.dnatRule = dnatRule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePrivateDnatOptionBody createPrivateDnatOptionBody = (CreatePrivateDnatOptionBody) o;
        return Objects.equals(this.dnatRule, createPrivateDnatOptionBody.dnatRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnatRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateDnatOptionBody {\n");
        sb.append("    dnatRule: ").append(toIndentedString(dnatRule)).append("\n");
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
