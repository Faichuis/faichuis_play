package com.faichuis.faichuismall.service;

import com.faichuis.faichuismall.dto.OmsOrderReturnApplyResult;
import com.faichuis.faichuismall.dto.OmsReturnApplyQueryParam;
import com.faichuis.faichuismall.dto.OmsUpdateStatusParam;
import com.faichuis.faichuismall.model.OmsOrderReturnApply;

import java.util.List;

/**
 * 退货申请管理Service
 * Created on 2018/10/18.
 */
public interface OmsOrderReturnApplyService {
    /**
     * 分页查询申请
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量删除申请
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
