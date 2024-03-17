package com.shop.jewellery.mapper;

import com.shop.jewellery.entity.Employee;
import com.shop.jewellery.model.request.employee.EmployeeRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface EmployeeMapper {
    Employee toEntity(EmployeeRequest employeeRequest);

    EmployeeRequest toDto(Employee employee);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Employee partialUpdate(EmployeeRequest employeeRequest, @MappingTarget Employee employee);
}