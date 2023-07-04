package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.ContainerSettingsReqDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新边缘模块请求结构体
 */
public class UpdateEdgeModuleReqDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_version")
    

    private String appVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="module_name")
    

    private String moduleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="container_settings")
    

    private ContainerSettingsReqDTO containerSettings;

    public UpdateEdgeModuleReqDTO withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    


    /**
     * 边缘应用版本
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    

    public UpdateEdgeModuleReqDTO withModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    


    /**
     * 边缘模块名称
     * @return moduleName
     */
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    

    public UpdateEdgeModuleReqDTO withContainerSettings(ContainerSettingsReqDTO containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    public UpdateEdgeModuleReqDTO withContainerSettings(Consumer<ContainerSettingsReqDTO> containerSettingsSetter) {
        if(this.containerSettings == null ){
            this.containerSettings = new ContainerSettingsReqDTO();
            containerSettingsSetter.accept(this.containerSettings);
        }
        
        return this;
    }


    /**
     * Get containerSettings
     * @return containerSettings
     */
    public ContainerSettingsReqDTO getContainerSettings() {
        return containerSettings;
    }

    public void setContainerSettings(ContainerSettingsReqDTO containerSettings) {
        this.containerSettings = containerSettings;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEdgeModuleReqDTO updateEdgeModuleReqDTO = (UpdateEdgeModuleReqDTO) o;
        return Objects.equals(this.appVersion, updateEdgeModuleReqDTO.appVersion) &&
            Objects.equals(this.moduleName, updateEdgeModuleReqDTO.moduleName) &&
            Objects.equals(this.containerSettings, updateEdgeModuleReqDTO.containerSettings);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appVersion, moduleName, containerSettings);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEdgeModuleReqDTO {\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    containerSettings: ").append(toIndentedString(containerSettings)).append("\n");
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

