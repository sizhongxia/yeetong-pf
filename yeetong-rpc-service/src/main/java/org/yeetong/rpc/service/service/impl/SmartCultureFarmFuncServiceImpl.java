package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.zn.SmartCultureFarmFuncMapper;
import org.yeetong.rpc.service.model.SmartCultureFarmFunc;
import org.yeetong.rpc.service.service.SmartCultureFarmFuncService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("znTransationManager")
public class SmartCultureFarmFuncServiceImpl extends AbstractService<SmartCultureFarmFunc> implements SmartCultureFarmFuncService {
    @Resource
    private SmartCultureFarmFuncMapper smartCultureFarmFuncMapper;

}
