package org.yeetong.rpc.service.api.todo;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.yeetong.rcp.api.interfaces.todo.TdPlanRpcService;
import org.yeetong.rcp.api.model.todo.TdPlanModel;
import org.yeetong.rpc.service.api.BaseRpcService;
import org.yeetong.rpc.service.model.TdPlan;
import org.yeetong.rpc.service.service.TdPlanService;

import com.github.pagehelper.PageHelper;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example.Criteria;

@MotanService
public class TdPlanRpcServiceImpl extends BaseRpcService<TdPlanModel, TdPlan> implements TdPlanRpcService {

	@Resource
	TdPlanService tdPlanService;

	@Override
	public int save(TdPlanModel model) {
		return tdPlanService.save(this.copyModel(model));
	}

	@Override
	public int save(List<TdPlanModel> models) {
		return tdPlanService.save(this.copyModelList(models));
	}

	@Override
	public int deleteById(Long id) {
		return tdPlanService.deleteById(id);
	}

	@Override
	public int deleteByIds(String ids) {
		return tdPlanService.deleteByIds(ids);
	}

	@Override
	public int update(TdPlanModel model) {
		return tdPlanService.update(this.copyModel(model));
	}

	@Override
	public TdPlanModel findById(Long id) {
		return this.copyEntity(tdPlanService.findById(id));
	}

	@Override
	public TdPlanModel findBy(String fieldName, Object value) {
		return this.copyEntity(tdPlanService.findBy(fieldName, value));
	}

	@Override
	public List<TdPlanModel> findByIds(String ids) {
		return this.copyVOList(tdPlanService.findByIds(ids));
	}

	@Override
	public int selectCount(TdPlanModel record) {
		return tdPlanService.selectCount(this.copyModel(record));
	}

	@Override
	public List<TdPlanModel> findByPage(int page, int size, Map<String, Object> param) {
		Condition condition = new Condition(TdPlan.class);
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
		List<TdPlan> list = tdPlanService.findByCondition(condition);
		return this.copyVOList(list);
	}

}
