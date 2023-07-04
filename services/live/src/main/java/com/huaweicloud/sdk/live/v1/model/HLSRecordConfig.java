package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HLSRecordConfig
 */
public class HLSRecordConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_cycle")

    private Integer recordCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_prefix")

    private String recordPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_ts_prefix")

    private String recordTsPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_slice_duration")

    private Integer recordSliceDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_max_duration_to_merge_file")

    private Integer recordMaxDurationToMergeFile;

    public HLSRecordConfig withRecordCycle(Integer recordCycle) {
        this.recordCycle = recordCycle;
        return this;
    }

    /**
     * 单位为秒，周期录制时长，最小1分钟（60秒），最大12小时。如果为0则整个流录制一个文件。
     * minimum: 0
     * maximum: 43200
     * @return recordCycle
     */
    public Integer getRecordCycle() {
        return recordCycle;
    }

    public void setRecordCycle(Integer recordCycle) {
        this.recordCycle = recordCycle;
    }

    public HLSRecordConfig withRecordPrefix(String recordPrefix) {
        this.recordPrefix = recordPrefix;
        return this;
    }

    /**
     * 录制m3u8文件含路径和文件名的前缀， 默认Record/{publish_domain}/{app}/{record_type}/{record_format}/{stream}_{file_start_time}/{stream}_{file_start_time}
     * @return recordPrefix
     */
    public String getRecordPrefix() {
        return recordPrefix;
    }

    public void setRecordPrefix(String recordPrefix) {
        this.recordPrefix = recordPrefix;
    }

    public HLSRecordConfig withRecordTsPrefix(String recordTsPrefix) {
        this.recordTsPrefix = recordTsPrefix;
        return this;
    }

    /**
     * 录制ts文件名的前缀， 默认{file_start_time_unix}_{file_end_time_unix}_{ts_sequence_number}
     * @return recordTsPrefix
     */
    public String getRecordTsPrefix() {
        return recordTsPrefix;
    }

    public void setRecordTsPrefix(String recordTsPrefix) {
        this.recordTsPrefix = recordTsPrefix;
    }

    public HLSRecordConfig withRecordSliceDuration(Integer recordSliceDuration) {
        this.recordSliceDuration = recordSliceDuration;
        return this;
    }

    /**
     * 录制HLS时ts的切片时长，非必须，缺省为10，单位秒，最小2，最大60
     * minimum: 2
     * maximum: 60
     * @return recordSliceDuration
     */
    public Integer getRecordSliceDuration() {
        return recordSliceDuration;
    }

    public void setRecordSliceDuration(Integer recordSliceDuration) {
        this.recordSliceDuration = recordSliceDuration;
    }

    public HLSRecordConfig withRecordMaxDurationToMergeFile(Integer recordMaxDurationToMergeFile) {
        this.recordMaxDurationToMergeFile = recordMaxDurationToMergeFile;
        return this;
    }

    /**
     * 录制HLS文件拼接时长，如果流中断超过该时间，则生成新文件。单位秒。如果为0表示流中断就生成新文件，如果为-1则表示相同的流中断恢复后继续在30天内的前一个文件保存。默认为0。
     * minimum: -1
     * maximum: 300
     * @return recordMaxDurationToMergeFile
     */
    public Integer getRecordMaxDurationToMergeFile() {
        return recordMaxDurationToMergeFile;
    }

    public void setRecordMaxDurationToMergeFile(Integer recordMaxDurationToMergeFile) {
        this.recordMaxDurationToMergeFile = recordMaxDurationToMergeFile;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HLSRecordConfig hlSRecordConfig = (HLSRecordConfig) o;
        return Objects.equals(this.recordCycle, hlSRecordConfig.recordCycle)
            && Objects.equals(this.recordPrefix, hlSRecordConfig.recordPrefix)
            && Objects.equals(this.recordTsPrefix, hlSRecordConfig.recordTsPrefix)
            && Objects.equals(this.recordSliceDuration, hlSRecordConfig.recordSliceDuration)
            && Objects.equals(this.recordMaxDurationToMergeFile, hlSRecordConfig.recordMaxDurationToMergeFile);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(recordCycle, recordPrefix, recordTsPrefix, recordSliceDuration, recordMaxDurationToMergeFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HLSRecordConfig {\n");
        sb.append("    recordCycle: ").append(toIndentedString(recordCycle)).append("\n");
        sb.append("    recordPrefix: ").append(toIndentedString(recordPrefix)).append("\n");
        sb.append("    recordTsPrefix: ").append(toIndentedString(recordTsPrefix)).append("\n");
        sb.append("    recordSliceDuration: ").append(toIndentedString(recordSliceDuration)).append("\n");
        sb.append("    recordMaxDurationToMergeFile: ")
            .append(toIndentedString(recordMaxDurationToMergeFile))
            .append("\n");
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
