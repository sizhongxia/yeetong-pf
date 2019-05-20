package org.yeetong.rpc.service.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "smart_culture_feed")
public class SmartCultureFeed {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 采集记录ID
     */
    @Column(name = "feed_id")
    private String feedId;

    /**
     * 所在农场
     */
    @Column(name = "farm_id")
    private String farmId;

    /**
     * 所在厂区
     */
    @Column(name = "farm_area_id")
    private String farmAreaId;

    /**
     * 投食位置
     */
    @Column(name = "feed_position")
    private String feedPosition;

    /**
     * 投食时间
     */
    @Column(name = "feed_at")
    private Date feedAt;

    /**
     * 投食饲养人
     */
    @Column(name = "feed_raiser")
    private String feedRaiser;

    /**
     * 投食内容备注
     */
    @Column(name = "feed_remark")
    private String feedRemark;

    /**
     * 封面图
     */
    @Column(name = "cover_pic_url")
    private String coverPicUrl;

    /**
     * 创建用户ID
     */
    @Column(name = "create_user_id")
    private String createUserId;

    /**
     * 创建时间
     */
    @Column(name = "create_at")
    private Date createAt;

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
     * 获取采集记录ID
     *
     * @return feed_id - 采集记录ID
     */
    public String getFeedId() {
        return feedId;
    }

    /**
     * 设置采集记录ID
     *
     * @param feedId 采集记录ID
     */
    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    /**
     * 获取所在农场
     *
     * @return farm_id - 所在农场
     */
    public String getFarmId() {
        return farmId;
    }

    /**
     * 设置所在农场
     *
     * @param farmId 所在农场
     */
    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * 获取所在厂区
     *
     * @return farm_area_id - 所在厂区
     */
    public String getFarmAreaId() {
        return farmAreaId;
    }

    /**
     * 设置所在厂区
     *
     * @param farmAreaId 所在厂区
     */
    public void setFarmAreaId(String farmAreaId) {
        this.farmAreaId = farmAreaId;
    }

    /**
     * 获取投食位置
     *
     * @return feed_position - 投食位置
     */
    public String getFeedPosition() {
        return feedPosition;
    }

    /**
     * 设置投食位置
     *
     * @param feedPosition 投食位置
     */
    public void setFeedPosition(String feedPosition) {
        this.feedPosition = feedPosition;
    }

    /**
     * 获取投食时间
     *
     * @return feed_at - 投食时间
     */
    public Date getFeedAt() {
        return feedAt;
    }

    /**
     * 设置投食时间
     *
     * @param feedAt 投食时间
     */
    public void setFeedAt(Date feedAt) {
        this.feedAt = feedAt;
    }

    /**
     * 获取投食饲养人
     *
     * @return feed_raiser - 投食饲养人
     */
    public String getFeedRaiser() {
        return feedRaiser;
    }

    /**
     * 设置投食饲养人
     *
     * @param feedRaiser 投食饲养人
     */
    public void setFeedRaiser(String feedRaiser) {
        this.feedRaiser = feedRaiser;
    }

    /**
     * 获取投食内容备注
     *
     * @return feed_remark - 投食内容备注
     */
    public String getFeedRemark() {
        return feedRemark;
    }

    /**
     * 设置投食内容备注
     *
     * @param feedRemark 投食内容备注
     */
    public void setFeedRemark(String feedRemark) {
        this.feedRemark = feedRemark;
    }

    /**
     * 获取封面图
     *
     * @return cover_pic_url - 封面图
     */
    public String getCoverPicUrl() {
        return coverPicUrl;
    }

    /**
     * 设置封面图
     *
     * @param coverPicUrl 封面图
     */
    public void setCoverPicUrl(String coverPicUrl) {
        this.coverPicUrl = coverPicUrl;
    }

    /**
     * 获取创建用户ID
     *
     * @return create_user_id - 创建用户ID
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建用户ID
     *
     * @param createUserId 创建用户ID
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
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