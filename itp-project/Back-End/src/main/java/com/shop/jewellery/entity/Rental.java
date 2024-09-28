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
public class Rental extends AbstractEntity{

    @OneToOne
    @JsonBackReference
    @JoinColumn(name="jewellery_id")
    private Jewellery jewellery;
    @Column
    private double rentalPrice;
}
