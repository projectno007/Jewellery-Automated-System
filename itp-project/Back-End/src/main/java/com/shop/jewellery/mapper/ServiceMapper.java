package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.Service;
import com.shop.jewellery.model.request.service.ServiceRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ServiceMapper {
    @Mapping(source = "customerTelephone", target = "customer.telephone")
    @Mapping(source = "customerLastName", target = "customer.lastName")
    @Mapping(source = "customerFirstName", target = "customer.firstName")
    @Mapping(source = "customerName", target = "customer.name")
    @Mapping(source = "customerId", target = "customer.id")
    Service toEntity(ServiceRequest serviceRequest);

    @InheritInverseConfiguration(name = "toEntity")
    ServiceRequest toDto(Service service);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Service partialUpdate(ServiceRequest serviceRequest, @MappingTarget Service service);
}