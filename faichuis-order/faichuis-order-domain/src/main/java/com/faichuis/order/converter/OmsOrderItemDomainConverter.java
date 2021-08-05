package com.faichuis.order.converter;

import com.faichuis.faichuismall.common.converter.BaseDomainConverter;
import com.faichuis.faichuismall.entity.OmsOrderItemDO;
import com.faichuis.order.domain.OmsOrderItemDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OmsOrderItemDomainConverter extends BaseDomainConverter<OmsOrderItemDomain, OmsOrderItemDO> {

}
