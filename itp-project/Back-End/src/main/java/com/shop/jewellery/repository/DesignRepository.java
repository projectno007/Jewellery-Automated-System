package com.shop.jewellery.repository;

import com.shop.jewellery.entity.Design;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DesignRepository extends JpaRepository<Design, UUID> {
    Design findByName(String name);
}
