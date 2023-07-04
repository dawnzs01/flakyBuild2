package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResQuest
 */
public class ResQuest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limits")

    private Res limits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requests")

    private Res requests;

    public ResQuest withLimits(Res limits) {
        this.limits = limits;
        return this;
    }

    public ResQuest withLimits(Consumer<Res> limitsSetter) {
        if (this.limits == null) {
            this.limits = new Res();
            limitsSetter.accept(this.limits);
        }

        return this;
    }

    /**
     * Get limits
     * @return limits
     */
    public Res getLimits() {
        return limits;
    }

    public void setLimits(Res limits) {
        this.limits = limits;
    }

    public ResQuest withRequests(Res requests) {
        this.requests = requests;
        return this;
    }

    public ResQuest withRequests(Consumer<Res> requestsSetter) {
        if (this.requests == null) {
            this.requests = new Res();
            requestsSetter.accept(this.requests);
        }

        return this;
    }

    /**
     * Get requests
     * @return requests
     */
    public Res getRequests() {
        return requests;
    }

    public void setRequests(Res requests) {
        this.requests = requests;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResQuest resQuest = (ResQuest) o;
        return Objects.equals(this.limits, resQuest.limits) && Objects.equals(this.requests, resQuest.requests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limits, requests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResQuest {\n");
        sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
        sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
