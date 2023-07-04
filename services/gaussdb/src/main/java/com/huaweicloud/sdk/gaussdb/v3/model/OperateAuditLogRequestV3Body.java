package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 开启/关闭全量SQL参数体
 */
public class OperateAuditLogRequestV3Body  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="switch_status")
    

    private String switchStatus;

    public OperateAuditLogRequestV3Body withSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }

    


    /**
     * 全量SQL开关状态。 取值： - ON，表示开启 - OFF，表示关闭
     * @return switchStatus
     */
    public String getSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperateAuditLogRequestV3Body operateAuditLogRequestV3Body = (OperateAuditLogRequestV3Body) o;
        return Objects.equals(this.switchStatus, operateAuditLogRequestV3Body.switchStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(switchStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateAuditLogRequestV3Body {\n");
        sb.append("    switchStatus: ").append(toIndentedString(switchStatus)).append("\n");
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

