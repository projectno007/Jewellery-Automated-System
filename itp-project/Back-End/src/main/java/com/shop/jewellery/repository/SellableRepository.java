package com.shop.jewellery.repository;

import com.shop.jewellery.entity.Customer;
import com.shop.jewellery.entity.Sellable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface SellableRepository extends JpaRepository<Sellable, UUID> {
    Optional<Sellable> findByCustomer(Customer customer);
}
