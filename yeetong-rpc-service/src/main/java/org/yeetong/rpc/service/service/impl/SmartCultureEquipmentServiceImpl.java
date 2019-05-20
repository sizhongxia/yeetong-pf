package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.zn.SmartCultureEquipmentMapper;
import org.yeetong.rpc.service.model.SmartCultureEquipment;
import org.yeetong.rpc.service.service.SmartCultureEquipmentService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("znTransationManager")
public class SmartCultureEquipmentServiceImpl extends AbstractService<SmartCultureEquipment> implements SmartCultureEquipmentService {
    @Resource
    private SmartCultureEquipmentMapper smartCultureEquipmentMapper;

}
