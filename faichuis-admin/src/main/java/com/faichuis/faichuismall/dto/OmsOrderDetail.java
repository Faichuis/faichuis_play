package com.faichuis.faichuismall.dto;

import com.faichuis.faichuismall.model.OmsOrder;
import com.faichuis.faichuismall.model.OmsOrderItem;
import com.faichuis.faichuismall.model.OmsOrderOperateHistory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单详情信息
 * Created on 2018/10/11.
 */
public class OmsOrderDetail extends OmsOrder {
    @Getter
    @Setter
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    private List<OmsOrderOperateHistory> historyList;
}
