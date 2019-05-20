package org.yeetong.rpc.service.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "smart_culture_farm_raise_apply")
public class SmartCultureFarmRaiseApply {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 主键
     */
    @Column(name = "res_id")
    private String resId;

    /**
     * 申请用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 申请内容
     */
    @Column(name = "apply_content")
    private String applyContent;

    /**
     * 创建时间
     */
    @Column(name = "create_at")
    private Date createAt;

    /**
     * 最后修改时间
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
     * 获取主键
     *
     * @return res_id - 主键
     */
    public String getResId() {
        return resId;
    }

    /**
     * 设置主键
     *
     * @param resId 主键
     */
    public void setResId(String resId) {
        this.resId = resId;
    }

    /**
     * 获取申请用户ID
     *
     * @return user_id - 申请用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置申请用户ID
     *
     * @param userId 申请用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取申请内容
     *
     * @return apply_content - 申请内容
     */
    public String getApplyContent() {
        return applyContent;
    }

    /**
     * 设置申请内容
     *
     * @param applyContent 申请内容
     */
    public void setApplyContent(String applyContent) {
        this.applyContent = applyContent;
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