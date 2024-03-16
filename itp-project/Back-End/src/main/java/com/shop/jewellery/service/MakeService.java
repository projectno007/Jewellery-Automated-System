package com.shop.jewellery.service;

import com.shop.jewellery.entity.Make;
import com.shop.jewellery.repository.MakeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class MakeService {
    private MakeRepository makeRepo;

    public MakeService(MakeRepository makeRepo) {
        this.makeRepo = makeRepo;
    }

    public List<Make> getAllMakeServices(){
        return this.makeRepo.findAll();
    }

    public ResponseEntity<?> getMakeServicesById(@PathVariable UUID id){
        Optional<Make> makeServices = makeRepo.findById(id);
        return makeServices.map( response ->
                ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public ResponseEntity<Make> addNewService(Make make) throws URISyntaxException {
        Make result = this.makeRepo.save(make);
        return ResponseEntity.created(new URI("/makeservice/" + result.getId())).body(result);
    }

    public ResponseEntity<Make> updateMakeService(Make make){
        Make result = this.makeRepo.save(make);
        return ResponseEntity.ok().body(result);
    }

    public ResponseEntity<?> deleteMakeService(UUID id){
        this.makeRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }


}
