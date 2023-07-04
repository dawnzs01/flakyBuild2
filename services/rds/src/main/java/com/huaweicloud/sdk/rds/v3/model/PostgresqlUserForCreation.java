package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PostgresqlUserForCreation
 */
public class PostgresqlUserForCreation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    public PostgresqlUserForCreation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据库用户名称。  数据库用户名称在1到63个字符之间，由字母、数字、或下划线组成，不能包含其他特殊字符，不能以“pg”和数字开头，不能和系统用户名称相同。  系统用户包括“rdsAdmin”,“ rdsMetric”, “rdsBackup”, “rdsRepl”,“ rdsProxy”, “rdsDdm”。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PostgresqlUserForCreation withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 数据库用户密码。  取值范围：非空，密码长度在8到32个字符之间，至少包含大写字母、小写字母、数字、特殊字符~!@#%^*-_=+?,三种字符的组合，不能和数据库帐号“name”或“name”的逆序相同。  建议您输入高强度密码，以提高安全性，防止出现密码被暴力破解等安全风险。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PostgresqlUserForCreation withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 数据库用户备注。 取值范围：长度1~512个字符。
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostgresqlUserForCreation postgresqlUserForCreation = (PostgresqlUserForCreation) o;
        return Objects.equals(this.name, postgresqlUserForCreation.name)
            && Objects.equals(this.password, postgresqlUserForCreation.password)
            && Objects.equals(this.comment, postgresqlUserForCreation.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgresqlUserForCreation {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
