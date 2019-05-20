package org.yeetong.rpc.service.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "smart_culture_alarm_conf")
public class SmartCultureAlarmConf {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 告警配置项ID
     */
    @Column(name = "conf_id")
    private String confId;

    /**
     * 设备
     */
    @Column(name = "equipment_id")
    private String equipmentId;

    /**
     * 设备类型
     */
    @Column(name = "equipment_type_id")
    private String equipmentTypeId;

    /**
     * 报警项 记录是温度，湿度 或其他
     */
    @Column(name = "alarm_term")
    private String alarmTerm;

    /**
     * 告警值
     */
    @Column(name = "monitor_alarm_value")
    private Double monitorAlarmValue;

    /**
     * 操作符，大于，小于，大于等于，小于等于
     */
    @Column(name = "operational_character")
    private String operationalCharacter;

    /**
     * 推送用户多个用户用&隔开 最多推送5个人
     */
    @Column(name = "push_person")
    private String pushPerson;

    /**
     * 推送方式 多种方式用&隔开  0公众号 1短信 2语音
     */
    @Column(name = "push_type")
    private String pushType;

    /**
     * 推送时间间隔（单位：分钟） 防止有报警一直推送
     */
    @Column(name = "push_interval")
    private Integer pushInterval;

    /**
     * 监控状态（0:不生效，1:生效）
     */
    @Column(name = "monitor_state")
    private Integer monitorState;

    /**
     * 创建时间
     */
    @Column(name = "create_at")
    private Date createAt;

    /**
     * 修改时间
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
     * 获取设备
     *
     * @return equipment_id - 设备
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * 设置设备
     *
     * @param equipmentId 设备
     */
    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    /**
     * 获取设备类型
     *
     * @return equipment_type_id - 设备类型
     */
    public String getEquipmentTypeId() {
        return equipmentTypeId;
    }

    /**
     * 设置设备类型
     *
     * @param equipmentTypeId 设备类型
     */
    public void setEquipmentTypeId(String equipmentTypeId) {
        this.equipmentTypeId = equipmentTypeId;
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
     * 获取操作符，大于，小于，大于等于，小于等于
     *
     * @return operational_character - 操作符，大于，小于，大于等于，小于等于
     */
    public String getOperationalCharacter() {
        return operationalCharacter;
    }

    /**
     * 设置操作符，大于，小于，大于等于，小于等于
     *
     * @param operationalCharacter 操作符，大于，小于，大于等于，小于等于
     */
    public void setOperationalCharacter(String operationalCharacter) {
        this.operationalCharacter = operationalCharacter;
    }

    /**
     * 获取推送用户多个用户用&隔开 最多推送5个人
     *
     * @return push_person - 推送用户多个用户用&隔开 最多推送5个人
     */
    public String getPushPerson() {
        return pushPerson;
    }

    /**
     * 设置推送用户多个用户用&隔开 最多推送5个人
     *
     * @param pushPerson 推送用户多个用户用&隔开 最多推送5个人
     */
    public void setPushPerson(String pushPerson) {
        this.pushPerson = pushPerson;
    }

    /**
     * 获取推送方式 多种方式用&隔开  0公众号 1短信 2语音
     *
     * @return push_type - 推送方式 多种方式用&隔开  0公众号 1短信 2语音
     */
    public String getPushType() {
        return pushType;
    }

    /**
     * 设置推送方式 多种方式用&隔开  0公众号 1短信 2语音
     *
     * @param pushType 推送方式 多种方式用&隔开  0公众号 1短信 2语音
     */
    public void setPushType(String pushType) {
        this.pushType = pushType;
    }

    /**
     * 获取推送时间间隔（单位：分钟） 防止有报警一直推送
     *
     * @return push_interval - 推送时间间隔（单位：分钟） 防止有报警一直推送
     */
    public Integer getPushInterval() {
        return pushInterval;
    }

    /**
     * 设置推送时间间隔（单位：分钟） 防止有报警一直推送
     *
     * @param pushInterval 推送时间间隔（单位：分钟） 防止有报警一直推送
     */
    public void setPushInterval(Integer pushInterval) {
        this.pushInterval = pushInterval;
    }

    /**
     * 获取监控状态（0:不生效，1:生效）
     *
     * @return monitor_state - 监控状态（0:不生效，1:生效）
     */
    public Integer getMonitorState() {
        return monitorState;
    }

    /**
     * 设置监控状态（0:不生效，1:生效）
     *
     * @param monitorState 监控状态（0:不生效，1:生效）
     */
    public void setMonitorState(Integer monitorState) {
        this.monitorState = monitorState;
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
     * 获取修改时间
     *
     * @return update_at - 修改时间
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 设置修改时间
     *
     * @param updateAt 修改时间
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}