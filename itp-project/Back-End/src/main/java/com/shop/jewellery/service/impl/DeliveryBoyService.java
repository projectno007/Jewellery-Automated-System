package com.shop.jewellery.service.impl;


import com.shop.jewellery.entity.DeliverBoy;
import com.shop.jewellery.repository.DeliverBoyRepository;
import com.shop.jewellery.service.IDeliveryBoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeliveryBoyService implements IDeliveryBoyService {
    private final DeliverBoyRepository deliverBoyRepository;
    @Autowired
    public DeliveryBoyService(DeliverBoyRepository deliverBoyRepository) {
        this.deliverBoyRepository = deliverBoyRepository;
    }

    @Override
    public List<DeliverBoy> getdeliveryBoyByName(String useraname) {
        return deliverBoyRepository.findByUsername(useraname);
    }
}
