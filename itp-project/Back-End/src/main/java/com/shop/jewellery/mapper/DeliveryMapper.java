package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.Delivery;
import com.shop.jewellery.model.request.delivery.DeliveryRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DeliveryMapper {
    @Mapping(source = "customerName", target = "customer.name")
    @Mapping(source = "customerId", target = "customer.id")
    Delivery toEntity(DeliveryRequest deliveryRequest);

    @InheritInverseConfiguration(name = "toEntity")
    DeliveryRequest toDto(Delivery delivery);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Delivery partialUpdate(DeliveryRequest deliveryRequest, @MappingTarget Delivery delivery);
}