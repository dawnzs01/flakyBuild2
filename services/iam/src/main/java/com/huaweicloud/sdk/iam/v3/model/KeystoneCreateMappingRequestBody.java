package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class KeystoneCreateMappingRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping")

    private MappingOption mapping;

    public KeystoneCreateMappingRequestBody withMapping(MappingOption mapping) {
        this.mapping = mapping;
        return this;
    }

    public KeystoneCreateMappingRequestBody withMapping(Consumer<MappingOption> mappingSetter) {
        if (this.mapping == null) {
            this.mapping = new MappingOption();
            mappingSetter.accept(this.mapping);
        }

        return this;
    }

    /**
     * Get mapping
     * @return mapping
     */
    public MappingOption getMapping() {
        return mapping;
    }

    public void setMapping(MappingOption mapping) {
        this.mapping = mapping;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneCreateMappingRequestBody keystoneCreateMappingRequestBody = (KeystoneCreateMappingRequestBody) o;
        return Objects.equals(this.mapping, keystoneCreateMappingRequestBody.mapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneCreateMappingRequestBody {\n");
        sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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
