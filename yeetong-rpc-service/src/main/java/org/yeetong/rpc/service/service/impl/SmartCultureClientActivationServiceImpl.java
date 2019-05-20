package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.zn.SmartCultureClientActivationMapper;
import org.yeetong.rpc.service.model.SmartCultureClientActivation;
import org.yeetong.rpc.service.service.SmartCultureClientActivationService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("znTransationManager")
public class SmartCultureClientActivationServiceImpl extends AbstractService<SmartCultureClientActivation> implements SmartCultureClientActivationService {
    @Resource
    private SmartCultureClientActivationMapper smartCultureClientActivationMapper;

}
