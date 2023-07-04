package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * WeakPasswordRequestBody
 */
public class WeakPasswordRequestBody  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    

    private String password;

    public WeakPasswordRequestBody withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 数据库帐号密码。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WeakPasswordRequestBody weakPasswordRequestBody = (WeakPasswordRequestBody) o;
        return Objects.equals(this.password, weakPasswordRequestBody.password);
    }
    @Override
    public int hashCode() {
        return Objects.hash(password);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WeakPasswordRequestBody {\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

