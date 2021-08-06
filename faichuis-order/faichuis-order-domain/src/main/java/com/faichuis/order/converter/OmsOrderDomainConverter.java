package com.faichuis.order.converter;

import com.faichuis.faichuismall.common.converter.BaseDomainConverter;
import com.faichuis.faichuismall.entity.OmsOrderDO;
import com.faichuis.order.domain.OmsOrderDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OmsOrderDomainConverter extends BaseDomainConverter<OmsOrderDomain, OmsOrderDO> {

}
