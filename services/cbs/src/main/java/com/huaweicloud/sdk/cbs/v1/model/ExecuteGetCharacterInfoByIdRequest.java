package com.huaweicloud.sdk.cbs.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ExecuteGetCharacterInfoByIdRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="character_id")
    

    private String characterId;

    public ExecuteGetCharacterInfoByIdRequest withCharacterId(String characterId) {
        this.characterId = characterId;
        return this;
    }

    


    /**
     * 形象id
     * @return characterId
     */
    public String getCharacterId() {
        return characterId;
    }

    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteGetCharacterInfoByIdRequest executeGetCharacterInfoByIdRequest = (ExecuteGetCharacterInfoByIdRequest) o;
        return Objects.equals(this.characterId, executeGetCharacterInfoByIdRequest.characterId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(characterId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteGetCharacterInfoByIdRequest {\n");
        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
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

