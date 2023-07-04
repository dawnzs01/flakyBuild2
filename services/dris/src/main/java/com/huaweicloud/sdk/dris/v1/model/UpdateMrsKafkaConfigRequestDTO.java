package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数说明**：kafka更新配置，支持topicPrefix、userTopics、brokers，需要把该字段新的对应值全量写入。
 */
public class UpdateMrsKafkaConfigRequestDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_topics")

    private List<String> userTopics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brokers")

    private List<String> brokers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication")

    private Boolean authentication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "krb5_content")

    private String krb5Content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keytab_content")

    private String keytabContent;

    public UpdateMrsKafkaConfigRequestDTO withUserTopics(List<String> userTopics) {
        this.userTopics = userTopics;
        return this;
    }

    public UpdateMrsKafkaConfigRequestDTO addUserTopicsItem(String userTopicsItem) {
        if (this.userTopics == null) {
            this.userTopics = new ArrayList<>();
        }
        this.userTopics.add(userTopicsItem);
        return this;
    }

    public UpdateMrsKafkaConfigRequestDTO withUserTopics(Consumer<List<String>> userTopicsSetter) {
        if (this.userTopics == null) {
            this.userTopics = new ArrayList<>();
        }
        userTopicsSetter.accept(this.userTopics);
        return this;
    }

    /**
     * **参数说明**：用户订阅kafka的主题列表。  **取值范围**：  - v2x-v1-tracks：edge上报的车辆轨迹数据  - v2x-v1-bsm：车载T-BOX，mqtt协议接入rsu， websocket协议接入rsu上报的BSM消息数据  - v2x-v1-rsi：mqtt协议接入rsu，edge上报的RSI消息数据  - v2x-v1-rsm： mqtt协议接入rsu，edge上报的RSM消息数据  - v2x-v1-spat：mqtt协议接入rsu， websocket协议接入rsu上报的SPAT消息数据  - v2x-v1-edge-flow：edge上报的车流量统计信息数据
     * @return userTopics
     */
    public List<String> getUserTopics() {
        return userTopics;
    }

    public void setUserTopics(List<String> userTopics) {
        this.userTopics = userTopics;
    }

    public UpdateMrsKafkaConfigRequestDTO withBrokers(List<String> brokers) {
        this.brokers = brokers;
        return this;
    }

    public UpdateMrsKafkaConfigRequestDTO addBrokersItem(String brokersItem) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        this.brokers.add(brokersItem);
        return this;
    }

    public UpdateMrsKafkaConfigRequestDTO withBrokers(Consumer<List<String>> brokersSetter) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        brokersSetter.accept(this.brokers);
        return this;
    }

    /**
     * **参数说明**：用户mrskafka的brokers列表。
     * @return brokers
     */
    public List<String> getBrokers() {
        return brokers;
    }

    public void setBrokers(List<String> brokers) {
        this.brokers = brokers;
    }

    public UpdateMrsKafkaConfigRequestDTO withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数说明**：mrskafka用户名，若开启安全认证该参数必填。  **取值范围**：只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UpdateMrsKafkaConfigRequestDTO withAuthentication(Boolean authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * **参数说明**：是否开启kerberos安全认证的开关。若开启安全认证则需要先上传kerberos安全认证的凭证。
     * @return authentication
     */
    public Boolean getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Boolean authentication) {
        this.authentication = authentication;
    }

    public UpdateMrsKafkaConfigRequestDTO withKrb5Content(String krb5Content) {
        this.krb5Content = krb5Content;
        return this;
    }

    /**
     * **参数说明**：若开启安全认证则需要先上传kerberos安全认证的krb5_file的凭证内容。
     * @return krb5Content
     */
    public String getKrb5Content() {
        return krb5Content;
    }

    public void setKrb5Content(String krb5Content) {
        this.krb5Content = krb5Content;
    }

    public UpdateMrsKafkaConfigRequestDTO withKeytabContent(String keytabContent) {
        this.keytabContent = keytabContent;
        return this;
    }

    /**
     * **参数说明**：若开启安全认证则需要先上传kerberos安全认证的keytab_file的凭证内容。
     * @return keytabContent
     */
    public String getKeytabContent() {
        return keytabContent;
    }

    public void setKeytabContent(String keytabContent) {
        this.keytabContent = keytabContent;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateMrsKafkaConfigRequestDTO updateMrsKafkaConfigRequestDTO = (UpdateMrsKafkaConfigRequestDTO) o;
        return Objects.equals(this.userTopics, updateMrsKafkaConfigRequestDTO.userTopics)
            && Objects.equals(this.brokers, updateMrsKafkaConfigRequestDTO.brokers)
            && Objects.equals(this.username, updateMrsKafkaConfigRequestDTO.username)
            && Objects.equals(this.authentication, updateMrsKafkaConfigRequestDTO.authentication)
            && Objects.equals(this.krb5Content, updateMrsKafkaConfigRequestDTO.krb5Content)
            && Objects.equals(this.keytabContent, updateMrsKafkaConfigRequestDTO.keytabContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userTopics, brokers, username, authentication, krb5Content, keytabContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMrsKafkaConfigRequestDTO {\n");
        sb.append("    userTopics: ").append(toIndentedString(userTopics)).append("\n");
        sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
        sb.append("    krb5Content: ").append(toIndentedString(krb5Content)).append("\n");
        sb.append("    keytabContent: ").append(toIndentedString(keytabContent)).append("\n");
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
