package org.yeetong.rpc.service.service.impl;

import org.yeetong.rpc.service.dao.zn.SmartCultureEquipmentOutlineReceiveMapper;
import org.yeetong.rpc.service.model.SmartCultureEquipmentOutlineReceive;
import org.yeetong.rpc.service.service.SmartCultureEquipmentOutlineReceiveService;
import org.yeetong.rpc.service.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by SiZhongXia on 2019/05/20.
 */
@Service
@Transactional("znTransationManager")
public class SmartCultureEquipmentOutlineReceiveServiceImpl extends AbstractService<SmartCultureEquipmentOutlineReceive> implements SmartCultureEquipmentOutlineReceiveService {
    @Resource
    private SmartCultureEquipmentOutlineReceiveMapper smartCultureEquipmentOutlineReceiveMapper;

}
