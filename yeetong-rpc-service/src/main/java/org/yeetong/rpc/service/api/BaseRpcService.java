package org.yeetong.rpc.service.api;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

public class BaseRpcService<M, E> {

	private static final Logger log = LoggerFactory.getLogger(BaseRpcService.class);

	private Class<M> mClass;
	private Class<E> eClass;

	@SuppressWarnings("unchecked")
	public BaseRpcService() {
		mClass = (Class<M>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		eClass = (Class<E>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}

	protected List<E> copyModelList(List<M> mList) {
		if (CollectionUtils.isEmpty(mList)) {
			return null;
		}
		List<E> eList = new ArrayList<E>(mList.size());
		for (M m : mList) {
			eList.add(copyModel(m));
		}
		return eList;
	}

	protected List<M> copyVOList(List<E> eList) {
		if (CollectionUtils.isEmpty(eList)) {
			return null;
		}
		List<M> mList = new ArrayList<M>(eList.size());
		for (E e : eList) {
			mList.add(copyEntity(e));
		}
		return mList;
	}

	protected E copyModel(M m) {
		if (m == null) {
			return null;
		}
		E e = null;
		try {
			e = eClass.newInstance();
			BeanUtils.copyProperties(m, e);
		} catch (Exception err) {
			log.error("copyModel exception", err);
		}
		return e;
	}

	protected M copyEntity(E e) {
		if (e == null) {
			return null;
		}
		M m = null;
		try {
			m = mClass.newInstance();
			BeanUtils.copyProperties(e, m);
		} catch (Exception err) {
			log.error("copyModel exception", err);
		}
		return m;
	}
}
