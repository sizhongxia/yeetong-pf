package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.zn.SmartCultureFeedMapper;
import org.yeetong.rpc.service.model.SmartCultureFeed;
import org.yeetong.rpc.service.service.SmartCultureFeedService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("znTransationManager")
public class SmartCultureFeedServiceImpl extends AbstractService<SmartCultureFeed> implements SmartCultureFeedService {
    @Resource
    private SmartCultureFeedMapper smartCultureFeedMapper;

}
