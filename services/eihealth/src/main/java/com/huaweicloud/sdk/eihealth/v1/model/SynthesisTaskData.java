package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分子合成路径规划任务的请求体
 */
public class SynthesisTaskData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles")

    private String smiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_n")

    private Integer topN;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_search_depth")

    private Integer maxSearchDepth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_prediction_per_product")

    private Integer maxPredictionPerProduct;

    public SynthesisTaskData withSmiles(String smiles) {
        this.smiles = smiles;
        return this;
    }

    /**
     * 分子SMILES表达式
     * @return smiles
     */
    public String getSmiles() {
        return smiles;
    }

    public void setSmiles(String smiles) {
        this.smiles = smiles;
    }

    public SynthesisTaskData withTopN(Integer topN) {
        this.topN = topN;
        return this;
    }

    /**
     * 期望最大返回条目数（排序后取TopN）
     * minimum: 1
     * maximum: 50
     * @return topN
     */
    public Integer getTopN() {
        return topN;
    }

    public void setTopN(Integer topN) {
        this.topN = topN;
    }

    public SynthesisTaskData withMaxSearchDepth(Integer maxSearchDepth) {
        this.maxSearchDepth = maxSearchDepth;
        return this;
    }

    /**
     * 预测路径的最大深度
     * minimum: 3
     * maximum: 12
     * @return maxSearchDepth
     */
    public Integer getMaxSearchDepth() {
        return maxSearchDepth;
    }

    public void setMaxSearchDepth(Integer maxSearchDepth) {
        this.maxSearchDepth = maxSearchDepth;
    }

    public SynthesisTaskData withMaxPredictionPerProduct(Integer maxPredictionPerProduct) {
        this.maxPredictionPerProduct = maxPredictionPerProduct;
        return this;
    }

    /**
     * 每个产物的最大反应数量
     * minimum: 2
     * maximum: 20
     * @return maxPredictionPerProduct
     */
    public Integer getMaxPredictionPerProduct() {
        return maxPredictionPerProduct;
    }

    public void setMaxPredictionPerProduct(Integer maxPredictionPerProduct) {
        this.maxPredictionPerProduct = maxPredictionPerProduct;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SynthesisTaskData synthesisTaskData = (SynthesisTaskData) o;
        return Objects.equals(this.smiles, synthesisTaskData.smiles)
            && Objects.equals(this.topN, synthesisTaskData.topN)
            && Objects.equals(this.maxSearchDepth, synthesisTaskData.maxSearchDepth)
            && Objects.equals(this.maxPredictionPerProduct, synthesisTaskData.maxPredictionPerProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smiles, topN, maxSearchDepth, maxPredictionPerProduct);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SynthesisTaskData {\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    topN: ").append(toIndentedString(topN)).append("\n");
        sb.append("    maxSearchDepth: ").append(toIndentedString(maxSearchDepth)).append("\n");
        sb.append("    maxPredictionPerProduct: ").append(toIndentedString(maxPredictionPerProduct)).append("\n");
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
