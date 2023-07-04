package com.huaweicloud.sdk.csms.v1.model;

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
public class ListSecretVersionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_metadatas")

    private List<VersionMetadata> versionMetadatas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListSecretVersionsResponse withVersionMetadatas(List<VersionMetadata> versionMetadatas) {
        this.versionMetadatas = versionMetadatas;
        return this;
    }

    public ListSecretVersionsResponse addVersionMetadatasItem(VersionMetadata versionMetadatasItem) {
        if (this.versionMetadatas == null) {
            this.versionMetadatas = new ArrayList<>();
        }
        this.versionMetadatas.add(versionMetadatasItem);
        return this;
    }

    public ListSecretVersionsResponse withVersionMetadatas(Consumer<List<VersionMetadata>> versionMetadatasSetter) {
        if (this.versionMetadatas == null) {
            this.versionMetadatas = new ArrayList<>();
        }
        versionMetadatasSetter.accept(this.versionMetadatas);
        return this;
    }

    /**
     * version_metadata对象。
     * @return versionMetadatas
     */
    public List<VersionMetadata> getVersionMetadatas() {
        return versionMetadatas;
    }

    public void setVersionMetadatas(List<VersionMetadata> versionMetadatas) {
        this.versionMetadatas = versionMetadatas;
    }

    public ListSecretVersionsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListSecretVersionsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSecretVersionsResponse listSecretVersionsResponse = (ListSecretVersionsResponse) o;
        return Objects.equals(this.versionMetadatas, listSecretVersionsResponse.versionMetadatas)
            && Objects.equals(this.pageInfo, listSecretVersionsResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionMetadatas, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecretVersionsResponse {\n");
        sb.append("    versionMetadatas: ").append(toIndentedString(versionMetadatas)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
