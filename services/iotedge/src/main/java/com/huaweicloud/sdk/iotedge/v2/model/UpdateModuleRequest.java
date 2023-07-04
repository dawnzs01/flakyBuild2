package com.huaweicloud.sdk.iotedge.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeModuleReqDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateModuleRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_node_id")
    

    private String edgeNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="module_id")
    

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private UpdateEdgeModuleReqDTO body;

    public UpdateModuleRequest withEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
        return this;
    }

    


    /**
     * 边缘节点ID
     * @return edgeNodeId
     */
    public String getEdgeNodeId() {
        return edgeNodeId;
    }

    public void setEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
    }

    

    public UpdateModuleRequest withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    


    /**
     * 边缘模块ID
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    

    public UpdateModuleRequest withBody(UpdateEdgeModuleReqDTO body) {
        this.body = body;
        return this;
    }

    public UpdateModuleRequest withBody(Consumer<UpdateEdgeModuleReqDTO> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateEdgeModuleReqDTO();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateEdgeModuleReqDTO getBody() {
        return body;
    }

    public void setBody(UpdateEdgeModuleReqDTO body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateModuleRequest updateModuleRequest = (UpdateModuleRequest) o;
        return Objects.equals(this.edgeNodeId, updateModuleRequest.edgeNodeId) &&
            Objects.equals(this.moduleId, updateModuleRequest.moduleId) &&
            Objects.equals(this.body, updateModuleRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeNodeId, moduleId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateModuleRequest {\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

