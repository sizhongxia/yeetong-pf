package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.zn.SmartCultureAlarmPushRecordMapper;
import org.yeetong.rpc.service.model.SmartCultureAlarmPushRecord;
import org.yeetong.rpc.service.service.SmartCultureAlarmPushRecordService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("znTransationManager")
public class SmartCultureAlarmPushRecordServiceImpl extends AbstractService<SmartCultureAlarmPushRecord> implements SmartCultureAlarmPushRecordService {
    @Resource
    private SmartCultureAlarmPushRecordMapper smartCultureAlarmPushRecordMapper;

}
