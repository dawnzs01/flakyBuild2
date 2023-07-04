package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Probe
 */
public class Probe {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec")

    private Exec exec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_get")

    private HttpGet httpGet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_delay_seconds")

    private Long initialDelaySeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout_seconds")

    private Long timeoutSeconds;

    public Probe withExec(Exec exec) {
        this.exec = exec;
        return this;
    }

    public Probe withExec(Consumer<Exec> execSetter) {
        if (this.exec == null) {
            this.exec = new Exec();
            execSetter.accept(this.exec);
        }

        return this;
    }

    /**
     * Get exec
     * @return exec
     */
    public Exec getExec() {
        return exec;
    }

    public void setExec(Exec exec) {
        this.exec = exec;
    }

    public Probe withHttpGet(HttpGet httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    public Probe withHttpGet(Consumer<HttpGet> httpGetSetter) {
        if (this.httpGet == null) {
            this.httpGet = new HttpGet();
            httpGetSetter.accept(this.httpGet);
        }

        return this;
    }

    /**
     * Get httpGet
     * @return httpGet
     */
    public HttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(HttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public Probe withInitialDelaySeconds(Long initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }

    /**
     * 表示从工作负载启动后从多久开始探测，大于0且不大于3600的整数，默认为10
     * @return initialDelaySeconds
     */
    public Long getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    public void setInitialDelaySeconds(Long initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    public Probe withTimeoutSeconds(Long timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * 表示探测超时时间，大于0且不大于3600的整数，默认为1
     * @return timeoutSeconds
     */
    public Long getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(Long timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Probe probe = (Probe) o;
        return Objects.equals(this.exec, probe.exec) && Objects.equals(this.httpGet, probe.httpGet)
            && Objects.equals(this.initialDelaySeconds, probe.initialDelaySeconds)
            && Objects.equals(this.timeoutSeconds, probe.timeoutSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exec, httpGet, initialDelaySeconds, timeoutSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Probe {\n");
        sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
        sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
        sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
        sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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
