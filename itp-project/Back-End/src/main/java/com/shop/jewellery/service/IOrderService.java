package com.shop.jewellery.service;

import com.shop.jewellery.entity.Delivery;
import com.shop.jewellery.entity.Orders;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

public interface IOrderService {
    List<Orders> getAllOrders();

    ResponseEntity<Orders> addNewOrder(Orders orders) throws URISyntaxException;

    ResponseEntity<?> getOrderById(UUID id);

    ResponseEntity<?> deleteOrder(UUID id);

    List<Orders> getRecipeByStatus(String recipe);

    Orders updateOrder(UUID id, Orders orders);

    List<Orders> getorderyBydelivery(Delivery delivery);
}
