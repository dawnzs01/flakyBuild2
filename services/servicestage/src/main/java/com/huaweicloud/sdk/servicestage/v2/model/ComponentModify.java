package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ComponentModify
 */
public class ComponentModify {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private SourceObject source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build")

    private Build build;

    public ComponentModify withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用组件名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentModify withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ComponentModify withSource(SourceObject source) {
        this.source = source;
        return this;
    }

    public ComponentModify withSource(Consumer<SourceObject> sourceSetter) {
        if (this.source == null) {
            this.source = new SourceObject();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public SourceObject getSource() {
        return source;
    }

    public void setSource(SourceObject source) {
        this.source = source;
    }

    public ComponentModify withBuild(Build build) {
        this.build = build;
        return this;
    }

    public ComponentModify withBuild(Consumer<Build> buildSetter) {
        if (this.build == null) {
            this.build = new Build();
            buildSetter.accept(this.build);
        }

        return this;
    }

    /**
     * Get build
     * @return build
     */
    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentModify componentModify = (ComponentModify) o;
        return Objects.equals(this.name, componentModify.name)
            && Objects.equals(this.description, componentModify.description)
            && Objects.equals(this.source, componentModify.source) && Objects.equals(this.build, componentModify.build);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, source, build);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentModify {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    build: ").append(toIndentedString(build)).append("\n");
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
