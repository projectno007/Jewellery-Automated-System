package com.shop.jewellery.api;

import com.shop.jewellery.entity.Customer;
import com.shop.jewellery.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v2/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/all")
    List<Customer> getAllCustomers(){
        return this.customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    ResponseEntity<?> getCustomerById(@PathVariable UUID id){
        return this.customerService.getCustomerById(id);
    }

    @GetMapping("/find/{email}")
    ResponseEntity<?> checkCustomerByEmail(@PathVariable String email){
        return this.customerService.checkCustomerByEmail(email);
    }

    @PostMapping("/register")
    ResponseEntity<Customer> addNewCustomer(@Validated @RequestBody Customer customer) throws URISyntaxException {
        return this.customerService.addNewCustomer(customer);
    }
    
    @PutMapping("/update/{id}")
    ResponseEntity<Customer> updateCustomer(@Validated @RequestBody Customer customer){
        return this.customerService.updateCustomer(customer);
    }

}