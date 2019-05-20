package org.yeetong.rpc.service.api.zn;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.yeetong.rcp.api.interfaces.zn.SmartCultureAlarmConfRpcService;
import org.yeetong.rcp.api.model.zn.SmartCultureAlarmConfModel;
import org.yeetong.rpc.service.api.BaseRpcService;
import org.yeetong.rpc.service.model.SmartCultureAlarmConf;
import org.yeetong.rpc.service.service.SmartCultureAlarmConfService;

import com.github.pagehelper.PageHelper;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example.Criteria;

@MotanService
public class SmartCultureAlarmConfRpcServiceImpl extends BaseRpcService<SmartCultureAlarmConfModel, SmartCultureAlarmConf> implements SmartCultureAlarmConfRpcService {

	@Resource
	SmartCultureAlarmConfService smartCultureAlarmConfService;

	@Override
	public int save(SmartCultureAlarmConfModel model) {
		return smartCultureAlarmConfService.save(this.copyModel(model));
	}

	@Override
	public int save(List<SmartCultureAlarmConfModel> models) {
		return smartCultureAlarmConfService.save(this.copyModelList(models));
	}

	@Override
	public int deleteById(Long id) {
		return smartCultureAlarmConfService.deleteById(id);
	}

	@Override
	public int deleteByIds(String ids) {
		return smartCultureAlarmConfService.deleteByIds(ids);
	}

	@Override
	public int update(SmartCultureAlarmConfModel model) {
		return smartCultureAlarmConfService.update(this.copyModel(model));
	}

	@Override
	public SmartCultureAlarmConfModel findById(Long id) {
		return this.copyEntity(smartCultureAlarmConfService.findById(id));
	}

	@Override
	public SmartCultureAlarmConfModel findBy(String fieldName, Object value) {
		return this.copyEntity(smartCultureAlarmConfService.findBy(fieldName, value));
	}

	@Override
	public List<SmartCultureAlarmConfModel> findByIds(String ids) {
		return this.copyVOList(smartCultureAlarmConfService.findByIds(ids));
	}

	@Override
	public int selectCount(SmartCultureAlarmConfModel record) {
		return smartCultureAlarmConfService.selectCount(this.copyModel(record));
	}

	@Override
	public List<SmartCultureAlarmConfModel> findByPage(int page, int size, Map<String, Object> param) {
		Condition condition = new Condition(SmartCultureAlarmConf.class);
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
		List<SmartCultureAlarmConf> list = smartCultureAlarmConfService.findByCondition(condition);
		return this.copyVOList(list);
	}

}
