package com.shop.jewellery.controller;

import com.shop.jewellery.entity.Delivery;
import com.shop.jewellery.entity.Orders;
import com.shop.jewellery.service.impl.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v2/orders")
public class OrderController {


    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @GetMapping("/allorder")
    List<Orders> getAll(){
        return this.orderService.getAllOrders();
    }

    @GetMapping("/{orderid}")
    ResponseEntity<?> getOrderById(@PathVariable UUID orderid) {return  this.orderService.getOrderById(orderid);}

    @PostMapping("/sendorder")
    ResponseEntity<Orders> addNewOrder(@Validated @RequestBody Orders orders) throws URISyntaxException {
        return this.orderService.addNewOrder(orders);
    }

    @DeleteMapping("/deleteOrder/{id}")
    ResponseEntity<?> deleteOrder(@PathVariable UUID id) {return this.orderService.deleteOrder(id);
    }

    @RequestMapping("/recipe/{recipe}")
    List<Orders> getRecipeByStatus(@PathVariable String recipe){
        return this.orderService.getRecipeByStatus(recipe);
    }

    @PutMapping("updateOrder/{o_id}")
    public Orders updateOrder(@PathVariable("o_id") UUID id, @RequestBody Orders orders) {
        return orderService.updateOrder(id,orders);
    }

    @RequestMapping("/OrderbyDelivery/{delivery}")
    List<Orders> getDeliveryByStatus(@PathVariable Delivery delivery){
        return this.orderService.getorderyBydelivery(delivery); }


}