package com.shop.jewellery.service.impl;


import com.shop.jewellery.entity.Employee;
import com.shop.jewellery.repository.EmployeeRepository;
import com.shop.jewellery.service.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeService implements IEmployeeRepository {
    private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees(){
        return this.employeeRepository.findAll();
    }


    @Override
    public ResponseEntity<?> getEmployeeById(UUID id) {
        Optional<Employee> employee = this.employeeRepository.findById(id);
        return employee.map(response -> ResponseEntity
                .ok()
                .body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @Override
    public List<Employee> findByName(String name) {
        return employeeRepository.findByFnameStartsWithIgnoreCase(name);
    }

//    public List<Object[]> findNumberOfLeave(LocalDate startDate, LocalDate endDate) {
//        return employeeRepository.findNumberOfLeave(startDate, endDate);
//    }
}