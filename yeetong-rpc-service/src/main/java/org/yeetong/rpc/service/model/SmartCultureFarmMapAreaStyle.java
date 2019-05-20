package org.yeetong.rpc.service.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "smart_culture_farm_map_area_style")
public class SmartCultureFarmMapAreaStyle {
    /**
     * 主键
     */
    @Id
    private Long id;

    @Column(name = "area_id")
    private String areaId;

    /**
     * 农场ID
     */
    @Column(name = "farm_id")
    private String farmId;

    @Column(name = "area_name")
    private String areaName;

    /**
     * 边框颜色
     */
    @Column(name = "border_color")
    private String borderColor;

    /**
     * 填充颜色
     */
    @Column(name = "fill_color")
    private String fillColor;

    /**
     * 填充透明度
     */
    @Column(name = "fill_opacity")
    private BigDecimal fillOpacity;

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
     * @return area_id
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * @param areaId
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId;
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
     * @return area_name
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * @param areaName
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * 获取边框颜色
     *
     * @return border_color - 边框颜色
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * 设置边框颜色
     *
     * @param borderColor 边框颜色
     */
    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    /**
     * 获取填充颜色
     *
     * @return fill_color - 填充颜色
     */
    public String getFillColor() {
        return fillColor;
    }

    /**
     * 设置填充颜色
     *
     * @param fillColor 填充颜色
     */
    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    /**
     * 获取填充透明度
     *
     * @return fill_opacity - 填充透明度
     */
    public BigDecimal getFillOpacity() {
        return fillOpacity;
    }

    /**
     * 设置填充透明度
     *
     * @param fillOpacity 填充透明度
     */
    public void setFillOpacity(BigDecimal fillOpacity) {
        this.fillOpacity = fillOpacity;
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