package com.shop.jewellery.api;

import com.shop.jewellery.entity.Service;
import com.shop.jewellery.service.ServiceService;
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
    private ServiceService serviceService;

    @Autowired
    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @GetMapping("/services")
    List<Service> getAllServices(){
        return this.serviceService.getAllServices();
    }

    @GetMapping("/services/{id}")
    ResponseEntity<?> getServiceById(@PathVariable UUID id){
        return this.serviceService.getServiceById(id);
    }

    @PostMapping("/services/addnew")
    ResponseEntity<Service> addNewService(@Validated @RequestBody Service service) throws URISyntaxException {
        return this.serviceService.addNewService(service);
    }

    @PutMapping("/services/update/{id}")
    ResponseEntity<Service> updateSerice(@Validated @RequestBody Service service){
        return this.serviceService.updateSerice(service);
    }

    @DeleteMapping("/services/delete/{id}")
    ResponseEntity<?> deleteService(@PathVariable UUID id){
        return this.serviceService.deleteService(id);
    }
}
