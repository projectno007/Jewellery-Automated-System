package com.shop.jewellery.controller;

import com.shop.jewellery.entity.Service;
import com.shop.jewellery.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v2")
public class ServiceController {
    private IServiceService IServiceService;

    @Autowired
    public ServiceController(IServiceService IServiceService) {
        this.IServiceService = IServiceService;
    }

    @GetMapping("/services")
    List<Service> getAllServices(){
        return this.IServiceService.getAllServices();
    }

    @GetMapping("/services/{id}")
    ResponseEntity<?> getServiceById(@PathVariable UUID id){
        return this.IServiceService.getServiceById(id);
    }

    @PostMapping("/services/addnew")
    ResponseEntity<Service> addNewService(@Validated @RequestBody Service service) throws URISyntaxException {
        return this.IServiceService.addNewService(service);
    }

    @PutMapping("/services/update/{id}")
    ResponseEntity<Service> updateSerice(@Validated @RequestBody Service service){
        return this.IServiceService.updateSerice(service);
    }

    @DeleteMapping("/services/delete/{id}")
    ResponseEntity<?> deleteService(@PathVariable UUID id){
        return this.IServiceService.deleteService(id);
    }
}
