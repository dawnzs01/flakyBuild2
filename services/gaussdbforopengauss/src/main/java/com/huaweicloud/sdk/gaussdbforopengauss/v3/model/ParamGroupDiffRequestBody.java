package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ParamGroupDiffRequestBody
 */
public class ParamGroupDiffRequestBody  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_id")
    

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_id")
    

    private String targetId;

    public ParamGroupDiffRequestBody withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    


    /**
     * 需要进行比较的参数组模板ID。
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    

    public ParamGroupDiffRequestBody withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    


    /**
     * 需要进行比较的参数组模板ID。
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParamGroupDiffRequestBody paramGroupDiffRequestBody = (ParamGroupDiffRequestBody) o;
        return Objects.equals(this.sourceId, paramGroupDiffRequestBody.sourceId) &&
            Objects.equals(this.targetId, paramGroupDiffRequestBody.targetId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sourceId, targetId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParamGroupDiffRequestBody {\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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

