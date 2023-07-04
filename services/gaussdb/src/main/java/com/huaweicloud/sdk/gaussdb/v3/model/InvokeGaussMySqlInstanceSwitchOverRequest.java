package com.huaweicloud.sdk.gaussdb.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.TaurusSwitchoverRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class InvokeGaussMySqlInstanceSwitchOverRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private TaurusSwitchoverRequest body;

    public InvokeGaussMySqlInstanceSwitchOverRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * 语言。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    

    public InvokeGaussMySqlInstanceSwitchOverRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 租户在某一project下的实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public InvokeGaussMySqlInstanceSwitchOverRequest withBody(TaurusSwitchoverRequest body) {
        this.body = body;
        return this;
    }

    public InvokeGaussMySqlInstanceSwitchOverRequest withBody(Consumer<TaurusSwitchoverRequest> bodySetter) {
        if(this.body == null ){
            this.body = new TaurusSwitchoverRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public TaurusSwitchoverRequest getBody() {
        return body;
    }

    public void setBody(TaurusSwitchoverRequest body) {
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
        InvokeGaussMySqlInstanceSwitchOverRequest invokeGaussMySqlInstanceSwitchOverRequest = (InvokeGaussMySqlInstanceSwitchOverRequest) o;
        return Objects.equals(this.xLanguage, invokeGaussMySqlInstanceSwitchOverRequest.xLanguage) &&
            Objects.equals(this.instanceId, invokeGaussMySqlInstanceSwitchOverRequest.instanceId) &&
            Objects.equals(this.body, invokeGaussMySqlInstanceSwitchOverRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, instanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvokeGaussMySqlInstanceSwitchOverRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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

