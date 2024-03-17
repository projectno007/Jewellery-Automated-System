package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.Repair;
import com.shop.jewellery.model.request.repair.RepairRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RepairMapper {
    Repair toEntity(RepairRequest repairRequest);

    RepairRequest toDto(Repair repair);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Repair partialUpdate(RepairRequest repairRequest, @MappingTarget Repair repair);
}