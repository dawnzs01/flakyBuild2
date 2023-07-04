package com.huaweicloud.sdk.gaussdb.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateConfigurationParameterRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateGaussMySqlConfigurationRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration_id")
    

    private String configurationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private UpdateConfigurationParameterRequestBody body;

    public UpdateGaussMySqlConfigurationRequest withXLanguage(String xLanguage) {
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

    

    public UpdateGaussMySqlConfigurationRequest withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    


    /**
     * 参数模板ID。
     * @return configurationId
     */
    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    

    public UpdateGaussMySqlConfigurationRequest withBody(UpdateConfigurationParameterRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateGaussMySqlConfigurationRequest withBody(Consumer<UpdateConfigurationParameterRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateConfigurationParameterRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateConfigurationParameterRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateConfigurationParameterRequestBody body) {
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
        UpdateGaussMySqlConfigurationRequest updateGaussMySqlConfigurationRequest = (UpdateGaussMySqlConfigurationRequest) o;
        return Objects.equals(this.xLanguage, updateGaussMySqlConfigurationRequest.xLanguage) &&
            Objects.equals(this.configurationId, updateGaussMySqlConfigurationRequest.configurationId) &&
            Objects.equals(this.body, updateGaussMySqlConfigurationRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, configurationId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGaussMySqlConfigurationRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
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

