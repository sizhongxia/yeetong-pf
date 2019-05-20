package org.yeetong.rcp.api.model.todo;

import java.io.Serializable;
import java.util.Date;

public class TdUserLikeModel implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 最后修改时间
	 */
	private Date clickAt;

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
	 * @param userId
	 *            用户ID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 获取最后修改时间
	 *
	 * @return click_at - 最后修改时间
	 */
	public Date getClickAt() {
		return clickAt;
	}

	/**
	 * 设置最后修改时间
	 *
	 * @param clickAt
	 *            最后修改时间
	 */
	public void setClickAt(Date clickAt) {
		this.clickAt = clickAt;
	}
}