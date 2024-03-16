package com.shop.jewellery.service;


import com.shop.jewellery.entity.DeliverBoy;
import com.shop.jewellery.repository.DeliverBoyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeliveryBoyService {
    private final DeliverBoyRepository deliverBoyRepository;
    @Autowired
    public DeliveryBoyService(DeliverBoyRepository deliverBoyRepository) {
        this.deliverBoyRepository = deliverBoyRepository;
    }
    public List<DeliverBoy> getdeliveryBoyByName(String useraname) {
        return deliverBoyRepository.findByUsername(useraname);
    }
}
