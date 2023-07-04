package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库信息。
 */
public class PostgresqlDatabaseForCreation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "character_set")

    private String characterSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private String template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lc_collate")

    private String lcCollate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lc_ctype")

    private String lcCtype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_revoke_public_privilege")

    private Boolean isRevokePublicPrivilege;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    public PostgresqlDatabaseForCreation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据库名称。  数据库名称长度可在1～63个字符之间，由字母、数字、或下划线组成，不能包含其他特殊字符，不能以“pg”和数字开头，且不能和RDS for PostgreSQL模板库重名。  RDS for PostgreSQL模板库包括postgres， template0 ，template1。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PostgresqlDatabaseForCreation withCharacterSet(String characterSet) {
        this.characterSet = characterSet;
        return this;
    }

    /**
     * 数据库字符集。默认UTF8。
     * @return characterSet
     */
    public String getCharacterSet() {
        return characterSet;
    }

    public void setCharacterSet(String characterSet) {
        this.characterSet = characterSet;
    }

    public PostgresqlDatabaseForCreation withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 数据库所属用户，缺省时默认是root，不能和系统用户重名，且必须是已存在的用户。  系统用户包括“rdsAdmin”,“ rdsMetric”, “rdsBackup”, “rdsRepl”,“ rdsProxy”, “rdsDdm”。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public PostgresqlDatabaseForCreation withTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * 数据库模板名称，可选值template0，template1。默认template1。
     * @return template
     */
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public PostgresqlDatabaseForCreation withLcCollate(String lcCollate) {
        this.lcCollate = lcCollate;
        return this;
    }

    /**
     * 数据库排序集。默认en_US.UTF-8。  - 须知： 不同的排序规则下，相同字符串的比较其结果可能是不同的。 例如，在en_US.utf8下， select 'a'>'A';执行结果为false，但在'C'下，select 'a'>'A';结果为true。如果数据库从“O”迁移到PostgreSQL，数据库排序集需使用'C'才能得到一致的预期。支持的排序规则可以查询系统表 pg_collation。
     * @return lcCollate
     */
    public String getLcCollate() {
        return lcCollate;
    }

    public void setLcCollate(String lcCollate) {
        this.lcCollate = lcCollate;
    }

    public PostgresqlDatabaseForCreation withLcCtype(String lcCtype) {
        this.lcCtype = lcCtype;
        return this;
    }

    /**
     * 数据库分类集。默认en_US.UTF-8。
     * @return lcCtype
     */
    public String getLcCtype() {
        return lcCtype;
    }

    public void setLcCtype(String lcCtype) {
        this.lcCtype = lcCtype;
    }

    public PostgresqlDatabaseForCreation withIsRevokePublicPrivilege(Boolean isRevokePublicPrivilege) {
        this.isRevokePublicPrivilege = isRevokePublicPrivilege;
        return this;
    }

    /**
     * 是否回收public schema的PUBLIC CREATE权限。 true，表示回收该权限。 false，表示不回收该权限。 缺省时默认是false。
     * @return isRevokePublicPrivilege
     */
    public Boolean getIsRevokePublicPrivilege() {
        return isRevokePublicPrivilege;
    }

    public void setIsRevokePublicPrivilege(Boolean isRevokePublicPrivilege) {
        this.isRevokePublicPrivilege = isRevokePublicPrivilege;
    }

    public PostgresqlDatabaseForCreation withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 数据库备注。 取值范围：长度1~512个字符。
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
        PostgresqlDatabaseForCreation postgresqlDatabaseForCreation = (PostgresqlDatabaseForCreation) o;
        return Objects.equals(this.name, postgresqlDatabaseForCreation.name)
            && Objects.equals(this.characterSet, postgresqlDatabaseForCreation.characterSet)
            && Objects.equals(this.owner, postgresqlDatabaseForCreation.owner)
            && Objects.equals(this.template, postgresqlDatabaseForCreation.template)
            && Objects.equals(this.lcCollate, postgresqlDatabaseForCreation.lcCollate)
            && Objects.equals(this.lcCtype, postgresqlDatabaseForCreation.lcCtype)
            && Objects.equals(this.isRevokePublicPrivilege, postgresqlDatabaseForCreation.isRevokePublicPrivilege)
            && Objects.equals(this.comment, postgresqlDatabaseForCreation.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, characterSet, owner, template, lcCollate, lcCtype, isRevokePublicPrivilege, comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgresqlDatabaseForCreation {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    characterSet: ").append(toIndentedString(characterSet)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    lcCollate: ").append(toIndentedString(lcCollate)).append("\n");
        sb.append("    lcCtype: ").append(toIndentedString(lcCtype)).append("\n");
        sb.append("    isRevokePublicPrivilege: ").append(toIndentedString(isRevokePublicPrivilege)).append("\n");
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
