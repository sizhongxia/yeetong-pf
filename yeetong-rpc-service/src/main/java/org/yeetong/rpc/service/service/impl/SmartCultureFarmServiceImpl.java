package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.zn.SmartCultureFarmMapper;
import org.yeetong.rpc.service.model.SmartCultureFarm;
import org.yeetong.rpc.service.service.SmartCultureFarmService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("znTransationManager")
public class SmartCultureFarmServiceImpl extends AbstractService<SmartCultureFarm> implements SmartCultureFarmService {
    @Resource
    private SmartCultureFarmMapper smartCultureFarmMapper;

}
