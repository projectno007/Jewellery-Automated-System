package com.noobstack.jewellery.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID o_id;
    private String recipe;

    @OneToOne
    private Delivery delivery;

    @OneToOne
    private Payment payment;

    @OneToOne
    private Sellable sellable;
}
