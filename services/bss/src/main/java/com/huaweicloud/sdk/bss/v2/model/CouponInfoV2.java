package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CouponInfoV2
 */
public class CouponInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_id")

    private String couponId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_code")

    private String couponCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_type")

    private Integer couponType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_value")

    private Double faceValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_name")

    private String planName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_desc")

    private String planDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_limits")

    private List<LimitInfoV2> useLimits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_time")

    private String activeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_used_time")

    private String lastUsedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_version")

    private Integer couponVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "balance")

    private Double balance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_by_order_id")

    private String usedByOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_usage")

    private String couponUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_group")

    private Integer couponGroup;

    public CouponInfoV2 withCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }

    /**
     * 优惠券实例ID。
     * @return couponId
     */
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public CouponInfoV2 withCouponCode(String couponCode) {
        this.couponCode = couponCode;
        return this;
    }

    /**
     * 优惠券编码。
     * @return couponCode
     */
    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public CouponInfoV2 withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 优惠券状态： 1：未激活2：待使用
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public CouponInfoV2 withCouponType(Integer couponType) {
        this.couponType = couponType;
        return this;
    }

    /**
     * 优惠券类型。 1：代金券2：折扣券3：产品券4：现金券
     * @return couponType
     */
    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public CouponInfoV2 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 面额单位： 1：元。
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public CouponInfoV2 withFaceValue(Double faceValue) {
        this.faceValue = faceValue;
        return this;
    }

    /**
     * 面值。
     * @return faceValue
     */
    public Double getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(Double faceValue) {
        this.faceValue = faceValue;
    }

    public CouponInfoV2 withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * 生效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public CouponInfoV2 withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 失效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public CouponInfoV2 withPlanName(String planName) {
        this.planName = planName;
        return this;
    }

    /**
     * 促销计划名称。
     * @return planName
     */
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public CouponInfoV2 withPlanDesc(String planDesc) {
        this.planDesc = planDesc;
        return this;
    }

    /**
     * 促销计划描述。
     * @return planDesc
     */
    public String getPlanDesc() {
        return planDesc;
    }

    public void setPlanDesc(String planDesc) {
        this.planDesc = planDesc;
    }

    public CouponInfoV2 withUseLimits(List<LimitInfoV2> useLimits) {
        this.useLimits = useLimits;
        return this;
    }

    public CouponInfoV2 addUseLimitsItem(LimitInfoV2 useLimitsItem) {
        if (this.useLimits == null) {
            this.useLimits = new ArrayList<>();
        }
        this.useLimits.add(useLimitsItem);
        return this;
    }

    public CouponInfoV2 withUseLimits(Consumer<List<LimitInfoV2>> useLimitsSetter) {
        if (this.useLimits == null) {
            this.useLimits = new ArrayList<>();
        }
        useLimitsSetter.accept(this.useLimits);
        return this;
    }

    /**
     * 优惠券限制。 具体请参见表3。
     * @return useLimits
     */
    public List<LimitInfoV2> getUseLimits() {
        return useLimits;
    }

    public void setUseLimits(List<LimitInfoV2> useLimits) {
        this.useLimits = useLimits;
    }

    public CouponInfoV2 withActiveTime(String activeTime) {
        this.activeTime = activeTime;
        return this;
    }

    /**
     * 激活时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * @return activeTime
     */
    public String getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
    }

    public CouponInfoV2 withLastUsedTime(String lastUsedTime) {
        this.lastUsedTime = lastUsedTime;
        return this;
    }

    /**
     * 上一次使用时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * @return lastUsedTime
     */
    public String getLastUsedTime() {
        return lastUsedTime;
    }

    public void setLastUsedTime(String lastUsedTime) {
        this.lastUsedTime = lastUsedTime;
    }

    public CouponInfoV2 withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CouponInfoV2 withCouponVersion(Integer couponVersion) {
        this.couponVersion = couponVersion;
        return this;
    }

    /**
     * 优惠券版本。 1：老版本（包含三种：代金券、折扣券和奖金券）2：新版本（只有代金券）
     * @return couponVersion
     */
    public Integer getCouponVersion() {
        return couponVersion;
    }

    public void setCouponVersion(Integer couponVersion) {
        this.couponVersion = couponVersion;
    }

    public CouponInfoV2 withBalance(Double balance) {
        this.balance = balance;
        return this;
    }

    /**
     * 余额。
     * @return balance
     */
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public CouponInfoV2 withUsedByOrderId(String usedByOrderId) {
        this.usedByOrderId = usedByOrderId;
        return this;
    }

    /**
     * 使用优惠券的订单ID。表示有订单正在使用这个优惠券，优惠券已被锁定，只有锁定优惠券的订单才能使用这个优惠券，其他订单不能使用该优惠券。
     * @return usedByOrderId
     */
    public String getUsedByOrderId() {
        return usedByOrderId;
    }

    public void setUsedByOrderId(String usedByOrderId) {
        this.usedByOrderId = usedByOrderId;
    }

    public CouponInfoV2 withCouponUsage(String couponUsage) {
        this.couponUsage = couponUsage;
        return this;
    }

    /**
     * 优惠券用途。
     * @return couponUsage
     */
    public String getCouponUsage() {
        return couponUsage;
    }

    public void setCouponUsage(String couponUsage) {
        this.couponUsage = couponUsage;
    }

    public CouponInfoV2 withCouponGroup(Integer couponGroup) {
        this.couponGroup = couponGroup;
        return this;
    }

    /**
     * 优惠券分组。 1：云商店发放的券2：华为云券-1024-专用代金券3：华为云券-使用限制-抵扣硬件的券0：华为云服务券（排除上述取值之外的券）
     * @return couponGroup
     */
    public Integer getCouponGroup() {
        return couponGroup;
    }

    public void setCouponGroup(Integer couponGroup) {
        this.couponGroup = couponGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CouponInfoV2 couponInfoV2 = (CouponInfoV2) o;
        return Objects.equals(this.couponId, couponInfoV2.couponId)
            && Objects.equals(this.couponCode, couponInfoV2.couponCode)
            && Objects.equals(this.status, couponInfoV2.status)
            && Objects.equals(this.couponType, couponInfoV2.couponType)
            && Objects.equals(this.measureId, couponInfoV2.measureId)
            && Objects.equals(this.faceValue, couponInfoV2.faceValue)
            && Objects.equals(this.effectiveTime, couponInfoV2.effectiveTime)
            && Objects.equals(this.expireTime, couponInfoV2.expireTime)
            && Objects.equals(this.planName, couponInfoV2.planName)
            && Objects.equals(this.planDesc, couponInfoV2.planDesc)
            && Objects.equals(this.useLimits, couponInfoV2.useLimits)
            && Objects.equals(this.activeTime, couponInfoV2.activeTime)
            && Objects.equals(this.lastUsedTime, couponInfoV2.lastUsedTime)
            && Objects.equals(this.createTime, couponInfoV2.createTime)
            && Objects.equals(this.couponVersion, couponInfoV2.couponVersion)
            && Objects.equals(this.balance, couponInfoV2.balance)
            && Objects.equals(this.usedByOrderId, couponInfoV2.usedByOrderId)
            && Objects.equals(this.couponUsage, couponInfoV2.couponUsage)
            && Objects.equals(this.couponGroup, couponInfoV2.couponGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couponId,
            couponCode,
            status,
            couponType,
            measureId,
            faceValue,
            effectiveTime,
            expireTime,
            planName,
            planDesc,
            useLimits,
            activeTime,
            lastUsedTime,
            createTime,
            couponVersion,
            balance,
            usedByOrderId,
            couponUsage,
            couponGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CouponInfoV2 {\n");
        sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
        sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    couponType: ").append(toIndentedString(couponType)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    faceValue: ").append(toIndentedString(faceValue)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
        sb.append("    planDesc: ").append(toIndentedString(planDesc)).append("\n");
        sb.append("    useLimits: ").append(toIndentedString(useLimits)).append("\n");
        sb.append("    activeTime: ").append(toIndentedString(activeTime)).append("\n");
        sb.append("    lastUsedTime: ").append(toIndentedString(lastUsedTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    couponVersion: ").append(toIndentedString(couponVersion)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    usedByOrderId: ").append(toIndentedString(usedByOrderId)).append("\n");
        sb.append("    couponUsage: ").append(toIndentedString(couponUsage)).append("\n");
        sb.append("    couponGroup: ").append(toIndentedString(couponGroup)).append("\n");
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
