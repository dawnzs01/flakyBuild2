package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VersionItem
 */
public class VersionItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_version")

    private String minVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<LinksItem> links = null;

    public VersionItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 版本ID（版本号），如v2。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VersionItem withMinVersion(String minVersion) {
        this.minVersion = minVersion;
        return this;
    }

    /**
     * 若该版本API支持微版本，则返回支持的最小微版本号；若不支持微版本，则返回空。
     * @return minVersion
     */
    public String getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(String minVersion) {
        this.minVersion = minVersion;
    }

    public VersionItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 版本状态，为如下3种：  CURRENT：表示该版本为主推版本。  SUPPORTED：表示为老版本，但是现在还继续支持。  DEPRECATED：表示为废弃版本，存在后续删除的可能。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VersionItem withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 版本发布时间，要求用UTC时间格式表示。如v2发布的时间2014-06-28T12:20:21Z。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public VersionItem withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 若该版本API支持微版本，则返回支持的最大微版本号；若不支持微版本，则返回空。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public VersionItem withLinks(List<LinksItem> links) {
        this.links = links;
        return this;
    }

    public VersionItem addLinksItem(LinksItem linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public VersionItem withLinks(Consumer<List<LinksItem>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * API的URL地址。
     * @return links
     */
    public List<LinksItem> getLinks() {
        return links;
    }

    public void setLinks(List<LinksItem> links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionItem versionItem = (VersionItem) o;
        return Objects.equals(this.id, versionItem.id) && Objects.equals(this.minVersion, versionItem.minVersion)
            && Objects.equals(this.status, versionItem.status) && Objects.equals(this.updated, versionItem.updated)
            && Objects.equals(this.version, versionItem.version) && Objects.equals(this.links, versionItem.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, minVersion, status, updated, version, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    minVersion: ").append(toIndentedString(minVersion)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
