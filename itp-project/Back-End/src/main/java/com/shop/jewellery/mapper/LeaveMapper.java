package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.Leave;
import com.shop.jewellery.model.request.leave.LeaveRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface LeaveMapper {
    @Mapping(source = "employeeLName", target = "employee.lName")
    @Mapping(source = "employeeFname", target = "employee.fname")
    @Mapping(source = "employeeNIC", target = "employee.NIC")
    @Mapping(source = "employeePosition", target = "employee.position")
    @Mapping(source = "employeeId", target = "employee.id")
    Leave toEntity(LeaveRequest leaveRequest);

    @InheritInverseConfiguration(name = "toEntity")
    LeaveRequest toDto(Leave leave);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Leave partialUpdate(LeaveRequest leaveRequest, @MappingTarget Leave leave);
}