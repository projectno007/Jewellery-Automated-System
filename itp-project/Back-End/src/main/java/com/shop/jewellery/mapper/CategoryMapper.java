package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.Category;
import com.shop.jewellery.model.request.category.CategoryRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CategoryMapper {
    Category toEntity(CategoryRequest categoryRequest);

    CategoryRequest toDto(Category category);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Category partialUpdate(CategoryRequest categoryRequest, @MappingTarget Category category);

    Category toEntity(Category category);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Category partialUpdate(Category category, @MappingTarget Category category);
}