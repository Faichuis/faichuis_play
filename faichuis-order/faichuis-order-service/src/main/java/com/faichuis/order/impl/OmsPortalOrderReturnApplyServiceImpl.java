package com.faichuis.order.impl;

import com.faichuis.faichuismall.mapper.OmsOrderReturnApplyMapper;
import com.faichuis.faichuismall.model.OmsOrderReturnApply;
import com.faichuis.order.IOmsOrderReturnApplyDomainService;
import com.faichuis.order.OmsPortalOrderReturnApplyService;
import com.faichuis.order.response.OmsOrderReturnApplyParam;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 订单退货管理Service实现类
 * Created by macro on 2018/10/17.
 */
@Service
public class OmsPortalOrderReturnApplyServiceImpl implements OmsPortalOrderReturnApplyService {
    @Autowired
    private IOmsOrderReturnApplyDomainService returnApplyMapper;
    @Override
    public int create(OmsOrderReturnApplyParam returnApply) {
        OmsOrderReturnApply realApply = new OmsOrderReturnApply();
        BeanUtils.copyProperties(returnApply,realApply);
        realApply.setCreateTime(new Date());
        realApply.setStatus(0);
        return returnApplyMapper.insert();
    }
}
