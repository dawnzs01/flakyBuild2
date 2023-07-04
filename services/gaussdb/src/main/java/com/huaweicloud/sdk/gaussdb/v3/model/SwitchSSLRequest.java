package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SwitchSSLRequest
 */
public class SwitchSSLRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_option")
    

    private Boolean sslOption;

    public SwitchSSLRequest withSslOption(Boolean sslOption) {
        this.sslOption = sslOption;
        return this;
    }

    


    /**
     * SSL数据加密开关设置。  - true: 开启SSL数据加密。 - false: 关闭SSL数据加密。
     * @return sslOption
     */
    public Boolean getSslOption() {
        return sslOption;
    }

    public void setSslOption(Boolean sslOption) {
        this.sslOption = sslOption;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SwitchSSLRequest switchSSLRequest = (SwitchSSLRequest) o;
        return Objects.equals(this.sslOption, switchSSLRequest.sslOption);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sslOption);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchSSLRequest {\n");
        sb.append("    sslOption: ").append(toIndentedString(sslOption)).append("\n");
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

