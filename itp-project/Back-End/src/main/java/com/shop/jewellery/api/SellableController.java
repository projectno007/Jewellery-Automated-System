package com.shop.jewellery.api;


import com.shop.jewellery.entity.Customer;
import com.shop.jewellery.entity.Sellable;
import com.shop.jewellery.service.SellableService;
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

    private final SellableService sellableService;

    @Autowired
    public SellableController (SellableService sellableService){this.sellableService=sellableService;}

    @GetMapping("/allSellable")
    List<Sellable> getAllSellable() {return this.sellableService.getAllSellable();}

    @GetMapping
    ResponseEntity<?> getSellableById(@PathVariable UUID id) {return this.sellableService.getSellableById(id);}

    @PostMapping("allSellablebyuser")
    ResponseEntity<?> findByCustomer(@Validated @RequestBody Customer customer) {return this.sellableService.findByCustomer(customer);}

    @PostMapping("/sendSellable")
    ResponseEntity<Sellable> addNewSellable(@Validated @RequestBody Sellable sellable) throws URISyntaxException{
        return this.sellableService.addNewSellable(sellable);
    }

    @PutMapping("/update/{id}")
    ResponseEntity<Sellable> updateSellable(@Validated @RequestBody Sellable Sellable){
        return this.sellableService.updateSellable(Sellable);
    }

    @DeleteMapping("/deleteSellable/{id}")
    ResponseEntity<?> deleteSellable(@PathVariable UUID id) {return this.sellableService.deleteSellable(id);
    }

}
