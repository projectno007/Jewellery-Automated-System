package com.shop.jewellery.service;

import com.shop.jewellery.entity.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface IEmployeeRepository {
    List<Employee> getAllEmployees();

    ResponseEntity<?> getEmployeeById(UUID id);

    List<Employee> findByName(String name);
}
