package org.yeetong.rpc.service.api.todo;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.yeetong.rcp.api.interfaces.todo.TdUserLikeRpcService;
import org.yeetong.rcp.api.model.todo.TdUserLikeModel;
import org.yeetong.rpc.service.api.BaseRpcService;
import org.yeetong.rpc.service.model.TdUserLike;
import org.yeetong.rpc.service.service.TdUserLikeService;

import com.github.pagehelper.PageHelper;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example.Criteria;

@MotanService
public class TdUserLikeRpcServiceImpl extends BaseRpcService<TdUserLikeModel, TdUserLike> implements TdUserLikeRpcService {

	@Resource
	TdUserLikeService tdUserLikeService;

	@Override
	public int save(TdUserLikeModel model) {
		return tdUserLikeService.save(this.copyModel(model));
	}

	@Override
	public int save(List<TdUserLikeModel> models) {
		return tdUserLikeService.save(this.copyModelList(models));
	}

	@Override
	public int deleteById(Long id) {
		return tdUserLikeService.deleteById(id);
	}

	@Override
	public int deleteByIds(String ids) {
		return tdUserLikeService.deleteByIds(ids);
	}

	@Override
	public int update(TdUserLikeModel model) {
		return tdUserLikeService.update(this.copyModel(model));
	}

	@Override
	public TdUserLikeModel findById(Long id) {
		return this.copyEntity(tdUserLikeService.findById(id));
	}

	@Override
	public TdUserLikeModel findBy(String fieldName, Object value) {
		return this.copyEntity(tdUserLikeService.findBy(fieldName, value));
	}

	@Override
	public List<TdUserLikeModel> findByIds(String ids) {
		return this.copyVOList(tdUserLikeService.findByIds(ids));
	}

	@Override
	public List<TdUserLikeModel> findByPage(int page, int size, Map<String, Object> param) {
		Condition condition = new Condition(TdUserLike.class);
		Criteria criteria = condition.createCriteria();
		if (param != null && !param.isEmpty()) {
			for (String key : param.keySet()) {
				if (param.get(key) != null) {
					if (param.get(key) instanceof String) {
						if (param.get(key).toString().contains("%")) {
							criteria.andLike(key, param.get(key).toString());
						} else {
							criteria.andEqualTo(key, param.get(key));
						}
					} else {
						criteria.andEqualTo(key, param.get(key));
					}
				}
			}
		}
		PageHelper.startPage(page, size, false);
		List<TdUserLike> list = tdUserLikeService.findByCondition(condition);
		return this.copyVOList(list);
	}

	@Override
	public int selectCount(TdUserLikeModel record) {
		return tdUserLikeService.selectCount(this.copyModel(record));
	}

}
