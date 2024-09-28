package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.Sellable;
import com.shop.jewellery.model.request.sellable.SellableRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = {SupplierMapper.class})
public interface SellableMapper {
    @Mapping(source = "customerId", target = "customer.id")
    Sellable toEntity(SellableRequest sellableRequest);

    @Mapping(source = "customer.id", target = "customerId")
    SellableRequest toDto(Sellable sellable);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(source = "customerId", target = "customer.id")
    Sellable partialUpdate(SellableRequest sellableRequest, @MappingTarget Sellable sellable);
}