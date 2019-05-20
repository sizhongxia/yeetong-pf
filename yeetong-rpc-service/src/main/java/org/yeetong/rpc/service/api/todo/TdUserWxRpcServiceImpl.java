package org.yeetong.rpc.service.api.todo;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.yeetong.rcp.api.interfaces.todo.TdUserWxRpcService;
import org.yeetong.rcp.api.model.todo.TdUserWxModel;
import org.yeetong.rpc.service.api.BaseRpcService;
import org.yeetong.rpc.service.model.TdUserWx;
import org.yeetong.rpc.service.service.TdUserWxService;

import com.github.pagehelper.PageHelper;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example.Criteria;

@MotanService
public class TdUserWxRpcServiceImpl extends BaseRpcService<TdUserWxModel, TdUserWx> implements TdUserWxRpcService {

	@Resource
	TdUserWxService tdUserWxService;

	@Override
	public int save(TdUserWxModel model) {
		return tdUserWxService.save(this.copyModel(model));
	}

	@Override
	public int save(List<TdUserWxModel> models) {
		return tdUserWxService.save(this.copyModelList(models));
	}

	@Override
	public int deleteById(Long id) {
		return tdUserWxService.deleteById(id);
	}

	@Override
	public int deleteByIds(String ids) {
		return tdUserWxService.deleteByIds(ids);
	}

	@Override
	public int update(TdUserWxModel model) {
		return tdUserWxService.update(this.copyModel(model));
	}

	@Override
	public TdUserWxModel findById(Long id) {
		return this.copyEntity(tdUserWxService.findById(id));
	}

	@Override
	public TdUserWxModel findBy(String fieldName, Object value) {
		return this.copyEntity(tdUserWxService.findBy(fieldName, value));
	}

	@Override
	public List<TdUserWxModel> findByIds(String ids) {
		return this.copyVOList(tdUserWxService.findByIds(ids));
	}

	@Override
	public List<TdUserWxModel> findByPage(int page, int size, Map<String, Object> param) {
		Condition condition = new Condition(TdUserWx.class);
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
		List<TdUserWx> list = tdUserWxService.findByCondition(condition);
		return this.copyVOList(list);
	}

	@Override
	public int selectCount(TdUserWxModel record) {
		return tdUserWxService.selectCount(this.copyModel(record));
	}

}
