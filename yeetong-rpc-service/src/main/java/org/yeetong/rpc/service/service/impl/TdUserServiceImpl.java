package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.yeetongdb.TdUserMapper;
import org.yeetong.rpc.service.model.TdUser;
import org.yeetong.rpc.service.service.TdUserService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/15.
 */
@Service
@Transactional("yeetongdbTransationManager")
public class TdUserServiceImpl extends AbstractService<TdUser> implements TdUserService {
    @Resource
    private TdUserMapper tdUserMapper;

}
