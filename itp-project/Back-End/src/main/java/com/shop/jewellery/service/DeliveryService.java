package com.shop.jewellery.service;
import com.shop.jewellery.entity.DeliverBoy;
import com.shop.jewellery.entity.Delivery;
import com.shop.jewellery.repository.DeliverBoyRepository;
import com.shop.jewellery.repository.DeliverRepository;
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
public class DeliveryService {
    private final DeliverRepository deliverRepository;
    private final DeliverBoyRepository deliverBoyRepository;
    @Autowired
    public DeliveryService(DeliverRepository deliverRepository, DeliverBoyRepository deliverBoyRepository) {
        this.deliverRepository = deliverRepository;
        this.deliverBoyRepository = deliverBoyRepository;
    }
    public ResponseEntity<Delivery> RequestDelivery(Delivery delivery) throws URISyntaxException {
        Delivery Result = deliverRepository.save(delivery);
        return ResponseEntity.created(new URI("/api/RequestDelivery" + Result.getId())).body(Result);
    }
    public List<Delivery> getAllDeliveries()
    {
        return this.deliverRepository.findAll();
    }
    public List<DeliverBoy> getAllDeliverDrivers() {
        return this.deliverBoyRepository.findAll();
    }
    public ResponseEntity<?> getDeliveryById(UUID id) {
        Optional<Delivery> delivery = this.deliverRepository.findById(id);
        return delivery.map(response -> ResponseEntity.ok().body(response)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    public List<Delivery> getDeliveryByDeliveryBoy(DeliverBoy deliverBoy) {
        return deliverRepository.findByDeliverBoy(deliverBoy);
    }
    public List<Delivery> getDeliveryByStatus(String status) {
        return deliverRepository.findByStatus(status);
    }
    public List<Delivery> getDeliveryByTwoStatus(String status, String status2) {
        return deliverRepository.findByDeliveryBoyTwoStatus(status,status2);
    }
    public List<Delivery> getDeliverBoyAndStatus(String status,DeliverBoy deliverBoy) {
        return deliverRepository.findByDeliveryBoyAndStatus(status,deliverBoy);
    }
    public List<Delivery> getDeliveryByCustomerId(String customerId, String status) {
        return deliverRepository.findByCustomerId(customerId,status);
    }
    public List<Delivery> getDeliveryByDate(DeliverBoy deliverBoy, String status, String deliveredTime) {
        return deliverRepository.findByDeliveredTime(deliverBoy,status,deliveredTime);
    }
    public ResponseEntity<?> deleteDelivery(UUID id){
        deliverRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
    public Delivery updateStatus(UUID id,Delivery delivery) {
        delivery.setId(id);
        return deliverRepository.save(delivery);
    }
    public Delivery AssignDriver(UUID id,Delivery delivery) {
        delivery.setId(id);
        return deliverRepository.save(delivery);
    }



}
