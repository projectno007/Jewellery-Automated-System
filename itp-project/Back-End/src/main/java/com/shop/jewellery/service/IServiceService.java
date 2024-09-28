package com.shop.jewellery.service;

import com.shop.jewellery.entity.Service;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

public interface IServiceService {
    List<Service> getAllServices();

    ResponseEntity<?> getServiceById(UUID id);

    ResponseEntity<Service> addNewService(Service service) throws URISyntaxException;

    ResponseEntity<Service> updateSerice(Service service);

    ResponseEntity<?> deleteService(UUID id);
}
