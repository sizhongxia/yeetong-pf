package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.todo.TdUserMapper;
import org.yeetong.rpc.service.model.TdUser;
import org.yeetong.rpc.service.service.TdUserService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("todoTransationManager")
public class TdUserServiceImpl extends AbstractService<TdUser> implements TdUserService {
    @Resource
    private TdUserMapper tdUserMapper;

}
