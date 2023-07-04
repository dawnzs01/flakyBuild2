package com.huaweicloud.sdk.live.v2.model;

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
public class ListSingleStreamFramerateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "framerate_info_list")

    private List<V2FramerateInfo> framerateInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListSingleStreamFramerateResponse withFramerateInfoList(List<V2FramerateInfo> framerateInfoList) {
        this.framerateInfoList = framerateInfoList;
        return this;
    }

    public ListSingleStreamFramerateResponse addFramerateInfoListItem(V2FramerateInfo framerateInfoListItem) {
        if (this.framerateInfoList == null) {
            this.framerateInfoList = new ArrayList<>();
        }
        this.framerateInfoList.add(framerateInfoListItem);
        return this;
    }

    public ListSingleStreamFramerateResponse withFramerateInfoList(
        Consumer<List<V2FramerateInfo>> framerateInfoListSetter) {
        if (this.framerateInfoList == null) {
            this.framerateInfoList = new ArrayList<>();
        }
        framerateInfoListSetter.accept(this.framerateInfoList);
        return this;
    }

    /**
     * 用量详情。 
     * @return framerateInfoList
     */
    public List<V2FramerateInfo> getFramerateInfoList() {
        return framerateInfoList;
    }

    public void setFramerateInfoList(List<V2FramerateInfo> framerateInfoList) {
        this.framerateInfoList = framerateInfoList;
    }

    public ListSingleStreamFramerateResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSingleStreamFramerateResponse listSingleStreamFramerateResponse = (ListSingleStreamFramerateResponse) o;
        return Objects.equals(this.framerateInfoList, listSingleStreamFramerateResponse.framerateInfoList)
            && Objects.equals(this.xRequestId, listSingleStreamFramerateResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(framerateInfoList, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSingleStreamFramerateResponse {\n");
        sb.append("    framerateInfoList: ").append(toIndentedString(framerateInfoList)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
