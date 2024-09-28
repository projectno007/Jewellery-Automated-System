package com.shop.jewellery.model.request.leave;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

/**
 * DTO for {@link com.shop.jewellery.entity.Leave}
 */
@Value
public class LeaveRequest implements Serializable {
    UUID id;
    LocalDate leaveFrom;
    LocalDate leaveTo;
    String reason;
    UUID employeeId;
    String employeePosition;
    String employeeNIC;
    String employeeFname;
    String employeeLName;
}