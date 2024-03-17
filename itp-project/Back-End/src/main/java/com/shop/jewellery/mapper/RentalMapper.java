package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.Rental;
import com.shop.jewellery.model.request.rental.RentalRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = {JewelleryMapper.class})
public interface RentalMapper {
    Rental toEntity(RentalRequest rentalRequest);

    RentalRequest toDto(Rental rental);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Rental partialUpdate(RentalRequest rentalRequest, @MappingTarget Rental rental);

    Rental toEntity(Rental rental);

//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    Rental partialUpdate(Rental rental, @MappingTarget Rental rental);
}