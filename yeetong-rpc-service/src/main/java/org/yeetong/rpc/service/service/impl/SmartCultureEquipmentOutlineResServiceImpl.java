package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.zn.SmartCultureEquipmentOutlineResMapper;
import org.yeetong.rpc.service.model.SmartCultureEquipmentOutlineRes;
import org.yeetong.rpc.service.service.SmartCultureEquipmentOutlineResService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("znTransationManager")
public class SmartCultureEquipmentOutlineResServiceImpl extends AbstractService<SmartCultureEquipmentOutlineRes> implements SmartCultureEquipmentOutlineResService {
    @Resource
    private SmartCultureEquipmentOutlineResMapper smartCultureEquipmentOutlineResMapper;

}
