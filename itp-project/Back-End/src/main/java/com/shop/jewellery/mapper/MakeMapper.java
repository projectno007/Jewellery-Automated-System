package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.Make;
import com.shop.jewellery.model.request.make.MakeRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface MakeMapper {
    @Mapping(source = "designPrice", target = "design.price")
    @Mapping(source = "designImageUrl", target = "design.imageUrl")
    @Mapping(source = "designDescription", target = "design.description")
    @Mapping(source = "designName", target = "design.name")
    @Mapping(source = "designUpdatedAt", target = "design.updatedAt")
    @Mapping(source = "designCreatedAt", target = "design.createdAt")
    @Mapping(source = "designId", target = "design.id")
    @Mapping(source = "customerProfilePicture", target = "customer.profilePicture")
    @Mapping(source = "customerPWord", target = "customer.PWord")
    @Mapping(source = "customerNIC", target = "customer.NIC")
    @Mapping(source = "customerAddress", target = "customer.address")
    @Mapping(source = "customerTelephone", target = "customer.telephone")
    @Mapping(source = "customerLastName", target = "customer.lastName")
    @Mapping(source = "customerFirstName", target = "customer.firstName")
    @Mapping(source = "customerName", target = "customer.name")
    @Mapping(source = "customerId", target = "customer.id")
    Make toEntity(MakeRequest makeRequest);

    @InheritInverseConfiguration(name = "toEntity")
    MakeRequest toDto(Make make);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Make partialUpdate(MakeRequest makeRequest, @MappingTarget Make make);
}