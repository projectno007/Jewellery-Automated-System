package com.shop.jewellery.service;

import com.shop.jewellery.entity.Design;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

public interface IDesignService {
    List<Design> getAllDesigns();

    ResponseEntity<?> getDesignById(UUID id);

    ResponseEntity<Design> addNewDesign(Design design) throws URISyntaxException;

    ResponseEntity<Design> updateDesign(Design design);

    ResponseEntity<?> deleteDesign(UUID id);
}
