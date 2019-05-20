package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.zn.SmartCultureFarmAreaMapper;
import org.yeetong.rpc.service.model.SmartCultureFarmArea;
import org.yeetong.rpc.service.service.SmartCultureFarmAreaService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("znTransationManager")
public class SmartCultureFarmAreaServiceImpl extends AbstractService<SmartCultureFarmArea> implements SmartCultureFarmAreaService {
    @Resource
    private SmartCultureFarmAreaMapper smartCultureFarmAreaMapper;

}
