package com.faichuis.faichuismall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.faichuis.faichuismall.entity.OmsOrderItemDO;

public interface OmsOrderItemMapper extends BaseMapper<OmsOrderItemDO> {

    Integer batchInsert();

}