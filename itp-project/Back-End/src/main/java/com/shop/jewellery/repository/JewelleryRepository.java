package com.shop.jewellery.repository;

import com.shop.jewellery.entity.Jewellery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JewelleryRepository extends JpaRepository<Jewellery, UUID> {
    Jewellery findByName(String name);
}
