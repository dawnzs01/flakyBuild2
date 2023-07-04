package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IQueryUserCouponsResultV2
 */
public class IQueryUserCouponsResultV2 {

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
    @JsonProperty(value = "customer_id")

    private String customerId;

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
    @JsonProperty(value = "valid_time")

    private String validTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_plan_id")

    private String promotionPlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_name")

    private String planName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_desc")

    private String planDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "media_type")

    private Integer mediaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fetch_method")

    private Integer fetchMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_limits")

    private List<ICouponUseLimitInfoV2> useLimits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_time")

    private String activeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserve_time")

    private String reserveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_id")

    private String promotionId;

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
    @JsonProperty(value = "lock_order_id")

    private String lockOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_usage")

    private String couponUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_frozen")

    private String isFrozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_param1")

    private String extendParam1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    public IQueryUserCouponsResultV2 withCouponId(String couponId) {
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

    public IQueryUserCouponsResultV2 withCouponCode(String couponCode) {
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

    public IQueryUserCouponsResultV2 withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 优惠券状态： 1：未激活2：待使用3：已使用4：已过期5：已回收
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public IQueryUserCouponsResultV2 withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 客户账号ID。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public IQueryUserCouponsResultV2 withCouponType(Integer couponType) {
        this.couponType = couponType;
        return this;
    }

    /**
     * 优惠券类型： 1：代金券2：折扣券（预留）3：产品券（预留）4：现金券（预留）
     * @return couponType
     */
    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public IQueryUserCouponsResultV2 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 度量单位。 1：元
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public IQueryUserCouponsResultV2 withFaceValue(Double faceValue) {
        this.faceValue = faceValue;
        return this;
    }

    /**
     * 优惠券金额。
     * @return faceValue
     */
    public Double getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(Double faceValue) {
        this.faceValue = faceValue;
    }

    public IQueryUserCouponsResultV2 withValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }

    /**
     * 生效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * @return validTime
     */
    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public IQueryUserCouponsResultV2 withExpireTime(String expireTime) {
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

    public IQueryUserCouponsResultV2 withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public IQueryUserCouponsResultV2 withPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
        return this;
    }

    /**
     * 促销计划ID。
     * @return promotionPlanId
     */
    public String getPromotionPlanId() {
        return promotionPlanId;
    }

    public void setPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
    }

    public IQueryUserCouponsResultV2 withPlanName(String planName) {
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

    public IQueryUserCouponsResultV2 withPlanDesc(String planDesc) {
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

    public IQueryUserCouponsResultV2 withMediaType(Integer mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * 介质类型。 1：电子券2：纸质券
     * @return mediaType
     */
    public Integer getMediaType() {
        return mediaType;
    }

    public void setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
    }

    public IQueryUserCouponsResultV2 withFetchMethod(Integer fetchMethod) {
        this.fetchMethod = fetchMethod;
        return this;
    }

    /**
     * 获取方式： 1：线上领取2：线上兑换3：线上发放4：线下获取5：事件赠送
     * @return fetchMethod
     */
    public Integer getFetchMethod() {
        return fetchMethod;
    }

    public void setFetchMethod(Integer fetchMethod) {
        this.fetchMethod = fetchMethod;
    }

    public IQueryUserCouponsResultV2 withUseLimits(List<ICouponUseLimitInfoV2> useLimits) {
        this.useLimits = useLimits;
        return this;
    }

    public IQueryUserCouponsResultV2 addUseLimitsItem(ICouponUseLimitInfoV2 useLimitsItem) {
        if (this.useLimits == null) {
            this.useLimits = new ArrayList<>();
        }
        this.useLimits.add(useLimitsItem);
        return this;
    }

    public IQueryUserCouponsResultV2 withUseLimits(Consumer<List<ICouponUseLimitInfoV2>> useLimitsSetter) {
        if (this.useLimits == null) {
            this.useLimits = new ArrayList<>();
        }
        useLimitsSetter.accept(this.useLimits);
        return this;
    }

    /**
     * 优惠券使用限制。 具体请参见表3。
     * @return useLimits
     */
    public List<ICouponUseLimitInfoV2> getUseLimits() {
        return useLimits;
    }

    public void setUseLimits(List<ICouponUseLimitInfoV2> useLimits) {
        this.useLimits = useLimits;
    }

    public IQueryUserCouponsResultV2 withActiveTime(String activeTime) {
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

    public IQueryUserCouponsResultV2 withReserveTime(String reserveTime) {
        this.reserveTime = reserveTime;
        return this;
    }

    /**
     * 使用时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * @return reserveTime
     */
    public String getReserveTime() {
        return reserveTime;
    }

    public void setReserveTime(String reserveTime) {
        this.reserveTime = reserveTime;
    }

    public IQueryUserCouponsResultV2 withPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }

    /**
     * 促销ID。
     * @return promotionId
     */
    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public IQueryUserCouponsResultV2 withCreateTime(String createTime) {
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

    public IQueryUserCouponsResultV2 withCouponVersion(Integer couponVersion) {
        this.couponVersion = couponVersion;
        return this;
    }

    /**
     * 优惠券版本： 1：老版本，老版本优惠券只能使用一次2：新版本，新版本优惠券可以反复使用
     * @return couponVersion
     */
    public Integer getCouponVersion() {
        return couponVersion;
    }

    public void setCouponVersion(Integer couponVersion) {
        this.couponVersion = couponVersion;
    }

    public IQueryUserCouponsResultV2 withBalance(Double balance) {
        this.balance = balance;
        return this;
    }

    /**
     * 优惠券余额。单位：元。 如果为老版本优惠券，该值为空。
     * @return balance
     */
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public IQueryUserCouponsResultV2 withLockOrderId(String lockOrderId) {
        this.lockOrderId = lockOrderId;
        return this;
    }

    /**
     * 锁定优惠券的订单ID。 如果为老版本优惠券，该值为空。
     * @return lockOrderId
     */
    public String getLockOrderId() {
        return lockOrderId;
    }

    public void setLockOrderId(String lockOrderId) {
        this.lockOrderId = lockOrderId;
    }

    public IQueryUserCouponsResultV2 withCouponUsage(String couponUsage) {
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

    public IQueryUserCouponsResultV2 withIsFrozen(String isFrozen) {
        this.isFrozen = isFrozen;
        return this;
    }

    /**
     * 优惠券是否冻结： 0：否1：是
     * @return isFrozen
     */
    public String getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(String isFrozen) {
        this.isFrozen = isFrozen;
    }

    public IQueryUserCouponsResultV2 withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 币种。 USD：美元
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public IQueryUserCouponsResultV2 withExtendParam1(String extendParam1) {
        this.extendParam1 = extendParam1;
        return this;
    }

    /**
     * 扩展字段。
     * @return extendParam1
     */
    public String getExtendParam1() {
        return extendParam1;
    }

    public void setExtendParam1(String extendParam1) {
        this.extendParam1 = extendParam1;
    }

    public IQueryUserCouponsResultV2 withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 发券来源。 如果是合作伙伴发送的券，此处为伙伴ID。如果是活动发券，此处为活动ID：云豆兑换优惠券：云豆计划ID累计送优惠券：累计送计划ID抽奖送优惠券：抽奖计划ID事件送优惠券：事件计划ID定制优惠券：创建人ID
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IQueryUserCouponsResultV2 iqueryUserCouponsResultV2 = (IQueryUserCouponsResultV2) o;
        return Objects.equals(this.couponId, iqueryUserCouponsResultV2.couponId)
            && Objects.equals(this.couponCode, iqueryUserCouponsResultV2.couponCode)
            && Objects.equals(this.status, iqueryUserCouponsResultV2.status)
            && Objects.equals(this.customerId, iqueryUserCouponsResultV2.customerId)
            && Objects.equals(this.couponType, iqueryUserCouponsResultV2.couponType)
            && Objects.equals(this.measureId, iqueryUserCouponsResultV2.measureId)
            && Objects.equals(this.faceValue, iqueryUserCouponsResultV2.faceValue)
            && Objects.equals(this.validTime, iqueryUserCouponsResultV2.validTime)
            && Objects.equals(this.expireTime, iqueryUserCouponsResultV2.expireTime)
            && Objects.equals(this.orderId, iqueryUserCouponsResultV2.orderId)
            && Objects.equals(this.promotionPlanId, iqueryUserCouponsResultV2.promotionPlanId)
            && Objects.equals(this.planName, iqueryUserCouponsResultV2.planName)
            && Objects.equals(this.planDesc, iqueryUserCouponsResultV2.planDesc)
            && Objects.equals(this.mediaType, iqueryUserCouponsResultV2.mediaType)
            && Objects.equals(this.fetchMethod, iqueryUserCouponsResultV2.fetchMethod)
            && Objects.equals(this.useLimits, iqueryUserCouponsResultV2.useLimits)
            && Objects.equals(this.activeTime, iqueryUserCouponsResultV2.activeTime)
            && Objects.equals(this.reserveTime, iqueryUserCouponsResultV2.reserveTime)
            && Objects.equals(this.promotionId, iqueryUserCouponsResultV2.promotionId)
            && Objects.equals(this.createTime, iqueryUserCouponsResultV2.createTime)
            && Objects.equals(this.couponVersion, iqueryUserCouponsResultV2.couponVersion)
            && Objects.equals(this.balance, iqueryUserCouponsResultV2.balance)
            && Objects.equals(this.lockOrderId, iqueryUserCouponsResultV2.lockOrderId)
            && Objects.equals(this.couponUsage, iqueryUserCouponsResultV2.couponUsage)
            && Objects.equals(this.isFrozen, iqueryUserCouponsResultV2.isFrozen)
            && Objects.equals(this.currency, iqueryUserCouponsResultV2.currency)
            && Objects.equals(this.extendParam1, iqueryUserCouponsResultV2.extendParam1)
            && Objects.equals(this.sourceId, iqueryUserCouponsResultV2.sourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couponId,
            couponCode,
            status,
            customerId,
            couponType,
            measureId,
            faceValue,
            validTime,
            expireTime,
            orderId,
            promotionPlanId,
            planName,
            planDesc,
            mediaType,
            fetchMethod,
            useLimits,
            activeTime,
            reserveTime,
            promotionId,
            createTime,
            couponVersion,
            balance,
            lockOrderId,
            couponUsage,
            isFrozen,
            currency,
            extendParam1,
            sourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IQueryUserCouponsResultV2 {\n");
        sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
        sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    couponType: ").append(toIndentedString(couponType)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    faceValue: ").append(toIndentedString(faceValue)).append("\n");
        sb.append("    validTime: ").append(toIndentedString(validTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    promotionPlanId: ").append(toIndentedString(promotionPlanId)).append("\n");
        sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
        sb.append("    planDesc: ").append(toIndentedString(planDesc)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("    fetchMethod: ").append(toIndentedString(fetchMethod)).append("\n");
        sb.append("    useLimits: ").append(toIndentedString(useLimits)).append("\n");
        sb.append("    activeTime: ").append(toIndentedString(activeTime)).append("\n");
        sb.append("    reserveTime: ").append(toIndentedString(reserveTime)).append("\n");
        sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    couponVersion: ").append(toIndentedString(couponVersion)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    lockOrderId: ").append(toIndentedString(lockOrderId)).append("\n");
        sb.append("    couponUsage: ").append(toIndentedString(couponUsage)).append("\n");
        sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    extendParam1: ").append(toIndentedString(extendParam1)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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
