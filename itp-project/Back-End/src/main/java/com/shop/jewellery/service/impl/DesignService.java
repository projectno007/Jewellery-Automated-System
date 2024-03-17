package com.shop.jewellery.service.impl;

import com.shop.jewellery.entity.Design;
import com.shop.jewellery.repository.DesignRepository;
import com.shop.jewellery.service.IDesignService;
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
public class DesignService implements IDesignService {
    private DesignRepository designRepository;

    @Autowired
    public DesignService(DesignRepository designRepository) {
        this.designRepository = designRepository;
    }

    @Override
    public List<Design> getAllDesigns(){
        return this.designRepository.findAll();
    }

    @Override
    public ResponseEntity<?> getDesignById(UUID id){
        Optional<Design> design = this.designRepository.findById(id);
        return design.map( response ->
            ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @Override
    public ResponseEntity<Design> addNewDesign(Design design) throws URISyntaxException {
        Design result = this.designRepository.save(design);
        return ResponseEntity.created(new URI("/designs/addnew" + result.getId())).body(result);
    }

    @Override
    public ResponseEntity<Design> updateDesign(Design design){
        Design result = this.designRepository.save(design);
        return ResponseEntity.ok().body(result);
    }

    @Override
    public ResponseEntity<?> deleteDesign(UUID id){
        this.designRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
