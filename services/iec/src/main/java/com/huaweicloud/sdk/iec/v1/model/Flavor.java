package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Flavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk")

    private String disk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private Integer ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private String vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_extra_specs")

    private OsExtraSpecs osExtraSpecs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_flavor_access_is_public")

    private Boolean osFlavorAccessIsPublic;

    public Flavor withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 边缘实例规格的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Flavor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 边缘实例规格的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flavor withDisk(String disk) {
        this.disk = disk;
        return this;
    }

    /**
     * 边缘实例规格对应要求系统盘大小。  当前未使用该参数，缺省值为0。
     * @return disk
     */
    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public Flavor withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 边缘实例规格对应的内存大小，单位为MB。
     * @return ram
     */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Flavor withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * 边缘实例规格对应的CPU核数。
     * @return vcpus
     */
    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public Flavor withOsExtraSpecs(OsExtraSpecs osExtraSpecs) {
        this.osExtraSpecs = osExtraSpecs;
        return this;
    }

    public Flavor withOsExtraSpecs(Consumer<OsExtraSpecs> osExtraSpecsSetter) {
        if (this.osExtraSpecs == null) {
            this.osExtraSpecs = new OsExtraSpecs();
            osExtraSpecsSetter.accept(this.osExtraSpecs);
        }

        return this;
    }

    /**
     * Get osExtraSpecs
     * @return osExtraSpecs
     */
    public OsExtraSpecs getOsExtraSpecs() {
        return osExtraSpecs;
    }

    public void setOsExtraSpecs(OsExtraSpecs osExtraSpecs) {
        this.osExtraSpecs = osExtraSpecs;
    }

    public Flavor withOsFlavorAccessIsPublic(Boolean osFlavorAccessIsPublic) {
        this.osFlavorAccessIsPublic = osFlavorAccessIsPublic;
        return this;
    }

    /**
     * 扩展属性，flavor是否给所有租户使用。
     * @return osFlavorAccessIsPublic
     */
    public Boolean getOsFlavorAccessIsPublic() {
        return osFlavorAccessIsPublic;
    }

    public void setOsFlavorAccessIsPublic(Boolean osFlavorAccessIsPublic) {
        this.osFlavorAccessIsPublic = osFlavorAccessIsPublic;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Flavor flavor = (Flavor) o;
        return Objects.equals(this.id, flavor.id) && Objects.equals(this.name, flavor.name)
            && Objects.equals(this.disk, flavor.disk) && Objects.equals(this.ram, flavor.ram)
            && Objects.equals(this.vcpus, flavor.vcpus) && Objects.equals(this.osExtraSpecs, flavor.osExtraSpecs)
            && Objects.equals(this.osFlavorAccessIsPublic, flavor.osFlavorAccessIsPublic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, disk, ram, vcpus, osExtraSpecs, osFlavorAccessIsPublic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Flavor {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    osExtraSpecs: ").append(toIndentedString(osExtraSpecs)).append("\n");
        sb.append("    osFlavorAccessIsPublic: ").append(toIndentedString(osFlavorAccessIsPublic)).append("\n");
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
