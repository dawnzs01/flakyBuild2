package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 队列关联弹性资源池
 */
public class AssociateQueueToElasticResourcePoolRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    public AssociateQueueToElasticResourcePoolRequestBody withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 队列名称
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociateQueueToElasticResourcePoolRequestBody associateQueueToElasticResourcePoolRequestBody =
            (AssociateQueueToElasticResourcePoolRequestBody) o;
        return Objects.equals(this.queueName, associateQueueToElasticResourcePoolRequestBody.queueName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateQueueToElasticResourcePoolRequestBody {\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
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
