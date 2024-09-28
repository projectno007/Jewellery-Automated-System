package com.shop.jewellery.repository;

import com.shop.jewellery.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AdminRepository extends JpaRepository<Admin,UUID> {
    Optional<Admin> findByUname(String uname);
}
