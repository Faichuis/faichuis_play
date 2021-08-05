package com.faichuis.order.impl;

import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import com.faichuis.faichuismall.entity.OmsOrderItemDO;
import com.faichuis.faichuismall.mapper.OmsOrderItemMapper;
import com.faichuis.order.IOmsOrderItemDomainService;
import com.faichuis.order.converter.OmsOrderItemDomainConverter;
import com.faichuis.order.domain.OmsOrderItemDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OmsOrderItemDomainServiceImpl implements IOmsOrderItemDomainService {

    @Autowired
    private OmsOrderItemMapper omsOrderItemMapper;
    @Autowired
    private OmsOrderItemDomainConverter omsOrderItemDomainConverter;



    @Override
    public Boolean batchInsert() {
        return SqlHelper.retBool(1);
    }

    @Override
    public OmsOrderItemDomain queryById(Long id) {

        OmsOrderItemDO omsOrderItem = omsOrderItemMapper.selectById(id);
        return  omsOrderItemDomainConverter.toDomain(omsOrderItem);
    }
}
