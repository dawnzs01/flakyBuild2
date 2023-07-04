package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListEventsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_version")

    private String apiVersion;

    /**
     * 资源种类。
     */
    public static final class KindEnum {

        /**
         * Enum COMPONENTEVENT for value: "ComponentEvent"
         */
        public static final KindEnum COMPONENTEVENT = new KindEnum("ComponentEvent");

        private static final Map<String, KindEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KindEnum> createStaticFields() {
            Map<String, KindEnum> map = new HashMap<>();
            map.put("ComponentEvent", COMPONENTEVENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KindEnum(String value) {
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
        public static KindEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            KindEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new KindEnum(value);
            }
            return result;
        }

        public static KindEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            KindEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KindEnum) {
                return this.value.equals(((KindEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private KindEnum kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<EventItem> items = null;

    public ListEventsResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * API版本。
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ListEventsResponse withKind(KindEnum kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 资源种类。
     * @return kind
     */
    public KindEnum getKind() {
        return kind;
    }

    public void setKind(KindEnum kind) {
        this.kind = kind;
    }

    public ListEventsResponse withItems(List<EventItem> items) {
        this.items = items;
        return this;
    }

    public ListEventsResponse addItemsItem(EventItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListEventsResponse withItems(Consumer<List<EventItem>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 事件项。
     * @return items
     */
    public List<EventItem> getItems() {
        return items;
    }

    public void setItems(List<EventItem> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEventsResponse listEventsResponse = (ListEventsResponse) o;
        return Objects.equals(this.apiVersion, listEventsResponse.apiVersion)
            && Objects.equals(this.kind, listEventsResponse.kind)
            && Objects.equals(this.items, listEventsResponse.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventsResponse {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
