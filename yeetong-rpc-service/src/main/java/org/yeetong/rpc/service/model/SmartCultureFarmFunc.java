package org.yeetong.rpc.service.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "smart_culture_farm_func")
public class SmartCultureFarmFunc {
    /**
     * 主键ID
     */
    @Id
    private Long id;

    /**
     * 记录ID
     */
    @Column(name = "res_id")
    private String resId;

    /**
     * 农场ID
     */
    @Column(name = "farm_id")
    private String farmId;

    /**
     * 功能ID
     */
    @Column(name = "func_id")
    private String funcId;

    /**
     * 平台类型（字典：func_platform_classify）
     */
    @Column(name = "platform_type")
    private String platformType;

    /**
     * 平台功能ID
     */
    @Column(name = "func_platform_id")
    private String funcPlatformId;

    /**
     * 获得方式
     */
    @Column(name = "gain_type")
    private String gainType;

    /**
     * 获得说明
     */
    @Column(name = "gain_illustrate")
    private String gainIllustrate;

    /**
     * 购买订单ID
     */
    @Column(name = "buy_order_id")
    private String buyOrderId;

    /**
     * 可用状态
     */
    @Column(name = "func_use_state")
    private String funcUseState;

    /**
     * 是否为长期有效（永久）
     */
    @Column(name = "func_is_long_term")
    private String funcIsLongTerm;

    /**
     * 功能使用到期时间
     */
    @Column(name = "func_expiration_time")
    private Date funcExpirationTime;

    /**
     * 用户ID
     */
    @Column(name = "operator_id")
    private String operatorId;

    /**
     * 获得创建时间
     */
    @Column(name = "create_at")
    private Date createAt;

    /**
     * 最后修改时间
     */
    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取记录ID
     *
     * @return res_id - 记录ID
     */
    public String getResId() {
        return resId;
    }

    /**
     * 设置记录ID
     *
     * @param resId 记录ID
     */
    public void setResId(String resId) {
        this.resId = resId;
    }

    /**
     * 获取农场ID
     *
     * @return farm_id - 农场ID
     */
    public String getFarmId() {
        return farmId;
    }

    /**
     * 设置农场ID
     *
     * @param farmId 农场ID
     */
    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * 获取功能ID
     *
     * @return func_id - 功能ID
     */
    public String getFuncId() {
        return funcId;
    }

    /**
     * 设置功能ID
     *
     * @param funcId 功能ID
     */
    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    /**
     * 获取平台类型（字典：func_platform_classify）
     *
     * @return platform_type - 平台类型（字典：func_platform_classify）
     */
    public String getPlatformType() {
        return platformType;
    }

    /**
     * 设置平台类型（字典：func_platform_classify）
     *
     * @param platformType 平台类型（字典：func_platform_classify）
     */
    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    /**
     * 获取平台功能ID
     *
     * @return func_platform_id - 平台功能ID
     */
    public String getFuncPlatformId() {
        return funcPlatformId;
    }

    /**
     * 设置平台功能ID
     *
     * @param funcPlatformId 平台功能ID
     */
    public void setFuncPlatformId(String funcPlatformId) {
        this.funcPlatformId = funcPlatformId;
    }

    /**
     * 获取获得方式
     *
     * @return gain_type - 获得方式
     */
    public String getGainType() {
        return gainType;
    }

    /**
     * 设置获得方式
     *
     * @param gainType 获得方式
     */
    public void setGainType(String gainType) {
        this.gainType = gainType;
    }

    /**
     * 获取获得说明
     *
     * @return gain_illustrate - 获得说明
     */
    public String getGainIllustrate() {
        return gainIllustrate;
    }

    /**
     * 设置获得说明
     *
     * @param gainIllustrate 获得说明
     */
    public void setGainIllustrate(String gainIllustrate) {
        this.gainIllustrate = gainIllustrate;
    }

    /**
     * 获取购买订单ID
     *
     * @return buy_order_id - 购买订单ID
     */
    public String getBuyOrderId() {
        return buyOrderId;
    }

    /**
     * 设置购买订单ID
     *
     * @param buyOrderId 购买订单ID
     */
    public void setBuyOrderId(String buyOrderId) {
        this.buyOrderId = buyOrderId;
    }

    /**
     * 获取可用状态
     *
     * @return func_use_state - 可用状态
     */
    public String getFuncUseState() {
        return funcUseState;
    }

    /**
     * 设置可用状态
     *
     * @param funcUseState 可用状态
     */
    public void setFuncUseState(String funcUseState) {
        this.funcUseState = funcUseState;
    }

    /**
     * 获取是否为长期有效（永久）
     *
     * @return func_is_long_term - 是否为长期有效（永久）
     */
    public String getFuncIsLongTerm() {
        return funcIsLongTerm;
    }

    /**
     * 设置是否为长期有效（永久）
     *
     * @param funcIsLongTerm 是否为长期有效（永久）
     */
    public void setFuncIsLongTerm(String funcIsLongTerm) {
        this.funcIsLongTerm = funcIsLongTerm;
    }

    /**
     * 获取功能使用到期时间
     *
     * @return func_expiration_time - 功能使用到期时间
     */
    public Date getFuncExpirationTime() {
        return funcExpirationTime;
    }

    /**
     * 设置功能使用到期时间
     *
     * @param funcExpirationTime 功能使用到期时间
     */
    public void setFuncExpirationTime(Date funcExpirationTime) {
        this.funcExpirationTime = funcExpirationTime;
    }

    /**
     * 获取用户ID
     *
     * @return operator_id - 用户ID
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * 设置用户ID
     *
     * @param operatorId 用户ID
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 获取获得创建时间
     *
     * @return create_at - 获得创建时间
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 设置获得创建时间
     *
     * @param createAt 获得创建时间
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 获取最后修改时间
     *
     * @return update_at - 最后修改时间
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 设置最后修改时间
     *
     * @param updateAt 最后修改时间
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}