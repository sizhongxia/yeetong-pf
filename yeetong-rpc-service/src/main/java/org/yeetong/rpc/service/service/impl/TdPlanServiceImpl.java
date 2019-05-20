package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.todo.TdPlanMapper;
import org.yeetong.rpc.service.model.TdPlan;
import org.yeetong.rpc.service.service.TdPlanService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("todoTransationManager")
public class TdPlanServiceImpl extends AbstractService<TdPlan> implements TdPlanService {
    @Resource
    private TdPlanMapper tdPlanMapper;

}
