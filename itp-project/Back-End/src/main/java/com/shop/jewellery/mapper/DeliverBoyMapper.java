package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.DeliverBoy;
import com.shop.jewellery.model.request.deliveryBoy.DeliverBoyRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DeliverBoyMapper {
    DeliverBoy toEntity(DeliverBoyRequest deliverBoyRequest);

    DeliverBoyRequest toDto(DeliverBoy deliverBoy);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    DeliverBoy partialUpdate(DeliverBoyRequest deliverBoyRequest, @MappingTarget DeliverBoy deliverBoy);
}