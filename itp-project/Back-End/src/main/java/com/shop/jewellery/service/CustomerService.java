package com.shop.jewellery.service;

import com.shop.jewellery.entity.Customer;
import com.shop.jewellery.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CustomerService {
    private CustomerRepository customerRepo;

    @Autowired
    public CustomerService(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }

    public List<Customer> getAllCustomers(){
        return this.customerRepo.findAll();
    }

    public ResponseEntity<?> getCustomerById(UUID id){
        Optional<Customer> design = this.customerRepo.findById(id);
        return design.map( response ->
                ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public ResponseEntity<?> checkCustomerByEmail(String email){
        Optional<Customer> customer = this.customerRepo.findByName(email);
        return customer.map( response ->
                ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    public ResponseEntity<Customer> addNewCustomer(Customer customer) throws URISyntaxException {
        Customer result = this.customerRepo.save(customer);
        return ResponseEntity.created(new URI("/designs/addnew" + result.getId())).body(result);
    }
    
    public ResponseEntity<Customer> updateCustomer(Customer customer){
        Customer result = this.customerRepo.save(customer);
        return ResponseEntity.ok().body(result);
    }


}
