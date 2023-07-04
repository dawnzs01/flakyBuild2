package com.huaweicloud.sdk.moderation.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 涉政场景中的人物面部信息。
 */
public class ImageDetectionResultDetailFaceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "h")

    private Integer h;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "w")

    private Integer w;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x")

    private Integer x;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "y")

    private Integer y;

    public ImageDetectionResultDetailFaceDetail withH(Integer h) {
        this.h = h;
        return this;
    }

    /**
     * 人脸区域高度。
     * @return h
     */
    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public ImageDetectionResultDetailFaceDetail withW(Integer w) {
        this.w = w;
        return this;
    }

    /**
     * 人脸区域宽度。
     * @return w
     */
    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public ImageDetectionResultDetailFaceDetail withX(Integer x) {
        this.x = x;
        return this;
    }

    /**
     * 人脸区域左上角到y轴距离。
     * @return x
     */
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public ImageDetectionResultDetailFaceDetail withY(Integer y) {
        this.y = y;
        return this;
    }

    /**
     * 人脸区域左上角到x轴距离。
     * @return y
     */
    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageDetectionResultDetailFaceDetail imageDetectionResultDetailFaceDetail =
            (ImageDetectionResultDetailFaceDetail) o;
        return Objects.equals(this.h, imageDetectionResultDetailFaceDetail.h)
            && Objects.equals(this.w, imageDetectionResultDetailFaceDetail.w)
            && Objects.equals(this.x, imageDetectionResultDetailFaceDetail.x)
            && Objects.equals(this.y, imageDetectionResultDetailFaceDetail.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(h, w, x, y);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageDetectionResultDetailFaceDetail {\n");
        sb.append("    h: ").append(toIndentedString(h)).append("\n");
        sb.append("    w: ").append(toIndentedString(w)).append("\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
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
