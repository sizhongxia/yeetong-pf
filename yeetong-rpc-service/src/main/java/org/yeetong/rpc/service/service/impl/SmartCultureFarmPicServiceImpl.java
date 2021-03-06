package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.zn.SmartCultureFarmPicMapper;
import org.yeetong.rpc.service.model.SmartCultureFarmPic;
import org.yeetong.rpc.service.service.SmartCultureFarmPicService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("znTransationManager")
public class SmartCultureFarmPicServiceImpl extends AbstractService<SmartCultureFarmPic> implements SmartCultureFarmPicService {
    @Resource
    private SmartCultureFarmPicMapper smartCultureFarmPicMapper;

}
