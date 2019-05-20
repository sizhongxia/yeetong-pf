package org.yeetong.rpc.service.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "smart_culture_client_activation")
public class SmartCultureClientActivation {
    @Id
    private Long id;

    /**
     * 激活码
     */
    @Column(name = "activation_id")
    private String activationId;

    /**
     * 农场编号
     */
    @Column(name = "farm_id")
    private String farmId;

    /**
     * 农场名称
     */
    @Column(name = "farm_name")
    private String farmName;

    /**
     * 设备类型 1视频推拉流
     */
    @Column(name = "client_type")
    private String clientType;

    /**
     * 激活状态（0：未激活，1：已激活）
     */
    @Column(name = "activation_status")
    private Integer activationStatus;

    /**
     * 激活时间
     */
    @Column(name = "activation_date")
    private Date activationDate;

    /**
     * 激活电脑mac地址
     */
    @Column(name = "win_mac")
    private String winMac;

    /**
     * 更换电脑次数
     */
    @Column(name = "change_count")
    private Integer changeCount;

    /**
     * 连接字符串被更新时的时间
     */
    @Column(name = "remote_time")
    private Date remoteTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 最后一次更新的时间 可以判断客户端是否在线
     */
    @Column(name = "last_time")
    private Date lastTime;

    /**
     * 创建时间
     */
    @Column(name = "create_at")
    private Date createAt;

    /**
     * 记录更新时间
     */
    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 客户端连接字符串
     */
    @Column(name = "remote_connection_str")
    private String remoteConnectionStr;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取激活码
     *
     * @return activation_id - 激活码
     */
    public String getActivationId() {
        return activationId;
    }

    /**
     * 设置激活码
     *
     * @param activationId 激活码
     */
    public void setActivationId(String activationId) {
        this.activationId = activationId;
    }

    /**
     * 获取农场编号
     *
     * @return farm_id - 农场编号
     */
    public String getFarmId() {
        return farmId;
    }

    /**
     * 设置农场编号
     *
     * @param farmId 农场编号
     */
    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * 获取农场名称
     *
     * @return farm_name - 农场名称
     */
    public String getFarmName() {
        return farmName;
    }

    /**
     * 设置农场名称
     *
     * @param farmName 农场名称
     */
    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    /**
     * 获取设备类型 1视频推拉流
     *
     * @return client_type - 设备类型 1视频推拉流
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * 设置设备类型 1视频推拉流
     *
     * @param clientType 设备类型 1视频推拉流
     */
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    /**
     * 获取激活状态（0：未激活，1：已激活）
     *
     * @return activation_status - 激活状态（0：未激活，1：已激活）
     */
    public Integer getActivationStatus() {
        return activationStatus;
    }

    /**
     * 设置激活状态（0：未激活，1：已激活）
     *
     * @param activationStatus 激活状态（0：未激活，1：已激活）
     */
    public void setActivationStatus(Integer activationStatus) {
        this.activationStatus = activationStatus;
    }

    /**
     * 获取激活时间
     *
     * @return activation_date - 激活时间
     */
    public Date getActivationDate() {
        return activationDate;
    }

    /**
     * 设置激活时间
     *
     * @param activationDate 激活时间
     */
    public void setActivationDate(Date activationDate) {
        this.activationDate = activationDate;
    }

    /**
     * 获取激活电脑mac地址
     *
     * @return win_mac - 激活电脑mac地址
     */
    public String getWinMac() {
        return winMac;
    }

    /**
     * 设置激活电脑mac地址
     *
     * @param winMac 激活电脑mac地址
     */
    public void setWinMac(String winMac) {
        this.winMac = winMac;
    }

    /**
     * 获取更换电脑次数
     *
     * @return change_count - 更换电脑次数
     */
    public Integer getChangeCount() {
        return changeCount;
    }

    /**
     * 设置更换电脑次数
     *
     * @param changeCount 更换电脑次数
     */
    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    /**
     * 获取连接字符串被更新时的时间
     *
     * @return remote_time - 连接字符串被更新时的时间
     */
    public Date getRemoteTime() {
        return remoteTime;
    }

    /**
     * 设置连接字符串被更新时的时间
     *
     * @param remoteTime 连接字符串被更新时的时间
     */
    public void setRemoteTime(Date remoteTime) {
        this.remoteTime = remoteTime;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取最后一次更新的时间 可以判断客户端是否在线
     *
     * @return last_time - 最后一次更新的时间 可以判断客户端是否在线
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * 设置最后一次更新的时间 可以判断客户端是否在线
     *
     * @param lastTime 最后一次更新的时间 可以判断客户端是否在线
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * 获取创建时间
     *
     * @return create_at - 创建时间
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 设置创建时间
     *
     * @param createAt 创建时间
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 获取记录更新时间
     *
     * @return update_at - 记录更新时间
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 设置记录更新时间
     *
     * @param updateAt 记录更新时间
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * 获取客户端连接字符串
     *
     * @return remote_connection_str - 客户端连接字符串
     */
    public String getRemoteConnectionStr() {
        return remoteConnectionStr;
    }

    /**
     * 设置客户端连接字符串
     *
     * @param remoteConnectionStr 客户端连接字符串
     */
    public void setRemoteConnectionStr(String remoteConnectionStr) {
        this.remoteConnectionStr = remoteConnectionStr;
    }
}