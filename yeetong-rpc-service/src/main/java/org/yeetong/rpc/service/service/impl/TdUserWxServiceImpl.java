package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.todo.TdUserWxMapper;
import org.yeetong.rpc.service.model.TdUserWx;
import org.yeetong.rpc.service.service.TdUserWxService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("todoTransationManager")
public class TdUserWxServiceImpl extends AbstractService<TdUserWx> implements TdUserWxService {
    @Resource
    private TdUserWxMapper tdUserWxMapper;

}
