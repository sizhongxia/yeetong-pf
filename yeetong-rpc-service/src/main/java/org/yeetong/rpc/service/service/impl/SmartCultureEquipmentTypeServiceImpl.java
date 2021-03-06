package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.zn.SmartCultureEquipmentTypeMapper;
import org.yeetong.rpc.service.model.SmartCultureEquipmentType;
import org.yeetong.rpc.service.service.SmartCultureEquipmentTypeService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("znTransationManager")
public class SmartCultureEquipmentTypeServiceImpl extends AbstractService<SmartCultureEquipmentType> implements SmartCultureEquipmentTypeService {
    @Resource
    private SmartCultureEquipmentTypeMapper smartCultureEquipmentTypeMapper;

}
