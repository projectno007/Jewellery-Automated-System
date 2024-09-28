package com.shop.jewellery.controller;


import com.shop.jewellery.entity.Customer;
import com.shop.jewellery.entity.Sellable;
import com.shop.jewellery.service.ISellableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v2/sellable")
public class SellableController {

    private final ISellableService ISellableService;

    @Autowired
    public SellableController (ISellableService ISellableService){this.ISellableService = ISellableService;}

    @GetMapping("/allSellable")
    List<Sellable> getAllSellable() {return this.ISellableService.getAllSellable();}

    @GetMapping
    ResponseEntity<?> getSellableById(@PathVariable UUID id) {return this.ISellableService.getSellableById(id);}

    @PostMapping("allSellablebyuser")
    ResponseEntity<?> findByCustomer(@Validated @RequestBody Customer customer) {return this.ISellableService.findByCustomer(customer);}

    @PostMapping("/sendSellable")
    ResponseEntity<Sellable> addNewSellable(@Validated @RequestBody Sellable sellable) throws URISyntaxException{
        return this.ISellableService.addNewSellable(sellable);
    }

    @PutMapping("/update/{id}")
    ResponseEntity<Sellable> updateSellable(@Validated @RequestBody Sellable Sellable){
        return this.ISellableService.updateSellable(Sellable);
    }

    @DeleteMapping("/deleteSellable/{id}")
    ResponseEntity<?> deleteSellable(@PathVariable UUID id) {return this.ISellableService.deleteSellable(id);
    }

}
