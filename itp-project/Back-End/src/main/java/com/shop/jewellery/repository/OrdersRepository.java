package com.shop.jewellery.repository;

import com.shop.jewellery.entity.Delivery;
import com.shop.jewellery.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface OrdersRepository extends JpaRepository<Orders, UUID> {
    List<Orders> findByRecipe(String recipe);
    List<Orders> findByDelivery(Delivery delivery);
}