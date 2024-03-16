package com.noobstack.jewellery.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID delivery_id;
    private String deliveryAddress;
    private String deliveryCity;
    private String requestedTime;
    private String deliveredTime;
    private String status;
    private String distance;
    private String deliveryProvince;
    private String phoneNumber;
    private String district;
    private String customerid;

    @ManyToOne
    private DeliverBoy deliverBoy;
}