package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 应用申请资源
 */
public class TaskResourceDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_type")

    private String cpuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private String memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_type")

    private String gpuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private String gpu;

    public TaskResourceDto withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * cpu申请使用量，取值范围[0.1-128]，单位C，支持一位小数。对于应用，不填默认1C；对于流程和作业，不填默认使用前一级的配置，填值会覆盖更新。覆盖关系：作业->流程->应用
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public TaskResourceDto withCpuType(String cpuType) {
        this.cpuType = cpuType;
        return this;
    }

    /**
     * cpu架构类型，不填默认X86
     * @return cpuType
     */
    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public TaskResourceDto withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 内存申请使用量，取值范围[0.1-3072]，单位G，支持一位小数。对于应用，不填默认1G；对于流程和作业，不填默认使用前一级的配置，填值会覆盖更新。覆盖关系：作业->流程->应用
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public TaskResourceDto withGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }

    /**
     * gpu架构类型，取值范围 ' '|GPU|D910|D310。对于流程和作业，不填默认使用前一级的配置，填值会覆盖更新。覆盖关系：作业->流程->应用
     * @return gpuType
     */
    public String getGpuType() {
        return gpuType;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType;
    }

    public TaskResourceDto withGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * gpu申请使用量，取值范围[0-16]，仅支持整数，D910有特殊约束，申请数量需要是0,1,2,4,8。对于应用，不填默认0；对于流程和作业，不填默认使用前一级的配置，填值会覆盖更新。覆盖关系：作业->流程->应用
     * @return gpu
     */
    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskResourceDto taskResourceDto = (TaskResourceDto) o;
        return Objects.equals(this.cpu, taskResourceDto.cpu) && Objects.equals(this.cpuType, taskResourceDto.cpuType)
            && Objects.equals(this.memory, taskResourceDto.memory)
            && Objects.equals(this.gpuType, taskResourceDto.gpuType) && Objects.equals(this.gpu, taskResourceDto.gpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, cpuType, memory, gpuType, gpu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskResourceDto {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    cpuType: ").append(toIndentedString(cpuType)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    gpuType: ").append(toIndentedString(gpuType)).append("\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
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
