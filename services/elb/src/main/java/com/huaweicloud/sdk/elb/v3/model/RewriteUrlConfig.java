package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 转发到的后端主机组的URL配置。rewrite_url_enable为true时，改字段有效。
 */
public class RewriteUrlConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    public RewriteUrlConfig withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * url host
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public RewriteUrlConfig withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * url路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public RewriteUrlConfig withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * url查询字符串
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RewriteUrlConfig rewriteUrlConfig = (RewriteUrlConfig) o;
        return Objects.equals(this.host, rewriteUrlConfig.host) && Objects.equals(this.path, rewriteUrlConfig.path)
            && Objects.equals(this.query, rewriteUrlConfig.query);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, path, query);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RewriteUrlConfig {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
