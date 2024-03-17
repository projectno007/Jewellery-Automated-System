package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.Record;
import com.shop.jewellery.model.request.record.RecordRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RecordMapper {
    @Mapping(source = "adminId", target = "admin.id")
    Record toEntity(RecordRequest recordRequest);

    @Mapping(source = "admin.id", target = "adminId")
    RecordRequest toDto(Record record);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(source = "adminId", target = "admin.id")
    Record partialUpdate(RecordRequest recordRequest, @MappingTarget Record record);
}