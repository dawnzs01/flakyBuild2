package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源聚合器响应体。
 */
public class ConfigurationAggregatorResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregator_name")

    private String aggregatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregator_id")

    private String aggregatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregator_urn")

    private String aggregatorUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregator_type")

    private String aggregatorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_aggregation_sources")

    private AccountAggregationSource accountAggregationSources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    public ConfigurationAggregatorResp withAggregatorName(String aggregatorName) {
        this.aggregatorName = aggregatorName;
        return this;
    }

    /**
     * 资源聚合器名称。
     * @return aggregatorName
     */
    public String getAggregatorName() {
        return aggregatorName;
    }

    public void setAggregatorName(String aggregatorName) {
        this.aggregatorName = aggregatorName;
    }

    public ConfigurationAggregatorResp withAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }

    /**
     * 资源聚合器ID。
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return aggregatorId;
    }

    public void setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
    }

    public ConfigurationAggregatorResp withAggregatorUrn(String aggregatorUrn) {
        this.aggregatorUrn = aggregatorUrn;
        return this;
    }

    /**
     * 资源聚合器标识符。
     * @return aggregatorUrn
     */
    public String getAggregatorUrn() {
        return aggregatorUrn;
    }

    public void setAggregatorUrn(String aggregatorUrn) {
        this.aggregatorUrn = aggregatorUrn;
    }

    public ConfigurationAggregatorResp withAggregatorType(String aggregatorType) {
        this.aggregatorType = aggregatorType;
        return this;
    }

    /**
     * 聚合器类型。
     * @return aggregatorType
     */
    public String getAggregatorType() {
        return aggregatorType;
    }

    public void setAggregatorType(String aggregatorType) {
        this.aggregatorType = aggregatorType;
    }

    public ConfigurationAggregatorResp withAccountAggregationSources(
        AccountAggregationSource accountAggregationSources) {
        this.accountAggregationSources = accountAggregationSources;
        return this;
    }

    public ConfigurationAggregatorResp withAccountAggregationSources(
        Consumer<AccountAggregationSource> accountAggregationSourcesSetter) {
        if (this.accountAggregationSources == null) {
            this.accountAggregationSources = new AccountAggregationSource();
            accountAggregationSourcesSetter.accept(this.accountAggregationSources);
        }

        return this;
    }

    /**
     * Get accountAggregationSources
     * @return accountAggregationSources
     */
    public AccountAggregationSource getAccountAggregationSources() {
        return accountAggregationSources;
    }

    public void setAccountAggregationSources(AccountAggregationSource accountAggregationSources) {
        this.accountAggregationSources = accountAggregationSources;
    }

    public ConfigurationAggregatorResp withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 资源聚合器更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ConfigurationAggregatorResp withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 资源聚合器创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigurationAggregatorResp configurationAggregatorResp = (ConfigurationAggregatorResp) o;
        return Objects.equals(this.aggregatorName, configurationAggregatorResp.aggregatorName)
            && Objects.equals(this.aggregatorId, configurationAggregatorResp.aggregatorId)
            && Objects.equals(this.aggregatorUrn, configurationAggregatorResp.aggregatorUrn)
            && Objects.equals(this.aggregatorType, configurationAggregatorResp.aggregatorType)
            && Objects.equals(this.accountAggregationSources, configurationAggregatorResp.accountAggregationSources)
            && Objects.equals(this.updatedAt, configurationAggregatorResp.updatedAt)
            && Objects.equals(this.createdAt, configurationAggregatorResp.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregatorName,
            aggregatorId,
            aggregatorUrn,
            aggregatorType,
            accountAggregationSources,
            updatedAt,
            createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationAggregatorResp {\n");
        sb.append("    aggregatorName: ").append(toIndentedString(aggregatorName)).append("\n");
        sb.append("    aggregatorId: ").append(toIndentedString(aggregatorId)).append("\n");
        sb.append("    aggregatorUrn: ").append(toIndentedString(aggregatorUrn)).append("\n");
        sb.append("    aggregatorType: ").append(toIndentedString(aggregatorType)).append("\n");
        sb.append("    accountAggregationSources: ").append(toIndentedString(accountAggregationSources)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
