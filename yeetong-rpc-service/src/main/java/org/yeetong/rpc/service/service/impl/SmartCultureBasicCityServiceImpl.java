package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.zn.SmartCultureBasicCityMapper;
import org.yeetong.rpc.service.model.SmartCultureBasicCity;
import org.yeetong.rpc.service.service.SmartCultureBasicCityService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("znTransationManager")
public class SmartCultureBasicCityServiceImpl extends AbstractService<SmartCultureBasicCity> implements SmartCultureBasicCityService {
    @Resource
    private SmartCultureBasicCityMapper smartCultureBasicCityMapper;

}
