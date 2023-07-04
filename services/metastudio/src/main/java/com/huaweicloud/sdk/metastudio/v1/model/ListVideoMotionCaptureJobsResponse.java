package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ListVideoMotionCaptureJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_motion_capture_jobs")

    private List<VideoMotionCaptureInfo> videoMotionCaptureJobs = null;

    public ListVideoMotionCaptureJobsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 视频驱动任务总数。
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListVideoMotionCaptureJobsResponse withVideoMotionCaptureJobs(
        List<VideoMotionCaptureInfo> videoMotionCaptureJobs) {
        this.videoMotionCaptureJobs = videoMotionCaptureJobs;
        return this;
    }

    public ListVideoMotionCaptureJobsResponse addVideoMotionCaptureJobsItem(
        VideoMotionCaptureInfo videoMotionCaptureJobsItem) {
        if (this.videoMotionCaptureJobs == null) {
            this.videoMotionCaptureJobs = new ArrayList<>();
        }
        this.videoMotionCaptureJobs.add(videoMotionCaptureJobsItem);
        return this;
    }

    public ListVideoMotionCaptureJobsResponse withVideoMotionCaptureJobs(
        Consumer<List<VideoMotionCaptureInfo>> videoMotionCaptureJobsSetter) {
        if (this.videoMotionCaptureJobs == null) {
            this.videoMotionCaptureJobs = new ArrayList<>();
        }
        videoMotionCaptureJobsSetter.accept(this.videoMotionCaptureJobs);
        return this;
    }

    /**
     * 视频驱动任务列表。
     * @return videoMotionCaptureJobs
     */
    public List<VideoMotionCaptureInfo> getVideoMotionCaptureJobs() {
        return videoMotionCaptureJobs;
    }

    public void setVideoMotionCaptureJobs(List<VideoMotionCaptureInfo> videoMotionCaptureJobs) {
        this.videoMotionCaptureJobs = videoMotionCaptureJobs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVideoMotionCaptureJobsResponse listVideoMotionCaptureJobsResponse = (ListVideoMotionCaptureJobsResponse) o;
        return Objects.equals(this.total, listVideoMotionCaptureJobsResponse.total)
            && Objects.equals(this.videoMotionCaptureJobs, listVideoMotionCaptureJobsResponse.videoMotionCaptureJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, videoMotionCaptureJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVideoMotionCaptureJobsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    videoMotionCaptureJobs: ").append(toIndentedString(videoMotionCaptureJobs)).append("\n");
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
