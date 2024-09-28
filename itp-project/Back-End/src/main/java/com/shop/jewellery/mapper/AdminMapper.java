package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.Admin;
import com.shop.jewellery.model.request.admin.AdminRequest;
import com.shop.jewellery.model.response.admin.AdminResponse;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AdminMapper {
    Admin toEntity(AdminRequest adminRequest);

    AdminRequest toDto(Admin admin);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Admin partialUpdate(AdminRequest adminRequest, @MappingTarget Admin admin);

    Admin toEntity(AdminResponse adminResponse);

    AdminResponse toDto1(Admin admin);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Admin partialUpdate(AdminResponse adminResponse, @MappingTarget Admin admin);
}