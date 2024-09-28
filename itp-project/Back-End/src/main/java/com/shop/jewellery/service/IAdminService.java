package com.shop.jewellery.service;

import com.shop.jewellery.entity.Admin;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

public interface IAdminService {
    List<Admin> getAllAdmins();

    ResponseEntity<?> getAdminById(UUID id);

    ResponseEntity<?> getAdminByName(String uname);

    ResponseEntity<Admin> addNewAdmin(Admin admin) throws URISyntaxException;

    ResponseEntity<Admin> updateAdmin(Admin admin);
}
