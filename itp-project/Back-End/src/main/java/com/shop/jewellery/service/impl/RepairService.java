package com.shop.jewellery.service.impl;

import com.shop.jewellery.entity.Repair;
import com.shop.jewellery.repository.RepaiRepository;
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
public class RepairService implements com.shop.jewellery.service.IRepairService {
    private RepaiRepository repaiRepository;

    @Autowired
    public RepairService(RepaiRepository repaiRepository) {
        this.repaiRepository = repaiRepository;
    }

    @Override
    public List<Repair> getAllRepairs(){
        return this.repaiRepository.findAll();
    }

    @Override
    public ResponseEntity<?> getRepairById(UUID id){
        Optional<Repair> repair = this.repaiRepository.findById(id);
        return repair.map( response ->
                ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @Override
    public ResponseEntity<Repair> addNewRepair(Repair repair) throws URISyntaxException {
        Repair result = this.repaiRepository.save(repair);
        return ResponseEntity.created(new URI("/designs/addnew" + result.getId())).body(result);
    }

    @Override
    public ResponseEntity<Repair> updateRepair(Repair repair){
        Repair result = this.repaiRepository.save(repair);
        return ResponseEntity.ok().body(result);
    }

    @Override
    public ResponseEntity<?> deleteRepair(UUID id){
        this.repaiRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}

