package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryCorpAdminResultDTO
 */
public class QueryCorpAdminResultDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminType")

    private Integer adminType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dept")

    private DeptBasicDTO dept;

    public QueryCorpAdminResultDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户UUID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryCorpAdminResultDTO withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 用户帐号（华为云会议帐号）。
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public QueryCorpAdminResultDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QueryCorpAdminResultDTO withAdminType(Integer adminType) {
        this.adminType = adminType;
        return this;
    }

    /**
     * 管理员类型。 * 0：默认管理员 * 1：普通管理员 
     * @return adminType
     */
    public Integer getAdminType() {
        return adminType;
    }

    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }

    public QueryCorpAdminResultDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱地址。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public QueryCorpAdminResultDTO withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 手机号。
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public QueryCorpAdminResultDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * [[手机号所属的国家](https://support.huaweicloud.com/api-meeting/meeting_21_0109.html#ZH-CN_TOPIC_0212714591__table19371178135314)](tag:hws)[[手机号所属的国家](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0109.html#ZH-CN_TOPIC_0212714591__table19371178135314)](tag:hk) 。 
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public QueryCorpAdminResultDTO withDept(DeptBasicDTO dept) {
        this.dept = dept;
        return this;
    }

    public QueryCorpAdminResultDTO withDept(Consumer<DeptBasicDTO> deptSetter) {
        if (this.dept == null) {
            this.dept = new DeptBasicDTO();
            deptSetter.accept(this.dept);
        }

        return this;
    }

    /**
     * Get dept
     * @return dept
     */
    public DeptBasicDTO getDept() {
        return dept;
    }

    public void setDept(DeptBasicDTO dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryCorpAdminResultDTO queryCorpAdminResultDTO = (QueryCorpAdminResultDTO) o;
        return Objects.equals(this.id, queryCorpAdminResultDTO.id)
            && Objects.equals(this.account, queryCorpAdminResultDTO.account)
            && Objects.equals(this.name, queryCorpAdminResultDTO.name)
            && Objects.equals(this.adminType, queryCorpAdminResultDTO.adminType)
            && Objects.equals(this.email, queryCorpAdminResultDTO.email)
            && Objects.equals(this.phone, queryCorpAdminResultDTO.phone)
            && Objects.equals(this.country, queryCorpAdminResultDTO.country)
            && Objects.equals(this.dept, queryCorpAdminResultDTO.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account, name, adminType, email, phone, country, dept);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCorpAdminResultDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    adminType: ").append(toIndentedString(adminType)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    dept: ").append(toIndentedString(dept)).append("\n");
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
