package com.shop.jewellery.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Data
@Builder
@Audited
@AllArgsConstructor
@NoArgsConstructor
public class Orders extends AbstractEntity {


    @Column
    private String recipe;

    @OneToOne
    @JsonBackReference
    @JoinColumn(name="delivery_id")
    private Delivery delivery;

    @OneToOne
    @JsonBackReference
    @JoinColumn(name="payment_id")
    private Payment payment;

    @OneToOne
    @JsonBackReference
    @JoinColumn(name="sellable_id")
    private Sellable sellable;
}
