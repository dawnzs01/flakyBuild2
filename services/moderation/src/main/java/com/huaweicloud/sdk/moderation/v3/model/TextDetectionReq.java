package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 文本内容审核请求体
 */
public class TextDetectionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "glossary_names")

    private List<String> glossaryNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private TextDetectionDataReq data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white_glossary_names")

    private List<String> whiteGlossaryNames = null;

    public TextDetectionReq withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型。  可选值如下：  nickname: 昵称  title: 标题  article: 帖⼦  comment: 评论  barrage: 弹幕  search: 搜索栏  profile: 个⼈简介
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public TextDetectionReq withGlossaryNames(List<String> glossaryNames) {
        this.glossaryNames = glossaryNames;
        return this;
    }

    public TextDetectionReq addGlossaryNamesItem(String glossaryNamesItem) {
        if (this.glossaryNames == null) {
            this.glossaryNames = new ArrayList<>();
        }
        this.glossaryNames.add(glossaryNamesItem);
        return this;
    }

    public TextDetectionReq withGlossaryNames(Consumer<List<String>> glossaryNamesSetter) {
        if (this.glossaryNames == null) {
            this.glossaryNames = new ArrayList<>();
        }
        glossaryNamesSetter.accept(this.glossaryNames);
        return this;
    }

    /**
     * 检测时使用的自定义黑名单词库列表。自定义黑词库的创建和使用请参见[配置定义黑名单词库](https://support.huaweicloud.com/api-moderation/moderation_03_0027.html#moderation_03_0027__section12400140132318)。
     * @return glossaryNames
     */
    public List<String> getGlossaryNames() {
        return glossaryNames;
    }

    public void setGlossaryNames(List<String> glossaryNames) {
        this.glossaryNames = glossaryNames;
    }

    public TextDetectionReq withData(TextDetectionDataReq data) {
        this.data = data;
        return this;
    }

    public TextDetectionReq withData(Consumer<TextDetectionDataReq> dataSetter) {
        if (this.data == null) {
            this.data = new TextDetectionDataReq();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public TextDetectionDataReq getData() {
        return data;
    }

    public void setData(TextDetectionDataReq data) {
        this.data = data;
    }

    public TextDetectionReq withWhiteGlossaryNames(List<String> whiteGlossaryNames) {
        this.whiteGlossaryNames = whiteGlossaryNames;
        return this;
    }

    public TextDetectionReq addWhiteGlossaryNamesItem(String whiteGlossaryNamesItem) {
        if (this.whiteGlossaryNames == null) {
            this.whiteGlossaryNames = new ArrayList<>();
        }
        this.whiteGlossaryNames.add(whiteGlossaryNamesItem);
        return this;
    }

    public TextDetectionReq withWhiteGlossaryNames(Consumer<List<String>> whiteGlossaryNamesSetter) {
        if (this.whiteGlossaryNames == null) {
            this.whiteGlossaryNames = new ArrayList<>();
        }
        whiteGlossaryNamesSetter.accept(this.whiteGlossaryNames);
        return this;
    }

    /**
     * 检测时使用的自定义白名单词库列表。自定义白词库的创建和使用请参见[配置定义白名单词库](https://support.huaweicloud.com/api-moderation/moderation_03_0027.html#moderation_03_0027__section178844141394)。
     * @return whiteGlossaryNames
     */
    public List<String> getWhiteGlossaryNames() {
        return whiteGlossaryNames;
    }

    public void setWhiteGlossaryNames(List<String> whiteGlossaryNames) {
        this.whiteGlossaryNames = whiteGlossaryNames;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TextDetectionReq textDetectionReq = (TextDetectionReq) o;
        return Objects.equals(this.eventType, textDetectionReq.eventType)
            && Objects.equals(this.glossaryNames, textDetectionReq.glossaryNames)
            && Objects.equals(this.data, textDetectionReq.data)
            && Objects.equals(this.whiteGlossaryNames, textDetectionReq.whiteGlossaryNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, glossaryNames, data, whiteGlossaryNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextDetectionReq {\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    glossaryNames: ").append(toIndentedString(glossaryNames)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    whiteGlossaryNames: ").append(toIndentedString(whiteGlossaryNames)).append("\n");
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
