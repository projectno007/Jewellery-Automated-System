package com.shop.jewellery.service.impl;

import com.shop.jewellery.entity.Customer;
import com.shop.jewellery.entity.Sellable;
import com.shop.jewellery.repository.SellableRepository;
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
public class SellableService implements com.shop.jewellery.service.ISellableService {

    private final SellableRepository sellableRepository;

    @Autowired
    public SellableService (SellableRepository sellableRepository){this.sellableRepository = sellableRepository;}

    @Override
    public List<Sellable> getAllSellable() {return this.sellableRepository.findAll();}

    @Override
    public ResponseEntity<?> getSellableById(UUID id) {
        Optional<Sellable> order =this.sellableRepository.findById(id);
        return order.map(response ->
                ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @Override
    public ResponseEntity<?> findByCustomer(Customer customer) {
        Optional<Sellable> sellable =this.sellableRepository.findByCustomer(customer);
        return sellable.map(response ->
                ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }



    @Override
    public ResponseEntity<Sellable> addNewSellable(Sellable sellable) throws URISyntaxException{
        Sellable result = this.sellableRepository.save(sellable);
        return ResponseEntity.created(new URI("/sendSellable" + result.getId())).body(result);
    }

    @Override
    public ResponseEntity<Sellable> updateSellable(Sellable sellable){
        Sellable result = this.sellableRepository.save(sellable);
        return ResponseEntity.ok().body(result);
    }

    @Override
    public ResponseEntity<?> deleteSellable(UUID id) {
        sellableRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
