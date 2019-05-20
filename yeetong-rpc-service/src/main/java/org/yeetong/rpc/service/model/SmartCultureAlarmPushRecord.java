package org.yeetong.rpc.service.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "smart_culture_alarm_push_record")
public class SmartCultureAlarmPushRecord {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 记录唯一ID
     */
    @Column(name = "res_id")
    private String resId;

    /**
     * 告警配置项ID
     */
    @Column(name = "conf_id")
    private String confId;

    /**
     * 农场ID
     */
    @Column(name = "farm_id")
    private String farmId;

    /**
     * 设备ID
     */
    @Column(name = "equipment_id")
    private String equipmentId;

    /**
     * 设备类型
     */
    @Column(name = "equipment_type")
    private String equipmentType;

    /**
     * 报警项 记录是温度，湿度 或其他
     */
    @Column(name = "alarm_term")
    private String alarmTerm;

    /**
     * 实时值
     */
    @Column(name = "current_value")
    private Double currentValue;

    /**
     * 告警值
     */
    @Column(name = "monitor_alarm_value")
    private Double monitorAlarmValue;

    /**
     * 报警的时间
     */
    @Column(name = "alarm_at")
    private Date alarmAt;

    /**
     * 推送人
     */
    @Column(name = "push_person")
    private String pushPerson;

    /**
     * 推送方式 可能多个用&隔开 取值：0公众号 1短信 2语音
     */
    @Column(name = "push_type")
    private String pushType;

    /**
     * 推送状态（0：未推送，1：已推送）
     */
    @Column(name = "push_state")
    private Integer pushState;

    /**
     * 创建时间 也就是推送记录的时间
     */
    @Column(name = "create_at")
    private Date createAt;

    /**
     * 更新时间
     */
    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取记录唯一ID
     *
     * @return res_id - 记录唯一ID
     */
    public String getResId() {
        return resId;
    }

    /**
     * 设置记录唯一ID
     *
     * @param resId 记录唯一ID
     */
    public void setResId(String resId) {
        this.resId = resId;
    }

    /**
     * 获取告警配置项ID
     *
     * @return conf_id - 告警配置项ID
     */
    public String getConfId() {
        return confId;
    }

    /**
     * 设置告警配置项ID
     *
     * @param confId 告警配置项ID
     */
    public void setConfId(String confId) {
        this.confId = confId;
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
     * 获取设备类型
     *
     * @return equipment_type - 设备类型
     */
    public String getEquipmentType() {
        return equipmentType;
    }

    /**
     * 设置设备类型
     *
     * @param equipmentType 设备类型
     */
    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    /**
     * 获取报警项 记录是温度，湿度 或其他
     *
     * @return alarm_term - 报警项 记录是温度，湿度 或其他
     */
    public String getAlarmTerm() {
        return alarmTerm;
    }

    /**
     * 设置报警项 记录是温度，湿度 或其他
     *
     * @param alarmTerm 报警项 记录是温度，湿度 或其他
     */
    public void setAlarmTerm(String alarmTerm) {
        this.alarmTerm = alarmTerm;
    }

    /**
     * 获取实时值
     *
     * @return current_value - 实时值
     */
    public Double getCurrentValue() {
        return currentValue;
    }

    /**
     * 设置实时值
     *
     * @param currentValue 实时值
     */
    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }

    /**
     * 获取告警值
     *
     * @return monitor_alarm_value - 告警值
     */
    public Double getMonitorAlarmValue() {
        return monitorAlarmValue;
    }

    /**
     * 设置告警值
     *
     * @param monitorAlarmValue 告警值
     */
    public void setMonitorAlarmValue(Double monitorAlarmValue) {
        this.monitorAlarmValue = monitorAlarmValue;
    }

    /**
     * 获取报警的时间
     *
     * @return alarm_at - 报警的时间
     */
    public Date getAlarmAt() {
        return alarmAt;
    }

    /**
     * 设置报警的时间
     *
     * @param alarmAt 报警的时间
     */
    public void setAlarmAt(Date alarmAt) {
        this.alarmAt = alarmAt;
    }

    /**
     * 获取推送人
     *
     * @return push_person - 推送人
     */
    public String getPushPerson() {
        return pushPerson;
    }

    /**
     * 设置推送人
     *
     * @param pushPerson 推送人
     */
    public void setPushPerson(String pushPerson) {
        this.pushPerson = pushPerson;
    }

    /**
     * 获取推送方式 可能多个用&隔开 取值：0公众号 1短信 2语音
     *
     * @return push_type - 推送方式 可能多个用&隔开 取值：0公众号 1短信 2语音
     */
    public String getPushType() {
        return pushType;
    }

    /**
     * 设置推送方式 可能多个用&隔开 取值：0公众号 1短信 2语音
     *
     * @param pushType 推送方式 可能多个用&隔开 取值：0公众号 1短信 2语音
     */
    public void setPushType(String pushType) {
        this.pushType = pushType;
    }

    /**
     * 获取推送状态（0：未推送，1：已推送）
     *
     * @return push_state - 推送状态（0：未推送，1：已推送）
     */
    public Integer getPushState() {
        return pushState;
    }

    /**
     * 设置推送状态（0：未推送，1：已推送）
     *
     * @param pushState 推送状态（0：未推送，1：已推送）
     */
    public void setPushState(Integer pushState) {
        this.pushState = pushState;
    }

    /**
     * 获取创建时间 也就是推送记录的时间
     *
     * @return create_at - 创建时间 也就是推送记录的时间
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 设置创建时间 也就是推送记录的时间
     *
     * @param createAt 创建时间 也就是推送记录的时间
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 获取更新时间
     *
     * @return update_at - 更新时间
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 设置更新时间
     *
     * @param updateAt 更新时间
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}