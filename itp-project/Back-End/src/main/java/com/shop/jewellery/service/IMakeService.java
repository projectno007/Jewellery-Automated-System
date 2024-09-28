package com.shop.jewellery.service;

import com.shop.jewellery.entity.Make;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

public interface IMakeService {
    List<Make> getAllMakeServices();

    ResponseEntity<?> getMakeServicesById(@PathVariable UUID id);

    ResponseEntity<Make> addNewService(Make make) throws URISyntaxException;

    ResponseEntity<Make> updateMakeService(Make make);

    ResponseEntity<?> deleteMakeService(UUID id);
}
