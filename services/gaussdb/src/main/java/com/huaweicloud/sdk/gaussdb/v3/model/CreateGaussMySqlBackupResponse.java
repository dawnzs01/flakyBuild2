package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.Backup;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateGaussMySqlBackupResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup")
    

    private Backup backup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    

    private String jobId;

    public CreateGaussMySqlBackupResponse withBackup(Backup backup) {
        this.backup = backup;
        return this;
    }

    public CreateGaussMySqlBackupResponse withBackup(Consumer<Backup> backupSetter) {
        if(this.backup == null ){
            this.backup = new Backup();
            backupSetter.accept(this.backup);
        }
        
        return this;
    }


    /**
     * Get backup
     * @return backup
     */
    public Backup getBackup() {
        return backup;
    }

    public void setBackup(Backup backup) {
        this.backup = backup;
    }

    

    public CreateGaussMySqlBackupResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateGaussMySqlBackupResponse createGaussMySqlBackupResponse = (CreateGaussMySqlBackupResponse) o;
        return Objects.equals(this.backup, createGaussMySqlBackupResponse.backup) &&
            Objects.equals(this.jobId, createGaussMySqlBackupResponse.jobId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(backup, jobId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGaussMySqlBackupResponse {\n");
        sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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

