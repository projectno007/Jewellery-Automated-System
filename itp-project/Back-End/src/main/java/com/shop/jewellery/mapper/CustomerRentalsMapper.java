package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.CustomerRentals;
import com.shop.jewellery.model.request.customerRental.CustomerRentalsRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = {CustomerMapper.class, RentalMapper.class})
public interface CustomerRentalsMapper {
    CustomerRentals toEntity(CustomerRentalsRequest customerRentalsRequest);

    CustomerRentalsRequest toDto(CustomerRentals customerRentals);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    CustomerRentals partialUpdate(CustomerRentalsRequest customerRentalsRequest, @MappingTarget CustomerRentals customerRentals);
}