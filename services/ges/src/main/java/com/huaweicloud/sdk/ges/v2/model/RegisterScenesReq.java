package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.RegisterScenesReqScenes;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RegisterScenes请求体
 */
public class RegisterScenesReq  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scenes")
    
    private List<RegisterScenesReqScenes> scenes = null;
    
    public RegisterScenesReq withScenes(List<RegisterScenesReqScenes> scenes) {
        this.scenes = scenes;
        return this;
    }

    
    public RegisterScenesReq addScenesItem(RegisterScenesReqScenes scenesItem) {
        if(this.scenes == null) {
            this.scenes = new ArrayList<>();
        }
        this.scenes.add(scenesItem);
        return this;
    }

    public RegisterScenesReq withScenes(Consumer<List<RegisterScenesReqScenes>> scenesSetter) {
        if(this.scenes == null) {
            this.scenes = new ArrayList<>();
        }
        scenesSetter.accept(this.scenes);
        return this;
    }

    /**
     * 要订阅的具体场景。
     * @return scenes
     */
    public List<RegisterScenesReqScenes> getScenes() {
        return scenes;
    }

    public void setScenes(List<RegisterScenesReqScenes> scenes) {
        this.scenes = scenes;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegisterScenesReq registerScenesReq = (RegisterScenesReq) o;
        return Objects.equals(this.scenes, registerScenesReq.scenes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scenes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterScenesReq {\n");
        sb.append("    scenes: ").append(toIndentedString(scenes)).append("\n");
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

