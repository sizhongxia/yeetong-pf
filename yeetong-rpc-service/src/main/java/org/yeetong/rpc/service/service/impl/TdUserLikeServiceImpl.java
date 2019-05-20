package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.todo.TdUserLikeMapper;
import org.yeetong.rpc.service.model.TdUserLike;
import org.yeetong.rpc.service.service.TdUserLikeService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("todoTransationManager")
public class TdUserLikeServiceImpl extends AbstractService<TdUserLike> implements TdUserLikeService {
    @Resource
    private TdUserLikeMapper tdUserLikeMapper;

}
