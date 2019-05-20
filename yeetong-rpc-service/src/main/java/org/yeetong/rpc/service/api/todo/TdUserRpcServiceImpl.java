package org.yeetong.rpc.service.api.todo;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.yeetong.rcp.api.interfaces.todo.TdUserRpcService;
import org.yeetong.rcp.api.model.todo.TdUserModel;
import org.yeetong.rpc.service.api.BaseRpcService;
import org.yeetong.rpc.service.model.TdUser;
import org.yeetong.rpc.service.service.TdUserService;

import com.github.pagehelper.PageHelper;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example.Criteria;

@MotanService
public class TdUserRpcServiceImpl extends BaseRpcService<TdUserModel, TdUser> implements TdUserRpcService {

	@Resource
	TdUserService tdUserService;

	@Override
	public int save(TdUserModel model) {
		return tdUserService.save(this.copyModel(model));
	}

	@Override
	public int save(List<TdUserModel> models) {
		return tdUserService.save(this.copyModelList(models));
	}

	@Override
	public int deleteById(Long id) {
		return tdUserService.deleteById(id);
	}

	@Override
	public int deleteByIds(String ids) {
		return tdUserService.deleteByIds(ids);
	}

	@Override
	public int update(TdUserModel model) {
		return tdUserService.update(this.copyModel(model));
	}

	@Override
	public TdUserModel findById(Long id) {
		return this.copyEntity(tdUserService.findById(id));
	}

	@Override
	public TdUserModel findBy(String fieldName, Object value) {
		return this.copyEntity(tdUserService.findBy(fieldName, value));
	}

	@Override
	public List<TdUserModel> findByIds(String ids) {
		return this.copyVOList(tdUserService.findByIds(ids));
	}

	@Override
	public List<TdUserModel> findByPage(int page, int size, Map<String, Object> param) {
		Condition condition = new Condition(TdUser.class);
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
		List<TdUser> list = tdUserService.findByCondition(condition);
		return this.copyVOList(list);
	}

	@Override
	public int selectCount(TdUserModel record) {
		return tdUserService.selectCount(this.copyModel(record));
	}

}
