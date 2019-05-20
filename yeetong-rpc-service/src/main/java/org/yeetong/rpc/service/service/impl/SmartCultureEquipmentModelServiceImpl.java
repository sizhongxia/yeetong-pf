package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.zn.SmartCultureEquipmentModelMapper;
import org.yeetong.rpc.service.model.SmartCultureEquipmentModel;
import org.yeetong.rpc.service.service.SmartCultureEquipmentModelService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("znTransationManager")
public class SmartCultureEquipmentModelServiceImpl extends AbstractService<SmartCultureEquipmentModel> implements SmartCultureEquipmentModelService {
    @Resource
    private SmartCultureEquipmentModelMapper smartCultureEquipmentModelMapper;

}
