package com.shop.jewellery.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Data
@Audited
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Delivery extends AbstractEntity {

    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String requestedTime;
    @Column
    private String deliveredTime;
    @Column
    private String status;
    @Column
    private String distance;
    @Column
    private String province;
    @Column
    private String phoneNumber;
    @Column
    private String district;

    @ToString.Exclude
    @OneToOne
    @JsonBackReference
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "deliverBoy_id")
    private DeliverBoy deliverBoy;
}