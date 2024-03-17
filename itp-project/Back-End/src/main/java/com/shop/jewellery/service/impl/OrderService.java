package com.shop.jewellery.service.impl;

import com.shop.jewellery.entity.Delivery;
import com.shop.jewellery.entity.Orders;
import com.shop.jewellery.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderService implements com.shop.jewellery.service.IOrderService {

    private final OrdersRepository ordersRepository;

    @Autowired
    public OrderService (OrdersRepository ordersRepository) {this.ordersRepository = ordersRepository;}

    @Override
    public List<Orders> getAllOrders() {return this.ordersRepository.findAll();}

    @Override
    public ResponseEntity<Orders> addNewOrder(Orders orders) throws URISyntaxException{
        Orders result = this.ordersRepository.save(orders);
        return ResponseEntity.created(new URI("/sendorder"+result.getId())).body(result);
    }

    @Override
    public ResponseEntity<?> getOrderById(UUID id) {
        Optional<Orders> order = this.ordersRepository.findById(id);
        return order.map(response ->
                ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @Override
    public ResponseEntity<?> deleteOrder(UUID id) {
        ordersRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }


    @Override
    public List<Orders> getRecipeByStatus(String recipe) {
        return ordersRepository.findByRecipe(recipe);
    }

    @Override
    public Orders updateOrder(UUID id, Orders orders) {
        orders.setId(id);
        return ordersRepository.save(orders);
    }

    @Override
    public List<Orders> getorderyBydelivery(Delivery delivery) {
        return ordersRepository.findByDelivery(delivery);
    }
}