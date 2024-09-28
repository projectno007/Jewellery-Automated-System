package com.shop.jewellery.model.request.delivery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link com.shop.jewellery.entity.Delivery}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryRequest implements Serializable {
    private UUID id;
    private String address;
    private String city;
    private String requestedTime;
    private String deliveredTime;
    private String status;
    private String distance;
    private String province;
    private String phoneNumber;
    private String district;
    private UUID customerId;
    private String customerName;
}