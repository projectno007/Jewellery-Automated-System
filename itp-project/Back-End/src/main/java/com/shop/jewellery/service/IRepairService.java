package com.shop.jewellery.service;

import com.shop.jewellery.entity.Repair;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

public interface IRepairService {
    List<Repair> getAllRepairs();

    ResponseEntity<?> getRepairById(UUID id);

    ResponseEntity<Repair> addNewRepair(Repair repair) throws URISyntaxException;

    ResponseEntity<Repair> updateRepair(Repair repair);

    ResponseEntity<?> deleteRepair(UUID id);
}
