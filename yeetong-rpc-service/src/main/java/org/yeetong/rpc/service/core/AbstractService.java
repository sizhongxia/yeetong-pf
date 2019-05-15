package org.yeetong.rpc.service.core;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;

import tk.mybatis.mapper.entity.Condition;

/**
 * 基于通用MyBatis Mapper插件的Service接口的实现
 */
public abstract class AbstractService<T> implements Service<T> {

	@Autowired
	protected Mapper<T> mapper;

	private Class<T> modelClass; // 当前泛型真实类型的Class

	@SuppressWarnings("unchecked")
	public AbstractService() {
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		modelClass = (Class<T>) pt.getActualTypeArguments()[0];
	}

	public int save(T model) {
		return mapper.insertSelective(model);
	}

	public int save(List<T> models) {
		return mapper.insertList(models);
	}

	public int deleteById(Long id) {
		return mapper.deleteByPrimaryKey(id);
	}

	public int deleteByIds(String ids) {
		return mapper.deleteByIds(ids);
	}

	public int update(T model) {
		return mapper.updateByPrimaryKeySelective(model);
	}

	public T findById(Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public T findBy(String fieldName, Object value) throws TooManyResultsException {
		try {
			T model = modelClass.newInstance();
			Field field = modelClass.getDeclaredField(fieldName);
			field.setAccessible(true);
			field.set(model, value);
			return mapper.selectOne(model);
		} catch (ReflectiveOperationException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

	public List<T> findByIds(String ids) {
		return mapper.selectByIds(ids);
	}

	public List<T> findByCondition(Condition condition) {
		return mapper.selectByCondition(condition);
	}

	public List<T> findAll() {
		return mapper.selectAll();
	}

	public int selectCount(T record) {
		return mapper.selectCount(record);
	}
}
