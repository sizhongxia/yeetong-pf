package org.yeetong.rpc.service.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "smart_culture_farm_map_area")
public class SmartCultureFarmMapArea {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 农场ID
     */
    @Column(name = "farm_id")
    private String farmId;

    /**
     * 区域ID
     */
    @Column(name = "area_id")
    private String areaId;

    /**
     * 排序
     */
    @Column(name = "sort_no")
    private Integer sortNo;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 纬度
     */
    private BigDecimal latitude;

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
     * 获取区域ID
     *
     * @return area_id - 区域ID
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * 设置区域ID
     *
     * @param areaId 区域ID
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    /**
     * 获取排序
     *
     * @return sort_no - 排序
     */
    public Integer getSortNo() {
        return sortNo;
    }

    /**
     * 设置排序
     *
     * @param sortNo 排序
     */
    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
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