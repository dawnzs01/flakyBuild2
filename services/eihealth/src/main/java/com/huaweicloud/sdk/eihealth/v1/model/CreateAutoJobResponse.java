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
public class CreateAutoJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_infos")

    private List<AppFilterDto> appInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_info")

    private JobFilterDto jobInfo;

    public CreateAutoJobResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 作业id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateAutoJobResponse withAppInfos(List<AppFilterDto> appInfos) {
        this.appInfos = appInfos;
        return this;
    }

    public CreateAutoJobResponse addAppInfosItem(AppFilterDto appInfosItem) {
        if (this.appInfos == null) {
            this.appInfos = new ArrayList<>();
        }
        this.appInfos.add(appInfosItem);
        return this;
    }

    public CreateAutoJobResponse withAppInfos(Consumer<List<AppFilterDto>> appInfosSetter) {
        if (this.appInfos == null) {
            this.appInfos = new ArrayList<>();
        }
        appInfosSetter.accept(this.appInfos);
        return this;
    }

    /**
     * 筛选后的app集合
     * @return appInfos
     */
    public List<AppFilterDto> getAppInfos() {
        return appInfos;
    }

    public void setAppInfos(List<AppFilterDto> appInfos) {
        this.appInfos = appInfos;
    }

    public CreateAutoJobResponse withJobInfo(JobFilterDto jobInfo) {
        this.jobInfo = jobInfo;
        return this;
    }

    public CreateAutoJobResponse withJobInfo(Consumer<JobFilterDto> jobInfoSetter) {
        if (this.jobInfo == null) {
            this.jobInfo = new JobFilterDto();
            jobInfoSetter.accept(this.jobInfo);
        }

        return this;
    }

    /**
     * Get jobInfo
     * @return jobInfo
     */
    public JobFilterDto getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(JobFilterDto jobInfo) {
        this.jobInfo = jobInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAutoJobResponse createAutoJobResponse = (CreateAutoJobResponse) o;
        return Objects.equals(this.id, createAutoJobResponse.id)
            && Objects.equals(this.appInfos, createAutoJobResponse.appInfos)
            && Objects.equals(this.jobInfo, createAutoJobResponse.jobInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, appInfos, jobInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAutoJobResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    appInfos: ").append(toIndentedString(appInfos)).append("\n");
        sb.append("    jobInfo: ").append(toIndentedString(jobInfo)).append("\n");
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
