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
public class SearchFaceByBase64Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "faces")

    private List<SearchFace> faces = null;

    public SearchFaceByBase64Response withFaces(List<SearchFace> faces) {
        this.faces = faces;
        return this;
    }

    public SearchFaceByBase64Response addFacesItem(SearchFace facesItem) {
        if (this.faces == null) {
            this.faces = new ArrayList<>();
        }
        this.faces.add(facesItem);
        return this;
    }

    public SearchFaceByBase64Response withFaces(Consumer<List<SearchFace>> facesSetter) {
        if (this.faces == null) {
            this.faces = new ArrayList<>();
        }
        facesSetter.accept(this.faces);
        return this;
    }

    /**
     * [查找的人脸集合，详见[SearchFace](https://support.huaweicloud.com/api-face/face_02_0019.html)。调用失败时无此字段。](tag:hc) [查找的人脸集合，详见[SearchFace](https://support.huaweicloud.com/intl/zh-cn/api-face/face_02_0019.html)。调用失败时无此字段。](tag:hk)
     * @return faces
     */
    public List<SearchFace> getFaces() {
        return faces;
    }

    public void setFaces(List<SearchFace> faces) {
        this.faces = faces;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchFaceByBase64Response searchFaceByBase64Response = (SearchFaceByBase64Response) o;
        return Objects.equals(this.faces, searchFaceByBase64Response.faces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchFaceByBase64Response {\n");
        sb.append("    faces: ").append(toIndentedString(faces)).append("\n");
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
