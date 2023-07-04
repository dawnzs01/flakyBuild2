package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListImageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "images")

    private List<ImageDetailRsp> images = null;

    public ListImageResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 镜像总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListImageResponse withImages(List<ImageDetailRsp> images) {
        this.images = images;
        return this;
    }

    public ListImageResponse addImagesItem(ImageDetailRsp imagesItem) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(imagesItem);
        return this;
    }

    public ListImageResponse withImages(Consumer<List<ImageDetailRsp>> imagesSetter) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        imagesSetter.accept(this.images);
        return this;
    }

    /**
     * 镜像详情列表
     * @return images
     */
    public List<ImageDetailRsp> getImages() {
        return images;
    }

    public void setImages(List<ImageDetailRsp> images) {
        this.images = images;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListImageResponse listImageResponse = (ListImageResponse) o;
        return Objects.equals(this.count, listImageResponse.count)
            && Objects.equals(this.images, listImageResponse.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, images);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImageResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
