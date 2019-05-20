package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.zn.SmartCultureFarmMapAreaStyleMapper;
import org.yeetong.rpc.service.model.SmartCultureFarmMapAreaStyle;
import org.yeetong.rpc.service.service.SmartCultureFarmMapAreaStyleService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("znTransationManager")
public class SmartCultureFarmMapAreaStyleServiceImpl extends AbstractService<SmartCultureFarmMapAreaStyle> implements SmartCultureFarmMapAreaStyleService {
    @Resource
    private SmartCultureFarmMapAreaStyleMapper smartCultureFarmMapAreaStyleMapper;

}
