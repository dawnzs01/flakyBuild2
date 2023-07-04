package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * IndependentReq
 */
public class IndependentReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private IndependentBodyReq type;

    public IndependentReq withType(IndependentBodyReq type) {
        this.type = type;
        return this;
    }

    public IndependentReq withType(Consumer<IndependentBodyReq> typeSetter) {
        if (this.type == null) {
            this.type = new IndependentBodyReq();
            typeSetter.accept(this.type);
        }

        return this;
    }

    /**
     * Get type
     * @return type
     */
    public IndependentBodyReq getType() {
        return type;
    }

    public void setType(IndependentBodyReq type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IndependentReq independentReq = (IndependentReq) o;
        return Objects.equals(this.type, independentReq.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndependentReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
