package com.shop.jewellery.service;

import com.shop.jewellery.entity.Customer;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

public interface ICustomerService {
    List<Customer> getAllCustomers();

    ResponseEntity<?> getCustomerById(UUID id);

    ResponseEntity<?> checkCustomerByEmail(String email);

    ResponseEntity<Customer> addNewCustomer(Customer customer) throws URISyntaxException;

    ResponseEntity<Customer> updateCustomer(Customer customer);
}
