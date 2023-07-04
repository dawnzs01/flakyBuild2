package com.huaweicloud.sdk.iotedge.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.PageInfoDTO;
import com.huaweicloud.sdk.iotedge.v2.model.QueryDcDeviceRespDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchListDcDevicesResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_info")
    

    private PageInfoDTO pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="devices")
    
    private List<QueryDcDeviceRespDTO> devices = null;
    
    public BatchListDcDevicesResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    


    /**
     * 总记录数
     * minimum: 0
     * maximum: 1000000
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    

    public BatchListDcDevicesResponse withPageInfo(PageInfoDTO pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public BatchListDcDevicesResponse withPageInfo(Consumer<PageInfoDTO> pageInfoSetter) {
        if(this.pageInfo == null ){
            this.pageInfo = new PageInfoDTO();
            pageInfoSetter.accept(this.pageInfo);
        }
        
        return this;
    }


    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDTO getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDTO pageInfo) {
        this.pageInfo = pageInfo;
    }

    

    public BatchListDcDevicesResponse withDevices(List<QueryDcDeviceRespDTO> devices) {
        this.devices = devices;
        return this;
    }

    
    public BatchListDcDevicesResponse addDevicesItem(QueryDcDeviceRespDTO devicesItem) {
        if(this.devices == null) {
            this.devices = new ArrayList<>();
        }
        this.devices.add(devicesItem);
        return this;
    }

    public BatchListDcDevicesResponse withDevices(Consumer<List<QueryDcDeviceRespDTO>> devicesSetter) {
        if(this.devices == null) {
            this.devices = new ArrayList<>();
        }
        devicesSetter.accept(this.devices);
        return this;
    }

    /**
     * 每页记录数
     * @return devices
     */
    public List<QueryDcDeviceRespDTO> getDevices() {
        return devices;
    }

    public void setDevices(List<QueryDcDeviceRespDTO> devices) {
        this.devices = devices;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchListDcDevicesResponse batchListDcDevicesResponse = (BatchListDcDevicesResponse) o;
        return Objects.equals(this.count, batchListDcDevicesResponse.count) &&
            Objects.equals(this.pageInfo, batchListDcDevicesResponse.pageInfo) &&
            Objects.equals(this.devices, batchListDcDevicesResponse.devices);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, pageInfo, devices);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListDcDevicesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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

