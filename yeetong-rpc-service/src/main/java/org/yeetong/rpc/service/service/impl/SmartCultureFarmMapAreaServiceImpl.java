package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.zn.SmartCultureFarmMapAreaMapper;
import org.yeetong.rpc.service.model.SmartCultureFarmMapArea;
import org.yeetong.rpc.service.service.SmartCultureFarmMapAreaService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("znTransationManager")
public class SmartCultureFarmMapAreaServiceImpl extends AbstractService<SmartCultureFarmMapArea> implements SmartCultureFarmMapAreaService {
    @Resource
    private SmartCultureFarmMapAreaMapper smartCultureFarmMapAreaMapper;

}
