package org.yeetong.rpc.service.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "smart_culture_equipment_outline_receive")
public class SmartCultureEquipmentOutlineReceive {
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
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 设备ID
     */
    @Column(name = "equipment_id")
    private String equipmentId;

    /**
     * 是否接收离线/在线通知标识
     */
    @Column(name = "receive_flag")
    private String receiveFlag;

    /**
     * 创建时间
     */
    @Column(name = "create_at")
    private Date createAt;

    /**
     * 最后更新时间
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
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取设备ID
     *
     * @return equipment_id - 设备ID
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * 设置设备ID
     *
     * @param equipmentId 设备ID
     */
    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    /**
     * 获取是否接收离线/在线通知标识
     *
     * @return receive_flag - 是否接收离线/在线通知标识
     */
    public String getReceiveFlag() {
        return receiveFlag;
    }

    /**
     * 设置是否接收离线/在线通知标识
     *
     * @param receiveFlag 是否接收离线/在线通知标识
     */
    public void setReceiveFlag(String receiveFlag) {
        this.receiveFlag = receiveFlag;
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
     * 获取最后更新时间
     *
     * @return update_at - 最后更新时间
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 设置最后更新时间
     *
     * @param updateAt 最后更新时间
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}