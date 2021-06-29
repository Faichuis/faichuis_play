package com.faichuis.faichuismall.service;


import com.faichuis.faichuismall.domain.OmsOrderReturnApplyParam;

/**
 * 订单退货管理Service
 * Created by macro on 2018/10/17.
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
