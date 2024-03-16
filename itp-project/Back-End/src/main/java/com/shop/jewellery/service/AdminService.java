package com.shop.jewellery.service;

import com.shop.jewellery.entity.Admin;
import com.shop.jewellery.repository.AdminRepository;
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
public class AdminService {

    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public List<Admin> getAllAdmins() {
        return this.adminRepository.findAll();
    }

    public ResponseEntity<?> getAdminById(UUID id) {
        Optional<Admin> byId = this.adminRepository.findById(id);
        return byId.map(response ->
                ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public ResponseEntity<?> getAdminByName(String uname) {
        Optional<Admin> byUsername = this.adminRepository.findByUname(uname);
        return byUsername.map(response ->
                ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    public ResponseEntity<Admin> addNewAdmin(Admin admin) throws URISyntaxException {
        Admin result = this.adminRepository.save(admin);
        return ResponseEntity.created(new URI("/register" + result.getId())).body(result);
    }

    public ResponseEntity<Admin> updateAdmin(Admin admin){
        Admin result = this.adminRepository.save(admin);
        return ResponseEntity.ok().body(result);
    }
}
