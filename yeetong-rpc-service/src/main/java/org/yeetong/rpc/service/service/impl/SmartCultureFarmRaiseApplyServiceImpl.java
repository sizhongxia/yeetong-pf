package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.zn.SmartCultureFarmRaiseApplyMapper;
import org.yeetong.rpc.service.model.SmartCultureFarmRaiseApply;
import org.yeetong.rpc.service.service.SmartCultureFarmRaiseApplyService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("znTransationManager")
public class SmartCultureFarmRaiseApplyServiceImpl extends AbstractService<SmartCultureFarmRaiseApply> implements SmartCultureFarmRaiseApplyService {
    @Resource
    private SmartCultureFarmRaiseApplyMapper smartCultureFarmRaiseApplyMapper;

}
