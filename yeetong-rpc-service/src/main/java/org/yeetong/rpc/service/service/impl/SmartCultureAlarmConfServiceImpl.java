package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.zn.SmartCultureAlarmConfMapper;
import org.yeetong.rpc.service.model.SmartCultureAlarmConf;
import org.yeetong.rpc.service.service.SmartCultureAlarmConfService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("znTransationManager")
public class SmartCultureAlarmConfServiceImpl extends AbstractService<SmartCultureAlarmConf> implements SmartCultureAlarmConfService {
    @Resource
    private SmartCultureAlarmConfMapper smartCultureAlarmConfMapper;

}
