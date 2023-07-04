package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowClassroomDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classroom_id")

    private String classroomId;

    public ShowClassroomDetailRequest withClassroomId(String classroomId) {
        this.classroomId = classroomId;
        return this;
    }

    /**
     * 课堂ID
     * @return classroomId
     */
    public String getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowClassroomDetailRequest showClassroomDetailRequest = (ShowClassroomDetailRequest) o;
        return Objects.equals(this.classroomId, showClassroomDetailRequest.classroomId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classroomId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClassroomDetailRequest {\n");
        sb.append("    classroomId: ").append(toIndentedString(classroomId)).append("\n");
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
