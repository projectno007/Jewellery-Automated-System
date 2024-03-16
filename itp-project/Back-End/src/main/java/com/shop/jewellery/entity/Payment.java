package com.shop.jewellery.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Data
@Builder
@Audited
@AllArgsConstructor
@NoArgsConstructor
public class Payment extends AbstractEntity{
    @Column
    private Double amount;
    @Column
    private String paymentStatus;
    @Column
    private LocalDate paymentDate;

}
