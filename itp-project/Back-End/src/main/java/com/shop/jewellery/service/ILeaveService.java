package com.shop.jewellery.service;

import com.shop.jewellery.IMonthlyLeave;
import com.shop.jewellery.entity.Employee;
import com.shop.jewellery.entity.Leave;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface ILeaveService {
    //get the list of all applied leave
    List<Leave> getAllLeave();

    //get the list of all employees
    List<Employee> getAllEmployees();

    //get a leave
    ResponseEntity<?> getLeaveById(UUID id);

    // get leave by employee
    List<Leave> getLeaveByEmployee(Employee employee);

    //apply new leave
    ResponseEntity<Leave> applyLeave(Leave leave) throws URISyntaxException;

    //delete leave
    ResponseEntity<?> deleteLeave(UUID id);

    //edit leave details
    Leave updateLeave(UUID id, Leave leave);

    List<Leave> findByDate(UUID id, LocalDate startDate, LocalDate endDate);

    List<IMonthlyLeave> getSum(LocalDate startDate, LocalDate endDate);

    List<IMonthlyLeave> getSumWithID(LocalDate startDate, LocalDate endDate, UUID id);

    List<Leave> findByLeaveFromBetween(LocalDate startDate, LocalDate endDate);
}
