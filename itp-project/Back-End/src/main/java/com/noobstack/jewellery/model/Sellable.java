package com.noobstack.jewellery.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sellable extends Jewellery{
    private double sellPrice;

    @ManyToOne
    private Customer customer;
}
