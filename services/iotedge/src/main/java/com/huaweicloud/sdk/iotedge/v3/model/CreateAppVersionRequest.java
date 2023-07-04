package com.huaweicloud.sdk.iotedge.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v3.model.CreateAppVersionRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateAppVersionRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private CreateAppVersionRequestBody body;

    public CreateAppVersionRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 应用ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public CreateAppVersionRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 应用版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public CreateAppVersionRequest withBody(CreateAppVersionRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateAppVersionRequest withBody(Consumer<CreateAppVersionRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new CreateAppVersionRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateAppVersionRequestBody getBody() {
        return body;
    }

    public void setBody(CreateAppVersionRequestBody body) {
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
        CreateAppVersionRequest createAppVersionRequest = (CreateAppVersionRequest) o;
        return Objects.equals(this.appId, createAppVersionRequest.appId) &&
            Objects.equals(this.version, createAppVersionRequest.version) &&
            Objects.equals(this.body, createAppVersionRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appId, version, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAppVersionRequest {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

