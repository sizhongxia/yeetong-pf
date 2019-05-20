package org.yeetong.rcp.api.interfaces;

import java.util.List;
import java.util.Map;

public interface BaseRpcService<T> {
	int save(T model);// 持久化

	int save(List<T> models);// 批量持久化

	int deleteById(Long id);// 通过主鍵刪除

	int deleteByIds(String ids);// 批量刪除 eg：ids -> “1,2,3,4”

	int update(T model);// 更新

	T findById(Long id);// 通过ID查找

	T findBy(String fieldName, Object value); // 通过Model中某个成员变量名称（非数据表中column的名称）查找,value需符合unique约束

	List<T> findByIds(String ids);// 通过多个ID查找//eg：ids -> “1,2,3,4”

	List<T> findByPage(int page, int size, Map<String, Object> param);

	int selectCount(T record);
}
