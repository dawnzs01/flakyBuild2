package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListAssetsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-App-UserId")

    private String xAppUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_type")

    private String assetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    /**
     * 升序还是降序，默认升序。 * asc：升序 * desc：降序
     */
    public static final class SortDirEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortDirEnum ASC = new SortDirEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortDirEnum DESC = new SortDirEnum("desc");

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SortDirEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortDirEnum(value);
            }
            return result;
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private SortDirEnum sortDir;

    /**
     * 资产来源，默认查询租户资产。 * SYSTEM： 系统资产 * CUSTOMIZATION： 租户资产 - ALL： 所有资产
     */
    public static final class AssetSourceEnum {

        /**
         * Enum SYSTEM for value: "SYSTEM"
         */
        public static final AssetSourceEnum SYSTEM = new AssetSourceEnum("SYSTEM");

        /**
         * Enum CUSTOMIZATION for value: "CUSTOMIZATION"
         */
        public static final AssetSourceEnum CUSTOMIZATION = new AssetSourceEnum("CUSTOMIZATION");

        /**
         * Enum ALL for value: "ALL"
         */
        public static final AssetSourceEnum ALL = new AssetSourceEnum("ALL");

        private static final Map<String, AssetSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssetSourceEnum> createStaticFields() {
            Map<String, AssetSourceEnum> map = new HashMap<>();
            map.put("SYSTEM", SYSTEM);
            map.put("CUSTOMIZATION", CUSTOMIZATION);
            map.put("ALL", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssetSourceEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AssetSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AssetSourceEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AssetSourceEnum(value);
            }
            return result;
        }

        public static AssetSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AssetSourceEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssetSourceEnum) {
                return this.value.equals(((AssetSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_source")

    private AssetSourceEnum assetSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_state")

    private String assetState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "style_id")

    private String styleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "render_engine")

    private String renderEngine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private String sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lanuage")

    private String lanuage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_property")

    private String systemProperty;

    public ListAssetsRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带的鉴权信息。
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public ListAssetsRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，请求的发生时间.格式为(YYYYMMDD'T'HHMMSS'Z')。 取值为当前系统的GMT时间。
     * @return xSdkDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public ListAssetsRequest withXAppUserId(String xAppUserId) {
        this.xAppUserId = xAppUserId;
        return this;
    }

    /**
     * 开发者应用作为资产权属的可选字段。
     * @return xAppUserId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-App-UserId")
    public String getXAppUserId() {
        return xAppUserId;
    }

    public void setXAppUserId(String xAppUserId) {
        this.xAppUserId = xAppUserId;
    }

    public ListAssetsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAssetsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAssetsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 按名称模糊查询。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAssetsRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 按标签模糊查询。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ListAssetsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 起始时间。格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListAssetsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。格式遵循：RFC 3339 如\"2021-01-10T10:43:17Z\"。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListAssetsRequest withAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * 资产类型。 * HUMAN_MODEL:数字人模型 * VOICE_MODEL:音色模型(仅系统管理员可上传) * SCENE:场景模型 * ANIMATION:动作动画 * VIDEO:视频文件 * IMAGE:图片文件 * PPT:幻灯片文件 * MATERIAL:风格化素材 多个类型使用英文逗号分割
     * @return assetType
     */
    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public ListAssetsRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序字段，目前只支持create_time。
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListAssetsRequest withSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 升序还是降序，默认升序。 * asc：升序 * desc：降序
     * @return sortDir
     */
    public SortDirEnum getSortDir() {
        return sortDir;
    }

    public void setSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
    }

    public ListAssetsRequest withAssetSource(AssetSourceEnum assetSource) {
        this.assetSource = assetSource;
        return this;
    }

    /**
     * 资产来源，默认查询租户资产。 * SYSTEM： 系统资产 * CUSTOMIZATION： 租户资产 - ALL： 所有资产
     * @return assetSource
     */
    public AssetSourceEnum getAssetSource() {
        return assetSource;
    }

    public void setAssetSource(AssetSourceEnum assetSource) {
        this.assetSource = assetSource;
    }

    public ListAssetsRequest withAssetState(String assetState) {
        this.assetState = assetState;
        return this;
    }

    /**
     * 资产状态。默认查询所有状态的资产。 * CREATING:资产创建中，主文件尚未上传 * FAILED:主文件上传失败 * UNACTIVED:主文件上传成功，资产未激活，资产不可用于其他业务(用户可更新状态) * ACTIVED:主文件上传成功，资产激活，资产可用于其他业务(用户可更新状态) * DELETING:资产删除中，资产不可用，资产可恢复 * DELETED:资产文件已删除，资产不可用，资产不可恢复 多个资产状态使用英文逗号分割
     * @return assetState
     */
    public String getAssetState() {
        return assetState;
    }

    public void setAssetState(String assetState) {
        this.assetState = assetState;
    }

    public ListAssetsRequest withStyleId(String styleId) {
        this.styleId = styleId;
        return this;
    }

    /**
     * 基于风格化ID查询关联资产。 * system_male_001: 男性风格01 * system_female_001: 女性风格01 * system_male_002：男性风格02  * system_female_002: 女性风格02
     * @return styleId
     */
    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    public ListAssetsRequest withRenderEngine(String renderEngine) {
        this.renderEngine = renderEngine;
        return this;
    }

    /**
     * 可用引擎。 * UE * MetaEngine  > 该字段当前只对MetaEngine白名单用户生效
     * @return renderEngine
     */
    public String getRenderEngine() {
        return renderEngine;
    }

    public void setRenderEngine(String renderEngine) {
        this.renderEngine = renderEngine;
    }

    public ListAssetsRequest withSex(String sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 性别 多选使用英文逗号分隔
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public ListAssetsRequest withLanuage(String lanuage) {
        this.lanuage = lanuage;
        return this;
    }

    /**
     * 语言 多选使用英文逗号分隔
     * @return lanuage
     */
    public String getLanuage() {
        return lanuage;
    }

    public void setLanuage(String lanuage) {
        this.lanuage = lanuage;
    }

    public ListAssetsRequest withSystemProperty(String systemProperty) {
        this.systemProperty = systemProperty;
        return this;
    }

    /**
     * 系统属性。key和value间用\":\"分隔，多个key之间用\",\"分隔。如system_property=BACKGROUND_IMG:Yes,RENDER_ENGINE:MetaEngine。 不同Key对应Value取值如下： * STYLE_ID * DH_ID * PLATFORM_AVAILABLE * RENDER_ENGINE： 引擎类型，可取值UE或MetaEngine * BACKGROUND_IMG: 视频制作的2D背景图片，可取值Yes * BACKGROUND_SCENE: 视频制作的2D背景场景，可取值Horizontal（横屏）或者Vertical（竖屏）
     * @return systemProperty
     */
    public String getSystemProperty() {
        return systemProperty;
    }

    public void setSystemProperty(String systemProperty) {
        this.systemProperty = systemProperty;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAssetsRequest listAssetsRequest = (ListAssetsRequest) o;
        return Objects.equals(this.authorization, listAssetsRequest.authorization)
            && Objects.equals(this.xSdkDate, listAssetsRequest.xSdkDate)
            && Objects.equals(this.xAppUserId, listAssetsRequest.xAppUserId)
            && Objects.equals(this.limit, listAssetsRequest.limit)
            && Objects.equals(this.offset, listAssetsRequest.offset)
            && Objects.equals(this.name, listAssetsRequest.name) && Objects.equals(this.tag, listAssetsRequest.tag)
            && Objects.equals(this.startTime, listAssetsRequest.startTime)
            && Objects.equals(this.endTime, listAssetsRequest.endTime)
            && Objects.equals(this.assetType, listAssetsRequest.assetType)
            && Objects.equals(this.sortKey, listAssetsRequest.sortKey)
            && Objects.equals(this.sortDir, listAssetsRequest.sortDir)
            && Objects.equals(this.assetSource, listAssetsRequest.assetSource)
            && Objects.equals(this.assetState, listAssetsRequest.assetState)
            && Objects.equals(this.styleId, listAssetsRequest.styleId)
            && Objects.equals(this.renderEngine, listAssetsRequest.renderEngine)
            && Objects.equals(this.sex, listAssetsRequest.sex)
            && Objects.equals(this.lanuage, listAssetsRequest.lanuage)
            && Objects.equals(this.systemProperty, listAssetsRequest.systemProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization,
            xSdkDate,
            xAppUserId,
            limit,
            offset,
            name,
            tag,
            startTime,
            endTime,
            assetType,
            sortKey,
            sortDir,
            assetSource,
            assetState,
            styleId,
            renderEngine,
            sex,
            lanuage,
            systemProperty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssetsRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    xAppUserId: ").append(toIndentedString(xAppUserId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    assetSource: ").append(toIndentedString(assetSource)).append("\n");
        sb.append("    assetState: ").append(toIndentedString(assetState)).append("\n");
        sb.append("    styleId: ").append(toIndentedString(styleId)).append("\n");
        sb.append("    renderEngine: ").append(toIndentedString(renderEngine)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    lanuage: ").append(toIndentedString(lanuage)).append("\n");
        sb.append("    systemProperty: ").append(toIndentedString(systemProperty)).append("\n");
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
