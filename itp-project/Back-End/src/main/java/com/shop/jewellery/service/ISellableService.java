package com.shop.jewellery.service;

import com.shop.jewellery.entity.Customer;
import com.shop.jewellery.entity.Sellable;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

public interface ISellableService {
    List<Sellable> getAllSellable();

    ResponseEntity<?> getSellableById(UUID id);

    ResponseEntity<?> findByCustomer(Customer customer);

    ResponseEntity<Sellable> addNewSellable(Sellable sellable) throws URISyntaxException;

    ResponseEntity<Sellable> updateSellable(Sellable sellable);

    ResponseEntity<?> deleteSellable(UUID id);
}
