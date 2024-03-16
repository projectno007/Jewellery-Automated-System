package com.shop.jewellery.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
@Data
@SuperBuilder
@Audited
@AllArgsConstructor
@NoArgsConstructor
public class Sellable extends Jewellery{
    @Column
    private double sellPrice;

    @ManyToOne
    private Customer customer;
}
