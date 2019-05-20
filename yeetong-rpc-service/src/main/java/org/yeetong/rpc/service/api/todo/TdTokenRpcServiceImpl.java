package org.yeetong.rpc.service.api.todo;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.yeetong.rcp.api.interfaces.todo.TdTokenRpcService;
import org.yeetong.rcp.api.model.todo.TdTokenModel;
import org.yeetong.rpc.service.api.BaseRpcService;
import org.yeetong.rpc.service.model.TdToken;
import org.yeetong.rpc.service.service.TdTokenService;

import com.github.pagehelper.PageHelper;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example.Criteria;

@MotanService
public class TdTokenRpcServiceImpl extends BaseRpcService<TdTokenModel, TdToken> implements TdTokenRpcService {

	@Resource
	TdTokenService tdTokenService;

	@Override
	public int save(TdTokenModel model) {
		return tdTokenService.save(this.copyModel(model));
	}

	@Override
	public int save(List<TdTokenModel> models) {
		return tdTokenService.save(this.copyModelList(models));
	}

	@Override
	public int deleteById(Long id) {
		return tdTokenService.deleteById(id);
	}

	@Override
	public int deleteByIds(String ids) {
		return tdTokenService.deleteByIds(ids);
	}

	@Override
	public int update(TdTokenModel model) {
		return tdTokenService.update(this.copyModel(model));
	}

	@Override
	public TdTokenModel findById(Long id) {
		return this.copyEntity(tdTokenService.findById(id));
	}

	@Override
	public TdTokenModel findBy(String fieldName, Object value) {
		return this.copyEntity(tdTokenService.findBy(fieldName, value));
	}

	@Override
	public List<TdTokenModel> findByIds(String ids) {
		return this.copyVOList(tdTokenService.findByIds(ids));
	}

	@Override
	public List<TdTokenModel> findByPage(int page, int size, Map<String, Object> param) {
		Condition condition = new Condition(TdToken.class);
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
		List<TdToken> list = tdTokenService.findByCondition(condition);
		return this.copyVOList(list);
	}

	@Override
	public int selectCount(TdTokenModel record) {
		return tdTokenService.selectCount(this.copyModel(record));
	}

}
