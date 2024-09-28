package com.shop.jewellery.repository;

import com.shop.jewellery.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RecordRepository extends JpaRepository<Record, UUID> {
    Record findByActivity(String activity);
}
