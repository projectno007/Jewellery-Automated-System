package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.Customer;
import com.shop.jewellery.model.request.customer.CustomerRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CustomerMapper {
    Customer toEntity(CustomerRequest customerRequest);

    CustomerRequest toDto(Customer customer);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Customer partialUpdate(CustomerRequest customerRequest, @MappingTarget Customer customer);

    Customer toEntity(Customer customer);

//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    Customer partialUpdate(Customer customer, @MappingTarget Customer customer);
}