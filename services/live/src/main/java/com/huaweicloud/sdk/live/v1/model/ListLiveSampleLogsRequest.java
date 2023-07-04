package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Request Object
 */
public class ListLiveSampleLogsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_domain")

    private String playDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    public ListLiveSampleLogsRequest withPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }

    /**
     * 播放域名。
     * @return playDomain
     */
    public String getPlayDomain() {
        return playDomain;
    }

    public void setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
    }

    public ListLiveSampleLogsRequest withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询开始时间，UTC时间：YYYY-MM-DDTHH:mm:ssZ，如北京时间2020年3月4日16点00分00秒可表示为2020-03-04T08:00:00Z。仅支持查询最近3个月内的数据。
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public ListLiveSampleLogsRequest withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询结束时间，UTC时间：YYYY-MM-DDTHH:mm:ssZ，如北京时间2020年3月4日16点00分00秒可表示为2020-03-04T08:00:00Z。查询时间跨度不能大于7天。
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLiveSampleLogsRequest listLiveSampleLogsRequest = (ListLiveSampleLogsRequest) o;
        return Objects.equals(this.playDomain, listLiveSampleLogsRequest.playDomain)
            && Objects.equals(this.startTime, listLiveSampleLogsRequest.startTime)
            && Objects.equals(this.endTime, listLiveSampleLogsRequest.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playDomain, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLiveSampleLogsRequest {\n");
        sb.append("    playDomain: ").append(toIndentedString(playDomain)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
