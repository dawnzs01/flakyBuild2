package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 授权结构体。
 */
public class AuthorizationVI {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_type")

    private String repoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_host")

    private String repoHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_home")

    private String repoHome;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_user")

    private String repoUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avartar")

    private String avartar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_type")

    private String tokenType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public AuthorizationVI withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 授权名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AuthorizationVI withRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }

    /**
     * 仓库类型。 取值范围：github、gitlab、gitee、bitbucket、devcloud。 
     * @return repoType
     */
    public String getRepoType() {
        return repoType;
    }

    public void setRepoType(String repoType) {
        this.repoType = repoType;
    }

    public AuthorizationVI withRepoHost(String repoHost) {
        this.repoHost = repoHost;
        return this;
    }

    /**
     * 仓库地址。
     * @return repoHost
     */
    public String getRepoHost() {
        return repoHost;
    }

    public void setRepoHost(String repoHost) {
        this.repoHost = repoHost;
    }

    public AuthorizationVI withRepoHome(String repoHome) {
        this.repoHome = repoHome;
        return this;
    }

    /**
     * 仓库主页。
     * @return repoHome
     */
    public String getRepoHome() {
        return repoHome;
    }

    public void setRepoHome(String repoHome) {
        this.repoHome = repoHome;
    }

    public AuthorizationVI withRepoUser(String repoUser) {
        this.repoUser = repoUser;
        return this;
    }

    /**
     * 仓库用户名。
     * @return repoUser
     */
    public String getRepoUser() {
        return repoUser;
    }

    public void setRepoUser(String repoUser) {
        this.repoUser = repoUser;
    }

    public AuthorizationVI withAvartar(String avartar) {
        this.avartar = avartar;
        return this;
    }

    /**
     * 头像。
     * @return avartar
     */
    public String getAvartar() {
        return avartar;
    }

    public void setAvartar(String avartar) {
        this.avartar = avartar;
    }

    public AuthorizationVI withTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * 授权方式。
     * @return tokenType
     */
    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public AuthorizationVI withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public AuthorizationVI withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public AuthorizationVI withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizationVI authorizationVI = (AuthorizationVI) o;
        return Objects.equals(this.name, authorizationVI.name)
            && Objects.equals(this.repoType, authorizationVI.repoType)
            && Objects.equals(this.repoHost, authorizationVI.repoHost)
            && Objects.equals(this.repoHome, authorizationVI.repoHome)
            && Objects.equals(this.repoUser, authorizationVI.repoUser)
            && Objects.equals(this.avartar, authorizationVI.avartar)
            && Objects.equals(this.tokenType, authorizationVI.tokenType)
            && Objects.equals(this.createTime, authorizationVI.createTime)
            && Objects.equals(this.updateTime, authorizationVI.updateTime)
            && Objects.equals(this.status, authorizationVI.status);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, repoType, repoHost, repoHome, repoUser, avartar, tokenType, createTime, updateTime, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizationVI {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
        sb.append("    repoHost: ").append(toIndentedString(repoHost)).append("\n");
        sb.append("    repoHome: ").append(toIndentedString(repoHome)).append("\n");
        sb.append("    repoUser: ").append(toIndentedString(repoUser)).append("\n");
        sb.append("    avartar: ").append(toIndentedString(avartar)).append("\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
