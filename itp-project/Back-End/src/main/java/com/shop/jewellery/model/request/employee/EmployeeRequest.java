package com.shop.jewellery.model.request.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link com.shop.jewellery.entity.Employee}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest implements Serializable {
    private UUID id;
    private String position;
    private String NIC;
    private String fname;
    private String lName;
}