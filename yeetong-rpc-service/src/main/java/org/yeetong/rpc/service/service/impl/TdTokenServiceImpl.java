package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.todo.TdTokenMapper;
import org.yeetong.rpc.service.model.TdToken;
import org.yeetong.rpc.service.service.TdTokenService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("todoTransationManager")
public class TdTokenServiceImpl extends AbstractService<TdToken> implements TdTokenService {
    @Resource
    private TdTokenMapper tdTokenMapper;

}
