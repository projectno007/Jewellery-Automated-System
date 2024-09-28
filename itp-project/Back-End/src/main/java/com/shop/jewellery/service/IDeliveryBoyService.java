package com.shop.jewellery.service;

import com.shop.jewellery.entity.DeliverBoy;

import java.util.List;

public interface IDeliveryBoyService {
    List<DeliverBoy> getdeliveryBoyByName(String useraname);
}
