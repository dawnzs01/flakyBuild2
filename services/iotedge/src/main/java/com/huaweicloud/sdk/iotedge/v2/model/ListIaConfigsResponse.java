package com.huaweicloud.sdk.iotedge.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.QueryIaConfigResponseDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListIaConfigsResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configs")
    
    private List<QueryIaConfigResponseDTO> configs = null;
    
    public ListIaConfigsResponse withConfigs(List<QueryIaConfigResponseDTO> configs) {
        this.configs = configs;
        return this;
    }

    
    public ListIaConfigsResponse addConfigsItem(QueryIaConfigResponseDTO configsItem) {
        if(this.configs == null) {
            this.configs = new ArrayList<>();
        }
        this.configs.add(configsItem);
        return this;
    }

    public ListIaConfigsResponse withConfigs(Consumer<List<QueryIaConfigResponseDTO>> configsSetter) {
        if(this.configs == null) {
            this.configs = new ArrayList<>();
        }
        configsSetter.accept(this.configs);
        return this;
    }

    /**
     * 南向3rdIA配置项列表
     * @return configs
     */
    public List<QueryIaConfigResponseDTO> getConfigs() {
        return configs;
    }

    public void setConfigs(List<QueryIaConfigResponseDTO> configs) {
        this.configs = configs;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListIaConfigsResponse listIaConfigsResponse = (ListIaConfigsResponse) o;
        return Objects.equals(this.configs, listIaConfigsResponse.configs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(configs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIaConfigsResponse {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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

