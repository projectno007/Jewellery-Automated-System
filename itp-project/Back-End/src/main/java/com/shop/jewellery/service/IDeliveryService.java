package com.shop.jewellery.service;

import com.shop.jewellery.entity.DeliverBoy;
import com.shop.jewellery.entity.Delivery;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

public interface IDeliveryService {
    ResponseEntity<Delivery> RequestDelivery(Delivery delivery) throws URISyntaxException;

    List<Delivery> getAllDeliveries();

    List<DeliverBoy> getAllDeliverDrivers();

    ResponseEntity<?> getDeliveryById(UUID id);

    List<Delivery> getDeliveryByDeliveryBoy(DeliverBoy deliverBoy);

    List<Delivery> getDeliveryByStatus(String status);

    List<Delivery> getDeliveryByTwoStatus(String status, String status2);

    List<Delivery> getDeliverBoyAndStatus(String status, DeliverBoy deliverBoy);

    List<Delivery> getDeliveryByCustomerId(String customerId, String status);

    List<Delivery> getDeliveryByDate(DeliverBoy deliverBoy, String status, String deliveredTime);

    ResponseEntity<?> deleteDelivery(UUID id);

    Delivery updateStatus(UUID id, Delivery delivery);

    Delivery AssignDriver(UUID id, Delivery delivery);
}
