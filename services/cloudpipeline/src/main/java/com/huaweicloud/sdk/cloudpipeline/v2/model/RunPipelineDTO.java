package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 运行流水线请求体
 */
public class RunPipelineDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<RunPipelineDTOSources> sources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variables")

    private List<RunPipelineDTOVariables> variables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "choose_jobs")

    private List<String> chooseJobs = null;

    public RunPipelineDTO withSources(List<RunPipelineDTOSources> sources) {
        this.sources = sources;
        return this;
    }

    public RunPipelineDTO addSourcesItem(RunPipelineDTOSources sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public RunPipelineDTO withSources(Consumer<List<RunPipelineDTOSources>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 使用的源
     * @return sources
     */
    public List<RunPipelineDTOSources> getSources() {
        return sources;
    }

    public void setSources(List<RunPipelineDTOSources> sources) {
        this.sources = sources;
    }

    public RunPipelineDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 运行描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RunPipelineDTO withVariables(List<RunPipelineDTOVariables> variables) {
        this.variables = variables;
        return this;
    }

    public RunPipelineDTO addVariablesItem(RunPipelineDTOVariables variablesItem) {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        this.variables.add(variablesItem);
        return this;
    }

    public RunPipelineDTO withVariables(Consumer<List<RunPipelineDTOVariables>> variablesSetter) {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        variablesSetter.accept(this.variables);
        return this;
    }

    /**
     * 使用的自定义参数
     * @return variables
     */
    public List<RunPipelineDTOVariables> getVariables() {
        return variables;
    }

    public void setVariables(List<RunPipelineDTOVariables> variables) {
        this.variables = variables;
    }

    public RunPipelineDTO withChooseJobs(List<String> chooseJobs) {
        this.chooseJobs = chooseJobs;
        return this;
    }

    public RunPipelineDTO addChooseJobsItem(String chooseJobsItem) {
        if (this.chooseJobs == null) {
            this.chooseJobs = new ArrayList<>();
        }
        this.chooseJobs.add(chooseJobsItem);
        return this;
    }

    public RunPipelineDTO withChooseJobs(Consumer<List<String>> chooseJobsSetter) {
        if (this.chooseJobs == null) {
            this.chooseJobs = new ArrayList<>();
        }
        chooseJobsSetter.accept(this.chooseJobs);
        return this;
    }

    /**
     * 选择的任务
     * @return chooseJobs
     */
    public List<String> getChooseJobs() {
        return chooseJobs;
    }

    public void setChooseJobs(List<String> chooseJobs) {
        this.chooseJobs = chooseJobs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunPipelineDTO runPipelineDTO = (RunPipelineDTO) o;
        return Objects.equals(this.sources, runPipelineDTO.sources)
            && Objects.equals(this.description, runPipelineDTO.description)
            && Objects.equals(this.variables, runPipelineDTO.variables)
            && Objects.equals(this.chooseJobs, runPipelineDTO.chooseJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sources, description, variables, chooseJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunPipelineDTO {\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    chooseJobs: ").append(toIndentedString(chooseJobs)).append("\n");
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
