package com.shop.jewellery.service.impl;

import com.shop.jewellery.repository.ServiceRepository;
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
public class ServiceService implements com.shop.jewellery.service.IServiceService {
    private ServiceRepository serviceRepository;

    @Autowired
    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @Override
    public List<com.shop.jewellery.entity.Service> getAllServices(){
        return this.serviceRepository.findAll();
    }

    @Override
    public ResponseEntity<?> getServiceById(UUID id){
        Optional<com.shop.jewellery.entity.Service> service = this.serviceRepository.findById(id);
        return service.map( response ->
                ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @Override
    public ResponseEntity<com.shop.jewellery.entity.Service> addNewService(com.shop.jewellery.entity.Service service) throws URISyntaxException {
        com.shop.jewellery.entity.Service result = this.serviceRepository.save(service);
        return ResponseEntity.created(new URI("/services/addnew" + result.getId())).body(result);
    }

    @Override
    public ResponseEntity<com.shop.jewellery.entity.Service> updateSerice(com.shop.jewellery.entity.Service service){
        com.shop.jewellery.entity.Service result = this.serviceRepository.save(service);
        return ResponseEntity.ok().body(result);
    }

    @Override
    public ResponseEntity<?> deleteService(UUID id){
        this.serviceRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
