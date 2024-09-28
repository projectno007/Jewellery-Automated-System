package com.shop.jewellery.repository;

import com.shop.jewellery.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SupplierRepository extends JpaRepository<Supplier, UUID> {
    Supplier findByName(String name);
}
