package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.RdsNoAgentDbRequestDatabases;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RdsNoAgentDbRequest
 */
public class RdsNoAgentDbRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="databases")
    
    private List<RdsNoAgentDbRequestDatabases> databases = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    

    private Integer totalCount;

    public RdsNoAgentDbRequest withDatabases(List<RdsNoAgentDbRequestDatabases> databases) {
        this.databases = databases;
        return this;
    }

    
    public RdsNoAgentDbRequest addDatabasesItem(RdsNoAgentDbRequestDatabases databasesItem) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public RdsNoAgentDbRequest withDatabases(Consumer<List<RdsNoAgentDbRequestDatabases>> databasesSetter) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 添加数据库信息列表
     * @return databases
     */
    public List<RdsNoAgentDbRequestDatabases> getDatabases() {
        return databases;
    }

    public void setDatabases(List<RdsNoAgentDbRequestDatabases> databases) {
        this.databases = databases;
    }

    

    public RdsNoAgentDbRequest withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RdsNoAgentDbRequest rdsNoAgentDbRequest = (RdsNoAgentDbRequest) o;
        return Objects.equals(this.databases, rdsNoAgentDbRequest.databases) &&
            Objects.equals(this.totalCount, rdsNoAgentDbRequest.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(databases, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RdsNoAgentDbRequest {\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

