package com.huaweicloud.sdk.cbs.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.ImageUrlResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ExecuteUploadPptResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="list")
    
    private List<ImageUrlResp> list = null;
    
    public ExecuteUploadPptResponse withList(List<ImageUrlResp> list) {
        this.list = list;
        return this;
    }

    
    public ExecuteUploadPptResponse addListItem(ImageUrlResp listItem) {
        if(this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public ExecuteUploadPptResponse withList(Consumer<List<ImageUrlResp>> listSetter) {
        if(this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 图片链接列表
     * @return list
     */
    public List<ImageUrlResp> getList() {
        return list;
    }

    public void setList(List<ImageUrlResp> list) {
        this.list = list;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteUploadPptResponse executeUploadPptResponse = (ExecuteUploadPptResponse) o;
        return Objects.equals(this.list, executeUploadPptResponse.list);
    }
    @Override
    public int hashCode() {
        return Objects.hash(list);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteUploadPptResponse {\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

