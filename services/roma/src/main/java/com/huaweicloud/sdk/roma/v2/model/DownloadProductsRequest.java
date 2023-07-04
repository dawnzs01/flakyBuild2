package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.progress.ProgressListener;
import com.huaweicloud.sdk.core.progress.ProgressRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DownloadProductsRequest implements ProgressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_ids")

    private List<Integer> productIds = null;

    private ProgressListener progressListener;

    private long progressInterval;

    @Override
    public void setProgressListener(ProgressListener progressListener) {
        this.progressListener = progressListener;
    }

    @Override
    public ProgressListener getProgressListener() {
        return progressListener;
    }

    @Override
    public void setProgressInterval(long progressInterval) {
        this.progressInterval = progressInterval;
    }

    @Override
    public long getProgressInterval() {
        return progressInterval;
    }

    public DownloadProductsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DownloadProductsRequest withProductIds(List<Integer> productIds) {
        this.productIds = productIds;
        return this;
    }

    public DownloadProductsRequest addProductIdsItem(Integer productIdsItem) {
        if (this.productIds == null) {
            this.productIds = new ArrayList<>();
        }
        this.productIds.add(productIdsItem);
        return this;
    }

    public DownloadProductsRequest withProductIds(Consumer<List<Integer>> productIdsSetter) {
        if (this.productIds == null) {
            this.productIds = new ArrayList<>();
        }
        productIdsSetter.accept(this.productIds);
        return this;
    }

    /**
     * 待导出产品ID列表
     * @return productIds
     */
    public List<Integer> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Integer> productIds) {
        this.productIds = productIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadProductsRequest downloadProductsRequest = (DownloadProductsRequest) o;
        return Objects.equals(this.instanceId, downloadProductsRequest.instanceId)
            && Objects.equals(this.productIds, downloadProductsRequest.productIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, productIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadProductsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
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
