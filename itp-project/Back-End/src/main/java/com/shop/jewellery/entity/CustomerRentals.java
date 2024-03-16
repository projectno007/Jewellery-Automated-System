package com.shop.jewellery.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Audited
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class CustomerRentals extends AbstractEntity{



    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="customer_id")
    private Customer customer;

    @ManyToOne
    private Rental rental;
    @Column
    private LocalDateTime rentalDate;
    @Column
    private LocalDateTime returnDate;
    @Column
    private String status;
}
