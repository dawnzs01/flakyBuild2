package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TagsResult
 */
public class TagsResult  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private List<String> value = null;
    
    public TagsResult withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * 标签键。最大长度36个unicode字符，key不能为空。 字符集：0-9，A-Z，a-z，“_”，“-”，中文。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    

    public TagsResult withValue(List<String> value) {
        this.value = value;
        return this;
    }

    
    public TagsResult addValueItem(String valueItem) {
        if(this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(valueItem);
        return this;
    }

    public TagsResult withValue(Consumer<List<String>> valueSetter) {
        if(this.value == null) {
            this.value = new ArrayList<>();
        }
        valueSetter.accept(this.value);
        return this;
    }

    /**
     * 标签值。最大长度43个unicode字符，可以为空字符串。 字符集：0-9，A-Z，a-z，“_”，“.”，“-”，中文。
     * @return value
     */
    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagsResult tagsResult = (TagsResult) o;
        return Objects.equals(this.key, tagsResult.key) &&
            Objects.equals(this.value, tagsResult.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagsResult {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

