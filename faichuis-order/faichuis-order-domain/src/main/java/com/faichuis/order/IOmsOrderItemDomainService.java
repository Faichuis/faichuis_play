package com.faichuis.order;

import com.faichuis.order.domain.OmsOrderDomain;
import com.faichuis.order.domain.OmsOrderItemDomain;

public interface IOmsOrderItemDomainService {

    /**
     * 批量添加
     * @return
     */
    Boolean batchInsert();

    OmsOrderItemDomain queryById(Long id);
}
