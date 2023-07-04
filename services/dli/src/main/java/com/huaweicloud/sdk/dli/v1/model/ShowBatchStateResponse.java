package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowBatchStateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    public ShowBatchStateResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 批处理作业的ID，采用UUID（通用唯一识别码）格式。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowBatchStateResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 批处理作业的状态。starting：正在启动；running：正在执行任务；dead：session已退出；success：session停止成功；recovering：正在恢复。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBatchStateResponse showBatchStateResponse = (ShowBatchStateResponse) o;
        return Objects.equals(this.id, showBatchStateResponse.id)
            && Objects.equals(this.state, showBatchStateResponse.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBatchStateResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
