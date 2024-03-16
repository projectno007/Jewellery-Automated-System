package com.shop.jewellery.repository;

import com.shop.jewellery.entity.Make;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MakeRepository extends JpaRepository<Make, UUID> {
    Make findByStatus(String status);
}
