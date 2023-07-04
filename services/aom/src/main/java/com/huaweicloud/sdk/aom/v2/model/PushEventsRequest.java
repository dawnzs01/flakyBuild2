package com.huaweicloud.sdk.aom.v2.model;





import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.EventList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class PushEventsRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x-enterprise-prject-id")
    

    private String xEnterprisePrjectId;
    /**
     * 接口请求动作。action=clear代表清除告警，不传或者传其他值默认为上报动作。
     */
    public static final class ActionEnum {

        
        /**
         * Enum CLEAR for value: "clear"
         */
        public static final ActionEnum CLEAR = new ActionEnum("clear");
        

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("clear", CLEAR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionEnum(value);
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private EventList body;

    public PushEventsRequest withXEnterprisePrjectId(String xEnterprisePrjectId) {
        this.xEnterprisePrjectId = xEnterprisePrjectId;
        return this;
    }

    


    /**
     * 告警所属的企业项目id。
     * @return xEnterprisePrjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x-enterprise-prject-id")
    public String getXEnterprisePrjectId() {
        return xEnterprisePrjectId;
    }

    public void setXEnterprisePrjectId(String xEnterprisePrjectId) {
        this.xEnterprisePrjectId = xEnterprisePrjectId;
    }

    

    public PushEventsRequest withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 接口请求动作。action=clear代表清除告警，不传或者传其他值默认为上报动作。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    

    public PushEventsRequest withBody(EventList body) {
        this.body = body;
        return this;
    }

    public PushEventsRequest withBody(Consumer<EventList> bodySetter) {
        if(this.body == null ){
            this.body = new EventList();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public EventList getBody() {
        return body;
    }

    public void setBody(EventList body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PushEventsRequest pushEventsRequest = (PushEventsRequest) o;
        return Objects.equals(this.xEnterprisePrjectId, pushEventsRequest.xEnterprisePrjectId) &&
            Objects.equals(this.action, pushEventsRequest.action) &&
            Objects.equals(this.body, pushEventsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xEnterprisePrjectId, action, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PushEventsRequest {\n");
        sb.append("    xEnterprisePrjectId: ").append(toIndentedString(xEnterprisePrjectId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

