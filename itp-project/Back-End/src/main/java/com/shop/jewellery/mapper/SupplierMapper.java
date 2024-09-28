package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.Supplier;
import com.shop.jewellery.model.request.supplier.SupplierRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface SupplierMapper {
    Supplier toEntity(SupplierRequest supplierRequest);

    SupplierRequest toDto(Supplier supplier);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Supplier partialUpdate(SupplierRequest supplierRequest, @MappingTarget Supplier supplier);

    Supplier toEntity(Supplier supplier);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Supplier partialUpdate(Supplier supplier, @MappingTarget Supplier supplier);
}