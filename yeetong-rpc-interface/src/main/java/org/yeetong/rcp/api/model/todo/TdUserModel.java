package org.yeetong.rcp.api.model.todo;

import java.io.Serializable;
import java.util.Date;

public class TdUserModel implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 记录ID
	 */
	private String userId;

	/**
	 * 微信昵称
	 */
	private String nickName;

	/**
	 * 用户头像
	 */
	private String headImgUrl;

	/**
	 * 性别
	 */
	private String wxGender;

	/**
	 * 城市
	 */
	private String wxCity;

	/**
	 * 省份
	 */
	private String wxProvince;

	/**
	 * 国家
	 */
	private String wxCountry;

	/**
	 * 删除标识
	 */
	private String deleteFlag;

	/**
	 * 记录版本
	 */
	private Integer version;

	/**
	 * 创建时间
	 */
	private Date createAt;

	/**
	 * 最后修改时间
	 */
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
	 * @param id
	 *            主键
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取记录ID
	 *
	 * @return user_id - 记录ID
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 设置记录ID
	 *
	 * @param userId
	 *            记录ID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 获取微信昵称
	 *
	 * @return nick_name - 微信昵称
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * 设置微信昵称
	 *
	 * @param nickName
	 *            微信昵称
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * 获取用户头像
	 *
	 * @return head_img_url - 用户头像
	 */
	public String getHeadImgUrl() {
		return headImgUrl;
	}

	/**
	 * 设置用户头像
	 *
	 * @param headImgUrl
	 *            用户头像
	 */
	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}

	/**
	 * 获取性别
	 *
	 * @return wx_gender - 性别
	 */
	public String getWxGender() {
		return wxGender;
	}

	/**
	 * 设置性别
	 *
	 * @param wxGender
	 *            性别
	 */
	public void setWxGender(String wxGender) {
		this.wxGender = wxGender;
	}

	/**
	 * 获取城市
	 *
	 * @return wx_city - 城市
	 */
	public String getWxCity() {
		return wxCity;
	}

	/**
	 * 设置城市
	 *
	 * @param wxCity
	 *            城市
	 */
	public void setWxCity(String wxCity) {
		this.wxCity = wxCity;
	}

	/**
	 * 获取省份
	 *
	 * @return wx_province - 省份
	 */
	public String getWxProvince() {
		return wxProvince;
	}

	/**
	 * 设置省份
	 *
	 * @param wxProvince
	 *            省份
	 */
	public void setWxProvince(String wxProvince) {
		this.wxProvince = wxProvince;
	}

	/**
	 * 获取国家
	 *
	 * @return wx_country - 国家
	 */
	public String getWxCountry() {
		return wxCountry;
	}

	/**
	 * 设置国家
	 *
	 * @param wxCountry
	 *            国家
	 */
	public void setWxCountry(String wxCountry) {
		this.wxCountry = wxCountry;
	}

	/**
	 * 获取删除标识
	 *
	 * @return delete_flag - 删除标识
	 */
	public String getDeleteFlag() {
		return deleteFlag;
	}

	/**
	 * 设置删除标识
	 *
	 * @param deleteFlag
	 *            删除标识
	 */
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/**
	 * 获取记录版本
	 *
	 * @return version - 记录版本
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * 设置记录版本
	 *
	 * @param version
	 *            记录版本
	 */
	public void setVersion(Integer version) {
		this.version = version;
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
	 * @param createAt
	 *            创建时间
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
	 * @param updateAt
	 *            最后修改时间
	 */
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
}