package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DetectLiveFaceByFileResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private LiveDetectFaceRespResult result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warning-list")

    private List<WarningList> warningList = null;

    public DetectLiveFaceByFileResponse withResult(LiveDetectFaceRespResult result) {
        this.result = result;
        return this;
    }

    public DetectLiveFaceByFileResponse withResult(Consumer<LiveDetectFaceRespResult> resultSetter) {
        if (this.result == null) {
            this.result = new LiveDetectFaceRespResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public LiveDetectFaceRespResult getResult() {
        return result;
    }

    public void setResult(LiveDetectFaceRespResult result) {
        this.result = result;
    }

    public DetectLiveFaceByFileResponse withWarningList(List<WarningList> warningList) {
        this.warningList = warningList;
        return this;
    }

    public DetectLiveFaceByFileResponse addWarningListItem(WarningList warningListItem) {
        if (this.warningList == null) {
            this.warningList = new ArrayList<>();
        }
        this.warningList.add(warningListItem);
        return this;
    }

    public DetectLiveFaceByFileResponse withWarningList(Consumer<List<WarningList>> warningListSetter) {
        if (this.warningList == null) {
            this.warningList = new ArrayList<>();
        }
        warningListSetter.accept(this.warningList);
        return this;
    }

    /**
     * 警告信息列表。 调用失败时无此字段。
     * @return warningList
     */
    public List<WarningList> getWarningList() {
        return warningList;
    }

    public void setWarningList(List<WarningList> warningList) {
        this.warningList = warningList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DetectLiveFaceByFileResponse detectLiveFaceByFileResponse = (DetectLiveFaceByFileResponse) o;
        return Objects.equals(this.result, detectLiveFaceByFileResponse.result)
            && Objects.equals(this.warningList, detectLiveFaceByFileResponse.warningList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, warningList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectLiveFaceByFileResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    warningList: ").append(toIndentedString(warningList)).append("\n");
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
