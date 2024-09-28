package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.JewelleryCategory;
import com.shop.jewellery.model.request.jewelleryCategory.JewelleryCategoryRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = {CategoryMapper.class, JewelleryMapper.class})
public interface JewelleryCategoryMapper {
    JewelleryCategory toEntity(JewelleryCategoryRequest jewelleryCategoryRequest);

    JewelleryCategoryRequest toDto(JewelleryCategory jewelleryCategory);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    JewelleryCategory partialUpdate(JewelleryCategoryRequest jewelleryCategoryRequest, @MappingTarget JewelleryCategory jewelleryCategory);

    JewelleryCategory toEntity(JewelleryCategory jewelleryCategory);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    JewelleryCategory partialUpdate(JewelleryCategory jewelleryCategory, @MappingTarget JewelleryCategory jewelleryCategory);
}