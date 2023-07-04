package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建资源空间结构体。
 */
public class AddApplication {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    public AddApplication withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * **参数说明**：资源空间名称。 **取值范围**：长度不超过64，允许中文、字母、数字、下划线（_）、连接符（-）等一些特殊字符的组合。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddApplication addApplication = (AddApplication) o;
        return Objects.equals(this.appName, addApplication.appName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddApplication {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
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
