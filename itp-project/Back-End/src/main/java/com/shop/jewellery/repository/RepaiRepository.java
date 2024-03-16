package com.shop.jewellery.repository;

import com.shop.jewellery.entity.Repair;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepaiRepository extends JpaRepository<Repair, UUID> {
    Repair findByDamageType(String damagetype);
}
