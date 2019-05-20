package org.yeetong.rpc.service.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "smart_culture_equipment_outline_res")
public class SmartCultureEquipmentOutlineRes {
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
     * 设备ID
     */
    @Column(name = "equipment_id")
    private String equipmentId;

    /**
     * 类型（上线ONLINE/离线OUTLINE）
     */
    private String type;

    /**
     * 变更时间
     */
    @Column(name = "alter_time")
    private Date alterTime;

    /**
     * 创建时间
     */
    @Column(name = "create_at")
    private Date createAt;

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
     * 获取类型（上线ONLINE/离线OUTLINE）
     *
     * @return type - 类型（上线ONLINE/离线OUTLINE）
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型（上线ONLINE/离线OUTLINE）
     *
     * @param type 类型（上线ONLINE/离线OUTLINE）
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取变更时间
     *
     * @return alter_time - 变更时间
     */
    public Date getAlterTime() {
        return alterTime;
    }

    /**
     * 设置变更时间
     *
     * @param alterTime 变更时间
     */
    public void setAlterTime(Date alterTime) {
        this.alterTime = alterTime;
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
}