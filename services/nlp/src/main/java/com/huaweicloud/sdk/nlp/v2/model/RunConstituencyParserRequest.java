package com.huaweicloud.sdk.nlp.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nlp.v2.model.ConstituencyParserReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class RunConstituencyParserRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private ConstituencyParserReq body;

    public RunConstituencyParserRequest withBody(ConstituencyParserReq body) {
        this.body = body;
        return this;
    }

    public RunConstituencyParserRequest withBody(Consumer<ConstituencyParserReq> bodySetter) {
        if(this.body == null ){
            this.body = new ConstituencyParserReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ConstituencyParserReq getBody() {
        return body;
    }

    public void setBody(ConstituencyParserReq body) {
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
        RunConstituencyParserRequest runConstituencyParserRequest = (RunConstituencyParserRequest) o;
        return Objects.equals(this.body, runConstituencyParserRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunConstituencyParserRequest {\n");
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

