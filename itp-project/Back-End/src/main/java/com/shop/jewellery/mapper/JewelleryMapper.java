package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.Jewellery;
import com.shop.jewellery.entity.JewelleryCategory;
import com.shop.jewellery.model.request.jewellery.JewelleryRequest;
import com.shop.jewellery.model.request.jewelleryCategory.JewelleryCategoryRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = {CategoryMapper.class, JewelleryMapper.class, SupplierMapper.class, JewelleryCategoryMapper.class})
public interface JewelleryMapper {
    Jewellery toEntity(Jewellery jewellery);

//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    Jewellery partialUpdate(Jewellery jewellery, @MappingTarget Jewellery jewellery);

    JewelleryCategory toEntity(JewelleryCategoryRequest jewelleryCategoryRequest);

    JewelleryCategoryRequest toDto(JewelleryCategory jewelleryCategory);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    JewelleryCategory partialUpdate(JewelleryCategoryRequest jewelleryCategoryRequest, @MappingTarget JewelleryCategory jewelleryCategory);

    Jewellery toEntity(JewelleryRequest jewelleryRequest);

    @AfterMapping
    default void linkJewelleryCategories(@MappingTarget Jewellery jewellery) {
        jewellery.getJewelleryCategories().forEach(jewelleryCategory -> jewelleryCategory.setJewellery(jewellery));
    }

    JewelleryRequest toDto(Jewellery jewellery);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Jewellery partialUpdate(JewelleryRequest jewelleryRequest, @MappingTarget Jewellery jewellery);

//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    Jewellery partialUpdate(Jewellery jewellery, @MappingTarget Jewellery jewellery);
}